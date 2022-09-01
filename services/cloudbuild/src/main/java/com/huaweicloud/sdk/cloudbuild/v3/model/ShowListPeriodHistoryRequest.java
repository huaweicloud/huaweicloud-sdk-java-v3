package com.huaweicloud.sdk.cloudbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowListPeriodHistoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    public ShowListPeriodHistoryRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 构建的任务ID [获取项目下构建任务列表](https://support.huaweicloud.com/api-codeci/ShowJobListByProjectId.html)； 编辑构建任务时，浏览器URL末尾的32位数字、字母组合的字符串。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowListPeriodHistoryRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页页码， 表示从此页开始查询， offset大于等于0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowListPeriodHistoryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，limit小于等于100
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowListPeriodHistoryRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 区间开始时间，格式yyyy-MM-dd。 开始时间和结束时间间隔不能超过30天
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowListPeriodHistoryRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 区间结束时间，格式yyyy-MM-dd。 开始时间和结束时间间隔不能超过30天
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowListPeriodHistoryRequest showListPeriodHistoryRequest = (ShowListPeriodHistoryRequest) o;
        return Objects.equals(this.jobId, showListPeriodHistoryRequest.jobId)
            && Objects.equals(this.offset, showListPeriodHistoryRequest.offset)
            && Objects.equals(this.limit, showListPeriodHistoryRequest.limit)
            && Objects.equals(this.startTime, showListPeriodHistoryRequest.startTime)
            && Objects.equals(this.endTime, showListPeriodHistoryRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, offset, limit, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowListPeriodHistoryRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
