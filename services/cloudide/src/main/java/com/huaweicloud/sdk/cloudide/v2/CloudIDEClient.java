package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationReplyRequest;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationReplyResponse;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionStarRequest;
import com.huaweicloud.sdk.cloudide.v2.model.AddExtensionStarResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CheckInstanceAccessRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CheckInstanceAccessResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CheckMaliciousExtensionEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CheckMaliciousExtensionEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CheckNameRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CheckNameResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateAcceptanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateAcceptanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateApplyRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateApplyResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateEventRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateEventResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateExtensionAuthorizationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateExtensionAuthorizationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceBy3rdRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceBy3rdResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateLoginRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateLoginResponse;
import com.huaweicloud.sdk.cloudide.v2.model.CreateRequestRequest;
import com.huaweicloud.sdk.cloudide.v2.model.CreateRequestResponse;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationReplyRequest;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationReplyResponse;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListExtensionsRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListExtensionsResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListOrgInstancesRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListOrgInstancesResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListProjectTemplatesRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListProjectTemplatesResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListPublisherRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListPublisherResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ListStacksRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ListStacksResponse;
import com.huaweicloud.sdk.cloudide.v2.model.PublishExtensionRequest;
import com.huaweicloud.sdk.cloudide.v2.model.PublishExtensionResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowAccountStatusRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowAccountStatusResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowCategoryListRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowCategoryListResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionAuthorizationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionAuthorizationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionDetailRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionDetailResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationStarRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionEvaluationStarResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionTestingResultRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowExtensionTestingResultResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceStatusInfoRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowInstanceStatusInfoResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowPriceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowPriceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.ShowResultRequest;
import com.huaweicloud.sdk.cloudide.v2.model.ShowResultResponse;
import com.huaweicloud.sdk.cloudide.v2.model.StartChatRequest;
import com.huaweicloud.sdk.cloudide.v2.model.StartChatResponse;
import com.huaweicloud.sdk.cloudide.v2.model.StartInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.StartInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.StopInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.StopInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.SyncChatRequest;
import com.huaweicloud.sdk.cloudide.v2.model.SyncChatResponse;
import com.huaweicloud.sdk.cloudide.v2.model.SyncGetChatResultRequest;
import com.huaweicloud.sdk.cloudide.v2.model.SyncGetChatResultResponse;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceActivityRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceActivityResponse;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.cloudide.v2.model.UploadExtensionFileRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UploadExtensionFileResponse;
import com.huaweicloud.sdk.cloudide.v2.model.UploadFilePublisherRequest;
import com.huaweicloud.sdk.cloudide.v2.model.UploadFilePublisherResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudIDEClient {

    protected HcClient hcClient;

    public CloudIDEClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudIDEClient> newBuilder() {
        ClientBuilder<CloudIDEClient> clientBuilder = new ClientBuilder<>(CloudIDEClient::new);
        return clientBuilder;
    }

    /**
     * 添加插件评论
     *
     * 添加插件评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取当前用户下的发布商列表
     *
     * 获取当前用户下的发布商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublisherRequest 请求对象
     * @return ListPublisherResponse
     */
    public ListPublisherResponse listPublisher(ListPublisherRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listPublisher);
    }

    /**
     * 获取当前用户下的发布商列表
     *
     * 获取当前用户下的发布商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublisherRequest 请求对象
     * @return SyncInvoker<ListPublisherRequest, ListPublisherResponse>
     */
    public SyncInvoker<ListPublisherRequest, ListPublisherResponse> listPublisherInvoker(ListPublisherRequest request) {
        return new SyncInvoker<ListPublisherRequest, ListPublisherResponse>(request, CloudIDEMeta.listPublisher,
            hcClient);
    }

    /**
     * 按region获取标签所有技术栈
     *
     * 按region获取标签所有技术栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return SyncInvoker<ListStacksRequest, ListStacksResponse>
     */
    public SyncInvoker<ListStacksRequest, ListStacksResponse> listStacksInvoker(ListStacksRequest request) {
        return new SyncInvoker<ListStacksRequest, ListStacksResponse>(request, CloudIDEMeta.listStacks, hcClient);
    }

    /**
     * 插件发布
     *
     * 插件发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishExtensionRequest 请求对象
     * @return PublishExtensionResponse
     */
    public PublishExtensionResponse publishExtension(PublishExtensionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.publishExtension);
    }

    /**
     * 插件发布
     *
     * 插件发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishExtensionRequest 请求对象
     * @return SyncInvoker<PublishExtensionRequest, PublishExtensionResponse>
     */
    public SyncInvoker<PublishExtensionRequest, PublishExtensionResponse> publishExtensionInvoker(
        PublishExtensionRequest request) {
        return new SyncInvoker<PublishExtensionRequest, PublishExtensionResponse>(request,
            CloudIDEMeta.publishExtension, hcClient);
    }

    /**
     * 查询当前帐号访问权限
     *
     * 查询当前帐号访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询插件分类
     *
     * 查询插件分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCategoryListRequest 请求对象
     * @return ShowCategoryListResponse
     */
    public ShowCategoryListResponse showCategoryList(ShowCategoryListRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showCategoryList);
    }

    /**
     * 查询插件分类
     *
     * 查询插件分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCategoryListRequest 请求对象
     * @return SyncInvoker<ShowCategoryListRequest, ShowCategoryListResponse>
     */
    public SyncInvoker<ShowCategoryListRequest, ShowCategoryListResponse> showCategoryListInvoker(
        ShowCategoryListRequest request) {
        return new SyncInvoker<ShowCategoryListRequest, ShowCategoryListResponse>(request,
            CloudIDEMeta.showCategoryList, hcClient);
    }

    /**
     * 查询ide实例对插件的授权情况
     *
     * 查询ide实例对插件的授权情况，同意授权的插件能在ide实例内携带登陆用户的token调用第三方服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取插件检测结果
     *
     * 获取插件检测结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtensionTestingResultRequest 请求对象
     * @return ShowExtensionTestingResultResponse
     */
    public ShowExtensionTestingResultResponse showExtensionTestingResult(ShowExtensionTestingResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showExtensionTestingResult);
    }

    /**
     * 获取插件检测结果
     *
     * 获取插件检测结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtensionTestingResultRequest 请求对象
     * @return SyncInvoker<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse>
     */
    public SyncInvoker<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse> showExtensionTestingResultInvoker(
        ShowExtensionTestingResultRequest request) {
        return new SyncInvoker<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse>(request,
            CloudIDEMeta.showExtensionTestingResult, hcClient);
    }

    /**
     * 获取技术栈计费信息
     *
     * 获取技术栈计费信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 文件上传归一化
     *
     * 文件上传归一化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadFilePublisherRequest 请求对象
     * @return UploadFilePublisherResponse
     */
    public UploadFilePublisherResponse uploadFilePublisher(UploadFilePublisherRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.uploadFilePublisher);
    }

    /**
     * 文件上传归一化
     *
     * 文件上传归一化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadFilePublisherRequest 请求对象
     * @return SyncInvoker<UploadFilePublisherRequest, UploadFilePublisherResponse>
     */
    public SyncInvoker<UploadFilePublisherRequest, UploadFilePublisherResponse> uploadFilePublisherInvoker(
        UploadFilePublisherRequest request) {
        return new SyncInvoker<UploadFilePublisherRequest, UploadFilePublisherResponse>(request,
            CloudIDEMeta.uploadFilePublisher, hcClient);
    }

    /**
     * CreateAcceptance接口
     *
     * create a acceptance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAcceptanceRequest 请求对象
     * @return CreateAcceptanceResponse
     */
    public CreateAcceptanceResponse createAcceptance(CreateAcceptanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createAcceptance);
    }

    /**
     * CreateAcceptance接口
     *
     * create a acceptance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAcceptanceRequest 请求对象
     * @return SyncInvoker<CreateAcceptanceRequest, CreateAcceptanceResponse>
     */
    public SyncInvoker<CreateAcceptanceRequest, CreateAcceptanceResponse> createAcceptanceInvoker(
        CreateAcceptanceRequest request) {
        return new SyncInvoker<CreateAcceptanceRequest, CreateAcceptanceResponse>(request,
            CloudIDEMeta.createAcceptance, hcClient);
    }

    /**
     * CreateJoinRequest接口
     *
     * create a join-request
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplyRequest 请求对象
     * @return CreateApplyResponse
     */
    public CreateApplyResponse createApply(CreateApplyRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createApply);
    }

    /**
     * CreateJoinRequest接口
     *
     * create a join-request
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplyRequest 请求对象
     * @return SyncInvoker<CreateApplyRequest, CreateApplyResponse>
     */
    public SyncInvoker<CreateApplyRequest, CreateApplyResponse> createApplyInvoker(CreateApplyRequest request) {
        return new SyncInvoker<CreateApplyRequest, CreateApplyResponse>(request, CloudIDEMeta.createApply, hcClient);
    }

    /**
     * CreateEvent接口
     *
     * create an event
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return CreateEventResponse
     */
    public CreateEventResponse createEvent(CreateEventRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createEvent);
    }

    /**
     * CreateEvent接口
     *
     * create an event
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return SyncInvoker<CreateEventRequest, CreateEventResponse>
     */
    public SyncInvoker<CreateEventRequest, CreateEventResponse> createEventInvoker(CreateEventRequest request) {
        return new SyncInvoker<CreateEventRequest, CreateEventResponse>(request, CloudIDEMeta.createEvent, hcClient);
    }

    /**
     * CreateLogin接口
     *
     * create a login
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoginRequest 请求对象
     * @return CreateLoginResponse
     */
    public CreateLoginResponse createLogin(CreateLoginRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createLogin);
    }

    /**
     * CreateLogin接口
     *
     * create a login
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoginRequest 请求对象
     * @return SyncInvoker<CreateLoginRequest, CreateLoginResponse>
     */
    public SyncInvoker<CreateLoginRequest, CreateLoginResponse> createLoginInvoker(CreateLoginRequest request) {
        return new SyncInvoker<CreateLoginRequest, CreateLoginResponse>(request, CloudIDEMeta.createLogin, hcClient);
    }

    /**
     * Create Request接口
     *
     * create a code generation request.
     * 
     * if agent receives a code generation request, it will:
     * - record the request into mysql,
     * - decompose the request into &#x60;topn&#x60; tasks.
     * - send the tasks to kafka.
     * 
     * if agent receives a duplicated code generation request, it will not decompose request and send to kafka.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRequestRequest 请求对象
     * @return CreateRequestResponse
     */
    public CreateRequestResponse createRequest(CreateRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createRequest);
    }

    /**
     * Create Request接口
     *
     * create a code generation request.
     * 
     * if agent receives a code generation request, it will:
     * - record the request into mysql,
     * - decompose the request into &#x60;topn&#x60; tasks.
     * - send the tasks to kafka.
     * 
     * if agent receives a duplicated code generation request, it will not decompose request and send to kafka.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRequestRequest 请求对象
     * @return SyncInvoker<CreateRequestRequest, CreateRequestResponse>
     */
    public SyncInvoker<CreateRequestRequest, CreateRequestResponse> createRequestInvoker(CreateRequestRequest request) {
        return new SyncInvoker<CreateRequestRequest, CreateRequestResponse>(request, CloudIDEMeta.createRequest,
            hcClient);
    }

    /**
     * Show Result接口
     *
     * get the result of the code generation request.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResultRequest 请求对象
     * @return ShowResultResponse
     */
    public ShowResultResponse showResult(ShowResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showResult);
    }

    /**
     * Show Result接口
     *
     * get the result of the code generation request.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResultRequest 请求对象
     * @return SyncInvoker<ShowResultRequest, ShowResultResponse>
     */
    public SyncInvoker<ShowResultRequest, ShowResultResponse> showResultInvoker(ShowResultRequest request) {
        return new SyncInvoker<ShowResultRequest, ShowResultResponse>(request, CloudIDEMeta.showResult, hcClient);
    }

    /**
     * start_chat_codebreezetsbot_v1_devmind_tsbot_start_chat_post接口
     *
     * 开启对话
     * :param data: example: {\&quot;user_type\&quot;: \&quot;IDE\&quot;}
     * :return:
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartChatRequest 请求对象
     * @return StartChatResponse
     */
    public StartChatResponse startChat(StartChatRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.startChat);
    }

    /**
     * start_chat_codebreezetsbot_v1_devmind_tsbot_start_chat_post接口
     *
     * 开启对话
     * :param data: example: {\&quot;user_type\&quot;: \&quot;IDE\&quot;}
     * :return:
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartChatRequest 请求对象
     * @return SyncInvoker<StartChatRequest, StartChatResponse>
     */
    public SyncInvoker<StartChatRequest, StartChatResponse> startChatInvoker(StartChatRequest request) {
        return new SyncInvoker<StartChatRequest, StartChatResponse>(request, CloudIDEMeta.startChat, hcClient);
    }

    /**
     * async_chat_codebreezetsbot_v1_devmind_tsbot_async_chat_post接口
     *
     * 异步聊天请求
     * :param data: ChatRequestMessage
     * :return:
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncChatRequest 请求对象
     * @return SyncChatResponse
     */
    public SyncChatResponse syncChat(SyncChatRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.syncChat);
    }

    /**
     * async_chat_codebreezetsbot_v1_devmind_tsbot_async_chat_post接口
     *
     * 异步聊天请求
     * :param data: ChatRequestMessage
     * :return:
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncChatRequest 请求对象
     * @return SyncInvoker<SyncChatRequest, SyncChatResponse>
     */
    public SyncInvoker<SyncChatRequest, SyncChatResponse> syncChatInvoker(SyncChatRequest request) {
        return new SyncInvoker<SyncChatRequest, SyncChatResponse>(request, CloudIDEMeta.syncChat, hcClient);
    }

    /**
     * async_get_chat_result_codebreezetsbot_v1_devmind_tsbot_async_get_chat_result_post接口
     *
     * 异步聊天获取结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncGetChatResultRequest 请求对象
     * @return SyncGetChatResultResponse
     */
    public SyncGetChatResultResponse syncGetChatResult(SyncGetChatResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.syncGetChatResult);
    }

    /**
     * async_get_chat_result_codebreezetsbot_v1_devmind_tsbot_async_get_chat_result_post接口
     *
     * 异步聊天获取结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncGetChatResultRequest 请求对象
     * @return SyncInvoker<SyncGetChatResultRequest, SyncGetChatResultResponse>
     */
    public SyncInvoker<SyncGetChatResultRequest, SyncGetChatResultResponse> syncGetChatResultInvoker(
        SyncGetChatResultRequest request) {
        return new SyncInvoker<SyncGetChatResultRequest, SyncGetChatResultResponse>(request,
            CloudIDEMeta.syncGetChatResult, hcClient);
    }

    /**
     * 查询用户是否有权限访问某个IDE实例
     *
     * 查询用户是否有权限访问某个IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
