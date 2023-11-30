package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAppRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_app_name")

    private String startAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    public ListAppRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次请求返回APP列表的最大数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAppRequest withStartAppName(String startAppName) {
        this.startAppName = startAppName;
        return this;
    }

    /**
     * 从该app名称开始返回app列表，返回的app列表不包括此app名称。
     * @return startAppName
     */
    public String getStartAppName() {
        return startAppName;
    }

    public void setStartAppName(String startAppName) {
        this.startAppName = startAppName;
    }

    public ListAppRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 返回该通道下的app列表。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppRequest that = (ListAppRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.startAppName, that.startAppName)
            && Objects.equals(this.streamName, that.streamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, startAppName, streamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startAppName: ").append(toIndentedString(startAppName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
