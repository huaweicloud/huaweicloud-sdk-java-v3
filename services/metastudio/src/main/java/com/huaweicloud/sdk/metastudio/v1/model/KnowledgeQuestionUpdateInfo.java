package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改知识库问法请求。
 */
public class KnowledgeQuestionUpdateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_id")

    private String questionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    public KnowledgeQuestionUpdateInfo withQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * 问法ID。
     * @return questionId
     */
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public KnowledgeQuestionUpdateInfo withQuestion(String question) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KnowledgeQuestionUpdateInfo that = (KnowledgeQuestionUpdateInfo) obj;
        return Objects.equals(this.questionId, that.questionId) && Objects.equals(this.question, that.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, question);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KnowledgeQuestionUpdateInfo {\n");
        sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
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
