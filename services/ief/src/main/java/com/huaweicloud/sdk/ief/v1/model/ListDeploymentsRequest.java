package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDeploymentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public ListDeploymentsRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public ListDeploymentsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，最大100，默认值10
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListDeploymentsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的起始位置，默认值0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListDeploymentsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 查询结果排序，如按照创建时间降序排序为created_at:desc，升序排序为created_at:asc
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListDeploymentsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * deployment名称（支持模糊匹配）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDeploymentsRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，查询部署在该节点下的应用列表，和group_id不可同时请求
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListDeploymentsRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 节点组ID，查询部署在该节点组的应用列表，和node_id不可同时请求
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeploymentsRequest listDeploymentsRequest = (ListDeploymentsRequest) o;
        return Objects.equals(this.iefInstanceId, listDeploymentsRequest.iefInstanceId)
            && Objects.equals(this.limit, listDeploymentsRequest.limit)
            && Objects.equals(this.offset, listDeploymentsRequest.offset)
            && Objects.equals(this.sort, listDeploymentsRequest.sort)
            && Objects.equals(this.name, listDeploymentsRequest.name)
            && Objects.equals(this.nodeId, listDeploymentsRequest.nodeId)
            && Objects.equals(this.groupId, listDeploymentsRequest.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, limit, offset, sort, name, nodeId, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeploymentsRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
