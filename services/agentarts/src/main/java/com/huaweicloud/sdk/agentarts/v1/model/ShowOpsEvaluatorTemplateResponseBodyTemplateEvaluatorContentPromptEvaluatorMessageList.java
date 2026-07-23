package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList withContent(
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent content) {
        this.content = content;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList withContent(
        Consumer<ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent> contentSetter) {
        if (this.content == null) {
            this.content = new ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /**
     * Get content
     * @return content
     */
    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent getContent() {
        return content;
    }

    public void setContent(ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent content) {
        this.content = content;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList withRole(
        Integer role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释：** 角色标识消息发送者的身份。 **取值范围：** 1 (系统), 2 (用户)。 
     * minimum: 0
     * maximum: 2147483647
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList that =
            (ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorMessageList {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
