package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOpenApiCalledRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "called_url")

    private String calledUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ShowOpenApiCalledRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小，默认1000，最大2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowOpenApiCalledRecordsRequest withCalledUrl(String calledUrl) {
        this.calledUrl = calledUrl;
        return this;
    }

    /**
     * 需要查询调用记录的URL，例如：/v1/{project_id}/sdg/database/watermark/embed。
     * @return calledUrl
     */
    public String getCalledUrl() {
        return calledUrl;
    }

    public void setCalledUrl(String calledUrl) {
        this.calledUrl = calledUrl;
    }

    public ShowOpenApiCalledRecordsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（Unix timestamp），单位：毫秒，例如：0
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowOpenApiCalledRecordsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间（Unix timestamp），单位：毫秒，例如：1638515803572
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowOpenApiCalledRecordsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 指定一个标识符。获取第一页时不用赋值，获取下一页时取上页查询结果的返回值。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOpenApiCalledRecordsRequest showOpenApiCalledRecordsRequest = (ShowOpenApiCalledRecordsRequest) o;
        return Objects.equals(this.limit, showOpenApiCalledRecordsRequest.limit)
            && Objects.equals(this.calledUrl, showOpenApiCalledRecordsRequest.calledUrl)
            && Objects.equals(this.startTime, showOpenApiCalledRecordsRequest.startTime)
            && Objects.equals(this.endTime, showOpenApiCalledRecordsRequest.endTime)
            && Objects.equals(this.marker, showOpenApiCalledRecordsRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, calledUrl, startTime, endTime, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpenApiCalledRecordsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    calledUrl: ").append(toIndentedString(calledUrl)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
