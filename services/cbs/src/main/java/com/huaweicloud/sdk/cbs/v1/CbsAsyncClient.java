package com.huaweicloud.sdk.cbs.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cbs.v1.model.*;

public class CbsAsyncClient {
    protected HcClient hcClient;

    public CbsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbsAsyncClient> newBuilder() {
        return new ClientBuilder<>(CbsAsyncClient::new, "BasicCredentials");
    }


    /**
     * 热点问题统计
     *
     * 获取完全匹配的热点标准问题列表。
     * 默认按照完全匹配标准问题被问及的频次降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectHotQuestionsRequest 请求对象
     * @return CompletableFuture<CollectHotQuestionsResponse>
     */
    public CompletableFuture<CollectHotQuestionsResponse> collectHotQuestionsAsync(CollectHotQuestionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectHotQuestions);
    }

    /**
     * 热点问题统计
     *
     * 获取完全匹配的热点标准问题列表。
     * 默认按照完全匹配标准问题被问及的频次降序排序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectHotQuestionsRequest 请求对象
     * @return AsyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>
     */
    public AsyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse> collectHotQuestionsAsyncInvoker(CollectHotQuestionsRequest request) {
        return new AsyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>(request, CbsMeta.collectHotQuestions, hcClient);
    }

    /**
     * 关键词统计
     *
     * 用户问关键词统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectKeyWordsRequest 请求对象
     * @return CompletableFuture<CollectKeyWordsResponse>
     */
    public CompletableFuture<CollectKeyWordsResponse> collectKeyWordsAsync(CollectKeyWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectKeyWords);
    }

    /**
     * 关键词统计
     *
     * 用户问关键词统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectKeyWordsRequest 请求对象
     * @return AsyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>
     */
    public AsyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWordsAsyncInvoker(CollectKeyWordsRequest request) {
        return new AsyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>(request, CbsMeta.collectKeyWords, hcClient);
    }

    /**
     * 问答统计
     *
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。
     * 如果领域未指定则表示获取所有领域的问题答复率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectReplyRatesRequest 请求对象
     * @return CompletableFuture<CollectReplyRatesResponse>
     */
    public CompletableFuture<CollectReplyRatesResponse> collectReplyRatesAsync(CollectReplyRatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectReplyRates);
    }

    /**
     * 问答统计
     *
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。
     * 如果领域未指定则表示获取所有领域的问题答复率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectReplyRatesRequest 请求对象
     * @return AsyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>
     */
    public AsyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRatesAsyncInvoker(CollectReplyRatesRequest request) {
        return new AsyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>(request, CbsMeta.collectReplyRates, hcClient);
    }

    /**
     * 访问统计
     *
     * 获取用户会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectSessionStatsRequest 请求对象
     * @return CompletableFuture<CollectSessionStatsResponse>
     */
    public CompletableFuture<CollectSessionStatsResponse> collectSessionStatsAsync(CollectSessionStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectSessionStats);
    }

    /**
     * 访问统计
     *
     * 获取用户会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectSessionStatsRequest 请求对象
     * @return AsyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>
     */
    public AsyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStatsAsyncInvoker(CollectSessionStatsRequest request) {
        return new AsyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>(request, CbsMeta.collectSessionStats, hcClient);
    }

    /**
     * 开启会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSessionRequest 请求对象
     * @return CompletableFuture<CreateSessionResponse>
     */
    public CompletableFuture<CreateSessionResponse> createSessionAsync(CreateSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.createSession);
    }

    /**
     * 开启会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSessionRequest 请求对象
     * @return AsyncInvoker<CreateSessionRequest, CreateSessionResponse>
     */
    public AsyncInvoker<CreateSessionRequest, CreateSessionResponse> createSessionAsyncInvoker(CreateSessionRequest request) {
        return new AsyncInvoker<CreateSessionRequest, CreateSessionResponse>(request, CbsMeta.createSession, hcClient);
    }

    /**
     * 关闭会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSessionRequest 请求对象
     * @return CompletableFuture<DeleteSessionResponse>
     */
    public CompletableFuture<DeleteSessionResponse> deleteSessionAsync(DeleteSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.deleteSession);
    }

    /**
     * 关闭会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSessionRequest 请求对象
     * @return AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionAsyncInvoker(DeleteSessionRequest request) {
        return new AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse>(request, CbsMeta.deleteSession, hcClient);
    }

    /**
     * 合成视频(按包周期收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteComposeVideoRequest 请求对象
     * @return CompletableFuture<ExecuteComposeVideoResponse>
     */
    public CompletableFuture<ExecuteComposeVideoResponse> executeComposeVideoAsync(ExecuteComposeVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeComposeVideo);
    }

    /**
     * 合成视频(按包周期收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteComposeVideoRequest 请求对象
     * @return AsyncInvoker<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse>
     */
    public AsyncInvoker<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse> executeComposeVideoAsyncInvoker(ExecuteComposeVideoRequest request) {
        return new AsyncInvoker<ExecuteComposeVideoRequest, ExecuteComposeVideoResponse>(request, CbsMeta.executeComposeVideo, hcClient);
    }

    /**
     * 合成视频(按需收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteComposeVideoOndemandRequest 请求对象
     * @return CompletableFuture<ExecuteComposeVideoOndemandResponse>
     */
    public CompletableFuture<ExecuteComposeVideoOndemandResponse> executeComposeVideoOndemandAsync(ExecuteComposeVideoOndemandRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeComposeVideoOndemand);
    }

    /**
     * 合成视频(按需收费)
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteComposeVideoOndemandRequest 请求对象
     * @return AsyncInvoker<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse>
     */
    public AsyncInvoker<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse> executeComposeVideoOndemandAsyncInvoker(ExecuteComposeVideoOndemandRequest request) {
        return new AsyncInvoker<ExecuteComposeVideoOndemandRequest, ExecuteComposeVideoOndemandResponse>(request, CbsMeta.executeComposeVideoOndemand, hcClient);
    }

    /**
     * 创建视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteCreateVideoRequest 请求对象
     * @return CompletableFuture<ExecuteCreateVideoResponse>
     */
    public CompletableFuture<ExecuteCreateVideoResponse> executeCreateVideoAsync(ExecuteCreateVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeCreateVideo);
    }

    /**
     * 创建视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteCreateVideoRequest 请求对象
     * @return AsyncInvoker<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse>
     */
    public AsyncInvoker<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse> executeCreateVideoAsyncInvoker(ExecuteCreateVideoRequest request) {
        return new AsyncInvoker<ExecuteCreateVideoRequest, ExecuteCreateVideoResponse>(request, CbsMeta.executeCreateVideo, hcClient);
    }

    /**
     * 删除视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeleteVideoByIdRequest 请求对象
     * @return CompletableFuture<ExecuteDeleteVideoByIdResponse>
     */
    public CompletableFuture<ExecuteDeleteVideoByIdResponse> executeDeleteVideoByIdAsync(ExecuteDeleteVideoByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeDeleteVideoById);
    }

    /**
     * 删除视频
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeleteVideoByIdRequest 请求对象
     * @return AsyncInvoker<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse>
     */
    public AsyncInvoker<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse> executeDeleteVideoByIdAsyncInvoker(ExecuteDeleteVideoByIdRequest request) {
        return new AsyncInvoker<ExecuteDeleteVideoByIdRequest, ExecuteDeleteVideoByIdResponse>(request, CbsMeta.executeDeleteVideoById, hcClient);
    }

    /**
     * 删除图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeleteimageByIdRequest 请求对象
     * @return CompletableFuture<ExecuteDeleteimageByIdResponse>
     */
    public CompletableFuture<ExecuteDeleteimageByIdResponse> executeDeleteimageByIdAsync(ExecuteDeleteimageByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeDeleteimageById);
    }

    /**
     * 删除图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteDeleteimageByIdRequest 请求对象
     * @return AsyncInvoker<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse>
     */
    public AsyncInvoker<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse> executeDeleteimageByIdAsyncInvoker(ExecuteDeleteimageByIdRequest request) {
        return new AsyncInvoker<ExecuteDeleteimageByIdRequest, ExecuteDeleteimageByIdResponse>(request, CbsMeta.executeDeleteimageById, hcClient);
    }

    /**
     * 获取形象详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetCharacterInfoByIdRequest 请求对象
     * @return CompletableFuture<ExecuteGetCharacterInfoByIdResponse>
     */
    public CompletableFuture<ExecuteGetCharacterInfoByIdResponse> executeGetCharacterInfoByIdAsync(ExecuteGetCharacterInfoByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeGetCharacterInfoById);
    }

    /**
     * 获取形象详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetCharacterInfoByIdRequest 请求对象
     * @return AsyncInvoker<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse>
     */
    public AsyncInvoker<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse> executeGetCharacterInfoByIdAsyncInvoker(ExecuteGetCharacterInfoByIdRequest request) {
        return new AsyncInvoker<ExecuteGetCharacterInfoByIdRequest, ExecuteGetCharacterInfoByIdResponse>(request, CbsMeta.executeGetCharacterInfoById, hcClient);
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
     * @param ExecuteGetCharactersRequest 请求对象
     * @return CompletableFuture<ExecuteGetCharactersResponse>
     */
    public CompletableFuture<ExecuteGetCharactersResponse> executeGetCharactersAsync(ExecuteGetCharactersRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeGetCharacters);
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
     * @param ExecuteGetCharactersRequest 请求对象
     * @return AsyncInvoker<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse>
     */
    public AsyncInvoker<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse> executeGetCharactersAsyncInvoker(ExecuteGetCharactersRequest request) {
        return new AsyncInvoker<ExecuteGetCharactersRequest, ExecuteGetCharactersResponse>(request, CbsMeta.executeGetCharacters, hcClient);
    }

    /**
     * 获取播报框
     *
     * 获取指定图片可用的播报框列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetFramsListByImagesIdRequest 请求对象
     * @return CompletableFuture<ExecuteGetFramsListByImagesIdResponse>
     */
    public CompletableFuture<ExecuteGetFramsListByImagesIdResponse> executeGetFramsListByImagesIdAsync(ExecuteGetFramsListByImagesIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeGetFramsListByImagesId);
    }

    /**
     * 获取播报框
     *
     * 获取指定图片可用的播报框列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetFramsListByImagesIdRequest 请求对象
     * @return AsyncInvoker<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse>
     */
    public AsyncInvoker<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse> executeGetFramsListByImagesIdAsyncInvoker(ExecuteGetFramsListByImagesIdRequest request) {
        return new AsyncInvoker<ExecuteGetFramsListByImagesIdRequest, ExecuteGetFramsListByImagesIdResponse>(request, CbsMeta.executeGetFramsListByImagesId, hcClient);
    }

    /**
     * 获取图片列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetImagesListRequest 请求对象
     * @return CompletableFuture<ExecuteGetImagesListResponse>
     */
    public CompletableFuture<ExecuteGetImagesListResponse> executeGetImagesListAsync(ExecuteGetImagesListRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeGetImagesList);
    }

    /**
     * 获取图片列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetImagesListRequest 请求对象
     * @return AsyncInvoker<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse>
     */
    public AsyncInvoker<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse> executeGetImagesListAsyncInvoker(ExecuteGetImagesListRequest request) {
        return new AsyncInvoker<ExecuteGetImagesListRequest, ExecuteGetImagesListResponse>(request, CbsMeta.executeGetImagesList, hcClient);
    }

    /**
     * 获取视频详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetVideoInfoByIdRequest 请求对象
     * @return CompletableFuture<ExecuteGetVideoInfoByIdResponse>
     */
    public CompletableFuture<ExecuteGetVideoInfoByIdResponse> executeGetVideoInfoByIdAsync(ExecuteGetVideoInfoByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeGetVideoInfoById);
    }

    /**
     * 获取视频详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetVideoInfoByIdRequest 请求对象
     * @return AsyncInvoker<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse>
     */
    public AsyncInvoker<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse> executeGetVideoInfoByIdAsyncInvoker(ExecuteGetVideoInfoByIdRequest request) {
        return new AsyncInvoker<ExecuteGetVideoInfoByIdRequest, ExecuteGetVideoInfoByIdResponse>(request, CbsMeta.executeGetVideoInfoById, hcClient);
    }

    /**
     * 获取视频列表
     *
     * 该接口用于获取视频列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetVideosListRequest 请求对象
     * @return CompletableFuture<ExecuteGetVideosListResponse>
     */
    public CompletableFuture<ExecuteGetVideosListResponse> executeGetVideosListAsync(ExecuteGetVideosListRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeGetVideosList);
    }

    /**
     * 获取视频列表
     *
     * 该接口用于获取视频列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteGetVideosListRequest 请求对象
     * @return AsyncInvoker<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse>
     */
    public AsyncInvoker<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse> executeGetVideosListAsyncInvoker(ExecuteGetVideosListRequest request) {
        return new AsyncInvoker<ExecuteGetVideosListRequest, ExecuteGetVideosListResponse>(request, CbsMeta.executeGetVideosList, hcClient);
    }

    /**
     * 创建图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecutePostCreateImagesRequest 请求对象
     * @return CompletableFuture<ExecutePostCreateImagesResponse>
     */
    public CompletableFuture<ExecutePostCreateImagesResponse> executePostCreateImagesAsync(ExecutePostCreateImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executePostCreateImages);
    }

    /**
     * 创建图片
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecutePostCreateImagesRequest 请求对象
     * @return AsyncInvoker<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse>
     */
    public AsyncInvoker<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse> executePostCreateImagesAsyncInvoker(ExecutePostCreateImagesRequest request) {
        return new AsyncInvoker<ExecutePostCreateImagesRequest, ExecutePostCreateImagesResponse>(request, CbsMeta.executePostCreateImages, hcClient);
    }

    /**
     * 问答机器人会话
     *
     * 用户调用该接口和机器人进行聊天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteQaChatRequest 请求对象
     * @return CompletableFuture<ExecuteQaChatResponse>
     */
    public CompletableFuture<ExecuteQaChatResponse> executeQaChatAsync(ExecuteQaChatRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeQaChat);
    }

    /**
     * 问答机器人会话
     *
     * 用户调用该接口和机器人进行聊天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteQaChatRequest 请求对象
     * @return AsyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>
     */
    public AsyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChatAsyncInvoker(ExecuteQaChatRequest request) {
        return new AsyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>(request, CbsMeta.executeQaChat, hcClient);
    }

    /**
     * 处理会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteSessionRequest 请求对象
     * @return CompletableFuture<ExecuteSessionResponse>
     */
    public CompletableFuture<ExecuteSessionResponse> executeSessionAsync(ExecuteSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeSession);
    }

    /**
     * 处理会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteSessionRequest 请求对象
     * @return AsyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>
     */
    public AsyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse> executeSessionAsyncInvoker(ExecuteSessionRequest request) {
        return new AsyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>(request, CbsMeta.executeSession, hcClient);
    }

    /**
     * 修改图片名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUpdateImageNameRequest 请求对象
     * @return CompletableFuture<ExecuteUpdateImageNameResponse>
     */
    public CompletableFuture<ExecuteUpdateImageNameResponse> executeUpdateImageNameAsync(ExecuteUpdateImageNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeUpdateImageName);
    }

    /**
     * 修改图片名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUpdateImageNameRequest 请求对象
     * @return AsyncInvoker<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse>
     */
    public AsyncInvoker<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse> executeUpdateImageNameAsyncInvoker(ExecuteUpdateImageNameRequest request) {
        return new AsyncInvoker<ExecuteUpdateImageNameRequest, ExecuteUpdateImageNameResponse>(request, CbsMeta.executeUpdateImageName, hcClient);
    }

    /**
     * 更新视频名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUpdateVideoByIdRequest 请求对象
     * @return CompletableFuture<ExecuteUpdateVideoByIdResponse>
     */
    public CompletableFuture<ExecuteUpdateVideoByIdResponse> executeUpdateVideoByIdAsync(ExecuteUpdateVideoByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeUpdateVideoById);
    }

    /**
     * 更新视频名
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUpdateVideoByIdRequest 请求对象
     * @return AsyncInvoker<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse>
     */
    public AsyncInvoker<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse> executeUpdateVideoByIdAsyncInvoker(ExecuteUpdateVideoByIdRequest request) {
        return new AsyncInvoker<ExecuteUpdateVideoByIdRequest, ExecuteUpdateVideoByIdResponse>(request, CbsMeta.executeUpdateVideoById, hcClient);
    }

    /**
     * 配置视频
     *
     * 通过该接口配置视频
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUpdateVideoInfoByIdRequest 请求对象
     * @return CompletableFuture<ExecuteUpdateVideoInfoByIdResponse>
     */
    public CompletableFuture<ExecuteUpdateVideoInfoByIdResponse> executeUpdateVideoInfoByIdAsync(ExecuteUpdateVideoInfoByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeUpdateVideoInfoById);
    }

    /**
     * 配置视频
     *
     * 通过该接口配置视频
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUpdateVideoInfoByIdRequest 请求对象
     * @return AsyncInvoker<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse>
     */
    public AsyncInvoker<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse> executeUpdateVideoInfoByIdAsyncInvoker(ExecuteUpdateVideoInfoByIdRequest request) {
        return new AsyncInvoker<ExecuteUpdateVideoInfoByIdRequest, ExecuteUpdateVideoInfoByIdResponse>(request, CbsMeta.executeUpdateVideoInfoById, hcClient);
    }

    /**
     * 上传播报插图
     *
     * 上传图片并生成图片链接，图片需小于10m；
     * 同一个视频同时最多支持50张插图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUploadImageRequest 请求对象
     * @return CompletableFuture<ExecuteUploadImageResponse>
     */
    public CompletableFuture<ExecuteUploadImageResponse> executeUploadImageAsync(ExecuteUploadImageRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeUploadImage);
    }

    /**
     * 上传播报插图
     *
     * 上传图片并生成图片链接，图片需小于10m；
     * 同一个视频同时最多支持50张插图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteUploadImageRequest 请求对象
     * @return AsyncInvoker<ExecuteUploadImageRequest, ExecuteUploadImageResponse>
     */
    public AsyncInvoker<ExecuteUploadImageRequest, ExecuteUploadImageResponse> executeUploadImageAsyncInvoker(ExecuteUploadImageRequest request) {
        return new AsyncInvoker<ExecuteUploadImageRequest, ExecuteUploadImageResponse>(request, CbsMeta.executeUploadImage, hcClient);
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
     * @param ExecuteUploadPptRequest 请求对象
     * @return CompletableFuture<ExecuteUploadPptResponse>
     */
    public CompletableFuture<ExecuteUploadPptResponse> executeUploadPptAsync(ExecuteUploadPptRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeUploadPpt);
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
     * @param ExecuteUploadPptRequest 请求对象
     * @return AsyncInvoker<ExecuteUploadPptRequest, ExecuteUploadPptResponse>
     */
    public AsyncInvoker<ExecuteUploadPptRequest, ExecuteUploadPptResponse> executeUploadPptAsyncInvoker(ExecuteUploadPptRequest request) {
        return new AsyncInvoker<ExecuteUploadPptRequest, ExecuteUploadPptResponse>(request, CbsMeta.executeUploadPpt, hcClient);
    }

    /**
     * 获取问题提示
     *
     * 获取用户输入问题的提示问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSuggestionsRequest 请求对象
     * @return CompletableFuture<ListSuggestionsResponse>
     */
    public CompletableFuture<ListSuggestionsResponse> listSuggestionsAsync(ListSuggestionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.listSuggestions);
    }

    /**
     * 获取问题提示
     *
     * 获取用户输入问题的提示问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSuggestionsRequest 请求对象
     * @return AsyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>
     */
    public AsyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestionsAsyncInvoker(ListSuggestionsRequest request) {
        return new AsyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>(request, CbsMeta.listSuggestions, hcClient);
    }

    /**
     * 标记为转人工
     *
     * 智能问答返回的结果后，用户是否转人工。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagLaborRequest 请求对象
     * @return CompletableFuture<TagLaborResponse>
     */
    public CompletableFuture<TagLaborResponse> tagLaborAsync(TagLaborRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.tagLabor);
    }

    /**
     * 标记为转人工
     *
     * 智能问答返回的结果后，用户是否转人工。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagLaborRequest 请求对象
     * @return AsyncInvoker<TagLaborRequest, TagLaborResponse>
     */
    public AsyncInvoker<TagLaborRequest, TagLaborResponse> tagLaborAsyncInvoker(TagLaborRequest request) {
        return new AsyncInvoker<TagLaborRequest, TagLaborResponse>(request, CbsMeta.tagLabor, hcClient);
    }

    /**
     * 问答满意评价
     *
     * 用户提出问题后，对智能问答返回的结果是否满意。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagSatisfactionRequest 请求对象
     * @return CompletableFuture<TagSatisfactionResponse>
     */
    public CompletableFuture<TagSatisfactionResponse> tagSatisfactionAsync(TagSatisfactionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.tagSatisfaction);
    }

    /**
     * 问答满意评价
     *
     * 用户提出问题后，对智能问答返回的结果是否满意。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagSatisfactionRequest 请求对象
     * @return AsyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>
     */
    public AsyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfactionAsyncInvoker(TagSatisfactionRequest request) {
        return new AsyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>(request, CbsMeta.tagSatisfaction, hcClient);
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
     * @param PostRequestsRequest 请求对象
     * @return CompletableFuture<PostRequestsResponse>
     */
    public CompletableFuture<PostRequestsResponse> postRequestsAsync(PostRequestsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.postRequests);
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
     * @param PostRequestsRequest 请求对象
     * @return AsyncInvoker<PostRequestsRequest, PostRequestsResponse>
     */
    public AsyncInvoker<PostRequestsRequest, PostRequestsResponse> postRequestsAsyncInvoker(PostRequestsRequest request) {
        return new AsyncInvoker<PostRequestsRequest, PostRequestsResponse>(request, CbsMeta.postRequests, hcClient);
    }

}