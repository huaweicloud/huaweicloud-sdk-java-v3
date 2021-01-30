package com.huaweicloud.sdk.osm.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * 验证授权主机
     * 验证授权主机密码是否正确
     *
     * @param CheckHostsRequest 请求对象
     * @return SyncInvoker<CheckHostsRequest, CheckHostsResponse>
     */
    public SyncInvoker<CheckHostsRequest, CheckHostsResponse> checkHostsInvoker(CheckHostsRequest request) {
        return new SyncInvoker<CheckHostsRequest, CheckHostsResponse>(request, OsmMeta.checkHosts, hcClient);
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
     * 是否需要验证
     * 是否需要验证
     *
     * @param CheckNeedVerifyRequest 请求对象
     * @return SyncInvoker<CheckNeedVerifyRequest, CheckNeedVerifyResponse>
     */
    public SyncInvoker<CheckNeedVerifyRequest, CheckNeedVerifyResponse> checkNeedVerifyInvoker(CheckNeedVerifyRequest request) {
        return new SyncInvoker<CheckNeedVerifyRequest, CheckNeedVerifyResponse>(request, OsmMeta.checkNeedVerify, hcClient);
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
     * 验证联系方式
     * 验证联系方式
     *
     * @param CheckVerifyCodesRequest 请求对象
     * @return SyncInvoker<CheckVerifyCodesRequest, CheckVerifyCodesResponse>
     */
    public SyncInvoker<CheckVerifyCodesRequest, CheckVerifyCodesResponse> checkVerifyCodesInvoker(CheckVerifyCodesRequest request) {
        return new SyncInvoker<CheckVerifyCodesRequest, CheckVerifyCodesResponse>(request, OsmMeta.checkVerifyCodes, hcClient);
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
     * 租户确认授权
     * 租户确认授权
     *
     * @param ConfirmAuthorizationsRequest 请求对象
     * @return SyncInvoker<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse>
     */
    public SyncInvoker<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse> confirmAuthorizationsInvoker(ConfirmAuthorizationsRequest request) {
        return new SyncInvoker<ConfirmAuthorizationsRequest, ConfirmAuthorizationsResponse>(request, OsmMeta.confirmAuthorizations, hcClient);
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
     * 添加工单关联标签接口
     * 添加工单关联标签接口
     *
     * @param CreateCaseLabelsRequest 请求对象
     * @return SyncInvoker<CreateCaseLabelsRequest, CreateCaseLabelsResponse>
     */
    public SyncInvoker<CreateCaseLabelsRequest, CreateCaseLabelsResponse> createCaseLabelsInvoker(CreateCaseLabelsRequest request) {
        return new SyncInvoker<CreateCaseLabelsRequest, CreateCaseLabelsResponse>(request, OsmMeta.createCaseLabels, hcClient);
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
     * 创建工单
     * 创建工单
     *
     * @param CreateCasesRequest 请求对象
     * @return SyncInvoker<CreateCasesRequest, CreateCasesResponse>
     */
    public SyncInvoker<CreateCasesRequest, CreateCasesResponse> createCasesInvoker(CreateCasesRequest request) {
        return new SyncInvoker<CreateCasesRequest, CreateCasesResponse>(request, OsmMeta.createCases, hcClient);
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
     * 创建标签
     * 创建标签
     *
     * @param CreateLabelsRequest 请求对象
     * @return SyncInvoker<CreateLabelsRequest, CreateLabelsResponse>
     */
    public SyncInvoker<CreateLabelsRequest, CreateLabelsResponse> createLabelsInvoker(CreateLabelsRequest request) {
        return new SyncInvoker<CreateLabelsRequest, CreateLabelsResponse>(request, OsmMeta.createLabels, hcClient);
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
     * 提交留言
     * 提交留言
     *
     * @param CreateMessagesRequest 请求对象
     * @return SyncInvoker<CreateMessagesRequest, CreateMessagesResponse>
     */
    public SyncInvoker<CreateMessagesRequest, CreateMessagesResponse> createMessagesInvoker(CreateMessagesRequest request) {
        return new SyncInvoker<CreateMessagesRequest, CreateMessagesResponse>(request, OsmMeta.createMessages, hcClient);
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
     * 创建授权
     * 创建授权
     *
     * @param CreatePrivilegesRequest 请求对象
     * @return SyncInvoker<CreatePrivilegesRequest, CreatePrivilegesResponse>
     */
    public SyncInvoker<CreatePrivilegesRequest, CreatePrivilegesResponse> createPrivilegesInvoker(CreatePrivilegesRequest request) {
        return new SyncInvoker<CreatePrivilegesRequest, CreatePrivilegesResponse>(request, OsmMeta.createPrivileges, hcClient);
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
     * 创建关联
     * 创建关联，一个工单最多支持3个关联
     *
     * @param CreateRelationsRequest 请求对象
     * @return SyncInvoker<CreateRelationsRequest, CreateRelationsResponse>
     */
    public SyncInvoker<CreateRelationsRequest, CreateRelationsResponse> createRelationsInvoker(CreateRelationsRequest request) {
        return new SyncInvoker<CreateRelationsRequest, CreateRelationsResponse>(request, OsmMeta.createRelations, hcClient);
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
     * 提交评分
     * 提交评分
     *
     * @param CreateScoresRequest 请求对象
     * @return SyncInvoker<CreateScoresRequest, CreateScoresResponse>
     */
    public SyncInvoker<CreateScoresRequest, CreateScoresResponse> createScoresInvoker(CreateScoresRequest request) {
        return new SyncInvoker<CreateScoresRequest, CreateScoresResponse>(request, OsmMeta.createScores, hcClient);
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
     * 删除附件
     * 删除附件
     *
     * @param DeleteAccessoriesRequest 请求对象
     * @return SyncInvoker<DeleteAccessoriesRequest, DeleteAccessoriesResponse>
     */
    public SyncInvoker<DeleteAccessoriesRequest, DeleteAccessoriesResponse> deleteAccessoriesInvoker(DeleteAccessoriesRequest request) {
        return new SyncInvoker<DeleteAccessoriesRequest, DeleteAccessoriesResponse>(request, OsmMeta.deleteAccessories, hcClient);
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
     * 删除工单关联标签接口
     * 删除指定工单关联标签接口
     *
     * @param DeleteCaseLabelsRequest 请求对象
     * @return SyncInvoker<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse>
     */
    public SyncInvoker<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse> deleteCaseLabelsInvoker(DeleteCaseLabelsRequest request) {
        return new SyncInvoker<DeleteCaseLabelsRequest, DeleteCaseLabelsResponse>(request, OsmMeta.deleteCaseLabels, hcClient);
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
     * 删除标签
     * 删除标签，同时会删除工单与标签关联关系
     *
     * @param DeleteLabelsRequest 请求对象
     * @return SyncInvoker<DeleteLabelsRequest, DeleteLabelsResponse>
     */
    public SyncInvoker<DeleteLabelsRequest, DeleteLabelsResponse> deleteLabelsInvoker(DeleteLabelsRequest request) {
        return new SyncInvoker<DeleteLabelsRequest, DeleteLabelsResponse>(request, OsmMeta.deleteLabels, hcClient);
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
     * 删除关联
     * 删除关联
     *
     * @param DeleteRelationRequest 请求对象
     * @return SyncInvoker<DeleteRelationRequest, DeleteRelationResponse>
     */
    public SyncInvoker<DeleteRelationRequest, DeleteRelationResponse> deleteRelationInvoker(DeleteRelationRequest request) {
        return new SyncInvoker<DeleteRelationRequest, DeleteRelationResponse>(request, OsmMeta.deleteRelation, hcClient);
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
     * 下载附件
     * 下载附件
     *
     * @param DownloadAccessoriesRequest 请求对象
     * @return SyncInvoker<DownloadAccessoriesRequest, DownloadAccessoriesResponse>
     */
    public SyncInvoker<DownloadAccessoriesRequest, DownloadAccessoriesResponse> downloadAccessoriesInvoker(DownloadAccessoriesRequest request) {
        return new SyncInvoker<DownloadAccessoriesRequest, DownloadAccessoriesResponse>(request, OsmMeta.downloadAccessories, hcClient);
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
     * 工单导出
     * 工单导出
     *
     * @param DownloadCasesRequest 请求对象
     * @return SyncInvoker<DownloadCasesRequest, DownloadCasesResponse>
     */
    public SyncInvoker<DownloadCasesRequest, DownloadCasesResponse> downloadCasesInvoker(DownloadCasesRequest request) {
        return new SyncInvoker<DownloadCasesRequest, DownloadCasesResponse>(request, OsmMeta.downloadCases, hcClient);
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
     * 图片展示
     * 返回图片内容，用于页面直接展示
     *
     * @param DownloadImagesRequest 请求对象
     * @return SyncInvoker<DownloadImagesRequest, DownloadImagesResponse>
     */
    public SyncInvoker<DownloadImagesRequest, DownloadImagesResponse> downloadImagesInvoker(DownloadImagesRequest request) {
        return new SyncInvoker<DownloadImagesRequest, DownloadImagesResponse>(request, OsmMeta.downloadImages, hcClient);
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
     * 查询委托
     * 查询委托
     *
     * @param ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>(request, OsmMeta.listAgencies, hcClient);
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
     * 查询国家码
     * 查询国家码，用于提交工单页面填写联系方式使用
     *
     * @param ListAreaCodesRequest 请求对象
     * @return SyncInvoker<ListAreaCodesRequest, ListAreaCodesResponse>
     */
    public SyncInvoker<ListAreaCodesRequest, ListAreaCodesResponse> listAreaCodesInvoker(ListAreaCodesRequest request) {
        return new SyncInvoker<ListAreaCodesRequest, ListAreaCodesResponse>(request, OsmMeta.listAreaCodes, hcClient);
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
     * 查看授权列表
     * 查询授权列表
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>
     */
    public SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizationsInvoker(ListAuthorizationsRequest request) {
        return new SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>(request, OsmMeta.listAuthorizations, hcClient);
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
     * 查询工单类目列表
     * 查询工单类目列表
     *
     * @param ListCaseCategoriesRequest 请求对象
     * @return SyncInvoker<ListCaseCategoriesRequest, ListCaseCategoriesResponse>
     */
    public SyncInvoker<ListCaseCategoriesRequest, ListCaseCategoriesResponse> listCaseCategoriesInvoker(ListCaseCategoriesRequest request) {
        return new SyncInvoker<ListCaseCategoriesRequest, ListCaseCategoriesResponse>(request, OsmMeta.listCaseCategories, hcClient);
    }

    /**
     * 查询工单抄送邮箱
     * 查询工单抄送邮箱
     *
     * @param ListCaseCcEmailsRequest 请求对象
     * @return ListCaseCcEmailsResponse
     */
    public ListCaseCcEmailsResponse listCaseCcEmails(ListCaseCcEmailsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listCaseCcEmails);
    }

    /**
     * 查询工单抄送邮箱
     * 查询工单抄送邮箱
     *
     * @param ListCaseCcEmailsRequest 请求对象
     * @return SyncInvoker<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse>
     */
    public SyncInvoker<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse> listCaseCcEmailsInvoker(ListCaseCcEmailsRequest request) {
        return new SyncInvoker<ListCaseCcEmailsRequest, ListCaseCcEmailsResponse>(request, OsmMeta.listCaseCcEmails, hcClient);
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
     * 统计各状态工单数量
     * 统计各状态工单数量
     *
     * @param ListCaseCountsRequest 请求对象
     * @return SyncInvoker<ListCaseCountsRequest, ListCaseCountsResponse>
     */
    public SyncInvoker<ListCaseCountsRequest, ListCaseCountsResponse> listCaseCountsInvoker(ListCaseCountsRequest request) {
        return new SyncInvoker<ListCaseCountsRequest, ListCaseCountsResponse>(request, OsmMeta.listCaseCounts, hcClient);
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
     * 查询工单关联标签接口
     * 查询工单关联标签接口
     *
     * @param ListCaseLabelsRequest 请求对象
     * @return SyncInvoker<ListCaseLabelsRequest, ListCaseLabelsResponse>
     */
    public SyncInvoker<ListCaseLabelsRequest, ListCaseLabelsResponse> listCaseLabelsInvoker(ListCaseLabelsRequest request) {
        return new SyncInvoker<ListCaseLabelsRequest, ListCaseLabelsResponse>(request, OsmMeta.listCaseLabels, hcClient);
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
     * 查询工单限制，比如抄送邮箱个数等
     * 查询工单限制，比如抄送邮箱个数等
     *
     * @param ListCaseLimitsRequest 请求对象
     * @return SyncInvoker<ListCaseLimitsRequest, ListCaseLimitsResponse>
     */
    public SyncInvoker<ListCaseLimitsRequest, ListCaseLimitsResponse> listCaseLimitsInvoker(ListCaseLimitsRequest request) {
        return new SyncInvoker<ListCaseLimitsRequest, ListCaseLimitsResponse>(request, OsmMeta.listCaseLimits, hcClient);
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
     * 查询工单操作日志
     * 查询工单操作日志
     *
     * @param ListCaseOperateLogsRequest 请求对象
     * @return SyncInvoker<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse>
     */
    public SyncInvoker<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse> listCaseOperateLogsInvoker(ListCaseOperateLogsRequest request) {
        return new SyncInvoker<ListCaseOperateLogsRequest, ListCaseOperateLogsResponse>(request, OsmMeta.listCaseOperateLogs, hcClient);
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
     * 查询工单配额
     * 查询工单配额
     *
     * @param ListCaseQuotasRequest 请求对象
     * @return SyncInvoker<ListCaseQuotasRequest, ListCaseQuotasResponse>
     */
    public SyncInvoker<ListCaseQuotasRequest, ListCaseQuotasResponse> listCaseQuotasInvoker(ListCaseQuotasRequest request) {
        return new SyncInvoker<ListCaseQuotasRequest, ListCaseQuotasResponse>(request, OsmMeta.listCaseQuotas, hcClient);
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
     * 查询问题类型对应模板
     * 查询问题类型对应模板
     *
     * @param ListCaseTemplatesRequest 请求对象
     * @return SyncInvoker<ListCaseTemplatesRequest, ListCaseTemplatesResponse>
     */
    public SyncInvoker<ListCaseTemplatesRequest, ListCaseTemplatesResponse> listCaseTemplatesInvoker(ListCaseTemplatesRequest request) {
        return new SyncInvoker<ListCaseTemplatesRequest, ListCaseTemplatesResponse>(request, OsmMeta.listCaseTemplates, hcClient);
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
     * 查询工单列表接口
     * 查询工单列表接口
     *
     * @param ListCasesRequest 请求对象
     * @return SyncInvoker<ListCasesRequest, ListCasesResponse>
     */
    public SyncInvoker<ListCasesRequest, ListCasesResponse> listCasesInvoker(ListCasesRequest request) {
        return new SyncInvoker<ListCasesRequest, ListCasesResponse>(request, OsmMeta.listCases, hcClient);
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
     * 查询附加参数
     * 提单时，根据不同的产品或者问题类型，会存在不同的一些附加参数填写
     *
     * @param ListExtendsParamsRequest 请求对象
     * @return SyncInvoker<ListExtendsParamsRequest, ListExtendsParamsResponse>
     */
    public SyncInvoker<ListExtendsParamsRequest, ListExtendsParamsResponse> listExtendsParamsInvoker(ListExtendsParamsRequest request) {
        return new SyncInvoker<ListExtendsParamsRequest, ListExtendsParamsResponse>(request, OsmMeta.listExtendsParams, hcClient);
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
     * 查询已验证的列表
     * 查询已验证的列表
     *
     * @param ListHasVerifiedContactsRequest 请求对象
     * @return SyncInvoker<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse>
     */
    public SyncInvoker<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse> listHasVerifiedContactsInvoker(ListHasVerifiedContactsRequest request) {
        return new SyncInvoker<ListHasVerifiedContactsRequest, ListHasVerifiedContactsResponse>(request, OsmMeta.listHasVerifiedContacts, hcClient);
    }

    /**
     * 查询堡垒机历史操作记录
     * 查询堡垒机历史操作记录
     *
     * @param ListHistoryOperateLogsRequest 请求对象
     * @return ListHistoryOperateLogsResponse
     */
    public ListHistoryOperateLogsResponse listHistoryOperateLogs(ListHistoryOperateLogsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHistoryOperateLogs);
    }

    /**
     * 查询堡垒机历史操作记录
     * 查询堡垒机历史操作记录
     *
     * @param ListHistoryOperateLogsRequest 请求对象
     * @return SyncInvoker<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse>
     */
    public SyncInvoker<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse> listHistoryOperateLogsInvoker(ListHistoryOperateLogsRequest request) {
        return new SyncInvoker<ListHistoryOperateLogsRequest, ListHistoryOperateLogsResponse>(request, OsmMeta.listHistoryOperateLogs, hcClient);
    }

    /**
     * 查询堡垒机历史会话列表
     * 查询堡垒机历史会话列
     *
     * @param ListHistorySessionsRequest 请求对象
     * @return ListHistorySessionsResponse
     */
    public ListHistorySessionsResponse listHistorySessions(ListHistorySessionsRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listHistorySessions);
    }

    /**
     * 查询堡垒机历史会话列表
     * 查询堡垒机历史会话列
     *
     * @param ListHistorySessionsRequest 请求对象
     * @return SyncInvoker<ListHistorySessionsRequest, ListHistorySessionsResponse>
     */
    public SyncInvoker<ListHistorySessionsRequest, ListHistorySessionsResponse> listHistorySessionsInvoker(ListHistorySessionsRequest request) {
        return new SyncInvoker<ListHistorySessionsRequest, ListHistorySessionsResponse>(request, OsmMeta.listHistorySessions, hcClient);
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
     * 查询标签
     * 查询标签
     *
     * @param ListLabelsRequest 请求对象
     * @return SyncInvoker<ListLabelsRequest, ListLabelsResponse>
     */
    public SyncInvoker<ListLabelsRequest, ListLabelsResponse> listLabelsInvoker(ListLabelsRequest request) {
        return new SyncInvoker<ListLabelsRequest, ListLabelsResponse>(request, OsmMeta.listLabels, hcClient);
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
     * 查询留言
     * 查询留言
     *
     * @param ListMessagesRequest 请求对象
     * @return SyncInvoker<ListMessagesRequest, ListMessagesResponse>
     */
    public SyncInvoker<ListMessagesRequest, ListMessagesResponse> listMessagesInvoker(ListMessagesRequest request) {
        return new SyncInvoker<ListMessagesRequest, ListMessagesResponse>(request, OsmMeta.listMessages, hcClient);
    }

    /**
     * 查询更多留言
     * 查询更多留言
     *
     * @param ListMoreInstantMessagesRequest 请求对象
     * @return ListMoreInstantMessagesResponse
     */
    public ListMoreInstantMessagesResponse listMoreInstantMessages(ListMoreInstantMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listMoreInstantMessages);
    }

    /**
     * 查询更多留言
     * 查询更多留言
     *
     * @param ListMoreInstantMessagesRequest 请求对象
     * @return SyncInvoker<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse>
     */
    public SyncInvoker<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse> listMoreInstantMessagesInvoker(ListMoreInstantMessagesRequest request) {
        return new SyncInvoker<ListMoreInstantMessagesRequest, ListMoreInstantMessagesResponse>(request, OsmMeta.listMoreInstantMessages, hcClient);
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
     * 轮询查询即时消息
     * 轮询查询即时消息接口
     *
     * @param ListNewInstantMessagesRequest 请求对象
     * @return SyncInvoker<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse>
     */
    public SyncInvoker<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse> listNewInstantMessagesInvoker(ListNewInstantMessagesRequest request) {
        return new SyncInvoker<ListNewInstantMessagesRequest, ListNewInstantMessagesResponse>(request, OsmMeta.listNewInstantMessages, hcClient);
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
     * 查询工单权限
     * 查询工单权限
     *
     * @param ListPrivilegesRequest 请求对象
     * @return SyncInvoker<ListPrivilegesRequest, ListPrivilegesResponse>
     */
    public SyncInvoker<ListPrivilegesRequest, ListPrivilegesResponse> listPrivilegesInvoker(ListPrivilegesRequest request) {
        return new SyncInvoker<ListPrivilegesRequest, ListPrivilegesResponse>(request, OsmMeta.listPrivileges, hcClient);
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
     * 查询问题类型列表
     * 提交工单时，选择产品类型之后选择对应的问题列表
     *
     * @param ListProblemTypesRequest 请求对象
     * @return SyncInvoker<ListProblemTypesRequest, ListProblemTypesResponse>
     */
    public SyncInvoker<ListProblemTypesRequest, ListProblemTypesResponse> listProblemTypesInvoker(ListProblemTypesRequest request) {
        return new SyncInvoker<ListProblemTypesRequest, ListProblemTypesResponse>(request, OsmMeta.listProblemTypes, hcClient);
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
     * 查询产品类型列表
     * 查询产品类型列表
     *
     * @param ListProductCategoriesRequest 请求对象
     * @return SyncInvoker<ListProductCategoriesRequest, ListProductCategoriesResponse>
     */
    public SyncInvoker<ListProductCategoriesRequest, ListProductCategoriesResponse> listProductCategoriesInvoker(ListProductCategoriesRequest request) {
        return new SyncInvoker<ListProductCategoriesRequest, ListProductCategoriesResponse>(request, OsmMeta.listProductCategories, hcClient);
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
     * 查询区域列表
     * 查询区域列表
     *
     * @param ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<ListRegionsRequest, ListRegionsResponse>(request, OsmMeta.listRegions, hcClient);
    }

    /**
     * 查询关联工单
     * 查询工单的关联，返回关联工单的简要信息
     *
     * @param ListRelationRequest 请求对象
     * @return ListRelationResponse
     */
    public ListRelationResponse listRelation(ListRelationRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listRelation);
    }

    /**
     * 查询关联工单
     * 查询工单的关联，返回关联工单的简要信息
     *
     * @param ListRelationRequest 请求对象
     * @return SyncInvoker<ListRelationRequest, ListRelationResponse>
     */
    public SyncInvoker<ListRelationRequest, ListRelationResponse> listRelationInvoker(ListRelationRequest request) {
        return new SyncInvoker<ListRelationRequest, ListRelationResponse>(request, OsmMeta.listRelation, hcClient);
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
     * 工单满意度分类列表
     * 工单满意度分类列表
     *
     * @param ListSatisfactionDimensionsRequest 请求对象
     * @return SyncInvoker<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse>
     */
    public SyncInvoker<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse> listSatisfactionDimensionsInvoker(ListSatisfactionDimensionsRequest request) {
        return new SyncInvoker<ListSatisfactionDimensionsRequest, ListSatisfactionDimensionsResponse>(request, OsmMeta.listSatisfactionDimensions, hcClient);
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
     * 查询问题严重性列表
     * 查询问题严重性列表
     *
     * @param ListSeveritiesRequest 请求对象
     * @return SyncInvoker<ListSeveritiesRequest, ListSeveritiesResponse>
     */
    public SyncInvoker<ListSeveritiesRequest, ListSeveritiesResponse> listSeveritiesInvoker(ListSeveritiesRequest request) {
        return new SyncInvoker<ListSeveritiesRequest, ListSeveritiesResponse>(request, OsmMeta.listSeverities, hcClient);
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
     * 查询子用户信息
     * 查询子用户信息
     *
     * @param ListSubCustomersRequest 请求对象
     * @return SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>
     */
    public SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse> listSubCustomersInvoker(ListSubCustomersRequest request) {
        return new SyncInvoker<ListSubCustomersRequest, ListSubCustomersResponse>(request, OsmMeta.listSubCustomers, hcClient);
    }

    /**
     * 查询堡垒机文件传输记录
     * 查询堡垒机文件传输记录
     *
     * @param ListTransportHistoriesRequest 请求对象
     * @return ListTransportHistoriesResponse
     */
    public ListTransportHistoriesResponse listTransportHistories(ListTransportHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.listTransportHistories);
    }

    /**
     * 查询堡垒机文件传输记录
     * 查询堡垒机文件传输记录
     *
     * @param ListTransportHistoriesRequest 请求对象
     * @return SyncInvoker<ListTransportHistoriesRequest, ListTransportHistoriesResponse>
     */
    public SyncInvoker<ListTransportHistoriesRequest, ListTransportHistoriesResponse> listTransportHistoriesInvoker(ListTransportHistoriesRequest request) {
        return new SyncInvoker<ListTransportHistoriesRequest, ListTransportHistoriesResponse>(request, OsmMeta.listTransportHistories, hcClient);
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
     * 查询未读消息
     * 查询未读消息
     *
     * @param ListUnreadNewInstantMessagesRequest 请求对象
     * @return SyncInvoker<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse>
     */
    public SyncInvoker<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse> listUnreadNewInstantMessagesInvoker(ListUnreadNewInstantMessagesRequest request) {
        return new SyncInvoker<ListUnreadNewInstantMessagesRequest, ListUnreadNewInstantMessagesResponse>(request, OsmMeta.listUnreadNewInstantMessages, hcClient);
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
     * 获取验证码
     * 获取验证码
     *
     * @param SendVerifyCodesRequest 请求对象
     * @return SyncInvoker<SendVerifyCodesRequest, SendVerifyCodesResponse>
     */
    public SyncInvoker<SendVerifyCodesRequest, SendVerifyCodesResponse> sendVerifyCodesInvoker(SendVerifyCodesRequest request) {
        return new SyncInvoker<SendVerifyCodesRequest, SendVerifyCodesResponse>(request, OsmMeta.sendVerifyCodes, hcClient);
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
     * 附件限制
     * 查询附件的一下限制，比如大小，数量，文件类型
     *
     * @param ShowAccessoryLimitsRequest 请求对象
     * @return SyncInvoker<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse>
     */
    public SyncInvoker<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse> showAccessoryLimitsInvoker(ShowAccessoryLimitsRequest request) {
        return new SyncInvoker<ShowAccessoryLimitsRequest, ShowAccessoryLimitsResponse>(request, OsmMeta.showAccessoryLimits, hcClient);
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
     * 查询授权详情
     * 查询授权详情
     *
     * @param ShowAuthorizationDetailRequest 请求对象
     * @return SyncInvoker<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse>
     */
    public SyncInvoker<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse> showAuthorizationDetailInvoker(ShowAuthorizationDetailRequest request) {
        return new SyncInvoker<ShowAuthorizationDetailRequest, ShowAuthorizationDetailResponse>(request, OsmMeta.showAuthorizationDetail, hcClient);
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
     * 查询工单详情
     * 查询工单详情
     *
     * @param ShowCaseDetailRequest 请求对象
     * @return SyncInvoker<ShowCaseDetailRequest, ShowCaseDetailResponse>
     */
    public SyncInvoker<ShowCaseDetailRequest, ShowCaseDetailResponse> showCaseDetailInvoker(ShowCaseDetailRequest request) {
        return new SyncInvoker<ShowCaseDetailRequest, ShowCaseDetailResponse>(request, OsmMeta.showCaseDetail, hcClient);
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
     * 查询某个工单状态
     * 查询某个工单状态
     *
     * @param ShowCaseStatusRequest 请求对象
     * @return SyncInvoker<ShowCaseStatusRequest, ShowCaseStatusResponse>
     */
    public SyncInvoker<ShowCaseStatusRequest, ShowCaseStatusResponse> showCaseStatusInvoker(ShowCaseStatusRequest request) {
        return new SyncInvoker<ShowCaseStatusRequest, ShowCaseStatusResponse>(request, OsmMeta.showCaseStatus, hcClient);
    }

    /**
     * 查询伙伴工单权限
     * 查询伙伴工单权限
     *
     * @param ShowPartnersCasesPrivilegeRequest 请求对象
     * @return ShowPartnersCasesPrivilegeResponse
     */
    public ShowPartnersCasesPrivilegeResponse showPartnersCasesPrivilege(ShowPartnersCasesPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, OsmMeta.showPartnersCasesPrivilege);
    }

    /**
     * 查询伙伴工单权限
     * 查询伙伴工单权限
     *
     * @param ShowPartnersCasesPrivilegeRequest 请求对象
     * @return SyncInvoker<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse>
     */
    public SyncInvoker<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse> showPartnersCasesPrivilegeInvoker(ShowPartnersCasesPrivilegeRequest request) {
        return new SyncInvoker<ShowPartnersCasesPrivilegeRequest, ShowPartnersCasesPrivilegeResponse>(request, OsmMeta.showPartnersCasesPrivilege, hcClient);
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
     * 查询关联伙伴服务信息
     * 查询关联伙伴服务信息
     *
     * @param ShowPartnersServiceInfoRequest 请求对象
     * @return SyncInvoker<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse>
     */
    public SyncInvoker<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse> showPartnersServiceInfoInvoker(ShowPartnersServiceInfoRequest request) {
        return new SyncInvoker<ShowPartnersServiceInfoRequest, ShowPartnersServiceInfoResponse>(request, OsmMeta.showPartnersServiceInfo, hcClient);
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
     * 拒绝|撤销授权
     * 拒绝|撤销授权
     *
     * @param UpdateAuthorizationsRequest 请求对象
     * @return SyncInvoker<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse>
     */
    public SyncInvoker<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse> updateAuthorizationsInvoker(UpdateAuthorizationsRequest request) {
        return new SyncInvoker<UpdateAuthorizationsRequest, UpdateAuthorizationsResponse>(request, OsmMeta.updateAuthorizations, hcClient);
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
     * 工单操作
     * 工单操作
     *
     * @param UpdateCasesRequest 请求对象
     * @return SyncInvoker<UpdateCasesRequest, UpdateCasesResponse>
     */
    public SyncInvoker<UpdateCasesRequest, UpdateCasesResponse> updateCasesInvoker(UpdateCasesRequest request) {
        return new SyncInvoker<UpdateCasesRequest, UpdateCasesResponse>(request, OsmMeta.updateCases, hcClient);
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
     * 修改标签
     * 修改标签
     *
     * @param UpdateLabelsRequest 请求对象
     * @return SyncInvoker<UpdateLabelsRequest, UpdateLabelsResponse>
     */
    public SyncInvoker<UpdateLabelsRequest, UpdateLabelsResponse> updateLabelsInvoker(UpdateLabelsRequest request) {
        return new SyncInvoker<UpdateLabelsRequest, UpdateLabelsResponse>(request, OsmMeta.updateLabels, hcClient);
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
     * 设置消息已读
     * 设置消息已读
     *
     * @param UpdateNewInstantMessagesReadRequest 请求对象
     * @return SyncInvoker<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse>
     */
    public SyncInvoker<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse> updateNewInstantMessagesReadInvoker(UpdateNewInstantMessagesReadRequest request) {
        return new SyncInvoker<UpdateNewInstantMessagesReadRequest, UpdateNewInstantMessagesReadResponse>(request, OsmMeta.updateNewInstantMessagesRead, hcClient);
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

    /**
     * 上传附件
     * 上传附件给SDK使用
     *
     * @param UploadJsonAccessoriesRequest 请求对象
     * @return SyncInvoker<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse>
     */
    public SyncInvoker<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse> uploadJsonAccessoriesInvoker(UploadJsonAccessoriesRequest request) {
        return new SyncInvoker<UploadJsonAccessoriesRequest, UploadJsonAccessoriesResponse>(request, OsmMeta.uploadJsonAccessories, hcClient);
    }

}