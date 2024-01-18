package com.huaweicloud.sdk.cbs.v1;

import com.huaweicloud.sdk.cbs.v1.model.CollectHotQuestionsRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectHotQuestionsResponse;
import com.huaweicloud.sdk.cbs.v1.model.CollectKeyWordsRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectKeyWordsResponse;
import com.huaweicloud.sdk.cbs.v1.model.CollectReplyRatesRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectReplyRatesResponse;
import com.huaweicloud.sdk.cbs.v1.model.CollectSessionStatsRequest;
import com.huaweicloud.sdk.cbs.v1.model.CollectSessionStatsResponse;
import com.huaweicloud.sdk.cbs.v1.model.CreateSessionRequest;
import com.huaweicloud.sdk.cbs.v1.model.CreateSessionResponse;
import com.huaweicloud.sdk.cbs.v1.model.DeleteSessionRequest;
import com.huaweicloud.sdk.cbs.v1.model.DeleteSessionResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoOndemandRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoOndemandResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteComposeVideoResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteCreateVideoRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteCreateVideoResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteVideoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteVideoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteimageByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteDeleteimageByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharacterInfoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharacterInfoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharactersRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetCharactersResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetFramsListByImagesIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetFramsListByImagesIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetImagesListRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetImagesListResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideoInfoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideoInfoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideosListRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteGetVideosListResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecutePostCreateImagesRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecutePostCreateImagesResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteQaChatRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteQaChatResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteSessionRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteSessionResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateImageNameRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateImageNameResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoInfoByIdRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUpdateVideoInfoByIdResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadImageRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadImageResponse;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadPptRequest;
import com.huaweicloud.sdk.cbs.v1.model.ExecuteUploadPptResponse;
import com.huaweicloud.sdk.cbs.v1.model.ListSuggestionsRequest;
import com.huaweicloud.sdk.cbs.v1.model.ListSuggestionsResponse;
import com.huaweicloud.sdk.cbs.v1.model.PostRequestsRequest;
import com.huaweicloud.sdk.cbs.v1.model.PostRequestsResponse;
import com.huaweicloud.sdk.cbs.v1.model.TagLaborRequest;
import com.huaweicloud.sdk.cbs.v1.model.TagLaborResponse;
import com.huaweicloud.sdk.cbs.v1.model.TagSatisfactionRequest;
import com.huaweicloud.sdk.cbs.v1.model.TagSatisfactionResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CbsClient {

    protected HcClient hcClient;

    public CbsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbsClient> newBuilder() {
        ClientBuilder<CbsClient> clientBuilder = new ClientBuilder<>(CbsClient::new, "BasicCredentials");
        return clientBuilder;
    }

    /**
     * 热点问题统计
     *
     * 获取完全匹配的热点标准问题列表。
     * 默认按照完全匹配标准问题被问及的频次降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectHotQuestionsRequest 请求对象
     * @return CollectHotQuestionsResponse
     */
    public CollectHotQuestionsResponse collectHotQuestions(CollectHotQuestionsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectHotQuestions);
    }

    /**
     * 热点问题统计
     *
     * 获取完全匹配的热点标准问题列表。
     * 默认按照完全匹配标准问题被问及的频次降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectHotQuestionsRequest 请求对象
     * @return SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>
     */
    public SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse> collectHotQuestionsInvoker(
        CollectHotQuestionsRequest request) {
        return new SyncInvoker<>(request, CbsMeta.collectHotQuestions, hcClient);
    }

    /**
     * 关键词统计
     *
     * 用户问关键词统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectKeyWordsRequest 请求对象
     * @return CollectKeyWordsResponse
     */
    public CollectKeyWordsResponse collectKeyWords(CollectKeyWordsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectKeyWords);
    }

    /**
     * 关键词统计
     *
     * 用户问关键词统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectKeyWordsRequest 请求对象
     * @return SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>
     */
    public SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWordsInvoker(
        CollectKeyWordsRequest request) {
        return new SyncInvoker<>(request, CbsMeta.collectKeyWords, hcClient);
    }

    /**
     * 问答统计
     *
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。
     * 如果领域未指定则表示获取所有领域的问题答复率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectReplyRatesRequest 请求对象
     * @return CollectReplyRatesResponse
     */
    public CollectReplyRatesResponse collectReplyRates(CollectReplyRatesRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectReplyRates);
    }

    /**
     * 问答统计
     *
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。
     * 如果领域未指定则表示获取所有领域的问题答复率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectReplyRatesRequest 请求对象
     * @return SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>
     */
    public SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRatesInvoker(
        CollectReplyRatesRequest request) {
        return new SyncInvoker<>(request, CbsMeta.collectReplyRates, hcClient);
    }

    /**
     * 访问统计
     *
     * 获取用户会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectSessionStatsRequest 请求对象
     * @return CollectSessionStatsResponse
     */
    public CollectSessionStatsResponse collectSessionStats(CollectSessionStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectSessionStats);
    }

    /**
     * 访问统计
     *
     * 获取用户会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectSessionStatsRequest 请求对象
     * @return SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>
     */
    public SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStatsInvoker(
        CollectSessionStatsRequest request) {
        return new SyncInvoker<>(request, CbsMeta.collectSessionStats, hcClient);
    }

    /**
     * 开启会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSessionRequest 请求对象
     * @return CreateSessionResponse
     */
    @Deprecated
    public CreateSessionResponse createSession(CreateSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.createSession);
    }

    /**
     * 开启会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSessionRequest 请求对象
     * @return SyncInvoker<CreateSessionRequest, CreateSessionResponse>
     */
    @Deprecated
    public SyncInvoker<CreateSessionRequest, CreateSessionResponse> createSessionInvoker(CreateSessionRequest request) {
        return new SyncInvoker<>(request, CbsMeta.createSession, hcClient);
    }

    /**
     * 关闭会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSessionRequest 请求对象
     * @return DeleteSessionResponse
     */
    @Deprecated
    public DeleteSessionResponse deleteSession(DeleteSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.deleteSession);
    }

    /**
     * 关闭会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSessionRequest 请求对象
     * @return SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionInvoker(DeleteSessionRequest request) {
        return new SyncInvoker<>(request, CbsMeta.deleteSession, hcClient);
    }

    /**
     * 合成视频(按包周期收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteComposeVideoRequest 请求对象
     * @return ExecuteComposeVideoResponse
     */
    public ExecuteComposeVideoResponse executeComposeVideo(ExecuteComposeVideoRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeComposeVideo);
    }

    /**
     * 合成视频(按包周期收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteComposeVideoRequest 请求对象
     * @return SyncInvoker<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse>
     */
    public SyncInvoker<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse> executeComposeVideoInvoker(
        ExecuteComposeVideoRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeComposeVideo, hcClient);
    }

    /**
     * 合成视频(按需收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteComposeVideoOndemandRequest 请求对象
     * @return ExecuteComposeVideoOndemandResponse
     */
    public ExecuteComposeVideoOndemandResponse executeComposeVideoOndemand(ExecuteComposeVideoOndemandRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeComposeVideoOndemand);
    }

    /**
     * 合成视频(按需收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteComposeVideoOndemandRequest 请求对象
     * @return SyncInvoker<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse>
     */
    public SyncInvoker<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse> executeComposeVideoOndemandInvoker(
        ExecuteComposeVideoOndemandRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeComposeVideoOndemand, hcClient);
    }

    /**
     * 创建视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCreateVideoRequest 请求对象
     * @return ExecuteCreateVideoResponse
     */
    public ExecuteCreateVideoResponse executeCreateVideo(ExecuteCreateVideoRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeCreateVideo);
    }

    /**
     * 创建视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCreateVideoRequest 请求对象
     * @return SyncInvoker<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse>
     */
    public SyncInvoker<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse> executeCreateVideoInvoker(
        ExecuteCreateVideoRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeCreateVideo, hcClient);
    }

    /**
     * 删除视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeleteVideoByIdRequest 请求对象
     * @return ExecuteDeleteVideoByIdResponse
     */
    public ExecuteDeleteVideoByIdResponse executeDeleteVideoById(ExecuteDeleteVideoByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeDeleteVideoById);
    }

    /**
     * 删除视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeleteVideoByIdRequest 请求对象
     * @return SyncInvoker<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse>
     */
    public SyncInvoker<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse> executeDeleteVideoByIdInvoker(
        ExecuteDeleteVideoByIdRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeDeleteVideoById, hcClient);
    }

    /**
     * 删除图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeleteimageByIdRequest 请求对象
     * @return ExecuteDeleteimageByIdResponse
     */
    public ExecuteDeleteimageByIdResponse executeDeleteimageById(ExecuteDeleteimageByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeDeleteimageById);
    }

    /**
     * 删除图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDeleteimageByIdRequest 请求对象
     * @return SyncInvoker<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse>
     */
    public SyncInvoker<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse> executeDeleteimageByIdInvoker(
        ExecuteDeleteimageByIdRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeDeleteimageById, hcClient);
    }

    /**
     * 获取形象详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetCharacterInfoByIdRequest 请求对象
     * @return ExecuteGetCharacterInfoByIdResponse
     */
    public ExecuteGetCharacterInfoByIdResponse executeGetCharacterInfoById(ExecuteGetCharacterInfoByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeGetCharacterInfoById);
    }

    /**
     * 获取形象详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetCharacterInfoByIdRequest 请求对象
     * @return SyncInvoker<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse>
     */
    public SyncInvoker<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse> executeGetCharacterInfoByIdInvoker(
        ExecuteGetCharacterInfoByIdRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeGetCharacterInfoById, hcClient);
    }

    /**
     * 获取形象列表
     *
     * TODO:
     * 
     * 本期不做形象进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetCharactersRequest 请求对象
     * @return ExecuteGetCharactersResponse
     */
    public ExecuteGetCharactersResponse executeGetCharacters(ExecuteGetCharactersRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeGetCharacters);
    }

    /**
     * 获取形象列表
     *
     * TODO:
     * 
     * 本期不做形象进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetCharactersRequest 请求对象
     * @return SyncInvoker<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse>
     */
    public SyncInvoker<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse> executeGetCharactersInvoker(
        ExecuteGetCharactersRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeGetCharacters, hcClient);
    }

    /**
     * 获取播报框
     *
     * 获取指定图片可用的播报框列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetFramsListByImagesIdRequest 请求对象
     * @return ExecuteGetFramsListByImagesIdResponse
     */
    public ExecuteGetFramsListByImagesIdResponse executeGetFramsListByImagesId(
        ExecuteGetFramsListByImagesIdRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeGetFramsListByImagesId);
    }

    /**
     * 获取播报框
     *
     * 获取指定图片可用的播报框列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetFramsListByImagesIdRequest 请求对象
     * @return SyncInvoker<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse>
     */
    public SyncInvoker<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse> executeGetFramsListByImagesIdInvoker(
        ExecuteGetFramsListByImagesIdRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeGetFramsListByImagesId, hcClient);
    }

    /**
     * 获取图片列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetImagesListRequest 请求对象
     * @return ExecuteGetImagesListResponse
     */
    public ExecuteGetImagesListResponse executeGetImagesList(ExecuteGetImagesListRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeGetImagesList);
    }

    /**
     * 获取图片列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetImagesListRequest 请求对象
     * @return SyncInvoker<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse>
     */
    public SyncInvoker<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse> executeGetImagesListInvoker(
        ExecuteGetImagesListRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeGetImagesList, hcClient);
    }

    /**
     * 获取视频详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetVideoInfoByIdRequest 请求对象
     * @return ExecuteGetVideoInfoByIdResponse
     */
    public ExecuteGetVideoInfoByIdResponse executeGetVideoInfoById(ExecuteGetVideoInfoByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeGetVideoInfoById);
    }

    /**
     * 获取视频详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetVideoInfoByIdRequest 请求对象
     * @return SyncInvoker<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse>
     */
    public SyncInvoker<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse> executeGetVideoInfoByIdInvoker(
        ExecuteGetVideoInfoByIdRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeGetVideoInfoById, hcClient);
    }

    /**
     * 获取视频列表
     *
     * 该接口用于获取视频列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetVideosListRequest 请求对象
     * @return ExecuteGetVideosListResponse
     */
    public ExecuteGetVideosListResponse executeGetVideosList(ExecuteGetVideosListRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeGetVideosList);
    }

    /**
     * 获取视频列表
     *
     * 该接口用于获取视频列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteGetVideosListRequest 请求对象
     * @return SyncInvoker<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse>
     */
    public SyncInvoker<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse> executeGetVideosListInvoker(
        ExecuteGetVideosListRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeGetVideosList, hcClient);
    }

    /**
     * 创建图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePostCreateImagesRequest 请求对象
     * @return ExecutePostCreateImagesResponse
     */
    public ExecutePostCreateImagesResponse executePostCreateImages(ExecutePostCreateImagesRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executePostCreateImages);
    }

    /**
     * 创建图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePostCreateImagesRequest 请求对象
     * @return SyncInvoker<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse>
     */
    public SyncInvoker<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse> executePostCreateImagesInvoker(
        ExecutePostCreateImagesRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executePostCreateImages, hcClient);
    }

    /**
     * 问答机器人会话
     *
     * 用户调用该接口和机器人进行聊天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteQaChatRequest 请求对象
     * @return ExecuteQaChatResponse
     */
    public ExecuteQaChatResponse executeQaChat(ExecuteQaChatRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeQaChat);
    }

    /**
     * 问答机器人会话
     *
     * 用户调用该接口和机器人进行聊天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteQaChatRequest 请求对象
     * @return SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>
     */
    public SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChatInvoker(ExecuteQaChatRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeQaChat, hcClient);
    }

    /**
     * 处理会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSessionRequest 请求对象
     * @return ExecuteSessionResponse
     */
    @Deprecated
    public ExecuteSessionResponse executeSession(ExecuteSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeSession);
    }

    /**
     * 处理会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSessionRequest 请求对象
     * @return SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>
     */
    @Deprecated
    public SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse> executeSessionInvoker(
        ExecuteSessionRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeSession, hcClient);
    }

    /**
     * 修改图片名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUpdateImageNameRequest 请求对象
     * @return ExecuteUpdateImageNameResponse
     */
    public ExecuteUpdateImageNameResponse executeUpdateImageName(ExecuteUpdateImageNameRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeUpdateImageName);
    }

    /**
     * 修改图片名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUpdateImageNameRequest 请求对象
     * @return SyncInvoker<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse>
     */
    public SyncInvoker<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse> executeUpdateImageNameInvoker(
        ExecuteUpdateImageNameRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeUpdateImageName, hcClient);
    }

    /**
     * 更新视频名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUpdateVideoByIdRequest 请求对象
     * @return ExecuteUpdateVideoByIdResponse
     */
    public ExecuteUpdateVideoByIdResponse executeUpdateVideoById(ExecuteUpdateVideoByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeUpdateVideoById);
    }

    /**
     * 更新视频名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUpdateVideoByIdRequest 请求对象
     * @return SyncInvoker<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse>
     */
    public SyncInvoker<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse> executeUpdateVideoByIdInvoker(
        ExecuteUpdateVideoByIdRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeUpdateVideoById, hcClient);
    }

    /**
     * 配置视频
     *
     * 通过该接口配置视频
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUpdateVideoInfoByIdRequest 请求对象
     * @return ExecuteUpdateVideoInfoByIdResponse
     */
    public ExecuteUpdateVideoInfoByIdResponse executeUpdateVideoInfoById(ExecuteUpdateVideoInfoByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeUpdateVideoInfoById);
    }

    /**
     * 配置视频
     *
     * 通过该接口配置视频
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUpdateVideoInfoByIdRequest 请求对象
     * @return SyncInvoker<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse>
     */
    public SyncInvoker<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse> executeUpdateVideoInfoByIdInvoker(
        ExecuteUpdateVideoInfoByIdRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeUpdateVideoInfoById, hcClient);
    }

    /**
     * 上传播报插图
     *
     * 上传图片并生成图片链接，图片需小于10m；
     * 同一个视频同时最多支持50张插图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUploadImageRequest 请求对象
     * @return ExecuteUploadImageResponse
     */
    public ExecuteUploadImageResponse executeUploadImage(ExecuteUploadImageRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeUploadImage);
    }

    /**
     * 上传播报插图
     *
     * 上传图片并生成图片链接，图片需小于10m；
     * 同一个视频同时最多支持50张插图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUploadImageRequest 请求对象
     * @return SyncInvoker<ExecuteUploadImageRequest, ExecuteUploadImageResponse>
     */
    public SyncInvoker<ExecuteUploadImageRequest, ExecuteUploadImageResponse> executeUploadImageInvoker(
        ExecuteUploadImageRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeUploadImage, hcClient);
    }

    /**
     * 通过pdf上传多张插图
     *
     * 当前仅支持上传PDF，如有PPT请将PPT转化为PDF再进行上传，文件需小于10m；
     * 该接口会将pdf每一页转换图片，并生成链接；
     * 同一个视频同时最多支持50张插图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUploadPptRequest 请求对象
     * @return ExecuteUploadPptResponse
     */
    public ExecuteUploadPptResponse executeUploadPpt(ExecuteUploadPptRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeUploadPpt);
    }

    /**
     * 通过pdf上传多张插图
     *
     * 当前仅支持上传PDF，如有PPT请将PPT转化为PDF再进行上传，文件需小于10m；
     * 该接口会将pdf每一页转换图片，并生成链接；
     * 同一个视频同时最多支持50张插图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUploadPptRequest 请求对象
     * @return SyncInvoker<ExecuteUploadPptRequest, ExecuteUploadPptResponse>
     */
    public SyncInvoker<ExecuteUploadPptRequest, ExecuteUploadPptResponse> executeUploadPptInvoker(
        ExecuteUploadPptRequest request) {
        return new SyncInvoker<>(request, CbsMeta.executeUploadPpt, hcClient);
    }

    /**
     * 获取问题提示
     *
     * 获取用户输入问题的提示问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSuggestionsRequest 请求对象
     * @return ListSuggestionsResponse
     */
    public ListSuggestionsResponse listSuggestions(ListSuggestionsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.listSuggestions);
    }

    /**
     * 获取问题提示
     *
     * 获取用户输入问题的提示问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSuggestionsRequest 请求对象
     * @return SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>
     */
    public SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestionsInvoker(
        ListSuggestionsRequest request) {
        return new SyncInvoker<>(request, CbsMeta.listSuggestions, hcClient);
    }

    /**
     * 标记为转人工
     *
     * 智能问答返回的结果后，用户是否转人工。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagLaborRequest 请求对象
     * @return TagLaborResponse
     */
    public TagLaborResponse tagLabor(TagLaborRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.tagLabor);
    }

    /**
     * 标记为转人工
     *
     * 智能问答返回的结果后，用户是否转人工。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagLaborRequest 请求对象
     * @return SyncInvoker<TagLaborRequest, TagLaborResponse>
     */
    public SyncInvoker<TagLaborRequest, TagLaborResponse> tagLaborInvoker(TagLaborRequest request) {
        return new SyncInvoker<>(request, CbsMeta.tagLabor, hcClient);
    }

    /**
     * 问答满意评价
     *
     * 用户提出问题后，对智能问答返回的结果是否满意。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagSatisfactionRequest 请求对象
     * @return TagSatisfactionResponse
     */
    public TagSatisfactionResponse tagSatisfaction(TagSatisfactionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.tagSatisfaction);
    }

    /**
     * 问答满意评价
     *
     * 用户提出问题后，对智能问答返回的结果是否满意。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagSatisfactionRequest 请求对象
     * @return SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>
     */
    public SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfactionInvoker(
        TagSatisfactionRequest request) {
        return new SyncInvoker<>(request, CbsMeta.tagSatisfaction, hcClient);
    }

    /**
     * PostRequests
     *
     * 问答服务的输入为用户提问，输出是与输入最匹配的Top N(默认为top5)个知识点，知识点按得分从高到低排序。
     * 
     * 说明： 
     * 返回知识点如果含有答案字段（answer），则表示返回匹配成功结果，如果没有答案字段，则表示推荐结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PostRequestsRequest 请求对象
     * @return PostRequestsResponse
     */
    @Deprecated
    public PostRequestsResponse postRequests(PostRequestsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.postRequests);
    }

    /**
     * PostRequests
     *
     * 问答服务的输入为用户提问，输出是与输入最匹配的Top N(默认为top5)个知识点，知识点按得分从高到低排序。
     * 
     * 说明： 
     * 返回知识点如果含有答案字段（answer），则表示返回匹配成功结果，如果没有答案字段，则表示推荐结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PostRequestsRequest 请求对象
     * @return SyncInvoker<PostRequestsRequest, PostRequestsResponse>
     */
    @Deprecated
    public SyncInvoker<PostRequestsRequest, PostRequestsResponse> postRequestsInvoker(PostRequestsRequest request) {
        return new SyncInvoker<>(request, CbsMeta.postRequests, hcClient);
    }

}
