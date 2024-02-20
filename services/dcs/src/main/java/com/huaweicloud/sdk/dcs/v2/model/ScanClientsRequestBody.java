package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScanClientsRequestBody
 */
public class ScanClientsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_cache")

    private Boolean cleanCache;

    public ScanClientsRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ScanClientsRequestBody withCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
        return this;
    }

    /**
     * 是否重新查询并保存会话列表
     * @return cleanCache
     */
    public Boolean getCleanCache() {
        return cleanCache;
    }

    public void setCleanCache(Boolean cleanCache) {
        this.cleanCache = cleanCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanClientsRequestBody that = (ScanClientsRequestBody) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.cleanCache, that.cleanCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, cleanCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanClientsRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    cleanCache: ").append(toIndentedString(cleanCache)).append("\n");
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
