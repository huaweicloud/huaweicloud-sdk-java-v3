package com.huaweicloud.sdk.pangulargemodels.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TextCompletionReq
 */
public class TextCompletionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    private String prompt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private Boolean stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature")

    private Float temperature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_p")

    private Float topP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens")

    private Integer maxTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n")

    private Integer n;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "presence_penalty")

    private Float presencePenalty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_penalty")

    private Float frequencyPenalty;

    public TextCompletionReq withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * 向模型输入的文本信息，最小长度：1，最大长度：模型支持的max_tokens数量乘以系数，默认系数为1.5
     * @return prompt
     */
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public TextCompletionReq withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用于代表客户的唯一标识符，最小长度：1，最大长度64
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public TextCompletionReq withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流式调用的开启开关，true为开启流式调用，如果要开启流式调用，请使用流式SDK；false为关闭流式调用。默认为关闭状态（当前API Explorer不支持流式，在API Explorer调试时请使用非流式）。
     * @return stream
     */
    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public TextCompletionReq withTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * 用于控制生成文本的多样性和创造力。参数的取值范围是0到1，其中0表示最低的随机性。一般来说，temperature越低，适合完成确定性的任务。temperature越高，例如0.9，适合完成创造性的任务。temperature参数可以影响语言模型输出的质量和多样性，但也不是唯一的因素。还有其他一些参数，如top_p参数也可以用来调整语言模型的行为和偏好，但不建议同时更改这两个参数。
     * minimum: 0
     * maximum: 1
     * @return temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public TextCompletionReq withTopP(Float topP) {
        this.topP = topP;
        return this;
    }

    /**
     * 一种替代温度采样的方法，称为nucleus sampling，其中模型考虑具有top_p 概率质量的标记的结果。因此 0.1 意味着只考虑构成前 10% 概率质量的标记。我们通常建议更改此值或温度，但不要同时更改两者。通常建议更改top_p或temperature来调整生成文本的倾向性，但不要同时更改这两个参数。
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    public Float getTopP() {
        return topP;
    }

    public void setTopP(Float topP) {
        this.topP = topP;
    }

    public TextCompletionReq withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * 用于控制聊天回复的长度和质量。一般来说，较大的max_tokens值可以生成较长和较完整的回复，但也可能增加生成无关或重复内容的风险。较小的max_tokens值可以生成较短和较简洁的回复，但也可能导致生成不完整或不连贯的内容。因此，需要根据不同的场景和需求来选择合适的max_tokens值。最小值：1，最大值：根据模型不同最大值不同。
     * minimum: 1
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public TextCompletionReq withN(Integer n) {
        this.n = n;
        return this;
    }

    /**
     * 表示对每个问题生成多少条答案。n参数的默认值是1，表示只生成一个答案。如果想要生成多条答案，可以设置n参数为一个大于1的整数，例如n=2。这样，API会返回一个包含2个答案的数组。流式调用时，n只能取1。最小值：1，最大值：2，默认值：1
     * minimum: 1
     * maximum: 2
     * @return n
     */
    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public TextCompletionReq withPresencePenalty(Float presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    /**
     * 用于控制生成文本中的重复程度。正值会根据它们到目前为止在文本中的现有频率来惩罚新tokens，从而降低模型逐字重复同一行的可能性。  presence_penalty 参数可以用来提高生成文本的多样性和创造性，避免生成单调或重复的内容。最小值：-2，最大值：2
     * minimum: -2
     * maximum: 2
     * @return presencePenalty
     */
    public Float getPresencePenalty() {
        return presencePenalty;
    }

    public void setPresencePenalty(Float presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public TextCompletionReq withFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    /**
     * 用于调整模型对频繁出现的Token的处理方式。即如果一个Token在训练集中出现的频率较高，那么模型在生成这个Token时会受到一定的惩罚。当frequency_penalty的值为正数时，模型会更倾向于生成出现频率较低的Token，即模型会更倾向于使用不常见的词汇。最小值：-2，最大值：2
     * minimum: -2
     * maximum: 2
     * @return frequencyPenalty
     */
    public Float getFrequencyPenalty() {
        return frequencyPenalty;
    }

    public void setFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextCompletionReq that = (TextCompletionReq) obj;
        return Objects.equals(this.prompt, that.prompt) && Objects.equals(this.user, that.user)
            && Objects.equals(this.stream, that.stream) && Objects.equals(this.temperature, that.temperature)
            && Objects.equals(this.topP, that.topP) && Objects.equals(this.maxTokens, that.maxTokens)
            && Objects.equals(this.n, that.n) && Objects.equals(this.presencePenalty, that.presencePenalty)
            && Objects.equals(this.frequencyPenalty, that.frequencyPenalty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prompt, user, stream, temperature, topP, maxTokens, n, presencePenalty, frequencyPenalty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextCompletionReq {\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    n: ").append(toIndentedString(n)).append("\n");
        sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
        sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
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
