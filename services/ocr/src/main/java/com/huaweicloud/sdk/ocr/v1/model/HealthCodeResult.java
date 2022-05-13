package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class HealthCodeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public HealthCodeResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthCodeResult withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 健康码更新时间 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HealthCodeResult withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 健康码颜色，可选值包括： - \"green\" - \"yellow\" - \"red\" - \"gray\" 
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HealthCodeResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthCodeResult healthCodeResult = (HealthCodeResult) o;
        return Objects.equals(this.name, healthCodeResult.name) && Objects.equals(this.time, healthCodeResult.time)
            && Objects.equals(this.color, healthCodeResult.color)
            && Objects.equals(this.confidence, healthCodeResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time, color, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCodeResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
