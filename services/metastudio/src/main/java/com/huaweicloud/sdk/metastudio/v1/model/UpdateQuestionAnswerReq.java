package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改问答对请求。
 */
public class UpdateQuestionAnswerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer")

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similar_questions")

    private String similarQuestions;

    public UpdateQuestionAnswerReq withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * 标准问题。
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public UpdateQuestionAnswerReq withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * 问题答案。
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public UpdateQuestionAnswerReq withSimilarQuestions(String similarQuestions) {
        this.similarQuestions = similarQuestions;
        return this;
    }

    /**
     * 所有相似问题，多个相似问题间用换行符\\n分隔。
     * @return similarQuestions
     */
    public String getSimilarQuestions() {
        return similarQuestions;
    }

    public void setSimilarQuestions(String similarQuestions) {
        this.similarQuestions = similarQuestions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateQuestionAnswerReq that = (UpdateQuestionAnswerReq) obj;
        return Objects.equals(this.question, that.question) && Objects.equals(this.answer, that.answer)
            && Objects.equals(this.similarQuestions, that.similarQuestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer, similarQuestions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateQuestionAnswerReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    similarQuestions: ").append(toIndentedString(similarQuestions)).append("\n");
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
