package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowNodePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepool_id")

    private String nodepoolId;

    public ShowNodePoolRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowNodePoolRequest withNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }

    /**
     * 节点池ID
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return nodepoolId;
    }

    public void setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNodePoolRequest that = (ShowNodePoolRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.nodepoolId, that.nodepoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodepoolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNodePoolRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodepoolId: ").append(toIndentedString(nodepoolId)).append("\n");
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
