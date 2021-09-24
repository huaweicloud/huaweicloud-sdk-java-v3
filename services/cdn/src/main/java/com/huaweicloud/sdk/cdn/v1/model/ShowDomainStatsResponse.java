package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowDomainStatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Map<String, Object> result = null;

    public ShowDomainStatsResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 数据起始时间戳，可能不返回
     * 
     * @return startTime */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainStatsResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 数据结束时间戳，可能不返回
     * 
     * @return endTime */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowDomainStatsResponse withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /** 查询间隔，可能不返回
     * 
     * @return interval */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public ShowDomainStatsResponse withAction(String action) {
        this.action = action;
        return this;
    }

    /** 查询类型，可能不返回
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShowDomainStatsResponse withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /** 指标类型，可能不返回
     * 
     * @return statType */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ShowDomainStatsResponse withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** 分组类型，可能不返回
     * 
     * @return groupBy */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ShowDomainStatsResponse withResult(Map<String, Object> result) {
        this.result = result;
        return this;
    }

    public ShowDomainStatsResponse putResultItem(String key, Object resultItem) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        this.result.put(key, resultItem);
        return this;
    }

    public ShowDomainStatsResponse withResult(Consumer<Map<String, Object>> resultSetter) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /** 返回数据体
     * 
     * @return result */
    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainStatsResponse showDomainStatsResponse = (ShowDomainStatsResponse) o;
        return Objects.equals(this.startTime, showDomainStatsResponse.startTime)
            && Objects.equals(this.endTime, showDomainStatsResponse.endTime)
            && Objects.equals(this.interval, showDomainStatsResponse.interval)
            && Objects.equals(this.action, showDomainStatsResponse.action)
            && Objects.equals(this.statType, showDomainStatsResponse.statType)
            && Objects.equals(this.groupBy, showDomainStatsResponse.groupBy)
            && Objects.equals(this.result, showDomainStatsResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, interval, action, statType, groupBy, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainStatsResponse {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
