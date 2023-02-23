package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.EdgeDeviceAuthInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 添加设备结构体。
 */
public class AddDeviceRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_info")
    

    private EdgeDeviceAuthInfo authInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_id")
    

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    

    private String spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extension_info")
    

    private Object extensionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config")
    

    private Object config;

    public AddDeviceRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 设备标识码，通常使用IMEI、MAC地址或Serial No作为node_id。（注意:NB设备由于模组烧录信息后无法配置，所以NB设备会校验node_id全局唯一。）
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public AddDeviceRequestBody withDeviceName(String deviceName) {
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

    

    public AddDeviceRequestBody withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 设备关联的产品ID，用于唯一标识一个产品模型，在管理门户导入产品模型后由平台分配获得。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public AddDeviceRequestBody withAuthInfo(EdgeDeviceAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public AddDeviceRequestBody withAuthInfo(Consumer<EdgeDeviceAuthInfo> authInfoSetter) {
        if(this.authInfo == null ){
            this.authInfo = new EdgeDeviceAuthInfo();
            authInfoSetter.accept(this.authInfo);
        }
        
        return this;
    }


    /**
     * Get authInfo
     * @return authInfo
     */
    public EdgeDeviceAuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(EdgeDeviceAuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    

    public AddDeviceRequestBody withDescription(String description) {
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

    

    public AddDeviceRequestBody withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    


    /**
     * 父设备ID，用于标识设备所属的父设备。创建网关直连设备时，不携带该参数；在网关直连设备下创建子设备时，携带该参数，参数值为父设备ID。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    

    public AddDeviceRequestBody withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    


    /**
     * 资源空间Id。此参数为非必选参数，用于兼容平台老用户存在多应用的场景。存在多应用的用户需要使用该接口时，必须携带该参数指定注册的设备归属到哪个应用下，否则接口会提示错误。如果用户存在多应用，同时又不想携带该参数，可以联系华为技术支持对用户数据做应用合并。
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    

    public AddDeviceRequestBody withExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }

    


    /**
     * 设备扩展信息。用户可以自定义任何想要的扩展信息，如果在创建设备时为子设备指定该字段，将会通过MQTT接口“平台通知网关子设备新增“将该信息通知给网关。字段值大小上限为1K。 追加：如果通过EdgeHub, EdgeAccess进行设备接入，不需要携带extension_info；如果通过用户自定义的应用进行边缘设备接入，则携带模块id参数作为extension_info, 例如：{\\\"module_id\":\\\"user_xxx\"}
     * @return extensionInfo
     */
    public Object getExtensionInfo() {
        return extensionInfo;
    }

    public void setExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    

    public AddDeviceRequestBody withConfig(Object config) {
        this.config = config;
        return this;
    }

    


    /**
     * 设备初始配置。用户使用该字段可以为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以设置的属性值为准写入到设备配置中。例如连接MQTT设备，配置接入平台密码，携带该参数{\\\"password\":\\\"xxxxxxxx\"}
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDeviceRequestBody addDeviceRequestBody = (AddDeviceRequestBody) o;
        return Objects.equals(this.nodeId, addDeviceRequestBody.nodeId) &&
            Objects.equals(this.deviceName, addDeviceRequestBody.deviceName) &&
            Objects.equals(this.productId, addDeviceRequestBody.productId) &&
            Objects.equals(this.authInfo, addDeviceRequestBody.authInfo) &&
            Objects.equals(this.description, addDeviceRequestBody.description) &&
            Objects.equals(this.gatewayId, addDeviceRequestBody.gatewayId) &&
            Objects.equals(this.spaceId, addDeviceRequestBody.spaceId) &&
            Objects.equals(this.extensionInfo, addDeviceRequestBody.extensionInfo) &&
            Objects.equals(this.config, addDeviceRequestBody.config);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, deviceName, productId, authInfo, description, gatewayId, spaceId, extensionInfo, config);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDeviceRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    extensionInfo: ").append(toIndentedString(extensionInfo)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

