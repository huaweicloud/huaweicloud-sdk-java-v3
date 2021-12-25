package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateNodeByDeviceIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_nodes")

    private NodeUpdateByDevice updateNodes;

    public UpdateNodeByDeviceIdResponse withUpdateNodes(NodeUpdateByDevice updateNodes) {
        this.updateNodes = updateNodes;
        return this;
    }

    public UpdateNodeByDeviceIdResponse withUpdateNodes(Consumer<NodeUpdateByDevice> updateNodesSetter) {
        if (this.updateNodes == null) {
            this.updateNodes = new NodeUpdateByDevice();
            updateNodesSetter.accept(this.updateNodes);
        }

        return this;
    }

    /** Get updateNodes
     * 
     * @return updateNodes */
    public NodeUpdateByDevice getUpdateNodes() {
        return updateNodes;
    }

    public void setUpdateNodes(NodeUpdateByDevice updateNodes) {
        this.updateNodes = updateNodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNodeByDeviceIdResponse updateNodeByDeviceIdResponse = (UpdateNodeByDeviceIdResponse) o;
        return Objects.equals(this.updateNodes, updateNodeByDeviceIdResponse.updateNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeByDeviceIdResponse {\n");
        sb.append("    updateNodes: ").append(toIndentedString(updateNodes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
