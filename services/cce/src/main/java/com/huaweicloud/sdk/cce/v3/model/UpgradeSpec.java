package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpgradeSpec
 */
public class UpgradeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterUpgradeAction")

    private ClusterUpgradeAction clusterUpgradeAction;

    public UpgradeSpec withClusterUpgradeAction(ClusterUpgradeAction clusterUpgradeAction) {
        this.clusterUpgradeAction = clusterUpgradeAction;
        return this;
    }

    public UpgradeSpec withClusterUpgradeAction(Consumer<ClusterUpgradeAction> clusterUpgradeActionSetter) {
        if (this.clusterUpgradeAction == null) {
            this.clusterUpgradeAction = new ClusterUpgradeAction();
            clusterUpgradeActionSetter.accept(this.clusterUpgradeAction);
        }

        return this;
    }

    /**
     * Get clusterUpgradeAction
     * @return clusterUpgradeAction
     */
    public ClusterUpgradeAction getClusterUpgradeAction() {
        return clusterUpgradeAction;
    }

    public void setClusterUpgradeAction(ClusterUpgradeAction clusterUpgradeAction) {
        this.clusterUpgradeAction = clusterUpgradeAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeSpec that = (UpgradeSpec) obj;
        return Objects.equals(this.clusterUpgradeAction, that.clusterUpgradeAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterUpgradeAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeSpec {\n");
        sb.append("    clusterUpgradeAction: ").append(toIndentedString(clusterUpgradeAction)).append("\n");
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
