package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提示词验证
 */
public class LlmRuleInfoPromptDetectOpts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inject_enable")

    private Boolean injectEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_enable")

    private Boolean complianceEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private LlmRuleInfoPromptDetectOptsAction action;

    public LlmRuleInfoPromptDetectOpts withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 提示词索引
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LlmRuleInfoPromptDetectOpts withInjectEnable(Boolean injectEnable) {
        this.injectEnable = injectEnable;
        return this;
    }

    /**
     * 提示词注入检测
     * @return injectEnable
     */
    public Boolean getInjectEnable() {
        return injectEnable;
    }

    public void setInjectEnable(Boolean injectEnable) {
        this.injectEnable = injectEnable;
    }

    public LlmRuleInfoPromptDetectOpts withComplianceEnable(Boolean complianceEnable) {
        this.complianceEnable = complianceEnable;
        return this;
    }

    /**
     * 提示词合规检测
     * @return complianceEnable
     */
    public Boolean getComplianceEnable() {
        return complianceEnable;
    }

    public void setComplianceEnable(Boolean complianceEnable) {
        this.complianceEnable = complianceEnable;
    }

    public LlmRuleInfoPromptDetectOpts withAction(LlmRuleInfoPromptDetectOptsAction action) {
        this.action = action;
        return this;
    }

    public LlmRuleInfoPromptDetectOpts withAction(Consumer<LlmRuleInfoPromptDetectOptsAction> actionSetter) {
        if (this.action == null) {
            this.action = new LlmRuleInfoPromptDetectOptsAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public LlmRuleInfoPromptDetectOptsAction getAction() {
        return action;
    }

    public void setAction(LlmRuleInfoPromptDetectOptsAction action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LlmRuleInfoPromptDetectOpts that = (LlmRuleInfoPromptDetectOpts) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.injectEnable, that.injectEnable)
            && Objects.equals(this.complianceEnable, that.complianceEnable) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, injectEnable, complianceEnable, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LlmRuleInfoPromptDetectOpts {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    injectEnable: ").append(toIndentedString(injectEnable)).append("\n");
        sb.append("    complianceEnable: ").append(toIndentedString(complianceEnable)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
