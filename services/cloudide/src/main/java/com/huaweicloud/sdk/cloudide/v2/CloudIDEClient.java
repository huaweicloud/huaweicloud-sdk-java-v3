package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.cloudide.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudIDEClient {

    protected HcClient hcClient;

    public CloudIDEClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudIDEClient> newBuilder() {
        return new ClientBuilder<>(CloudIDEClient::new);
    }

    /**
     * 添加插件评论
     *
     * 添加插件评论
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddExtensionEvaluationRequest 请求对象
     * @return AddExtensionEvaluationResponse
     */
    public AddExtensionEvaluationResponse addExtensionEvaluation(AddExtensionEvaluationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.addExtensionEvaluation);
    }

    /**
     * 添加插件评论
     *
     * 添加插件评论
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddExtensionEvaluationRequest 请求对象
     * @return SyncInvoker<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse>
     */
    public SyncInvoker<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse> addExtensionEvaluationInvoker(
        AddExtensionEvaluationRequest request) {
        return new SyncInvoker<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse>(request,
            CloudIDEMeta.addExtensionEvaluation, hcClient);
    }

    /**
     * 添加评论回复、回复评论回复
     *
     * 添加评论回复、回复评论回复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddExtensionEvaluationReplyRequest 请求对象
     * @return AddExtensionEvaluationReplyResponse
     */
    public AddExtensionEvaluationReplyResponse addExtensionEvaluationReply(AddExtensionEvaluationReplyRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.addExtensionEvaluationReply);
    }

    /**
     * 添加评论回复、回复评论回复
     *
     * 添加评论回复、回复评论回复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddExtensionEvaluationReplyRequest 请求对象
     * @return SyncInvoker<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse>
     */
    public SyncInvoker<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse> addExtensionEvaluationReplyInvoker(
        AddExtensionEvaluationReplyRequest request) {
        return new SyncInvoker<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse>(request,
            CloudIDEMeta.addExtensionEvaluationReply, hcClient);
    }

    /**
     * 添加新评星
     *
     * 添加新评星
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddExtensionStarRequest 请求对象
     * @return AddExtensionStarResponse
     */
    public AddExtensionStarResponse addExtensionStar(AddExtensionStarRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.addExtensionStar);
    }

    /**
     * 添加新评星
     *
     * 添加新评星
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddExtensionStarRequest 请求对象
     * @return SyncInvoker<AddExtensionStarRequest, AddExtensionStarResponse>
     */
    public SyncInvoker<AddExtensionStarRequest, AddExtensionStarResponse> addExtensionStarInvoker(
        AddExtensionStarRequest request) {
        return new SyncInvoker<AddExtensionStarRequest, AddExtensionStarResponse>(request,
            CloudIDEMeta.addExtensionStar, hcClient);
    }

    /**
     * 举报评论,举报回复
     *
     * 举报评论,举报回复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckMaliciousExtensionEvaluationRequest 请求对象
     * @return CheckMaliciousExtensionEvaluationResponse
     */
    public CheckMaliciousExtensionEvaluationResponse checkMaliciousExtensionEvaluation(
        CheckMaliciousExtensionEvaluationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.checkMaliciousExtensionEvaluation);
    }

    /**
     * 举报评论,举报回复
     *
     * 举报评论,举报回复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckMaliciousExtensionEvaluationRequest 请求对象
     * @return SyncInvoker<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse>
     */
    public SyncInvoker<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse> checkMaliciousExtensionEvaluationInvoker(
        CheckMaliciousExtensionEvaluationRequest request) {
        return new SyncInvoker<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse>(
            request, CloudIDEMeta.checkMaliciousExtensionEvaluation, hcClient);
    }

    /**
     * 设置ide实例对插件的授权
     *
     * 设置ide实例对插件的授权。同意、不同意、未知（下次重新询问）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateExtensionAuthorizationRequest 请求对象
     * @return CreateExtensionAuthorizationResponse
     */
    public CreateExtensionAuthorizationResponse createExtensionAuthorization(
        CreateExtensionAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createExtensionAuthorization);
    }

    /**
     * 设置ide实例对插件的授权
     *
     * 设置ide实例对插件的授权。同意、不同意、未知（下次重新询问）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateExtensionAuthorizationRequest 请求对象
     * @return SyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse>
     */
    public SyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> createExtensionAuthorizationInvoker(
        CreateExtensionAuthorizationRequest request) {
        return new SyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse>(request,
            CloudIDEMeta.createExtensionAuthorization, hcClient);
    }

    /**
     * 删除评论
     *
     * 删除评论
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEvaluationRequest 请求对象
     * @return DeleteEvaluationResponse
     */
    public DeleteEvaluationResponse deleteEvaluation(DeleteEvaluationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.deleteEvaluation);
    }

    /**
     * 删除评论
     *
     * 删除评论
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEvaluationRequest 请求对象
     * @return SyncInvoker<DeleteEvaluationRequest, DeleteEvaluationResponse>
     */
    public SyncInvoker<DeleteEvaluationRequest, DeleteEvaluationResponse> deleteEvaluationInvoker(
        DeleteEvaluationRequest request) {
        return new SyncInvoker<DeleteEvaluationRequest, DeleteEvaluationResponse>(request,
            CloudIDEMeta.deleteEvaluation, hcClient);
    }

    /**
     * 删除回复
     *
     * 删除回复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEvaluationReplyRequest 请求对象
     * @return DeleteEvaluationReplyResponse
     */
    public DeleteEvaluationReplyResponse deleteEvaluationReply(DeleteEvaluationReplyRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.deleteEvaluationReply);
    }

    /**
     * 删除回复
     *
     * 删除回复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEvaluationReplyRequest 请求对象
     * @return SyncInvoker<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse>
     */
    public SyncInvoker<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse> deleteEvaluationReplyInvoker(
        DeleteEvaluationReplyRequest request) {
        return new SyncInvoker<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse>(request,
            CloudIDEMeta.deleteEvaluationReply, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListExtensionsRequest 请求对象
     * @return ListExtensionsResponse
     */
    public ListExtensionsResponse listExtensions(ListExtensionsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listExtensions);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListExtensionsRequest 请求对象
     * @return SyncInvoker<ListExtensionsRequest, ListExtensionsResponse>
     */
    public SyncInvoker<ListExtensionsRequest, ListExtensionsResponse> listExtensionsInvoker(
        ListExtensionsRequest request) {
        return new SyncInvoker<ListExtensionsRequest, ListExtensionsResponse>(request, CloudIDEMeta.listExtensions,
            hcClient);
    }

    /**
     * 查询技术栈模板工程
     *
     * 查询技术栈模板工程
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return ListProjectTemplatesResponse
     */
    public ListProjectTemplatesResponse listProjectTemplates(ListProjectTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listProjectTemplates);
    }

    /**
     * 查询技术栈模板工程
     *
     * 查询技术栈模板工程
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return SyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse>
     */
    public SyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplatesInvoker(
        ListProjectTemplatesRequest request) {
        return new SyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse>(request,
            CloudIDEMeta.listProjectTemplates, hcClient);
    }

    /**
     * 按region获取标签所有技术栈
     *
     * 按region获取标签所有技术栈
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return ListStacksResponse
     */
    public ListStacksResponse listStacks(ListStacksRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listStacks);
    }

    /**
     * 按region获取标签所有技术栈
     *
     * 按region获取标签所有技术栈
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return SyncInvoker<ListStacksRequest, ListStacksResponse>
     */
    public SyncInvoker<ListStacksRequest, ListStacksResponse> listStacksInvoker(ListStacksRequest request) {
        return new SyncInvoker<ListStacksRequest, ListStacksResponse>(request, CloudIDEMeta.listStacks, hcClient);
    }

    /**
     * 查询当前帐号访问权限
     *
     * 查询当前帐号访问权限
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAccountStatusRequest 请求对象
     * @return ShowAccountStatusResponse
     */
    public ShowAccountStatusResponse showAccountStatus(ShowAccountStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showAccountStatus);
    }

    /**
     * 查询当前帐号访问权限
     *
     * 查询当前帐号访问权限
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAccountStatusRequest 请求对象
     * @return SyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse>
     */
    public SyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatusInvoker(
        ShowAccountStatusRequest request) {
        return new SyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse>(request,
            CloudIDEMeta.showAccountStatus, hcClient);
    }

    /**
     * 查询ide实例对插件的授权情况
     *
     * 查询ide实例对插件的授权情况，同意授权的插件能在ide实例内携带登陆用户的token调用第三方服务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionAuthorizationRequest 请求对象
     * @return ShowExtensionAuthorizationResponse
     */
    public ShowExtensionAuthorizationResponse showExtensionAuthorization(ShowExtensionAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showExtensionAuthorization);
    }

    /**
     * 查询ide实例对插件的授权情况
     *
     * 查询ide实例对插件的授权情况，同意授权的插件能在ide实例内携带登陆用户的token调用第三方服务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionAuthorizationRequest 请求对象
     * @return SyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse>
     */
    public SyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> showExtensionAuthorizationInvoker(
        ShowExtensionAuthorizationRequest request) {
        return new SyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse>(request,
            CloudIDEMeta.showExtensionAuthorization, hcClient);
    }

    /**
     * 查询插件详细信息
     *
     * 查询插件详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionDetailRequest 请求对象
     * @return ShowExtensionDetailResponse
     */
    public ShowExtensionDetailResponse showExtensionDetail(ShowExtensionDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showExtensionDetail);
    }

    /**
     * 查询插件详细信息
     *
     * 查询插件详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionDetailRequest 请求对象
     * @return SyncInvoker<ShowExtensionDetailRequest, ShowExtensionDetailResponse>
     */
    public SyncInvoker<ShowExtensionDetailRequest, ShowExtensionDetailResponse> showExtensionDetailInvoker(
        ShowExtensionDetailRequest request) {
        return new SyncInvoker<ShowExtensionDetailRequest, ShowExtensionDetailResponse>(request,
            CloudIDEMeta.showExtensionDetail, hcClient);
    }

    /**
     * 查询插件评价
     *
     * 查询插件评价
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionEvaluationRequest 请求对象
     * @return ShowExtensionEvaluationResponse
     */
    public ShowExtensionEvaluationResponse showExtensionEvaluation(ShowExtensionEvaluationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showExtensionEvaluation);
    }

    /**
     * 查询插件评价
     *
     * 查询插件评价
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionEvaluationRequest 请求对象
     * @return SyncInvoker<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse>
     */
    public SyncInvoker<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse> showExtensionEvaluationInvoker(
        ShowExtensionEvaluationRequest request) {
        return new SyncInvoker<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse>(request,
            CloudIDEMeta.showExtensionEvaluation, hcClient);
    }

    /**
     * 查询插件评星
     *
     * 查询插件评星
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionEvaluationStarRequest 请求对象
     * @return ShowExtensionEvaluationStarResponse
     */
    public ShowExtensionEvaluationStarResponse showExtensionEvaluationStar(ShowExtensionEvaluationStarRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showExtensionEvaluationStar);
    }

    /**
     * 查询插件评星
     *
     * 查询插件评星
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionEvaluationStarRequest 请求对象
     * @return SyncInvoker<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse>
     */
    public SyncInvoker<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse> showExtensionEvaluationStarInvoker(
        ShowExtensionEvaluationStarRequest request) {
        return new SyncInvoker<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse>(request,
            CloudIDEMeta.showExtensionEvaluationStar, hcClient);
    }

    /**
     * 获取技术栈计费信息
     *
     * 获取技术栈计费信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPriceRequest 请求对象
     * @return ShowPriceResponse
     */
    public ShowPriceResponse showPrice(ShowPriceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showPrice);
    }

    /**
     * 获取技术栈计费信息
     *
     * 获取技术栈计费信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPriceRequest 请求对象
     * @return SyncInvoker<ShowPriceRequest, ShowPriceResponse>
     */
    public SyncInvoker<ShowPriceRequest, ShowPriceResponse> showPriceInvoker(ShowPriceRequest request) {
        return new SyncInvoker<ShowPriceRequest, ShowPriceResponse>(request, CloudIDEMeta.showPrice, hcClient);
    }

    /**
     * 上传插件
     *
     * 上传插件
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadExtensionFileRequest 请求对象
     * @return UploadExtensionFileResponse
     */
    public UploadExtensionFileResponse uploadExtensionFile(UploadExtensionFileRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.uploadExtensionFile);
    }

    /**
     * 上传插件
     *
     * 上传插件
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadExtensionFileRequest 请求对象
     * @return SyncInvoker<UploadExtensionFileRequest, UploadExtensionFileResponse>
     */
    public SyncInvoker<UploadExtensionFileRequest, UploadExtensionFileResponse> uploadExtensionFileInvoker(
        UploadExtensionFileRequest request) {
        return new SyncInvoker<UploadExtensionFileRequest, UploadExtensionFileResponse>(request,
            CloudIDEMeta.uploadExtensionFile, hcClient);
    }

    /**
     * 查询用户是否有权限访问某个IDE实例
     *
     * 查询用户是否有权限访问某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckInstanceAccessRequest 请求对象
     * @return CheckInstanceAccessResponse
     */
    public CheckInstanceAccessResponse checkInstanceAccess(CheckInstanceAccessRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.checkInstanceAccess);
    }

    /**
     * 查询用户是否有权限访问某个IDE实例
     *
     * 查询用户是否有权限访问某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckInstanceAccessRequest 请求对象
     * @return SyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse>
     */
    public SyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse> checkInstanceAccessInvoker(
        CheckInstanceAccessRequest request) {
        return new SyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse>(request,
            CloudIDEMeta.checkInstanceAccess, hcClient);
    }

    /**
     * 查询IDE实例名是否重复
     *
     * 查询IDE实例名是否重复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckNameRequest 请求对象
     * @return CheckNameResponse
     */
    public CheckNameResponse checkName(CheckNameRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.checkName);
    }

    /**
     * 查询IDE实例名是否重复
     *
     * 查询IDE实例名是否重复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckNameRequest 请求对象
     * @return SyncInvoker<CheckNameRequest, CheckNameResponse>
     */
    public SyncInvoker<CheckNameRequest, CheckNameResponse> checkNameInvoker(CheckNameRequest request) {
        return new SyncInvoker<CheckNameRequest, CheckNameResponse>(request, CloudIDEMeta.checkName, hcClient);
    }

    /**
     * 创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createInstance);
    }

    /**
     * 创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, CloudIDEMeta.createInstance,
            hcClient);
    }

    /**
     * 外部第三方集成商创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return CreateInstanceBy3rdResponse
     */
    public CreateInstanceBy3rdResponse createInstanceBy3rd(CreateInstanceBy3rdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createInstanceBy3rd);
    }

    /**
     * 外部第三方集成商创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return SyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse>
     */
    public SyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rdInvoker(
        CreateInstanceBy3rdRequest request) {
        return new SyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse>(request,
            CloudIDEMeta.createInstanceBy3rd, hcClient);
    }

    /**
     * 删除IDE实例
     *
     * 删除IDE实例（同时删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.deleteInstance);
    }

    /**
     * 删除IDE实例
     *
     * 删除IDE实例（同时删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, CloudIDEMeta.deleteInstance,
            hcClient);
    }

    /**
     * 查询IDE实例列表
     *
     * 查询IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listInstances);
    }

    /**
     * 查询IDE实例列表
     *
     * 查询IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CloudIDEMeta.listInstances,
            hcClient);
    }

    /**
     * 查询某个租户下的IDE实例列表
     *
     * 查询某个租户下的IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return ListOrgInstancesResponse
     */
    public ListOrgInstancesResponse listOrgInstances(ListOrgInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listOrgInstances);
    }

    /**
     * 查询某个租户下的IDE实例列表
     *
     * 查询某个租户下的IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return SyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse>
     */
    public SyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstancesInvoker(
        ListOrgInstancesRequest request) {
        return new SyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse>(request,
            CloudIDEMeta.listOrgInstances, hcClient);
    }

    /**
     * 查询某个IDE实例
     *
     * 查询某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showInstance);
    }

    /**
     * 查询某个IDE实例
     *
     * 查询某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, CloudIDEMeta.showInstance, hcClient);
    }

    /**
     * 查询某个IDE实例的状态
     *
     * 查询某个IDE实例的状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceStatusInfoRequest 请求对象
     * @return ShowInstanceStatusInfoResponse
     */
    public ShowInstanceStatusInfoResponse showInstanceStatusInfo(ShowInstanceStatusInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showInstanceStatusInfo);
    }

    /**
     * 查询某个IDE实例的状态
     *
     * 查询某个IDE实例的状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceStatusInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse>
     */
    public SyncInvoker<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> showInstanceStatusInfoInvoker(
        ShowInstanceStatusInfoRequest request) {
        return new SyncInvoker<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse>(request,
            CloudIDEMeta.showInstanceStatusInfo, hcClient);
    }

    /**
     * 启动IDE实例
     *
     * 启动IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceRequest 请求对象
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.startInstance);
    }

    /**
     * 启动IDE实例
     *
     * 启动IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceRequest 请求对象
     * @return SyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public SyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceInvoker(StartInstanceRequest request) {
        return new SyncInvoker<StartInstanceRequest, StartInstanceResponse>(request, CloudIDEMeta.startInstance,
            hcClient);
    }

    /**
     * 停止IDE实例
     *
     * 停止IDE实例（不删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.stopInstance);
    }

    /**
     * 停止IDE实例
     *
     * 停止IDE实例（不删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return SyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, CloudIDEMeta.stopInstance, hcClient);
    }

    /**
     * 修改IDE实例
     *
     * 修改IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.updateInstance);
    }

    /**
     * 修改IDE实例
     *
     * 修改IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, CloudIDEMeta.updateInstance,
            hcClient);
    }

    /**
     * 刷新IDE实例活跃状态
     *
     * 刷新IDE实例活跃状态，超过该实例设置的过期时间后实例自动关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceActivityRequest 请求对象
     * @return UpdateInstanceActivityResponse
     */
    public UpdateInstanceActivityResponse updateInstanceActivity(UpdateInstanceActivityRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.updateInstanceActivity);
    }

    /**
     * 刷新IDE实例活跃状态
     *
     * 刷新IDE实例活跃状态，超过该实例设置的过期时间后实例自动关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceActivityRequest 请求对象
     * @return SyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse>
     */
    public SyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> updateInstanceActivityInvoker(
        UpdateInstanceActivityRequest request) {
        return new SyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse>(request,
            CloudIDEMeta.updateInstanceActivity, hcClient);
    }

}
