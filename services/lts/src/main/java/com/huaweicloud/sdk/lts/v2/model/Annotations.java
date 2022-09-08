package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Annotations
 */
public class Annotations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_info")

    private String logInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_value")

    private String currentValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_annotations")

    private String oldAnnotations;

    public Annotations withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 告警列表详情
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Annotations withLogInfo(String logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    /**
     * 日志组/流id,名称
     * @return logInfo
     */
    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    public Annotations withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * 当前值
     * @return currentValue
     */
    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public Annotations withOldAnnotations(String oldAnnotations) {
        this.oldAnnotations = oldAnnotations;
        return this;
    }

    /**
     * (sql/关键词)告警详情原始数据
     * @return oldAnnotations
     */
    public String getOldAnnotations() {
        return oldAnnotations;
    }

    public void setOldAnnotations(String oldAnnotations) {
        this.oldAnnotations = oldAnnotations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Annotations annotations = (Annotations) o;
        return Objects.equals(this.message, annotations.message) && Objects.equals(this.logInfo, annotations.logInfo)
            && Objects.equals(this.currentValue, annotations.currentValue)
            && Objects.equals(this.oldAnnotations, annotations.oldAnnotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, logInfo, currentValue, oldAnnotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Annotations {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
        sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
        sb.append("    oldAnnotations: ").append(toIndentedString(oldAnnotations)).append("\n");
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
