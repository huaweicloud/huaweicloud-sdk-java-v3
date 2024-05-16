package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SetDeviceControlDefaultValuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_node_id")

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeviceControlDefaultValuesReqDTO body;

    public SetDeviceControlDefaultValuesRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    public SetDeviceControlDefaultValuesRequest withBody(DeviceControlDefaultValuesReqDTO body) {
        this.body = body;
        return this;
    }

    public SetDeviceControlDefaultValuesRequest withBody(Consumer<DeviceControlDefaultValuesReqDTO> bodySetter) {
        if (this.body == null) {
            this.body = new DeviceControlDefaultValuesReqDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeviceControlDefaultValuesReqDTO getBody() {
        return body;
    }

    public void setBody(DeviceControlDefaultValuesReqDTO body) {
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
        SetDeviceControlDefaultValuesRequest that = (SetDeviceControlDefaultValuesRequest) obj;
        return Objects.equals(this.edgeNodeId, that.edgeNodeId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetDeviceControlDefaultValuesRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
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
