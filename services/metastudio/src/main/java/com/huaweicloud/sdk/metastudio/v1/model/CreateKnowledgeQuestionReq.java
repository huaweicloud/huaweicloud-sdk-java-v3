package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建知识库问法请求。
 */
public class CreateKnowledgeQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intent_id")

    private String intentId;

    public CreateKnowledgeQuestionReq withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * 问法。
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public CreateKnowledgeQuestionReq withIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }

    /**
     * 意图ID。
     * @return intentId
     */
    public String getIntentId() {
        return intentId;
    }

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKnowledgeQuestionReq that = (CreateKnowledgeQuestionReq) obj;
        return Objects.equals(this.question, that.question) && Objects.equals(this.intentId, that.intentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, intentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKnowledgeQuestionReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
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
