package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_version")

    private String fwVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sw_version")

    private String swVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_sdk_version")

    private String deviceSdkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    private AuthInfoRes authInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_status_update_time")

    private String connectionStatusUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_time")

    private String activeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagV5DTO> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<ModuleDTO> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_info")

    private Object extensionInfo;

    public UpdateDeviceResponse withAppId(String appId) {
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

    public UpdateDeviceResponse withAppName(String appName) {
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

    public UpdateDeviceResponse withDeviceId(String deviceId) {
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

    public UpdateDeviceResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 设备标识码，通常使用IMEI、MAC地址或Serial No作为node_id。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UpdateDeviceResponse withGatewayId(String gatewayId) {
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

    public UpdateDeviceResponse withDeviceName(String deviceName) {
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

    public UpdateDeviceResponse withNodeType(String nodeType) {
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

    public UpdateDeviceResponse withDescription(String description) {
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

    public UpdateDeviceResponse withFwVersion(String fwVersion) {
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

    public UpdateDeviceResponse withSwVersion(String swVersion) {
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

    public UpdateDeviceResponse withDeviceSdkVersion(String deviceSdkVersion) {
        this.deviceSdkVersion = deviceSdkVersion;
        return this;
    }

    /**
     * 设备的sdk信息。
     * @return deviceSdkVersion
     */
    public String getDeviceSdkVersion() {
        return deviceSdkVersion;
    }

    public void setDeviceSdkVersion(String deviceSdkVersion) {
        this.deviceSdkVersion = deviceSdkVersion;
    }

    public UpdateDeviceResponse withAuthInfo(AuthInfoRes authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public UpdateDeviceResponse withAuthInfo(Consumer<AuthInfoRes> authInfoSetter) {
        if (this.authInfo == null) {
            this.authInfo = new AuthInfoRes();
            authInfoSetter.accept(this.authInfo);
        }

        return this;
    }

    /**
     * Get authInfo
     * @return authInfo
     */
    public AuthInfoRes getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(AuthInfoRes authInfo) {
        this.authInfo = authInfo;
    }

    public UpdateDeviceResponse withProductId(String productId) {
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

    public UpdateDeviceResponse withProductName(String productName) {
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

    public UpdateDeviceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 设备的状态。 - ONLINE：设备在线。 - OFFLINE：设备离线。 - ABNORMAL：设备异常。 - INACTIVE：设备未激活。 - FROZEN：设备冻结。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateDeviceResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 在物联网平台注册设备的时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateDeviceResponse withConnectionStatusUpdateTime(String connectionStatusUpdateTime) {
        this.connectionStatusUpdateTime = connectionStatusUpdateTime;
        return this;
    }

    /**
     * 设备最近一次连接状态(ONLINE:在线，OFFLINE：离线，ABNORMAL：异常)变化时间。格式：yyyy-MM-dd'T'HH:mm:ss.SSS'Z' ，如2015-12-12T12:12:122Z。
     * @return connectionStatusUpdateTime
     */
    public String getConnectionStatusUpdateTime() {
        return connectionStatusUpdateTime;
    }

    public void setConnectionStatusUpdateTime(String connectionStatusUpdateTime) {
        this.connectionStatusUpdateTime = connectionStatusUpdateTime;
    }

    public UpdateDeviceResponse withActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    /**
     * 设备激活时间。格式：yyyy-MM-dd'T'HH:mm:ss.SSS'Z' ，如2015-12-12T12:12:122Z。
     * @return activeTime
     */
    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public UpdateDeviceResponse withTags(List<TagV5DTO> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateDeviceResponse addTagsItem(TagV5DTO tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateDeviceResponse withTags(Consumer<List<TagV5DTO>> tagsSetter) {
        if (this.tags == null) {
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

    public UpdateDeviceResponse withModules(List<ModuleDTO> modules) {
        this.modules = modules;
        return this;
    }

    public UpdateDeviceResponse addModulesItem(ModuleDTO modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public UpdateDeviceResponse withModules(Consumer<List<ModuleDTO>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * 设备的OTA模块列表。
     * @return modules
     */
    public List<ModuleDTO> getModules() {
        return modules;
    }

    public void setModules(List<ModuleDTO> modules) {
        this.modules = modules;
    }

    public UpdateDeviceResponse withExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }

    /**
     * 设备扩展信息。用户可以自定义任何想要的扩展信息，如果在创建设备时为子设备指定该字段，将会通过MQTT接口“平台通知网关子设备新增“将该信息通知给网关。
     * @return extensionInfo
     */
    public Object getExtensionInfo() {
        return extensionInfo;
    }

    public void setExtensionInfo(Object extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDeviceResponse that = (UpdateDeviceResponse) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.deviceName, that.deviceName)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.description, that.description)
            && Objects.equals(this.fwVersion, that.fwVersion) && Objects.equals(this.swVersion, that.swVersion)
            && Objects.equals(this.deviceSdkVersion, that.deviceSdkVersion)
            && Objects.equals(this.authInfo, that.authInfo) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productName, that.productName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.connectionStatusUpdateTime, that.connectionStatusUpdateTime)
            && Objects.equals(this.activeTime, that.activeTime) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.modules, that.modules) && Objects.equals(this.extensionInfo, that.extensionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            appName,
            deviceId,
            nodeId,
            gatewayId,
            deviceName,
            nodeType,
            description,
            fwVersion,
            swVersion,
            deviceSdkVersion,
            authInfo,
            productId,
            productName,
            status,
            createTime,
            connectionStatusUpdateTime,
            activeTime,
            tags,
            modules,
            extensionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceResponse {\n");
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
        sb.append("    deviceSdkVersion: ").append(toIndentedString(deviceSdkVersion)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    connectionStatusUpdateTime: ").append(toIndentedString(connectionStatusUpdateTime)).append("\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
        sb.append("    extensionInfo: ").append(toIndentedString(extensionInfo)).append("\n");
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
