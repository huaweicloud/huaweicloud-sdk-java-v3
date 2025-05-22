package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建逻辑集群信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class CreateLogicalClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_rings")

    private List<ClusterRing> clusterRings = null;

    public CreateLogicalClusterInfo withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public CreateLogicalClusterInfo withClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
        return this;
    }

    public CreateLogicalClusterInfo addClusterRingsItem(ClusterRing clusterRingsItem) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        this.clusterRings.add(clusterRingsItem);
        return this;
    }

    public CreateLogicalClusterInfo withClusterRings(Consumer<List<ClusterRing>> clusterRingsSetter) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        clusterRingsSetter.accept(this.clusterRings);
        return this;
    }

    /**
     * **参数解释**： 逻辑集群环信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return clusterRings
     */
    public List<ClusterRing> getClusterRings() {
        return clusterRings;
    }

    public void setClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLogicalClusterInfo that = (CreateLogicalClusterInfo) obj;
        return Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.clusterRings, that.clusterRings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalClusterName, clusterRings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogicalClusterInfo {\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    clusterRings: ").append(toIndentedString(clusterRings)).append("\n");
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
