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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudIDEAsyncClient {

    protected HcClient hcClient;

    public CloudIDEAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudIDEAsyncClient> newBuilder() {
        ClientBuilder<CloudIDEAsyncClient> clientBuilder = new ClientBuilder<>(CloudIDEAsyncClient::new);
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
     * @return CompletableFuture<AddExtensionEvaluationResponse>
     */
    public CompletableFuture<AddExtensionEvaluationResponse> addExtensionEvaluationAsync(
        AddExtensionEvaluationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.addExtensionEvaluation);
    }

    /**
     * 添加插件评论
     *
     * 添加插件评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddExtensionEvaluationRequest 请求对象
     * @return AsyncInvoker<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse>
     */
    public AsyncInvoker<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse> addExtensionEvaluationAsyncInvoker(
        AddExtensionEvaluationRequest request) {
        return new AsyncInvoker<AddExtensionEvaluationRequest, AddExtensionEvaluationResponse>(request,
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
     * @return CompletableFuture<AddExtensionEvaluationReplyResponse>
     */
    public CompletableFuture<AddExtensionEvaluationReplyResponse> addExtensionEvaluationReplyAsync(
        AddExtensionEvaluationReplyRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.addExtensionEvaluationReply);
    }

    /**
     * 添加评论回复、回复评论回复
     *
     * 添加评论回复、回复评论回复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddExtensionEvaluationReplyRequest 请求对象
     * @return AsyncInvoker<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse>
     */
    public AsyncInvoker<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse> addExtensionEvaluationReplyAsyncInvoker(
        AddExtensionEvaluationReplyRequest request) {
        return new AsyncInvoker<AddExtensionEvaluationReplyRequest, AddExtensionEvaluationReplyResponse>(request,
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
     * @return CompletableFuture<AddExtensionStarResponse>
     */
    public CompletableFuture<AddExtensionStarResponse> addExtensionStarAsync(AddExtensionStarRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.addExtensionStar);
    }

    /**
     * 添加新评星
     *
     * 添加新评星
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddExtensionStarRequest 请求对象
     * @return AsyncInvoker<AddExtensionStarRequest, AddExtensionStarResponse>
     */
    public AsyncInvoker<AddExtensionStarRequest, AddExtensionStarResponse> addExtensionStarAsyncInvoker(
        AddExtensionStarRequest request) {
        return new AsyncInvoker<AddExtensionStarRequest, AddExtensionStarResponse>(request,
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
     * @return CompletableFuture<CheckMaliciousExtensionEvaluationResponse>
     */
    public CompletableFuture<CheckMaliciousExtensionEvaluationResponse> checkMaliciousExtensionEvaluationAsync(
        CheckMaliciousExtensionEvaluationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.checkMaliciousExtensionEvaluation);
    }

    /**
     * 举报评论,举报回复
     *
     * 举报评论,举报回复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckMaliciousExtensionEvaluationRequest 请求对象
     * @return AsyncInvoker<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse>
     */
    public AsyncInvoker<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse> checkMaliciousExtensionEvaluationAsyncInvoker(
        CheckMaliciousExtensionEvaluationRequest request) {
        return new AsyncInvoker<CheckMaliciousExtensionEvaluationRequest, CheckMaliciousExtensionEvaluationResponse>(
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
     * @return CompletableFuture<CreateExtensionAuthorizationResponse>
     */
    public CompletableFuture<CreateExtensionAuthorizationResponse> createExtensionAuthorizationAsync(
        CreateExtensionAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createExtensionAuthorization);
    }

    /**
     * 设置ide实例对插件的授权
     *
     * 设置ide实例对插件的授权。同意、不同意、未知（下次重新询问）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExtensionAuthorizationRequest 请求对象
     * @return AsyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse>
     */
    public AsyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> createExtensionAuthorizationAsyncInvoker(
        CreateExtensionAuthorizationRequest request) {
        return new AsyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse>(request,
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
     * @return CompletableFuture<DeleteEvaluationResponse>
     */
    public CompletableFuture<DeleteEvaluationResponse> deleteEvaluationAsync(DeleteEvaluationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.deleteEvaluation);
    }

    /**
     * 删除评论
     *
     * 删除评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEvaluationRequest 请求对象
     * @return AsyncInvoker<DeleteEvaluationRequest, DeleteEvaluationResponse>
     */
    public AsyncInvoker<DeleteEvaluationRequest, DeleteEvaluationResponse> deleteEvaluationAsyncInvoker(
        DeleteEvaluationRequest request) {
        return new AsyncInvoker<DeleteEvaluationRequest, DeleteEvaluationResponse>(request,
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
     * @return CompletableFuture<DeleteEvaluationReplyResponse>
     */
    public CompletableFuture<DeleteEvaluationReplyResponse> deleteEvaluationReplyAsync(
        DeleteEvaluationReplyRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.deleteEvaluationReply);
    }

    /**
     * 删除回复
     *
     * 删除回复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEvaluationReplyRequest 请求对象
     * @return AsyncInvoker<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse>
     */
    public AsyncInvoker<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse> deleteEvaluationReplyAsyncInvoker(
        DeleteEvaluationReplyRequest request) {
        return new AsyncInvoker<DeleteEvaluationReplyRequest, DeleteEvaluationReplyResponse>(request,
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
     * @return CompletableFuture<ListExtensionsResponse>
     */
    public CompletableFuture<ListExtensionsResponse> listExtensionsAsync(ListExtensionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listExtensions);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExtensionsRequest 请求对象
     * @return AsyncInvoker<ListExtensionsRequest, ListExtensionsResponse>
     */
    public AsyncInvoker<ListExtensionsRequest, ListExtensionsResponse> listExtensionsAsyncInvoker(
        ListExtensionsRequest request) {
        return new AsyncInvoker<ListExtensionsRequest, ListExtensionsResponse>(request, CloudIDEMeta.listExtensions,
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
     * @return CompletableFuture<ListProjectTemplatesResponse>
     */
    public CompletableFuture<ListProjectTemplatesResponse> listProjectTemplatesAsync(
        ListProjectTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listProjectTemplates);
    }

    /**
     * 查询技术栈模板工程
     *
     * 查询技术栈模板工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return AsyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse>
     */
    public AsyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplatesAsyncInvoker(
        ListProjectTemplatesRequest request) {
        return new AsyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse>(request,
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
     * @return CompletableFuture<ListPublisherResponse>
     */
    public CompletableFuture<ListPublisherResponse> listPublisherAsync(ListPublisherRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listPublisher);
    }

    /**
     * 获取当前用户下的发布商列表
     *
     * 获取当前用户下的发布商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublisherRequest 请求对象
     * @return AsyncInvoker<ListPublisherRequest, ListPublisherResponse>
     */
    public AsyncInvoker<ListPublisherRequest, ListPublisherResponse> listPublisherAsyncInvoker(
        ListPublisherRequest request) {
        return new AsyncInvoker<ListPublisherRequest, ListPublisherResponse>(request, CloudIDEMeta.listPublisher,
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
     * @return CompletableFuture<ListStacksResponse>
     */
    public CompletableFuture<ListStacksResponse> listStacksAsync(ListStacksRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listStacks);
    }

    /**
     * 按region获取标签所有技术栈
     *
     * 按region获取标签所有技术栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return AsyncInvoker<ListStacksRequest, ListStacksResponse>
     */
    public AsyncInvoker<ListStacksRequest, ListStacksResponse> listStacksAsyncInvoker(ListStacksRequest request) {
        return new AsyncInvoker<ListStacksRequest, ListStacksResponse>(request, CloudIDEMeta.listStacks, hcClient);
    }

    /**
     * 插件发布
     *
     * 插件发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishExtensionRequest 请求对象
     * @return CompletableFuture<PublishExtensionResponse>
     */
    public CompletableFuture<PublishExtensionResponse> publishExtensionAsync(PublishExtensionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.publishExtension);
    }

    /**
     * 插件发布
     *
     * 插件发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishExtensionRequest 请求对象
     * @return AsyncInvoker<PublishExtensionRequest, PublishExtensionResponse>
     */
    public AsyncInvoker<PublishExtensionRequest, PublishExtensionResponse> publishExtensionAsyncInvoker(
        PublishExtensionRequest request) {
        return new AsyncInvoker<PublishExtensionRequest, PublishExtensionResponse>(request,
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
     * @return CompletableFuture<ShowAccountStatusResponse>
     */
    public CompletableFuture<ShowAccountStatusResponse> showAccountStatusAsync(ShowAccountStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showAccountStatus);
    }

    /**
     * 查询当前帐号访问权限
     *
     * 查询当前帐号访问权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccountStatusRequest 请求对象
     * @return AsyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse>
     */
    public AsyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatusAsyncInvoker(
        ShowAccountStatusRequest request) {
        return new AsyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse>(request,
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
     * @return CompletableFuture<ShowCategoryListResponse>
     */
    public CompletableFuture<ShowCategoryListResponse> showCategoryListAsync(ShowCategoryListRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showCategoryList);
    }

    /**
     * 查询插件分类
     *
     * 查询插件分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCategoryListRequest 请求对象
     * @return AsyncInvoker<ShowCategoryListRequest, ShowCategoryListResponse>
     */
    public AsyncInvoker<ShowCategoryListRequest, ShowCategoryListResponse> showCategoryListAsyncInvoker(
        ShowCategoryListRequest request) {
        return new AsyncInvoker<ShowCategoryListRequest, ShowCategoryListResponse>(request,
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
     * @return CompletableFuture<ShowExtensionAuthorizationResponse>
     */
    public CompletableFuture<ShowExtensionAuthorizationResponse> showExtensionAuthorizationAsync(
        ShowExtensionAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showExtensionAuthorization);
    }

    /**
     * 查询ide实例对插件的授权情况
     *
     * 查询ide实例对插件的授权情况，同意授权的插件能在ide实例内携带登陆用户的token调用第三方服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtensionAuthorizationRequest 请求对象
     * @return AsyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse>
     */
    public AsyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> showExtensionAuthorizationAsyncInvoker(
        ShowExtensionAuthorizationRequest request) {
        return new AsyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse>(request,
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
     * @return CompletableFuture<ShowExtensionDetailResponse>
     */
    public CompletableFuture<ShowExtensionDetailResponse> showExtensionDetailAsync(ShowExtensionDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showExtensionDetail);
    }

    /**
     * 查询插件详细信息
     *
     * 查询插件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtensionDetailRequest 请求对象
     * @return AsyncInvoker<ShowExtensionDetailRequest, ShowExtensionDetailResponse>
     */
    public AsyncInvoker<ShowExtensionDetailRequest, ShowExtensionDetailResponse> showExtensionDetailAsyncInvoker(
        ShowExtensionDetailRequest request) {
        return new AsyncInvoker<ShowExtensionDetailRequest, ShowExtensionDetailResponse>(request,
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
     * @return CompletableFuture<ShowExtensionEvaluationResponse>
     */
    public CompletableFuture<ShowExtensionEvaluationResponse> showExtensionEvaluationAsync(
        ShowExtensionEvaluationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showExtensionEvaluation);
    }

    /**
     * 查询插件评价
     *
     * 查询插件评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtensionEvaluationRequest 请求对象
     * @return AsyncInvoker<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse>
     */
    public AsyncInvoker<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse> showExtensionEvaluationAsyncInvoker(
        ShowExtensionEvaluationRequest request) {
        return new AsyncInvoker<ShowExtensionEvaluationRequest, ShowExtensionEvaluationResponse>(request,
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
     * @return CompletableFuture<ShowExtensionEvaluationStarResponse>
     */
    public CompletableFuture<ShowExtensionEvaluationStarResponse> showExtensionEvaluationStarAsync(
        ShowExtensionEvaluationStarRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showExtensionEvaluationStar);
    }

    /**
     * 查询插件评星
     *
     * 查询插件评星
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtensionEvaluationStarRequest 请求对象
     * @return AsyncInvoker<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse>
     */
    public AsyncInvoker<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse> showExtensionEvaluationStarAsyncInvoker(
        ShowExtensionEvaluationStarRequest request) {
        return new AsyncInvoker<ShowExtensionEvaluationStarRequest, ShowExtensionEvaluationStarResponse>(request,
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
     * @return CompletableFuture<ShowExtensionTestingResultResponse>
     */
    public CompletableFuture<ShowExtensionTestingResultResponse> showExtensionTestingResultAsync(
        ShowExtensionTestingResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showExtensionTestingResult);
    }

    /**
     * 获取插件检测结果
     *
     * 获取插件检测结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtensionTestingResultRequest 请求对象
     * @return AsyncInvoker<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse>
     */
    public AsyncInvoker<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse> showExtensionTestingResultAsyncInvoker(
        ShowExtensionTestingResultRequest request) {
        return new AsyncInvoker<ShowExtensionTestingResultRequest, ShowExtensionTestingResultResponse>(request,
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
     * @return CompletableFuture<ShowPriceResponse>
     */
    public CompletableFuture<ShowPriceResponse> showPriceAsync(ShowPriceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showPrice);
    }

    /**
     * 获取技术栈计费信息
     *
     * 获取技术栈计费信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPriceRequest 请求对象
     * @return AsyncInvoker<ShowPriceRequest, ShowPriceResponse>
     */
    public AsyncInvoker<ShowPriceRequest, ShowPriceResponse> showPriceAsyncInvoker(ShowPriceRequest request) {
        return new AsyncInvoker<ShowPriceRequest, ShowPriceResponse>(request, CloudIDEMeta.showPrice, hcClient);
    }

    /**
     * 上传插件
     *
     * 上传插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadExtensionFileRequest 请求对象
     * @return CompletableFuture<UploadExtensionFileResponse>
     */
    public CompletableFuture<UploadExtensionFileResponse> uploadExtensionFileAsync(UploadExtensionFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.uploadExtensionFile);
    }

    /**
     * 上传插件
     *
     * 上传插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadExtensionFileRequest 请求对象
     * @return AsyncInvoker<UploadExtensionFileRequest, UploadExtensionFileResponse>
     */
    public AsyncInvoker<UploadExtensionFileRequest, UploadExtensionFileResponse> uploadExtensionFileAsyncInvoker(
        UploadExtensionFileRequest request) {
        return new AsyncInvoker<UploadExtensionFileRequest, UploadExtensionFileResponse>(request,
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
     * @return CompletableFuture<UploadFilePublisherResponse>
     */
    public CompletableFuture<UploadFilePublisherResponse> uploadFilePublisherAsync(UploadFilePublisherRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.uploadFilePublisher);
    }

    /**
     * 文件上传归一化
     *
     * 文件上传归一化
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadFilePublisherRequest 请求对象
     * @return AsyncInvoker<UploadFilePublisherRequest, UploadFilePublisherResponse>
     */
    public AsyncInvoker<UploadFilePublisherRequest, UploadFilePublisherResponse> uploadFilePublisherAsyncInvoker(
        UploadFilePublisherRequest request) {
        return new AsyncInvoker<UploadFilePublisherRequest, UploadFilePublisherResponse>(request,
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
     * @return CompletableFuture<CreateAcceptanceResponse>
     */
    public CompletableFuture<CreateAcceptanceResponse> createAcceptanceAsync(CreateAcceptanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createAcceptance);
    }

    /**
     * CreateAcceptance接口
     *
     * create a acceptance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAcceptanceRequest 请求对象
     * @return AsyncInvoker<CreateAcceptanceRequest, CreateAcceptanceResponse>
     */
    public AsyncInvoker<CreateAcceptanceRequest, CreateAcceptanceResponse> createAcceptanceAsyncInvoker(
        CreateAcceptanceRequest request) {
        return new AsyncInvoker<CreateAcceptanceRequest, CreateAcceptanceResponse>(request,
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
     * @return CompletableFuture<CreateApplyResponse>
     */
    public CompletableFuture<CreateApplyResponse> createApplyAsync(CreateApplyRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createApply);
    }

    /**
     * CreateJoinRequest接口
     *
     * create a join-request
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplyRequest 请求对象
     * @return AsyncInvoker<CreateApplyRequest, CreateApplyResponse>
     */
    public AsyncInvoker<CreateApplyRequest, CreateApplyResponse> createApplyAsyncInvoker(CreateApplyRequest request) {
        return new AsyncInvoker<CreateApplyRequest, CreateApplyResponse>(request, CloudIDEMeta.createApply, hcClient);
    }

    /**
     * CreateEvent接口
     *
     * create an event
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return CompletableFuture<CreateEventResponse>
     */
    public CompletableFuture<CreateEventResponse> createEventAsync(CreateEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createEvent);
    }

    /**
     * CreateEvent接口
     *
     * create an event
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return AsyncInvoker<CreateEventRequest, CreateEventResponse>
     */
    public AsyncInvoker<CreateEventRequest, CreateEventResponse> createEventAsyncInvoker(CreateEventRequest request) {
        return new AsyncInvoker<CreateEventRequest, CreateEventResponse>(request, CloudIDEMeta.createEvent, hcClient);
    }

    /**
     * CreateLogin接口
     *
     * create a login
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoginRequest 请求对象
     * @return CompletableFuture<CreateLoginResponse>
     */
    public CompletableFuture<CreateLoginResponse> createLoginAsync(CreateLoginRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createLogin);
    }

    /**
     * CreateLogin接口
     *
     * create a login
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoginRequest 请求对象
     * @return AsyncInvoker<CreateLoginRequest, CreateLoginResponse>
     */
    public AsyncInvoker<CreateLoginRequest, CreateLoginResponse> createLoginAsyncInvoker(CreateLoginRequest request) {
        return new AsyncInvoker<CreateLoginRequest, CreateLoginResponse>(request, CloudIDEMeta.createLogin, hcClient);
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
     * @return CompletableFuture<CreateRequestResponse>
     */
    public CompletableFuture<CreateRequestResponse> createRequestAsync(CreateRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createRequest);
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
     * @return AsyncInvoker<CreateRequestRequest, CreateRequestResponse>
     */
    public AsyncInvoker<CreateRequestRequest, CreateRequestResponse> createRequestAsyncInvoker(
        CreateRequestRequest request) {
        return new AsyncInvoker<CreateRequestRequest, CreateRequestResponse>(request, CloudIDEMeta.createRequest,
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
     * @return CompletableFuture<ShowResultResponse>
     */
    public CompletableFuture<ShowResultResponse> showResultAsync(ShowResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showResult);
    }

    /**
     * Show Result接口
     *
     * get the result of the code generation request.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResultRequest 请求对象
     * @return AsyncInvoker<ShowResultRequest, ShowResultResponse>
     */
    public AsyncInvoker<ShowResultRequest, ShowResultResponse> showResultAsyncInvoker(ShowResultRequest request) {
        return new AsyncInvoker<ShowResultRequest, ShowResultResponse>(request, CloudIDEMeta.showResult, hcClient);
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
     * @return CompletableFuture<StartChatResponse>
     */
    public CompletableFuture<StartChatResponse> startChatAsync(StartChatRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.startChat);
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
     * @return AsyncInvoker<StartChatRequest, StartChatResponse>
     */
    public AsyncInvoker<StartChatRequest, StartChatResponse> startChatAsyncInvoker(StartChatRequest request) {
        return new AsyncInvoker<StartChatRequest, StartChatResponse>(request, CloudIDEMeta.startChat, hcClient);
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
     * @return CompletableFuture<SyncChatResponse>
     */
    public CompletableFuture<SyncChatResponse> syncChatAsync(SyncChatRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.syncChat);
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
     * @return AsyncInvoker<SyncChatRequest, SyncChatResponse>
     */
    public AsyncInvoker<SyncChatRequest, SyncChatResponse> syncChatAsyncInvoker(SyncChatRequest request) {
        return new AsyncInvoker<SyncChatRequest, SyncChatResponse>(request, CloudIDEMeta.syncChat, hcClient);
    }

    /**
     * async_get_chat_result_codebreezetsbot_v1_devmind_tsbot_async_get_chat_result_post接口
     *
     * 异步聊天获取结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncGetChatResultRequest 请求对象
     * @return CompletableFuture<SyncGetChatResultResponse>
     */
    public CompletableFuture<SyncGetChatResultResponse> syncGetChatResultAsync(SyncGetChatResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.syncGetChatResult);
    }

    /**
     * async_get_chat_result_codebreezetsbot_v1_devmind_tsbot_async_get_chat_result_post接口
     *
     * 异步聊天获取结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncGetChatResultRequest 请求对象
     * @return AsyncInvoker<SyncGetChatResultRequest, SyncGetChatResultResponse>
     */
    public AsyncInvoker<SyncGetChatResultRequest, SyncGetChatResultResponse> syncGetChatResultAsyncInvoker(
        SyncGetChatResultRequest request) {
        return new AsyncInvoker<SyncGetChatResultRequest, SyncGetChatResultResponse>(request,
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
     * @return CompletableFuture<CheckInstanceAccessResponse>
     */
    public CompletableFuture<CheckInstanceAccessResponse> checkInstanceAccessAsync(CheckInstanceAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.checkInstanceAccess);
    }

    /**
     * 查询用户是否有权限访问某个IDE实例
     *
     * 查询用户是否有权限访问某个IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckInstanceAccessRequest 请求对象
     * @return AsyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse>
     */
    public AsyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse> checkInstanceAccessAsyncInvoker(
        CheckInstanceAccessRequest request) {
        return new AsyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse>(request,
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
     * @return CompletableFuture<CheckNameResponse>
     */
    public CompletableFuture<CheckNameResponse> checkNameAsync(CheckNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.checkName);
    }

    /**
     * 查询IDE实例名是否重复
     *
     * 查询IDE实例名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckNameRequest 请求对象
     * @return AsyncInvoker<CheckNameRequest, CheckNameResponse>
     */
    public AsyncInvoker<CheckNameRequest, CheckNameResponse> checkNameAsyncInvoker(CheckNameRequest request) {
        return new AsyncInvoker<CheckNameRequest, CheckNameResponse>(request, CloudIDEMeta.checkName, hcClient);
    }

    /**
     * 创建IDE实例
     *
     * 创建IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createInstance);
    }

    /**
     * 创建IDE实例
     *
     * 创建IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, CloudIDEMeta.createInstance,
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
     * @return CompletableFuture<CreateInstanceBy3rdResponse>
     */
    public CompletableFuture<CreateInstanceBy3rdResponse> createInstanceBy3rdAsync(CreateInstanceBy3rdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createInstanceBy3rd);
    }

    /**
     * 外部第三方集成商创建IDE实例
     *
     * 创建IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return AsyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse>
     */
    public AsyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rdAsyncInvoker(
        CreateInstanceBy3rdRequest request) {
        return new AsyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse>(request,
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
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.deleteInstance);
    }

    /**
     * 删除IDE实例
     *
     * 删除IDE实例（同时删除磁盘数据）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, CloudIDEMeta.deleteInstance,
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
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listInstances);
    }

    /**
     * 查询IDE实例列表
     *
     * 查询IDE实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CloudIDEMeta.listInstances,
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
     * @return CompletableFuture<ListOrgInstancesResponse>
     */
    public CompletableFuture<ListOrgInstancesResponse> listOrgInstancesAsync(ListOrgInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listOrgInstances);
    }

    /**
     * 查询某个租户下的IDE实例列表
     *
     * 查询某个租户下的IDE实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return AsyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse>
     */
    public AsyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstancesAsyncInvoker(
        ListOrgInstancesRequest request) {
        return new AsyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse>(request,
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
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showInstance);
    }

    /**
     * 查询某个IDE实例
     *
     * 查询某个IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, CloudIDEMeta.showInstance,
            hcClient);
    }

    /**
     * 查询某个IDE实例的状态
     *
     * 查询某个IDE实例的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceStatusInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceStatusInfoResponse>
     */
    public CompletableFuture<ShowInstanceStatusInfoResponse> showInstanceStatusInfoAsync(
        ShowInstanceStatusInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showInstanceStatusInfo);
    }

    /**
     * 查询某个IDE实例的状态
     *
     * 查询某个IDE实例的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceStatusInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse>
     */
    public AsyncInvoker<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> showInstanceStatusInfoAsyncInvoker(
        ShowInstanceStatusInfoRequest request) {
        return new AsyncInvoker<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse>(request,
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
     * @return CompletableFuture<StartInstanceResponse>
     */
    public CompletableFuture<StartInstanceResponse> startInstanceAsync(StartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.startInstance);
    }

    /**
     * 启动IDE实例
     *
     * 启动IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartInstanceRequest 请求对象
     * @return AsyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public AsyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceAsyncInvoker(
        StartInstanceRequest request) {
        return new AsyncInvoker<StartInstanceRequest, StartInstanceResponse>(request, CloudIDEMeta.startInstance,
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
     * @return CompletableFuture<StopInstanceResponse>
     */
    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.stopInstance);
    }

    /**
     * 停止IDE实例
     *
     * 停止IDE实例（不删除磁盘数据）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return AsyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public AsyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceAsyncInvoker(
        StopInstanceRequest request) {
        return new AsyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, CloudIDEMeta.stopInstance,
            hcClient);
    }

    /**
     * 修改IDE实例
     *
     * 修改IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.updateInstance);
    }

    /**
     * 修改IDE实例
     *
     * 修改IDE实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, CloudIDEMeta.updateInstance,
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
     * @return CompletableFuture<UpdateInstanceActivityResponse>
     */
    public CompletableFuture<UpdateInstanceActivityResponse> updateInstanceActivityAsync(
        UpdateInstanceActivityRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.updateInstanceActivity);
    }

    /**
     * 刷新IDE实例活跃状态
     *
     * 刷新IDE实例活跃状态，超过该实例设置的过期时间后实例自动关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceActivityRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse>
     */
    public AsyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> updateInstanceActivityAsyncInvoker(
        UpdateInstanceActivityRequest request) {
        return new AsyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse>(request,
            CloudIDEMeta.updateInstanceActivity, hcClient);
    }

}
