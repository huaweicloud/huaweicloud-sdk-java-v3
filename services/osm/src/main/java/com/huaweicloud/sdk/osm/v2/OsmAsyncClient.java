package com.huaweicloud.sdk.osm.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class OsmAsyncClient {

    protected HcClient hcClient;

    public OsmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OsmAsyncClient> newBuilder() {
        ClientBuilder<OsmAsyncClient> clientBuilder = new ClientBuilder<>(OsmAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<CheckHostsResponse>
     */
    public CompletableFuture<CheckHostsResponse> checkHostsAsync(CheckHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.checkHosts);
    }

    /**
     * 验证授权主机
     *
     * 验证授权主机密码是否正确
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHostsRequest 请求对象
     * @return AsyncInvoker<CheckHostsRequest, CheckHostsResponse>
     */
    public AsyncInvoker<CheckHostsRequest, CheckHostsResponse> checkHostsAsyncInvoker(CheckHostsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.checkHosts, hcClient);
    }

    /**
     * 是否需要验证
     *
     * 是否需要验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckNeedVerifyRequest 请求对象
     * @return CompletableFuture<CheckNeedVerifyResponse>
     */
    public CompletableFuture<CheckNeedVerifyResponse> checkNeedVerifyAsync(CheckNeedVerifyRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.checkNeedVerify);
    }

    /**
     * 是否需要验证
     *
     * 是否需要验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckNeedVerifyRequest 请求对象
     * @return AsyncInvoker<CheckNeedVerifyRequest, CheckNeedVerifyResponse>
     */
    public AsyncInvoker<CheckNeedVerifyRequest, CheckNeedVerifyResponse> checkNeedVerifyAsyncInvoker(
        CheckNeedVerifyRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.checkNeedVerify, hcClient);
    }

    /**
     * 验证联系方式
     *
     * 验证联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodesRequest 请求对象
     * @return CompletableFuture<CheckVerifyCodesResponse>
     */
    public CompletableFuture<CheckVerifyCodesResponse> checkVerifyCodesAsync(CheckVerifyCodesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.checkVerifyCodes);
    }

    /**
     * 验证联系方式
     *
     * 验证联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodesRequest 请求对象
     * @return AsyncInvoker<CheckVerifyCodesRequest, CheckVerifyCodesResponse>
     */
    public AsyncInvoker<CheckVerifyCodesRequest, CheckVerifyCodesResponse> checkVerifyCodesAsyncInvoker(
        CheckVerifyCodesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.checkVerifyCodes, hcClient);
    }

    /**
     * 租户确认授权
     *
     * 租户确认授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAuthorizationsRequest 请求对象
     * @return CompletableFuture<ConfirmAuthorizationsResponse>
     */
    public CompletableFuture<ConfirmAuthorizationsResponse> confirmAuthorizationsAsync(
        ConfirmAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.confirmAuthorizations);
    }

    /**
     * 租户确认授权
     *
     * 租户确认授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAuthorizationsRequest 请求对象
     * @return AsyncInvoker<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse>
     */
    public AsyncInvoker<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> confirmAuthorizationsAsyncInvoker(
        ConfirmAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.confirmAuthorizations, hcClient);
    }

    /**
     * 语料提问
     *
     * 基于语料的一次问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAskQuestionRequest 请求对象
     * @return CompletableFuture<CreateAskQuestionResponse>
     */
    public CompletableFuture<CreateAskQuestionResponse> createAskQuestionAsync(CreateAskQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createAskQuestion);
    }

    /**
     * 语料提问
     *
     * 基于语料的一次问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAskQuestionRequest 请求对象
     * @return AsyncInvoker<CreateAskQuestionRequest, CreateAskQuestionResponse>
     */
    public AsyncInvoker<CreateAskQuestionRequest, CreateAskQuestionResponse> createAskQuestionAsyncInvoker(
        CreateAskQuestionRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createAskQuestion, hcClient);
    }

    /**
     * 提交工单扩展参数
     *
     * 提交工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseExtendsParamRequest 请求对象
     * @return CompletableFuture<CreateCaseExtendsParamResponse>
     */
    public CompletableFuture<CreateCaseExtendsParamResponse> createCaseExtendsParamAsync(
        CreateCaseExtendsParamRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createCaseExtendsParam);
    }

    /**
     * 提交工单扩展参数
     *
     * 提交工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseExtendsParamRequest 请求对象
     * @return AsyncInvoker<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse>
     */
    public AsyncInvoker<CreateCaseExtendsParamRequest, CreateCaseExtendsParamResponse> createCaseExtendsParamAsyncInvoker(
        CreateCaseExtendsParamRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createCaseExtendsParam, hcClient);
    }

    /**
     * 添加工单关联标签接口
     *
     * 添加工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseLabelsRequest 请求对象
     * @return CompletableFuture<CreateCaseLabelsResponse>
     */
    public CompletableFuture<CreateCaseLabelsResponse> createCaseLabelsAsync(CreateCaseLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createCaseLabels);
    }

    /**
     * 添加工单关联标签接口
     *
     * 添加工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseLabelsRequest 请求对象
     * @return AsyncInvoker<CreateCaseLabelsRequest, CreateCaseLabelsResponse>
     */
    public AsyncInvoker<CreateCaseLabelsRequest, CreateCaseLabelsResponse> createCaseLabelsAsyncInvoker(
        CreateCaseLabelsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createCaseLabels, hcClient);
    }

    /**
     * 创建工单
     *
     * 创建工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCasesRequest 请求对象
     * @return CompletableFuture<CreateCasesResponse>
     */
    public CompletableFuture<CreateCasesResponse> createCasesAsync(CreateCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createCases);
    }

    /**
     * 创建工单
     *
     * 创建工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCasesRequest 请求对象
     * @return AsyncInvoker<CreateCasesRequest, CreateCasesResponse>
     */
    public AsyncInvoker<CreateCasesRequest, CreateCasesResponse> createCasesAsyncInvoker(CreateCasesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createCases, hcClient);
    }

    /**
     * 用户反馈是否有帮助
     *
     * 用户反馈是否有帮助
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseFeedbackRequest 请求对象
     * @return CompletableFuture<CreateDiagnoseFeedbackResponse>
     */
    public CompletableFuture<CreateDiagnoseFeedbackResponse> createDiagnoseFeedbackAsync(
        CreateDiagnoseFeedbackRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createDiagnoseFeedback);
    }

    /**
     * 用户反馈是否有帮助
     *
     * 用户反馈是否有帮助
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseFeedbackRequest 请求对象
     * @return AsyncInvoker<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse>
     */
    public AsyncInvoker<CreateDiagnoseFeedbackRequest, CreateDiagnoseFeedbackResponse> createDiagnoseFeedbackAsyncInvoker(
        CreateDiagnoseFeedbackRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createDiagnoseFeedback, hcClient);
    }

    /**
     * 开始一键诊断
     *
     * 开始一键诊断
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseJobRequest 请求对象
     * @return CompletableFuture<CreateDiagnoseJobResponse>
     */
    public CompletableFuture<CreateDiagnoseJobResponse> createDiagnoseJobAsync(CreateDiagnoseJobRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createDiagnoseJob);
    }

    /**
     * 开始一键诊断
     *
     * 开始一键诊断
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnoseJobRequest 请求对象
     * @return AsyncInvoker<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse>
     */
    public AsyncInvoker<CreateDiagnoseJobRequest, CreateDiagnoseJobResponse> createDiagnoseJobAsyncInvoker(
        CreateDiagnoseJobRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createDiagnoseJob, hcClient);
    }

    /**
     * 问答满意度评价
     *
     * 一次问答完毕后, 针对这一次问答提交满意度评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvaluateRequest 请求对象
     * @return CompletableFuture<CreateEvaluateResponse>
     */
    public CompletableFuture<CreateEvaluateResponse> createEvaluateAsync(CreateEvaluateRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createEvaluate);
    }

    /**
     * 问答满意度评价
     *
     * 一次问答完毕后, 针对这一次问答提交满意度评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEvaluateRequest 请求对象
     * @return AsyncInvoker<CreateEvaluateRequest, CreateEvaluateResponse>
     */
    public AsyncInvoker<CreateEvaluateRequest, CreateEvaluateResponse> createEvaluateAsyncInvoker(
        CreateEvaluateRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createEvaluate, hcClient);
    }

    /**
     * 创建举报反馈
     *
     * 创建举报反馈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeedbackRequest 请求对象
     * @return CompletableFuture<CreateFeedbackResponse>
     */
    public CompletableFuture<CreateFeedbackResponse> createFeedbackAsync(CreateFeedbackRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createFeedback);
    }

    /**
     * 创建举报反馈
     *
     * 创建举报反馈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeedbackRequest 请求对象
     * @return AsyncInvoker<CreateFeedbackRequest, CreateFeedbackResponse>
     */
    public AsyncInvoker<CreateFeedbackRequest, CreateFeedbackResponse> createFeedbackAsyncInvoker(
        CreateFeedbackRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createFeedback, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelsRequest 请求对象
     * @return CompletableFuture<CreateLabelsResponse>
     */
    public CompletableFuture<CreateLabelsResponse> createLabelsAsync(CreateLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createLabels);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLabelsRequest 请求对象
     * @return AsyncInvoker<CreateLabelsRequest, CreateLabelsResponse>
     */
    public AsyncInvoker<CreateLabelsRequest, CreateLabelsResponse> createLabelsAsyncInvoker(
        CreateLabelsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createLabels, hcClient);
    }

    /**
     * 提交留言
     *
     * 提交留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessagesRequest 请求对象
     * @return CompletableFuture<CreateMessagesResponse>
     */
    public CompletableFuture<CreateMessagesResponse> createMessagesAsync(CreateMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createMessages);
    }

    /**
     * 提交留言
     *
     * 提交留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessagesRequest 请求对象
     * @return AsyncInvoker<CreateMessagesRequest, CreateMessagesResponse>
     */
    public AsyncInvoker<CreateMessagesRequest, CreateMessagesResponse> createMessagesAsyncInvoker(
        CreateMessagesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createMessages, hcClient);
    }

    /**
     * 创建授权
     *
     * 创建授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivilegesRequest 请求对象
     * @return CompletableFuture<CreatePrivilegesResponse>
     */
    public CompletableFuture<CreatePrivilegesResponse> createPrivilegesAsync(CreatePrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createPrivileges);
    }

    /**
     * 创建授权
     *
     * 创建授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivilegesRequest 请求对象
     * @return AsyncInvoker<CreatePrivilegesRequest, CreatePrivilegesResponse>
     */
    public AsyncInvoker<CreatePrivilegesRequest, CreatePrivilegesResponse> createPrivilegesAsyncInvoker(
        CreatePrivilegesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createPrivileges, hcClient);
    }

    /**
     * 新问答接口
     *
     * 支持多轮流程问答接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaAskRequest 请求对象
     * @return CompletableFuture<CreateQaAskResponse>
     */
    public CompletableFuture<CreateQaAskResponse> createQaAskAsync(CreateQaAskRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createQaAsk);
    }

    /**
     * 新问答接口
     *
     * 支持多轮流程问答接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaAskRequest 请求对象
     * @return AsyncInvoker<CreateQaAskRequest, CreateQaAskResponse>
     */
    public AsyncInvoker<CreateQaAskRequest, CreateQaAskResponse> createQaAskAsyncInvoker(CreateQaAskRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createQaAsk, hcClient);
    }

    /**
     * 反馈评价
     *
     * 提交/取消反馈评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaFeedbacksRequest 请求对象
     * @return CompletableFuture<CreateQaFeedbacksResponse>
     */
    public CompletableFuture<CreateQaFeedbacksResponse> createQaFeedbacksAsync(CreateQaFeedbacksRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createQaFeedbacks);
    }

    /**
     * 反馈评价
     *
     * 提交/取消反馈评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQaFeedbacksRequest 请求对象
     * @return AsyncInvoker<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse>
     */
    public AsyncInvoker<CreateQaFeedbacksRequest, CreateQaFeedbacksResponse> createQaFeedbacksAsyncInvoker(
        CreateQaFeedbacksRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createQaFeedbacks, hcClient);
    }

    /**
     * 提问（在制定的会话中）
     *
     * 提问（在制定的会话中）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuestionInSessionRequest 请求对象
     * @return CompletableFuture<CreateQuestionInSessionResponse>
     */
    public CompletableFuture<CreateQuestionInSessionResponse> createQuestionInSessionAsync(
        CreateQuestionInSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createQuestionInSession);
    }

    /**
     * 提问（在制定的会话中）
     *
     * 提问（在制定的会话中）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuestionInSessionRequest 请求对象
     * @return AsyncInvoker<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse>
     */
    public AsyncInvoker<CreateQuestionInSessionRequest, CreateQuestionInSessionResponse> createQuestionInSessionAsyncInvoker(
        CreateQuestionInSessionRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createQuestionInSession, hcClient);
    }

    /**
     * 创建关联
     *
     * 创建关联，一个工单最多支持3个关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsRequest 请求对象
     * @return CompletableFuture<CreateRelationsResponse>
     */
    public CompletableFuture<CreateRelationsResponse> createRelationsAsync(CreateRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createRelations);
    }

    /**
     * 创建关联
     *
     * 创建关联，一个工单最多支持3个关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsRequest 请求对象
     * @return AsyncInvoker<CreateRelationsRequest, CreateRelationsResponse>
     */
    public AsyncInvoker<CreateRelationsRequest, CreateRelationsResponse> createRelationsAsyncInvoker(
        CreateRelationsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createRelations, hcClient);
    }

    /**
     * 提交评分
     *
     * 提交评分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScoresRequest 请求对象
     * @return CompletableFuture<CreateScoresResponse>
     */
    public CompletableFuture<CreateScoresResponse> createScoresAsync(CreateScoresRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createScores);
    }

    /**
     * 提交评分
     *
     * 提交评分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScoresRequest 请求对象
     * @return AsyncInvoker<CreateScoresRequest, CreateScoresResponse>
     */
    public AsyncInvoker<CreateScoresRequest, CreateScoresResponse> createScoresAsyncInvoker(
        CreateScoresRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createScores, hcClient);
    }

    /**
     * 创建问答会话
     *
     * 用于创建问答会话, 创建会话后可开始问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSessionRequest 请求对象
     * @return CompletableFuture<CreateSessionResponse>
     */
    public CompletableFuture<CreateSessionResponse> createSessionAsync(CreateSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createSession);
    }

    /**
     * 创建问答会话
     *
     * 用于创建问答会话, 创建会话后可开始问答
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSessionRequest 请求对象
     * @return AsyncInvoker<CreateSessionRequest, CreateSessionResponse>
     */
    public AsyncInvoker<CreateSessionRequest, CreateSessionResponse> createSessionAsyncInvoker(
        CreateSessionRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.createSession, hcClient);
    }

    /**
     * 删除附件
     *
     * 删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessoriesRequest 请求对象
     * @return CompletableFuture<DeleteAccessoriesResponse>
     */
    public CompletableFuture<DeleteAccessoriesResponse> deleteAccessoriesAsync(DeleteAccessoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteAccessories);
    }

    /**
     * 删除附件
     *
     * 删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccessoriesRequest 请求对象
     * @return AsyncInvoker<DeleteAccessoriesRequest, DeleteAccessoriesResponse>
     */
    public AsyncInvoker<DeleteAccessoriesRequest, DeleteAccessoriesResponse> deleteAccessoriesAsyncInvoker(
        DeleteAccessoriesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.deleteAccessories, hcClient);
    }

    /**
     * 删除工单关联标签接口
     *
     * 删除指定工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaseLabelsRequest 请求对象
     * @return CompletableFuture<DeleteCaseLabelsResponse>
     */
    public CompletableFuture<DeleteCaseLabelsResponse> deleteCaseLabelsAsync(DeleteCaseLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteCaseLabels);
    }

    /**
     * 删除工单关联标签接口
     *
     * 删除指定工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaseLabelsRequest 请求对象
     * @return AsyncInvoker<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse>
     */
    public AsyncInvoker<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> deleteCaseLabelsAsyncInvoker(
        DeleteCaseLabelsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.deleteCaseLabels, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签，同时会删除工单与标签关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelsRequest 请求对象
     * @return CompletableFuture<DeleteLabelsResponse>
     */
    public CompletableFuture<DeleteLabelsResponse> deleteLabelsAsync(DeleteLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteLabels);
    }

    /**
     * 删除标签
     *
     * 删除标签，同时会删除工单与标签关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLabelsRequest 请求对象
     * @return AsyncInvoker<DeleteLabelsRequest, DeleteLabelsResponse>
     */
    public AsyncInvoker<DeleteLabelsRequest, DeleteLabelsResponse> deleteLabelsAsyncInvoker(
        DeleteLabelsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.deleteLabels, hcClient);
    }

    /**
     * 删除关联
     *
     * 删除关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationRequest 请求对象
     * @return CompletableFuture<DeleteRelationResponse>
     */
    public CompletableFuture<DeleteRelationResponse> deleteRelationAsync(DeleteRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteRelation);
    }

    /**
     * 删除关联
     *
     * 删除关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationRequest 请求对象
     * @return AsyncInvoker<DeleteRelationRequest, DeleteRelationResponse>
     */
    public AsyncInvoker<DeleteRelationRequest, DeleteRelationResponse> deleteRelationAsyncInvoker(
        DeleteRelationRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.deleteRelation, hcClient);
    }

    /**
     * 下载附件
     *
     * 下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAccessoriesRequest 请求对象
     * @return CompletableFuture<DownloadAccessoriesResponse>
     */
    public CompletableFuture<DownloadAccessoriesResponse> downloadAccessoriesAsync(DownloadAccessoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.downloadAccessories);
    }

    /**
     * 下载附件
     *
     * 下载附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAccessoriesRequest 请求对象
     * @return AsyncInvoker<DownloadAccessoriesRequest, DownloadAccessoriesResponse>
     */
    public AsyncInvoker<DownloadAccessoriesRequest, DownloadAccessoriesResponse> downloadAccessoriesAsyncInvoker(
        DownloadAccessoriesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.downloadAccessories, hcClient);
    }

    /**
     * 工单导出
     *
     * 工单导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCasesRequest 请求对象
     * @return CompletableFuture<DownloadCasesResponse>
     */
    public CompletableFuture<DownloadCasesResponse> downloadCasesAsync(DownloadCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.downloadCases);
    }

    /**
     * 工单导出
     *
     * 工单导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCasesRequest 请求对象
     * @return AsyncInvoker<DownloadCasesRequest, DownloadCasesResponse>
     */
    public AsyncInvoker<DownloadCasesRequest, DownloadCasesResponse> downloadCasesAsyncInvoker(
        DownloadCasesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.downloadCases, hcClient);
    }

    /**
     * 图片展示
     *
     * 返回图片内容，用于页面直接展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImagesRequest 请求对象
     * @return CompletableFuture<DownloadImagesResponse>
     */
    public CompletableFuture<DownloadImagesResponse> downloadImagesAsync(DownloadImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.downloadImages);
    }

    /**
     * 图片展示
     *
     * 返回图片内容，用于页面直接展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImagesRequest 请求对象
     * @return AsyncInvoker<DownloadImagesRequest, DownloadImagesResponse>
     */
    public AsyncInvoker<DownloadImagesRequest, DownloadImagesResponse> downloadImagesAsyncInvoker(
        DownloadImagesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.downloadImages, hcClient);
    }

    /**
     * 租户批量获取下载链接
     *
     * 租户批量获取下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessoryAccessUrlsRequest 请求对象
     * @return CompletableFuture<ListAccessoryAccessUrlsResponse>
     */
    public CompletableFuture<ListAccessoryAccessUrlsResponse> listAccessoryAccessUrlsAsync(
        ListAccessoryAccessUrlsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listAccessoryAccessUrls);
    }

    /**
     * 租户批量获取下载链接
     *
     * 租户批量获取下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessoryAccessUrlsRequest 请求对象
     * @return AsyncInvoker<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse>
     */
    public AsyncInvoker<ListAccessoryAccessUrlsRequest, ListAccessoryAccessUrlsResponse> listAccessoryAccessUrlsAsyncInvoker(
        ListAccessoryAccessUrlsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listAccessoryAccessUrls, hcClient);
    }

    /**
     * 查询委托
     *
     * 查询委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse>
     */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listAgencies);
    }

    /**
     * 查询委托
     *
     * 查询委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesAsyncInvoker(
        ListAgenciesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listAgencies, hcClient);
    }

    /**
     * 查询国家码
     *
     * 查询国家码，用于提交工单页面填写联系方式使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaCodesRequest 请求对象
     * @return CompletableFuture<ListAreaCodesResponse>
     */
    public CompletableFuture<ListAreaCodesResponse> listAreaCodesAsync(ListAreaCodesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listAreaCodes);
    }

    /**
     * 查询国家码
     *
     * 查询国家码，用于提交工单页面填写联系方式使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaCodesRequest 请求对象
     * @return AsyncInvoker<ListAreaCodesRequest, ListAreaCodesResponse>
     */
    public AsyncInvoker<ListAreaCodesRequest, ListAreaCodesResponse> listAreaCodesAsyncInvoker(
        ListAreaCodesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listAreaCodes, hcClient);
    }

    /**
     * 查询案例
     *
     * 查询满足指定条件的案例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArticlesRequest 请求对象
     * @return CompletableFuture<ListArticlesResponse>
     */
    public CompletableFuture<ListArticlesResponse> listArticlesAsync(ListArticlesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listArticles);
    }

    /**
     * 查询案例
     *
     * 查询满足指定条件的案例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArticlesRequest 请求对象
     * @return AsyncInvoker<ListArticlesRequest, ListArticlesResponse>
     */
    public AsyncInvoker<ListArticlesRequest, ListArticlesResponse> listArticlesAsyncInvoker(
        ListArticlesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listArticles, hcClient);
    }

    /**
     * 查看授权列表
     *
     * 查询授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationsRequest 请求对象
     * @return CompletableFuture<ListAuthorizationsResponse>
     */
    public CompletableFuture<ListAuthorizationsResponse> listAuthorizationsAsync(ListAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listAuthorizations);
    }

    /**
     * 查看授权列表
     *
     * 查询授权列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationsRequest 请求对象
     * @return AsyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>
     */
    public AsyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizationsAsyncInvoker(
        ListAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listAuthorizations, hcClient);
    }

    /**
     * 查询工单类目列表
     *
     * 查询工单类目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCategoriesRequest 请求对象
     * @return CompletableFuture<ListCaseCategoriesResponse>
     */
    public CompletableFuture<ListCaseCategoriesResponse> listCaseCategoriesAsync(ListCaseCategoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseCategories);
    }

    /**
     * 查询工单类目列表
     *
     * 查询工单类目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCategoriesRequest 请求对象
     * @return AsyncInvoker<ListCaseCategoriesRequest, ListCaseCategoriesResponse>
     */
    public AsyncInvoker<ListCaseCategoriesRequest, ListCaseCategoriesResponse> listCaseCategoriesAsyncInvoker(
        ListCaseCategoriesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseCategories, hcClient);
    }

    /**
     * 查询工单抄送邮箱
     *
     * 查询工单抄送邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCcEmailsRequest 请求对象
     * @return CompletableFuture<ListCaseCcEmailsResponse>
     */
    public CompletableFuture<ListCaseCcEmailsResponse> listCaseCcEmailsAsync(ListCaseCcEmailsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseCcEmails);
    }

    /**
     * 查询工单抄送邮箱
     *
     * 查询工单抄送邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCcEmailsRequest 请求对象
     * @return AsyncInvoker<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse>
     */
    public AsyncInvoker<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> listCaseCcEmailsAsyncInvoker(
        ListCaseCcEmailsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseCcEmails, hcClient);
    }

    /**
     * 统计各状态工单数量
     *
     * 统计各状态工单数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCountsRequest 请求对象
     * @return CompletableFuture<ListCaseCountsResponse>
     */
    public CompletableFuture<ListCaseCountsResponse> listCaseCountsAsync(ListCaseCountsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseCounts);
    }

    /**
     * 统计各状态工单数量
     *
     * 统计各状态工单数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseCountsRequest 请求对象
     * @return AsyncInvoker<ListCaseCountsRequest, ListCaseCountsResponse>
     */
    public AsyncInvoker<ListCaseCountsRequest, ListCaseCountsResponse> listCaseCountsAsyncInvoker(
        ListCaseCountsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseCounts, hcClient);
    }

    /**
     * 查询工单关联标签接口
     *
     * 查询工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLabelsRequest 请求对象
     * @return CompletableFuture<ListCaseLabelsResponse>
     */
    public CompletableFuture<ListCaseLabelsResponse> listCaseLabelsAsync(ListCaseLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseLabels);
    }

    /**
     * 查询工单关联标签接口
     *
     * 查询工单关联标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLabelsRequest 请求对象
     * @return AsyncInvoker<ListCaseLabelsRequest, ListCaseLabelsResponse>
     */
    public AsyncInvoker<ListCaseLabelsRequest, ListCaseLabelsResponse> listCaseLabelsAsyncInvoker(
        ListCaseLabelsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseLabels, hcClient);
    }

    /**
     * 查询工单限制，比如抄送邮箱个数等
     *
     * 查询工单限制，比如抄送邮箱个数等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLimitsRequest 请求对象
     * @return CompletableFuture<ListCaseLimitsResponse>
     */
    public CompletableFuture<ListCaseLimitsResponse> listCaseLimitsAsync(ListCaseLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseLimits);
    }

    /**
     * 查询工单限制，比如抄送邮箱个数等
     *
     * 查询工单限制，比如抄送邮箱个数等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseLimitsRequest 请求对象
     * @return AsyncInvoker<ListCaseLimitsRequest, ListCaseLimitsResponse>
     */
    public AsyncInvoker<ListCaseLimitsRequest, ListCaseLimitsResponse> listCaseLimitsAsyncInvoker(
        ListCaseLimitsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseLimits, hcClient);
    }

    /**
     * 查询工单操作日志
     *
     * 查询工单操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseOperateLogsRequest 请求对象
     * @return CompletableFuture<ListCaseOperateLogsResponse>
     */
    public CompletableFuture<ListCaseOperateLogsResponse> listCaseOperateLogsAsync(ListCaseOperateLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseOperateLogs);
    }

    /**
     * 查询工单操作日志
     *
     * 查询工单操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseOperateLogsRequest 请求对象
     * @return AsyncInvoker<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse>
     */
    public AsyncInvoker<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> listCaseOperateLogsAsyncInvoker(
        ListCaseOperateLogsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseOperateLogs, hcClient);
    }

    /**
     * 查询工单配额
     *
     * 查询工单配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseQuotasRequest 请求对象
     * @return CompletableFuture<ListCaseQuotasResponse>
     */
    public CompletableFuture<ListCaseQuotasResponse> listCaseQuotasAsync(ListCaseQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseQuotas);
    }

    /**
     * 查询工单配额
     *
     * 查询工单配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseQuotasRequest 请求对象
     * @return AsyncInvoker<ListCaseQuotasRequest, ListCaseQuotasResponse>
     */
    public AsyncInvoker<ListCaseQuotasRequest, ListCaseQuotasResponse> listCaseQuotasAsyncInvoker(
        ListCaseQuotasRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseQuotas, hcClient);
    }

    /**
     * 查询问题类型对应模板
     *
     * 查询问题类型对应模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseTemplatesRequest 请求对象
     * @return CompletableFuture<ListCaseTemplatesResponse>
     */
    public CompletableFuture<ListCaseTemplatesResponse> listCaseTemplatesAsync(ListCaseTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseTemplates);
    }

    /**
     * 查询问题类型对应模板
     *
     * 查询问题类型对应模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaseTemplatesRequest 请求对象
     * @return AsyncInvoker<ListCaseTemplatesRequest, ListCaseTemplatesResponse>
     */
    public AsyncInvoker<ListCaseTemplatesRequest, ListCaseTemplatesResponse> listCaseTemplatesAsyncInvoker(
        ListCaseTemplatesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCaseTemplates, hcClient);
    }

    /**
     * 查询工单列表接口
     *
     * 查询工单列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesRequest 请求对象
     * @return CompletableFuture<ListCasesResponse>
     */
    public CompletableFuture<ListCasesResponse> listCasesAsync(ListCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCases);
    }

    /**
     * 查询工单列表接口
     *
     * 查询工单列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesRequest 请求对象
     * @return AsyncInvoker<ListCasesRequest, ListCasesResponse>
     */
    public AsyncInvoker<ListCasesRequest, ListCasesResponse> listCasesAsyncInvoker(ListCasesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCases, hcClient);
    }

    /**
     * 查询用户关联的region
     *
     * 查询用户关联的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomersRegionsRequest 请求对象
     * @return CompletableFuture<ListCustomersRegionsResponse>
     */
    public CompletableFuture<ListCustomersRegionsResponse> listCustomersRegionsAsync(
        ListCustomersRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCustomersRegions);
    }

    /**
     * 查询用户关联的region
     *
     * 查询用户关联的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomersRegionsRequest 请求对象
     * @return AsyncInvoker<ListCustomersRegionsRequest, ListCustomersRegionsResponse>
     */
    public AsyncInvoker<ListCustomersRegionsRequest, ListCustomersRegionsResponse> listCustomersRegionsAsyncInvoker(
        ListCustomersRegionsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listCustomersRegions, hcClient);
    }

    /**
     * 根据itemIds查询指定的诊断检查项执行结果
     *
     * 根据itemIds查询指定的诊断检查项执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseItemsRequest 请求对象
     * @return CompletableFuture<ListDiagnoseItemsResponse>
     */
    public CompletableFuture<ListDiagnoseItemsResponse> listDiagnoseItemsAsync(ListDiagnoseItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listDiagnoseItems);
    }

    /**
     * 根据itemIds查询指定的诊断检查项执行结果
     *
     * 根据itemIds查询指定的诊断检查项执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseItemsRequest 请求对象
     * @return AsyncInvoker<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse>
     */
    public AsyncInvoker<ListDiagnoseItemsRequest, ListDiagnoseItemsResponse> listDiagnoseItemsAsyncInvoker(
        ListDiagnoseItemsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listDiagnoseItems, hcClient);
    }

    /**
     * 查询诊断任务执行结果
     *
     * 查询诊断任务执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseJobRequest 请求对象
     * @return CompletableFuture<ListDiagnoseJobResponse>
     */
    public CompletableFuture<ListDiagnoseJobResponse> listDiagnoseJobAsync(ListDiagnoseJobRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listDiagnoseJob);
    }

    /**
     * 查询诊断任务执行结果
     *
     * 查询诊断任务执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseJobRequest 请求对象
     * @return AsyncInvoker<ListDiagnoseJobRequest, ListDiagnoseJobResponse>
     */
    public AsyncInvoker<ListDiagnoseJobRequest, ListDiagnoseJobResponse> listDiagnoseJobAsyncInvoker(
        ListDiagnoseJobRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listDiagnoseJob, hcClient);
    }

    /**
     * 查询诊断历史记录列表
     *
     * 查询诊断历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseRecordsRequest 请求对象
     * @return CompletableFuture<ListDiagnoseRecordsResponse>
     */
    public CompletableFuture<ListDiagnoseRecordsResponse> listDiagnoseRecordsAsync(ListDiagnoseRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listDiagnoseRecords);
    }

    /**
     * 查询诊断历史记录列表
     *
     * 查询诊断历史记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseRecordsRequest 请求对象
     * @return AsyncInvoker<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse>
     */
    public AsyncInvoker<ListDiagnoseRecordsRequest, ListDiagnoseRecordsResponse> listDiagnoseRecordsAsyncInvoker(
        ListDiagnoseRecordsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listDiagnoseRecords, hcClient);
    }

    /**
     * 获取资源信息
     *
     * 获取资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseResourcesRequest 请求对象
     * @return CompletableFuture<ListDiagnoseResourcesResponse>
     */
    public CompletableFuture<ListDiagnoseResourcesResponse> listDiagnoseResourcesAsync(
        ListDiagnoseResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listDiagnoseResources);
    }

    /**
     * 获取资源信息
     *
     * 获取资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnoseResourcesRequest 请求对象
     * @return AsyncInvoker<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse>
     */
    public AsyncInvoker<ListDiagnoseResourcesRequest, ListDiagnoseResourcesResponse> listDiagnoseResourcesAsyncInvoker(
        ListDiagnoseResourcesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listDiagnoseResources, hcClient);
    }

    /**
     * 查询附加参数
     *
     * 提单时，根据不同的产品或者问题类型，会存在不同的一些附加参数填写
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendsParamsRequest 请求对象
     * @return CompletableFuture<ListExtendsParamsResponse>
     */
    public CompletableFuture<ListExtendsParamsResponse> listExtendsParamsAsync(ListExtendsParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listExtendsParams);
    }

    /**
     * 查询附加参数
     *
     * 提单时，根据不同的产品或者问题类型，会存在不同的一些附加参数填写
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendsParamsRequest 请求对象
     * @return AsyncInvoker<ListExtendsParamsRequest, ListExtendsParamsResponse>
     */
    public AsyncInvoker<ListExtendsParamsRequest, ListExtendsParamsResponse> listExtendsParamsAsyncInvoker(
        ListExtendsParamsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listExtendsParams, hcClient);
    }

    /**
     * 查询反馈选项
     *
     * 查询符合条件的反馈选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeedbackOptionRequest 请求对象
     * @return CompletableFuture<ListFeedbackOptionResponse>
     */
    public CompletableFuture<ListFeedbackOptionResponse> listFeedbackOptionAsync(ListFeedbackOptionRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listFeedbackOption);
    }

    /**
     * 查询反馈选项
     *
     * 查询符合条件的反馈选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeedbackOptionRequest 请求对象
     * @return AsyncInvoker<ListFeedbackOptionRequest, ListFeedbackOptionResponse>
     */
    public AsyncInvoker<ListFeedbackOptionRequest, ListFeedbackOptionResponse> listFeedbackOptionAsyncInvoker(
        ListFeedbackOptionRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listFeedbackOption, hcClient);
    }

    /**
     * 查询已验证的列表
     *
     * 查询已验证的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHasVerifiedContactsRequest 请求对象
     * @return CompletableFuture<ListHasVerifiedContactsResponse>
     */
    public CompletableFuture<ListHasVerifiedContactsResponse> listHasVerifiedContactsAsync(
        ListHasVerifiedContactsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listHasVerifiedContacts);
    }

    /**
     * 查询已验证的列表
     *
     * 查询已验证的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHasVerifiedContactsRequest 请求对象
     * @return AsyncInvoker<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse>
     */
    public AsyncInvoker<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> listHasVerifiedContactsAsyncInvoker(
        ListHasVerifiedContactsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listHasVerifiedContacts, hcClient);
    }

    /**
     * 查询堡垒机历史操作记录
     *
     * 查询堡垒机历史操作记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperateLogsRequest 请求对象
     * @return CompletableFuture<ListHistoryOperateLogsResponse>
     */
    public CompletableFuture<ListHistoryOperateLogsResponse> listHistoryOperateLogsAsync(
        ListHistoryOperateLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listHistoryOperateLogs);
    }

    /**
     * 查询堡垒机历史操作记录
     *
     * 查询堡垒机历史操作记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperateLogsRequest 请求对象
     * @return AsyncInvoker<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse>
     */
    public AsyncInvoker<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> listHistoryOperateLogsAsyncInvoker(
        ListHistoryOperateLogsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listHistoryOperateLogs, hcClient);
    }

    /**
     * 查询堡垒机历史会话列表
     *
     * 查询堡垒机历史会话列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistorySessionsRequest 请求对象
     * @return CompletableFuture<ListHistorySessionsResponse>
     */
    public CompletableFuture<ListHistorySessionsResponse> listHistorySessionsAsync(ListHistorySessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listHistorySessions);
    }

    /**
     * 查询堡垒机历史会话列表
     *
     * 查询堡垒机历史会话列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistorySessionsRequest 请求对象
     * @return AsyncInvoker<ListHistorySessionsRequest, ListHistorySessionsResponse>
     */
    public AsyncInvoker<ListHistorySessionsRequest, ListHistorySessionsResponse> listHistorySessionsAsyncInvoker(
        ListHistorySessionsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listHistorySessions, hcClient);
    }

    /**
     * 查询标签
     *
     * 查询标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsRequest 请求对象
     * @return CompletableFuture<ListLabelsResponse>
     */
    public CompletableFuture<ListLabelsResponse> listLabelsAsync(ListLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listLabels);
    }

    /**
     * 查询标签
     *
     * 查询标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsRequest 请求对象
     * @return AsyncInvoker<ListLabelsRequest, ListLabelsResponse>
     */
    public AsyncInvoker<ListLabelsRequest, ListLabelsResponse> listLabelsAsyncInvoker(ListLabelsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listLabels, hcClient);
    }

    /**
     * 查询留言
     *
     * 查询留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return CompletableFuture<ListMessagesResponse>
     */
    public CompletableFuture<ListMessagesResponse> listMessagesAsync(ListMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listMessages);
    }

    /**
     * 查询留言
     *
     * 查询留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessagesRequest 请求对象
     * @return AsyncInvoker<ListMessagesRequest, ListMessagesResponse>
     */
    public AsyncInvoker<ListMessagesRequest, ListMessagesResponse> listMessagesAsyncInvoker(
        ListMessagesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listMessages, hcClient);
    }

    /**
     * 查询更多留言
     *
     * 查询更多留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMoreInstantMessagesRequest 请求对象
     * @return CompletableFuture<ListMoreInstantMessagesResponse>
     */
    public CompletableFuture<ListMoreInstantMessagesResponse> listMoreInstantMessagesAsync(
        ListMoreInstantMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listMoreInstantMessages);
    }

    /**
     * 查询更多留言
     *
     * 查询更多留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMoreInstantMessagesRequest 请求对象
     * @return AsyncInvoker<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse>
     */
    public AsyncInvoker<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> listMoreInstantMessagesAsyncInvoker(
        ListMoreInstantMessagesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listMoreInstantMessages, hcClient);
    }

    /**
     * 轮询查询即时消息
     *
     * 轮询查询即时消息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewInstantMessagesRequest 请求对象
     * @return CompletableFuture<ListNewInstantMessagesResponse>
     */
    public CompletableFuture<ListNewInstantMessagesResponse> listNewInstantMessagesAsync(
        ListNewInstantMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listNewInstantMessages);
    }

    /**
     * 轮询查询即时消息
     *
     * 轮询查询即时消息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewInstantMessagesRequest 请求对象
     * @return AsyncInvoker<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse>
     */
    public AsyncInvoker<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> listNewInstantMessagesAsyncInvoker(
        ListNewInstantMessagesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listNewInstantMessages, hcClient);
    }

    /**
     * 查询公告
     *
     * 查询满足指定条件的公告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticesRequest 请求对象
     * @return CompletableFuture<ListNoticesResponse>
     */
    public CompletableFuture<ListNoticesResponse> listNoticesAsync(ListNoticesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listNotices);
    }

    /**
     * 查询公告
     *
     * 查询满足指定条件的公告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticesRequest 请求对象
     * @return AsyncInvoker<ListNoticesRequest, ListNoticesResponse>
     */
    public AsyncInvoker<ListNoticesRequest, ListNoticesResponse> listNoticesAsyncInvoker(ListNoticesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listNotices, hcClient);
    }

    /**
     * 工单列表
     *
     * 工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrderIncidentRequest 请求对象
     * @return CompletableFuture<ListOrderIncidentResponse>
     */
    public CompletableFuture<ListOrderIncidentResponse> listOrderIncidentAsync(ListOrderIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listOrderIncident);
    }

    /**
     * 工单列表
     *
     * 工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrderIncidentRequest 请求对象
     * @return AsyncInvoker<ListOrderIncidentRequest, ListOrderIncidentResponse>
     */
    public AsyncInvoker<ListOrderIncidentRequest, ListOrderIncidentResponse> listOrderIncidentAsyncInvoker(
        ListOrderIncidentRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listOrderIncident, hcClient);
    }

    /**
     * 查询工单权限
     *
     * 查询工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivilegesRequest 请求对象
     * @return CompletableFuture<ListPrivilegesResponse>
     */
    public CompletableFuture<ListPrivilegesResponse> listPrivilegesAsync(ListPrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listPrivileges);
    }

    /**
     * 查询工单权限
     *
     * 查询工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivilegesRequest 请求对象
     * @return AsyncInvoker<ListPrivilegesRequest, ListPrivilegesResponse>
     */
    public AsyncInvoker<ListPrivilegesRequest, ListPrivilegesResponse> listPrivilegesAsyncInvoker(
        ListPrivilegesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listPrivileges, hcClient);
    }

    /**
     * 查询问题类型列表
     *
     * 提交工单时，选择产品类型之后选择对应的问题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProblemTypesRequest 请求对象
     * @return CompletableFuture<ListProblemTypesResponse>
     */
    public CompletableFuture<ListProblemTypesResponse> listProblemTypesAsync(ListProblemTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listProblemTypes);
    }

    /**
     * 查询问题类型列表
     *
     * 提交工单时，选择产品类型之后选择对应的问题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProblemTypesRequest 请求对象
     * @return AsyncInvoker<ListProblemTypesRequest, ListProblemTypesResponse>
     */
    public AsyncInvoker<ListProblemTypesRequest, ListProblemTypesResponse> listProblemTypesAsyncInvoker(
        ListProblemTypesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listProblemTypes, hcClient);
    }

    /**
     * 查询产品类型列表
     *
     * 查询产品类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductCategoriesRequest 请求对象
     * @return CompletableFuture<ListProductCategoriesResponse>
     */
    public CompletableFuture<ListProductCategoriesResponse> listProductCategoriesAsync(
        ListProductCategoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listProductCategories);
    }

    /**
     * 查询产品类型列表
     *
     * 查询产品类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductCategoriesRequest 请求对象
     * @return AsyncInvoker<ListProductCategoriesRequest, ListProductCategoriesResponse>
     */
    public AsyncInvoker<ListProductCategoriesRequest, ListProductCategoriesResponse> listProductCategoriesAsyncInvoker(
        ListProductCategoriesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listProductCategories, hcClient);
    }

    /**
     * 查询推荐热词
     *
     * 查询指定条件的推荐热词
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendWordsRequest 请求对象
     * @return CompletableFuture<ListRecommendWordsResponse>
     */
    public CompletableFuture<ListRecommendWordsResponse> listRecommendWordsAsync(ListRecommendWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listRecommendWords);
    }

    /**
     * 查询推荐热词
     *
     * 查询指定条件的推荐热词
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecommendWordsRequest 请求对象
     * @return AsyncInvoker<ListRecommendWordsRequest, ListRecommendWordsResponse>
     */
    public AsyncInvoker<ListRecommendWordsRequest, ListRecommendWordsResponse> listRecommendWordsAsyncInvoker(
        ListRecommendWordsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listRecommendWords, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listRegions);
    }

    /**
     * 查询区域列表
     *
     * 查询区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listRegions, hcClient);
    }

    /**
     * 查询关联工单
     *
     * 查询工单的关联，返回关联工单的简要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationRequest 请求对象
     * @return CompletableFuture<ListRelationResponse>
     */
    public CompletableFuture<ListRelationResponse> listRelationAsync(ListRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listRelation);
    }

    /**
     * 查询关联工单
     *
     * 查询工单的关联，返回关联工单的简要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelationRequest 请求对象
     * @return AsyncInvoker<ListRelationRequest, ListRelationResponse>
     */
    public AsyncInvoker<ListRelationRequest, ListRelationResponse> listRelationAsyncInvoker(
        ListRelationRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listRelation, hcClient);
    }

    /**
     * 工单满意度分类列表
     *
     * 工单满意度分类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSatisfactionDimensionsRequest 请求对象
     * @return CompletableFuture<ListSatisfactionDimensionsResponse>
     */
    public CompletableFuture<ListSatisfactionDimensionsResponse> listSatisfactionDimensionsAsync(
        ListSatisfactionDimensionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listSatisfactionDimensions);
    }

    /**
     * 工单满意度分类列表
     *
     * 工单满意度分类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSatisfactionDimensionsRequest 请求对象
     * @return AsyncInvoker<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse>
     */
    public AsyncInvoker<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> listSatisfactionDimensionsAsyncInvoker(
        ListSatisfactionDimensionsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listSatisfactionDimensions, hcClient);
    }

    /**
     * 查询问题严重性列表
     *
     * 查询问题严重性列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSeveritiesRequest 请求对象
     * @return CompletableFuture<ListSeveritiesResponse>
     */
    public CompletableFuture<ListSeveritiesResponse> listSeveritiesAsync(ListSeveritiesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listSeverities);
    }

    /**
     * 查询问题严重性列表
     *
     * 查询问题严重性列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSeveritiesRequest 请求对象
     * @return AsyncInvoker<ListSeveritiesRequest, ListSeveritiesResponse>
     */
    public AsyncInvoker<ListSeveritiesRequest, ListSeveritiesResponse> listSeveritiesAsyncInvoker(
        ListSeveritiesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listSeverities, hcClient);
    }

    /**
     * 查询子用户信息
     *
     * 查询子用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubCustomersRequest 请求对象
     * @return CompletableFuture<ListSubCustomersResponse>
     */
    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listSubCustomers);
    }

    /**
     * 查询子用户信息
     *
     * 查询子用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubCustomersRequest 请求对象
     * @return AsyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>
     */
    public AsyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomersAsyncInvoker(
        ListSubCustomersRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listSubCustomers, hcClient);
    }

    /**
     * 查询工具
     *
     * 查询满足指定条件的工具列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListToolsRequest 请求对象
     * @return CompletableFuture<ListToolsResponse>
     */
    public CompletableFuture<ListToolsResponse> listToolsAsync(ListToolsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listTools);
    }

    /**
     * 查询工具
     *
     * 查询满足指定条件的工具列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListToolsRequest 请求对象
     * @return AsyncInvoker<ListToolsRequest, ListToolsResponse>
     */
    public AsyncInvoker<ListToolsRequest, ListToolsResponse> listToolsAsyncInvoker(ListToolsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listTools, hcClient);
    }

    /**
     * 查询堡垒机文件传输记录
     *
     * 查询堡垒机文件传输记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransportHistoriesRequest 请求对象
     * @return CompletableFuture<ListTransportHistoriesResponse>
     */
    public CompletableFuture<ListTransportHistoriesResponse> listTransportHistoriesAsync(
        ListTransportHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listTransportHistories);
    }

    /**
     * 查询堡垒机文件传输记录
     *
     * 查询堡垒机文件传输记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransportHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTransportHistoriesRequest, ListTransportHistoriesResponse>
     */
    public AsyncInvoker<ListTransportHistoriesRequest, ListTransportHistoriesResponse> listTransportHistoriesAsyncInvoker(
        ListTransportHistoriesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listTransportHistories, hcClient);
    }

    /**
     * 查询未读消息
     *
     * 查询未读消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnreadNewInstantMessagesRequest 请求对象
     * @return CompletableFuture<ListUnreadNewInstantMessagesResponse>
     */
    public CompletableFuture<ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessagesAsync(
        ListUnreadNewInstantMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listUnreadNewInstantMessages);
    }

    /**
     * 查询未读消息
     *
     * 查询未读消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnreadNewInstantMessagesRequest 请求对象
     * @return AsyncInvoker<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse>
     */
    public AsyncInvoker<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessagesAsyncInvoker(
        ListUnreadNewInstantMessagesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.listUnreadNewInstantMessages, hcClient);
    }

    /**
     * 撤回留言
     *
     * 撤回留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeMessageRequest 请求对象
     * @return CompletableFuture<RevokeMessageResponse>
     */
    public CompletableFuture<RevokeMessageResponse> revokeMessageAsync(RevokeMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.revokeMessage);
    }

    /**
     * 撤回留言
     *
     * 撤回留言
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeMessageRequest 请求对象
     * @return AsyncInvoker<RevokeMessageRequest, RevokeMessageResponse>
     */
    public AsyncInvoker<RevokeMessageRequest, RevokeMessageResponse> revokeMessageAsyncInvoker(
        RevokeMessageRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.revokeMessage, hcClient);
    }

    /**
     * 获取验证码
     *
     * 获取验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVerifyCodesRequest 请求对象
     * @return CompletableFuture<SendVerifyCodesResponse>
     */
    public CompletableFuture<SendVerifyCodesResponse> sendVerifyCodesAsync(SendVerifyCodesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.sendVerifyCodes);
    }

    /**
     * 获取验证码
     *
     * 获取验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVerifyCodesRequest 请求对象
     * @return AsyncInvoker<SendVerifyCodesRequest, SendVerifyCodesResponse>
     */
    public AsyncInvoker<SendVerifyCodesRequest, SendVerifyCodesResponse> sendVerifyCodesAsyncInvoker(
        SendVerifyCodesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.sendVerifyCodes, hcClient);
    }

    /**
     * 附件限制
     *
     * 查询附件的一下限制，比如大小，数量，文件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessoryLimitsRequest 请求对象
     * @return CompletableFuture<ShowAccessoryLimitsResponse>
     */
    public CompletableFuture<ShowAccessoryLimitsResponse> showAccessoryLimitsAsync(ShowAccessoryLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showAccessoryLimits);
    }

    /**
     * 附件限制
     *
     * 查询附件的一下限制，比如大小，数量，文件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessoryLimitsRequest 请求对象
     * @return AsyncInvoker<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse>
     */
    public AsyncInvoker<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> showAccessoryLimitsAsyncInvoker(
        ShowAccessoryLimitsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showAccessoryLimits, hcClient);
    }

    /**
     * 查询联想问题
     *
     * 根据当前输入, 联想相关的问题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedQuestionsRequest 请求对象
     * @return CompletableFuture<ShowAssociatedQuestionsResponse>
     */
    public CompletableFuture<ShowAssociatedQuestionsResponse> showAssociatedQuestionsAsync(
        ShowAssociatedQuestionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showAssociatedQuestions);
    }

    /**
     * 查询联想问题
     *
     * 根据当前输入, 联想相关的问题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedQuestionsRequest 请求对象
     * @return AsyncInvoker<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse>
     */
    public AsyncInvoker<ShowAssociatedQuestionsRequest, ShowAssociatedQuestionsResponse> showAssociatedQuestionsAsyncInvoker(
        ShowAssociatedQuestionsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showAssociatedQuestions, hcClient);
    }

    /**
     * 查询授权详情
     *
     * 查询授权详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizationDetailRequest 请求对象
     * @return CompletableFuture<ShowAuthorizationDetailResponse>
     */
    public CompletableFuture<ShowAuthorizationDetailResponse> showAuthorizationDetailAsync(
        ShowAuthorizationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showAuthorizationDetail);
    }

    /**
     * 查询授权详情
     *
     * 查询授权详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizationDetailRequest 请求对象
     * @return AsyncInvoker<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse>
     */
    public AsyncInvoker<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> showAuthorizationDetailAsyncInvoker(
        ShowAuthorizationDetailRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showAuthorizationDetail, hcClient);
    }

    /**
     * 查询工单详情
     *
     * 查询工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowCaseDetailResponse>
     */
    public CompletableFuture<ShowCaseDetailResponse> showCaseDetailAsync(ShowCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showCaseDetail);
    }

    /**
     * 查询工单详情
     *
     * 查询工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseDetailRequest 请求对象
     * @return AsyncInvoker<ShowCaseDetailRequest, ShowCaseDetailResponse>
     */
    public AsyncInvoker<ShowCaseDetailRequest, ShowCaseDetailResponse> showCaseDetailAsyncInvoker(
        ShowCaseDetailRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showCaseDetail, hcClient);
    }

    /**
     * 查询工单扩展参数
     *
     * 查询工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseExtendsParamRequest 请求对象
     * @return CompletableFuture<ShowCaseExtendsParamResponse>
     */
    public CompletableFuture<ShowCaseExtendsParamResponse> showCaseExtendsParamAsync(
        ShowCaseExtendsParamRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showCaseExtendsParam);
    }

    /**
     * 查询工单扩展参数
     *
     * 查询工单扩展参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseExtendsParamRequest 请求对象
     * @return AsyncInvoker<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse>
     */
    public AsyncInvoker<ShowCaseExtendsParamRequest, ShowCaseExtendsParamResponse> showCaseExtendsParamAsyncInvoker(
        ShowCaseExtendsParamRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showCaseExtendsParam, hcClient);
    }

    /**
     * 查询某个工单状态
     *
     * 查询某个工单状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseStatusRequest 请求对象
     * @return CompletableFuture<ShowCaseStatusResponse>
     */
    public CompletableFuture<ShowCaseStatusResponse> showCaseStatusAsync(ShowCaseStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showCaseStatus);
    }

    /**
     * 查询某个工单状态
     *
     * 查询某个工单状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseStatusRequest 请求对象
     * @return AsyncInvoker<ShowCaseStatusRequest, ShowCaseStatusResponse>
     */
    public AsyncInvoker<ShowCaseStatusRequest, ShowCaseStatusResponse> showCaseStatusAsyncInvoker(
        ShowCaseStatusRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showCaseStatus, hcClient);
    }

    /**
     * 查询配置
     *
     * 查询配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return CompletableFuture<ShowConfigurationResponse>
     */
    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showConfiguration);
    }

    /**
     * 查询配置
     *
     * 查询配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationAsyncInvoker(
        ShowConfigurationRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showConfiguration, hcClient);
    }

    /**
     * 查询提单权限
     *
     * 查询提单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerPrivilegePolicyRequest 请求对象
     * @return CompletableFuture<ShowCustomerPrivilegePolicyResponse>
     */
    public CompletableFuture<ShowCustomerPrivilegePolicyResponse> showCustomerPrivilegePolicyAsync(
        ShowCustomerPrivilegePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showCustomerPrivilegePolicy);
    }

    /**
     * 查询提单权限
     *
     * 查询提单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerPrivilegePolicyRequest 请求对象
     * @return AsyncInvoker<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse>
     */
    public AsyncInvoker<ShowCustomerPrivilegePolicyRequest, ShowCustomerPrivilegePolicyResponse> showCustomerPrivilegePolicyAsyncInvoker(
        ShowCustomerPrivilegePolicyRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showCustomerPrivilegePolicy, hcClient);
    }

    /**
     * 附件下载地址
     *
     * 附件下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDownloadAccessoryUrlRequest 请求对象
     * @return CompletableFuture<ShowDownloadAccessoryUrlResponse>
     */
    public CompletableFuture<ShowDownloadAccessoryUrlResponse> showDownloadAccessoryUrlAsync(
        ShowDownloadAccessoryUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showDownloadAccessoryUrl);
    }

    /**
     * 附件下载地址
     *
     * 附件下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDownloadAccessoryUrlRequest 请求对象
     * @return AsyncInvoker<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse>
     */
    public AsyncInvoker<ShowDownloadAccessoryUrlRequest, ShowDownloadAccessoryUrlResponse> showDownloadAccessoryUrlAsyncInvoker(
        ShowDownloadAccessoryUrlRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showDownloadAccessoryUrl, hcClient);
    }

    /**
     * 查看最新发布版本协议详情
     *
     * 查看最新发布版本协议详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestPublishedAgreementRequest 请求对象
     * @return CompletableFuture<ShowLatestPublishedAgreementResponse>
     */
    public CompletableFuture<ShowLatestPublishedAgreementResponse> showLatestPublishedAgreementAsync(
        ShowLatestPublishedAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showLatestPublishedAgreement);
    }

    /**
     * 查看最新发布版本协议详情
     *
     * 查看最新发布版本协议详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestPublishedAgreementRequest 请求对象
     * @return AsyncInvoker<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse>
     */
    public AsyncInvoker<ShowLatestPublishedAgreementRequest, ShowLatestPublishedAgreementResponse> showLatestPublishedAgreementAsyncInvoker(
        ShowLatestPublishedAgreementRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showLatestPublishedAgreement, hcClient);
    }

    /**
     * 查询登录类型
     *
     * 查询登录类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginTypeRequest 请求对象
     * @return CompletableFuture<ShowLoginTypeResponse>
     */
    public CompletableFuture<ShowLoginTypeResponse> showLoginTypeAsync(ShowLoginTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showLoginType);
    }

    /**
     * 查询登录类型
     *
     * 查询登录类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoginTypeRequest 请求对象
     * @return AsyncInvoker<ShowLoginTypeRequest, ShowLoginTypeResponse>
     */
    public AsyncInvoker<ShowLoginTypeRequest, ShowLoginTypeResponse> showLoginTypeAsyncInvoker(
        ShowLoginTypeRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showLoginType, hcClient);
    }

    /**
     * 查询伙伴工单权限
     *
     * 查询伙伴工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersCasesPrivilegeRequest 请求对象
     * @return CompletableFuture<ShowPartnersCasesPrivilegeResponse>
     */
    public CompletableFuture<ShowPartnersCasesPrivilegeResponse> showPartnersCasesPrivilegeAsync(
        ShowPartnersCasesPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showPartnersCasesPrivilege);
    }

    /**
     * 查询伙伴工单权限
     *
     * 查询伙伴工单权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersCasesPrivilegeRequest 请求对象
     * @return AsyncInvoker<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse>
     */
    public AsyncInvoker<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> showPartnersCasesPrivilegeAsyncInvoker(
        ShowPartnersCasesPrivilegeRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showPartnersCasesPrivilege, hcClient);
    }

    /**
     * 查询关联伙伴服务信息
     *
     * 查询关联伙伴服务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersServiceInfoRequest 请求对象
     * @return CompletableFuture<ShowPartnersServiceInfoResponse>
     */
    public CompletableFuture<ShowPartnersServiceInfoResponse> showPartnersServiceInfoAsync(
        ShowPartnersServiceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showPartnersServiceInfo);
    }

    /**
     * 查询关联伙伴服务信息
     *
     * 查询关联伙伴服务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPartnersServiceInfoRequest 请求对象
     * @return AsyncInvoker<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse>
     */
    public AsyncInvoker<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> showPartnersServiceInfoAsyncInvoker(
        ShowPartnersServiceInfoRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showPartnersServiceInfo, hcClient);
    }

    /**
     * 查询语料详情
     *
     * 查询指定语料的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairDetailRequest 请求对象
     * @return CompletableFuture<ShowQaPairDetailResponse>
     */
    public CompletableFuture<ShowQaPairDetailResponse> showQaPairDetailAsync(ShowQaPairDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showQaPairDetail);
    }

    /**
     * 查询语料详情
     *
     * 查询指定语料的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairDetailRequest 请求对象
     * @return AsyncInvoker<ShowQaPairDetailRequest, ShowQaPairDetailResponse>
     */
    public AsyncInvoker<ShowQaPairDetailRequest, ShowQaPairDetailResponse> showQaPairDetailAsyncInvoker(
        ShowQaPairDetailRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showQaPairDetail, hcClient);
    }

    /**
     * 查询语料
     *
     * 查询满足指定条件的语料列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairsRequest 请求对象
     * @return CompletableFuture<ShowQaPairsResponse>
     */
    public CompletableFuture<ShowQaPairsResponse> showQaPairsAsync(ShowQaPairsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showQaPairs);
    }

    /**
     * 查询语料
     *
     * 查询满足指定条件的语料列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQaPairsRequest 请求对象
     * @return AsyncInvoker<ShowQaPairsRequest, ShowQaPairsResponse>
     */
    public AsyncInvoker<ShowQaPairsRequest, ShowQaPairsResponse> showQaPairsAsyncInvoker(ShowQaPairsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showQaPairs, hcClient);
    }

    /**
     * 查询用户是否签署最新协议
     *
     * 查询用户是否签署最新协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSignedLatestPublishedAgreementRequest 请求对象
     * @return CompletableFuture<ShowSignedLatestPublishedAgreementResponse>
     */
    public CompletableFuture<ShowSignedLatestPublishedAgreementResponse> showSignedLatestPublishedAgreementAsync(
        ShowSignedLatestPublishedAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showSignedLatestPublishedAgreement);
    }

    /**
     * 查询用户是否签署最新协议
     *
     * 查询用户是否签署最新协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSignedLatestPublishedAgreementRequest 请求对象
     * @return AsyncInvoker<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse>
     */
    public AsyncInvoker<ShowSignedLatestPublishedAgreementRequest, ShowSignedLatestPublishedAgreementResponse> showSignedLatestPublishedAgreementAsyncInvoker(
        ShowSignedLatestPublishedAgreementRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showSignedLatestPublishedAgreement, hcClient);
    }

    /**
     * 产品类型转为主题
     *
     * 产品类型转为主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowThemeRequest 请求对象
     * @return CompletableFuture<ShowThemeResponse>
     */
    public CompletableFuture<ShowThemeResponse> showThemeAsync(ShowThemeRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showTheme);
    }

    /**
     * 产品类型转为主题
     *
     * 产品类型转为主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowThemeRequest 请求对象
     * @return AsyncInvoker<ShowThemeRequest, ShowThemeResponse>
     */
    public AsyncInvoker<ShowThemeRequest, ShowThemeResponse> showThemeAsyncInvoker(ShowThemeRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.showTheme, hcClient);
    }

    /**
     * 签署协议
     *
     * 签署协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignPublishedAgreementRequest 请求对象
     * @return CompletableFuture<SignPublishedAgreementResponse>
     */
    public CompletableFuture<SignPublishedAgreementResponse> signPublishedAgreementAsync(
        SignPublishedAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.signPublishedAgreement);
    }

    /**
     * 签署协议
     *
     * 签署协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignPublishedAgreementRequest 请求对象
     * @return AsyncInvoker<SignPublishedAgreementRequest, SignPublishedAgreementResponse>
     */
    public AsyncInvoker<SignPublishedAgreementRequest, SignPublishedAgreementResponse> signPublishedAgreementAsyncInvoker(
        SignPublishedAgreementRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.signPublishedAgreement, hcClient);
    }

    /**
     * 拒绝|撤销授权
     *
     * 拒绝|撤销授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorizationsRequest 请求对象
     * @return CompletableFuture<UpdateAuthorizationsResponse>
     */
    public CompletableFuture<UpdateAuthorizationsResponse> updateAuthorizationsAsync(
        UpdateAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateAuthorizations);
    }

    /**
     * 拒绝|撤销授权
     *
     * 拒绝|撤销授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthorizationsRequest 请求对象
     * @return AsyncInvoker<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse>
     */
    public AsyncInvoker<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> updateAuthorizationsAsyncInvoker(
        UpdateAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.updateAuthorizations, hcClient);
    }

    /**
     * 修改联系方式
     *
     * 修改联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCaseContactInfoRequest 请求对象
     * @return CompletableFuture<UpdateCaseContactInfoResponse>
     */
    public CompletableFuture<UpdateCaseContactInfoResponse> updateCaseContactInfoAsync(
        UpdateCaseContactInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateCaseContactInfo);
    }

    /**
     * 修改联系方式
     *
     * 修改联系方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCaseContactInfoRequest 请求对象
     * @return AsyncInvoker<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse>
     */
    public AsyncInvoker<UpdateCaseContactInfoRequest, UpdateCaseContactInfoResponse> updateCaseContactInfoAsyncInvoker(
        UpdateCaseContactInfoRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.updateCaseContactInfo, hcClient);
    }

    /**
     * 工单操作
     *
     * 工单操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCasesRequest 请求对象
     * @return CompletableFuture<UpdateCasesResponse>
     */
    public CompletableFuture<UpdateCasesResponse> updateCasesAsync(UpdateCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateCases);
    }

    /**
     * 工单操作
     *
     * 工单操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCasesRequest 请求对象
     * @return AsyncInvoker<UpdateCasesRequest, UpdateCasesResponse>
     */
    public AsyncInvoker<UpdateCasesRequest, UpdateCasesResponse> updateCasesAsyncInvoker(UpdateCasesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.updateCases, hcClient);
    }

    /**
     * 修改标签
     *
     * 修改标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLabelsRequest 请求对象
     * @return CompletableFuture<UpdateLabelsResponse>
     */
    public CompletableFuture<UpdateLabelsResponse> updateLabelsAsync(UpdateLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateLabels);
    }

    /**
     * 修改标签
     *
     * 修改标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLabelsRequest 请求对象
     * @return AsyncInvoker<UpdateLabelsRequest, UpdateLabelsResponse>
     */
    public AsyncInvoker<UpdateLabelsRequest, UpdateLabelsResponse> updateLabelsAsyncInvoker(
        UpdateLabelsRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.updateLabels, hcClient);
    }

    /**
     * 设置消息已读
     *
     * 设置消息已读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewInstantMessagesReadRequest 请求对象
     * @return CompletableFuture<UpdateNewInstantMessagesReadResponse>
     */
    public CompletableFuture<UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesReadAsync(
        UpdateNewInstantMessagesReadRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateNewInstantMessagesRead);
    }

    /**
     * 设置消息已读
     *
     * 设置消息已读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewInstantMessagesReadRequest 请求对象
     * @return AsyncInvoker<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse>
     */
    public AsyncInvoker<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesReadAsyncInvoker(
        UpdateNewInstantMessagesReadRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.updateNewInstantMessagesRead, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件给SDK使用，上传附件需要满足\&quot;附件限制\&quot;返回的关于大小等限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJsonAccessoriesRequest 请求对象
     * @return CompletableFuture<UploadJsonAccessoriesResponse>
     */
    public CompletableFuture<UploadJsonAccessoriesResponse> uploadJsonAccessoriesAsync(
        UploadJsonAccessoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.uploadJsonAccessories);
    }

    /**
     * 上传附件
     *
     * 上传附件给SDK使用，上传附件需要满足\&quot;附件限制\&quot;返回的关于大小等限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJsonAccessoriesRequest 请求对象
     * @return AsyncInvoker<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse>
     */
    public AsyncInvoker<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> uploadJsonAccessoriesAsyncInvoker(
        UploadJsonAccessoriesRequest request) {
        return new AsyncInvoker<>(request, OsmMeta.uploadJsonAccessories, hcClient);
    }

}
