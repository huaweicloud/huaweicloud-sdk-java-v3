package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Evaluation
 */
public class Evaluation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_id")

    private String extensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public Evaluation withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * 插件id
     * @return extensionId
     */
    public String getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(String extensionId) {
        this.extensionId = extensionId;
    }

    public Evaluation withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 评论内容
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
        Evaluation that = (Evaluation) obj;
        return Objects.equals(this.extensionId, that.extensionId) && Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensionId, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Evaluation {\n");
        sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
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
