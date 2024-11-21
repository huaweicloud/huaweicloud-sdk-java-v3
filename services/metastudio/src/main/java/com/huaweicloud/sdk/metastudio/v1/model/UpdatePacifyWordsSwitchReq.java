package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改安抚话术功能开关请求。
 */
public class UpdatePacifyWordsSwitchReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_pacify_words")

    private Boolean enablePacifyWords;

    public UpdatePacifyWordsSwitchReq withRobotId(String robotId) {
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

    public UpdatePacifyWordsSwitchReq withLanguage(LanguageEnum language) {
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

    public UpdatePacifyWordsSwitchReq withEnablePacifyWords(Boolean enablePacifyWords) {
        this.enablePacifyWords = enablePacifyWords;
        return this;
    }

    /**
     * 安抚话术功能开关。
     * @return enablePacifyWords
     */
    public Boolean getEnablePacifyWords() {
        return enablePacifyWords;
    }

    public void setEnablePacifyWords(Boolean enablePacifyWords) {
        this.enablePacifyWords = enablePacifyWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePacifyWordsSwitchReq that = (UpdatePacifyWordsSwitchReq) obj;
        return Objects.equals(this.robotId, that.robotId) && Objects.equals(this.language, that.language)
            && Objects.equals(this.enablePacifyWords, that.enablePacifyWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(robotId, language, enablePacifyWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePacifyWordsSwitchReq {\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    enablePacifyWords: ").append(toIndentedString(enablePacifyWords)).append("\n");
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
