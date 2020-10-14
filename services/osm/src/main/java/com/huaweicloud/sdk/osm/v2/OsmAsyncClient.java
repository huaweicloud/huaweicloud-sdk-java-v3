package com.huaweicloud.sdk.osm.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.osm.v2.model.*;

public class OsmAsyncClient {
    protected HcClient hcClient;

    public OsmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OsmAsyncClient> newBuilder() {
        return new ClientBuilder<>(OsmAsyncClient::new, "GlobalCredentials");
    }


    /**
     * 验证授权主机
     * 验证授权主机密码是否正确
     *
     * @param CheckHostsRequest 请求对象
     * @return CompletableFuture<CheckHostsResponse>
     */
    public CompletableFuture<CheckHostsResponse> checkHostsAsync(CheckHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.checkHosts);
    }

    /**
     * 是否需要验证
     * 是否需要验证
     *
     * @param CheckNeedVerifyRequest 请求对象
     * @return CompletableFuture<CheckNeedVerifyResponse>
     */
    public CompletableFuture<CheckNeedVerifyResponse> checkNeedVerifyAsync(CheckNeedVerifyRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.checkNeedVerify);
    }

    /**
     * 验证联系方式
     * 验证联系方式
     *
     * @param CheckVerifyCodesRequest 请求对象
     * @return CompletableFuture<CheckVerifyCodesResponse>
     */
    public CompletableFuture<CheckVerifyCodesResponse> checkVerifyCodesAsync(CheckVerifyCodesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.checkVerifyCodes);
    }

    /**
     * 租户确认授权
     * 租户确认授权
     *
     * @param ConfirmAuthorizationsRequest 请求对象
     * @return CompletableFuture<ConfirmAuthorizationsResponse>
     */
    public CompletableFuture<ConfirmAuthorizationsResponse> confirmAuthorizationsAsync(ConfirmAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.confirmAuthorizations);
    }

    /**
     * 创建授权
     * 创建授权
     *
     * @param CreateAuthorizationsRequest 请求对象
     * @return CompletableFuture<CreateAuthorizationsResponse>
     */
    public CompletableFuture<CreateAuthorizationsResponse> createAuthorizationsAsync(CreateAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createAuthorizations);
    }

    /**
     * 添加工单关联标签接口
     * 添加工单关联标签接口
     *
     * @param CreateCaseLabelsRequest 请求对象
     * @return CompletableFuture<CreateCaseLabelsResponse>
     */
    public CompletableFuture<CreateCaseLabelsResponse> createCaseLabelsAsync(CreateCaseLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createCaseLabels);
    }

    /**
     * 创建工单
     * 创建工单
     *
     * @param CreateCasesRequest 请求对象
     * @return CompletableFuture<CreateCasesResponse>
     */
    public CompletableFuture<CreateCasesResponse> createCasesAsync(CreateCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createCases);
    }

    /**
     * 创建标签
     * 创建标签
     *
     * @param CreateLabelsRequest 请求对象
     * @return CompletableFuture<CreateLabelsResponse>
     */
    public CompletableFuture<CreateLabelsResponse> createLabelsAsync(CreateLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createLabels);
    }

    /**
     * 提交留言
     * 提交留言
     *
     * @param CreateMessagesRequest 请求对象
     * @return CompletableFuture<CreateMessagesResponse>
     */
    public CompletableFuture<CreateMessagesResponse> createMessagesAsync(CreateMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createMessages);
    }

    /**
     * 创建授权
     * 创建授权
     *
     * @param CreatePrivilegesRequest 请求对象
     * @return CompletableFuture<CreatePrivilegesResponse>
     */
    public CompletableFuture<CreatePrivilegesResponse> createPrivilegesAsync(CreatePrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createPrivileges);
    }

    /**
     * 创建关联
     * 创建关联，一个工单最多支持3个关联
     *
     * @param CreateRelationsRequest 请求对象
     * @return CompletableFuture<CreateRelationsResponse>
     */
    public CompletableFuture<CreateRelationsResponse> createRelationsAsync(CreateRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createRelations);
    }

    /**
     * 提交评分
     * 提交评分
     *
     * @param CreateScoresRequest 请求对象
     * @return CompletableFuture<CreateScoresResponse>
     */
    public CompletableFuture<CreateScoresResponse> createScoresAsync(CreateScoresRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.createScores);
    }

    /**
     * 删除附件
     * 删除附件
     *
     * @param DeleteAccessoriesRequest 请求对象
     * @return CompletableFuture<DeleteAccessoriesResponse>
     */
    public CompletableFuture<DeleteAccessoriesResponse> deleteAccessoriesAsync(DeleteAccessoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteAccessories);
    }

    /**
     * 删除工单关联标签接口
     * 删除指定工单关联标签接口
     *
     * @param DeleteCaseLabelsRequest 请求对象
     * @return CompletableFuture<DeleteCaseLabelsResponse>
     */
    public CompletableFuture<DeleteCaseLabelsResponse> deleteCaseLabelsAsync(DeleteCaseLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteCaseLabels);
    }

    /**
     * 删除标签
     * 删除标签，同时会删除工单与标签关联关系
     *
     * @param DeleteLabelsRequest 请求对象
     * @return CompletableFuture<DeleteLabelsResponse>
     */
    public CompletableFuture<DeleteLabelsResponse> deleteLabelsAsync(DeleteLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteLabels);
    }

    /**
     * 删除关联
     * 删除关联
     *
     * @param DeleteRelationRequest 请求对象
     * @return CompletableFuture<DeleteRelationResponse>
     */
    public CompletableFuture<DeleteRelationResponse> deleteRelationAsync(DeleteRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.deleteRelation);
    }

    /**
     * 下载附件
     * 下载附件
     *
     * @param DownloadAccessoriesRequest 请求对象
     * @return CompletableFuture<DownloadAccessoriesResponse>
     */
    public CompletableFuture<DownloadAccessoriesResponse> downloadAccessoriesAsync(DownloadAccessoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.downloadAccessories);
    }

    /**
     * 工单导出
     * 工单导出
     *
     * @param DownloadCasesRequest 请求对象
     * @return CompletableFuture<DownloadCasesResponse>
     */
    public CompletableFuture<DownloadCasesResponse> downloadCasesAsync(DownloadCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.downloadCases);
    }

    /**
     * 图片展示
     * 返回图片内容，用于页面直接展示
     *
     * @param DownloadImagesRequest 请求对象
     * @return CompletableFuture<DownloadImagesResponse>
     */
    public CompletableFuture<DownloadImagesResponse> downloadImagesAsync(DownloadImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.downloadImages);
    }

    /**
     * 查询委托
     * 查询委托
     *
     * @param ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse>
     */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listAgencies);
    }

    /**
     * 查询国家码
     * 查询国家码，用于提交工单页面填写联系方式使用
     *
     * @param ListAreaCodesRequest 请求对象
     * @return CompletableFuture<ListAreaCodesResponse>
     */
    public CompletableFuture<ListAreaCodesResponse> listAreaCodesAsync(ListAreaCodesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listAreaCodes);
    }

    /**
     * 查看授权列表
     * 查询授权列表
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return CompletableFuture<ListAuthorizationsResponse>
     */
    public CompletableFuture<ListAuthorizationsResponse> listAuthorizationsAsync(ListAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listAuthorizations);
    }

    /**
     * 查询工单抄送邮箱
     * 查询工单抄送邮箱
     *
     * @param ListCaseCCEmailsRequest 请求对象
     * @return CompletableFuture<ListCaseCCEmailsResponse>
     */
    public CompletableFuture<ListCaseCCEmailsResponse> listCaseCCEmailsAsync(ListCaseCCEmailsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseCCEmails);
    }

    /**
     * 查询工单类目列表
     * 查询工单类目列表
     *
     * @param ListCaseCategoriesRequest 请求对象
     * @return CompletableFuture<ListCaseCategoriesResponse>
     */
    public CompletableFuture<ListCaseCategoriesResponse> listCaseCategoriesAsync(ListCaseCategoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseCategories);
    }

    /**
     * 统计各状态工单数量
     * 统计各状态工单数量
     *
     * @param ListCaseCountsRequest 请求对象
     * @return CompletableFuture<ListCaseCountsResponse>
     */
    public CompletableFuture<ListCaseCountsResponse> listCaseCountsAsync(ListCaseCountsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseCounts);
    }

    /**
     * 查询工单关联标签接口
     * 查询工单关联标签接口
     *
     * @param ListCaseLabelsRequest 请求对象
     * @return CompletableFuture<ListCaseLabelsResponse>
     */
    public CompletableFuture<ListCaseLabelsResponse> listCaseLabelsAsync(ListCaseLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseLabels);
    }

    /**
     * 查询工单限制，比如抄送邮箱个数等
     * 查询工单限制，比如抄送邮箱个数等
     *
     * @param ListCaseLimitsRequest 请求对象
     * @return CompletableFuture<ListCaseLimitsResponse>
     */
    public CompletableFuture<ListCaseLimitsResponse> listCaseLimitsAsync(ListCaseLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseLimits);
    }

    /**
     * 查询工单操作日志
     * 查询工单操作日志
     *
     * @param ListCaseOperateLogsRequest 请求对象
     * @return CompletableFuture<ListCaseOperateLogsResponse>
     */
    public CompletableFuture<ListCaseOperateLogsResponse> listCaseOperateLogsAsync(ListCaseOperateLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseOperateLogs);
    }

    /**
     * 查询工单配额
     * 查询工单配额
     *
     * @param ListCaseQuotasRequest 请求对象
     * @return CompletableFuture<ListCaseQuotasResponse>
     */
    public CompletableFuture<ListCaseQuotasResponse> listCaseQuotasAsync(ListCaseQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseQuotas);
    }

    /**
     * 查询问题类型对应模板
     * 查询问题类型对应模板
     *
     * @param ListCaseTemplatesRequest 请求对象
     * @return CompletableFuture<ListCaseTemplatesResponse>
     */
    public CompletableFuture<ListCaseTemplatesResponse> listCaseTemplatesAsync(ListCaseTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCaseTemplates);
    }

    /**
     * 查询工单列表接口
     * 查询工单列表接口
     *
     * @param ListCasesRequest 请求对象
     * @return CompletableFuture<ListCasesResponse>
     */
    public CompletableFuture<ListCasesResponse> listCasesAsync(ListCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listCases);
    }

    /**
     * 查询附加参数
     * 提单时，根据不同的产品或者问题类型，会存在不同的一些附加参数填写
     *
     * @param ListExtendsParamsRequest 请求对象
     * @return CompletableFuture<ListExtendsParamsResponse>
     */
    public CompletableFuture<ListExtendsParamsResponse> listExtendsParamsAsync(ListExtendsParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listExtendsParams);
    }

    /**
     * 查询已验证的列表
     * 查询已验证的列表
     *
     * @param ListHasVerifiedContactsRequest 请求对象
     * @return CompletableFuture<ListHasVerifiedContactsResponse>
     */
    public CompletableFuture<ListHasVerifiedContactsResponse> listHasVerifiedContactsAsync(ListHasVerifiedContactsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listHasVerifiedContacts);
    }

    /**
     * 查询历史操作记录
     * 查询历史操作记录
     *
     * @param ListHistoryOperateLogsRequest 请求对象
     * @return CompletableFuture<ListHistoryOperateLogsResponse>
     */
    public CompletableFuture<ListHistoryOperateLogsResponse> listHistoryOperateLogsAsync(ListHistoryOperateLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listHistoryOperateLogs);
    }

    /**
     * 查询历史会话列表
     * 查询历史会话列
     *
     * @param ListHistorySessionsRequest 请求对象
     * @return CompletableFuture<ListHistorySessionsResponse>
     */
    public CompletableFuture<ListHistorySessionsResponse> listHistorySessionsAsync(ListHistorySessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listHistorySessions);
    }

    /**
     * 查询标签
     * 查询标签
     *
     * @param ListLabelsRequest 请求对象
     * @return CompletableFuture<ListLabelsResponse>
     */
    public CompletableFuture<ListLabelsResponse> listLabelsAsync(ListLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listLabels);
    }

    /**
     * 查询留言
     * 查询留言
     *
     * @param ListMessagesRequest 请求对象
     * @return CompletableFuture<ListMessagesResponse>
     */
    public CompletableFuture<ListMessagesResponse> listMessagesAsync(ListMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listMessages);
    }

    /**
     * 查询更多
     * 查询更多
     *
     * @param ListMoreInstantMessagesRequest 请求对象
     * @return CompletableFuture<ListMoreInstantMessagesResponse>
     */
    public CompletableFuture<ListMoreInstantMessagesResponse> listMoreInstantMessagesAsync(ListMoreInstantMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listMoreInstantMessages);
    }

    /**
     * 轮询查询即时消息
     * 轮询查询即时消息接口
     *
     * @param ListNewInstantMessagesRequest 请求对象
     * @return CompletableFuture<ListNewInstantMessagesResponse>
     */
    public CompletableFuture<ListNewInstantMessagesResponse> listNewInstantMessagesAsync(ListNewInstantMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listNewInstantMessages);
    }

    /**
     * 查询工单权限
     * 查询工单权限
     *
     * @param ListPrivilegesRequest 请求对象
     * @return CompletableFuture<ListPrivilegesResponse>
     */
    public CompletableFuture<ListPrivilegesResponse> listPrivilegesAsync(ListPrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listPrivileges);
    }

    /**
     * 查询问题类型列表
     * 提交工单时，选择产品类型之后选择对应的问题列表
     *
     * @param ListProblemTypesRequest 请求对象
     * @return CompletableFuture<ListProblemTypesResponse>
     */
    public CompletableFuture<ListProblemTypesResponse> listProblemTypesAsync(ListProblemTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listProblemTypes);
    }

    /**
     * 查询产品类型列表
     * 查询产品类型列表
     *
     * @param ListProductCategoriesRequest 请求对象
     * @return CompletableFuture<ListProductCategoriesResponse>
     */
    public CompletableFuture<ListProductCategoriesResponse> listProductCategoriesAsync(ListProductCategoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listProductCategories);
    }

    /**
     * 查询区域列表
     * 查询区域列表
     *
     * @param ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listRegions);
    }

    /**
     * 查询关联
     * 查询工单的关联，返回关联工单的简要信息
     *
     * @param ListRelationRequest 请求对象
     * @return CompletableFuture<ListRelationResponse>
     */
    public CompletableFuture<ListRelationResponse> listRelationAsync(ListRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listRelation);
    }

    /**
     * 工单满意度分类列表
     * 工单满意度分类列表
     *
     * @param ListSatisfactionDimensionsRequest 请求对象
     * @return CompletableFuture<ListSatisfactionDimensionsResponse>
     */
    public CompletableFuture<ListSatisfactionDimensionsResponse> listSatisfactionDimensionsAsync(ListSatisfactionDimensionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listSatisfactionDimensions);
    }

    /**
     * 查询问题严重性列表
     * 查询问题严重性列表
     *
     * @param ListSeveritiesRequest 请求对象
     * @return CompletableFuture<ListSeveritiesResponse>
     */
    public CompletableFuture<ListSeveritiesResponse> listSeveritiesAsync(ListSeveritiesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listSeverities);
    }

    /**
     * 查询子用户信息
     * 查询子用户信息
     *
     * @param ListSubCustomersRequest 请求对象
     * @return CompletableFuture<ListSubCustomersResponse>
     */
    public CompletableFuture<ListSubCustomersResponse> listSubCustomersAsync(ListSubCustomersRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listSubCustomers);
    }

    /**
     * 查询文件传输记录
     * 查询文件传输记录
     *
     * @param ListTransportHistoriesRequest 请求对象
     * @return CompletableFuture<ListTransportHistoriesResponse>
     */
    public CompletableFuture<ListTransportHistoriesResponse> listTransportHistoriesAsync(ListTransportHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listTransportHistories);
    }

    /**
     * 查询未读消息
     * 查询未读消息
     *
     * @param ListUnreadNewInstantMessagesRequest 请求对象
     * @return CompletableFuture<ListUnreadNewInstantMessagesResponse>
     */
    public CompletableFuture<ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessagesAsync(ListUnreadNewInstantMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.listUnreadNewInstantMessages);
    }

    /**
     * 获取验证码
     * 获取验证码
     *
     * @param SendVerifyCodesRequest 请求对象
     * @return CompletableFuture<SendVerifyCodesResponse>
     */
    public CompletableFuture<SendVerifyCodesResponse> sendVerifyCodesAsync(SendVerifyCodesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.sendVerifyCodes);
    }

    /**
     * 附件限制
     * 查询附件的一下限制，比如大小，数量，文件类型
     *
     * @param ShowAccessoryLimitsRequest 请求对象
     * @return CompletableFuture<ShowAccessoryLimitsResponse>
     */
    public CompletableFuture<ShowAccessoryLimitsResponse> showAccessoryLimitsAsync(ShowAccessoryLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showAccessoryLimits);
    }

    /**
     * 查询授权详情
     * 查询授权详情
     *
     * @param ShowAuthorizationDetailRequest 请求对象
     * @return CompletableFuture<ShowAuthorizationDetailResponse>
     */
    public CompletableFuture<ShowAuthorizationDetailResponse> showAuthorizationDetailAsync(ShowAuthorizationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showAuthorizationDetail);
    }

    /**
     * 查询工单详情
     * 查询工单详情
     *
     * @param ShowCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowCaseDetailResponse>
     */
    public CompletableFuture<ShowCaseDetailResponse> showCaseDetailAsync(ShowCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showCaseDetail);
    }

    /**
     * 查询某个工单状态
     * 查询某个工单状态
     *
     * @param ShowCaseStatusRequest 请求对象
     * @return CompletableFuture<ShowCaseStatusResponse>
     */
    public CompletableFuture<ShowCaseStatusResponse> showCaseStatusAsync(ShowCaseStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showCaseStatus);
    }

    /**
     * 查询伙伴处理工单权限
     * 查询伙伴处理工单权限
     *
     * @param ShowPartnersCasesProcessingPrivilegeRequest 请求对象
     * @return CompletableFuture<ShowPartnersCasesProcessingPrivilegeResponse>
     */
    public CompletableFuture<ShowPartnersCasesProcessingPrivilegeResponse> showPartnersCasesProcessingPrivilegeAsync(ShowPartnersCasesProcessingPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showPartnersCasesProcessingPrivilege);
    }

    /**
     * 查询关联伙伴服务信息
     * 查询关联伙伴服务信息
     *
     * @param ShowPartnersServiceInfoRequest 请求对象
     * @return CompletableFuture<ShowPartnersServiceInfoResponse>
     */
    public CompletableFuture<ShowPartnersServiceInfoResponse> showPartnersServiceInfoAsync(ShowPartnersServiceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.showPartnersServiceInfo);
    }

    /**
     * 拒绝|撤销授权
     * 拒绝|撤销授权
     *
     * @param UpdateAuthorizationsRequest 请求对象
     * @return CompletableFuture<UpdateAuthorizationsResponse>
     */
    public CompletableFuture<UpdateAuthorizationsResponse> updateAuthorizationsAsync(UpdateAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateAuthorizations);
    }

    /**
     * 工单操作
     * 工单操作
     *
     * @param UpdateCasesRequest 请求对象
     * @return CompletableFuture<UpdateCasesResponse>
     */
    public CompletableFuture<UpdateCasesResponse> updateCasesAsync(UpdateCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateCases);
    }

    /**
     * 修改标签
     * 修改标签
     *
     * @param UpdateLabelsRequest 请求对象
     * @return CompletableFuture<UpdateLabelsResponse>
     */
    public CompletableFuture<UpdateLabelsResponse> updateLabelsAsync(UpdateLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateLabels);
    }

    /**
     * 设置消息已读
     * 设置消息已读
     *
     * @param UpdateNewInstantMessagesReadRequest 请求对象
     * @return CompletableFuture<UpdateNewInstantMessagesReadResponse>
     */
    public CompletableFuture<UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesReadAsync(UpdateNewInstantMessagesReadRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.updateNewInstantMessagesRead);
    }

    /**
     * 上传附件
     * 上传附件给SDK使用
     *
     * @param UploadJsonAccessoriesRequest 请求对象
     * @return CompletableFuture<UploadJsonAccessoriesResponse>
     */
    public CompletableFuture<UploadJsonAccessoriesResponse> uploadJsonAccessoriesAsync(UploadJsonAccessoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, OsmMeta.uploadJsonAccessories);
    }

}