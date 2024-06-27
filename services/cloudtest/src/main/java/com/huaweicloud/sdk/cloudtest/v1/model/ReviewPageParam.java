package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReviewPageParam
 */
public class ReviewPageParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private String deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_id")

    private String mindmapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_value")

    private String nodeValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ReviewPageParam withDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     */
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public ReviewPageParam withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，最大支持200条
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ReviewPageParam withMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
        return this;
    }

    /**
     * Get mindmapId
     * @return mindmapId
     */
    public String getMindmapId() {
        return mindmapId;
    }

    public void setMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
    }

    public ReviewPageParam withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ReviewPageParam withNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
        return this;
    }

    /**
     * Get nodeValue
     * @return nodeValue
     */
    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public ReviewPageParam withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始偏移量，表示从此偏移量开始查询，offset大于等于0，小于等于100000
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ReviewPageParam withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReviewPageParam withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewPageParam that = (ReviewPageParam) obj;
        return Objects.equals(this.deleted, that.deleted) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.mindmapId, that.mindmapId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeValue, that.nodeValue) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleted, limit, mindmapId, nodeId, nodeValue, offset, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewPageParam {\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    mindmapId: ").append(toIndentedString(mindmapId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeValue: ").append(toIndentedString(nodeValue)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
