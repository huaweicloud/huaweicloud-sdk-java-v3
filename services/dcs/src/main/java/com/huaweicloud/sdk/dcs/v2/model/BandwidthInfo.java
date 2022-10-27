package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BandwidthInfo
 */
public class BandwidthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_time")

    private Long currentTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_expand_time")

    private Long nextExpandTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_count")

    private Integer expandCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_effect_time")

    private Long expandEffectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_interval_time")

    private Long expandIntervalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_expand_count")

    private Integer maxExpandCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_running")

    private Boolean taskRunning;

    public BandwidthInfo withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 临时扩容开始时间
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public BandwidthInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 临时扩容结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public BandwidthInfo withCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    /**
     * 当前时间
     * @return currentTime
     */
    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }

    public BandwidthInfo withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 当前带宽，单位为GB
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public BandwidthInfo withNextExpandTime(Long nextExpandTime) {
        this.nextExpandTime = nextExpandTime;
        return this;
    }

    /**
     * 下一个扩容时间
     * @return nextExpandTime
     */
    public Long getNextExpandTime() {
        return nextExpandTime;
    }

    public void setNextExpandTime(Long nextExpandTime) {
        this.nextExpandTime = nextExpandTime;
    }

    public BandwidthInfo withExpandCount(Integer expandCount) {
        this.expandCount = expandCount;
        return this;
    }

    /**
     * 扩容数量
     * @return expandCount
     */
    public Integer getExpandCount() {
        return expandCount;
    }

    public void setExpandCount(Integer expandCount) {
        this.expandCount = expandCount;
    }

    public BandwidthInfo withExpandEffectTime(Long expandEffectTime) {
        this.expandEffectTime = expandEffectTime;
        return this;
    }

    /**
     * 临时扩容时间间隔
     * @return expandEffectTime
     */
    public Long getExpandEffectTime() {
        return expandEffectTime;
    }

    public void setExpandEffectTime(Long expandEffectTime) {
        this.expandEffectTime = expandEffectTime;
    }

    public BandwidthInfo withExpandIntervalTime(Long expandIntervalTime) {
        this.expandIntervalTime = expandIntervalTime;
        return this;
    }

    /**
     * 下一次可以扩容间隔时间
     * @return expandIntervalTime
     */
    public Long getExpandIntervalTime() {
        return expandIntervalTime;
    }

    public void setExpandIntervalTime(Long expandIntervalTime) {
        this.expandIntervalTime = expandIntervalTime;
    }

    public BandwidthInfo withMaxExpandCount(Integer maxExpandCount) {
        this.maxExpandCount = maxExpandCount;
        return this;
    }

    /**
     * 最大扩容数量
     * @return maxExpandCount
     */
    public Integer getMaxExpandCount() {
        return maxExpandCount;
    }

    public void setMaxExpandCount(Integer maxExpandCount) {
        this.maxExpandCount = maxExpandCount;
    }

    public BandwidthInfo withTaskRunning(Boolean taskRunning) {
        this.taskRunning = taskRunning;
        return this;
    }

    /**
     * 任务是否运行
     * @return taskRunning
     */
    public Boolean getTaskRunning() {
        return taskRunning;
    }

    public void setTaskRunning(Boolean taskRunning) {
        this.taskRunning = taskRunning;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandwidthInfo bandwidthInfo = (BandwidthInfo) o;
        return Objects.equals(this.beginTime, bandwidthInfo.beginTime)
            && Objects.equals(this.endTime, bandwidthInfo.endTime)
            && Objects.equals(this.currentTime, bandwidthInfo.currentTime)
            && Objects.equals(this.bandwidth, bandwidthInfo.bandwidth)
            && Objects.equals(this.nextExpandTime, bandwidthInfo.nextExpandTime)
            && Objects.equals(this.expandCount, bandwidthInfo.expandCount)
            && Objects.equals(this.expandEffectTime, bandwidthInfo.expandEffectTime)
            && Objects.equals(this.expandIntervalTime, bandwidthInfo.expandIntervalTime)
            && Objects.equals(this.maxExpandCount, bandwidthInfo.maxExpandCount)
            && Objects.equals(this.taskRunning, bandwidthInfo.taskRunning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime,
            endTime,
            currentTime,
            bandwidth,
            nextExpandTime,
            expandCount,
            expandEffectTime,
            expandIntervalTime,
            maxExpandCount,
            taskRunning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthInfo {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    nextExpandTime: ").append(toIndentedString(nextExpandTime)).append("\n");
        sb.append("    expandCount: ").append(toIndentedString(expandCount)).append("\n");
        sb.append("    expandEffectTime: ").append(toIndentedString(expandEffectTime)).append("\n");
        sb.append("    expandIntervalTime: ").append(toIndentedString(expandIntervalTime)).append("\n");
        sb.append("    maxExpandCount: ").append(toIndentedString(maxExpandCount)).append("\n");
        sb.append("    taskRunning: ").append(toIndentedString(taskRunning)).append("\n");
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
