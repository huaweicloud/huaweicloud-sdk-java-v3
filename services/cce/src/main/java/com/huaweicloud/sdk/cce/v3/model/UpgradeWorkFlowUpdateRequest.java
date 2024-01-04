package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpgradeWorkFlowUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_workflow_id")

    private String upgradeWorkflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpgradeWorkFlowUpdateRequestBody body;

    public UpgradeWorkFlowUpdateRequest withClusterId(String clusterId) {
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

    public UpgradeWorkFlowUpdateRequest withUpgradeWorkflowId(String upgradeWorkflowId) {
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

    public UpgradeWorkFlowUpdateRequest withBody(UpgradeWorkFlowUpdateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpgradeWorkFlowUpdateRequest withBody(Consumer<UpgradeWorkFlowUpdateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpgradeWorkFlowUpdateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpgradeWorkFlowUpdateRequestBody getBody() {
        return body;
    }

    public void setBody(UpgradeWorkFlowUpdateRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeWorkFlowUpdateRequest that = (UpgradeWorkFlowUpdateRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.upgradeWorkflowId, that.upgradeWorkflowId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, upgradeWorkflowId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeWorkFlowUpdateRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    upgradeWorkflowId: ").append(toIndentedString(upgradeWorkflowId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
