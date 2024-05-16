package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建欢迎词请求。
 */
public class CreateWelcomeSpeechReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "welcome_speech")

    private String welcomeSpeech;

    public CreateWelcomeSpeechReq withRobotId(String robotId) {
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

    public CreateWelcomeSpeechReq withWelcomeSpeech(String welcomeSpeech) {
        this.welcomeSpeech = welcomeSpeech;
        return this;
    }

    /**
     * 欢迎词。
     * @return welcomeSpeech
     */
    public String getWelcomeSpeech() {
        return welcomeSpeech;
    }

    public void setWelcomeSpeech(String welcomeSpeech) {
        this.welcomeSpeech = welcomeSpeech;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWelcomeSpeechReq that = (CreateWelcomeSpeechReq) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.welcomeSpeech, that.welcomeSpeech);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, welcomeSpeech);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWelcomeSpeechReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    welcomeSpeech: ").append(toIndentedString(welcomeSpeech)).append("\n");
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
