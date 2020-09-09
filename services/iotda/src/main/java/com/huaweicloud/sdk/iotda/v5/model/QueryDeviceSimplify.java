package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.TagV5DTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 设备信息结构体，批量查询返回。
 */
public class QueryDeviceSimplify  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


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
    @JsonProperty(value="node_type")
    
    private String nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fw_version")
    
    private String fwVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sw_version")
    
    private String swVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagV5DTO> tags = null;
    
    public QueryDeviceSimplify withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 资源空间ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public QueryDeviceSimplify withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 资源空间名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public QueryDeviceSimplify withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 设备ID，用于唯一标识一个设备。在注册设备时直接指定，或者由物联网平台分配获得。由物联网平台分配时，生成规则为\"product_id\" + \"_\" + \"node_id\"拼接而成。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public QueryDeviceSimplify withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 设备标识码，通常使用IMEI、MAC地址或Serial No作为nodeId。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public QueryDeviceSimplify withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    


    /**
     * 网关ID，用于标识设备所属的父设备，即父设备的设备ID。当设备是直连设备时，gateway_id与设备的device_id一致。当设备是非直连设备时，gateway_id为设备所关联的父设备的device_id。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public QueryDeviceSimplify withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * 设备名称。
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public QueryDeviceSimplify withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * 设备节点类型。 - ENDPOINT：非直连设备。 - GATEWAY：直连设备或网关。 - UNKNOWN：未知。 
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public QueryDeviceSimplify withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 设备的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryDeviceSimplify withFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
        return this;
    }

    


    /**
     * 设备的固件版本。
     * @return fwVersion
     */
    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public QueryDeviceSimplify withSwVersion(String swVersion) {
        this.swVersion = swVersion;
        return this;
    }

    


    /**
     * 设备的软件版本。
     * @return swVersion
     */
    public String getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(String swVersion) {
        this.swVersion = swVersion;
    }

    public QueryDeviceSimplify withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 设备关联的产品ID，用于唯一标识一个产品模型。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public QueryDeviceSimplify withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * 设备关联的产品名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public QueryDeviceSimplify withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 设备的状态。 - ONLINE：设备在线。 - OFFLINE：设备离线。 - ABNORMAL：设备异常。 - INACTIVE：设备未激活。 - FREEZED：设备冻结。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QueryDeviceSimplify withTags(List<TagV5DTO> tags) {
        this.tags = tags;
        return this;
    }

    
    public QueryDeviceSimplify addTagsItem(TagV5DTO tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QueryDeviceSimplify withTags(Consumer<List<TagV5DTO>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 设备的标签列表。
     * @return tags
     */
    public List<TagV5DTO> getTags() {
        return tags;
    }

    public void setTags(List<TagV5DTO> tags) {
        this.tags = tags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDeviceSimplify queryDeviceSimplify = (QueryDeviceSimplify) o;
        return Objects.equals(this.appId, queryDeviceSimplify.appId) &&
            Objects.equals(this.appName, queryDeviceSimplify.appName) &&
            Objects.equals(this.deviceId, queryDeviceSimplify.deviceId) &&
            Objects.equals(this.nodeId, queryDeviceSimplify.nodeId) &&
            Objects.equals(this.gatewayId, queryDeviceSimplify.gatewayId) &&
            Objects.equals(this.deviceName, queryDeviceSimplify.deviceName) &&
            Objects.equals(this.nodeType, queryDeviceSimplify.nodeType) &&
            Objects.equals(this.description, queryDeviceSimplify.description) &&
            Objects.equals(this.fwVersion, queryDeviceSimplify.fwVersion) &&
            Objects.equals(this.swVersion, queryDeviceSimplify.swVersion) &&
            Objects.equals(this.productId, queryDeviceSimplify.productId) &&
            Objects.equals(this.productName, queryDeviceSimplify.productName) &&
            Objects.equals(this.status, queryDeviceSimplify.status) &&
            Objects.equals(this.tags, queryDeviceSimplify.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, deviceId, nodeId, gatewayId, deviceName, nodeType, description, fwVersion, swVersion, productId, productName, status, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDeviceSimplify {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
        sb.append("    swVersion: ").append(toIndentedString(swVersion)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

