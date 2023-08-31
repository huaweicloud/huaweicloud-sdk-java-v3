package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FeedbackInfo
 */
public class FeedbackInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_grade")

    private String feedbackGrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_content")

    private String feedbackContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_created")

    private Long gmtCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modified")

    private Long gmtModified;

    public FeedbackInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FeedbackInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目Id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public FeedbackInfo withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 任务消息唯一Id
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public FeedbackInfo withFeedbackGrade(String feedbackGrade) {
        this.feedbackGrade = feedbackGrade;
        return this;
    }

    /**
     * 反馈等级
     * @return feedbackGrade
     */
    public String getFeedbackGrade() {
        return feedbackGrade;
    }

    public void setFeedbackGrade(String feedbackGrade) {
        this.feedbackGrade = feedbackGrade;
    }

    public FeedbackInfo withFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
        return this;
    }

    /**
     * 反馈内容
     * @return feedbackContent
     */
    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public FeedbackInfo withGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }

    /**
     * 创建时间
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public FeedbackInfo withGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }

    /**
     * 修改时间
     * @return gmtModified
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeedbackInfo that = (FeedbackInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.messageId, that.messageId) && Objects.equals(this.feedbackGrade, that.feedbackGrade)
            && Objects.equals(this.feedbackContent, that.feedbackContent)
            && Objects.equals(this.gmtCreated, that.gmtCreated) && Objects.equals(this.gmtModified, that.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, messageId, feedbackGrade, feedbackContent, gmtCreated, gmtModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    feedbackGrade: ").append(toIndentedString(feedbackGrade)).append("\n");
        sb.append("    feedbackContent: ").append(toIndentedString(feedbackContent)).append("\n");
        sb.append("    gmtCreated: ").append(toIndentedString(gmtCreated)).append("\n");
        sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
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
