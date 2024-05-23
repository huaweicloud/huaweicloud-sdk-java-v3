package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改热词功能开关请求。
 */
public class UpdateHotWordsSwitchReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hot_words")

    private Boolean enableHotWords;

    public UpdateHotWordsSwitchReq withRobotId(String robotId) {
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

    public UpdateHotWordsSwitchReq withEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
        return this;
    }

    /**
     * 热词功能开关。
     * @return enableHotWords
     */
    public Boolean getEnableHotWords() {
        return enableHotWords;
    }

    public void setEnableHotWords(Boolean enableHotWords) {
        this.enableHotWords = enableHotWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHotWordsSwitchReq that = (UpdateHotWordsSwitchReq) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.enableHotWords, that.enableHotWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, enableHotWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHotWordsSwitchReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    enableHotWords: ").append(toIndentedString(enableHotWords)).append("\n");
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
