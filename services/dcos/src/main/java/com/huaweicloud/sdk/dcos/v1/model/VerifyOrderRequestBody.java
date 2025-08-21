package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 验收信息
 */
public class VerifyOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meet_expectation")

    private Boolean meetExpectation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    public VerifyOrderRequestBody withMeetExpectation(Boolean meetExpectation) {
        this.meetExpectation = meetExpectation;
        return this;
    }

    /**
     * 是否符合预期
     * @return meetExpectation
     */
    public Boolean getMeetExpectation() {
        return meetExpectation;
    }

    public void setMeetExpectation(Boolean meetExpectation) {
        this.meetExpectation = meetExpectation;
    }

    public VerifyOrderRequestBody withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * 客户验收意见说明
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerifyOrderRequestBody that = (VerifyOrderRequestBody) obj;
        return Objects.equals(this.meetExpectation, that.meetExpectation)
            && Objects.equals(this.comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetExpectation, comments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyOrderRequestBody {\n");
        sb.append("    meetExpectation: ").append(toIndentedString(meetExpectation)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
