package com.huaweicloud.sdk.osm.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.osm.v2.model.CheckHostsRequest;
import com.huaweicloud.sdk.osm.v2.model.CheckHostsResponse;
import com.huaweicloud.sdk.osm.v2.model.CheckNeedVerifyRequest;
import com.huaweicloud.sdk.osm.v2.model.CheckNeedVerifyResponse;
import com.huaweicloud.sdk.osm.v2.model.CheckVerifyCodesRequest;
import com.huaweicloud.sdk.osm.v2.model.CheckVerifyCodesResponse;
import com.huaweicloud.sdk.osm.v2.model.ConfirmAuthorizationsRequest;
import com.huaweicloud.sdk.osm.v2.model.ConfirmAuthorizationsResponse;
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
import com.huaweicloud.sdk.osm.v2.model.CreateFeedbackRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateFeedbackResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateMessagesRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateMessagesResponse;
import com.huaweicloud.sdk.osm.v2.model.CreatePrivilegesRequest;
import com.huaweicloud.sdk.osm.v2.model.CreatePrivilegesResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateQaAskRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateQaAskResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateQaFeedbacksRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateQaFeedbacksResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateQuestionInSessionRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateQuestionInSessionResponse;
import com.huaweicloud.sdk.osm.v2.model.CreateRelationsRequest;
import com.huaweicloud.sdk.osm.v2.model.CreateRelationsResponse;
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
import com.huaweicloud.sdk.osm.v2.model.DownloadAccessoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.DownloadAccessoriesResponse;
import com.huaweicloud.sdk.osm.v2.model.DownloadCasesRequest;
import com.huaweicloud.sdk.osm.v2.model.DownloadCasesResponse;
import com.huaweicloud.sdk.osm.v2.model.DownloadImagesRequest;
import com.huaweicloud.sdk.osm.v2.model.DownloadImagesResponse;
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
import com.huaweicloud.sdk.osm.v2.model.RevokeMessageRequest;
import com.huaweicloud.sdk.osm.v2.model.RevokeMessageResponse;
import com.huaweicloud.sdk.osm.v2.model.SendVerifyCodesRequest;
import com.huaweicloud.sdk.osm.v2.model.SendVerifyCodesResponse;
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
import com.huaweicloud.sdk.osm.v2.model.SignPublishedAgreementRequest;
import com.huaweicloud.sdk.osm.v2.model.SignPublishedAgreementResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateAuthorizationsRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateAuthorizationsResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateCaseContactInfoRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateCaseContactInfoResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateCasesRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateCasesResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateLabelsRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateLabelsResponse;
import com.huaweicloud.sdk.osm.v2.model.UpdateNewInstantMessagesReadRequest;
import com.huaweicloud.sdk.osm.v2.model.UpdateNewInstantMessagesReadResponse;
import com.huaweicloud.sdk.osm.v2.model.UploadJsonAccessoriesRequest;
import com.huaweicloud.sdk.osm.v2.model.UploadJsonAccessoriesResponse;

public class OsmClient {

    protected HcClient hcClient;

    public OsmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OsmClient> newBuilder() {
        ClientBuilder<OsmClient> clientBuilder = new ClientBuilder<>(OsmClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 验证授权主机
     *
     * 验证授权主机密码是否正确
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHostsRequest 请求对象
     * @return CheckHostsResponse
     */
    public CheckHostsResponse checkHosts(CheckHostsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.checkHosts);
    }

    /**
     * 验证授权主机
     *
     * 验证授权主机密码是否正确
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHostsRequest 请求对象
     * @return SyncInvoker<CheckHostsRequest, CheckHostsResponse>
     */
    public SyncInvoker<CheckHostsRequest, CheckHostsResponse> checkHostsInvoker(CheckHostsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.checkHosts, hcClient);
    }

