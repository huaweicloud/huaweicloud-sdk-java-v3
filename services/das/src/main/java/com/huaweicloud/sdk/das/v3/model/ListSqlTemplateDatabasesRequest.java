package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSqlTemplateDatabasesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public ListSqlTemplateDatabasesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，实例的唯一标识
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSqlTemplateDatabasesRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListSqlTemplateDatabasesRequest withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间，Unix timestamp，单位：毫秒
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ListSqlTemplateDatabasesRequest withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间，Unix timestamp，单位：毫秒
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ListSqlTemplateDatabasesRequest withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作类型，可组合，用逗号分隔
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ListSqlTemplateDatabasesRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListSqlTemplateDatabasesRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序字段，取值范围：executeNum（执行次数）、totalCost（总耗时）、avgCost（平均耗时）、totalScan（总扫描行数）、avgScan（平均扫描行数）
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListSqlTemplateDatabasesRequest withAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    /**
     * 排序顺序，true（正序）、false（逆序）
     * @return asc
     */
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public ListSqlTemplateDatabasesRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 数量，默认30
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlTemplateDatabasesRequest that = (ListSqlTemplateDatabasesRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.startAt, that.startAt) && Objects.equals(this.endAt, that.endAt)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.asc, that.asc)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, nodeId, startAt, endAt, operation, keyword, sort, asc, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlTemplateDatabasesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
