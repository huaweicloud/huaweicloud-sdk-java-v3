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
     *
     * 获取完全匹配的热点标准问题列表。
     * 默认按照完全匹配标准问题被问及的频次降序排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectHotQuestionsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectHotQuestionsRequest 请求对象
     * @return SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>
     */
    public SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse> collectHotQuestionsInvoker(CollectHotQuestionsRequest request) {
        return new SyncInvoker<CollectHotQuestionsRequest, CollectHotQuestionsResponse>(request, CbsMeta.collectHotQuestions, hcClient);
    }

    /**
     * 关键词统计
     *
     * 用户问关键词统计。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectKeyWordsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectKeyWordsRequest 请求对象
     * @return SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>
     */
    public SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse> collectKeyWordsInvoker(CollectKeyWordsRequest request) {
        return new SyncInvoker<CollectKeyWordsRequest, CollectKeyWordsResponse>(request, CbsMeta.collectKeyWords, hcClient);
    }

    /**
     * 问答统计
     *
     * 指定领域获取指定时间范围内的问题答复率，支持按周期统计。
     * 如果领域未指定则表示获取所有领域的问题答复率。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectReplyRatesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectReplyRatesRequest 请求对象
     * @return SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>
     */
    public SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse> collectReplyRatesInvoker(CollectReplyRatesRequest request) {
        return new SyncInvoker<CollectReplyRatesRequest, CollectReplyRatesResponse>(request, CbsMeta.collectReplyRates, hcClient);
    }

    /**
     * 访问统计
     *
     * 获取用户会话统计信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectSessionStatsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectSessionStatsRequest 请求对象
     * @return SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>
     */
    public SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse> collectSessionStatsInvoker(CollectSessionStatsRequest request) {
        return new SyncInvoker<CollectSessionStatsRequest, CollectSessionStatsResponse>(request, CbsMeta.collectSessionStats, hcClient);
    }

    /**
     * 开启会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSessionRequest 请求对象
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSession(CreateSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.createSession);
    }

    /**
     * 开启会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口创建会话。该接口仅支持老用户，新用户请优先使用问答机器人API接口进行调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSessionRequest 请求对象
     * @return SyncInvoker<CreateSessionRequest, CreateSessionResponse>
     */
    public SyncInvoker<CreateSessionRequest, CreateSessionResponse> createSessionInvoker(CreateSessionRequest request) {
        return new SyncInvoker<CreateSessionRequest, CreateSessionResponse>(request, CbsMeta.createSession, hcClient);
    }

    /**
     * 关闭会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSessionRequest 请求对象
     * @return DeleteSessionResponse
     */
    public DeleteSessionResponse deleteSession(DeleteSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.deleteSession);
    }

    /**
     * 关闭会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口关闭会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSessionRequest 请求对象
     * @return SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public SyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionInvoker(DeleteSessionRequest request) {
        return new SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>(request, CbsMeta.deleteSession, hcClient);
    }

    /**
     * 问答机器人会话
     *
     * 用户调用该接口和机器人进行聊天。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExecuteQaChatRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExecuteQaChatRequest 请求对象
     * @return SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>
     */
    public SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse> executeQaChatInvoker(ExecuteQaChatRequest request) {
        return new SyncInvoker<ExecuteQaChatRequest, ExecuteQaChatResponse>(request, CbsMeta.executeQaChat, hcClient);
    }

    /**
     * 处理会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExecuteSessionRequest 请求对象
     * @return ExecuteSessionResponse
     */
    public ExecuteSessionResponse executeSession(ExecuteSessionRequest request) {
        return hcClient.syncInvokeHttp(request, CbsMeta.executeSession);
    }

    /**
     * 处理会话
     *
     * 问答会话API由开启会话、处理会话、关闭会话三个接口组成。用户可通过调用该接口与机器人进行会话。该接口即将下线，请优先使用问答机器人API接口进行调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExecuteSessionRequest 请求对象
     * @return SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>
     */
    public SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse> executeSessionInvoker(ExecuteSessionRequest request) {
        return new SyncInvoker<ExecuteSessionRequest, ExecuteSessionResponse>(request, CbsMeta.executeSession, hcClient);
    }

    /**
     * 获取问题提示
     *
     * 获取用户输入问题的提示问题列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSuggestionsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSuggestionsRequest 请求对象
     * @return SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>
     */
    public SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse> listSuggestionsInvoker(ListSuggestionsRequest request) {
        return new SyncInvoker<ListSuggestionsRequest, ListSuggestionsResponse>(request, CbsMeta.listSuggestions, hcClient);
    }

    /**
     * 标记为转人工
     *
     * 智能问答返回的结果后，用户是否转人工。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param TagLaborRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param TagLaborRequest 请求对象
     * @return SyncInvoker<TagLaborRequest, TagLaborResponse>
     */
    public SyncInvoker<TagLaborRequest, TagLaborResponse> tagLaborInvoker(TagLaborRequest request) {
        return new SyncInvoker<TagLaborRequest, TagLaborResponse>(request, CbsMeta.tagLabor, hcClient);
    }

    /**
     * 问答满意评价
     *
     * 用户提出问题后，对智能问答返回的结果是否满意。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param TagSatisfactionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param TagSatisfactionRequest 请求对象
     * @return SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>
     */
    public SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse> tagSatisfactionInvoker(TagSatisfactionRequest request) {
        return new SyncInvoker<TagSatisfactionRequest, TagSatisfactionResponse>(request, CbsMeta.tagSatisfaction, hcClient);
    }

}