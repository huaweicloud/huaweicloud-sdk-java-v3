package com.huaweicloud.sdk.roma.v2.model;

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
public class CreateDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<String> permissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Integer deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private ProductReferer product;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_status")

    private Integer onlineStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private Authentication authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user")

    private CreatedUser createdUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated_user")

    private LastUpdatedUser lastUpdatedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_datetime")

    private Long createdDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_updated_datetime")

    private Long lastUpdatedDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_address")

    private String connectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_connect_address")

    private String sslConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_connect_address")

    private String ipv6ConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_ssl_connect_address")

    private String ipv6SslConnectAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private Integer nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_type")

    private Integer deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public CreateDeviceResponse withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public CreateDeviceResponse addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public CreateDeviceResponse withPermissions(Consumer<List<String>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 权限
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public CreateDeviceResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 设备ID
     * minimum: 1
     * maximum: 99999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CreateDeviceResponse withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID（兼容20.0）
     * minimum: 1
     * maximum: 99999999999999999
     * @return deviceId
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public CreateDeviceResponse withProduct(ProductReferer product) {
        this.product = product;
        return this;
    }

    public CreateDeviceResponse withProduct(Consumer<ProductReferer> productSetter) {
        if (this.product == null) {
            this.product = new ProductReferer();
            productSetter.accept(this.product);
        }

        return this;
    }

    /**
     * Get product
     * @return product
     */
    public ProductReferer getProduct() {
        return product;
    }

    public void setProduct(ProductReferer product) {
        this.product = product;
    }

    public CreateDeviceResponse withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * 设备名称，支持中文、中文标点符号（）。；，：“”、？《》及英文大小写、数字及英文符号()_,#.?'-@%&!, 长度2-64
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public CreateDeviceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateDeviceResponse withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 设备客户端ID，平台生成的设备唯一标识
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public CreateDeviceResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 设备物理编号，通常使用MAC或者IMEI号，支持英文大小写，数字，下划线和中划线，长度2-64
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CreateDeviceResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CreateDeviceResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 设备状态 0-启用 1-禁用
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CreateDeviceResponse withOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    /**
     * 是否在线 0-未连接 1-在线 2-离线
     * minimum: 0
     * maximum: 10
     * @return onlineStatus
     */
    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public CreateDeviceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDeviceResponse withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public CreateDeviceResponse withAuthentication(Consumer<Authentication> authenticationSetter) {
        if (this.authentication == null) {
            this.authentication = new Authentication();
            authenticationSetter.accept(this.authentication);
        }

        return this;
    }

    /**
     * Get authentication
     * @return authentication
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public CreateDeviceResponse withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public CreateDeviceResponse withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if (this.createdUser == null) {
            this.createdUser = new CreatedUser();
            createdUserSetter.accept(this.createdUser);
        }

        return this;
    }

    /**
     * Get createdUser
     * @return createdUser
     */
    public CreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    public CreateDeviceResponse withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public CreateDeviceResponse withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if (this.lastUpdatedUser == null) {
            this.lastUpdatedUser = new LastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }

        return this;
    }

    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public LastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public CreateDeviceResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateDeviceResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDeviceResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateDeviceResponse withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    /**
     * 创建时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 99999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public CreateDeviceResponse withLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    /**
     * 最后修改时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 99999999999999999
     * @return lastUpdatedDatetime
     */
    public Long getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    public CreateDeviceResponse withConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
        return this;
    }

    /**
     * 设备接入地址
     * @return connectAddress
     */
    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress;
    }

    public CreateDeviceResponse withSslConnectAddress(String sslConnectAddress) {
        this.sslConnectAddress = sslConnectAddress;
        return this;
    }

    /**
     * 设备接入SSL地址
     * @return sslConnectAddress
     */
    public String getSslConnectAddress() {
        return sslConnectAddress;
    }

    public void setSslConnectAddress(String sslConnectAddress) {
        this.sslConnectAddress = sslConnectAddress;
    }

    public CreateDeviceResponse withIpv6ConnectAddress(String ipv6ConnectAddress) {
        this.ipv6ConnectAddress = ipv6ConnectAddress;
        return this;
    }

    /**
     * 设备接入IPV6地址
     * @return ipv6ConnectAddress
     */
    public String getIpv6ConnectAddress() {
        return ipv6ConnectAddress;
    }

    public void setIpv6ConnectAddress(String ipv6ConnectAddress) {
        this.ipv6ConnectAddress = ipv6ConnectAddress;
    }

    public CreateDeviceResponse withIpv6SslConnectAddress(String ipv6SslConnectAddress) {
        this.ipv6SslConnectAddress = ipv6SslConnectAddress;
        return this;
    }

    /**
     * 设备接入IPV6 SSL地址
     * @return ipv6SslConnectAddress
     */
    public String getIpv6SslConnectAddress() {
        return ipv6SslConnectAddress;
    }

    public void setIpv6SslConnectAddress(String ipv6SslConnectAddress) {
        this.ipv6SslConnectAddress = ipv6SslConnectAddress;
    }

    public CreateDeviceResponse withNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型 0-直连 1-网关 2-子设备
     * minimum: 1
     * maximum: 99999999999999999
     * @return nodeType
     */
    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public CreateDeviceResponse withDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 设备类型<br>0-普通设备（无子设备也无父设备）<br>1-网关设备(可挂载子设备)<br>2-子设备(归属于某个网关设备)
     * minimum: 0
     * maximum: 10
     * @return deviceType
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public CreateDeviceResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeviceResponse createDeviceResponse = (CreateDeviceResponse) o;
        return Objects.equals(this.permissions, createDeviceResponse.permissions)
            && Objects.equals(this.id, createDeviceResponse.id)
            && Objects.equals(this.deviceId, createDeviceResponse.deviceId)
            && Objects.equals(this.product, createDeviceResponse.product)
            && Objects.equals(this.deviceName, createDeviceResponse.deviceName)
            && Objects.equals(this.instanceId, createDeviceResponse.instanceId)
            && Objects.equals(this.clientId, createDeviceResponse.clientId)
            && Objects.equals(this.nodeId, createDeviceResponse.nodeId)
            && Objects.equals(this.appName, createDeviceResponse.appName)
            && Objects.equals(this.status, createDeviceResponse.status)
            && Objects.equals(this.onlineStatus, createDeviceResponse.onlineStatus)
            && Objects.equals(this.description, createDeviceResponse.description)
            && Objects.equals(this.authentication, createDeviceResponse.authentication)
            && Objects.equals(this.createdUser, createDeviceResponse.createdUser)
            && Objects.equals(this.lastUpdatedUser, createDeviceResponse.lastUpdatedUser)
            && Objects.equals(this.tags, createDeviceResponse.tags)
            && Objects.equals(this.createdDatetime, createDeviceResponse.createdDatetime)
            && Objects.equals(this.lastUpdatedDatetime, createDeviceResponse.lastUpdatedDatetime)
            && Objects.equals(this.connectAddress, createDeviceResponse.connectAddress)
            && Objects.equals(this.sslConnectAddress, createDeviceResponse.sslConnectAddress)
            && Objects.equals(this.ipv6ConnectAddress, createDeviceResponse.ipv6ConnectAddress)
            && Objects.equals(this.ipv6SslConnectAddress, createDeviceResponse.ipv6SslConnectAddress)
            && Objects.equals(this.nodeType, createDeviceResponse.nodeType)
            && Objects.equals(this.deviceType, createDeviceResponse.deviceType)
            && Objects.equals(this.appId, createDeviceResponse.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions,
            id,
            deviceId,
            product,
            deviceName,
            instanceId,
            clientId,
            nodeId,
            appName,
            status,
            onlineStatus,
            description,
            authentication,
            createdUser,
            lastUpdatedUser,
            tags,
            createdDatetime,
            lastUpdatedDatetime,
            connectAddress,
            sslConnectAddress,
            ipv6ConnectAddress,
            ipv6SslConnectAddress,
            nodeType,
            deviceType,
            appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeviceResponse {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
        sb.append("    connectAddress: ").append(toIndentedString(connectAddress)).append("\n");
        sb.append("    sslConnectAddress: ").append(toIndentedString(sslConnectAddress)).append("\n");
        sb.append("    ipv6ConnectAddress: ").append(toIndentedString(ipv6ConnectAddress)).append("\n");
        sb.append("    ipv6SslConnectAddress: ").append(toIndentedString(ipv6SslConnectAddress)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
