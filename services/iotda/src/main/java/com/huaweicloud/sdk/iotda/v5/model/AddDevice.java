package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.AuthInfo;
import com.huaweicloud.sdk.iotda.v5.model.InitialDesired;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 添加设备结构体。
 */
public class AddDevice  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


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
    
    private AuthInfo authInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_id")
    
    private String gatewayId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extension_info")
    
    private Object extensionInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shadow")
    
    private List<InitialDesired> shadow = null;
    
    public AddDevice withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * **参数说明**：设备ID，用于唯一标识一个设备。如果携带该参数，平台将设备ID设置为该参数值；如果不携带该参数，设备ID由物联网平台分配获得，生成规则为\"product_id\" + \"_\" + \"node_id\"拼接而成。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    public AddDevice withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * **参数说明**：设备标识码，通常使用IMEI、MAC地址或Serial No作为node_id。 设备标识码长度为1到64个字符，包含英文字母、数字、连接号“-”和下划线“_”。 注意：NB设备由于模组烧录信息后无法配置，所以NB设备会校验node_id全局唯一。 **取值范围**：长度不超过64，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public AddDevice withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * **参数说明**：设备名称。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    

    public AddDevice withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * **参数说明**：设备关联的产品ID，用于唯一标识一个产品模型，在管理门户导入产品模型后由平台分配获得。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public AddDevice withAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public AddDevice withAuthInfo(Consumer<AuthInfo> authInfoSetter) {
        if(this.authInfo == null ){
            this.authInfo = new AuthInfo();
            authInfoSetter.accept(this.authInfo);
        }
        
        return this;
    }


    /**
     * Get authInfo
     * @return authInfo
     */
    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    

    public AddDevice withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * **参数说明**：设备的描述信息。 **取值范围**：长度不超过2048，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public AddDevice withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    


    /**
     * **参数说明**：网关ID，用于标识设备所属的父设备，即父设备的设备ID。携带该参数时，表示在该父设备下创建一个子设备，这个子设备不与平台直连，此时必须保证这个父设备在平台已存在，创建成功后子设备的gateway_id等于该参数值；不携带该参数时，表示创建一个和平台直连的设备，创建成功后设备的device_id和gateway_id一致。注意：当前平台最多支持二级子设备。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    

    public AddDevice withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的设备归属到哪个资源空间下，否则创建的设备将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public AddDevice withExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }

    


    /**
     * **参数说明**：设备扩展信息。用户可以自定义任何想要的扩展信息，如果在创建设备时为子设备指定该字段，将会通过MQTT接口“平台通知网关子设备新增“将该信息通知给网关。字段值大小上限为1K。
     * @return extensionInfo
     */
    public Object getExtensionInfo() {
        return extensionInfo;
    }

    public void setExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    

    public AddDevice withShadow(List<InitialDesired> shadow) {
        this.shadow = shadow;
        return this;
    }

    
    public AddDevice addShadowItem(InitialDesired shadowItem) {
        if(this.shadow == null) {
            this.shadow = new ArrayList<>();
        }
        this.shadow.add(shadowItem);
        return this;
    }

    public AddDevice withShadow(Consumer<List<InitialDesired>> shadowSetter) {
        if(this.shadow == null) {
            this.shadow = new ArrayList<>();
        }
        shadowSetter.accept(this.shadow);
        return this;
    }

    /**
     * **参数说明**：设备初始配置。用户使用该字段可以为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。service_id的值和desired内的属性必须是profile中定义的。
     * @return shadow
     */
    public List<InitialDesired> getShadow() {
        return shadow;
    }

    public void setShadow(List<InitialDesired> shadow) {
        this.shadow = shadow;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDevice addDevice = (AddDevice) o;
        return Objects.equals(this.deviceId, addDevice.deviceId) &&
            Objects.equals(this.nodeId, addDevice.nodeId) &&
            Objects.equals(this.deviceName, addDevice.deviceName) &&
            Objects.equals(this.productId, addDevice.productId) &&
            Objects.equals(this.authInfo, addDevice.authInfo) &&
            Objects.equals(this.description, addDevice.description) &&
            Objects.equals(this.gatewayId, addDevice.gatewayId) &&
            Objects.equals(this.appId, addDevice.appId) &&
            Objects.equals(this.extensionInfo, addDevice.extensionInfo) &&
            Objects.equals(this.shadow, addDevice.shadow);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceId, nodeId, deviceName, productId, authInfo, description, gatewayId, appId, extensionInfo, shadow);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDevice {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    extensionInfo: ").append(toIndentedString(extensionInfo)).append("\n");
        sb.append("    shadow: ").append(toIndentedString(shadow)).append("\n");
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

