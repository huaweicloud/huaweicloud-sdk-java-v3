package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateAccessCodeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    
    private String deviceId;

    public CreateAccessCodeRequest withEdgeNodeId(String edgeNodeId) {
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

    

    public CreateAccessCodeRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 设备ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAccessCodeRequest createAccessCodeRequest = (CreateAccessCodeRequest) o;
        return Objects.equals(this.edgeNodeId, createAccessCodeRequest.edgeNodeId) &&
            Objects.equals(this.deviceId, createAccessCodeRequest.deviceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, deviceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessCodeRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

