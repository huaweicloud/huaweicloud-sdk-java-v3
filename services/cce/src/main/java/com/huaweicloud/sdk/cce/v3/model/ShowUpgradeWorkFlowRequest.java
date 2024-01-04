package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowUpgradeWorkFlowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_workflow_id")

    private String upgradeWorkflowId;

    public ShowUpgradeWorkFlowRequest withClusterId(String clusterId) {
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

    public ShowUpgradeWorkFlowRequest withUpgradeWorkflowId(String upgradeWorkflowId) {
        this.upgradeWorkflowId = upgradeWorkflowId;
        return this;
    }

    /**
     * 集群升级任务引导流程ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return upgradeWorkflowId
     */
    public String getUpgradeWorkflowId() {
        return upgradeWorkflowId;
    }

    public void setUpgradeWorkflowId(String upgradeWorkflowId) {
        this.upgradeWorkflowId = upgradeWorkflowId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUpgradeWorkFlowRequest that = (ShowUpgradeWorkFlowRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.upgradeWorkflowId, that.upgradeWorkflowId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, upgradeWorkflowId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUpgradeWorkFlowRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    upgradeWorkflowId: ").append(toIndentedString(upgradeWorkflowId)).append("\n");
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
