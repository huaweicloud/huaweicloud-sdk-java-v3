package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEnhancedConnectionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListEnhancedConnectionsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询最大连接个数，默认100。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListEnhancedConnectionsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询结果偏移量，默认为0（连接以创建时间进行排序）
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListEnhancedConnectionsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 连接状态，包括以下两种状态： ACTIVE：已激活 DELETED：已删除
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListEnhancedConnectionsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnhancedConnectionsRequest listEnhancedConnectionsRequest = (ListEnhancedConnectionsRequest) o;
        return Objects.equals(this.limit, listEnhancedConnectionsRequest.limit)
            && Objects.equals(this.offset, listEnhancedConnectionsRequest.offset)
            && Objects.equals(this.status, listEnhancedConnectionsRequest.status)
            && Objects.equals(this.name, listEnhancedConnectionsRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, status, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnhancedConnectionsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
