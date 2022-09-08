package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateEdgeNodeDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_connector")

    private Boolean deleteConnector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_connector")

    private Boolean deployConnector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_devices")

    private NodeDevice updateDevices;

    public UpdateEdgeNodeDeviceResponse withDeleteConnector(Boolean deleteConnector) {
        this.deleteConnector = deleteConnector;
        return this;
    }

    /**
     * 工业终端设备预留字段
     * @return deleteConnector
     */
    public Boolean getDeleteConnector() {
        return deleteConnector;
    }

    public void setDeleteConnector(Boolean deleteConnector) {
        this.deleteConnector = deleteConnector;
    }

    public UpdateEdgeNodeDeviceResponse withDeployConnector(Boolean deployConnector) {
        this.deployConnector = deployConnector;
        return this;
    }

    /**
     * 工业终端设备预留字段
     * @return deployConnector
     */
    public Boolean getDeployConnector() {
        return deployConnector;
    }

    public void setDeployConnector(Boolean deployConnector) {
        this.deployConnector = deployConnector;
    }

    public UpdateEdgeNodeDeviceResponse withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 工业终端设备预留字段
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public UpdateEdgeNodeDeviceResponse withUpdateDevices(NodeDevice updateDevices) {
        this.updateDevices = updateDevices;
        return this;
    }

    public UpdateEdgeNodeDeviceResponse withUpdateDevices(Consumer<NodeDevice> updateDevicesSetter) {
        if (this.updateDevices == null) {
            this.updateDevices = new NodeDevice();
            updateDevicesSetter.accept(this.updateDevices);
        }

        return this;
    }

    /**
     * Get updateDevices
     * @return updateDevices
     */
    public NodeDevice getUpdateDevices() {
        return updateDevices;
    }

    public void setUpdateDevices(NodeDevice updateDevices) {
        this.updateDevices = updateDevices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEdgeNodeDeviceResponse updateEdgeNodeDeviceResponse = (UpdateEdgeNodeDeviceResponse) o;
        return Objects.equals(this.deleteConnector, updateEdgeNodeDeviceResponse.deleteConnector)
            && Objects.equals(this.deployConnector, updateEdgeNodeDeviceResponse.deployConnector)
            && Objects.equals(this.deploymentId, updateEdgeNodeDeviceResponse.deploymentId)
            && Objects.equals(this.updateDevices, updateEdgeNodeDeviceResponse.updateDevices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteConnector, deployConnector, deploymentId, updateDevices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeNodeDeviceResponse {\n");
        sb.append("    deleteConnector: ").append(toIndentedString(deleteConnector)).append("\n");
        sb.append("    deployConnector: ").append(toIndentedString(deployConnector)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    updateDevices: ").append(toIndentedString(updateDevices)).append("\n");
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
