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
public class ListDevicesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_id")
    
    
    private String gatewayId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;

    public ListDevicesRequest withEdgeNodeId(String edgeNodeId) {
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

    

    public ListDevicesRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    


    /**
     * 父设备ID,对应之前的gatewayId的概念，传该参数时代表查询网关下的子设备，不传代表节点下的
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    

    public ListDevicesRequest withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * 设备名称
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    

    public ListDevicesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListDevicesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页记录数，默认值为10，取值区间为1-1000
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDevicesRequest listDevicesRequest = (ListDevicesRequest) o;
        return Objects.equals(this.edgeNodeId, listDevicesRequest.edgeNodeId) &&
            Objects.equals(this.gatewayId, listDevicesRequest.gatewayId) &&
            Objects.equals(this.deviceName, listDevicesRequest.deviceName) &&
            Objects.equals(this.offset, listDevicesRequest.offset) &&
            Objects.equals(this.limit, listDevicesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, gatewayId, deviceName, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevicesRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

