package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowNodePoolConfigurationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepool_id")

    private String nodepoolId;

    public ShowNodePoolConfigurationsRequest withClusterId(String clusterId) {
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

    public ShowNodePoolConfigurationsRequest withNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }

    /**
     * **参数解释：** 节点池ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 **约束限制：** 不涉及 **取值范围：** - 节点池ID：修改指定节点池配置管理参数 - master：修改集群配置中心的配置管理参数  **默认取值：** 不涉及
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
        ShowNodePoolConfigurationsRequest that = (ShowNodePoolConfigurationsRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.nodepoolId, that.nodepoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodepoolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNodePoolConfigurationsRequest {\n");
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
