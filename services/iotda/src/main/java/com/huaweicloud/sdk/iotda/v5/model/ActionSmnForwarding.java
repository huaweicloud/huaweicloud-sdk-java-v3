package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 发送给SMN消息结构
 */
public class ActionSmnForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "theme_name")

    private String themeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_content")

    private String messageContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_title")

    private String messageTitle;

    public ActionSmnForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * **参数说明**：SMN服务对应的region区域。
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ActionSmnForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数说明**：SMN服务对应的projectId信息。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ActionSmnForwarding withThemeName(String themeName) {
        this.themeName = themeName;
        return this;
    }

    /**
     * **参数说明**：SMN服务对应的主题名称。
     * @return themeName
     */
    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public ActionSmnForwarding withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数说明**：SMN服务对应的topic的主题URN。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ActionSmnForwarding withMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }

    /**
     * **参数说明**：短信或邮件的内容。
     * @return messageContent
     */
    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public ActionSmnForwarding withMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
        return this;
    }

    /**
     * **参数说明**：短信或邮件的主题。
     * @return messageTitle
     */
    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionSmnForwarding actionSmnForwarding = (ActionSmnForwarding) o;
        return Objects.equals(this.regionName, actionSmnForwarding.regionName)
            && Objects.equals(this.projectId, actionSmnForwarding.projectId)
            && Objects.equals(this.themeName, actionSmnForwarding.themeName)
            && Objects.equals(this.topicUrn, actionSmnForwarding.topicUrn)
            && Objects.equals(this.messageContent, actionSmnForwarding.messageContent)
            && Objects.equals(this.messageTitle, actionSmnForwarding.messageTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, themeName, topicUrn, messageContent, messageTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionSmnForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    themeName: ").append(toIndentedString(themeName)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    messageContent: ").append(toIndentedString(messageContent)).append("\n");
        sb.append("    messageTitle: ").append(toIndentedString(messageTitle)).append("\n");
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
