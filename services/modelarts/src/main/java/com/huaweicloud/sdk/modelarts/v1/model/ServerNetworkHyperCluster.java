package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：创建服务器的参数面网络信息。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class ServerNetworkHyperCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyper_cluster_subnet_id")

    private String hyperClusterSubnetId;

    public ServerNetworkHyperCluster withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释：HyperCluster的id。 约束限制：不涉及。 取值范围：不涉及。 默认取值：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerNetworkHyperCluster withHyperClusterSubnetId(String hyperClusterSubnetId) {
        this.hyperClusterSubnetId = hyperClusterSubnetId;
        return this;
    }

    /**
     * 参数解释：HyperCluster的子网id。 约束限制：不涉及。 取值范围：不涉及。 默认取值：不涉及。
     * @return hyperClusterSubnetId
     */
    public String getHyperClusterSubnetId() {
        return hyperClusterSubnetId;
    }

    public void setHyperClusterSubnetId(String hyperClusterSubnetId) {
        this.hyperClusterSubnetId = hyperClusterSubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerNetworkHyperCluster that = (ServerNetworkHyperCluster) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hyperClusterSubnetId, that.hyperClusterSubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hyperClusterSubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerNetworkHyperCluster {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hyperClusterSubnetId: ").append(toIndentedString(hyperClusterSubnetId)).append("\n");
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
