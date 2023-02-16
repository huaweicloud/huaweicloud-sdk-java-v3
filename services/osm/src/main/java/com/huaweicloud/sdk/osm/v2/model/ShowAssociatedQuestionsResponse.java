package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAssociatedQuestionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "questions")

    private List<String> questions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ShowAssociatedQuestionsResponse withQuestions(List<String> questions) {
        this.questions = questions;
        return this;
    }

    public ShowAssociatedQuestionsResponse addQuestionsItem(String questionsItem) {
        if (this.questions == null) {
            this.questions = new ArrayList<>();
        }
        this.questions.add(questionsItem);
        return this;
    }

    public ShowAssociatedQuestionsResponse withQuestions(Consumer<List<String>> questionsSetter) {
        if (this.questions == null) {
            this.questions = new ArrayList<>();
        }
        questionsSetter.accept(this.questions);
        return this;
    }

    /**
     * 问题列表
     * @return questions
     */
    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public ShowAssociatedQuestionsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowAssociatedQuestionsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssociatedQuestionsResponse showAssociatedQuestionsResponse = (ShowAssociatedQuestionsResponse) o;
        return Objects.equals(this.questions, showAssociatedQuestionsResponse.questions)
            && Objects.equals(this.errorCode, showAssociatedQuestionsResponse.errorCode)
            && Objects.equals(this.errorMsg, showAssociatedQuestionsResponse.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questions, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssociatedQuestionsResponse {\n");
        sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
