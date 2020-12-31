package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.Authentication;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import com.huaweicloud.sdk.roma.v2.model.ProductReferer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Device
 */
public class Device  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permissions")
    
    private List<String> permissions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_device_id")
    
    private Integer parentDeviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_device_name")
    
    private String parentDeviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product")
    
    private ProductReferer product = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_id")
    
    private String clientId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;
    /**
     * 设备状态 0-启用 1-禁用
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;
    /**
     * 是否在线 0-未连接 1-在线 2-离线
     */
    public static final class OnlineStatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final OnlineStatusEnum NUMBER_0 = new OnlineStatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final OnlineStatusEnum NUMBER_1 = new OnlineStatusEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final OnlineStatusEnum NUMBER_2 = new OnlineStatusEnum(2);
        

        private static final Map<Integer, OnlineStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, OnlineStatusEnum> createStaticFields() {
            Map<Integer, OnlineStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        OnlineStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OnlineStatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            OnlineStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OnlineStatusEnum(value);
            }
            return result;
        }

        public static OnlineStatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            OnlineStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OnlineStatusEnum) {
                return this.value.equals(((OnlineStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="online_status")
    
    private OnlineStatusEnum onlineStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authentication")
    
    private Authentication authentication = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private Long createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_datetime")
    
    private Long lastUpdatedDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connect_address")
    
    private String connectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_connect_address")
    
    private String sslConnectAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_login_datetime")
    
    private Long lastLoginDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_type")
    
    private Integer nodeType;
    /**
     * 设备类型<br>0-普通设备（无子设备也无父设备）<br>1-网关设备(可挂载子设备)<br>2-子设备(归属于某个网关设备)
     */
    public static final class DeviceTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DeviceTypeEnum NUMBER_0 = new DeviceTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DeviceTypeEnum NUMBER_1 = new DeviceTypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final DeviceTypeEnum NUMBER_2 = new DeviceTypeEnum(2);
        

        private static final Map<Integer, DeviceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DeviceTypeEnum> createStaticFields() {
            Map<Integer, DeviceTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DeviceTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeviceTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            DeviceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeviceTypeEnum(value);
            }
            return result;
        }

        public static DeviceTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            DeviceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DeviceTypeEnum) {
                return this.value.equals(((DeviceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_type")
    
    private DeviceTypeEnum deviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_ip")
    
    private String clientIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keep_alive")
    
    private String keepAlive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_active_time")
    
    private Long lastActiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;
    /**
     * modbus和opcua设备特有,表示设备所属产品的类型 0-普通产品 1-modbus网关产品 2-opcua网关产品
     */
    public static final class PluginIdEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PluginIdEnum NUMBER_0 = new PluginIdEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PluginIdEnum NUMBER_1 = new PluginIdEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final PluginIdEnum NUMBER_2 = new PluginIdEnum(2);
        

        private static final Map<Integer, PluginIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PluginIdEnum> createStaticFields() {
            Map<Integer, PluginIdEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PluginIdEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PluginIdEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            PluginIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PluginIdEnum(value);
            }
            return result;
        }

        public static PluginIdEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            PluginIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PluginIdEnum) {
                return this.value.equals(((PluginIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugin_id")
    
    private PluginIdEnum pluginId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;

    public Device withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    
    public Device addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public Device withPermissions(Consumer<List<String>> permissionsSetter) {
        if(this.permissions == null ){
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

    public Device withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 设备ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Device withParentDeviceId(Integer parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
        return this;
    }

    


    /**
     * 父设备ID
     * @return parentDeviceId
     */
    public Integer getParentDeviceId() {
        return parentDeviceId;
    }

    public void setParentDeviceId(Integer parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
    }

    public Device withParentDeviceName(String parentDeviceName) {
        this.parentDeviceName = parentDeviceName;
        return this;
    }

    


    /**
     * 父设备名称
     * @return parentDeviceName
     */
    public String getParentDeviceName() {
        return parentDeviceName;
    }

    public void setParentDeviceName(String parentDeviceName) {
        this.parentDeviceName = parentDeviceName;
    }

    public Device withProduct(ProductReferer product) {
        this.product = product;
        return this;
    }

    public Device withProduct(Consumer<ProductReferer> productSetter) {
        if(this.product == null ){
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

    public Device withDeviceName(String deviceName) {
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

    public Device withInstanceId(String instanceId) {
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

    public Device withClientId(String clientId) {
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

    public Device withNodeId(String nodeId) {
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

    public Device withAppName(String appName) {
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

    public Device withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 设备状态 0-启用 1-禁用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Device withOnlineStatus(OnlineStatusEnum onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    


    /**
     * 是否在线 0-未连接 1-在线 2-离线
     * @return onlineStatus
     */
    public OnlineStatusEnum getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(OnlineStatusEnum onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public Device withDescription(String description) {
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

    public Device withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public Device withAuthentication(Consumer<Authentication> authenticationSetter) {
        if(this.authentication == null ){
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

    public Device withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public Device withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if(this.createdUser == null ){
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

    public Device withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public Device withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if(this.lastUpdatedUser == null ){
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

    public Device withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public Device addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Device withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
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

    public Device withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    


    /**
     * 创建时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Device withLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    


    /**
     * 最后修改时间，timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastUpdatedDatetime
     */
    public Long getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    public Device withConnectAddress(String connectAddress) {
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

    public Device withSslConnectAddress(String sslConnectAddress) {
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

    public Device withLastLoginDatetime(Long lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
        return this;
    }

    


    /**
     * 最后登录时间
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastLoginDatetime
     */
    public Long getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    public void setLastLoginDatetime(Long lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public Device withNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * 节点类型 0-直连 1-网关 2-子设备
     * @return nodeType
     */
    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public Device withDeviceType(DeviceTypeEnum deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    


    /**
     * 设备类型<br>0-普通设备（无子设备也无父设备）<br>1-网关设备(可挂载子设备)<br>2-子设备(归属于某个网关设备)
     * @return deviceType
     */
    public DeviceTypeEnum getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceTypeEnum deviceType) {
        this.deviceType = deviceType;
    }

    public Device withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    


    /**
     * 客户端ip
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Device withKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    


    /**
     * 心跳时间
     * @return keepAlive
     */
    public String getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
    }

    public Device withLastActiveTime(Long lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
        return this;
    }

    


    /**
     * 最后登录时间
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastActiveTime
     */
    public Long getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Long lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Device withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 设备版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Device withPluginId(PluginIdEnum pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    


    /**
     * modbus和opcua设备特有,表示设备所属产品的类型 0-普通产品 1-modbus网关产品 2-opcua网关产品
     * @return pluginId
     */
    public PluginIdEnum getPluginId() {
        return pluginId;
    }

    public void setPluginId(PluginIdEnum pluginId) {
        this.pluginId = pluginId;
    }

    public Device withAppId(String appId) {
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
        Device device = (Device) o;
        return Objects.equals(this.permissions, device.permissions) &&
            Objects.equals(this.id, device.id) &&
            Objects.equals(this.parentDeviceId, device.parentDeviceId) &&
            Objects.equals(this.parentDeviceName, device.parentDeviceName) &&
            Objects.equals(this.product, device.product) &&
            Objects.equals(this.deviceName, device.deviceName) &&
            Objects.equals(this.instanceId, device.instanceId) &&
            Objects.equals(this.clientId, device.clientId) &&
            Objects.equals(this.nodeId, device.nodeId) &&
            Objects.equals(this.appName, device.appName) &&
            Objects.equals(this.status, device.status) &&
            Objects.equals(this.onlineStatus, device.onlineStatus) &&
            Objects.equals(this.description, device.description) &&
            Objects.equals(this.authentication, device.authentication) &&
            Objects.equals(this.createdUser, device.createdUser) &&
            Objects.equals(this.lastUpdatedUser, device.lastUpdatedUser) &&
            Objects.equals(this.tags, device.tags) &&
            Objects.equals(this.createdDatetime, device.createdDatetime) &&
            Objects.equals(this.lastUpdatedDatetime, device.lastUpdatedDatetime) &&
            Objects.equals(this.connectAddress, device.connectAddress) &&
            Objects.equals(this.sslConnectAddress, device.sslConnectAddress) &&
            Objects.equals(this.lastLoginDatetime, device.lastLoginDatetime) &&
            Objects.equals(this.nodeType, device.nodeType) &&
            Objects.equals(this.deviceType, device.deviceType) &&
            Objects.equals(this.clientIp, device.clientIp) &&
            Objects.equals(this.keepAlive, device.keepAlive) &&
            Objects.equals(this.lastActiveTime, device.lastActiveTime) &&
            Objects.equals(this.version, device.version) &&
            Objects.equals(this.pluginId, device.pluginId) &&
            Objects.equals(this.appId, device.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(permissions, id, parentDeviceId, parentDeviceName, product, deviceName, instanceId, clientId, nodeId, appName, status, onlineStatus, description, authentication, createdUser, lastUpdatedUser, tags, createdDatetime, lastUpdatedDatetime, connectAddress, sslConnectAddress, lastLoginDatetime, nodeType, deviceType, clientIp, keepAlive, lastActiveTime, version, pluginId, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Device {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentDeviceId: ").append(toIndentedString(parentDeviceId)).append("\n");
        sb.append("    parentDeviceName: ").append(toIndentedString(parentDeviceName)).append("\n");
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
        sb.append("    lastLoginDatetime: ").append(toIndentedString(lastLoginDatetime)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    keepAlive: ").append(toIndentedString(keepAlive)).append("\n");
        sb.append("    lastActiveTime: ").append(toIndentedString(lastActiveTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
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

