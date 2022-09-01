package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 迁移进度信息体
 */
public class ProgressInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed")

    @JacksonXmlProperty(localName = "completed")

    private String completed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_time")

    @JacksonXmlProperty(localName = "remaining_time")

    private String remainingTime;

    public ProgressInfo withCompleted(String completed) {
        this.completed = completed;
        return this;
    }

    /**
     * 完成进度
     * @return completed
     */
    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public ProgressInfo withRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
        return this;
    }

    /**
     * 预计剩余时间
     * @return remainingTime
     */
    public String getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgressInfo progressInfo = (ProgressInfo) o;
        return Objects.equals(this.completed, progressInfo.completed)
            && Objects.equals(this.remainingTime, progressInfo.remainingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completed, remainingTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgressInfo {\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
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
