package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件通道监控指标数据
 */
public class EventPubMetricsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_size")

    private Long eventSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Long num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Long successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_time")

    private Long processTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_time")

    private Long invokeTime;

    public EventPubMetricsItem withEventSize(Long eventSize) {
        this.eventSize = eventSize;
        return this;
    }

    /**
     * 事件大小
     * @return eventSize
     */
    public Long getEventSize() {
        return eventSize;
    }

    public void setEventSize(Long eventSize) {
        this.eventSize = eventSize;
    }

    public EventPubMetricsItem withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public EventPubMetricsItem withNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * 调用数
     * @return num
     */
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public EventPubMetricsItem withSuccessNum(Long successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 调用成功数
     * @return successNum
     */
    public Long getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Long successNum) {
        this.successNum = successNum;
    }

    public EventPubMetricsItem withProcessTime(Long processTime) {
        this.processTime = processTime;
        return this;
    }

    /**
     * 处理时间
     * @return processTime
     */
    public Long getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Long processTime) {
        this.processTime = processTime;
    }

    public EventPubMetricsItem withInvokeTime(Long invokeTime) {
        this.invokeTime = invokeTime;
        return this;
    }

    /**
     * 调用时间
     * @return invokeTime
     */
    public Long getInvokeTime() {
        return invokeTime;
    }

    public void setInvokeTime(Long invokeTime) {
        this.invokeTime = invokeTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventPubMetricsItem eventPubMetricsItem = (EventPubMetricsItem) o;
        return Objects.equals(this.eventSize, eventPubMetricsItem.eventSize)
            && Objects.equals(this.timestamp, eventPubMetricsItem.timestamp)
            && Objects.equals(this.num, eventPubMetricsItem.num)
            && Objects.equals(this.successNum, eventPubMetricsItem.successNum)
            && Objects.equals(this.processTime, eventPubMetricsItem.processTime)
            && Objects.equals(this.invokeTime, eventPubMetricsItem.invokeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSize, timestamp, num, successNum, processTime, invokeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventPubMetricsItem {\n");
        sb.append("    eventSize: ").append(toIndentedString(eventSize)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    invokeTime: ").append(toIndentedString(invokeTime)).append("\n");
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
