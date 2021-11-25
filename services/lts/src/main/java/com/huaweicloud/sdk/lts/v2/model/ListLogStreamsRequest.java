package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListLogStreamsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    public ListLogStreamsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /** 日志组名称
     * 
     * @return logGroupName */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public ListLogStreamsRequest withLogStreamName(String logStreamName) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogStreamsRequest listLogStreamsRequest = (ListLogStreamsRequest) o;
        return Objects.equals(this.logGroupName, listLogStreamsRequest.logGroupName)
            && Objects.equals(this.logStreamName, listLogStreamsRequest.logStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupName, logStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogStreamsRequest {\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
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
