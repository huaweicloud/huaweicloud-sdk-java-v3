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
import com.huaweicloud.sdk.osm.v2.model.UploadAccessoryRequest;
import com.huaweicloud.sdk.osm.v2.model.UploadAccessoryRequestBody;
import com.huaweicloud.sdk.osm.v2.model.UploadAccessoryResponse;
import com.huaweicloud.sdk.osm.v2.model.UploadJsonAccessoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.UploadJsonAccessoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.VerifyHostV2Req;
import com.huaweicloud.sdk.osm.v2.model.VerifyVerifyCodeV2Req;
import com.huaweicloud.sdk.osm.v2.model.WorkOrderOperateV2Req;

import java.util.List;

@SuppressWarnings("unchecked")
public class OsmMeta {

    public static final HttpRequestDef<CheckHostsRequest, CheckHostsResponse> checkHosts = genForCheckHosts();

    private static HttpRequestDef<CheckHostsRequest, CheckHostsResponse> genForCheckHosts() {
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
            f -> f.withMarshaller(CheckHostsRequest::getAuthorizationDetailId,
                CheckHostsRequest::setAuthorizationDetailId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckHostsRequest::getXSite, CheckHostsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckHostsRequest::getXLanguage, CheckHostsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckHostsRequest::getXTimeZone, CheckHostsRequest::setXTimeZone));
        builder.<VerifyHostV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(VerifyHostV2Req.class),
            f -> f.withMarshaller(CheckHostsRequest::getBody, CheckHostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNeedVerifyRequest, CheckNeedVerifyResponse> checkNeedVerify =
        genForCheckNeedVerify();

    private static HttpRequestDef<CheckNeedVerifyRequest, CheckNeedVerifyResponse> genForCheckNeedVerify() {
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
            f -> f.withMarshaller(CheckNeedVerifyRequest::getContactValue, CheckNeedVerifyRequest::setContactValue));
        builder.<Integer>withRequestField("contact_way",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getContactWay, CheckNeedVerifyRequest::setContactWay));
        builder.<String>withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getAreaCode, CheckNeedVerifyRequest::setAreaCode));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXSite, CheckNeedVerifyRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXLanguage, CheckNeedVerifyRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNeedVerifyRequest::getXTimeZone, CheckNeedVerifyRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVerifyCodesRequest, CheckVerifyCodesResponse> checkVerifyCodes =
        genForCheckVerifyCodes();

    private static HttpRequestDef<CheckVerifyCodesRequest, CheckVerifyCodesResponse> genForCheckVerifyCodes() {
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
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXSite, CheckVerifyCodesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXLanguage, CheckVerifyCodesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVerifyCodesRequest::getXTimeZone, CheckVerifyCodesRequest::setXTimeZone));
        builder.<VerifyVerifyCodeV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(VerifyVerifyCodeV2Req.class),
            f -> f.withMarshaller(CheckVerifyCodesRequest::getBody, CheckVerifyCodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> confirmAuthorizations =
        genForConfirmAuthorizations();

    private static HttpRequestDef<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> genForConfirmAuthorizations() {
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
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getAuthorizationId,
                ConfirmAuthorizationsRequest::setAuthorizationId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXSite, ConfirmAuthorizationsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXLanguage,
                ConfirmAuthorizationsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getXTimeZone,
                ConfirmAuthorizationsRequest::setXTimeZone));
        builder.<AgreeTenantAuthorizationV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AgreeTenantAuthorizationV2Req.class),
            f -> f.withMarshaller(ConfirmAuthorizationsRequest::getBody, ConfirmAuthorizationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAskQuestionRequest, CreateAskQuestionResponse> createAskQuestion =
        genForCreateAskQuestion();

    private static HttpRequestDef<CreateAskQuestionRequest, CreateAskQuestionResponse> genForCreateAskQuestion() {
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
            f -> f.withMarshaller(CreateAskQuestionRequest::getXServiceKey, CreateAskQuestionRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAskQuestionRequest::getXSite, CreateAskQuestionRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAskQuestionRequest::getXLanguage, CreateAskQuestionRequest::setXLanguage));
        builder.<AskQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AskQuestionReq.class),
            f -> f.withMarshaller(CreateAskQuestionRequest::getBody, CreateAskQuestionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse> createCaseExtendsParam =
        genForCreateCaseExtendsParam();

    private static HttpRequestDef<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse> genForCreateCaseExtendsParam() {
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
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getCaseId, CreateCaseExtendsParamRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getXSite, CreateCaseExtendsParamRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getXLanguage,
                CreateCaseExtendsParamRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getXTimeZone,
                CreateCaseExtendsParamRequest::setXTimeZone));
        builder.<PutCaseExtParamReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCaseExtParamReq.class),
            f -> f.withMarshaller(CreateCaseExtendsParamRequest::getBody, CreateCaseExtendsParamRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaseLabelsRequest, CreateCaseLabelsResponse> createCaseLabels =
        genForCreateCaseLabels();

    private static HttpRequestDef<CreateCaseLabelsRequest, CreateCaseLabelsResponse> genForCreateCaseLabels() {
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
            f -> f.withMarshaller(CreateCaseLabelsRequest::getCaseId, CreateCaseLabelsRequest::setCaseId));
        builder.<List<Integer>>withRequestField("label_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getLabelIds, CreateCaseLabelsRequest::setLabelIds));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXSite, CreateCaseLabelsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXLanguage, CreateCaseLabelsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaseLabelsRequest::getXTimeZone, CreateCaseLabelsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCasesRequest, CreateCasesResponse> createCases = genForCreateCases();

    private static HttpRequestDef<CreateCasesRequest, CreateCasesResponse> genForCreateCases() {
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
            f -> f.withMarshaller(CreateCasesRequest::getXSite, CreateCasesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXLanguage, CreateCasesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXTimeZone, CreateCasesRequest::setXTimeZone));
        builder.<String>withRequestField("x-phone-verifiedid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXPhoneVerifiedid, CreateCasesRequest::setXPhoneVerifiedid));
        builder.<String>withRequestField("x-email-verifiedid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCasesRequest::getXEmailVerifiedid, CreateCasesRequest::setXEmailVerifiedid));
        builder.<CreateOrderIncidentV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateOrderIncidentV2Req.class),
            f -> f.withMarshaller(CreateCasesRequest::getBody, CreateCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse> createDiagnoseFeedback =
        genForCreateDiagnoseFeedback();

    private static HttpRequestDef<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse> genForCreateDiagnoseFeedback() {
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
            f -> f.withMarshaller(CreateDiagnoseFeedbackRequest::getBody, CreateDiagnoseFeedbackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse> createDiagnoseJob =
        genForCreateDiagnoseJob();

    private static HttpRequestDef<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse> genForCreateDiagnoseJob() {
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
            f -> f.withMarshaller(CreateDiagnoseJobRequest::getBody, CreateDiagnoseJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEvaluateRequest, CreateEvaluateResponse> createEvaluate =
        genForCreateEvaluate();

    private static HttpRequestDef<CreateEvaluateRequest, CreateEvaluateResponse> genForCreateEvaluate() {
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
            f -> f.withMarshaller(CreateEvaluateRequest::getSessionId, CreateEvaluateRequest::setSessionId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getRequestId, CreateEvaluateRequest::setRequestId));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getXServiceKey, CreateEvaluateRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getXSite, CreateEvaluateRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getXLanguage, CreateEvaluateRequest::setXLanguage));
        builder.<EvaluateRequestReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EvaluateRequestReq.class),
            f -> f.withMarshaller(CreateEvaluateRequest::getBody, CreateEvaluateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFeedbackRequest, CreateFeedbackResponse> createFeedback =
        genForCreateFeedback();

    private static HttpRequestDef<CreateFeedbackRequest, CreateFeedbackResponse> genForCreateFeedback() {
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
            f -> f.withMarshaller(CreateFeedbackRequest::getBody, CreateFeedbackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelsRequest, CreateLabelsResponse> createLabels = genForCreateLabels();

    private static HttpRequestDef<CreateLabelsRequest, CreateLabelsResponse> genForCreateLabels() {
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
            f -> f.withMarshaller(CreateLabelsRequest::getXSite, CreateLabelsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLabelsRequest::getXLanguage, CreateLabelsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLabelsRequest::getXTimeZone, CreateLabelsRequest::setXTimeZone));
        builder.<CreateLabelsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLabelsReq.class),
            f -> f.withMarshaller(CreateLabelsRequest::getBody, CreateLabelsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessagesRequest, CreateMessagesResponse> createMessages =
        genForCreateMessages();

    private static HttpRequestDef<CreateMessagesRequest, CreateMessagesResponse> genForCreateMessages() {
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
            f -> f.withMarshaller(CreateMessagesRequest::getCaseId, CreateMessagesRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMessagesRequest::getXSite, CreateMessagesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessagesRequest::getXLanguage, CreateMessagesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessagesRequest::getXTimeZone, CreateMessagesRequest::setXTimeZone));
        builder.<CreateMessageV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateMessageV2Req.class),
            f -> f.withMarshaller(CreateMessagesRequest::getBody, CreateMessagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivilegesRequest, CreatePrivilegesResponse> createPrivileges =
        genForCreatePrivileges();

    private static HttpRequestDef<CreatePrivilegesRequest, CreatePrivilegesResponse> genForCreatePrivileges() {
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
            f -> f.withMarshaller(CreatePrivilegesRequest::getXSite, CreatePrivilegesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivilegesRequest::getXLanguage, CreatePrivilegesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivilegesRequest::getXTimeZone, CreatePrivilegesRequest::setXTimeZone));
        builder.<CreateAndDeletePrivilegeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAndDeletePrivilegeReq.class),
            f -> f.withMarshaller(CreatePrivilegesRequest::getBody, CreatePrivilegesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQaAskRequest, CreateQaAskResponse> createQaAsk = genForCreateQaAsk();

    private static HttpRequestDef<CreateQaAskRequest, CreateQaAskResponse> genForCreateQaAsk() {
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
            f -> f.withMarshaller(CreateQaAskRequest::getXServiceKey, CreateQaAskRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaAskRequest::getXSite, CreateQaAskRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaAskRequest::getXLanguage, CreateQaAskRequest::setXLanguage));
        builder.<QaAskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QaAskReq.class),
            f -> f.withMarshaller(CreateQaAskRequest::getBody, CreateQaAskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse> createQaFeedbacks =
        genForCreateQaFeedbacks();

    private static HttpRequestDef<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse> genForCreateQaFeedbacks() {
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
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getFeedbackType,
                CreateQaFeedbacksRequest::setFeedbackType));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getXServiceKey, CreateQaFeedbacksRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getXSite, CreateQaFeedbacksRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getXLanguage, CreateQaFeedbacksRequest::setXLanguage));
        builder.<QaFeedbackReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QaFeedbackReq.class),
            f -> f.withMarshaller(CreateQaFeedbacksRequest::getBody, CreateQaFeedbacksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse> createQuestionInSession =
        genForCreateQuestionInSession();

    private static HttpRequestDef<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse> genForCreateQuestionInSession() {
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
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getSessionId,
                CreateQuestionInSessionRequest::setSessionId));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getXServiceKey,
                CreateQuestionInSessionRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getXSite, CreateQuestionInSessionRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getXLanguage,
                CreateQuestionInSessionRequest::setXLanguage));
        builder.<SessionAskQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SessionAskQuestionReq.class),
            f -> f.withMarshaller(CreateQuestionInSessionRequest::getBody, CreateQuestionInSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRelationsRequest, CreateRelationsResponse> createRelations =
        genForCreateRelations();

    private static HttpRequestDef<CreateRelationsRequest, CreateRelationsResponse> genForCreateRelations() {
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
            f -> f.withMarshaller(CreateRelationsRequest::getCaseId, CreateRelationsRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateRelationsRequest::getXSite, CreateRelationsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRelationsRequest::getXLanguage, CreateRelationsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRelationsRequest::getXTimeZone, CreateRelationsRequest::setXTimeZone));
        builder.<CreateRelationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRelationsReq.class),
            f -> f.withMarshaller(CreateRelationsRequest::getBody, CreateRelationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScoresRequest, CreateScoresResponse> createScores = genForCreateScores();

    private static HttpRequestDef<CreateScoresRequest, CreateScoresResponse> genForCreateScores() {
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
            f -> f.withMarshaller(CreateScoresRequest::getCaseId, CreateScoresRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateScoresRequest::getXSite, CreateScoresRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScoresRequest::getXLanguage, CreateScoresRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScoresRequest::getXTimeZone, CreateScoresRequest::setXTimeZone));
        builder.<CreateScoreV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateScoreV2Req.class),
            f -> f.withMarshaller(CreateScoresRequest::getBody, CreateScoresRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSessionRequest, CreateSessionResponse> createSession =
        genForCreateSession();

    private static HttpRequestDef<CreateSessionRequest, CreateSessionResponse> genForCreateSession() {
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
            f -> f.withMarshaller(CreateSessionRequest::getXServiceKey, CreateSessionRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSessionRequest::getXSite, CreateSessionRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSessionRequest::getXLanguage, CreateSessionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessoriesRequest, DeleteAccessoriesResponse> deleteAccessories =
        genForDeleteAccessories();

    private static HttpRequestDef<DeleteAccessoriesRequest, DeleteAccessoriesResponse> genForDeleteAccessories() {
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
            f -> f.withMarshaller(DeleteAccessoriesRequest::getAccessoryId, DeleteAccessoriesRequest::setAccessoryId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXSite, DeleteAccessoriesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXLanguage, DeleteAccessoriesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessoriesRequest::getXTimeZone, DeleteAccessoriesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> deleteCaseLabels =
        genForDeleteCaseLabels();

    private static HttpRequestDef<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> genForDeleteCaseLabels() {
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
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getCaseId, DeleteCaseLabelsRequest::setCaseId));
        builder.<List<Integer>>withRequestField("label_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getLabelIds, DeleteCaseLabelsRequest::setLabelIds));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXSite, DeleteCaseLabelsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXLanguage, DeleteCaseLabelsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCaseLabelsRequest::getXTimeZone, DeleteCaseLabelsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelsRequest, DeleteLabelsResponse> deleteLabels = genForDeleteLabels();

    private static HttpRequestDef<DeleteLabelsRequest, DeleteLabelsResponse> genForDeleteLabels() {
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
            f -> f.withMarshaller(DeleteLabelsRequest::getLabelId, DeleteLabelsRequest::setLabelId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteLabelsRequest::getXSite, DeleteLabelsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelsRequest::getXLanguage, DeleteLabelsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelsRequest::getXTimeZone, DeleteLabelsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRelationRequest, DeleteRelationResponse> deleteRelation =
        genForDeleteRelation();

    private static HttpRequestDef<DeleteRelationRequest, DeleteRelationResponse> genForDeleteRelation() {
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
            f -> f.withMarshaller(DeleteRelationRequest::getCaseId, DeleteRelationRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteRelationRequest::getXSite, DeleteRelationRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRelationRequest::getXLanguage, DeleteRelationRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRelationRequest::getXTimeZone, DeleteRelationRequest::setXTimeZone));
        builder.<DeleteRelationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRelationsReq.class),
            f -> f.withMarshaller(DeleteRelationRequest::getBody, DeleteRelationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAccessoriesRequest, DownloadAccessoriesResponse> downloadAccessories =
        genForDownloadAccessories();

    private static HttpRequestDef<DownloadAccessoriesRequest, DownloadAccessoriesResponse> genForDownloadAccessories() {
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
            f -> f.withMarshaller(DownloadAccessoriesRequest::getAccessoryId,
                DownloadAccessoriesRequest::setAccessoryId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getGroupId, DownloadAccessoriesRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXSite, DownloadAccessoriesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXLanguage, DownloadAccessoriesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAccessoriesRequest::getXTimeZone, DownloadAccessoriesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadCasesRequest, DownloadCasesResponse> downloadCases =
        genForDownloadCases();

    private static HttpRequestDef<DownloadCasesRequest, DownloadCasesResponse> genForDownloadCases() {
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
            f -> f.withMarshaller(DownloadCasesRequest::getLanguage, DownloadCasesRequest::setLanguage));
        builder.<String>withRequestField("timezone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getTimezone, DownloadCasesRequest::setTimezone));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getIncidentId, DownloadCasesRequest::setIncidentId));
        builder.<String>withRequestField("query_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getQueryStartTime, DownloadCasesRequest::setQueryStartTime));
        builder.<String>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getQueryEndTime, DownloadCasesRequest::setQueryEndTime));
        builder.<String>withRequestField("x_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXCustomerName, DownloadCasesRequest::setXCustomerName));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getSearchKey, DownloadCasesRequest::setSearchKey));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getStatus, DownloadCasesRequest::setStatus));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getCustomerId, DownloadCasesRequest::setCustomerId));
        builder.<List<String>>withRequestField("tenant_source_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DownloadCasesRequest::getTenantSourceIdList,
                DownloadCasesRequest::setTenantSourceIdList));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getSubCustomerId, DownloadCasesRequest::setSubCustomerId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getOffset, DownloadCasesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getLimit, DownloadCasesRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXSite, DownloadCasesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXLanguage, DownloadCasesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadCasesRequest::getXTimeZone, DownloadCasesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadImagesRequest, DownloadImagesResponse> downloadImages =
        genForDownloadImages();

    private static HttpRequestDef<DownloadImagesRequest, DownloadImagesResponse> genForDownloadImages() {
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
            f -> f.withMarshaller(DownloadImagesRequest::getAccessoryId, DownloadImagesRequest::setAccessoryId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImagesRequest::getGroupId, DownloadImagesRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadImagesRequest::getXSite, DownloadImagesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImagesRequest::getXLanguage, DownloadImagesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImagesRequest::getXTimeZone, DownloadImagesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> listAccessoryAccessUrls =
        genForListAccessoryAccessUrls();

    private static HttpRequestDef<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> genForListAccessoryAccessUrls() {
        // basic
        HttpRequestDef.Builder<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessoryAccessUrlsRequest.class, ListAccessoryAccessUrlsResponse.class)
            .withName("ListAccessoryAccessUrls")
            .withUri("/v2/servicerequest/accessorys/access-urls")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getGroupId,
                ListAccessoryAccessUrlsRequest::setGroupId));
        builder.<List<String>>withRequestField("accessory_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getAccessoryIds,
                ListAccessoryAccessUrlsRequest::setAccessoryIds));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getXSite, ListAccessoryAccessUrlsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getXLanguage,
                ListAccessoryAccessUrlsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessoryAccessUrlsRequest::getXTimeZone,
                ListAccessoryAccessUrlsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForListAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForListAgencies() {
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
            f -> f.withMarshaller(ListAgenciesRequest::getXSite, ListAgenciesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getXLanguage, ListAgenciesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getXTimeZone, ListAgenciesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAreaCodesRequest, ListAreaCodesResponse> listAreaCodes =
        genForListAreaCodes();

    private static HttpRequestDef<ListAreaCodesRequest, ListAreaCodesResponse> genForListAreaCodes() {
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
            f -> f.withMarshaller(ListAreaCodesRequest::getXSite, ListAreaCodesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaCodesRequest::getXLanguage, ListAreaCodesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaCodesRequest::getXTimeZone, ListAreaCodesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArticlesRequest, ListArticlesResponse> listArticles = genForListArticles();

    private static HttpRequestDef<ListArticlesRequest, ListArticlesResponse> genForListArticles() {
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
            f -> f.withMarshaller(ListArticlesRequest::getSearchType, ListArticlesRequest::setSearchType));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArticlesRequest::getXServiceKey, ListArticlesRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArticlesRequest::getXSite, ListArticlesRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArticlesRequest::getXLanguage, ListArticlesRequest::setXLanguage));
        builder.<SearchArticlesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchArticlesReq.class),
            f -> f.withMarshaller(ListArticlesRequest::getBody, ListArticlesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizations =
        genForListAuthorizations();

    private static HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> genForListAuthorizations() {
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
            f -> f.withMarshaller(ListAuthorizationsRequest::getSubCustomerName,
                ListAuthorizationsRequest::setSubCustomerName));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getIncidentId, ListAuthorizationsRequest::setIncidentId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getStatus, ListAuthorizationsRequest::setStatus));
        builder.<String>withRequestField("simple_description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getSimpleDescription,
                ListAuthorizationsRequest::setSimpleDescription));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getOffset, ListAuthorizationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getLimit, ListAuthorizationsRequest::setLimit));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getGroupId, ListAuthorizationsRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getXSite, ListAuthorizationsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getXLanguage, ListAuthorizationsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationsRequest::getXTimeZone, ListAuthorizationsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCategoriesRequest, ListCaseCategoriesResponse> listCaseCategories =
        genForListCaseCategories();

    private static HttpRequestDef<ListCaseCategoriesRequest, ListCaseCategoriesResponse> genForListCaseCategories() {
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
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXSite, ListCaseCategoriesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXLanguage, ListCaseCategoriesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCategoriesRequest::getXTimeZone, ListCaseCategoriesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> listCaseCcEmails =
        genForListCaseCcEmails();

    private static HttpRequestDef<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> genForListCaseCcEmails() {
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
            f -> f.withMarshaller(ListCaseCcEmailsRequest::getXSite, ListCaseCcEmailsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCcEmailsRequest::getXLanguage, ListCaseCcEmailsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCcEmailsRequest::getXTimeZone, ListCaseCcEmailsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseCountsRequest, ListCaseCountsResponse> listCaseCounts =
        genForListCaseCounts();

    private static HttpRequestDef<ListCaseCountsRequest, ListCaseCountsResponse> genForListCaseCounts() {
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
            f -> f.withMarshaller(ListCaseCountsRequest::getStatus, ListCaseCountsRequest::setStatus));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseCountsRequest::getXSite, ListCaseCountsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCountsRequest::getXLanguage, ListCaseCountsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseCountsRequest::getXTimeZone, ListCaseCountsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseLabelsRequest, ListCaseLabelsResponse> listCaseLabels =
        genForListCaseLabels();

    private static HttpRequestDef<ListCaseLabelsRequest, ListCaseLabelsResponse> genForListCaseLabels() {
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
            f -> f.withMarshaller(ListCaseLabelsRequest::getCaseId, ListCaseLabelsRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseLabelsRequest::getXSite, ListCaseLabelsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLabelsRequest::getXLanguage, ListCaseLabelsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLabelsRequest::getXTimeZone, ListCaseLabelsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseLimitsRequest, ListCaseLimitsResponse> listCaseLimits =
        genForListCaseLimits();

    private static HttpRequestDef<ListCaseLimitsRequest, ListCaseLimitsResponse> genForListCaseLimits() {
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
            f -> f.withMarshaller(ListCaseLimitsRequest::getXSite, ListCaseLimitsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLimitsRequest::getXLanguage, ListCaseLimitsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseLimitsRequest::getXTimeZone, ListCaseLimitsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> listCaseOperateLogs =
        genForListCaseOperateLogs();

    private static HttpRequestDef<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> genForListCaseOperateLogs() {
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
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getCaseId, ListCaseOperateLogsRequest::setCaseId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getGroupId, ListCaseOperateLogsRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getOffset, ListCaseOperateLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getLimit, ListCaseOperateLogsRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXSite, ListCaseOperateLogsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXLanguage, ListCaseOperateLogsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseOperateLogsRequest::getXTimeZone, ListCaseOperateLogsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseQuotasRequest, ListCaseQuotasResponse> listCaseQuotas =
        genForListCaseQuotas();

    private static HttpRequestDef<ListCaseQuotasRequest, ListCaseQuotasResponse> genForListCaseQuotas() {
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
            f -> f.withMarshaller(ListCaseQuotasRequest::getProductCategoryId,
                ListCaseQuotasRequest::setProductCategoryId));
        builder.<String>withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getBusinessTypeId, ListCaseQuotasRequest::setBusinessTypeId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getXSite, ListCaseQuotasRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getXLanguage, ListCaseQuotasRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseQuotasRequest::getXTimeZone, ListCaseQuotasRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaseTemplatesRequest, ListCaseTemplatesResponse> listCaseTemplates =
        genForListCaseTemplates();

    private static HttpRequestDef<ListCaseTemplatesRequest, ListCaseTemplatesResponse> genForListCaseTemplates() {
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
            f -> f.withMarshaller(ListCaseTemplatesRequest::getBusinessTypeId,
                ListCaseTemplatesRequest::setBusinessTypeId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXSite, ListCaseTemplatesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXLanguage, ListCaseTemplatesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaseTemplatesRequest::getXTimeZone, ListCaseTemplatesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCasesRequest, ListCasesResponse> listCases = genForListCases();

    private static HttpRequestDef<ListCasesRequest, ListCasesResponse> genForListCases() {
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
            f -> f.withMarshaller(ListCasesRequest::getSearchKey, ListCasesRequest::setSearchKey));
        builder.<List<String>>withRequestField("label_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCasesRequest::getLabelIdList, ListCasesRequest::setLabelIdList));
        builder.<String>withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getAppKey, ListCasesRequest::setAppKey));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getIncidentId, ListCasesRequest::setIncidentId));
        builder.<String>withRequestField("query_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getQueryStartTime, ListCasesRequest::setQueryStartTime));
        builder.<String>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getQueryEndTime, ListCasesRequest::setQueryEndTime));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getStatus, ListCasesRequest::setStatus));
        builder.<String>withRequestField("incident_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getIncidentStatus, ListCasesRequest::setIncidentStatus));
        builder.<String>withRequestField("x_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXCustomerId, ListCasesRequest::setXCustomerId));
        builder.<String>withRequestField("x_customer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXCustomerName, ListCasesRequest::setXCustomerName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getGroupId, ListCasesRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getOffset, ListCasesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getLimit, ListCasesRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCasesRequest::getXSite, ListCasesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXLanguage, ListCasesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesRequest::getXTimeZone, ListCasesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomersRegionsRequest, ListCustomersRegionsResponse> listCustomersRegions =
        genForListCustomersRegions();

    private static HttpRequestDef<ListCustomersRegionsRequest, ListCustomersRegionsResponse> genForListCustomersRegions() {
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
            f -> f.withMarshaller(ListCustomersRegionsRequest::getXSite, ListCustomersRegionsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomersRegionsRequest::getXLanguage,
                ListCustomersRegionsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomersRegionsRequest::getXTimeZone,
                ListCustomersRegionsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse> listDiagnoseItems =
        genForListDiagnoseItems();

    private static HttpRequestDef<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse> genForListDiagnoseItems() {
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
            f -> f.withMarshaller(ListDiagnoseItemsRequest::getBody, ListDiagnoseItemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseJobRequest, ListDiagnoseJobResponse> listDiagnoseJob =
        genForListDiagnoseJob();

    private static HttpRequestDef<ListDiagnoseJobRequest, ListDiagnoseJobResponse> genForListDiagnoseJob() {
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
            f -> f.withMarshaller(ListDiagnoseJobRequest::getJobId, ListDiagnoseJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse> listDiagnoseRecords =
        genForListDiagnoseRecords();

    private static HttpRequestDef<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse> genForListDiagnoseRecords() {
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
            f -> f.withMarshaller(ListDiagnoseRecordsRequest::getPageSize, ListDiagnoseRecordsRequest::setPageSize));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnoseRecordsRequest::getPageNo, ListDiagnoseRecordsRequest::setPageNo));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnoseRecordsRequest::getType, ListDiagnoseRecordsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse> listDiagnoseResources =
        genForListDiagnoseResources();

    private static HttpRequestDef<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse> genForListDiagnoseResources() {
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
            f -> f.withMarshaller(ListDiagnoseResourcesRequest::getBody, ListDiagnoseResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtendsParamsRequest, ListExtendsParamsResponse> listExtendsParams =
        genForListExtendsParams();

    private static HttpRequestDef<ListExtendsParamsRequest, ListExtendsParamsResponse> genForListExtendsParams() {
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
            f -> f.withMarshaller(ListExtendsParamsRequest::getBusinessTypeId,
                ListExtendsParamsRequest::setBusinessTypeId));
        builder.<String>withRequestField("incident_sub_type_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getIncidentSubTypeId,
                ListExtendsParamsRequest::setIncidentSubTypeId));
        builder.<String>withRequestField("product_category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getProductCategoryId,
                ListExtendsParamsRequest::setProductCategoryId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getXSite, ListExtendsParamsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getXLanguage, ListExtendsParamsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExtendsParamsRequest::getXTimeZone, ListExtendsParamsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeedbackOptionRequest, ListFeedbackOptionResponse> listFeedbackOption =
        genForListFeedbackOption();

    private static HttpRequestDef<ListFeedbackOptionRequest, ListFeedbackOptionResponse> genForListFeedbackOption() {
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
            f -> f.withMarshaller(ListFeedbackOptionRequest::getStatus, ListFeedbackOptionRequest::setStatus));
        builder.<ListFeedbackOptionRequest.FeedbackSourceEnum>withRequestField("feedback_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFeedbackOptionRequest.FeedbackSourceEnum.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getFeedbackSource,
                ListFeedbackOptionRequest::setFeedbackSource));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getXServiceKey,
                ListFeedbackOptionRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getXSite, ListFeedbackOptionRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeedbackOptionRequest::getXLanguage, ListFeedbackOptionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> listHasVerifiedContacts =
        genForListHasVerifiedContacts();

    private static HttpRequestDef<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> genForListHasVerifiedContacts() {
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
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getContactWay,
                ListHasVerifiedContactsRequest::setContactWay));
        builder.<String>withRequestField("customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getCustomerId,
                ListHasVerifiedContactsRequest::setCustomerId));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getSubCustomerId,
                ListHasVerifiedContactsRequest::setSubCustomerId));
        builder.<String>withRequestField("expired_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getExpiredTime,
                ListHasVerifiedContactsRequest::setExpiredTime));
        builder.<String>withRequestField("verified_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getVerifiedId,
                ListHasVerifiedContactsRequest::setVerifiedId));
        builder.<String>withRequestField("contact_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getContactValue,
                ListHasVerifiedContactsRequest::setContactValue));
        builder.<String>withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getAreaCode,
                ListHasVerifiedContactsRequest::setAreaCode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getOffset,
                ListHasVerifiedContactsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getLimit, ListHasVerifiedContactsRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXSite, ListHasVerifiedContactsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXLanguage,
                ListHasVerifiedContactsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHasVerifiedContactsRequest::getXTimeZone,
                ListHasVerifiedContactsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> listHistoryOperateLogs =
        genForListHistoryOperateLogs();

    private static HttpRequestDef<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> genForListHistoryOperateLogs() {
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
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getAuthorizationId,
                ListHistoryOperateLogsRequest::setAuthorizationId));
        builder.<Long>withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getAuthorizationDetailId,
                ListHistoryOperateLogsRequest::setAuthorizationDetailId));
        builder.<Long>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getSessionId,
                ListHistoryOperateLogsRequest::setSessionId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getGroupId,
                ListHistoryOperateLogsRequest::setGroupId));
        builder.<Integer>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getSort, ListHistoryOperateLogsRequest::setSort));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getOffset, ListHistoryOperateLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getLimit, ListHistoryOperateLogsRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXSite, ListHistoryOperateLogsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXLanguage,
                ListHistoryOperateLogsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperateLogsRequest::getXTimeZone,
                ListHistoryOperateLogsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistorySessionsRequest, ListHistorySessionsResponse> listHistorySessions =
        genForListHistorySessions();

    private static HttpRequestDef<ListHistorySessionsRequest, ListHistorySessionsResponse> genForListHistorySessions() {
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
            f -> f.withMarshaller(ListHistorySessionsRequest::getAuthorizationId,
                ListHistorySessionsRequest::setAuthorizationId));
        builder.<Long>withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getAuthorizationDetailId,
                ListHistorySessionsRequest::setAuthorizationDetailId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getGroupId, ListHistorySessionsRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getOffset, ListHistorySessionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getLimit, ListHistorySessionsRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getXSite, ListHistorySessionsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getXLanguage, ListHistorySessionsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistorySessionsRequest::getXTimeZone, ListHistorySessionsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsRequest, ListLabelsResponse> listLabels = genForListLabels();

    private static HttpRequestDef<ListLabelsRequest, ListLabelsResponse> genForListLabels() {
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
            f -> f.withMarshaller(ListLabelsRequest::getOffset, ListLabelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLabelsRequest::getLimit, ListLabelsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelsRequest::getName, ListLabelsRequest::setName));
        builder.<Integer>withRequestField("label_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLabelsRequest::getLabelId, ListLabelsRequest::setLabelId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLabelsRequest::getXSite, ListLabelsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelsRequest::getXLanguage, ListLabelsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelsRequest::getXTimeZone, ListLabelsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessagesRequest, ListMessagesResponse> listMessages = genForListMessages();

    private static HttpRequestDef<ListMessagesRequest, ListMessagesResponse> genForListMessages() {
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
            f -> f.withMarshaller(ListMessagesRequest::getCaseId, ListMessagesRequest::setCaseId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getGroupId, ListMessagesRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getOffset, ListMessagesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getLimit, ListMessagesRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessagesRequest::getXSite, ListMessagesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getXLanguage, ListMessagesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getXTimeZone, ListMessagesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> listMoreInstantMessages =
        genForListMoreInstantMessages();

    private static HttpRequestDef<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> genForListMoreInstantMessages() {
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
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getCaseId,
                ListMoreInstantMessagesRequest::setCaseId));
        builder.<String>withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getCreateTime,
                ListMoreInstantMessagesRequest::setCreateTime));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getType, ListMoreInstantMessagesRequest::setType));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getGroupId,
                ListMoreInstantMessagesRequest::setGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getLimit, ListMoreInstantMessagesRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXSite, ListMoreInstantMessagesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXLanguage,
                ListMoreInstantMessagesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMoreInstantMessagesRequest::getXTimeZone,
                ListMoreInstantMessagesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> listNewInstantMessages =
        genForListNewInstantMessages();

    private static HttpRequestDef<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> genForListNewInstantMessages() {
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
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getCaseIds,
                ListNewInstantMessagesRequest::setCaseIds));
        builder.<String>withRequestField("last_message_time_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getLastMessageTimeId,
                ListNewInstantMessagesRequest::setLastMessageTimeId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getGroupId,
                ListNewInstantMessagesRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXSite, ListNewInstantMessagesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXLanguage,
                ListNewInstantMessagesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNewInstantMessagesRequest::getXTimeZone,
                ListNewInstantMessagesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticesRequest, ListNoticesResponse> listNotices = genForListNotices();

    private static HttpRequestDef<ListNoticesRequest, ListNoticesResponse> genForListNotices() {
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
            f -> f.withMarshaller(ListNoticesRequest::getXServiceKey, ListNoticesRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticesRequest::getXSite, ListNoticesRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticesRequest::getXLanguage, ListNoticesRequest::setXLanguage));
        builder.<SearchNoticesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchNoticesReq.class),
            f -> f.withMarshaller(ListNoticesRequest::getBody, ListNoticesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrderIncidentRequest, ListOrderIncidentResponse> listOrderIncident =
        genForListOrderIncident();

    private static HttpRequestDef<ListOrderIncidentRequest, ListOrderIncidentResponse> genForListOrderIncident() {
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
            f -> f.withMarshaller(ListOrderIncidentRequest::getVersion, ListOrderIncidentRequest::setVersion));
        builder.<List<String>>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getSearchKey, ListOrderIncidentRequest::setSearchKey));
        builder.<List<Integer>>withRequestField("labelIdList",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getLabelIdList, ListOrderIncidentRequest::setLabelIdList));
        builder.<String>withRequestField("appKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getAppKey, ListOrderIncidentRequest::setAppKey));
        builder.<String>withRequestField("incidentId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getIncidentId, ListOrderIncidentRequest::setIncidentId));
        builder.<String>withRequestField("queryStartTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getQueryStartTime,
                ListOrderIncidentRequest::setQueryStartTime));
        builder.<String>withRequestField("queryEndTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getQueryEndTime,
                ListOrderIncidentRequest::setQueryEndTime));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getStatus, ListOrderIncidentRequest::setStatus));
        builder.<String>withRequestField("incidentStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getIncidentStatus,
                ListOrderIncidentRequest::setIncidentStatus));
        builder.<String>withRequestField("xCustomerName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getXCustomerName,
                ListOrderIncidentRequest::setXCustomerName));
        builder.<String>withRequestField("groupId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getGroupId, ListOrderIncidentRequest::setGroupId));
        builder.<String>withRequestField("productCategoryId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getProductCategoryId,
                ListOrderIncidentRequest::setProductCategoryId));
        builder.<String>withRequestField("businessTypeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getBusinessTypeId,
                ListOrderIncidentRequest::setBusinessTypeId));
        builder.<Integer>withRequestField("pageNo",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getPageNo, ListOrderIncidentRequest::setPageNo));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getPageSize, ListOrderIncidentRequest::setPageSize));
        builder.<String>withRequestField("xCustomerId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderIncidentRequest::getXCustomerId, ListOrderIncidentRequest::setXCustomerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivilegesRequest, ListPrivilegesResponse> listPrivileges =
        genForListPrivileges();

    private static HttpRequestDef<ListPrivilegesRequest, ListPrivilegesResponse> genForListPrivileges() {
        // basic
        HttpRequestDef.Builder<ListPrivilegesRequest, ListPrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivilegesRequest.class, ListPrivilegesResponse.class)
                .withName("ListPrivileges")
                .withUri("/v2/servicerequest/privileges")
                .withContentType("application/json");

        // requests
        builder.<ListPrivilegesRequest.PrivilegeEnum>withRequestField("privilege",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListPrivilegesRequest.PrivilegeEnum.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getPrivilege, ListPrivilegesRequest::setPrivilege));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getXSite, ListPrivilegesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getXLanguage, ListPrivilegesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivilegesRequest::getXTimeZone, ListPrivilegesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProblemTypesRequest, ListProblemTypesResponse> listProblemTypes =
        genForListProblemTypes();

    private static HttpRequestDef<ListProblemTypesRequest, ListProblemTypesResponse> genForListProblemTypes() {
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
            f -> f.withMarshaller(ListProblemTypesRequest::getProductCategoryId,
                ListProblemTypesRequest::setProductCategoryId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProblemTypesRequest::getXSite, ListProblemTypesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProblemTypesRequest::getXLanguage, ListProblemTypesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProblemTypesRequest::getXTimeZone, ListProblemTypesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductCategoriesRequest, ListProductCategoriesResponse> listProductCategories =
        genForListProductCategories();

    private static HttpRequestDef<ListProductCategoriesRequest, ListProductCategoriesResponse> genForListProductCategories() {
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
            f -> f.withMarshaller(ListProductCategoriesRequest::getProductCategoryName,
                ListProductCategoriesRequest::setProductCategoryName));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductCategoriesRequest::getXSite, ListProductCategoriesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductCategoriesRequest::getXLanguage,
                ListProductCategoriesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductCategoriesRequest::getXTimeZone,
                ListProductCategoriesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecommendWordsRequest, ListRecommendWordsResponse> listRecommendWords =
        genForListRecommendWords();

    private static HttpRequestDef<ListRecommendWordsRequest, ListRecommendWordsResponse> genForListRecommendWords() {
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
            f -> f.withMarshaller(ListRecommendWordsRequest::getRecommendWordId,
                ListRecommendWordsRequest::setRecommendWordId));
        builder.<Integer>withRequestField("level_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getLevelValue, ListRecommendWordsRequest::setLevelValue));
        builder.<String>withRequestField("theme_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getThemeName, ListRecommendWordsRequest::setThemeName));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getXServiceKey,
                ListRecommendWordsRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getXSite, ListRecommendWordsRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecommendWordsRequest::getXLanguage, ListRecommendWordsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForListRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForListRegions() {
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
            f -> f.withMarshaller(ListRegionsRequest::getXSite, ListRegionsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionsRequest::getXLanguage, ListRegionsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionsRequest::getXTimeZone, ListRegionsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelationRequest, ListRelationResponse> listRelation = genForListRelation();

    private static HttpRequestDef<ListRelationRequest, ListRelationResponse> genForListRelation() {
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
            f -> f.withMarshaller(ListRelationRequest::getCaseId, ListRelationRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelationRequest::getXSite, ListRelationRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationRequest::getXLanguage, ListRelationRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelationRequest::getXTimeZone, ListRelationRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> listSatisfactionDimensions =
        genForListSatisfactionDimensions();

    private static HttpRequestDef<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> genForListSatisfactionDimensions() {
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
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXSite,
                ListSatisfactionDimensionsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXLanguage,
                ListSatisfactionDimensionsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSatisfactionDimensionsRequest::getXTimeZone,
                ListSatisfactionDimensionsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSeveritiesRequest, ListSeveritiesResponse> listSeverities =
        genForListSeverities();

    private static HttpRequestDef<ListSeveritiesRequest, ListSeveritiesResponse> genForListSeverities() {
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
            f -> f.withMarshaller(ListSeveritiesRequest::getProductCategoryId,
                ListSeveritiesRequest::setProductCategoryId));
        builder.<String>withRequestField("business_type_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getBusinessTypeId, ListSeveritiesRequest::setBusinessTypeId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getXSite, ListSeveritiesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getXLanguage, ListSeveritiesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeveritiesRequest::getXTimeZone, ListSeveritiesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomers =
        genForListSubCustomers();

    private static HttpRequestDef<ListSubCustomersRequest, ListSubCustomersResponse> genForListSubCustomers() {
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
            f -> f.withMarshaller(ListSubCustomersRequest::getSubCustomerName,
                ListSubCustomersRequest::setSubCustomerName));
        builder.<String>withRequestField("sub_customer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getSubCustomerId,
                ListSubCustomersRequest::setSubCustomerId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getXSite, ListSubCustomersRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getXLanguage, ListSubCustomersRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubCustomersRequest::getXTimeZone, ListSubCustomersRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListToolsRequest, ListToolsResponse> listTools = genForListTools();

    private static HttpRequestDef<ListToolsRequest, ListToolsResponse> genForListTools() {
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
            f -> f.withMarshaller(ListToolsRequest::getXServiceKey, ListToolsRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListToolsRequest::getXSite, ListToolsRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListToolsRequest::getXLanguage, ListToolsRequest::setXLanguage));
        builder.<SearchToolsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchToolsReq.class),
            f -> f.withMarshaller(ListToolsRequest::getBody, ListToolsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransportHistoriesRequest, ListTransportHistoriesResponse> listTransportHistories =
        genForListTransportHistories();

    private static HttpRequestDef<ListTransportHistoriesRequest, ListTransportHistoriesResponse> genForListTransportHistories() {
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
            f -> f.withMarshaller(ListTransportHistoriesRequest::getAuthorizationId,
                ListTransportHistoriesRequest::setAuthorizationId));
        builder.<Long>withRequestField("authorization_detail_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getAuthorizationDetailId,
                ListTransportHistoriesRequest::setAuthorizationDetailId));
        builder.<Long>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getSessionId,
                ListTransportHistoriesRequest::setSessionId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getGroupId,
                ListTransportHistoriesRequest::setGroupId));
        builder.<Integer>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getSort, ListTransportHistoriesRequest::setSort));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getOffset, ListTransportHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getLimit, ListTransportHistoriesRequest::setLimit));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXSite, ListTransportHistoriesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXLanguage,
                ListTransportHistoriesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransportHistoriesRequest::getXTimeZone,
                ListTransportHistoriesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessages =
        genForListUnreadNewInstantMessages();

    private static HttpRequestDef<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> genForListUnreadNewInstantMessages() {
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
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getCaseIds,
                ListUnreadNewInstantMessagesRequest::setCaseIds));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getGroupId,
                ListUnreadNewInstantMessagesRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXSite,
                ListUnreadNewInstantMessagesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXLanguage,
                ListUnreadNewInstantMessagesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnreadNewInstantMessagesRequest::getXTimeZone,
                ListUnreadNewInstantMessagesRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeMessageRequest, RevokeMessageResponse> revokeMessage =
        genForRevokeMessage();

    private static HttpRequestDef<RevokeMessageRequest, RevokeMessageResponse> genForRevokeMessage() {
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
            f -> f.withMarshaller(RevokeMessageRequest::getCaseId, RevokeMessageRequest::setCaseId));
        builder.<String>withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeMessageRequest::getMessageId, RevokeMessageRequest::setMessageId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RevokeMessageRequest::getXSite, RevokeMessageRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeMessageRequest::getXLanguage, RevokeMessageRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeMessageRequest::getXTimeZone, RevokeMessageRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVerifyCodesRequest, SendVerifyCodesResponse> sendVerifyCodes =
        genForSendVerifyCodes();

    private static HttpRequestDef<SendVerifyCodesRequest, SendVerifyCodesResponse> genForSendVerifyCodes() {
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
            f -> f.withMarshaller(SendVerifyCodesRequest::getXSite, SendVerifyCodesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVerifyCodesRequest::getXLanguage, SendVerifyCodesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVerifyCodesRequest::getXTimeZone, SendVerifyCodesRequest::setXTimeZone));
        builder.<SendVerifyCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SendVerifyCodeReq.class),
            f -> f.withMarshaller(SendVerifyCodesRequest::getBody, SendVerifyCodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> showAccessoryLimits =
        genForShowAccessoryLimits();

    private static HttpRequestDef<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> genForShowAccessoryLimits() {
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
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXSite, ShowAccessoryLimitsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXLanguage, ShowAccessoryLimitsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessoryLimitsRequest::getXTimeZone, ShowAccessoryLimitsRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse> showAssociatedQuestions =
        genForShowAssociatedQuestions();

    private static HttpRequestDef<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse> genForShowAssociatedQuestions() {
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
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getXServiceKey,
                ShowAssociatedQuestionsRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getXSite, ShowAssociatedQuestionsRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getXLanguage,
                ShowAssociatedQuestionsRequest::setXLanguage));
        builder.<QueryAssociatedQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryAssociatedQuestionReq.class),
            f -> f.withMarshaller(ShowAssociatedQuestionsRequest::getBody, ShowAssociatedQuestionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> showAuthorizationDetail =
        genForShowAuthorizationDetail();

    private static HttpRequestDef<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> genForShowAuthorizationDetail() {
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
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getAuthorizationId,
                ShowAuthorizationDetailRequest::setAuthorizationId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getGroupId,
                ShowAuthorizationDetailRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXSite, ShowAuthorizationDetailRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXLanguage,
                ShowAuthorizationDetailRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizationDetailRequest::getXTimeZone,
                ShowAuthorizationDetailRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseDetailRequest, ShowCaseDetailResponse> showCaseDetail =
        genForShowCaseDetail();

    private static HttpRequestDef<ShowCaseDetailRequest, ShowCaseDetailResponse> genForShowCaseDetail() {
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
            f -> f.withMarshaller(ShowCaseDetailRequest::getCaseId, ShowCaseDetailRequest::setCaseId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getGroupId, ShowCaseDetailRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getXSite, ShowCaseDetailRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getXLanguage, ShowCaseDetailRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseDetailRequest::getXTimeZone, ShowCaseDetailRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse> showCaseExtendsParam =
        genForShowCaseExtendsParam();

    private static HttpRequestDef<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse> genForShowCaseExtendsParam() {
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
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getCaseId, ShowCaseExtendsParamRequest::setCaseId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getGroupId, ShowCaseExtendsParamRequest::setGroupId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getXSite, ShowCaseExtendsParamRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getXLanguage,
                ShowCaseExtendsParamRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseExtendsParamRequest::getXTimeZone,
                ShowCaseExtendsParamRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseStatusRequest, ShowCaseStatusResponse> showCaseStatus =
        genForShowCaseStatus();

    private static HttpRequestDef<ShowCaseStatusRequest, ShowCaseStatusResponse> genForShowCaseStatus() {
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
            f -> f.withMarshaller(ShowCaseStatusRequest::getCaseId, ShowCaseStatusRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCaseStatusRequest::getXSite, ShowCaseStatusRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseStatusRequest::getXLanguage, ShowCaseStatusRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseStatusRequest::getXTimeZone, ShowCaseStatusRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> showConfiguration =
        genForShowConfiguration();

    private static HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> genForShowConfiguration() {
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
            f -> f.withMarshaller(ShowConfigurationRequest::getConfigKey, ShowConfigurationRequest::setConfigKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse> showCustomerPrivilegePolicy =
        genForShowCustomerPrivilegePolicy();

    private static HttpRequestDef<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse> genForShowCustomerPrivilegePolicy() {
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
            f -> f.withMarshaller(ShowCustomerPrivilegePolicyRequest::getXSite,
                ShowCustomerPrivilegePolicyRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerPrivilegePolicyRequest::getXLanguage,
                ShowCustomerPrivilegePolicyRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomerPrivilegePolicyRequest::getXTimeZone,
                ShowCustomerPrivilegePolicyRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse> showDownloadAccessoryUrl =
        genForShowDownloadAccessoryUrl();

    private static HttpRequestDef<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse> genForShowDownloadAccessoryUrl() {
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
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getAccessoryId,
                ShowDownloadAccessoryUrlRequest::setAccessoryId));
        builder.<ShowDownloadAccessoryUrlRequest.RelationTypeEnum>withRequestField("relation_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDownloadAccessoryUrlRequest.RelationTypeEnum.class),
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getRelationType,
                ShowDownloadAccessoryUrlRequest::setRelationType));
        builder.<String>withRequestField("relation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getRelationId,
                ShowDownloadAccessoryUrlRequest::setRelationId));
        builder.<String>withRequestField("incident_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDownloadAccessoryUrlRequest::getIncidentId,
                ShowDownloadAccessoryUrlRequest::setIncidentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse> showLatestPublishedAgreement =
        genForShowLatestPublishedAgreement();

    private static HttpRequestDef<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse> genForShowLatestPublishedAgreement() {
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
        builder.<ShowLatestPublishedAgreementRequest.AgreementTypeEnum>withRequestField("agreement_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowLatestPublishedAgreementRequest.AgreementTypeEnum.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getAgreementType,
                ShowLatestPublishedAgreementRequest::setAgreementType));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getXSite,
                ShowLatestPublishedAgreementRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getXLanguage,
                ShowLatestPublishedAgreementRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestPublishedAgreementRequest::getXTimeZone,
                ShowLatestPublishedAgreementRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoginTypeRequest, ShowLoginTypeResponse> showLoginType =
        genForShowLoginType();

    private static HttpRequestDef<ShowLoginTypeRequest, ShowLoginTypeResponse> genForShowLoginType() {
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
            f -> f.withMarshaller(ShowLoginTypeRequest::getXLanguage, ShowLoginTypeRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoginTypeRequest::getXTimeZone, ShowLoginTypeRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> showPartnersCasesPrivilege =
        genForShowPartnersCasesPrivilege();

    private static HttpRequestDef<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> genForShowPartnersCasesPrivilege() {
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
            f -> f.withMarshaller(ShowPartnersCasesPrivilegeRequest::getXSite,
                ShowPartnersCasesPrivilegeRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersCasesPrivilegeRequest::getXLanguage,
                ShowPartnersCasesPrivilegeRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersCasesPrivilegeRequest::getXTimeZone,
                ShowPartnersCasesPrivilegeRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> showPartnersServiceInfo =
        genForShowPartnersServiceInfo();

    private static HttpRequestDef<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> genForShowPartnersServiceInfo() {
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
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getCaseSubTypeId,
                ShowPartnersServiceInfoRequest::setCaseSubTypeId));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getProductId,
                ShowPartnersServiceInfoRequest::setProductId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXSite, ShowPartnersServiceInfoRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXLanguage,
                ShowPartnersServiceInfoRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartnersServiceInfoRequest::getXTimeZone,
                ShowPartnersServiceInfoRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQaPairDetailRequest, ShowQaPairDetailResponse> showQaPairDetail =
        genForShowQaPairDetail();

    private static HttpRequestDef<ShowQaPairDetailRequest, ShowQaPairDetailResponse> genForShowQaPairDetail() {
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
            f -> f.withMarshaller(ShowQaPairDetailRequest::getQaPairId, ShowQaPairDetailRequest::setQaPairId));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairDetailRequest::getXServiceKey, ShowQaPairDetailRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairDetailRequest::getXSite, ShowQaPairDetailRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairDetailRequest::getXLanguage, ShowQaPairDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQaPairsRequest, ShowQaPairsResponse> showQaPairs = genForShowQaPairs();

    private static HttpRequestDef<ShowQaPairsRequest, ShowQaPairsResponse> genForShowQaPairs() {
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
            f -> f.withMarshaller(ShowQaPairsRequest::getSearchType, ShowQaPairsRequest::setSearchType));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getXServiceKey, ShowQaPairsRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getXSite, ShowQaPairsRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getXLanguage, ShowQaPairsRequest::setXLanguage));
        builder.<SearchQaPairsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchQaPairsReq.class),
            f -> f.withMarshaller(ShowQaPairsRequest::getBody, ShowQaPairsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse> showSignedLatestPublishedAgreement =
        genForShowSignedLatestPublishedAgreement();

    private static HttpRequestDef<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse> genForShowSignedLatestPublishedAgreement() {
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
        builder.<ShowSignedLatestPublishedAgreementRequest.AgreementTypeEnum>withRequestField("agreement_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSignedLatestPublishedAgreementRequest.AgreementTypeEnum.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getAgreementType,
                ShowSignedLatestPublishedAgreementRequest::setAgreementType));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getXSite,
                ShowSignedLatestPublishedAgreementRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getXLanguage,
                ShowSignedLatestPublishedAgreementRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSignedLatestPublishedAgreementRequest::getXTimeZone,
                ShowSignedLatestPublishedAgreementRequest::setXTimeZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowThemeRequest, ShowThemeResponse> showTheme = genForShowTheme();

    private static HttpRequestDef<ShowThemeRequest, ShowThemeResponse> genForShowTheme() {
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
            f -> f.withMarshaller(ShowThemeRequest::getProductTypeId, ShowThemeRequest::setProductTypeId));
        builder.<String>withRequestField("product_type_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getProductTypeName, ShowThemeRequest::setProductTypeName));
        builder.<String>withRequestField("product_type_short_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getProductTypeShortName,
                ShowThemeRequest::setProductTypeShortName));
        builder.<String>withRequestField("x-service-key",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getXServiceKey, ShowThemeRequest::setXServiceKey));
        builder.<String>withRequestField("x-site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getXSite, ShowThemeRequest::setXSite));
        builder.<String>withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowThemeRequest::getXLanguage, ShowThemeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SignPublishedAgreementRequest, SignPublishedAgreementResponse> signPublishedAgreement =
        genForSignPublishedAgreement();

    private static HttpRequestDef<SignPublishedAgreementRequest, SignPublishedAgreementResponse> genForSignPublishedAgreement() {
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
            f -> f.withMarshaller(SignPublishedAgreementRequest::getId, SignPublishedAgreementRequest::setId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getXSite, SignPublishedAgreementRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getXLanguage,
                SignPublishedAgreementRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getXTimeZone,
                SignPublishedAgreementRequest::setXTimeZone));
        builder.<SignAgreementReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SignAgreementReq.class),
            f -> f.withMarshaller(SignPublishedAgreementRequest::getBody, SignPublishedAgreementRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> updateAuthorizations =
        genForUpdateAuthorizations();

    private static HttpRequestDef<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> genForUpdateAuthorizations() {
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
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getAuthorizationId,
                UpdateAuthorizationsRequest::setAuthorizationId));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getActionId, UpdateAuthorizationsRequest::setActionId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXSite, UpdateAuthorizationsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXLanguage,
                UpdateAuthorizationsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getXTimeZone,
                UpdateAuthorizationsRequest::setXTimeZone));
        builder.<OperateAuthorizationV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OperateAuthorizationV2Req.class),
            f -> f.withMarshaller(UpdateAuthorizationsRequest::getBody, UpdateAuthorizationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse> updateCaseContactInfo =
        genForUpdateCaseContactInfo();

    private static HttpRequestDef<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse> genForUpdateCaseContactInfo() {
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
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getCaseId, UpdateCaseContactInfoRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getXSite, UpdateCaseContactInfoRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getXLanguage,
                UpdateCaseContactInfoRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getXTimeZone,
                UpdateCaseContactInfoRequest::setXTimeZone));
        builder.<UpdateCaseContactInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCaseContactInfoReq.class),
            f -> f.withMarshaller(UpdateCaseContactInfoRequest::getBody, UpdateCaseContactInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCasesRequest, UpdateCasesResponse> updateCases = genForUpdateCases();

    private static HttpRequestDef<UpdateCasesRequest, UpdateCasesResponse> genForUpdateCases() {
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
            f -> f.withMarshaller(UpdateCasesRequest::getCaseId, UpdateCasesRequest::setCaseId));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCasesRequest::getActionId, UpdateCasesRequest::setActionId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateCasesRequest::getXSite, UpdateCasesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCasesRequest::getXLanguage, UpdateCasesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCasesRequest::getXTimeZone, UpdateCasesRequest::setXTimeZone));
        builder.<WorkOrderOperateV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkOrderOperateV2Req.class),
            f -> f.withMarshaller(UpdateCasesRequest::getBody, UpdateCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLabelsRequest, UpdateLabelsResponse> updateLabels = genForUpdateLabels();

    private static HttpRequestDef<UpdateLabelsRequest, UpdateLabelsResponse> genForUpdateLabels() {
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
            f -> f.withMarshaller(UpdateLabelsRequest::getLabelId, UpdateLabelsRequest::setLabelId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getXSite, UpdateLabelsRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getXLanguage, UpdateLabelsRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getXTimeZone, UpdateLabelsRequest::setXTimeZone));
        builder.<UpdateLabelsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLabelsReq.class),
            f -> f.withMarshaller(UpdateLabelsRequest::getBody, UpdateLabelsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesRead =
        genForUpdateNewInstantMessagesRead();

    private static HttpRequestDef<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> genForUpdateNewInstantMessagesRead() {
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
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getCaseId,
                UpdateNewInstantMessagesReadRequest::setCaseId));
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXSite,
                UpdateNewInstantMessagesReadRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXLanguage,
                UpdateNewInstantMessagesReadRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getXTimeZone,
                UpdateNewInstantMessagesReadRequest::setXTimeZone));
        builder.<UpdateUnreadNewInstantMsgV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateUnreadNewInstantMsgV2Req.class),
            f -> f.withMarshaller(UpdateNewInstantMessagesReadRequest::getBody,
                UpdateNewInstantMessagesReadRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAccessoryRequest, UploadAccessoryResponse> uploadAccessory =
        genForUploadAccessory();

    private static HttpRequestDef<UploadAccessoryRequest, UploadAccessoryResponse> genForUploadAccessory() {
        // basic
        HttpRequestDef.Builder<UploadAccessoryRequest, UploadAccessoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAccessoryRequest.class, UploadAccessoryResponse.class)
                .withName("UploadAccessory")
                .withUri("/v2/servicerequest/accessorys")
                .withContentType("multipart/form-data");

        // requests
        builder.<Integer>withRequestField("X-Site",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UploadAccessoryRequest::getXSite, UploadAccessoryRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAccessoryRequest::getXLanguage, UploadAccessoryRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAccessoryRequest::getXTimeZone, UploadAccessoryRequest::setXTimeZone));
        builder.<UploadAccessoryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAccessoryRequestBody.class),
            f -> f.withMarshaller(UploadAccessoryRequest::getBody, UploadAccessoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> uploadJsonAccessories =
        genForUploadJsonAccessories();

    private static HttpRequestDef<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> genForUploadJsonAccessories() {
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
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXSite, UploadJsonAccessoriesRequest::setXSite));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXLanguage,
                UploadJsonAccessoriesRequest::setXLanguage));
        builder.<String>withRequestField("X-Time-Zone",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getXTimeZone,
                UploadJsonAccessoriesRequest::setXTimeZone));
        builder.<AccessoryJsonFormatReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AccessoryJsonFormatReq.class),
            f -> f.withMarshaller(UploadJsonAccessoriesRequest::getBody, UploadJsonAccessoriesRequest::setBody));

        // response

        return builder.build();
    }

}
