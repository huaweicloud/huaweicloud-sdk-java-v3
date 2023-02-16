package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FeedbackOption
 */
public class FeedbackOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_option_id")

    private String feedbackOptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_option_name")

    private String feedbackOptionName;

    public FeedbackOption withFeedbackOptionId(String feedbackOptionId) {
        this.feedbackOptionId = feedbackOptionId;
        return this;
    }

    /**
     * 反馈选项id
     * @return feedbackOptionId
     */
    public String getFeedbackOptionId() {
        return feedbackOptionId;
    }

    public void setFeedbackOptionId(String feedbackOptionId) {
        this.feedbackOptionId = feedbackOptionId;
    }

    public FeedbackOption withFeedbackOptionName(String feedbackOptionName) {
        this.feedbackOptionName = feedbackOptionName;
        return this;
    }

    /**
     * 反馈选项名称
     * @return feedbackOptionName
     */
    public String getFeedbackOptionName() {
        return feedbackOptionName;
    }

    public void setFeedbackOptionName(String feedbackOptionName) {
        this.feedbackOptionName = feedbackOptionName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedbackOption feedbackOption = (FeedbackOption) o;
        return Objects.equals(this.feedbackOptionId, feedbackOption.feedbackOptionId)
            && Objects.equals(this.feedbackOptionName, feedbackOption.feedbackOptionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackOptionId, feedbackOptionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackOption {\n");
        sb.append("    feedbackOptionId: ").append(toIndentedString(feedbackOptionId)).append("\n");
        sb.append("    feedbackOptionName: ").append(toIndentedString(feedbackOptionName)).append("\n");
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
