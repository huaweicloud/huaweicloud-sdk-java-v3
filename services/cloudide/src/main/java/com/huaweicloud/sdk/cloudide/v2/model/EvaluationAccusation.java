package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 其中evaluation_id和reply_id之中必须选择一个填写
 */
public class EvaluationAccusation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_id")

    private String evaluationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_id")

    private String replyId;

    public EvaluationAccusation withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 举报内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EvaluationAccusation withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * 评论id
     * @return evaluationId
     */
    public String getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    public EvaluationAccusation withReplyId(String replyId) {
        this.replyId = replyId;
        return this;
    }

    /**
     * 回复id
     * @return replyId
     */
    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
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
        EvaluationAccusation evaluationAccusation = (EvaluationAccusation) o;
        return Objects.equals(this.content, evaluationAccusation.content)
            && Objects.equals(this.evaluationId, evaluationAccusation.evaluationId)
            && Objects.equals(this.replyId, evaluationAccusation.replyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, evaluationId, replyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationAccusation {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
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
