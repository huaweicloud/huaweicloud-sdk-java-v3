package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** TopUrlSummary */
public class TopUrlSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    public TopUrlSummary withUrl(String url) {
        this.url = url;
        return this;
    }

    /** URL名称。
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TopUrlSummary withValue(Long value) {
        this.value = value;
        return this;
    }

    /** 对应查询类型的值。（流量单位：Byte）
     * 
     * @return value */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public TopUrlSummary withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 查询起始时间戳。
     * 
     * @return startTime */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public TopUrlSummary withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 查询结束时间戳
     * 
     * @return endTime */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public TopUrlSummary withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /** 参数类型支持：flux(流量)，req_num(请求总数)。
     * 
     * @return statType */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopUrlSummary topUrlSummary = (TopUrlSummary) o;
        return Objects.equals(this.url, topUrlSummary.url) && Objects.equals(this.value, topUrlSummary.value)
            && Objects.equals(this.startTime, topUrlSummary.startTime)
            && Objects.equals(this.endTime, topUrlSummary.endTime)
            && Objects.equals(this.statType, topUrlSummary.statType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, value, startTime, endTime, statType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopUrlSummary {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
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
