package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 评论回复,其中evaluation_id和reply_id之中必须选择一个填写
 */
public class EvaluationReply {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_id")

    private String evaluationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_id")

    private String replyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public EvaluationReply withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * 所在评论id
     * @return evaluationId
     */
    public String getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    public EvaluationReply withReplyId(String replyId) {
        this.replyId = replyId;
        return this;
    }

    /**
     * 回复评论的id 空表示回复主评论
     * @return replyId
     */
    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public EvaluationReply withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 评论或回复内容
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
        EvaluationReply that = (EvaluationReply) obj;
        return Objects.equals(this.evaluationId, that.evaluationId) && Objects.equals(this.replyId, that.replyId)
            && Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationId, replyId, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationReply {\n");
        sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
        sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
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
