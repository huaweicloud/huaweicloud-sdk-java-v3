package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class RestartLogicalClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_id")

    private String logicalClusterId;

    public RestartLogicalClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方式方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RestartLogicalClusterRequest withLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
        return this;
    }

    /**
     * **参数解释**： 待重启的逻辑集群的ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return logicalClusterId
     */
    public String getLogicalClusterId() {
        return logicalClusterId;
    }

    public void setLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartLogicalClusterRequest that = (RestartLogicalClusterRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.logicalClusterId, that.logicalClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, logicalClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartLogicalClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    logicalClusterId: ").append(toIndentedString(logicalClusterId)).append("\n");
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
