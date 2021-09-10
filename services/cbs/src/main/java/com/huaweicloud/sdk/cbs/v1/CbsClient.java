package com.huaweicloud.sdk.cbs.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cbs.v1.model.*;

public class CbsClient {
    protected HcClient hcClient;

    public CbsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbsClient> newBuilder() {
        return new ClientBuilder<>(CbsClient::new, "BasicCredentials");
    }


    /**
     * 热点问题统计
     * 获取完全匹配的热点标准问题列表。 默认按照完全匹配标准问题被问及的频次降序排序。
     *
     * @param CollectHotQuestionsRequest 请求对象
     * @return CollectHotQuestionsResponse
     */
    public CollectHotQuestionsResponse collectHotQuestions(CollectHotQuestionsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectHotQuestions);
    }

    /**
     * 热点问题统计
     * 获取完全匹配的热点标准问题列表。 默认按照完全匹配标准问题被问及的频次降序排序。
     *
     * @param CollectHotQuestionsRequest 请求对象
     * @return SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>
     */
    public SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse> collectHotQuestionsInvoker(CollectHotQuestionsRequest request) {
        return new SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>(request, CbsMeta.collectHotQuestions, hcClient);
    }

    /**
     * 关键词统计
     * 用户问关键词统计。
     *
     * @param CollectKeyWordsRequest 请求对象
     * @return CollectKeyWordsResponse
     */
    public CollectKeyWordsResponse collectKeyWords(CollectKeyWordsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectKeyWords);
    }

    /**
     * 关键词统计
     * 用户问关键词统计。
     *
     * @param CollectKeyWordsRequest 请求对象
     * @return SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>
     */
    public SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWordsInvoker(CollectKeyWordsRequest request) {
        return new SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>(request, CbsMeta.collectKeyWords, hcClient);
    }

    /**
     * 问答统计
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。 如果领域未指定则表示获取所有领域的问题答复率。
     *
     * @param CollectReplyRatesRequest 请求对象
     * @return CollectReplyRatesResponse
     */
    public CollectReplyRatesResponse collectReplyRates(CollectReplyRatesRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectReplyRates);
    }

    /**
     * 问答统计
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。 如果领域未指定则表示获取所有领域的问题答复率。
     *
     * @param CollectReplyRatesRequest 请求对象
     * @return SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>
     */
    public SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRatesInvoker(CollectReplyRatesRequest request) {
        return new SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>(request, CbsMeta.collectReplyRates, hcClient);
    }

    /**
     * 访问统计
     * 获取用户会话统计信息。
     *
     * @param CollectSessionStatsRequest 请求对象
     * @return CollectSessionStatsResponse
     */
    public CollectSessionStatsResponse collectSessionStats(CollectSessionStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.collectSessionStats);
    }

    /**
     * 访问统计
     * 获取用户会话统计信息。
     *
     * @param CollectSessionStatsRequest 请求对象
     * @return SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>
     */
    public SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStatsInvoker(CollectSessionStatsRequest request) {
        return new SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>(request, CbsMeta.collectSessionStats, hcClient);
    }

    /**
     * 开启会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     *
     * @param CreateSessionRequest 请求对象
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSession(CreateSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.createSession);
    }

    /**
     * 开启会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     *
     * @param CreateSessionRequest 请求对象
     * @return SyncInvoker<CreateSessionRequest, CreateSessionResponse>
     */
    public SyncInvoker<CreateSessionRequest, CreateSessionResponse> createSessionInvoker(CreateSessionRequest request) {
        return new SyncInvoker<CreateSessionRequest, CreateSessionResponse>(request, CbsMeta.createSession, hcClient);
    }

    /**
     * 发起会话
     * 发起话务机器人会话。
     *
     * @param CreateTbSessionRequest 请求对象
     * @return CreateTbSessionResponse
     */
    public CreateTbSessionResponse createTbSession(CreateTbSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.createTbSession);
    }

    /**
     * 发起会话
     * 发起话务机器人会话。
     *
     * @param CreateTbSessionRequest 请求对象
     * @return SyncInvoker<CreateTbSessionRequest, CreateTbSessionResponse>
     */
    public SyncInvoker<CreateTbSessionRequest, CreateTbSessionResponse> createTbSessionInvoker(CreateTbSessionRequest request) {
        return new SyncInvoker<CreateTbSessionRequest, CreateTbSessionResponse>(request, CbsMeta.createTbSession, hcClient);
    }

    /**
     * 关闭会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param DeleteSessionRequest 请求对象
     * @return DeleteSessionResponse
     */
    public DeleteSessionResponse deleteSession(DeleteSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.deleteSession);
    }

    /**
     * 关闭会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param DeleteSessionRequest 请求对象
     * @return SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public SyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionInvoker(DeleteSessionRequest request) {
        return new SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>(request, CbsMeta.deleteSession, hcClient);
    }

    /**
     * 结束会话
     * 结束话务机器人会话。如果会话持续10分钟无会话请求则被清理。
     *
     * @param DeleteTbSessionRequest 请求对象
     * @return DeleteTbSessionResponse
     */
    public DeleteTbSessionResponse deleteTbSession(DeleteTbSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.deleteTbSession);
    }

    /**
     * 结束会话
     * 结束话务机器人会话。如果会话持续10分钟无会话请求则被清理。
     *
     * @param DeleteTbSessionRequest 请求对象
     * @return SyncInvoker<DeleteTbSessionRequest, DeleteTbSessionResponse>
     */
    public SyncInvoker<DeleteTbSessionRequest, DeleteTbSessionResponse> deleteTbSessionInvoker(DeleteTbSessionRequest request) {
        return new SyncInvoker<DeleteTbSessionRequest, DeleteTbSessionResponse>(request, CbsMeta.deleteTbSession, hcClient);
    }

    /**
     * 问答机器人会话
     * 用户调用该接口和机器人进行聊天。
     *
     * @param ExecuteQaChatRequest 请求对象
     * @return ExecuteQaChatResponse
     */
    public ExecuteQaChatResponse executeQaChat(ExecuteQaChatRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeQaChat);
    }

    /**
     * 问答机器人会话
     * 用户调用该接口和机器人进行聊天。
     *
     * @param ExecuteQaChatRequest 请求对象
     * @return SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>
     */
    public SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChatInvoker(ExecuteQaChatRequest request) {
        return new SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>(request, CbsMeta.executeQaChat, hcClient);
    }

    /**
     * 处理会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param ExecuteSessionRequest 请求对象
     * @return ExecuteSessionResponse
     */
    public ExecuteSessionResponse executeSession(ExecuteSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeSession);
    }

    /**
     * 处理会话
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     *
     * @param ExecuteSessionRequest 请求对象
     * @return SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>
     */
    public SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse> executeSessionInvoker(ExecuteSessionRequest request) {
        return new SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>(request, CbsMeta.executeSession, hcClient);
    }

    /**
     * 进行会话
     * 进行话务机器人会话。
     *
     * @param ExecuteTbSessionRequest 请求对象
     * @return ExecuteTbSessionResponse
     */
    public ExecuteTbSessionResponse executeTbSession(ExecuteTbSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeTbSession);
    }

    /**
     * 进行会话
     * 进行话务机器人会话。
     *
     * @param ExecuteTbSessionRequest 请求对象
     * @return SyncInvoker<ExecuteTbSessionRequest, ExecuteTbSessionResponse>
     */
    public SyncInvoker<ExecuteTbSessionRequest, ExecuteTbSessionResponse> executeTbSessionInvoker(ExecuteTbSessionRequest request) {
        return new SyncInvoker<ExecuteTbSessionRequest, ExecuteTbSessionResponse>(request, CbsMeta.executeTbSession, hcClient);
    }

    /**
     * 获取问题提示
     * 获取用户输入问题的提示问题列表。
     *
     * @param ListSuggestionsRequest 请求对象
     * @return ListSuggestionsResponse
     */
    public ListSuggestionsResponse listSuggestions(ListSuggestionsRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.listSuggestions);
    }

    /**
     * 获取问题提示
     * 获取用户输入问题的提示问题列表。
     *
     * @param ListSuggestionsRequest 请求对象
     * @return SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>
     */
    public SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestionsInvoker(ListSuggestionsRequest request) {
        return new SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>(request, CbsMeta.listSuggestions, hcClient);
    }

    /**
     * 标记为转人工
     * 智能问答返回的结果后，用户是否转人工。
     *
     * @param TagLaborRequest 请求对象
     * @return TagLaborResponse
     */
    public TagLaborResponse tagLabor(TagLaborRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.tagLabor);
    }

    /**
     * 标记为转人工
     * 智能问答返回的结果后，用户是否转人工。
     *
     * @param TagLaborRequest 请求对象
     * @return SyncInvoker<TagLaborRequest, TagLaborResponse>
     */
    public SyncInvoker<TagLaborRequest, TagLaborResponse> tagLaborInvoker(TagLaborRequest request) {
        return new SyncInvoker<TagLaborRequest, TagLaborResponse>(request, CbsMeta.tagLabor, hcClient);
    }

    /**
     * 问答满意评价
     * 用户提出问题后，对智能问答返回的结果是否满意。
     *
     * @param TagSatisfactionRequest 请求对象
     * @return TagSatisfactionResponse
     */
    public TagSatisfactionResponse tagSatisfaction(TagSatisfactionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.tagSatisfaction);
    }

    /**
     * 问答满意评价
     * 用户提出问题后，对智能问答返回的结果是否满意。
     *
     * @param TagSatisfactionRequest 请求对象
     * @return SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>
     */
    public SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfactionInvoker(TagSatisfactionRequest request) {
        return new SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>(request, CbsMeta.tagSatisfaction, hcClient);
    }

}