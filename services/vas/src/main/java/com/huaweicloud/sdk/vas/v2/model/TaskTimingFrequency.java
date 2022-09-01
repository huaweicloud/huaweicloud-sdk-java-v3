package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 频率模式配置。和periods字段二选一，不可共存。
 */
public class TaskTimingFrequency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    @JacksonXmlProperty(localName = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    @JacksonXmlProperty(localName = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_at")

    @JacksonXmlProperty(localName = "begin_at")

    private String beginAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    @JacksonXmlProperty(localName = "end_at")

    private String endAt;

    public TaskTimingFrequency withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 相邻两次执行之间的间隔，频率模式必填。取值范围在5~720之间，单位：分钟。
     * minimum: 5
     * maximum: 720
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public TaskTimingFrequency withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 单次执行的运行时长，频率模式必填。取值范围在5~720之间，单位：分钟。
     * minimum: 5
     * maximum: 720
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public TaskTimingFrequency withBeginAt(String beginAt) {
        this.beginAt = beginAt;
        return this;
    }

    /**
     * 单日内执行的起始时间，选填。格式形如hh:mm:ss。
     * @return beginAt
     */
    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    public TaskTimingFrequency withEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 单日内执行的结束时间，选填。格式形如hh:mm:ss。
     * @return endAt
     */
    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskTimingFrequency taskTimingFrequency = (TaskTimingFrequency) o;
        return Objects.equals(this.interval, taskTimingFrequency.interval)
            && Objects.equals(this.duration, taskTimingFrequency.duration)
            && Objects.equals(this.beginAt, taskTimingFrequency.beginAt)
            && Objects.equals(this.endAt, taskTimingFrequency.endAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interval, duration, beginAt, endAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTimingFrequency {\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    beginAt: ").append(toIndentedString(beginAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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
