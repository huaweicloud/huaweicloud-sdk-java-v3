package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDeploymentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_delete")

    private String forceDelete;

    public DeleteDeploymentRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public DeleteDeploymentRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 应用部署ID
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public DeleteDeploymentRequest withForceDelete(String forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }

    /**
     * 是否强制删除。默认为false。 如果强制删除，则会忽略边缘节点是否有残留应用，直接删除云端应用。 如果不强制删除，则会等待边缘节点的应用删除成功后，再删除云端应用。
     * @return forceDelete
     */
    public String getForceDelete() {
        return forceDelete;
    }

    public void setForceDelete(String forceDelete) {
        this.forceDelete = forceDelete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDeploymentRequest that = (DeleteDeploymentRequest) obj;
        return Objects.equals(this.iefInstanceId, that.iefInstanceId)
            && Objects.equals(this.deploymentId, that.deploymentId)
            && Objects.equals(this.forceDelete, that.forceDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, deploymentId, forceDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDeploymentRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
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
