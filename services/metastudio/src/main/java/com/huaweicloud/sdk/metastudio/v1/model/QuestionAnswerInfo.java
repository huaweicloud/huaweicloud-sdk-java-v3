package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 问答对信息。
 */
public class QuestionAnswerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_answer_id")

    private String questionAnswerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer")

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similar_questions")

    private String similarQuestions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public QuestionAnswerInfo withQuestionAnswerId(String questionAnswerId) {
        this.questionAnswerId = questionAnswerId;
        return this;
    }

    /**
     * 问答对ID。
     * @return questionAnswerId
     */
    public String getQuestionAnswerId() {
        return questionAnswerId;
    }

    public void setQuestionAnswerId(String questionAnswerId) {
        this.questionAnswerId = questionAnswerId;
    }

    public QuestionAnswerInfo withQuestion(String question) {
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

    public QuestionAnswerInfo withAnswer(String answer) {
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

    public QuestionAnswerInfo withSimilarQuestions(String similarQuestions) {
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

    public QuestionAnswerInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public QuestionAnswerInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuestionAnswerInfo that = (QuestionAnswerInfo) obj;
        return Objects.equals(this.questionAnswerId, that.questionAnswerId)
            && Objects.equals(this.question, that.question) && Objects.equals(this.answer, that.answer)
            && Objects.equals(this.similarQuestions, that.similarQuestions)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionAnswerId, question, answer, similarQuestions, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuestionAnswerInfo {\n");
        sb.append("    questionAnswerId: ").append(toIndentedString(questionAnswerId)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    similarQuestions: ").append(toIndentedString(similarQuestions)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
