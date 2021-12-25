package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 返回的日志流信息 */
public class LogStream {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private Long creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_count")

    private Integer filterCount;

    public LogStream withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** 创建时间
     * 
     * @return creationTime */
    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public LogStream withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /** 日志流名称
     * 
     * @return logStreamName */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public LogStream withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /** 日志流ID
     * 
     * @return logStreamId */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public LogStream withFilterCount(Integer filterCount) {
        this.filterCount = filterCount;
        return this;
    }

    /** 过滤器个数 minimum: 0 maximum: 5
     * 
     * @return filterCount */
    public Integer getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(Integer filterCount) {
        this.filterCount = filterCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogStream logStream = (LogStream) o;
        return Objects.equals(this.creationTime, logStream.creationTime)
            && Objects.equals(this.logStreamName, logStream.logStreamName)
            && Objects.equals(this.logStreamId, logStream.logStreamId)
            && Objects.equals(this.filterCount, logStream.filterCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime, logStreamName, logStreamId, filterCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogStream {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    filterCount: ").append(toIndentedString(filterCount)).append("\n");
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
