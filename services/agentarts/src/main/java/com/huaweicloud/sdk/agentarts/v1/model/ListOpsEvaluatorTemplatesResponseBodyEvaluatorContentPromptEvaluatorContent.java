package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 消息的具体内容对象。 **取值范围：** 不涉及。 
 */
public class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * **参数解释：** 提示词文本内容。 **取值范围：** 不涉及。 
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent that =
            (ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent) obj;
        return Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyEvaluatorContentPromptEvaluatorContent {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
