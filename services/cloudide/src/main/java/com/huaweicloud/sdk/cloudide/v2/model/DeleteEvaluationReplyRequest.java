package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEvaluationReplyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_id")

    private Long replyId;

    public DeleteEvaluationReplyRequest withReplyId(Long replyId) {
        this.replyId = replyId;
        return this;
    }

    /**
     * 回复id
     * minimum: 0
     * maximum: 2147483647
     * @return replyId
     */
    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEvaluationReplyRequest deleteEvaluationReplyRequest = (DeleteEvaluationReplyRequest) o;
        return Objects.equals(this.replyId, deleteEvaluationReplyRequest.replyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEvaluationReplyRequest {\n");
        sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
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
