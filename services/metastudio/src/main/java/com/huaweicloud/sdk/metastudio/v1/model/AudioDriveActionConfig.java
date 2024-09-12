package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 语音驱动时的动作标签配置
 */
public class AudioDriveActionConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_tag")

    private String actionTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private String actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_start_time")

    private Float actionStartTime;

    public AudioDriveActionConfig withActionTag(String actionTag) {
        this.actionTag = actionTag;
        return this;
    }

    /**
     * 动作标签
     * @return actionTag
     */
    public String getActionTag() {
        return actionTag;
    }

    public void setActionTag(String actionTag) {
        this.actionTag = actionTag;
    }

    public AudioDriveActionConfig withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * 动作名称
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public AudioDriveActionConfig withActionStartTime(Float actionStartTime) {
        this.actionStartTime = actionStartTime;
        return this;
    }

    /**
     * 动作开始时间
     * minimum: 0
     * maximum: 2.592E+6
     * @return actionStartTime
     */
    public Float getActionStartTime() {
        return actionStartTime;
    }

    public void setActionStartTime(Float actionStartTime) {
        this.actionStartTime = actionStartTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioDriveActionConfig that = (AudioDriveActionConfig) obj;
        return Objects.equals(this.actionTag, that.actionTag) && Objects.equals(this.actionName, that.actionName)
            && Objects.equals(this.actionStartTime, that.actionStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionTag, actionName, actionStartTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioDriveActionConfig {\n");
        sb.append("    actionTag: ").append(toIndentedString(actionTag)).append("\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    actionStartTime: ").append(toIndentedString(actionStartTime)).append("\n");
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
