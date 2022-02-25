package com.huaweicloud.sdk.nlp.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.nlp.v2.model.*;

public class NlpClient {
    protected HcClient hcClient;

    public NlpClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<NlpClient> newBuilder() {
        return new ClientBuilder<>(NlpClient::new, "BasicCredentials");
    }


    /**
     * 属性级情感分析
     * 属性级情感分析，针对手机领域的用户评论进行属性级情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunAspectSentimentRequest 请求对象
     * @return RunAspectSentimentResponse
     */
    public RunAspectSentimentResponse runAspectSentiment(RunAspectSentimentRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runAspectSentiment);
    }

    /**
     * 属性级情感分析
     * 属性级情感分析，针对手机领域的用户评论进行属性级情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunAspectSentimentRequest 请求对象
     * @return SyncInvoker<RunAspectSentimentRequest, RunAspectSentimentResponse>
     */
    public SyncInvoker<RunAspectSentimentRequest, RunAspectSentimentResponse> runAspectSentimentInvoker(RunAspectSentimentRequest request) {
        return new SyncInvoker<RunAspectSentimentRequest, RunAspectSentimentResponse>(request, NlpMeta.runAspectSentiment, hcClient);
    }

    /**
     * 属性级情感分析（高级版）
     * 属性级情感分析（高级版），针对手机、汽车领域的用户评论进行属性级情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunAspectSentimentAdvanceRequest 请求对象
     * @return RunAspectSentimentAdvanceResponse
     */
    public RunAspectSentimentAdvanceResponse runAspectSentimentAdvance(RunAspectSentimentAdvanceRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runAspectSentimentAdvance);
    }

    /**
     * 属性级情感分析（高级版）
     * 属性级情感分析（高级版），针对手机、汽车领域的用户评论进行属性级情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunAspectSentimentAdvanceRequest 请求对象
     * @return SyncInvoker<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse>
     */
    public SyncInvoker<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> runAspectSentimentAdvanceInvoker(RunAspectSentimentAdvanceRequest request) {
        return new SyncInvoker<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse>(request, NlpMeta.runAspectSentimentAdvance, hcClient);
    }

    /**
     * 文本分类
     * 针对广告领域的自动分类，判断是否是广告。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunClassificationRequest 请求对象
     * @return RunClassificationResponse
     */
    public RunClassificationResponse runClassification(RunClassificationRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runClassification);
    }

    /**
     * 文本分类
     * 针对广告领域的自动分类，判断是否是广告。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunClassificationRequest 请求对象
     * @return SyncInvoker<RunClassificationRequest, RunClassificationResponse>
     */
    public SyncInvoker<RunClassificationRequest, RunClassificationResponse> runClassificationInvoker(RunClassificationRequest request) {
        return new SyncInvoker<RunClassificationRequest, RunClassificationResponse>(request, NlpMeta.runClassification, hcClient);
    }

    /**
     * 依存句法分析
     * 识别句子中词汇与词汇之间的相互依存关系。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunDependencyParserRequest 请求对象
     * @return RunDependencyParserResponse
     */
    public RunDependencyParserResponse runDependencyParser(RunDependencyParserRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runDependencyParser);
    }

    /**
     * 依存句法分析
     * 识别句子中词汇与词汇之间的相互依存关系。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunDependencyParserRequest 请求对象
     * @return SyncInvoker<RunDependencyParserRequest, RunDependencyParserResponse>
     */
    public SyncInvoker<RunDependencyParserRequest, RunDependencyParserResponse> runDependencyParserInvoker(RunDependencyParserRequest request) {
        return new SyncInvoker<RunDependencyParserRequest, RunDependencyParserResponse>(request, NlpMeta.runDependencyParser, hcClient);
    }

    /**
     * 文档分类
     * 文档分类接口，输入文档内容，输出文档的标签和置信度，支持多个标签。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunDocClassificationRequest 请求对象
     * @return RunDocClassificationResponse
     */
    public RunDocClassificationResponse runDocClassification(RunDocClassificationRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runDocClassification);
    }

    /**
     * 文档分类
     * 文档分类接口，输入文档内容，输出文档的标签和置信度，支持多个标签。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunDocClassificationRequest 请求对象
     * @return SyncInvoker<RunDocClassificationRequest, RunDocClassificationResponse>
     */
    public SyncInvoker<RunDocClassificationRequest, RunDocClassificationResponse> runDocClassificationInvoker(RunDocClassificationRequest request) {
        return new SyncInvoker<RunDocClassificationRequest, RunDocClassificationResponse>(request, NlpMeta.runDocClassification, hcClient);
    }

    /**
     * 情感分析（领域版）
     * 领域情感分析，针对未知领域，电商，汽车领域的用户评论进行情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunDomainSentimentRequest 请求对象
     * @return RunDomainSentimentResponse
     */
    public RunDomainSentimentResponse runDomainSentiment(RunDomainSentimentRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runDomainSentiment);
    }

    /**
     * 情感分析（领域版）
     * 领域情感分析，针对未知领域，电商，汽车领域的用户评论进行情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunDomainSentimentRequest 请求对象
     * @return SyncInvoker<RunDomainSentimentRequest, RunDomainSentimentResponse>
     */
    public SyncInvoker<RunDomainSentimentRequest, RunDomainSentimentResponse> runDomainSentimentInvoker(RunDomainSentimentRequest request) {
        return new SyncInvoker<RunDomainSentimentRequest, RunDomainSentimentResponse>(request, NlpMeta.runDomainSentiment, hcClient);
    }

    /**
     * 实体链接
     * 针对通用领域的文本进行实体链接分析，识别出其中的实体，并返回实体相关信息。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunEntityLinkingRequest 请求对象
     * @return RunEntityLinkingResponse
     */
    public RunEntityLinkingResponse runEntityLinking(RunEntityLinkingRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runEntityLinking);
    }

    /**
     * 实体链接
     * 针对通用领域的文本进行实体链接分析，识别出其中的实体，并返回实体相关信息。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunEntityLinkingRequest 请求对象
     * @return SyncInvoker<RunEntityLinkingRequest, RunEntityLinkingResponse>
     */
    public SyncInvoker<RunEntityLinkingRequest, RunEntityLinkingResponse> runEntityLinkingInvoker(RunEntityLinkingRequest request) {
        return new SyncInvoker<RunEntityLinkingRequest, RunEntityLinkingResponse>(request, NlpMeta.runEntityLinking, hcClient);
    }

    /**
     * 实体级情感分析
     * 实体级情感分析，本产品适用于金融方面公司实体正负面新闻的分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunEntitySentimentRequest 请求对象
     * @return RunEntitySentimentResponse
     */
    public RunEntitySentimentResponse runEntitySentiment(RunEntitySentimentRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runEntitySentiment);
    }

    /**
     * 实体级情感分析
     * 实体级情感分析，本产品适用于金融方面公司实体正负面新闻的分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunEntitySentimentRequest 请求对象
     * @return SyncInvoker<RunEntitySentimentRequest, RunEntitySentimentResponse>
     */
    public SyncInvoker<RunEntitySentimentRequest, RunEntitySentimentResponse> runEntitySentimentInvoker(RunEntitySentimentRequest request) {
        return new SyncInvoker<RunEntitySentimentRequest, RunEntitySentimentResponse>(request, NlpMeta.runEntitySentiment, hcClient);
    }

    /**
     * 事件抽取
     * 事件抽取是指从自然语言文本中抽取指定类型的事件以及相关实体信息，并形成结构化数据输出的文本处理技术。 目前只支持金融公告中会议召开、聘任、辞职、股票增持、股票减持5类事件以及相关要素的抽取。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunEventExtractionRequest 请求对象
     * @return RunEventExtractionResponse
     */
    public RunEventExtractionResponse runEventExtraction(RunEventExtractionRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runEventExtraction);
    }

    /**
     * 事件抽取
     * 事件抽取是指从自然语言文本中抽取指定类型的事件以及相关实体信息，并形成结构化数据输出的文本处理技术。 目前只支持金融公告中会议召开、聘任、辞职、股票增持、股票减持5类事件以及相关要素的抽取。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunEventExtractionRequest 请求对象
     * @return SyncInvoker<RunEventExtractionRequest, RunEventExtractionResponse>
     */
    public SyncInvoker<RunEventExtractionRequest, RunEventExtractionResponse> runEventExtractionInvoker(RunEventExtractionRequest request) {
        return new SyncInvoker<RunEventExtractionRequest, RunEventExtractionResponse>(request, NlpMeta.runEventExtraction, hcClient);
    }

    /**
     * 文档翻译
     * 文档翻译接口，用于翻译文档格式文件。由于文档翻译会需要较长的时间，因此识别是异步的，也即接口分为创建翻译任务和查询任务状态两个接口。创建翻译任务接口创建任务完成后返回，然后用户通过调用查询任务状态接口来获得翻译状态和临时URL。 用户可以使用临时URL下载翻译好的文件，每个临时URL有效期为10分种。翻译结果会保存24小时（从翻译完成的时间算起）。24小时后如果再访问，将会返回 \\\&quot;task id is not found\\\&quot;错误。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunFileTranslationRequest 请求对象
     * @return RunFileTranslationResponse
     */
    public RunFileTranslationResponse runFileTranslation(RunFileTranslationRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runFileTranslation);
    }

    /**
     * 文档翻译
     * 文档翻译接口，用于翻译文档格式文件。由于文档翻译会需要较长的时间，因此识别是异步的，也即接口分为创建翻译任务和查询任务状态两个接口。创建翻译任务接口创建任务完成后返回，然后用户通过调用查询任务状态接口来获得翻译状态和临时URL。 用户可以使用临时URL下载翻译好的文件，每个临时URL有效期为10分种。翻译结果会保存24小时（从翻译完成的时间算起）。24小时后如果再访问，将会返回 \\\&quot;task id is not found\\\&quot;错误。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunFileTranslationRequest 请求对象
     * @return SyncInvoker<RunFileTranslationRequest, RunFileTranslationResponse>
     */
    public SyncInvoker<RunFileTranslationRequest, RunFileTranslationResponse> runFileTranslationInvoker(RunFileTranslationRequest request) {
        return new SyncInvoker<RunFileTranslationRequest, RunFileTranslationResponse>(request, NlpMeta.runFileTranslation, hcClient);
    }

    /**
     * 文档翻译状态查询
     * 该接口用于获取文档翻译识别状态以及临时url，临时url可以用与获取翻译后的文档，每个临时url有效期为十分钟。
     *
     * @param RunGetFileTranslationResultRequest 请求对象
     * @return RunGetFileTranslationResultResponse
     */
    public RunGetFileTranslationResultResponse runGetFileTranslationResult(RunGetFileTranslationResultRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runGetFileTranslationResult);
    }

    /**
     * 文档翻译状态查询
     * 该接口用于获取文档翻译识别状态以及临时url，临时url可以用与获取翻译后的文档，每个临时url有效期为十分钟。
     *
     * @param RunGetFileTranslationResultRequest 请求对象
     * @return SyncInvoker<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse>
     */
    public SyncInvoker<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> runGetFileTranslationResultInvoker(RunGetFileTranslationResultRequest request) {
        return new SyncInvoker<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse>(request, NlpMeta.runGetFileTranslationResult, hcClient);
    }

    /**
     * 关键词抽取
     * 给定一段文本，抽取其中最能够反映文本主题或者意思的词汇。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunKeywordExtractRequest 请求对象
     * @return RunKeywordExtractResponse
     */
    public RunKeywordExtractResponse runKeywordExtract(RunKeywordExtractRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runKeywordExtract);
    }

    /**
     * 关键词抽取
     * 给定一段文本，抽取其中最能够反映文本主题或者意思的词汇。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunKeywordExtractRequest 请求对象
     * @return SyncInvoker<RunKeywordExtractRequest, RunKeywordExtractResponse>
     */
    public SyncInvoker<RunKeywordExtractRequest, RunKeywordExtractResponse> runKeywordExtractInvoker(RunKeywordExtractRequest request) {
        return new SyncInvoker<RunKeywordExtractRequest, RunKeywordExtractResponse>(request, NlpMeta.runKeywordExtract, hcClient);
    }

    /**
     * 语种识别
     * 对于用户输入的文本，返回识别出的所属语种。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunLanguageDetectionRequest 请求对象
     * @return RunLanguageDetectionResponse
     */
    public RunLanguageDetectionResponse runLanguageDetection(RunLanguageDetectionRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runLanguageDetection);
    }

    /**
     * 语种识别
     * 对于用户输入的文本，返回识别出的所属语种。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunLanguageDetectionRequest 请求对象
     * @return SyncInvoker<RunLanguageDetectionRequest, RunLanguageDetectionResponse>
     */
    public SyncInvoker<RunLanguageDetectionRequest, RunLanguageDetectionResponse> runLanguageDetectionInvoker(RunLanguageDetectionRequest request) {
        return new SyncInvoker<RunLanguageDetectionRequest, RunLanguageDetectionResponse>(request, NlpMeta.runLanguageDetection, hcClient);
    }

    /**
     * 多粒度分词
     * 多粒度分词：给定一个句子输入，输出不同粒度的所有单词的层次结构。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunMultiGrainedSegmentRequest 请求对象
     * @return RunMultiGrainedSegmentResponse
     */
    public RunMultiGrainedSegmentResponse runMultiGrainedSegment(RunMultiGrainedSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runMultiGrainedSegment);
    }

    /**
     * 多粒度分词
     * 多粒度分词：给定一个句子输入，输出不同粒度的所有单词的层次结构。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunMultiGrainedSegmentRequest 请求对象
     * @return SyncInvoker<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse>
     */
    public SyncInvoker<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> runMultiGrainedSegmentInvoker(RunMultiGrainedSegmentRequest request) {
        return new SyncInvoker<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse>(request, NlpMeta.runMultiGrainedSegment, hcClient);
    }

    /**
     * 命名实体识别（基础版）
     * 基础版命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、时间、组织机构类实体的识别。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunNerRequest 请求对象
     * @return RunNerResponse
     */
    public RunNerResponse runNer(RunNerRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runNer);
    }

    /**
     * 命名实体识别（基础版）
     * 基础版命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、时间、组织机构类实体的识别。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunNerRequest 请求对象
     * @return SyncInvoker<RunNerRequest, RunNerResponse>
     */
    public SyncInvoker<RunNerRequest, RunNerResponse> runNerInvoker(RunNerRequest request) {
        return new SyncInvoker<RunNerRequest, RunNerResponse>(request, NlpMeta.runNer, hcClient);
    }

    /**
     * 命名实体识别（领域版）
     * 领域版本命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、组织机构、时间点、日期、百分比、货币额度、序数词、计量规格词、民族、职业、邮箱12类实体的识别。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunNerDomainRequest 请求对象
     * @return RunNerDomainResponse
     */
    public RunNerDomainResponse runNerDomain(RunNerDomainRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runNerDomain);
    }

    /**
     * 命名实体识别（领域版）
     * 领域版本命名实体识别，对文本进行命名实体识别分析，目前支持人名、地名、组织机构、时间点、日期、百分比、货币额度、序数词、计量规格词、民族、职业、邮箱12类实体的识别。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunNerDomainRequest 请求对象
     * @return SyncInvoker<RunNerDomainRequest, RunNerDomainResponse>
     */
    public SyncInvoker<RunNerDomainRequest, RunNerDomainResponse> runNerDomainInvoker(RunNerDomainRequest request) {
        return new SyncInvoker<RunNerDomainRequest, RunNerDomainResponse>(request, NlpMeta.runNerDomain, hcClient);
    }

    /**
     * 诗歌生成
     * 根据用户的输入生成诗歌。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunPoemRequest 请求对象
     * @return RunPoemResponse
     */
    public RunPoemResponse runPoem(RunPoemRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runPoem);
    }

    /**
     * 诗歌生成
     * 根据用户的输入生成诗歌。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunPoemRequest 请求对象
     * @return SyncInvoker<RunPoemRequest, RunPoemResponse>
     */
    public SyncInvoker<RunPoemRequest, RunPoemResponse> runPoemInvoker(RunPoemRequest request) {
        return new SyncInvoker<RunPoemRequest, RunPoemResponse>(request, NlpMeta.runPoem, hcClient);
    }

    /**
     * 分词
     * 对文本进行分词和词性标注处理。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSegmentRequest 请求对象
     * @return RunSegmentResponse
     */
    public RunSegmentResponse runSegment(RunSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runSegment);
    }

    /**
     * 分词
     * 对文本进行分词和词性标注处理。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSegmentRequest 请求对象
     * @return SyncInvoker<RunSegmentRequest, RunSegmentResponse>
     */
    public SyncInvoker<RunSegmentRequest, RunSegmentResponse> runSegmentInvoker(RunSegmentRequest request) {
        return new SyncInvoker<RunSegmentRequest, RunSegmentResponse>(request, NlpMeta.runSegment, hcClient);
    }

    /**
     * 意图理解
     * 针对天气、报时、新闻、笑话、翻译、提醒、闹钟、音乐8个领域进行意图理解，对用户的问题进行领域识别并提取领域内的参数。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSemanticParserRequest 请求对象
     * @return RunSemanticParserResponse
     */
    public RunSemanticParserResponse runSemanticParser(RunSemanticParserRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runSemanticParser);
    }

    /**
     * 意图理解
     * 针对天气、报时、新闻、笑话、翻译、提醒、闹钟、音乐8个领域进行意图理解，对用户的问题进行领域识别并提取领域内的参数。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSemanticParserRequest 请求对象
     * @return SyncInvoker<RunSemanticParserRequest, RunSemanticParserResponse>
     */
    public SyncInvoker<RunSemanticParserRequest, RunSemanticParserResponse> runSemanticParserInvoker(RunSemanticParserRequest request) {
        return new SyncInvoker<RunSemanticParserRequest, RunSemanticParserResponse>(request, NlpMeta.runSemanticParser, hcClient);
    }

    /**
     * 句向量
     * 输入句子，返回对应的句向量。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSentenceEmbeddingRequest 请求对象
     * @return RunSentenceEmbeddingResponse
     */
    public RunSentenceEmbeddingResponse runSentenceEmbedding(RunSentenceEmbeddingRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runSentenceEmbedding);
    }

    /**
     * 句向量
     * 输入句子，返回对应的句向量。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSentenceEmbeddingRequest 请求对象
     * @return SyncInvoker<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse>
     */
    public SyncInvoker<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> runSentenceEmbeddingInvoker(RunSentenceEmbeddingRequest request) {
        return new SyncInvoker<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse>(request, NlpMeta.runSentenceEmbedding, hcClient);
    }

    /**
     * 情感分析（基础版）
     * 通用情感分析，针对通用领域的用户评论进行情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSentimentRequest 请求对象
     * @return RunSentimentResponse
     */
    public RunSentimentResponse runSentiment(RunSentimentRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runSentiment);
    }

    /**
     * 情感分析（基础版）
     * 通用情感分析，针对通用领域的用户评论进行情感分析。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSentimentRequest 请求对象
     * @return SyncInvoker<RunSentimentRequest, RunSentimentResponse>
     */
    public SyncInvoker<RunSentimentRequest, RunSentimentResponse> runSentimentInvoker(RunSentimentRequest request) {
        return new SyncInvoker<RunSentimentRequest, RunSentimentResponse>(request, NlpMeta.runSentiment, hcClient);
    }

    /**
     * 文本摘要（基础版）
     * 对文本生成摘要。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSummaryRequest 请求对象
     * @return RunSummaryResponse
     */
    public RunSummaryResponse runSummary(RunSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runSummary);
    }

    /**
     * 文本摘要（基础版）
     * 对文本生成摘要。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSummaryRequest 请求对象
     * @return SyncInvoker<RunSummaryRequest, RunSummaryResponse>
     */
    public SyncInvoker<RunSummaryRequest, RunSummaryResponse> runSummaryInvoker(RunSummaryRequest request) {
        return new SyncInvoker<RunSummaryRequest, RunSummaryResponse>(request, NlpMeta.runSummary, hcClient);
    }

    /**
     * 文本摘要（领域版）
     * 对文本生成摘要。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSummaryDomainRequest 请求对象
     * @return RunSummaryDomainResponse
     */
    public RunSummaryDomainResponse runSummaryDomain(RunSummaryDomainRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runSummaryDomain);
    }

    /**
     * 文本摘要（领域版）
     * 对文本生成摘要。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunSummaryDomainRequest 请求对象
     * @return SyncInvoker<RunSummaryDomainRequest, RunSummaryDomainResponse>
     */
    public SyncInvoker<RunSummaryDomainRequest, RunSummaryDomainResponse> runSummaryDomainInvoker(RunSummaryDomainRequest request) {
        return new SyncInvoker<RunSummaryDomainRequest, RunSummaryDomainResponse>(request, NlpMeta.runSummaryDomain, hcClient);
    }

    /**
     * 文本相似度（基础版）
     * 文本相似度服务，对文本对进行相似度计算。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunTextSimilarityRequest 请求对象
     * @return RunTextSimilarityResponse
     */
    public RunTextSimilarityResponse runTextSimilarity(RunTextSimilarityRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runTextSimilarity);
    }

    /**
     * 文本相似度（基础版）
     * 文本相似度服务，对文本对进行相似度计算。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunTextSimilarityRequest 请求对象
     * @return SyncInvoker<RunTextSimilarityRequest, RunTextSimilarityResponse>
     */
    public SyncInvoker<RunTextSimilarityRequest, RunTextSimilarityResponse> runTextSimilarityInvoker(RunTextSimilarityRequest request) {
        return new SyncInvoker<RunTextSimilarityRequest, RunTextSimilarityResponse>(request, NlpMeta.runTextSimilarity, hcClient);
    }

    /**
     * 文本相似度（高级版）
     * 文本相似度服务高级版，对文本对进行相似度计算。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunTextSimilarityAdvanceRequest 请求对象
     * @return RunTextSimilarityAdvanceResponse
     */
    public RunTextSimilarityAdvanceResponse runTextSimilarityAdvance(RunTextSimilarityAdvanceRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runTextSimilarityAdvance);
    }

    /**
     * 文本相似度（高级版）
     * 文本相似度服务高级版，对文本对进行相似度计算。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunTextSimilarityAdvanceRequest 请求对象
     * @return SyncInvoker<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse>
     */
    public SyncInvoker<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> runTextSimilarityAdvanceInvoker(RunTextSimilarityAdvanceRequest request) {
        return new SyncInvoker<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse>(request, NlpMeta.runTextSimilarityAdvance, hcClient);
    }

    /**
     * 文本翻译
     * 对于用户输入原始语种的文本，转换为目标语种的文本。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunTextTranslationRequest 请求对象
     * @return RunTextTranslationResponse
     */
    public RunTextTranslationResponse runTextTranslation(RunTextTranslationRequest request) {
        return hcClient.syncInvokeHttp(request, NlpMeta.runTextTranslation);
    }

    /**
     * 文本翻译
     * 对于用户输入原始语种的文本，转换为目标语种的文本。 在使用本API之前， 需要您完成服务申请， 具体操作流程请参见[申请服务](https://support.huaweicloud.com/api-nlp/nlp_03_0004.html)章节。
     *
     * @param RunTextTranslationRequest 请求对象
     * @return SyncInvoker<RunTextTranslationRequest, RunTextTranslationResponse>
     */
    public SyncInvoker<RunTextTranslationRequest, RunTextTranslationResponse> runTextTranslationInvoker(RunTextTranslationRequest request) {
        return new SyncInvoker<RunTextTranslationRequest, RunTextTranslationResponse>(request, NlpMeta.runTextTranslation, hcClient);
    }

}