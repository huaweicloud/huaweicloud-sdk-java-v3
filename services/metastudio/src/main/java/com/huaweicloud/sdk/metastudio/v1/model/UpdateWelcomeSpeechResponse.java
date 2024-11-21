package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateWelcomeSpeechResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "welcome_speech_id")

    private String welcomeSpeechId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "welcome_speech")

    private String welcomeSpeech;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_welcome_speech")

    private Boolean enableWelcomeSpeech;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateWelcomeSpeechResponse withWelcomeSpeechId(String welcomeSpeechId) {
        this.welcomeSpeechId = welcomeSpeechId;
        return this;
    }

    /**
     * 欢迎词ID。
     * @return welcomeSpeechId
     */
    public String getWelcomeSpeechId() {
        return welcomeSpeechId;
    }

    public void setWelcomeSpeechId(String welcomeSpeechId) {
        this.welcomeSpeechId = welcomeSpeechId;
    }

    public UpdateWelcomeSpeechResponse withWelcomeSpeech(String welcomeSpeech) {
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

    public UpdateWelcomeSpeechResponse withEnableWelcomeSpeech(Boolean enableWelcomeSpeech) {
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

    public UpdateWelcomeSpeechResponse withLanguage(LanguageEnum language) {
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

    public UpdateWelcomeSpeechResponse withRobotId(String robotId) {
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

    public UpdateWelcomeSpeechResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateWelcomeSpeechResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateWelcomeSpeechResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWelcomeSpeechResponse that = (UpdateWelcomeSpeechResponse) obj;
        return Objects.equals(this.welcomeSpeechId, that.welcomeSpeechId)
            && Objects.equals(this.welcomeSpeech, that.welcomeSpeech)
            && Objects.equals(this.enableWelcomeSpeech, that.enableWelcomeSpeech)
            && Objects.equals(this.language, that.language) && Objects.equals(this.robotId, that.robotId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(welcomeSpeechId,
            welcomeSpeech,
            enableWelcomeSpeech,
            language,
            robotId,
            createTime,
            updateTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWelcomeSpeechResponse {\n");
        sb.append("    welcomeSpeechId: ").append(toIndentedString(welcomeSpeechId)).append("\n");
        sb.append("    welcomeSpeech: ").append(toIndentedString(welcomeSpeech)).append("\n");
        sb.append("    enableWelcomeSpeech: ").append(toIndentedString(enableWelcomeSpeech)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
