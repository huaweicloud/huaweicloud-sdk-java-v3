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
     * 获取完全匹配的热点标准问题列表。 默认按照完全匹配标准问题被问及的频次降序排序。
     *
     * @param CollectHotQuestionsRequest 请求对象
     * @return CompletableFuture<CollectHotQuestionsResponse>
     */
    public CompletableFuture<CollectHotQuestionsResponse> collectHotQuestionsAsync(CollectHotQuestionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectHotQuestions);
    }

    /**
     * 热点问题统计
     * 获取完全匹配的热点标准问题列表。 默认按照完全匹配标准问题被问及的频次降序排序。
     *
     * @param CollectHotQuestionsRequest 请求对象
     * @return AsyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>
     */
    public AsyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse> collectHotQuestionsAsyncInvoker(CollectHotQuestionsRequest request) {
        return new AsyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>(request, CbsMeta.collectHotQuestions, hcClient);
    }

    /**
     * 关键词统计
     * 用户问关键词统计。
     *
     * @param CollectKeyWordsRequest 请求对象
     * @return CompletableFuture<CollectKeyWordsResponse>
     */
    public CompletableFuture<CollectKeyWordsResponse> collectKeyWordsAsync(CollectKeyWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectKeyWords);
    }

    /**
     * 关键词统计
     * 用户问关键词统计。
     *
     * @param CollectKeyWordsRequest 请求对象
     * @return AsyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>
     */
    public AsyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWordsAsyncInvoker(CollectKeyWordsRequest request) {
        return new AsyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>(request, CbsMeta.collectKeyWords, hcClient);
    }

    /**
     * 问答统计
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。 如果领域未指定则表示获取所有领域的问题答复率。
     *
     * @param CollectReplyRatesRequest 请求对象
     * @return CompletableFuture<CollectReplyRatesResponse>
     */
    public CompletableFuture<CollectReplyRatesResponse> collectReplyRatesAsync(CollectReplyRatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectReplyRates);
    }

    /**
     * 问答统计
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。 如果领域未指定则表示获取所有领域的问题答复率。
     *
     * @param CollectReplyRatesRequest 请求对象
     * @return AsyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>
     */
    public AsyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRatesAsyncInvoker(CollectReplyRatesRequest request) {
        return new AsyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>(request, CbsMeta.collectReplyRates, hcClient);
    }

    /**
     * 访问统计
     * 获取用户会话统计信息。
     *
     * @param CollectSessionStatsRequest 请求对象
     * @return CompletableFuture<CollectSessionStatsResponse>
     */
    public CompletableFuture<CollectSessionStatsResponse> collectSessionStatsAsync(CollectSessionStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.collectSessionStats);
    }

    /**
     * 访问统计
     * 获取用户会话统计信息。
     *
     * @param CollectSessionStatsRequest 请求对象
     * @return AsyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>
     */
    public AsyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStatsAsyncInvoker(CollectSessionStatsRequest request) {
        return new AsyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>(request, CbsMeta.collectSessionStats, hcClient);
    }

    /**
     * 开启会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     *
     * @param CreateSessionRequest 请求对象
     * @return CompletableFuture<CreateSessionResponse>
     */
    public CompletableFuture<CreateSessionResponse> createSessionAsync(CreateSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.createSession);
    }

    /**
     * 开启会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     *
     * @param CreateSessionRequest 请求对象
     * @return AsyncInvoker<CreateSessionRequest, CreateSessionResponse>
     */
    public AsyncInvoker<CreateSessionRequest, CreateSessionResponse> createSessionAsyncInvoker(CreateSessionRequest request) {
        return new AsyncInvoker<CreateSessionRequest, CreateSessionResponse>(request, CbsMeta.createSession, hcClient);
    }

    /**
     * 关闭会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param DeleteSessionRequest 请求对象
     * @return CompletableFuture<DeleteSessionResponse>
     */
    public CompletableFuture<DeleteSessionResponse> deleteSessionAsync(DeleteSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.deleteSession);
    }

    /**
     * 关闭会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param DeleteSessionRequest 请求对象
     * @return AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionAsyncInvoker(DeleteSessionRequest request) {
        return new AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse>(request, CbsMeta.deleteSession, hcClient);
    }

    /**
     * 问答机器人会话
     * 用户调用该接口和机器人进行聊天。
     *
     * @param ExecuteQaChatRequest 请求对象
     * @return CompletableFuture<ExecuteQaChatResponse>
     */
    public CompletableFuture<ExecuteQaChatResponse> executeQaChatAsync(ExecuteQaChatRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeQaChat);
    }

    /**
     * 问答机器人会话
     * 用户调用该接口和机器人进行聊天。
     *
     * @param ExecuteQaChatRequest 请求对象
     * @return AsyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>
     */
    public AsyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChatAsyncInvoker(ExecuteQaChatRequest request) {
        return new AsyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>(request, CbsMeta.executeQaChat, hcClient);
    }

    /**
     * 处理会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param ExecuteSessionRequest 请求对象
     * @return CompletableFuture<ExecuteSessionResponse>
     */
    public CompletableFuture<ExecuteSessionResponse> executeSessionAsync(ExecuteSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.executeSession);
    }

    /**
     * 处理会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param ExecuteSessionRequest 请求对象
     * @return AsyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>
     */
    public AsyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse> executeSessionAsyncInvoker(ExecuteSessionRequest request) {
        return new AsyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>(request, CbsMeta.executeSession, hcClient);
    }

    /**
     * 获取问题提示
     * 获取用户输入问题的提示问题列表。
     *
     * @param ListSuggestionsRequest 请求对象
     * @return CompletableFuture<ListSuggestionsResponse>
     */
    public CompletableFuture<ListSuggestionsResponse> listSuggestionsAsync(ListSuggestionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.listSuggestions);
    }

    /**
     * 获取问题提示
     * 获取用户输入问题的提示问题列表。
     *
     * @param ListSuggestionsRequest 请求对象
     * @return AsyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>
     */
    public AsyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestionsAsyncInvoker(ListSuggestionsRequest request) {
        return new AsyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>(request, CbsMeta.listSuggestions, hcClient);
    }

    /**
     * 标记为转人工
     * 智能问答返回的结果后，用户是否转人工。
     *
     * @param TagLaborRequest 请求对象
     * @return CompletableFuture<TagLaborResponse>
     */
    public CompletableFuture<TagLaborResponse> tagLaborAsync(TagLaborRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.tagLabor);
    }

    /**
     * 标记为转人工
     * 智能问答返回的结果后，用户是否转人工。
     *
     * @param TagLaborRequest 请求对象
     * @return AsyncInvoker<TagLaborRequest, TagLaborResponse>
     */
    public AsyncInvoker<TagLaborRequest, TagLaborResponse> tagLaborAsyncInvoker(TagLaborRequest request) {
        return new AsyncInvoker<TagLaborRequest, TagLaborResponse>(request, CbsMeta.tagLabor, hcClient);
    }

    /**
     * 问答满意评价
     * 用户提出问题后，对智能问答返回的结果是否满意。
     *
     * @param TagSatisfactionRequest 请求对象
     * @return CompletableFuture<TagSatisfactionResponse>
     */
    public CompletableFuture<TagSatisfactionResponse> tagSatisfactionAsync(TagSatisfactionRequest request) {
        return hcClient.asyncInvokeHttp(request, CbsMeta.tagSatisfaction);
    }

    /**
     * 问答满意评价
     * 用户提出问题后，对智能问答返回的结果是否满意。
     *
     * @param TagSatisfactionRequest 请求对象
     * @return AsyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>
     */
    public AsyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfactionAsyncInvoker(TagSatisfactionRequest request) {
        return new AsyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>(request, CbsMeta.tagSatisfaction, hcClient);
    }

}