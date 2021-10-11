package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

/** StatisticsGroup */
public class StatisticsGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_latency")

    private Integer maxLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_latency")

    private BigDecimal avgLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count")

    private Integer reqCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count2xx")

    private Integer reqCount2xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count4xx")

    private Integer reqCount4xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count5xx")

    private Integer reqCount5xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_count_error")

    private Integer reqCountError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_throughput")

    private Long outputThroughput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_throughput")

    private Long inputThroughput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_minute")

    private Long currentMinute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_time")

    private OffsetDateTime reqTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    private OffsetDateTime registerTime;

    public StatisticsGroup withMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
        return this;
    }

    /** 最大延时 单位：ms
     * 
     * @return maxLatency */
    public Integer getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(Integer maxLatency) {
        this.maxLatency = maxLatency;
    }

    public StatisticsGroup withAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
        return this;
    }

    /** 平均延时 单位：ms
     * 
     * @return avgLatency */
    public BigDecimal getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }

    public StatisticsGroup withReqCount(Integer reqCount) {
        this.reqCount = reqCount;
        return this;
    }

    /** 请求总次数
     * 
     * @return reqCount */
    public Integer getReqCount() {
        return reqCount;
    }

    public void setReqCount(Integer reqCount) {
        this.reqCount = reqCount;
    }

    public StatisticsGroup withReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
        return this;
    }

    /** 2xx响应码总次数
     * 
     * @return reqCount2xx */
    public Integer getReqCount2xx() {
        return reqCount2xx;
    }

    public void setReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
    }

    public StatisticsGroup withReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
        return this;
    }

    /** 4xx响应码总次数
     * 
     * @return reqCount4xx */
    public Integer getReqCount4xx() {
        return reqCount4xx;
    }

    public void setReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
    }

    public StatisticsGroup withReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
        return this;
    }

    /** 5xx响应码总次数
     * 
     * @return reqCount5xx */
    public Integer getReqCount5xx() {
        return reqCount5xx;
    }

    public void setReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
    }

    public StatisticsGroup withReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
        return this;
    }

    /** 错误次数
     * 
     * @return reqCountError */
    public Integer getReqCountError() {
        return reqCountError;
    }

    public void setReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
    }

    public StatisticsGroup withOutputThroughput(Long outputThroughput) {
        this.outputThroughput = outputThroughput;
        return this;
    }

    /** 下行吞吐量（byte）
     * 
     * @return outputThroughput */
    public Long getOutputThroughput() {
        return outputThroughput;
    }

    public void setOutputThroughput(Long outputThroughput) {
        this.outputThroughput = outputThroughput;
    }

    public StatisticsGroup withInputThroughput(Long inputThroughput) {
        this.inputThroughput = inputThroughput;
        return this;
    }

    /** 上行吞吐量（byte）
     * 
     * @return inputThroughput */
    public Long getInputThroughput() {
        return inputThroughput;
    }

    public void setInputThroughput(Long inputThroughput) {
        this.inputThroughput = inputThroughput;
    }

    public StatisticsGroup withCurrentMinute(Long currentMinute) {
        this.currentMinute = currentMinute;
        return this;
    }

    /** API访问的UTC时间戳
     * 
     * @return currentMinute */
    public Long getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(Long currentMinute) {
        this.currentMinute = currentMinute;
    }

    public StatisticsGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** API分组编号
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public StatisticsGroup withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /** API拥有者
     * 
     * @return provider */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public StatisticsGroup withReqTime(OffsetDateTime reqTime) {
        this.reqTime = reqTime;
        return this;
    }

    /** API请求时间
     * 
     * @return reqTime */
    public OffsetDateTime getReqTime() {
        return reqTime;
    }

    public void setReqTime(OffsetDateTime reqTime) {
        this.reqTime = reqTime;
    }

    public StatisticsGroup withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /** 记录时间
     * 
     * @return registerTime */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticsGroup statisticsGroup = (StatisticsGroup) o;
        return Objects.equals(this.maxLatency, statisticsGroup.maxLatency)
            && Objects.equals(this.avgLatency, statisticsGroup.avgLatency)
            && Objects.equals(this.reqCount, statisticsGroup.reqCount)
            && Objects.equals(this.reqCount2xx, statisticsGroup.reqCount2xx)
            && Objects.equals(this.reqCount4xx, statisticsGroup.reqCount4xx)
            && Objects.equals(this.reqCount5xx, statisticsGroup.reqCount5xx)
            && Objects.equals(this.reqCountError, statisticsGroup.reqCountError)
            && Objects.equals(this.outputThroughput, statisticsGroup.outputThroughput)
            && Objects.equals(this.inputThroughput, statisticsGroup.inputThroughput)
            && Objects.equals(this.currentMinute, statisticsGroup.currentMinute)
            && Objects.equals(this.groupId, statisticsGroup.groupId)
            && Objects.equals(this.provider, statisticsGroup.provider)
            && Objects.equals(this.reqTime, statisticsGroup.reqTime)
            && Objects.equals(this.registerTime, statisticsGroup.registerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxLatency,
            avgLatency,
            reqCount,
            reqCount2xx,
            reqCount4xx,
            reqCount5xx,
            reqCountError,
            outputThroughput,
            inputThroughput,
            currentMinute,
            groupId,
            provider,
            reqTime,
            registerTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticsGroup {\n");
        sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
        sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
        sb.append("    reqCount: ").append(toIndentedString(reqCount)).append("\n");
        sb.append("    reqCount2xx: ").append(toIndentedString(reqCount2xx)).append("\n");
        sb.append("    reqCount4xx: ").append(toIndentedString(reqCount4xx)).append("\n");
        sb.append("    reqCount5xx: ").append(toIndentedString(reqCount5xx)).append("\n");
        sb.append("    reqCountError: ").append(toIndentedString(reqCountError)).append("\n");
        sb.append("    outputThroughput: ").append(toIndentedString(outputThroughput)).append("\n");
        sb.append("    inputThroughput: ").append(toIndentedString(inputThroughput)).append("\n");
        sb.append("    currentMinute: ").append(toIndentedString(currentMinute)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    reqTime: ").append(toIndentedString(reqTime)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
