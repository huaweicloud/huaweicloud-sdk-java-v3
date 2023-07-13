package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 升级任务元数据
 */
public class UpgradeResponseSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterUpgradeAction")

    private ClusterUpgradeResponseAction clusterUpgradeAction;

    public UpgradeResponseSpec withClusterUpgradeAction(ClusterUpgradeResponseAction clusterUpgradeAction) {
        this.clusterUpgradeAction = clusterUpgradeAction;
        return this;
    }

    public UpgradeResponseSpec withClusterUpgradeAction(
        Consumer<ClusterUpgradeResponseAction> clusterUpgradeActionSetter) {
        if (this.clusterUpgradeAction == null) {
            this.clusterUpgradeAction = new ClusterUpgradeResponseAction();
            clusterUpgradeActionSetter.accept(this.clusterUpgradeAction);
        }

        return this;
    }

    /**
     * Get clusterUpgradeAction
     * @return clusterUpgradeAction
     */
    public ClusterUpgradeResponseAction getClusterUpgradeAction() {
        return clusterUpgradeAction;
    }

    public void setClusterUpgradeAction(ClusterUpgradeResponseAction clusterUpgradeAction) {
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
        UpgradeResponseSpec that = (UpgradeResponseSpec) obj;
        return Objects.equals(this.clusterUpgradeAction, that.clusterUpgradeAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterUpgradeAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeResponseSpec {\n");
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
