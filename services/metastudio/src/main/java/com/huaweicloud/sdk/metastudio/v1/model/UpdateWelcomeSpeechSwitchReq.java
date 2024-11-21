package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改欢迎词功能开关请求。
 */
public class UpdateWelcomeSpeechSwitchReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_welcome_speech")

    private Boolean enableWelcomeSpeech;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public UpdateWelcomeSpeechSwitchReq withRobotId(String robotId) {
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

    public UpdateWelcomeSpeechSwitchReq withEnableWelcomeSpeech(Boolean enableWelcomeSpeech) {
        this.enableWelcomeSpeech = enableWelcomeSpeech;
        return this;
    }

    /**
     * 欢迎词功能开关。
     * @return enableWelcomeSpeech
     */
    public Boolean getEnableWelcomeSpeech() {
        return enableWelcomeSpeech;
    }

    public void setEnableWelcomeSpeech(Boolean enableWelcomeSpeech) {
        this.enableWelcomeSpeech = enableWelcomeSpeech;
    }

    public UpdateWelcomeSpeechSwitchReq withLanguage(LanguageEnum language) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWelcomeSpeechSwitchReq that = (UpdateWelcomeSpeechSwitchReq) obj;
        return Objects.equals(this.robotId, that.robotId)
            && Objects.equals(this.enableWelcomeSpeech, that.enableWelcomeSpeech)
            && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, enableWelcomeSpeech, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWelcomeSpeechSwitchReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    enableWelcomeSpeech: ").append(toIndentedString(enableWelcomeSpeech)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
