package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class StartAndStopDeploymentPodRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public StartAndStopDeploymentPodRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 部署ID，可以在部署详情中获取指定ID
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public StartAndStopDeploymentPodRequest withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * 节点ID, 可以在部署详情中获取指定ID
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public StartAndStopDeploymentPodRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作请求，分别为，pause停止，resume启动
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartAndStopDeploymentPodRequest startAndStopDeploymentPodRequest = (StartAndStopDeploymentPodRequest) o;
        return Objects.equals(this.deploymentId, startAndStopDeploymentPodRequest.deploymentId)
            && Objects.equals(this.podId, startAndStopDeploymentPodRequest.podId)
            && Objects.equals(this.action, startAndStopDeploymentPodRequest.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deploymentId, podId, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartAndStopDeploymentPodRequest {\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
