package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 设备信息
 */
public class QueryDeviceSimplifyDto  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_id")
    
    
    private String gatewayId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_type")
    
    
    private String protocolType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    
    private String productId;

    public QueryDeviceSimplifyDto withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 设备id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    public QueryDeviceSimplifyDto withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 设备识别码
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public QueryDeviceSimplifyDto withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    


    /**
     * 父设备id
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    

    public QueryDeviceSimplifyDto withDeviceName(String deviceName) {
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

    

    public QueryDeviceSimplifyDto withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    


    /**
     * 设备协议类型
     * @return protocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    

    public QueryDeviceSimplifyDto withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * 产品名称
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    

    public QueryDeviceSimplifyDto withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDeviceSimplifyDto queryDeviceSimplifyDto = (QueryDeviceSimplifyDto) o;
        return Objects.equals(this.deviceId, queryDeviceSimplifyDto.deviceId) &&
            Objects.equals(this.nodeId, queryDeviceSimplifyDto.nodeId) &&
            Objects.equals(this.gatewayId, queryDeviceSimplifyDto.gatewayId) &&
            Objects.equals(this.deviceName, queryDeviceSimplifyDto.deviceName) &&
            Objects.equals(this.protocolType, queryDeviceSimplifyDto.protocolType) &&
            Objects.equals(this.productName, queryDeviceSimplifyDto.productName) &&
            Objects.equals(this.productId, queryDeviceSimplifyDto.productId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceId, nodeId, gatewayId, deviceName, protocolType, productName, productId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDeviceSimplifyDto {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

