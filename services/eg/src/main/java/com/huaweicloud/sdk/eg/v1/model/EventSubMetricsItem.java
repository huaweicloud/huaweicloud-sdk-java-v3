package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件订阅监控指标数据
 */
public class EventSubMetricsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private Long failNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_success_num")

    private Long retrySuccessNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_fail_num")

    private Long retryFailNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times")

    private Integer retryTimes;

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

    public EventSubMetricsItem withFailNum(Long failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * 失败数
     * @return failNum
     */
    public Long getFailNum() {
        return failNum;
    }

    public void setFailNum(Long failNum) {
        this.failNum = failNum;
    }

    public EventSubMetricsItem withRetrySuccessNum(Long retrySuccessNum) {
        this.retrySuccessNum = retrySuccessNum;
        return this;
    }

    /**
     * 重试成功数
     * @return retrySuccessNum
     */
    public Long getRetrySuccessNum() {
        return retrySuccessNum;
    }

    public void setRetrySuccessNum(Long retrySuccessNum) {
        this.retrySuccessNum = retrySuccessNum;
    }

    public EventSubMetricsItem withRetryFailNum(Long retryFailNum) {
        this.retryFailNum = retryFailNum;
        return this;
    }

    /**
     * 重试失败数
     * @return retryFailNum
     */
    public Long getRetryFailNum() {
        return retryFailNum;
    }

    public void setRetryFailNum(Long retryFailNum) {
        this.retryFailNum = retryFailNum;
    }

    public EventSubMetricsItem withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * 重试数
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public EventSubMetricsItem withTimestamp(Long timestamp) {
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

    public EventSubMetricsItem withNum(Long num) {
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

    public EventSubMetricsItem withSuccessNum(Long successNum) {
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

    public EventSubMetricsItem withProcessTime(Long processTime) {
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

    public EventSubMetricsItem withInvokeTime(Long invokeTime) {
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
        EventSubMetricsItem eventSubMetricsItem = (EventSubMetricsItem) o;
        return Objects.equals(this.failNum, eventSubMetricsItem.failNum)
            && Objects.equals(this.retrySuccessNum, eventSubMetricsItem.retrySuccessNum)
            && Objects.equals(this.retryFailNum, eventSubMetricsItem.retryFailNum)
            && Objects.equals(this.retryTimes, eventSubMetricsItem.retryTimes)
            && Objects.equals(this.timestamp, eventSubMetricsItem.timestamp)
            && Objects.equals(this.num, eventSubMetricsItem.num)
            && Objects.equals(this.successNum, eventSubMetricsItem.successNum)
            && Objects.equals(this.processTime, eventSubMetricsItem.processTime)
            && Objects.equals(this.invokeTime, eventSubMetricsItem.invokeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failNum,
            retrySuccessNum,
            retryFailNum,
            retryTimes,
            timestamp,
            num,
            successNum,
            processTime,
            invokeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSubMetricsItem {\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    retrySuccessNum: ").append(toIndentedString(retrySuccessNum)).append("\n");
        sb.append("    retryFailNum: ").append(toIndentedString(retryFailNum)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
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
