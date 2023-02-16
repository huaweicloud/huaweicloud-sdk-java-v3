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
public class ListFeedbackOptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_options")

    private List<FeedbackOption> feedbackOptions = null;

    public ListFeedbackOptionResponse withErrorCode(String errorCode) {
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

    public ListFeedbackOptionResponse withErrorMsg(String errorMsg) {
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

    public ListFeedbackOptionResponse withFeedbackOptions(List<FeedbackOption> feedbackOptions) {
        this.feedbackOptions = feedbackOptions;
        return this;
    }

    public ListFeedbackOptionResponse addFeedbackOptionsItem(FeedbackOption feedbackOptionsItem) {
        if (this.feedbackOptions == null) {
            this.feedbackOptions = new ArrayList<>();
        }
        this.feedbackOptions.add(feedbackOptionsItem);
        return this;
    }

    public ListFeedbackOptionResponse withFeedbackOptions(Consumer<List<FeedbackOption>> feedbackOptionsSetter) {
        if (this.feedbackOptions == null) {
            this.feedbackOptions = new ArrayList<>();
        }
        feedbackOptionsSetter.accept(this.feedbackOptions);
        return this;
    }

    /**
     * 选项列表
     * @return feedbackOptions
     */
    public List<FeedbackOption> getFeedbackOptions() {
        return feedbackOptions;
    }

    public void setFeedbackOptions(List<FeedbackOption> feedbackOptions) {
        this.feedbackOptions = feedbackOptions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFeedbackOptionResponse listFeedbackOptionResponse = (ListFeedbackOptionResponse) o;
        return Objects.equals(this.errorCode, listFeedbackOptionResponse.errorCode)
            && Objects.equals(this.errorMsg, listFeedbackOptionResponse.errorMsg)
            && Objects.equals(this.feedbackOptions, listFeedbackOptionResponse.feedbackOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, feedbackOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFeedbackOptionResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    feedbackOptions: ").append(toIndentedString(feedbackOptions)).append("\n");
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
