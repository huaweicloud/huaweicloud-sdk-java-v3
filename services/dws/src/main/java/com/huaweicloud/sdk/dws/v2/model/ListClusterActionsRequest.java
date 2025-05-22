package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListClusterActionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private String actionName;

    public ListClusterActionsRequest withClusterId(String clusterId) {
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

    public ListClusterActionsRequest withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * **参数解释**： 任务名称。当前仅部分任务在操作中阶段支持查看任务详情。 **约束限制**： 不涉及。 **取值范围**： GROWING、RESIZE_FAILURE、RESTORING、RESTORING_FAILED、SNAPSHOTTING、SNAPSHOTTING_FAILED、FINE_GRAINED_RESTORING、FINE_GRAINED_RESTORING_FAILED **默认取值**： 不涉及。
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterActionsRequest that = (ListClusterActionsRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.actionName, that.actionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, actionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterActionsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
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
