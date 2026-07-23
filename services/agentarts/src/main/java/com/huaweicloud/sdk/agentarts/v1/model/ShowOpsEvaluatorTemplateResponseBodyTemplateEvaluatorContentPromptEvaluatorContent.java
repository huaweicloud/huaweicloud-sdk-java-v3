package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** prompt 内容包含文本和格式信息。 **取值范围：** 不涉及。 
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private Integer format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent withContentType(
        String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * **参数解释：** 类型标识提示词内容的表现形式。 **取值范围：** Text。 
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent withFormat(
        Integer format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释：** 格式标识提示词内容的结构化形式。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 2147483647
     * @return format
     */
    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * **参数解释：** 提示词的具体文本信息。 **取值范围：** 不涉及。 
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
        ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent that =
            (ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent) obj;
        return Objects.equals(this.contentType, that.contentType) && Objects.equals(this.format, that.format)
            && Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, format, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateEvaluatorContentPromptEvaluatorContent {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
