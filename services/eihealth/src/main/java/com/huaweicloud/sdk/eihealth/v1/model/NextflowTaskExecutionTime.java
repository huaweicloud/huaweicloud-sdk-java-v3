package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NextflowTaskExecutionTime
 */
public class NextflowTaskExecutionTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit")

    private String submit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete")

    private String complete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "realtime")

    private Long realtime;

    public NextflowTaskExecutionTime withSubmit(String submit) {
        this.submit = submit;
        return this;
    }

    /**
     * 提交时间
     * @return submit
     */
    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public NextflowTaskExecutionTime withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 开始时间
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public NextflowTaskExecutionTime withComplete(String complete) {
        this.complete = complete;
        return this;
    }

    /**
     * 完成时间
     * @return complete
     */
    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public NextflowTaskExecutionTime withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 总时间
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public NextflowTaskExecutionTime withRealtime(Long realtime) {
        this.realtime = realtime;
        return this;
    }

    /**
     * 实际运行时间
     * @return realtime
     */
    public Long getRealtime() {
        return realtime;
    }

    public void setRealtime(Long realtime) {
        this.realtime = realtime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NextflowTaskExecutionTime that = (NextflowTaskExecutionTime) obj;
        return Objects.equals(this.submit, that.submit) && Objects.equals(this.start, that.start)
            && Objects.equals(this.complete, that.complete) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.realtime, that.realtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submit, start, complete, duration, realtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NextflowTaskExecutionTime {\n");
        sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
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
