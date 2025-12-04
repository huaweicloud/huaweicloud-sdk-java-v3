package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCdnStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Map<String, List<Long>> result = null;

    public ListCdnStatisticsResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 统计起始时间 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListCdnStatisticsResponse withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 采样时间间隔 
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ListCdnStatisticsResponse withResult(Map<String, List<Long>> result) {
        this.result = result;
        return this;
    }

    public ListCdnStatisticsResponse putResultItem(String key, List<Long> resultItem) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        this.result.put(key, resultItem);
        return this;
    }

    public ListCdnStatisticsResponse withResult(Consumer<Map<String, List<Long>>> resultSetter) {
        if (this.result == null) {
            this.result = new HashMap<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * cdn数据查询结果 
     * @return result
     */
    public Map<String, List<Long>> getResult() {
        return result;
    }

    public void setResult(Map<String, List<Long>> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCdnStatisticsResponse that = (ListCdnStatisticsResponse) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, interval, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnStatisticsResponse {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
