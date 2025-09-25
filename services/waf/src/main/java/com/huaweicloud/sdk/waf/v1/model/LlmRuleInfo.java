package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LlmRuleInfo
 */
public class LlmRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discription")

    private String discription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_detect_opts")

    private LlmRuleInfoPromptDetectOpts promptDetectOpts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resp_detect_opts")

    private LlmRuleInfoRespDetectOpts respDetectOpts;

    public LlmRuleInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LlmRuleInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LlmRuleInfo withDiscription(String discription) {
        this.discription = discription;
        return this;
    }

    /**
     * 规则描述
     * @return discription
     */
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public LlmRuleInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 模型问答URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LlmRuleInfo withPromptDetectOpts(LlmRuleInfoPromptDetectOpts promptDetectOpts) {
        this.promptDetectOpts = promptDetectOpts;
        return this;
    }

    public LlmRuleInfo withPromptDetectOpts(Consumer<LlmRuleInfoPromptDetectOpts> promptDetectOptsSetter) {
        if (this.promptDetectOpts == null) {
            this.promptDetectOpts = new LlmRuleInfoPromptDetectOpts();
            promptDetectOptsSetter.accept(this.promptDetectOpts);
        }

        return this;
    }

    /**
     * Get promptDetectOpts
     * @return promptDetectOpts
     */
    public LlmRuleInfoPromptDetectOpts getPromptDetectOpts() {
        return promptDetectOpts;
    }

    public void setPromptDetectOpts(LlmRuleInfoPromptDetectOpts promptDetectOpts) {
        this.promptDetectOpts = promptDetectOpts;
    }

    public LlmRuleInfo withRespDetectOpts(LlmRuleInfoRespDetectOpts respDetectOpts) {
        this.respDetectOpts = respDetectOpts;
        return this;
    }

    public LlmRuleInfo withRespDetectOpts(Consumer<LlmRuleInfoRespDetectOpts> respDetectOptsSetter) {
        if (this.respDetectOpts == null) {
            this.respDetectOpts = new LlmRuleInfoRespDetectOpts();
            respDetectOptsSetter.accept(this.respDetectOpts);
        }

        return this;
    }

    /**
     * Get respDetectOpts
     * @return respDetectOpts
     */
    public LlmRuleInfoRespDetectOpts getRespDetectOpts() {
        return respDetectOpts;
    }

    public void setRespDetectOpts(LlmRuleInfoRespDetectOpts respDetectOpts) {
        this.respDetectOpts = respDetectOpts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LlmRuleInfo that = (LlmRuleInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.discription, that.discription) && Objects.equals(this.url, that.url)
            && Objects.equals(this.promptDetectOpts, that.promptDetectOpts)
            && Objects.equals(this.respDetectOpts, that.respDetectOpts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, discription, url, promptDetectOpts, respDetectOpts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LlmRuleInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    discription: ").append(toIndentedString(discription)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    promptDetectOpts: ").append(toIndentedString(promptDetectOpts)).append("\n");
        sb.append("    respDetectOpts: ").append(toIndentedString(respDetectOpts)).append("\n");
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
