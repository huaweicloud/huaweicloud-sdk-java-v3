package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateFeedbackReq
 */
public class CreateFeedbackReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_helpful")

    private Boolean isHelpful;

    public CreateFeedbackReq withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型，例如 ecs诊断任务 1，rds诊断任务 2
     * minimum: 1
     * maximum: 4
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CreateFeedbackReq withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 反馈内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateFeedbackReq withIsHelpful(Boolean isHelpful) {
        this.isHelpful = isHelpful;
        return this;
    }

    /**
     * 是否有帮助
     * @return isHelpful
     */
    public Boolean getIsHelpful() {
        return isHelpful;
    }

    public void setIsHelpful(Boolean isHelpful) {
        this.isHelpful = isHelpful;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFeedbackReq that = (CreateFeedbackReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.content, that.content)
            && Objects.equals(this.isHelpful, that.isHelpful);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content, isHelpful);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedbackReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    isHelpful: ").append(toIndentedString(isHelpful)).append("\n");
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