    /**
     * 是否需要验证
     *
     * 是否需要验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckNeedVerifyRequest 请求对象
     * @return CheckNeedVerifyResponse
     */
    public CheckNeedVerifyResponse checkNeedVerify(CheckNeedVerifyRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.checkNeedVerify);
    }

    /**
     * 是否需要验证
     *
     * 是否需要验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckNeedVerifyRequest 请求对象
     * @return SyncInvoker<CheckNeedVerifyRequest, CheckNeedVerifyResponse>
     */
    public SyncInvoker<CheckNeedVerifyRequest, CheckNeedVerifyResponse> checkNeedVerifyInvoker(
        CheckNeedVerifyRequest request) {
        return new SyncInvoker<>(request, OsmMeta.checkNeedVerify, hcClient);
    }

    /**
     * 验证联系方式
     *
     * 验证联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodesRequest 请求对象
     * @return CheckVerifyCodesResponse
     */
    public CheckVerifyCodesResponse checkVerifyCodes(CheckVerifyCodesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.checkVerifyCodes);
    }

    /**
     * 验证联系方式
     *
     * 验证联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodesRequest 请求对象
     * @return SyncInvoker<CheckVerifyCodesRequest, CheckVerifyCodesResponse>
     */
    public SyncInvoker<CheckVerifyCodesRequest, CheckVerifyCodesResponse> checkVerifyCodesInvoker(
        CheckVerifyCodesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.checkVerifyCodes, hcClient);
    }

    /**
     * 租户确认授权
     *
     * 租户确认授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAuthorizationsRequest 请求对象
     * @return ConfirmAuthorizationsResponse
     */
    public ConfirmAuthorizationsResponse confirmAuthorizations(ConfirmAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.confirmAuthorizations);
    }

    /**
     * 租户确认授权
     *
     * 租户确认授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAuthorizationsRequest 请求对象
     * @return SyncInvoker<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse>
     */
    public SyncInvoker<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> confirmAuthorizationsInvoker(
        ConfirmAuthorizationsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.confirmAuthorizations, hcClient);
    }

    /**
     * 语料提问
     *
     * 基于语料的一次问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAskQuestionRequest 请求对象
     * @return CreateAskQuestionResponse
     */
    public CreateAskQuestionResponse createAskQuestion(CreateAskQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createAskQuestion);
    }

    /**
     * 语料提问
     *
     * 基于语料的一次问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAskQuestionRequest 请求对象
     * @return SyncInvoker<CreateAskQuestionRequest, CreateAskQuestionResponse>
     */
    public SyncInvoker<CreateAskQuestionRequest, CreateAskQuestionResponse> createAskQuestionInvoker(
        CreateAskQuestionRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createAskQuestion, hcClient);
    }

    /**
     * 提交工单扩展参数
     *
     * 提交工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseExtendsParamRequest 请求对象
     * @return CreateCaseExtendsParamResponse
     */
    public CreateCaseExtendsParamResponse createCaseExtendsParam(CreateCaseExtendsParamRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createCaseExtendsParam);
    }

    /**
     * 提交工单扩展参数
     *
     * 提交工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseExtendsParamRequest 请求对象
     * @return SyncInvoker<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse>
     */
    public SyncInvoker<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse> createCaseExtendsParamInvoker(
        CreateCaseExtendsParamRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createCaseExtendsParam, hcClient);
    }

    /**
     * 添加工单关联标签接口
     *
     * 添加工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseLabelsRequest 请求对象
     * @return CreateCaseLabelsResponse
     */
    public CreateCaseLabelsResponse createCaseLabels(CreateCaseLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createCaseLabels);
    }

    /**
     * 添加工单关联标签接口
     *
     * 添加工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseLabelsRequest 请求对象
     * @return SyncInvoker<CreateCaseLabelsRequest, CreateCaseLabelsResponse>
     */
    public SyncInvoker<CreateCaseLabelsRequest, CreateCaseLabelsResponse> createCaseLabelsInvoker(
        CreateCaseLabelsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createCaseLabels, hcClient);
    }

    /**
     * 创建工单
     *
     * 创建工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCasesRequest 请求对象
     * @return CreateCasesResponse
     */
    public CreateCasesResponse createCases(CreateCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createCases);
    }

    /**
     * 创建工单
     *
     * 创建工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCasesRequest 请求对象
     * @return SyncInvoker<CreateCasesRequest, CreateCasesResponse>
     */
    public SyncInvoker<CreateCasesRequest, CreateCasesResponse> createCasesInvoker(CreateCasesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createCases, hcClient);
    }

    /**
     * 用户反馈是否有帮助
     *
     * 用户反馈是否有帮助
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseFeedbackRequest 请求对象
     * @return CreateDiagnoseFeedbackResponse
     */
    public CreateDiagnoseFeedbackResponse createDiagnoseFeedback(CreateDiagnoseFeedbackRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createDiagnoseFeedback);
    }

    /**
     * 用户反馈是否有帮助
     *
     * 用户反馈是否有帮助
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseFeedbackRequest 请求对象
     * @return SyncInvoker<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse>
     */
    public SyncInvoker<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse> createDiagnoseFeedbackInvoker(
        CreateDiagnoseFeedbackRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createDiagnoseFeedback, hcClient);
    }

    /**
     * 开始一键诊断
     *
     * 开始一键诊断
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseJobRequest 请求对象
     * @return CreateDiagnoseJobResponse
     */
    public CreateDiagnoseJobResponse createDiagnoseJob(CreateDiagnoseJobRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createDiagnoseJob);
    }

    /**
     * 开始一键诊断
     *
     * 开始一键诊断
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseJobRequest 请求对象
     * @return SyncInvoker<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse>
     */
    public SyncInvoker<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse> createDiagnoseJobInvoker(
        CreateDiagnoseJobRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createDiagnoseJob, hcClient);
    }

    /**
     * 问答满意度评价
     *
     * 一次问答完毕后, 针对这一次问答提交满意度评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvaluateRequest 请求对象
     * @return CreateEvaluateResponse
     */
    public CreateEvaluateResponse createEvaluate(CreateEvaluateRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createEvaluate);
    }

    /**
     * 问答满意度评价
     *
     * 一次问答完毕后, 针对这一次问答提交满意度评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvaluateRequest 请求对象
     * @return SyncInvoker<CreateEvaluateRequest, CreateEvaluateResponse>
     */
    public SyncInvoker<CreateEvaluateRequest, CreateEvaluateResponse> createEvaluateInvoker(
        CreateEvaluateRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createEvaluate, hcClient);
    }

    /**
     * 创建举报反馈
     *
     * 创建举报反馈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeedbackRequest 请求对象
     * @return CreateFeedbackResponse
     */
    public CreateFeedbackResponse createFeedback(CreateFeedbackRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createFeedback);
    }

    /**
     * 创建举报反馈
     *
     * 创建举报反馈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeedbackRequest 请求对象
     * @return SyncInvoker<CreateFeedbackRequest, CreateFeedbackResponse>
     */
    public SyncInvoker<CreateFeedbackRequest, CreateFeedbackResponse> createFeedbackInvoker(
        CreateFeedbackRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createFeedback, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelsRequest 请求对象
     * @return CreateLabelsResponse
     */
    public CreateLabelsResponse createLabels(CreateLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createLabels);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelsRequest 请求对象
     * @return SyncInvoker<CreateLabelsRequest, CreateLabelsResponse>
     */
    public SyncInvoker<CreateLabelsRequest, CreateLabelsResponse> createLabelsInvoker(CreateLabelsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createLabels, hcClient);
    }

    /**
     * 提交留言
     *
     * 提交留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessagesRequest 请求对象
     * @return CreateMessagesResponse
     */
    public CreateMessagesResponse createMessages(CreateMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createMessages);
    }

    /**
     * 提交留言
     *
     * 提交留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessagesRequest 请求对象
     * @return SyncInvoker<CreateMessagesRequest, CreateMessagesResponse>
     */
    public SyncInvoker<CreateMessagesRequest, CreateMessagesResponse> createMessagesInvoker(
        CreateMessagesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createMessages, hcClient);
    }

    /**
     * 创建授权
     *
     * 创建授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivilegesRequest 请求对象
     * @return CreatePrivilegesResponse
     */
    public CreatePrivilegesResponse createPrivileges(CreatePrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createPrivileges);
    }

    /**
     * 创建授权
     *
     * 创建授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivilegesRequest 请求对象
     * @return SyncInvoker<CreatePrivilegesRequest, CreatePrivilegesResponse>
     */
    public SyncInvoker<CreatePrivilegesRequest, CreatePrivilegesResponse> createPrivilegesInvoker(
        CreatePrivilegesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createPrivileges, hcClient);
    }

    /**
     * 新问答接口
     *
     * 支持多轮流程问答接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaAskRequest 请求对象
     * @return CreateQaAskResponse
     */
    public CreateQaAskResponse createQaAsk(CreateQaAskRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createQaAsk);
    }

    /**
     * 新问答接口
     *
     * 支持多轮流程问答接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaAskRequest 请求对象
     * @return SyncInvoker<CreateQaAskRequest, CreateQaAskResponse>
     */
    public SyncInvoker<CreateQaAskRequest, CreateQaAskResponse> createQaAskInvoker(CreateQaAskRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createQaAsk, hcClient);
    }

    /**
     * 反馈评价
     *
     * 提交/取消反馈评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaFeedbacksRequest 请求对象
     * @return CreateQaFeedbacksResponse
     */
    public CreateQaFeedbacksResponse createQaFeedbacks(CreateQaFeedbacksRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createQaFeedbacks);
    }

    /**
     * 反馈评价
     *
     * 提交/取消反馈评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaFeedbacksRequest 请求对象
     * @return SyncInvoker<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse>
     */
    public SyncInvoker<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse> createQaFeedbacksInvoker(
        CreateQaFeedbacksRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createQaFeedbacks, hcClient);
    }

    /**
     * 提问（在制定的会话中）
     *
     * 提问（在制定的会话中）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuestionInSessionRequest 请求对象
     * @return CreateQuestionInSessionResponse
     */
    public CreateQuestionInSessionResponse createQuestionInSession(CreateQuestionInSessionRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createQuestionInSession);
    }

    /**
     * 提问（在制定的会话中）
     *
     * 提问（在制定的会话中）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuestionInSessionRequest 请求对象
     * @return SyncInvoker<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse>
     */
    public SyncInvoker<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse> createQuestionInSessionInvoker(
        CreateQuestionInSessionRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createQuestionInSession, hcClient);
    }

    /**
     * 创建关联
     *
     * 创建关联，一个工单最多支持3个关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsRequest 请求对象
     * @return CreateRelationsResponse
     */
    public CreateRelationsResponse createRelations(CreateRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createRelations);
    }

    /**
     * 创建关联
     *
     * 创建关联，一个工单最多支持3个关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsRequest 请求对象
     * @return SyncInvoker<CreateRelationsRequest, CreateRelationsResponse>
     */
    public SyncInvoker<CreateRelationsRequest, CreateRelationsResponse> createRelationsInvoker(
        CreateRelationsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createRelations, hcClient);
    }

    /**
     * 提交评分
     *
     * 提交评分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScoresRequest 请求对象
     * @return CreateScoresResponse
     */
    public CreateScoresResponse createScores(CreateScoresRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createScores);
    }

    /**
     * 提交评分
     *
     * 提交评分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScoresRequest 请求对象
     * @return SyncInvoker<CreateScoresRequest, CreateScoresResponse>
     */
    public SyncInvoker<CreateScoresRequest, CreateScoresResponse> createScoresInvoker(CreateScoresRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createScores, hcClient);
    }

    /**
     * 创建问答会话
     *
     * 用于创建问答会话, 创建会话后可开始问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSessionRequest 请求对象
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSession(CreateSessionRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createSession);
    }

    /**
     * 创建问答会话
     *
     * 用于创建问答会话, 创建会话后可开始问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSessionRequest 请求对象
     * @return SyncInvoker<CreateSessionRequest, CreateSessionResponse>
     */
    public SyncInvoker<CreateSessionRequest, CreateSessionResponse> createSessionInvoker(CreateSessionRequest request) {
        return new SyncInvoker<>(request, OsmMeta.createSession, hcClient);
    }

    /**
     * 删除附件
     *
     * 删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessoriesRequest 请求对象
     * @return DeleteAccessoriesResponse
     */
    public DeleteAccessoriesResponse deleteAccessories(DeleteAccessoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteAccessories);
    }

    /**
     * 删除附件
     *
     * 删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessoriesRequest 请求对象
     * @return SyncInvoker<DeleteAccessoriesRequest, DeleteAccessoriesResponse>
     */
    public SyncInvoker<DeleteAccessoriesRequest, DeleteAccessoriesResponse> deleteAccessoriesInvoker(
        DeleteAccessoriesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.deleteAccessories, hcClient);
    }

    /**
     * 删除工单关联标签接口
     *
     * 删除指定工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaseLabelsRequest 请求对象
     * @return DeleteCaseLabelsResponse
     */
    public DeleteCaseLabelsResponse deleteCaseLabels(DeleteCaseLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteCaseLabels);
    }

    /**
     * 删除工单关联标签接口
     *
     * 删除指定工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaseLabelsRequest 请求对象
     * @return SyncInvoker<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse>
     */
    public SyncInvoker<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> deleteCaseLabelsInvoker(
        DeleteCaseLabelsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.deleteCaseLabels, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签，同时会删除工单与标签关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelsRequest 请求对象
     * @return DeleteLabelsResponse
     */
    public DeleteLabelsResponse deleteLabels(DeleteLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteLabels);
    }

    /**
     * 删除标签
     *
     * 删除标签，同时会删除工单与标签关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelsRequest 请求对象
     * @return SyncInvoker<DeleteLabelsRequest, DeleteLabelsResponse>
     */
    public SyncInvoker<DeleteLabelsRequest, DeleteLabelsResponse> deleteLabelsInvoker(DeleteLabelsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.deleteLabels, hcClient);
    }

    /**
     * 删除关联
     *
     * 删除关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationRequest 请求对象
     * @return DeleteRelationResponse
     */
    public DeleteRelationResponse deleteRelation(DeleteRelationRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteRelation);
    }

    /**
     * 删除关联
     *
     * 删除关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationRequest 请求对象
     * @return SyncInvoker<DeleteRelationRequest, DeleteRelationResponse>
     */
    public SyncInvoker<DeleteRelationRequest, DeleteRelationResponse> deleteRelationInvoker(
        DeleteRelationRequest request) {
        return new SyncInvoker<>(request, OsmMeta.deleteRelation, hcClient);
    }

    /**
     * 下载附件
     *
     * 下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAccessoriesRequest 请求对象
     * @return DownloadAccessoriesResponse
     */
    public DownloadAccessoriesResponse downloadAccessories(DownloadAccessoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.downloadAccessories);
    }

    /**
     * 下载附件
     *
     * 下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAccessoriesRequest 请求对象
     * @return SyncInvoker<DownloadAccessoriesRequest, DownloadAccessoriesResponse>
     */
    public SyncInvoker<DownloadAccessoriesRequest, DownloadAccessoriesResponse> downloadAccessoriesInvoker(
        DownloadAccessoriesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.downloadAccessories, hcClient);
    }

    /**
     * 工单导出
     *
     * 工单导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCasesRequest 请求对象
     * @return DownloadCasesResponse
     */
    public DownloadCasesResponse downloadCases(DownloadCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.downloadCases);
    }

    /**
     * 工单导出
     *
     * 工单导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCasesRequest 请求对象
     * @return SyncInvoker<DownloadCasesRequest, DownloadCasesResponse>
     */
    public SyncInvoker<DownloadCasesRequest, DownloadCasesResponse> downloadCasesInvoker(DownloadCasesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.downloadCases, hcClient);
    }

    /**
     * 图片展示
     *
     * 返回图片内容，用于页面直接展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImagesRequest 请求对象
     * @return DownloadImagesResponse
     */
    public DownloadImagesResponse downloadImages(DownloadImagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.downloadImages);
    }

    /**
     * 图片展示
     *
     * 返回图片内容，用于页面直接展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImagesRequest 请求对象
     * @return SyncInvoker<DownloadImagesRequest, DownloadImagesResponse>
     */
    public SyncInvoker<DownloadImagesRequest, DownloadImagesResponse> downloadImagesInvoker(
        DownloadImagesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.downloadImages, hcClient);
    }

    /**
     * 租户批量获取下载链接
     *
     * 租户批量获取下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessoryAccessUrlsRequest 请求对象
     * @return ListAccessoryAccessUrlsResponse
     */
    public ListAccessoryAccessUrlsResponse listAccessoryAccessUrls(ListAccessoryAccessUrlsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listAccessoryAccessUrls);
    }

    /**
     * 租户批量获取下载链接
     *
     * 租户批量获取下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessoryAccessUrlsRequest 请求对象
     * @return SyncInvoker<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse>
     */
    public SyncInvoker<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> listAccessoryAccessUrlsInvoker(
        ListAccessoryAccessUrlsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listAccessoryAccessUrls, hcClient);
    }

    /**
     * 查询委托
     *
     * 查询委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listAgencies);
    }

    /**
     * 查询委托
     *
     * 查询委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listAgencies, hcClient);
    }

    /**
     * 查询国家码
     *
     * 查询国家码，用于提交工单页面填写联系方式使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaCodesRequest 请求对象
     * @return ListAreaCodesResponse
     */
    public ListAreaCodesResponse listAreaCodes(ListAreaCodesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listAreaCodes);
    }

    /**
     * 查询国家码
     *
     * 查询国家码，用于提交工单页面填写联系方式使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaCodesRequest 请求对象
     * @return SyncInvoker<ListAreaCodesRequest, ListAreaCodesResponse>
     */
    public SyncInvoker<ListAreaCodesRequest, ListAreaCodesResponse> listAreaCodesInvoker(ListAreaCodesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listAreaCodes, hcClient);
    }

    /**
     * 查询案例
     *
     * 查询满足指定条件的案例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArticlesRequest 请求对象
     * @return ListArticlesResponse
     */
    public ListArticlesResponse listArticles(ListArticlesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listArticles);
    }

    /**
     * 查询案例
     *
     * 查询满足指定条件的案例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArticlesRequest 请求对象
     * @return SyncInvoker<ListArticlesRequest, ListArticlesResponse>
     */
    public SyncInvoker<ListArticlesRequest, ListArticlesResponse> listArticlesInvoker(ListArticlesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listArticles, hcClient);
    }

    /**
     * 查看授权列表
     *
     * 查询授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationsRequest 请求对象
     * @return ListAuthorizationsResponse
     */
    public ListAuthorizationsResponse listAuthorizations(ListAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listAuthorizations);
    }

    /**
     * 查看授权列表
     *
     * 查询授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>
     */
    public SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizationsInvoker(
        ListAuthorizationsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listAuthorizations, hcClient);
    }

    /**
     * 查询工单类目列表
     *
     * 查询工单类目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCategoriesRequest 请求对象
     * @return ListCaseCategoriesResponse
     */
    public ListCaseCategoriesResponse listCaseCategories(ListCaseCategoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseCategories);
    }

    /**
     * 查询工单类目列表
     *
     * 查询工单类目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCategoriesRequest 请求对象
     * @return SyncInvoker<ListCaseCategoriesRequest, ListCaseCategoriesResponse>
     */
    public SyncInvoker<ListCaseCategoriesRequest, ListCaseCategoriesResponse> listCaseCategoriesInvoker(
        ListCaseCategoriesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseCategories, hcClient);
    }

    /**
     * 查询工单抄送邮箱
     *
     * 查询工单抄送邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCcEmailsRequest 请求对象
     * @return ListCaseCcEmailsResponse
     */
    public ListCaseCcEmailsResponse listCaseCcEmails(ListCaseCcEmailsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseCcEmails);
    }

    /**
     * 查询工单抄送邮箱
     *
     * 查询工单抄送邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCcEmailsRequest 请求对象
     * @return SyncInvoker<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse>
     */
    public SyncInvoker<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> listCaseCcEmailsInvoker(
        ListCaseCcEmailsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseCcEmails, hcClient);
    }

    /**
     * 统计各状态工单数量
     *
     * 统计各状态工单数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCountsRequest 请求对象
     * @return ListCaseCountsResponse
     */
    public ListCaseCountsResponse listCaseCounts(ListCaseCountsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseCounts);
    }

    /**
     * 统计各状态工单数量
     *
     * 统计各状态工单数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCountsRequest 请求对象
     * @return SyncInvoker<ListCaseCountsRequest, ListCaseCountsResponse>
     */
    public SyncInvoker<ListCaseCountsRequest, ListCaseCountsResponse> listCaseCountsInvoker(
        ListCaseCountsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseCounts, hcClient);
    }

    /**
     * 查询工单关联标签接口
     *
     * 查询工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLabelsRequest 请求对象
     * @return ListCaseLabelsResponse
     */
    public ListCaseLabelsResponse listCaseLabels(ListCaseLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseLabels);
    }

    /**
     * 查询工单关联标签接口
     *
     * 查询工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLabelsRequest 请求对象
     * @return SyncInvoker<ListCaseLabelsRequest, ListCaseLabelsResponse>
     */
    public SyncInvoker<ListCaseLabelsRequest, ListCaseLabelsResponse> listCaseLabelsInvoker(
        ListCaseLabelsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseLabels, hcClient);
    }

    /**
     * 查询工单限制，比如抄送邮箱个数等
     *
     * 查询工单限制，比如抄送邮箱个数等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLimitsRequest 请求对象
     * @return ListCaseLimitsResponse
     */
    public ListCaseLimitsResponse listCaseLimits(ListCaseLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseLimits);
    }

    /**
     * 查询工单限制，比如抄送邮箱个数等
     *
     * 查询工单限制，比如抄送邮箱个数等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLimitsRequest 请求对象
     * @return SyncInvoker<ListCaseLimitsRequest, ListCaseLimitsResponse>
     */
    public SyncInvoker<ListCaseLimitsRequest, ListCaseLimitsResponse> listCaseLimitsInvoker(
        ListCaseLimitsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseLimits, hcClient);
    }

    /**
     * 查询工单操作日志
     *
     * 查询工单操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseOperateLogsRequest 请求对象
     * @return ListCaseOperateLogsResponse
     */
    public ListCaseOperateLogsResponse listCaseOperateLogs(ListCaseOperateLogsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseOperateLogs);
    }

    /**
     * 查询工单操作日志
     *
     * 查询工单操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseOperateLogsRequest 请求对象
     * @return SyncInvoker<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse>
     */
    public SyncInvoker<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> listCaseOperateLogsInvoker(
        ListCaseOperateLogsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseOperateLogs, hcClient);
    }

    /**
     * 查询工单配额
     *
     * 查询工单配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseQuotasRequest 请求对象
     * @return ListCaseQuotasResponse
     */
    public ListCaseQuotasResponse listCaseQuotas(ListCaseQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseQuotas);
    }

    /**
     * 查询工单配额
     *
     * 查询工单配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseQuotasRequest 请求对象
     * @return SyncInvoker<ListCaseQuotasRequest, ListCaseQuotasResponse>
     */
    public SyncInvoker<ListCaseQuotasRequest, ListCaseQuotasResponse> listCaseQuotasInvoker(
        ListCaseQuotasRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseQuotas, hcClient);
    }

    /**
     * 查询问题类型对应模板
     *
     * 查询问题类型对应模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseTemplatesRequest 请求对象
     * @return ListCaseTemplatesResponse
     */
    public ListCaseTemplatesResponse listCaseTemplates(ListCaseTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseTemplates);
    }

    /**
     * 查询问题类型对应模板
     *
     * 查询问题类型对应模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseTemplatesRequest 请求对象
     * @return SyncInvoker<ListCaseTemplatesRequest, ListCaseTemplatesResponse>
     */
    public SyncInvoker<ListCaseTemplatesRequest, ListCaseTemplatesResponse> listCaseTemplatesInvoker(
        ListCaseTemplatesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCaseTemplates, hcClient);
    }

    /**
     * 查询工单列表接口
     *
     * 查询工单列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesRequest 请求对象
     * @return ListCasesResponse
     */
    public ListCasesResponse listCases(ListCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCases);
    }

    /**
     * 查询工单列表接口
     *
     * 查询工单列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesRequest 请求对象
     * @return SyncInvoker<ListCasesRequest, ListCasesResponse>
     */
    public SyncInvoker<ListCasesRequest, ListCasesResponse> listCasesInvoker(ListCasesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCases, hcClient);
    }

    /**
     * 查询用户关联的region
     *
     * 查询用户关联的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomersRegionsRequest 请求对象
     * @return ListCustomersRegionsResponse
     */
    public ListCustomersRegionsResponse listCustomersRegions(ListCustomersRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCustomersRegions);
    }

    /**
     * 查询用户关联的region
     *
     * 查询用户关联的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomersRegionsRequest 请求对象
     * @return SyncInvoker<ListCustomersRegionsRequest, ListCustomersRegionsResponse>
     */
    public SyncInvoker<ListCustomersRegionsRequest, ListCustomersRegionsResponse> listCustomersRegionsInvoker(
        ListCustomersRegionsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listCustomersRegions, hcClient);
    }

    /**
     * 根据itemIds查询指定的诊断检查项执行结果
     *
     * 根据itemIds查询指定的诊断检查项执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseItemsRequest 请求对象
     * @return ListDiagnoseItemsResponse
     */
    public ListDiagnoseItemsResponse listDiagnoseItems(ListDiagnoseItemsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listDiagnoseItems);
    }

    /**
     * 根据itemIds查询指定的诊断检查项执行结果
     *
     * 根据itemIds查询指定的诊断检查项执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseItemsRequest 请求对象
     * @return SyncInvoker<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse>
     */
    public SyncInvoker<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse> listDiagnoseItemsInvoker(
        ListDiagnoseItemsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listDiagnoseItems, hcClient);
    }

    /**
     * 查询诊断任务执行结果
     *
     * 查询诊断任务执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseJobRequest 请求对象
     * @return ListDiagnoseJobResponse
     */
    public ListDiagnoseJobResponse listDiagnoseJob(ListDiagnoseJobRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listDiagnoseJob);
    }

    /**
     * 查询诊断任务执行结果
     *
     * 查询诊断任务执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseJobRequest 请求对象
     * @return SyncInvoker<ListDiagnoseJobRequest, ListDiagnoseJobResponse>
     */
    public SyncInvoker<ListDiagnoseJobRequest, ListDiagnoseJobResponse> listDiagnoseJobInvoker(
        ListDiagnoseJobRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listDiagnoseJob, hcClient);
    }

    /**
     * 查询诊断历史记录列表
     *
     * 查询诊断历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseRecordsRequest 请求对象
     * @return ListDiagnoseRecordsResponse
     */
    public ListDiagnoseRecordsResponse listDiagnoseRecords(ListDiagnoseRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listDiagnoseRecords);
    }

    /**
     * 查询诊断历史记录列表
     *
     * 查询诊断历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseRecordsRequest 请求对象
     * @return SyncInvoker<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse>
     */
    public SyncInvoker<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse> listDiagnoseRecordsInvoker(
        ListDiagnoseRecordsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listDiagnoseRecords, hcClient);
    }

    /**
     * 获取资源信息
     *
     * 获取资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseResourcesRequest 请求对象
     * @return ListDiagnoseResourcesResponse
     */
    public ListDiagnoseResourcesResponse listDiagnoseResources(ListDiagnoseResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listDiagnoseResources);
    }

    /**
     * 获取资源信息
     *
     * 获取资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseResourcesRequest 请求对象
     * @return SyncInvoker<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse>
     */
    public SyncInvoker<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse> listDiagnoseResourcesInvoker(
        ListDiagnoseResourcesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listDiagnoseResources, hcClient);
    }

    /**
     * 查询附加参数
     *
     * 提单时，根据不同的产品或者问题类型，会存在不同的一些附加参数填写
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendsParamsRequest 请求对象
     * @return ListExtendsParamsResponse
     */
    public ListExtendsParamsResponse listExtendsParams(ListExtendsParamsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listExtendsParams);
    }

    /**
     * 查询附加参数
     *
     * 提单时，根据不同的产品或者问题类型，会存在不同的一些附加参数填写
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendsParamsRequest 请求对象
     * @return SyncInvoker<ListExtendsParamsRequest, ListExtendsParamsResponse>
     */
    public SyncInvoker<ListExtendsParamsRequest, ListExtendsParamsResponse> listExtendsParamsInvoker(
        ListExtendsParamsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listExtendsParams, hcClient);
    }

    /**
     * 查询反馈选项
     *
     * 查询符合条件的反馈选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeedbackOptionRequest 请求对象
     * @return ListFeedbackOptionResponse
     */
    public ListFeedbackOptionResponse listFeedbackOption(ListFeedbackOptionRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listFeedbackOption);
    }

    /**
     * 查询反馈选项
     *
     * 查询符合条件的反馈选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeedbackOptionRequest 请求对象
     * @return SyncInvoker<ListFeedbackOptionRequest, ListFeedbackOptionResponse>
     */
    public SyncInvoker<ListFeedbackOptionRequest, ListFeedbackOptionResponse> listFeedbackOptionInvoker(
        ListFeedbackOptionRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listFeedbackOption, hcClient);
    }

    /**
     * 查询已验证的列表
     *
     * 查询已验证的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHasVerifiedContactsRequest 请求对象
     * @return ListHasVerifiedContactsResponse
     */
    public ListHasVerifiedContactsResponse listHasVerifiedContacts(ListHasVerifiedContactsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHasVerifiedContacts);
    }

    /**
     * 查询已验证的列表
     *
     * 查询已验证的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHasVerifiedContactsRequest 请求对象
     * @return SyncInvoker<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse>
     */
    public SyncInvoker<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> listHasVerifiedContactsInvoker(
        ListHasVerifiedContactsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listHasVerifiedContacts, hcClient);
    }

    /**
     * 查询堡垒机历史操作记录
     *
     * 查询堡垒机历史操作记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperateLogsRequest 请求对象
     * @return ListHistoryOperateLogsResponse
     */
    public ListHistoryOperateLogsResponse listHistoryOperateLogs(ListHistoryOperateLogsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHistoryOperateLogs);
    }

    /**
     * 查询堡垒机历史操作记录
     *
     * 查询堡垒机历史操作记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperateLogsRequest 请求对象
     * @return SyncInvoker<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse>
     */
    public SyncInvoker<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> listHistoryOperateLogsInvoker(
        ListHistoryOperateLogsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listHistoryOperateLogs, hcClient);
    }

    /**
     * 查询堡垒机历史会话列表
     *
     * 查询堡垒机历史会话列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistorySessionsRequest 请求对象
     * @return ListHistorySessionsResponse
     */
    public ListHistorySessionsResponse listHistorySessions(ListHistorySessionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHistorySessions);
    }

    /**
     * 查询堡垒机历史会话列表
     *
     * 查询堡垒机历史会话列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistorySessionsRequest 请求对象
     * @return SyncInvoker<ListHistorySessionsRequest, ListHistorySessionsResponse>
     */
    public SyncInvoker<ListHistorySessionsRequest, ListHistorySessionsResponse> listHistorySessionsInvoker(
        ListHistorySessionsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listHistorySessions, hcClient);
    }

    /**
     * 查询标签
     *
     * 查询标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsRequest 请求对象
     * @return ListLabelsResponse
     */
    public ListLabelsResponse listLabels(ListLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listLabels);
    }

    /**
     * 查询标签
     *
     * 查询标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsRequest 请求对象
     * @return SyncInvoker<ListLabelsRequest, ListLabelsResponse>
     */
    public SyncInvoker<ListLabelsRequest, ListLabelsResponse> listLabelsInvoker(ListLabelsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listLabels, hcClient);
    }

    /**
     * 查询留言
     *
     * 查询留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessages(ListMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listMessages);
    }

    /**
     * 查询留言
     *
     * 查询留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return SyncInvoker<ListMessagesRequest, ListMessagesResponse>
     */
    public SyncInvoker<ListMessagesRequest, ListMessagesResponse> listMessagesInvoker(ListMessagesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listMessages, hcClient);
    }

    /**
     * 查询更多留言
     *
     * 查询更多留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMoreInstantMessagesRequest 请求对象
     * @return ListMoreInstantMessagesResponse
     */
    public ListMoreInstantMessagesResponse listMoreInstantMessages(ListMoreInstantMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listMoreInstantMessages);
    }

    /**
     * 查询更多留言
     *
     * 查询更多留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMoreInstantMessagesRequest 请求对象
     * @return SyncInvoker<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse>
     */
    public SyncInvoker<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> listMoreInstantMessagesInvoker(
        ListMoreInstantMessagesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listMoreInstantMessages, hcClient);
    }

    /**
     * 轮询查询即时消息
     *
     * 轮询查询即时消息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewInstantMessagesRequest 请求对象
     * @return ListNewInstantMessagesResponse
     */
    public ListNewInstantMessagesResponse listNewInstantMessages(ListNewInstantMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listNewInstantMessages);
    }

    /**
     * 轮询查询即时消息
     *
     * 轮询查询即时消息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewInstantMessagesRequest 请求对象
     * @return SyncInvoker<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse>
     */
    public SyncInvoker<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> listNewInstantMessagesInvoker(
        ListNewInstantMessagesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listNewInstantMessages, hcClient);
    }

    /**
     * 查询公告
     *
     * 查询满足指定条件的公告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticesRequest 请求对象
     * @return ListNoticesResponse
     */
    public ListNoticesResponse listNotices(ListNoticesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listNotices);
    }

    /**
     * 查询公告
     *
     * 查询满足指定条件的公告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticesRequest 请求对象
     * @return SyncInvoker<ListNoticesRequest, ListNoticesResponse>
     */
    public SyncInvoker<ListNoticesRequest, ListNoticesResponse> listNoticesInvoker(ListNoticesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listNotices, hcClient);
    }

    /**
     * 工单列表
     *
     * 工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrderIncidentRequest 请求对象
     * @return ListOrderIncidentResponse
     */
    public ListOrderIncidentResponse listOrderIncident(ListOrderIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listOrderIncident);
    }

    /**
     * 工单列表
     *
     * 工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrderIncidentRequest 请求对象
     * @return SyncInvoker<ListOrderIncidentRequest, ListOrderIncidentResponse>
     */
    public SyncInvoker<ListOrderIncidentRequest, ListOrderIncidentResponse> listOrderIncidentInvoker(
        ListOrderIncidentRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listOrderIncident, hcClient);
    }

    /**
     * 查询工单权限
     *
     * 查询工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivilegesRequest 请求对象
     * @return ListPrivilegesResponse
     */
    public ListPrivilegesResponse listPrivileges(ListPrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listPrivileges);
    }

    /**
     * 查询工单权限
     *
     * 查询工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivilegesRequest 请求对象
     * @return SyncInvoker<ListPrivilegesRequest, ListPrivilegesResponse>
     */
    public SyncInvoker<ListPrivilegesRequest, ListPrivilegesResponse> listPrivilegesInvoker(
        ListPrivilegesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listPrivileges, hcClient);
    }

    /**
     * 查询问题类型列表
     *
     * 提交工单时，选择产品类型之后选择对应的问题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProblemTypesRequest 请求对象
     * @return ListProblemTypesResponse
     */
    public ListProblemTypesResponse listProblemTypes(ListProblemTypesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listProblemTypes);
    }

    /**
     * 查询问题类型列表
     *
     * 提交工单时，选择产品类型之后选择对应的问题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProblemTypesRequest 请求对象
     * @return SyncInvoker<ListProblemTypesRequest, ListProblemTypesResponse>
     */
    public SyncInvoker<ListProblemTypesRequest, ListProblemTypesResponse> listProblemTypesInvoker(
        ListProblemTypesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listProblemTypes, hcClient);
    }

    /**
     * 查询产品类型列表
     *
     * 查询产品类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductCategoriesRequest 请求对象
     * @return ListProductCategoriesResponse
     */
    public ListProductCategoriesResponse listProductCategories(ListProductCategoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listProductCategories);
    }

    /**
     * 查询产品类型列表
     *
     * 查询产品类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductCategoriesRequest 请求对象
     * @return SyncInvoker<ListProductCategoriesRequest, ListProductCategoriesResponse>
     */
    public SyncInvoker<ListProductCategoriesRequest, ListProductCategoriesResponse> listProductCategoriesInvoker(
        ListProductCategoriesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listProductCategories, hcClient);
    }

    /**
     * 查询推荐热词
     *
     * 查询指定条件的推荐热词
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendWordsRequest 请求对象
     * @return ListRecommendWordsResponse
     */
    public ListRecommendWordsResponse listRecommendWords(ListRecommendWordsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listRecommendWords);
    }

    /**
     * 查询推荐热词
     *
     * 查询指定条件的推荐热词
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendWordsRequest 请求对象
     * @return SyncInvoker<ListRecommendWordsRequest, ListRecommendWordsResponse>
     */
    public SyncInvoker<ListRecommendWordsRequest, ListRecommendWordsResponse> listRecommendWordsInvoker(
        ListRecommendWordsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listRecommendWords, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listRegions);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listRegions, hcClient);
    }

    /**
     * 查询关联工单
     *
     * 查询工单的关联，返回关联工单的简要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationRequest 请求对象
     * @return ListRelationResponse
     */
    public ListRelationResponse listRelation(ListRelationRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listRelation);
    }

    /**
     * 查询关联工单
     *
     * 查询工单的关联，返回关联工单的简要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationRequest 请求对象
     * @return SyncInvoker<ListRelationRequest, ListRelationResponse>
     */
    public SyncInvoker<ListRelationRequest, ListRelationResponse> listRelationInvoker(ListRelationRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listRelation, hcClient);
    }

    /**
     * 工单满意度分类列表
     *
     * 工单满意度分类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSatisfactionDimensionsRequest 请求对象
     * @return ListSatisfactionDimensionsResponse
     */
    public ListSatisfactionDimensionsResponse listSatisfactionDimensions(ListSatisfactionDimensionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listSatisfactionDimensions);
    }

    /**
     * 工单满意度分类列表
     *
     * 工单满意度分类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSatisfactionDimensionsRequest 请求对象
     * @return SyncInvoker<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse>
     */
    public SyncInvoker<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> listSatisfactionDimensionsInvoker(
        ListSatisfactionDimensionsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listSatisfactionDimensions, hcClient);
    }

    /**
     * 查询问题严重性列表
     *
     * 查询问题严重性列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSeveritiesRequest 请求对象
     * @return ListSeveritiesResponse
     */
    public ListSeveritiesResponse listSeverities(ListSeveritiesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listSeverities);
    }

    /**
     * 查询问题严重性列表
     *
     * 查询问题严重性列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSeveritiesRequest 请求对象
     * @return SyncInvoker<ListSeveritiesRequest, ListSeveritiesResponse>
     */
    public SyncInvoker<ListSeveritiesRequest, ListSeveritiesResponse> listSeveritiesInvoker(
        ListSeveritiesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listSeverities, hcClient);
    }

    /**
     * 查询子用户信息
     *
     * 查询子用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubCustomersRequest 请求对象
     * @return ListSubCustomersResponse
     */
    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listSubCustomers);
    }

    /**
     * 查询子用户信息
     *
     * 查询子用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubCustomersRequest 请求对象
     * @return SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>
     */
    public SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomersInvoker(
        ListSubCustomersRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listSubCustomers, hcClient);
    }

    /**
     * 查询工具
     *
     * 查询满足指定条件的工具列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListToolsRequest 请求对象
     * @return ListToolsResponse
     */
    public ListToolsResponse listTools(ListToolsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listTools);
    }

    /**
     * 查询工具
     *
     * 查询满足指定条件的工具列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListToolsRequest 请求对象
     * @return SyncInvoker<ListToolsRequest, ListToolsResponse>
     */
    public SyncInvoker<ListToolsRequest, ListToolsResponse> listToolsInvoker(ListToolsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listTools, hcClient);
    }

    /**
     * 查询堡垒机文件传输记录
     *
     * 查询堡垒机文件传输记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransportHistoriesRequest 请求对象
     * @return ListTransportHistoriesResponse
     */
    public ListTransportHistoriesResponse listTransportHistories(ListTransportHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listTransportHistories);
    }

    /**
     * 查询堡垒机文件传输记录
     *
     * 查询堡垒机文件传输记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransportHistoriesRequest 请求对象
     * @return SyncInvoker<ListTransportHistoriesRequest, ListTransportHistoriesResponse>
     */
    public SyncInvoker<ListTransportHistoriesRequest, ListTransportHistoriesResponse> listTransportHistoriesInvoker(
        ListTransportHistoriesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listTransportHistories, hcClient);
    }

    /**
     * 查询未读消息
     *
     * 查询未读消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnreadNewInstantMessagesRequest 请求对象
     * @return ListUnreadNewInstantMessagesResponse
     */
    public ListUnreadNewInstantMessagesResponse listUnreadNewInstantMessages(
        ListUnreadNewInstantMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listUnreadNewInstantMessages);
    }

    /**
     * 查询未读消息
     *
     * 查询未读消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnreadNewInstantMessagesRequest 请求对象
     * @return SyncInvoker<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse>
     */
    public SyncInvoker<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessagesInvoker(
        ListUnreadNewInstantMessagesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.listUnreadNewInstantMessages, hcClient);
    }

    /**
     * 撤回留言
     *
     * 撤回留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeMessageRequest 请求对象
     * @return RevokeMessageResponse
     */
    public RevokeMessageResponse revokeMessage(RevokeMessageRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.revokeMessage);
    }

    /**
     * 撤回留言
     *
     * 撤回留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeMessageRequest 请求对象
     * @return SyncInvoker<RevokeMessageRequest, RevokeMessageResponse>
     */
    public SyncInvoker<RevokeMessageRequest, RevokeMessageResponse> revokeMessageInvoker(RevokeMessageRequest request) {
        return new SyncInvoker<>(request, OsmMeta.revokeMessage, hcClient);
    }

    /**
     * 获取验证码
     *
     * 获取验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVerifyCodesRequest 请求对象
     * @return SendVerifyCodesResponse
     */
    public SendVerifyCodesResponse sendVerifyCodes(SendVerifyCodesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.sendVerifyCodes);
    }

    /**
     * 获取验证码
     *
     * 获取验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVerifyCodesRequest 请求对象
     * @return SyncInvoker<SendVerifyCodesRequest, SendVerifyCodesResponse>
     */
    public SyncInvoker<SendVerifyCodesRequest, SendVerifyCodesResponse> sendVerifyCodesInvoker(
        SendVerifyCodesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.sendVerifyCodes, hcClient);
    }

    /**
     * 附件限制
     *
     * 查询附件的一下限制，比如大小，数量，文件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessoryLimitsRequest 请求对象
     * @return ShowAccessoryLimitsResponse
     */
    public ShowAccessoryLimitsResponse showAccessoryLimits(ShowAccessoryLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showAccessoryLimits);
    }

    /**
     * 附件限制
     *
     * 查询附件的一下限制，比如大小，数量，文件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessoryLimitsRequest 请求对象
     * @return SyncInvoker<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse>
     */
    public SyncInvoker<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> showAccessoryLimitsInvoker(
        ShowAccessoryLimitsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showAccessoryLimits, hcClient);
    }

    /**
     * 查询联想问题
     *
     * 根据当前输入, 联想相关的问题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedQuestionsRequest 请求对象
     * @return ShowAssociatedQuestionsResponse
     */
    public ShowAssociatedQuestionsResponse showAssociatedQuestions(ShowAssociatedQuestionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showAssociatedQuestions);
    }

    /**
     * 查询联想问题
     *
     * 根据当前输入, 联想相关的问题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedQuestionsRequest 请求对象
     * @return SyncInvoker<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse>
     */
    public SyncInvoker<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse> showAssociatedQuestionsInvoker(
        ShowAssociatedQuestionsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showAssociatedQuestions, hcClient);
    }

    /**
     * 查询授权详情
     *
     * 查询授权详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizationDetailRequest 请求对象
     * @return ShowAuthorizationDetailResponse
     */
    public ShowAuthorizationDetailResponse showAuthorizationDetail(ShowAuthorizationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showAuthorizationDetail);
    }

    /**
     * 查询授权详情
     *
     * 查询授权详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizationDetailRequest 请求对象
     * @return SyncInvoker<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse>
     */
    public SyncInvoker<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> showAuthorizationDetailInvoker(
        ShowAuthorizationDetailRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showAuthorizationDetail, hcClient);
    }

    /**
     * 查询工单详情
     *
     * 查询工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseDetailRequest 请求对象
     * @return ShowCaseDetailResponse
     */
    public ShowCaseDetailResponse showCaseDetail(ShowCaseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showCaseDetail);
    }

    /**
     * 查询工单详情
     *
     * 查询工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseDetailRequest 请求对象
     * @return SyncInvoker<ShowCaseDetailRequest, ShowCaseDetailResponse>
     */
    public SyncInvoker<ShowCaseDetailRequest, ShowCaseDetailResponse> showCaseDetailInvoker(
        ShowCaseDetailRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showCaseDetail, hcClient);
    }

    /**
     * 查询工单扩展参数
     *
     * 查询工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseExtendsParamRequest 请求对象
     * @return ShowCaseExtendsParamResponse
     */
    public ShowCaseExtendsParamResponse showCaseExtendsParam(ShowCaseExtendsParamRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showCaseExtendsParam);
    }

    /**
     * 查询工单扩展参数
     *
     * 查询工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseExtendsParamRequest 请求对象
     * @return SyncInvoker<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse>
     */
    public SyncInvoker<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse> showCaseExtendsParamInvoker(
        ShowCaseExtendsParamRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showCaseExtendsParam, hcClient);
    }

    /**
     * 查询某个工单状态
     *
     * 查询某个工单状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseStatusRequest 请求对象
     * @return ShowCaseStatusResponse
     */
    public ShowCaseStatusResponse showCaseStatus(ShowCaseStatusRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showCaseStatus);
    }

    /**
     * 查询某个工单状态
     *
     * 查询某个工单状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseStatusRequest 请求对象
     * @return SyncInvoker<ShowCaseStatusRequest, ShowCaseStatusResponse>
     */
    public SyncInvoker<ShowCaseStatusRequest, ShowCaseStatusResponse> showCaseStatusInvoker(
        ShowCaseStatusRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showCaseStatus, hcClient);
    }

    /**
     * 查询配置
     *
     * 查询配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return ShowConfigurationResponse
     */
    public ShowConfigurationResponse showConfiguration(ShowConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showConfiguration);
    }

    /**
     * 查询配置
     *
     * 查询配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationInvoker(
        ShowConfigurationRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showConfiguration, hcClient);
    }

    /**
     * 查询提单权限
     *
     * 查询提单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerPrivilegePolicyRequest 请求对象
     * @return ShowCustomerPrivilegePolicyResponse
     */
    public ShowCustomerPrivilegePolicyResponse showCustomerPrivilegePolicy(ShowCustomerPrivilegePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showCustomerPrivilegePolicy);
    }

    /**
     * 查询提单权限
     *
     * 查询提单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerPrivilegePolicyRequest 请求对象
     * @return SyncInvoker<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse>
     */
    public SyncInvoker<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse> showCustomerPrivilegePolicyInvoker(
        ShowCustomerPrivilegePolicyRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showCustomerPrivilegePolicy, hcClient);
    }

    /**
     * 附件下载地址
     *
     * 附件下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDownloadAccessoryUrlRequest 请求对象
     * @return ShowDownloadAccessoryUrlResponse
     */
    public ShowDownloadAccessoryUrlResponse showDownloadAccessoryUrl(ShowDownloadAccessoryUrlRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showDownloadAccessoryUrl);
    }

    /**
     * 附件下载地址
     *
     * 附件下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDownloadAccessoryUrlRequest 请求对象
     * @return SyncInvoker<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse>
     */
    public SyncInvoker<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse> showDownloadAccessoryUrlInvoker(
        ShowDownloadAccessoryUrlRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showDownloadAccessoryUrl, hcClient);
    }

    /**
     * 查看最新发布版本协议详情
     *
     * 查看最新发布版本协议详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestPublishedAgreementRequest 请求对象
     * @return ShowLatestPublishedAgreementResponse
     */
    public ShowLatestPublishedAgreementResponse showLatestPublishedAgreement(
        ShowLatestPublishedAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showLatestPublishedAgreement);
    }

    /**
     * 查看最新发布版本协议详情
     *
     * 查看最新发布版本协议详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestPublishedAgreementRequest 请求对象
     * @return SyncInvoker<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse>
     */
    public SyncInvoker<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse> showLatestPublishedAgreementInvoker(
        ShowLatestPublishedAgreementRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showLatestPublishedAgreement, hcClient);
    }

    /**
     * 查询登录类型
     *
     * 查询登录类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginTypeRequest 请求对象
     * @return ShowLoginTypeResponse
     */
    public ShowLoginTypeResponse showLoginType(ShowLoginTypeRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showLoginType);
    }

    /**
     * 查询登录类型
     *
     * 查询登录类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginTypeRequest 请求对象
     * @return SyncInvoker<ShowLoginTypeRequest, ShowLoginTypeResponse>
     */
    public SyncInvoker<ShowLoginTypeRequest, ShowLoginTypeResponse> showLoginTypeInvoker(ShowLoginTypeRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showLoginType, hcClient);
    }

    /**
     * 查询伙伴工单权限
     *
     * 查询伙伴工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersCasesPrivilegeRequest 请求对象
     * @return ShowPartnersCasesPrivilegeResponse
     */
    public ShowPartnersCasesPrivilegeResponse showPartnersCasesPrivilege(ShowPartnersCasesPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showPartnersCasesPrivilege);
    }

    /**
     * 查询伙伴工单权限
     *
     * 查询伙伴工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersCasesPrivilegeRequest 请求对象
     * @return SyncInvoker<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse>
     */
    public SyncInvoker<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> showPartnersCasesPrivilegeInvoker(
        ShowPartnersCasesPrivilegeRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showPartnersCasesPrivilege, hcClient);
    }

    /**
     * 查询关联伙伴服务信息
     *
     * 查询关联伙伴服务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersServiceInfoRequest 请求对象
     * @return ShowPartnersServiceInfoResponse
     */
    public ShowPartnersServiceInfoResponse showPartnersServiceInfo(ShowPartnersServiceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showPartnersServiceInfo);
    }

    /**
     * 查询关联伙伴服务信息
     *
     * 查询关联伙伴服务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersServiceInfoRequest 请求对象
     * @return SyncInvoker<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse>
     */
    public SyncInvoker<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> showPartnersServiceInfoInvoker(
        ShowPartnersServiceInfoRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showPartnersServiceInfo, hcClient);
    }

    /**
     * 查询语料详情
     *
     * 查询指定语料的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairDetailRequest 请求对象
     * @return ShowQaPairDetailResponse
     */
    public ShowQaPairDetailResponse showQaPairDetail(ShowQaPairDetailRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showQaPairDetail);
    }

    /**
     * 查询语料详情
     *
     * 查询指定语料的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairDetailRequest 请求对象
     * @return SyncInvoker<ShowQaPairDetailRequest, ShowQaPairDetailResponse>
     */
    public SyncInvoker<ShowQaPairDetailRequest, ShowQaPairDetailResponse> showQaPairDetailInvoker(
        ShowQaPairDetailRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showQaPairDetail, hcClient);
    }

    /**
     * 查询语料
     *
     * 查询满足指定条件的语料列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairsRequest 请求对象
     * @return ShowQaPairsResponse
     */
    public ShowQaPairsResponse showQaPairs(ShowQaPairsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showQaPairs);
    }

    /**
     * 查询语料
     *
     * 查询满足指定条件的语料列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairsRequest 请求对象
     * @return SyncInvoker<ShowQaPairsRequest, ShowQaPairsResponse>
     */
    public SyncInvoker<ShowQaPairsRequest, ShowQaPairsResponse> showQaPairsInvoker(ShowQaPairsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showQaPairs, hcClient);
    }

    /**
     * 查询用户是否签署最新协议
     *
     * 查询用户是否签署最新协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSignedLatestPublishedAgreementRequest 请求对象
     * @return ShowSignedLatestPublishedAgreementResponse
     */
    public ShowSignedLatestPublishedAgreementResponse showSignedLatestPublishedAgreement(
        ShowSignedLatestPublishedAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showSignedLatestPublishedAgreement);
    }

    /**
     * 查询用户是否签署最新协议
     *
     * 查询用户是否签署最新协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSignedLatestPublishedAgreementRequest 请求对象
     * @return SyncInvoker<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse>
     */
    public SyncInvoker<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse> showSignedLatestPublishedAgreementInvoker(
        ShowSignedLatestPublishedAgreementRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showSignedLatestPublishedAgreement, hcClient);
    }

    /**
     * 产品类型转为主题
     *
     * 产品类型转为主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowThemeRequest 请求对象
     * @return ShowThemeResponse
     */
    public ShowThemeResponse showTheme(ShowThemeRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showTheme);
    }

    /**
     * 产品类型转为主题
     *
     * 产品类型转为主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowThemeRequest 请求对象
     * @return SyncInvoker<ShowThemeRequest, ShowThemeResponse>
     */
    public SyncInvoker<ShowThemeRequest, ShowThemeResponse> showThemeInvoker(ShowThemeRequest request) {
        return new SyncInvoker<>(request, OsmMeta.showTheme, hcClient);
    }

    /**
     * 签署协议
     *
     * 签署协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignPublishedAgreementRequest 请求对象
     * @return SignPublishedAgreementResponse
     */
    public SignPublishedAgreementResponse signPublishedAgreement(SignPublishedAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.signPublishedAgreement);
    }

    /**
     * 签署协议
     *
     * 签署协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignPublishedAgreementRequest 请求对象
     * @return SyncInvoker<SignPublishedAgreementRequest, SignPublishedAgreementResponse>
     */
    public SyncInvoker<SignPublishedAgreementRequest, SignPublishedAgreementResponse> signPublishedAgreementInvoker(
        SignPublishedAgreementRequest request) {
        return new SyncInvoker<>(request, OsmMeta.signPublishedAgreement, hcClient);
    }

    /**
     * 拒绝|撤销授权
     *
     * 拒绝|撤销授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorizationsRequest 请求对象
     * @return UpdateAuthorizationsResponse
     */
    public UpdateAuthorizationsResponse updateAuthorizations(UpdateAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateAuthorizations);
    }

    /**
     * 拒绝|撤销授权
     *
     * 拒绝|撤销授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorizationsRequest 请求对象
     * @return SyncInvoker<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse>
     */
    public SyncInvoker<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> updateAuthorizationsInvoker(
        UpdateAuthorizationsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.updateAuthorizations, hcClient);
    }

    /**
     * 修改联系方式
     *
     * 修改联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCaseContactInfoRequest 请求对象
     * @return UpdateCaseContactInfoResponse
     */
    public UpdateCaseContactInfoResponse updateCaseContactInfo(UpdateCaseContactInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateCaseContactInfo);
    }

    /**
     * 修改联系方式
     *
     * 修改联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCaseContactInfoRequest 请求对象
     * @return SyncInvoker<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse>
     */
    public SyncInvoker<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse> updateCaseContactInfoInvoker(
        UpdateCaseContactInfoRequest request) {
        return new SyncInvoker<>(request, OsmMeta.updateCaseContactInfo, hcClient);
    }

    /**
     * 工单操作
     *
     * 工单操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCasesRequest 请求对象
     * @return UpdateCasesResponse
     */
    public UpdateCasesResponse updateCases(UpdateCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateCases);
    }

    /**
     * 工单操作
     *
     * 工单操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCasesRequest 请求对象
     * @return SyncInvoker<UpdateCasesRequest, UpdateCasesResponse>
     */
    public SyncInvoker<UpdateCasesRequest, UpdateCasesResponse> updateCasesInvoker(UpdateCasesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.updateCases, hcClient);
    }

    /**
     * 修改标签
     *
     * 修改标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLabelsRequest 请求对象
     * @return UpdateLabelsResponse
     */
    public UpdateLabelsResponse updateLabels(UpdateLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateLabels);
    }

    /**
     * 修改标签
     *
     * 修改标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLabelsRequest 请求对象
     * @return SyncInvoker<UpdateLabelsRequest, UpdateLabelsResponse>
     */
    public SyncInvoker<UpdateLabelsRequest, UpdateLabelsResponse> updateLabelsInvoker(UpdateLabelsRequest request) {
        return new SyncInvoker<>(request, OsmMeta.updateLabels, hcClient);
    }

    /**
     * 设置消息已读
     *
     * 设置消息已读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewInstantMessagesReadRequest 请求对象
     * @return UpdateNewInstantMessagesReadResponse
     */
    public UpdateNewInstantMessagesReadResponse updateNewInstantMessagesRead(
        UpdateNewInstantMessagesReadRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateNewInstantMessagesRead);
    }

    /**
     * 设置消息已读
     *
     * 设置消息已读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewInstantMessagesReadRequest 请求对象
     * @return SyncInvoker<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse>
     */
    public SyncInvoker<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesReadInvoker(
        UpdateNewInstantMessagesReadRequest request) {
        return new SyncInvoker<>(request, OsmMeta.updateNewInstantMessagesRead, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件给SDK使用，上传附件需要满足\&quot;附件限制\&quot;返回的关于大小等限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJsonAccessoriesRequest 请求对象
     * @return UploadJsonAccessoriesResponse
     */
    public UploadJsonAccessoriesResponse uploadJsonAccessories(UploadJsonAccessoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.uploadJsonAccessories);
    }

    /**
     * 上传附件
     *
     * 上传附件给SDK使用，上传附件需要满足\&quot;附件限制\&quot;返回的关于大小等限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJsonAccessoriesRequest 请求对象
     * @return SyncInvoker<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse>
     */
    public SyncInvoker<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> uploadJsonAccessoriesInvoker(
        UploadJsonAccessoriesRequest request) {
        return new SyncInvoker<>(request, OsmMeta.uploadJsonAccessories, hcClient);
    }

}
