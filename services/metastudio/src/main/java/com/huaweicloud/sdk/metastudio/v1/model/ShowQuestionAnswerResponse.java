package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowQuestionAnswerResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowQuestionAnswerResponse withQuestionAnswerId(String questionAnswerId) {
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

    public ShowQuestionAnswerResponse withQuestion(String question) {
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

    public ShowQuestionAnswerResponse withAnswer(String answer) {
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

    public ShowQuestionAnswerResponse withSimilarQuestions(String similarQuestions) {
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

    public ShowQuestionAnswerResponse withCreateTime(String createTime) {
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

    public ShowQuestionAnswerResponse withUpdateTime(String updateTime) {
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

    public ShowQuestionAnswerResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuestionAnswerResponse that = (ShowQuestionAnswerResponse) obj;
        return Objects.equals(this.questionAnswerId, that.questionAnswerId)
            && Objects.equals(this.question, that.question) && Objects.equals(this.answer, that.answer)
            && Objects.equals(this.similarQuestions, that.similarQuestions)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionAnswerId, question, answer, similarQuestions, createTime, updateTime, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuestionAnswerResponse {\n");
        sb.append("    questionAnswerId: ").append(toIndentedString(questionAnswerId)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    similarQuestions: ").append(toIndentedString(similarQuestions)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
