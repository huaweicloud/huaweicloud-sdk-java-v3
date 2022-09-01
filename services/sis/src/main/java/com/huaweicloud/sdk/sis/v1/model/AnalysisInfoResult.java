package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * AnalysisInfoResult
 */
public class AnalysisInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    @JacksonXmlProperty(localName = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emotion")

    @JacksonXmlProperty(localName = "emotion")

    private String emotion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    @JacksonXmlProperty(localName = "speed")

    private Float speed;

    public AnalysisInfoResult withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色类型, 目前仅支持 AGENT(座席), USER(用户)。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AnalysisInfoResult withEmotion(String emotion) {
        this.emotion = emotion;
        return this;
    }

    /**
     * 情绪类型，目前支持NORMAL(正常)，ANGRY(愤怒)，UNKNOWN(未知)。 在识别配置中emotion为true时存在。
     * @return emotion
     */
    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public AnalysisInfoResult withSpeed(Float speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 语速信息，单位是\"每秒字数\"。 在识别配置中speed为true时存在。
     * @return speed
     */
    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalysisInfoResult analysisInfoResult = (AnalysisInfoResult) o;
        return Objects.equals(this.role, analysisInfoResult.role)
            && Objects.equals(this.emotion, analysisInfoResult.emotion)
            && Objects.equals(this.speed, analysisInfoResult.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, emotion, speed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisInfoResult {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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
