package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListStreamsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_stream_name")

    private String startStreamName;

    public ListStreamsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次请求返回通道列表的最大数量。
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

    public ListStreamsRequest withStartStreamName(String startStreamName) {
        this.startStreamName = startStreamName;
        return this;
    }

    /**
     * 从该通道开始返回通道列表，返回的通道列表不包括此通道名称。  如果需要分页查询，第一页查询时不传该字段。返回结果has_more_streams为true时，进行下一页查询，start_stream_name传入第一页查询结果的最后一条通道名称。
     * @return startStreamName
     */
    public String getStartStreamName() {
        return startStreamName;
    }

    public void setStartStreamName(String startStreamName) {
        this.startStreamName = startStreamName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStreamsRequest that = (ListStreamsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.startStreamName, that.startStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, startStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStreamsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startStreamName: ").append(toIndentedString(startStreamName)).append("\n");
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
