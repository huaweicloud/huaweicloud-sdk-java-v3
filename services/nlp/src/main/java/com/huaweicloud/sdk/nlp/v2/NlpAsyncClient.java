package com.huaweicloud.sdk.nlp.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.nlp.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class NlpAsyncClient {

    protected HcClient hcClient;

    public NlpAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<NlpAsyncClient> newBuilder() {
        return new ClientBuilder<>(NlpAsyncClient::new, "BasicCredentials");
    }

    /**
     * 属性级情感分析
     *
     * 属性级情感分析，针对手机领域的用户评论进行属性级情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAspectSentimentRequest 请求对象
     * @return CompletableFuture<RunAspectSentimentResponse>
     */
    public CompletableFuture<RunAspectSentimentResponse> runAspectSentimentAsync(RunAspectSentimentRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runAspectSentiment);
    }

    /**
     * 属性级情感分析
     *
     * 属性级情感分析，针对手机领域的用户评论进行属性级情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAspectSentimentRequest 请求对象
     * @return AsyncInvoker<RunAspectSentimentRequest, RunAspectSentimentResponse>
     */
    public AsyncInvoker<RunAspectSentimentRequest, RunAspectSentimentResponse> runAspectSentimentAsyncInvoker(
        RunAspectSentimentRequest request) {
        return new AsyncInvoker<RunAspectSentimentRequest, RunAspectSentimentResponse>(request,
            NlpMeta.runAspectSentiment, hcClient);
    }

    /**
     * 属性级情感分析（高级版）
     *
     * 属性级情感分析（高级版），针对手机、汽车领域的用户评论进行属性级情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAspectSentimentAdvanceRequest 请求对象
     * @return CompletableFuture<RunAspectSentimentAdvanceResponse>
     */
    public CompletableFuture<RunAspectSentimentAdvanceResponse> runAspectSentimentAdvanceAsync(
        RunAspectSentimentAdvanceRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runAspectSentimentAdvance);
    }

    /**
     * 属性级情感分析（高级版）
     *
     * 属性级情感分析（高级版），针对手机、汽车领域的用户评论进行属性级情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAspectSentimentAdvanceRequest 请求对象
     * @return AsyncInvoker<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse>
     */
    public AsyncInvoker<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> runAspectSentimentAdvanceAsyncInvoker(
        RunAspectSentimentAdvanceRequest request) {
        return new AsyncInvoker<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse>(request,
            NlpMeta.runAspectSentimentAdvance, hcClient);
    }

    /**
     * 文本分类
     *
     * 针对广告领域的自动分类，判断是否是广告。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunClassificationRequest 请求对象
     * @return CompletableFuture<RunClassificationResponse>
     */
    public CompletableFuture<RunClassificationResponse> runClassificationAsync(RunClassificationRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runClassification);
    }

    /**
     * 文本分类
     *
     * 针对广告领域的自动分类，判断是否是广告。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunClassificationRequest 请求对象
     * @return AsyncInvoker<RunClassificationRequest, RunClassificationResponse>
     */
    public AsyncInvoker<RunClassificationRequest, RunClassificationResponse> runClassificationAsyncInvoker(
        RunClassificationRequest request) {
        return new AsyncInvoker<RunClassificationRequest, RunClassificationResponse>(request, NlpMeta.runClassification,
            hcClient);
    }

    /**
     * 成分句法分析
     *
     * 识别句子中的成分以及成分之间的层次包含关系。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunConstituencyParserRequest 请求对象
     * @return CompletableFuture<RunConstituencyParserResponse>
     */
    public CompletableFuture<RunConstituencyParserResponse> runConstituencyParserAsync(
        RunConstituencyParserRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runConstituencyParser);
    }

    /**
     * 成分句法分析
     *
     * 识别句子中的成分以及成分之间的层次包含关系。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunConstituencyParserRequest 请求对象
     * @return AsyncInvoker<RunConstituencyParserRequest, RunConstituencyParserResponse>
     */
    public AsyncInvoker<RunConstituencyParserRequest, RunConstituencyParserResponse> runConstituencyParserAsyncInvoker(
        RunConstituencyParserRequest request) {
        return new AsyncInvoker<RunConstituencyParserRequest, RunConstituencyParserResponse>(request,
            NlpMeta.runConstituencyParser, hcClient);
    }

    /**
     * 依存句法分析
     *
     * 识别句子中词汇与词汇之间的相互依存关系。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDependencyParserRequest 请求对象
     * @return CompletableFuture<RunDependencyParserResponse>
     */
    public CompletableFuture<RunDependencyParserResponse> runDependencyParserAsync(RunDependencyParserRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runDependencyParser);
    }

    /**
     * 依存句法分析
     *
     * 识别句子中词汇与词汇之间的相互依存关系。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDependencyParserRequest 请求对象
     * @return AsyncInvoker<RunDependencyParserRequest, RunDependencyParserResponse>
     */
    public AsyncInvoker<RunDependencyParserRequest, RunDependencyParserResponse> runDependencyParserAsyncInvoker(
        RunDependencyParserRequest request) {
        return new AsyncInvoker<RunDependencyParserRequest, RunDependencyParserResponse>(request,
            NlpMeta.runDependencyParser, hcClient);
    }

    /**
     * 文档分类
     *
     * 文档分类接口，输入文档内容，输出文档的标签和置信度，支持多个标签。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDocClassificationRequest 请求对象
     * @return CompletableFuture<RunDocClassificationResponse>
     */
    public CompletableFuture<RunDocClassificationResponse> runDocClassificationAsync(
        RunDocClassificationRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runDocClassification);
    }

    /**
     * 文档分类
     *
     * 文档分类接口，输入文档内容，输出文档的标签和置信度，支持多个标签。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDocClassificationRequest 请求对象
     * @return AsyncInvoker<RunDocClassificationRequest, RunDocClassificationResponse>
     */
    public AsyncInvoker<RunDocClassificationRequest, RunDocClassificationResponse> runDocClassificationAsyncInvoker(
        RunDocClassificationRequest request) {
        return new AsyncInvoker<RunDocClassificationRequest, RunDocClassificationResponse>(request,
            NlpMeta.runDocClassification, hcClient);
    }

    /**
     * 情感分析（领域版）
     *
     * 领域情感分析，针对未知领域，电商，汽车领域的用户评论进行情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDomainSentimentRequest 请求对象
     * @return CompletableFuture<RunDomainSentimentResponse>
     */
    public CompletableFuture<RunDomainSentimentResponse> runDomainSentimentAsync(RunDomainSentimentRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runDomainSentiment);
    }

    /**
     * 情感分析（领域版）
     *
     * 领域情感分析，针对未知领域，电商，汽车领域的用户评论进行情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDomainSentimentRequest 请求对象
     * @return AsyncInvoker<RunDomainSentimentRequest, RunDomainSentimentResponse>
     */
    public AsyncInvoker<RunDomainSentimentRequest, RunDomainSentimentResponse> runDomainSentimentAsyncInvoker(
        RunDomainSentimentRequest request) {
        return new AsyncInvoker<RunDomainSentimentRequest, RunDomainSentimentResponse>(request,
            NlpMeta.runDomainSentiment, hcClient);
    }

    /**
     * 实体链接
     *
     * 针对通用领域的文本进行实体链接分析，识别出其中的实体，并返回实体相关信息。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEntityLinkingRequest 请求对象
     * @return CompletableFuture<RunEntityLinkingResponse>
     */
    public CompletableFuture<RunEntityLinkingResponse> runEntityLinkingAsync(RunEntityLinkingRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runEntityLinking);
    }

    /**
     * 实体链接
     *
     * 针对通用领域的文本进行实体链接分析，识别出其中的实体，并返回实体相关信息。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEntityLinkingRequest 请求对象
     * @return AsyncInvoker<RunEntityLinkingRequest, RunEntityLinkingResponse>
     */
    public AsyncInvoker<RunEntityLinkingRequest, RunEntityLinkingResponse> runEntityLinkingAsyncInvoker(
        RunEntityLinkingRequest request) {
        return new AsyncInvoker<RunEntityLinkingRequest, RunEntityLinkingResponse>(request, NlpMeta.runEntityLinking,
            hcClient);
    }

    /**
     * 实体级情感分析
     *
     * 实体级情感分析，本产品适用于金融方面公司实体正负面新闻的分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEntitySentimentRequest 请求对象
     * @return CompletableFuture<RunEntitySentimentResponse>
     */
    public CompletableFuture<RunEntitySentimentResponse> runEntitySentimentAsync(RunEntitySentimentRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runEntitySentiment);
    }

    /**
     * 实体级情感分析
     *
     * 实体级情感分析，本产品适用于金融方面公司实体正负面新闻的分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEntitySentimentRequest 请求对象
     * @return AsyncInvoker<RunEntitySentimentRequest, RunEntitySentimentResponse>
     */
    public AsyncInvoker<RunEntitySentimentRequest, RunEntitySentimentResponse> runEntitySentimentAsyncInvoker(
        RunEntitySentimentRequest request) {
        return new AsyncInvoker<RunEntitySentimentRequest, RunEntitySentimentResponse>(request,
            NlpMeta.runEntitySentiment, hcClient);
    }

    /**
     * 事件抽取
     *
     * 事件抽取是指从自然语言文本中抽取指定类型的事件以及相关实体信息，并形成结构化数据输出的文本处理技术。
     * 目前只支持金融公告中会议召开、聘任、辞职、股票增持、股票减持5类事件以及相关要素的抽取。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEventExtractionRequest 请求对象
     * @return CompletableFuture<RunEventExtractionResponse>
     */
    public CompletableFuture<RunEventExtractionResponse> runEventExtractionAsync(RunEventExtractionRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runEventExtraction);
    }

    /**
     * 事件抽取
     *
     * 事件抽取是指从自然语言文本中抽取指定类型的事件以及相关实体信息，并形成结构化数据输出的文本处理技术。
     * 目前只支持金融公告中会议召开、聘任、辞职、股票增持、股票减持5类事件以及相关要素的抽取。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEventExtractionRequest 请求对象
     * @return AsyncInvoker<RunEventExtractionRequest, RunEventExtractionResponse>
     */
    public AsyncInvoker<RunEventExtractionRequest, RunEventExtractionResponse> runEventExtractionAsyncInvoker(
        RunEventExtractionRequest request) {
        return new AsyncInvoker<RunEventExtractionRequest, RunEventExtractionResponse>(request,
            NlpMeta.runEventExtraction, hcClient);
    }

    /**
     * 文档翻译
     *
     * 文档翻译接口，用于翻译文档格式文件。由于文档翻译会需要较长的时间，因此识别是异步的，也即接口分为创建翻译任务和查询任务状态两个接口。创建翻译任务接口创建任务完成后返回，然后用户通过调用查询任务状态接口来获得翻译状态和临时URL。 用户可以使用临时URL下载翻译好的文件，每个临时URL有效期为10分种。翻译结果会保存24小时（从翻译完成的时间算起）。24小时后如果再访问，将会返回 \\\&quot;task id is not found\\\&quot;错误。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunFileTranslationRequest 请求对象
     * @return CompletableFuture<RunFileTranslationResponse>
     */
    public CompletableFuture<RunFileTranslationResponse> runFileTranslationAsync(RunFileTranslationRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runFileTranslation);
    }

    /**
     * 文档翻译
     *
     * 文档翻译接口，用于翻译文档格式文件。由于文档翻译会需要较长的时间，因此识别是异步的，也即接口分为创建翻译任务和查询任务状态两个接口。创建翻译任务接口创建任务完成后返回，然后用户通过调用查询任务状态接口来获得翻译状态和临时URL。 用户可以使用临时URL下载翻译好的文件，每个临时URL有效期为10分种。翻译结果会保存24小时（从翻译完成的时间算起）。24小时后如果再访问，将会返回 \\\&quot;task id is not found\\\&quot;错误。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunFileTranslationRequest 请求对象
     * @return AsyncInvoker<RunFileTranslationRequest, RunFileTranslationResponse>
     */
    public AsyncInvoker<RunFileTranslationRequest, RunFileTranslationResponse> runFileTranslationAsyncInvoker(
        RunFileTranslationRequest request) {
        return new AsyncInvoker<RunFileTranslationRequest, RunFileTranslationResponse>(request,
            NlpMeta.runFileTranslation, hcClient);
    }

    /**
     * 文档翻译状态查询
     *
     * 该接口用于获取文档翻译识别状态以及临时url，临时url可以用与获取翻译后的文档，每个临时url有效期为十分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunGetFileTranslationResultRequest 请求对象
     * @return CompletableFuture<RunGetFileTranslationResultResponse>
     */
    public CompletableFuture<RunGetFileTranslationResultResponse> runGetFileTranslationResultAsync(
        RunGetFileTranslationResultRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runGetFileTranslationResult);
    }

    /**
     * 文档翻译状态查询
     *
     * 该接口用于获取文档翻译识别状态以及临时url，临时url可以用与获取翻译后的文档，每个临时url有效期为十分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunGetFileTranslationResultRequest 请求对象
     * @return AsyncInvoker<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse>
     */
    public AsyncInvoker<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> runGetFileTranslationResultAsyncInvoker(
        RunGetFileTranslationResultRequest request) {
        return new AsyncInvoker<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse>(request,
            NlpMeta.runGetFileTranslationResult, hcClient);
    }

    /**
     * 关键词抽取
     *
     * 给定一段文本，抽取其中最能够反映文本主题或者意思的词汇。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunKeywordExtractRequest 请求对象
     * @return CompletableFuture<RunKeywordExtractResponse>
     */
    public CompletableFuture<RunKeywordExtractResponse> runKeywordExtractAsync(RunKeywordExtractRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runKeywordExtract);
    }

    /**
     * 关键词抽取
     *
     * 给定一段文本，抽取其中最能够反映文本主题或者意思的词汇。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunKeywordExtractRequest 请求对象
     * @return AsyncInvoker<RunKeywordExtractRequest, RunKeywordExtractResponse>
     */
    public AsyncInvoker<RunKeywordExtractRequest, RunKeywordExtractResponse> runKeywordExtractAsyncInvoker(
        RunKeywordExtractRequest request) {
        return new AsyncInvoker<RunKeywordExtractRequest, RunKeywordExtractResponse>(request, NlpMeta.runKeywordExtract,
            hcClient);
    }

    /**
     * 语种识别
     *
     * 对于用户输入的文本，返回识别出的所属语种。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunLanguageDetectionRequest 请求对象
     * @return CompletableFuture<RunLanguageDetectionResponse>
     */
    public CompletableFuture<RunLanguageDetectionResponse> runLanguageDetectionAsync(
        RunLanguageDetectionRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runLanguageDetection);
    }

    /**
     * 语种识别
     *
     * 对于用户输入的文本，返回识别出的所属语种。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunLanguageDetectionRequest 请求对象
     * @return AsyncInvoker<RunLanguageDetectionRequest, RunLanguageDetectionResponse>
     */
    public AsyncInvoker<RunLanguageDetectionRequest, RunLanguageDetectionResponse> runLanguageDetectionAsyncInvoker(
        RunLanguageDetectionRequest request) {
        return new AsyncInvoker<RunLanguageDetectionRequest, RunLanguageDetectionResponse>(request,
            NlpMeta.runLanguageDetection, hcClient);
    }

    /**
     * 多粒度分词
     *
     * 多粒度分词：给定一个句子输入，输出不同粒度的所有单词的层次结构。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunMultiGrainedSegmentRequest 请求对象
     * @return CompletableFuture<RunMultiGrainedSegmentResponse>
     */
    public CompletableFuture<RunMultiGrainedSegmentResponse> runMultiGrainedSegmentAsync(
        RunMultiGrainedSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runMultiGrainedSegment);
    }

    /**
     * 多粒度分词
     *
     * 多粒度分词：给定一个句子输入，输出不同粒度的所有单词的层次结构。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunMultiGrainedSegmentRequest 请求对象
     * @return AsyncInvoker<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse>
     */
    public AsyncInvoker<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> runMultiGrainedSegmentAsyncInvoker(
        RunMultiGrainedSegmentRequest request) {
        return new AsyncInvoker<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse>(request,
            NlpMeta.runMultiGrainedSegment, hcClient);
    }

    /**
     * 命名实体识别（基础版）
     *
     * 基础版命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、时间、组织机构类实体的识别。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunNerRequest 请求对象
     * @return CompletableFuture<RunNerResponse>
     */
    public CompletableFuture<RunNerResponse> runNerAsync(RunNerRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runNer);
    }

    /**
     * 命名实体识别（基础版）
     *
     * 基础版命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、时间、组织机构类实体的识别。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunNerRequest 请求对象
     * @return AsyncInvoker<RunNerRequest, RunNerResponse>
     */
    public AsyncInvoker<RunNerRequest, RunNerResponse> runNerAsyncInvoker(RunNerRequest request) {
        return new AsyncInvoker<RunNerRequest, RunNerResponse>(request, NlpMeta.runNer, hcClient);
    }

    /**
     * 命名实体识别（领域版）
     *
     * 领域版本命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、组织机构、时间点、日期、百分比、货币额度、序数词、计量规格词、民族、职业、邮箱12类实体的识别。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunNerDomainRequest 请求对象
     * @return CompletableFuture<RunNerDomainResponse>
     */
    public CompletableFuture<RunNerDomainResponse> runNerDomainAsync(RunNerDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runNerDomain);
    }

    /**
     * 命名实体识别（领域版）
     *
     * 领域版本命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、组织机构、时间点、日期、百分比、货币额度、序数词、计量规格词、民族、职业、邮箱12类实体的识别。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunNerDomainRequest 请求对象
     * @return AsyncInvoker<RunNerDomainRequest, RunNerDomainResponse>
     */
    public AsyncInvoker<RunNerDomainRequest, RunNerDomainResponse> runNerDomainAsyncInvoker(
        RunNerDomainRequest request) {
        return new AsyncInvoker<RunNerDomainRequest, RunNerDomainResponse>(request, NlpMeta.runNerDomain, hcClient);
    }

    /**
     * 诗歌生成
     *
     * 根据用户的输入生成诗歌。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunPoemRequest 请求对象
     * @return CompletableFuture<RunPoemResponse>
     */
    public CompletableFuture<RunPoemResponse> runPoemAsync(RunPoemRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runPoem);
    }

    /**
     * 诗歌生成
     *
     * 根据用户的输入生成诗歌。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunPoemRequest 请求对象
     * @return AsyncInvoker<RunPoemRequest, RunPoemResponse>
     */
    public AsyncInvoker<RunPoemRequest, RunPoemResponse> runPoemAsyncInvoker(RunPoemRequest request) {
        return new AsyncInvoker<RunPoemRequest, RunPoemResponse>(request, NlpMeta.runPoem, hcClient);
    }

    /**
     * 分词
     *
     * 对文本进行分词和词性标注处理。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSegmentRequest 请求对象
     * @return CompletableFuture<RunSegmentResponse>
     */
    public CompletableFuture<RunSegmentResponse> runSegmentAsync(RunSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runSegment);
    }

    /**
     * 分词
     *
     * 对文本进行分词和词性标注处理。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSegmentRequest 请求对象
     * @return AsyncInvoker<RunSegmentRequest, RunSegmentResponse>
     */
    public AsyncInvoker<RunSegmentRequest, RunSegmentResponse> runSegmentAsyncInvoker(RunSegmentRequest request) {
        return new AsyncInvoker<RunSegmentRequest, RunSegmentResponse>(request, NlpMeta.runSegment, hcClient);
    }

    /**
     * 意图理解
     *
     * 针对天气、报时、新闻、笑话、翻译、提醒、闹钟、音乐8个领域进行意图理解，对用户的问题进行领域识别并提取领域内的参数。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSemanticParserRequest 请求对象
     * @return CompletableFuture<RunSemanticParserResponse>
     */
    public CompletableFuture<RunSemanticParserResponse> runSemanticParserAsync(RunSemanticParserRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runSemanticParser);
    }

    /**
     * 意图理解
     *
     * 针对天气、报时、新闻、笑话、翻译、提醒、闹钟、音乐8个领域进行意图理解，对用户的问题进行领域识别并提取领域内的参数。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSemanticParserRequest 请求对象
     * @return AsyncInvoker<RunSemanticParserRequest, RunSemanticParserResponse>
     */
    public AsyncInvoker<RunSemanticParserRequest, RunSemanticParserResponse> runSemanticParserAsyncInvoker(
        RunSemanticParserRequest request) {
        return new AsyncInvoker<RunSemanticParserRequest, RunSemanticParserResponse>(request, NlpMeta.runSemanticParser,
            hcClient);
    }

    /**
     * 句向量
     *
     * 输入句子，返回对应的句向量。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSentenceEmbeddingRequest 请求对象
     * @return CompletableFuture<RunSentenceEmbeddingResponse>
     */
    public CompletableFuture<RunSentenceEmbeddingResponse> runSentenceEmbeddingAsync(
        RunSentenceEmbeddingRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runSentenceEmbedding);
    }

    /**
     * 句向量
     *
     * 输入句子，返回对应的句向量。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSentenceEmbeddingRequest 请求对象
     * @return AsyncInvoker<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse>
     */
    public AsyncInvoker<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> runSentenceEmbeddingAsyncInvoker(
        RunSentenceEmbeddingRequest request) {
        return new AsyncInvoker<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse>(request,
            NlpMeta.runSentenceEmbedding, hcClient);
    }

    /**
     * 情感分析（基础版）
     *
     * 通用情感分析，针对通用领域的用户评论进行情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSentimentRequest 请求对象
     * @return CompletableFuture<RunSentimentResponse>
     */
    public CompletableFuture<RunSentimentResponse> runSentimentAsync(RunSentimentRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runSentiment);
    }

    /**
     * 情感分析（基础版）
     *
     * 通用情感分析，针对通用领域的用户评论进行情感分析。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSentimentRequest 请求对象
     * @return AsyncInvoker<RunSentimentRequest, RunSentimentResponse>
     */
    public AsyncInvoker<RunSentimentRequest, RunSentimentResponse> runSentimentAsyncInvoker(
        RunSentimentRequest request) {
        return new AsyncInvoker<RunSentimentRequest, RunSentimentResponse>(request, NlpMeta.runSentiment, hcClient);
    }

    /**
     * 文本摘要（基础版）
     *
     * 对文本生成摘要。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSummaryRequest 请求对象
     * @return CompletableFuture<RunSummaryResponse>
     */
    public CompletableFuture<RunSummaryResponse> runSummaryAsync(RunSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runSummary);
    }

    /**
     * 文本摘要（基础版）
     *
     * 对文本生成摘要。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSummaryRequest 请求对象
     * @return AsyncInvoker<RunSummaryRequest, RunSummaryResponse>
     */
    public AsyncInvoker<RunSummaryRequest, RunSummaryResponse> runSummaryAsyncInvoker(RunSummaryRequest request) {
        return new AsyncInvoker<RunSummaryRequest, RunSummaryResponse>(request, NlpMeta.runSummary, hcClient);
    }

    /**
     * 文本摘要（领域版）
     *
     * 对文本生成摘要。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSummaryDomainRequest 请求对象
     * @return CompletableFuture<RunSummaryDomainResponse>
     */
    public CompletableFuture<RunSummaryDomainResponse> runSummaryDomainAsync(RunSummaryDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runSummaryDomain);
    }

    /**
     * 文本摘要（领域版）
     *
     * 对文本生成摘要。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSummaryDomainRequest 请求对象
     * @return AsyncInvoker<RunSummaryDomainRequest, RunSummaryDomainResponse>
     */
    public AsyncInvoker<RunSummaryDomainRequest, RunSummaryDomainResponse> runSummaryDomainAsyncInvoker(
        RunSummaryDomainRequest request) {
        return new AsyncInvoker<RunSummaryDomainRequest, RunSummaryDomainResponse>(request, NlpMeta.runSummaryDomain,
            hcClient);
    }

    /**
     * 文本相似度（基础版）
     *
     * 文本相似度服务，对文本对进行相似度计算。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTextSimilarityRequest 请求对象
     * @return CompletableFuture<RunTextSimilarityResponse>
     */
    public CompletableFuture<RunTextSimilarityResponse> runTextSimilarityAsync(RunTextSimilarityRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runTextSimilarity);
    }

    /**
     * 文本相似度（基础版）
     *
     * 文本相似度服务，对文本对进行相似度计算。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTextSimilarityRequest 请求对象
     * @return AsyncInvoker<RunTextSimilarityRequest, RunTextSimilarityResponse>
     */
    public AsyncInvoker<RunTextSimilarityRequest, RunTextSimilarityResponse> runTextSimilarityAsyncInvoker(
        RunTextSimilarityRequest request) {
        return new AsyncInvoker<RunTextSimilarityRequest, RunTextSimilarityResponse>(request, NlpMeta.runTextSimilarity,
            hcClient);
    }

    /**
     * 文本相似度（高级版）
     *
     * 文本相似度服务高级版，对文本对进行相似度计算。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTextSimilarityAdvanceRequest 请求对象
     * @return CompletableFuture<RunTextSimilarityAdvanceResponse>
     */
    public CompletableFuture<RunTextSimilarityAdvanceResponse> runTextSimilarityAdvanceAsync(
        RunTextSimilarityAdvanceRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runTextSimilarityAdvance);
    }

    /**
     * 文本相似度（高级版）
     *
     * 文本相似度服务高级版，对文本对进行相似度计算。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTextSimilarityAdvanceRequest 请求对象
     * @return AsyncInvoker<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse>
     */
    public AsyncInvoker<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> runTextSimilarityAdvanceAsyncInvoker(
        RunTextSimilarityAdvanceRequest request) {
        return new AsyncInvoker<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse>(request,
            NlpMeta.runTextSimilarityAdvance, hcClient);
    }

    /**
     * 文本翻译
     *
     * 对于用户输入原始语种的文本，转换为目标语种的文本。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTextTranslationRequest 请求对象
     * @return CompletableFuture<RunTextTranslationResponse>
     */
    public CompletableFuture<RunTextTranslationResponse> runTextTranslationAsync(RunTextTranslationRequest request) {
        return hcClient.asyncInvokeHttp(request, NlpMeta.runTextTranslation);
    }

    /**
     * 文本翻译
     *
     * 对于用户输入原始语种的文本，转换为目标语种的文本。
     * 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTextTranslationRequest 请求对象
     * @return AsyncInvoker<RunTextTranslationRequest, RunTextTranslationResponse>
     */
    public AsyncInvoker<RunTextTranslationRequest, RunTextTranslationResponse> runTextTranslationAsyncInvoker(
        RunTextTranslationRequest request) {
        return new AsyncInvoker<RunTextTranslationRequest, RunTextTranslationResponse>(request,
            NlpMeta.runTextTranslation, hcClient);
    }

}
