package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 话题控制规则配置
 */
public class TopicConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_description")

    private String topicDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_words")

    private List<String> sensitiveWords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_samples")

    private List<String> blackSamples = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_samples")

    private List<String> whiteSamples = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_response")

    private String blockResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_llm_id")

    private String customLlmId;

    public TopicConfig withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * 话题名称
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public TopicConfig withTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
        return this;
    }

    /**
     * 话题描述
     * @return topicDescription
     */
    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public TopicConfig withSensitiveWords(List<String> sensitiveWords) {
        this.sensitiveWords = sensitiveWords;
        return this;
    }

    public TopicConfig addSensitiveWordsItem(String sensitiveWordsItem) {
        if (this.sensitiveWords == null) {
            this.sensitiveWords = new ArrayList<>();
        }
        this.sensitiveWords.add(sensitiveWordsItem);
        return this;
    }

    public TopicConfig withSensitiveWords(Consumer<List<String>> sensitiveWordsSetter) {
        if (this.sensitiveWords == null) {
            this.sensitiveWords = new ArrayList<>();
        }
        sensitiveWordsSetter.accept(this.sensitiveWords);
        return this;
    }

    /**
     * 敏感词列表
     * @return sensitiveWords
     */
    public List<String> getSensitiveWords() {
        return sensitiveWords;
    }

    public void setSensitiveWords(List<String> sensitiveWords) {
        this.sensitiveWords = sensitiveWords;
    }

    public TopicConfig withBlackSamples(List<String> blackSamples) {
        this.blackSamples = blackSamples;
        return this;
    }

    public TopicConfig addBlackSamplesItem(String blackSamplesItem) {
        if (this.blackSamples == null) {
            this.blackSamples = new ArrayList<>();
        }
        this.blackSamples.add(blackSamplesItem);
        return this;
    }

    public TopicConfig withBlackSamples(Consumer<List<String>> blackSamplesSetter) {
        if (this.blackSamples == null) {
            this.blackSamples = new ArrayList<>();
        }
        blackSamplesSetter.accept(this.blackSamples);
        return this;
    }

    /**
     * 黑样本列表
     * @return blackSamples
     */
    public List<String> getBlackSamples() {
        return blackSamples;
    }

    public void setBlackSamples(List<String> blackSamples) {
        this.blackSamples = blackSamples;
    }

    public TopicConfig withWhiteSamples(List<String> whiteSamples) {
        this.whiteSamples = whiteSamples;
        return this;
    }

    public TopicConfig addWhiteSamplesItem(String whiteSamplesItem) {
        if (this.whiteSamples == null) {
            this.whiteSamples = new ArrayList<>();
        }
        this.whiteSamples.add(whiteSamplesItem);
        return this;
    }

    public TopicConfig withWhiteSamples(Consumer<List<String>> whiteSamplesSetter) {
        if (this.whiteSamples == null) {
            this.whiteSamples = new ArrayList<>();
        }
        whiteSamplesSetter.accept(this.whiteSamples);
        return this;
    }

    /**
     * 白样本列表
     * @return whiteSamples
     */
    public List<String> getWhiteSamples() {
        return whiteSamples;
    }

    public void setWhiteSamples(List<String> whiteSamples) {
        this.whiteSamples = whiteSamples;
    }

    public TopicConfig withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 检测作用域，取值 request/response/request_response（值合法性由后端validateTopicConfig校验，契约层不声明enum）
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public TopicConfig withBlockResponse(String blockResponse) {
        this.blockResponse = blockResponse;
        return this;
    }

    /**
     * 拦截回包内容（仅外层action.category=block时有意义，非block落库归一化为null）
     * @return blockResponse
     */
    public String getBlockResponse() {
        return blockResponse;
    }

    public void setBlockResponse(String blockResponse) {
        this.blockResponse = blockResponse;
    }

    public TopicConfig withCustomLlmId(String customLlmId) {
        this.customLlmId = customLlmId;
        return this;
    }

    /**
     * 关联的自定义大模型ID（可选）
     * @return customLlmId
     */
    public String getCustomLlmId() {
        return customLlmId;
    }

    public void setCustomLlmId(String customLlmId) {
        this.customLlmId = customLlmId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopicConfig that = (TopicConfig) obj;
        return Objects.equals(this.topicName, that.topicName)
            && Objects.equals(this.topicDescription, that.topicDescription)
            && Objects.equals(this.sensitiveWords, that.sensitiveWords)
            && Objects.equals(this.blackSamples, that.blackSamples)
            && Objects.equals(this.whiteSamples, that.whiteSamples) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.blockResponse, that.blockResponse)
            && Objects.equals(this.customLlmId, that.customLlmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicName,
            topicDescription,
            sensitiveWords,
            blackSamples,
            whiteSamples,
            scope,
            blockResponse,
            customLlmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicConfig {\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    topicDescription: ").append(toIndentedString(topicDescription)).append("\n");
        sb.append("    sensitiveWords: ").append(toIndentedString(sensitiveWords)).append("\n");
        sb.append("    blackSamples: ").append(toIndentedString(blackSamples)).append("\n");
        sb.append("    whiteSamples: ").append(toIndentedString(whiteSamples)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    blockResponse: ").append(toIndentedString(blockResponse)).append("\n");
        sb.append("    customLlmId: ").append(toIndentedString(customLlmId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
