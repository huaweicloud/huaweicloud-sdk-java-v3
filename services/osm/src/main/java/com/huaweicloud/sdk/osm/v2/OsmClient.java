package com.huaweicloud.sdk.osm.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.osm.v2.model.*;

public class OsmClient {
    protected HcClient hcClient;

    public OsmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OsmClient> newBuilder() {
        return new ClientBuilder<>(OsmClient::new, "GlobalCredentials");
    }


    /**
     * 验证授权主机
     * 验证授权主机密码是否正确
     *
     * @param CheckHostsRequest 请求对象
     * @return CheckHostsResponse
     */
    public CheckHostsResponse checkHosts(CheckHostsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.checkHosts);
    }

    /**
     * 是否需要验证
     * 是否需要验证
     *
     * @param CheckNeedVerifyRequest 请求对象
     * @return CheckNeedVerifyResponse
     */
    public CheckNeedVerifyResponse checkNeedVerify(CheckNeedVerifyRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.checkNeedVerify);
    }

    /**
     * 验证联系方式
     * 验证联系方式
     *
     * @param CheckVerifyCodesRequest 请求对象
     * @return CheckVerifyCodesResponse
     */
    public CheckVerifyCodesResponse checkVerifyCodes(CheckVerifyCodesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.checkVerifyCodes);
    }

    /**
     * 租户确认授权
     * 租户确认授权
     *
     * @param ConfirmAuthorizationsRequest 请求对象
     * @return ConfirmAuthorizationsResponse
     */
    public ConfirmAuthorizationsResponse confirmAuthorizations(ConfirmAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.confirmAuthorizations);
    }

    /**
     * 创建授权
     * 创建授权
     *
     * @param CreateAuthorizationsRequest 请求对象
     * @return CreateAuthorizationsResponse
     */
    public CreateAuthorizationsResponse createAuthorizations(CreateAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createAuthorizations);
    }

    /**
     * 添加工单关联标签接口
     * 添加工单关联标签接口
     *
     * @param CreateCaseLabelsRequest 请求对象
     * @return CreateCaseLabelsResponse
     */
    public CreateCaseLabelsResponse createCaseLabels(CreateCaseLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createCaseLabels);
    }

    /**
     * 创建工单
     * 创建工单
     *
     * @param CreateCasesRequest 请求对象
     * @return CreateCasesResponse
     */
    public CreateCasesResponse createCases(CreateCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createCases);
    }

    /**
     * 创建标签
     * 创建标签
     *
     * @param CreateLabelsRequest 请求对象
     * @return CreateLabelsResponse
     */
    public CreateLabelsResponse createLabels(CreateLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createLabels);
    }

    /**
     * 提交留言
     * 提交留言
     *
     * @param CreateMessagesRequest 请求对象
     * @return CreateMessagesResponse
     */
    public CreateMessagesResponse createMessages(CreateMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createMessages);
    }

    /**
     * 创建授权
     * 创建授权
     *
     * @param CreatePrivilegesRequest 请求对象
     * @return CreatePrivilegesResponse
     */
    public CreatePrivilegesResponse createPrivileges(CreatePrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createPrivileges);
    }

    /**
     * 创建关联
     * 创建关联，一个工单最多支持3个关联
     *
     * @param CreateRelationsRequest 请求对象
     * @return CreateRelationsResponse
     */
    public CreateRelationsResponse createRelations(CreateRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createRelations);
    }

    /**
     * 提交评分
     * 提交评分
     *
     * @param CreateScoresRequest 请求对象
     * @return CreateScoresResponse
     */
    public CreateScoresResponse createScores(CreateScoresRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.createScores);
    }

    /**
     * 删除附件
     * 删除附件
     *
     * @param DeleteAccessoriesRequest 请求对象
     * @return DeleteAccessoriesResponse
     */
    public DeleteAccessoriesResponse deleteAccessories(DeleteAccessoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteAccessories);
    }

    /**
     * 删除工单关联标签接口
     * 删除指定工单关联标签接口
     *
     * @param DeleteCaseLabelsRequest 请求对象
     * @return DeleteCaseLabelsResponse
     */
    public DeleteCaseLabelsResponse deleteCaseLabels(DeleteCaseLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteCaseLabels);
    }

    /**
     * 删除标签
     * 删除标签，同时会删除工单与标签关联关系
     *
     * @param DeleteLabelsRequest 请求对象
     * @return DeleteLabelsResponse
     */
    public DeleteLabelsResponse deleteLabels(DeleteLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteLabels);
    }

    /**
     * 删除关联
     * 删除关联
     *
     * @param DeleteRelationRequest 请求对象
     * @return DeleteRelationResponse
     */
    public DeleteRelationResponse deleteRelation(DeleteRelationRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.deleteRelation);
    }

    /**
     * 下载附件
     * 下载附件
     *
     * @param DownloadAccessoriesRequest 请求对象
     * @return DownloadAccessoriesResponse
     */
    public DownloadAccessoriesResponse downloadAccessories(DownloadAccessoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.downloadAccessories);
    }

    /**
     * 工单导出
     * 工单导出
     *
     * @param DownloadCasesRequest 请求对象
     * @return DownloadCasesResponse
     */
    public DownloadCasesResponse downloadCases(DownloadCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.downloadCases);
    }

    /**
     * 图片展示
     * 返回图片内容，用于页面直接展示
     *
     * @param DownloadImagesRequest 请求对象
     * @return DownloadImagesResponse
     */
    public DownloadImagesResponse downloadImages(DownloadImagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.downloadImages);
    }

    /**
     * 查询委托
     * 查询委托
     *
     * @param ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listAgencies);
    }

    /**
     * 查询国家码
     * 查询国家码，用于提交工单页面填写联系方式使用
     *
     * @param ListAreaCodesRequest 请求对象
     * @return ListAreaCodesResponse
     */
    public ListAreaCodesResponse listAreaCodes(ListAreaCodesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listAreaCodes);
    }

    /**
     * 查看授权列表
     * 查询授权列表
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return ListAuthorizationsResponse
     */
    public ListAuthorizationsResponse listAuthorizations(ListAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listAuthorizations);
    }

    /**
     * 查询工单抄送邮箱
     * 查询工单抄送邮箱
     *
     * @param ListCaseCCEmailsRequest 请求对象
     * @return ListCaseCCEmailsResponse
     */
    public ListCaseCCEmailsResponse listCaseCCEmails(ListCaseCCEmailsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseCCEmails);
    }

    /**
     * 查询工单类目列表
     * 查询工单类目列表
     *
     * @param ListCaseCategoriesRequest 请求对象
     * @return ListCaseCategoriesResponse
     */
    public ListCaseCategoriesResponse listCaseCategories(ListCaseCategoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseCategories);
    }

    /**
     * 统计各状态工单数量
     * 统计各状态工单数量
     *
     * @param ListCaseCountsRequest 请求对象
     * @return ListCaseCountsResponse
     */
    public ListCaseCountsResponse listCaseCounts(ListCaseCountsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseCounts);
    }

    /**
     * 查询工单关联标签接口
     * 查询工单关联标签接口
     *
     * @param ListCaseLabelsRequest 请求对象
     * @return ListCaseLabelsResponse
     */
    public ListCaseLabelsResponse listCaseLabels(ListCaseLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseLabels);
    }

    /**
     * 查询工单限制，比如抄送邮箱个数等
     * 查询工单限制，比如抄送邮箱个数等
     *
     * @param ListCaseLimitsRequest 请求对象
     * @return ListCaseLimitsResponse
     */
    public ListCaseLimitsResponse listCaseLimits(ListCaseLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseLimits);
    }

    /**
     * 查询工单操作日志
     * 查询工单操作日志
     *
     * @param ListCaseOperateLogsRequest 请求对象
     * @return ListCaseOperateLogsResponse
     */
    public ListCaseOperateLogsResponse listCaseOperateLogs(ListCaseOperateLogsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseOperateLogs);
    }

    /**
     * 查询工单配额
     * 查询工单配额
     *
     * @param ListCaseQuotasRequest 请求对象
     * @return ListCaseQuotasResponse
     */
    public ListCaseQuotasResponse listCaseQuotas(ListCaseQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseQuotas);
    }

    /**
     * 查询问题类型对应模板
     * 查询问题类型对应模板
     *
     * @param ListCaseTemplatesRequest 请求对象
     * @return ListCaseTemplatesResponse
     */
    public ListCaseTemplatesResponse listCaseTemplates(ListCaseTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseTemplates);
    }

    /**
     * 查询工单列表接口
     * 查询工单列表接口
     *
     * @param ListCasesRequest 请求对象
     * @return ListCasesResponse
     */
    public ListCasesResponse listCases(ListCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCases);
    }

    /**
     * 查询附加参数
     * 提单时，根据不同的产品或者问题类型，会存在不同的一些附加参数填写
     *
     * @param ListExtendsParamsRequest 请求对象
     * @return ListExtendsParamsResponse
     */
    public ListExtendsParamsResponse listExtendsParams(ListExtendsParamsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listExtendsParams);
    }

    /**
     * 查询已验证的列表
     * 查询已验证的列表
     *
     * @param ListHasVerifiedContactsRequest 请求对象
     * @return ListHasVerifiedContactsResponse
     */
    public ListHasVerifiedContactsResponse listHasVerifiedContacts(ListHasVerifiedContactsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHasVerifiedContacts);
    }

    /**
     * 查询历史操作记录
     * 查询历史操作记录
     *
     * @param ListHistoryOperateLogsRequest 请求对象
     * @return ListHistoryOperateLogsResponse
     */
    public ListHistoryOperateLogsResponse listHistoryOperateLogs(ListHistoryOperateLogsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHistoryOperateLogs);
    }

    /**
     * 查询历史会话列表
     * 查询历史会话列
     *
     * @param ListHistorySessionsRequest 请求对象
     * @return ListHistorySessionsResponse
     */
    public ListHistorySessionsResponse listHistorySessions(ListHistorySessionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHistorySessions);
    }

    /**
     * 查询标签
     * 查询标签
     *
     * @param ListLabelsRequest 请求对象
     * @return ListLabelsResponse
     */
    public ListLabelsResponse listLabels(ListLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listLabels);
    }

    /**
     * 查询留言
     * 查询留言
     *
     * @param ListMessagesRequest 请求对象
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessages(ListMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listMessages);
    }

    /**
     * 查询更多
     * 查询更多
     *
     * @param ListMoreInstantMessagesRequest 请求对象
     * @return ListMoreInstantMessagesResponse
     */
    public ListMoreInstantMessagesResponse listMoreInstantMessages(ListMoreInstantMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listMoreInstantMessages);
    }

    /**
     * 轮询查询即时消息
     * 轮询查询即时消息接口
     *
     * @param ListNewInstantMessagesRequest 请求对象
     * @return ListNewInstantMessagesResponse
     */
    public ListNewInstantMessagesResponse listNewInstantMessages(ListNewInstantMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listNewInstantMessages);
    }

    /**
     * 查询工单权限
     * 查询工单权限
     *
     * @param ListPrivilegesRequest 请求对象
     * @return ListPrivilegesResponse
     */
    public ListPrivilegesResponse listPrivileges(ListPrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listPrivileges);
    }

    /**
     * 查询问题类型列表
     * 提交工单时，选择产品类型之后选择对应的问题列表
     *
     * @param ListProblemTypesRequest 请求对象
     * @return ListProblemTypesResponse
     */
    public ListProblemTypesResponse listProblemTypes(ListProblemTypesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listProblemTypes);
    }

    /**
     * 查询产品类型列表
     * 查询产品类型列表
     *
     * @param ListProductCategoriesRequest 请求对象
     * @return ListProductCategoriesResponse
     */
    public ListProductCategoriesResponse listProductCategories(ListProductCategoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listProductCategories);
    }

    /**
     * 查询区域列表
     * 查询区域列表
     *
     * @param ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listRegions);
    }

    /**
     * 查询关联
     * 查询工单的关联，返回关联工单的简要信息
     *
     * @param ListRelationRequest 请求对象
     * @return ListRelationResponse
     */
    public ListRelationResponse listRelation(ListRelationRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listRelation);
    }

    /**
     * 工单满意度分类列表
     * 工单满意度分类列表
     *
     * @param ListSatisfactionDimensionsRequest 请求对象
     * @return ListSatisfactionDimensionsResponse
     */
    public ListSatisfactionDimensionsResponse listSatisfactionDimensions(ListSatisfactionDimensionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listSatisfactionDimensions);
    }

    /**
     * 查询问题严重性列表
     * 查询问题严重性列表
     *
     * @param ListSeveritiesRequest 请求对象
     * @return ListSeveritiesResponse
     */
    public ListSeveritiesResponse listSeverities(ListSeveritiesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listSeverities);
    }

    /**
     * 查询子用户信息
     * 查询子用户信息
     *
     * @param ListSubCustomersRequest 请求对象
     * @return ListSubCustomersResponse
     */
    public ListSubCustomersResponse listSubCustomers(ListSubCustomersRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listSubCustomers);
    }

    /**
     * 查询文件传输记录
     * 查询文件传输记录
     *
     * @param ListTransportHistoriesRequest 请求对象
     * @return ListTransportHistoriesResponse
     */
    public ListTransportHistoriesResponse listTransportHistories(ListTransportHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listTransportHistories);
    }

    /**
     * 查询未读消息
     * 查询未读消息
     *
     * @param ListUnreadNewInstantMessagesRequest 请求对象
     * @return ListUnreadNewInstantMessagesResponse
     */
    public ListUnreadNewInstantMessagesResponse listUnreadNewInstantMessages(ListUnreadNewInstantMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listUnreadNewInstantMessages);
    }

    /**
     * 获取验证码
     * 获取验证码
     *
     * @param SendVerifyCodesRequest 请求对象
     * @return SendVerifyCodesResponse
     */
    public SendVerifyCodesResponse sendVerifyCodes(SendVerifyCodesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.sendVerifyCodes);
    }

    /**
     * 附件限制
     * 查询附件的一下限制，比如大小，数量，文件类型
     *
     * @param ShowAccessoryLimitsRequest 请求对象
     * @return ShowAccessoryLimitsResponse
     */
    public ShowAccessoryLimitsResponse showAccessoryLimits(ShowAccessoryLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showAccessoryLimits);
    }

    /**
     * 查询授权详情
     * 查询授权详情
     *
     * @param ShowAuthorizationDetailRequest 请求对象
     * @return ShowAuthorizationDetailResponse
     */
    public ShowAuthorizationDetailResponse showAuthorizationDetail(ShowAuthorizationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showAuthorizationDetail);
    }

    /**
     * 查询工单详情
     * 查询工单详情
     *
     * @param ShowCaseDetailRequest 请求对象
     * @return ShowCaseDetailResponse
     */
    public ShowCaseDetailResponse showCaseDetail(ShowCaseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showCaseDetail);
    }

    /**
     * 查询某个工单状态
     * 查询某个工单状态
     *
     * @param ShowCaseStatusRequest 请求对象
     * @return ShowCaseStatusResponse
     */
    public ShowCaseStatusResponse showCaseStatus(ShowCaseStatusRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showCaseStatus);
    }

    /**
     * 查询伙伴处理工单权限
     * 查询伙伴处理工单权限
     *
     * @param ShowPartnersCasesProcessingPrivilegeRequest 请求对象
     * @return ShowPartnersCasesProcessingPrivilegeResponse
     */
    public ShowPartnersCasesProcessingPrivilegeResponse showPartnersCasesProcessingPrivilege(ShowPartnersCasesProcessingPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showPartnersCasesProcessingPrivilege);
    }

    /**
     * 查询关联伙伴服务信息
     * 查询关联伙伴服务信息
     *
     * @param ShowPartnersServiceInfoRequest 请求对象
     * @return ShowPartnersServiceInfoResponse
     */
    public ShowPartnersServiceInfoResponse showPartnersServiceInfo(ShowPartnersServiceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showPartnersServiceInfo);
    }

    /**
     * 拒绝|撤销授权
     * 拒绝|撤销授权
     *
     * @param UpdateAuthorizationsRequest 请求对象
     * @return UpdateAuthorizationsResponse
     */
    public UpdateAuthorizationsResponse updateAuthorizations(UpdateAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateAuthorizations);
    }

    /**
     * 工单操作
     * 工单操作
     *
     * @param UpdateCasesRequest 请求对象
     * @return UpdateCasesResponse
     */
    public UpdateCasesResponse updateCases(UpdateCasesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateCases);
    }

    /**
     * 修改标签
     * 修改标签
     *
     * @param UpdateLabelsRequest 请求对象
     * @return UpdateLabelsResponse
     */
    public UpdateLabelsResponse updateLabels(UpdateLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateLabels);
    }

    /**
     * 设置消息已读
     * 设置消息已读
     *
     * @param UpdateNewInstantMessagesReadRequest 请求对象
     * @return UpdateNewInstantMessagesReadResponse
     */
    public UpdateNewInstantMessagesReadResponse updateNewInstantMessagesRead(UpdateNewInstantMessagesReadRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.updateNewInstantMessagesRead);
    }

    /**
     * 上传附件
     * 上传附件给SDK使用
     *
     * @param UploadJsonAccessoriesRequest 请求对象
     * @return UploadJsonAccessoriesResponse
     */
    public UploadJsonAccessoriesResponse uploadJsonAccessories(UploadJsonAccessoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.uploadJsonAccessories);
    }

}