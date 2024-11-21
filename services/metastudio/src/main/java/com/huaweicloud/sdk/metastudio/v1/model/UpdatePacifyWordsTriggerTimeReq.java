package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改安抚话术等待触发时长。
 */
public class UpdatePacifyWordsTriggerTimeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private Integer triggerTime;

    public UpdatePacifyWordsTriggerTimeReq withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * 应用ID。
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public UpdatePacifyWordsTriggerTimeReq withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public UpdatePacifyWordsTriggerTimeReq withTriggerTime(Integer triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * 安抚话术等待触发时长，单位毫秒
     * minimum: 0
     * maximum: 3000
     * @return triggerTime
     */
    public Integer getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Integer triggerTime) {
        this.triggerTime = triggerTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePacifyWordsTriggerTimeReq that = (UpdatePacifyWordsTriggerTimeReq) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.language, that.language)
            && Objects.equals(this.triggerTime, that.triggerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, language, triggerTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePacifyWordsTriggerTimeReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
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
