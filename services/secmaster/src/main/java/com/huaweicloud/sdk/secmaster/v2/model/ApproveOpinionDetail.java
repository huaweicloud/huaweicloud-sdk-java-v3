package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Approve Detail
 */
public class ApproveOpinionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public ApproveOpinionDetail withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Approve Result.
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ApproveOpinionDetail withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Approve content.
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApproveOpinionDetail approveOpinionDetail = (ApproveOpinionDetail) o;
        return Objects.equals(this.result, approveOpinionDetail.result)
            && Objects.equals(this.content, approveOpinionDetail.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApproveOpinionDetail {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
