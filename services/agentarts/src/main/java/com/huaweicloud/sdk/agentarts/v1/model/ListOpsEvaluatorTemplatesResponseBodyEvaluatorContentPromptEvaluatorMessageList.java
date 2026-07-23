package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent content;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释：** 消息角色。 **取值范围：** 1: System, 2: User 等。 
     * minimum: 0
     * maximum: 100
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList withContent(
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent content) {
        this.content = content;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList withContent(
        Consumer<ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent> contentSetter) {
        if (this.content == null) {
            this.content = new ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /**
     * Get content
     * @return content
     */
    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent getContent() {
        return content;
    }

    public void setContent(ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList) obj;
        return Objects.equals(this.role, that.role) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorMessageList {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
