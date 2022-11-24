package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 虚拟接口对象
 */
public class VirtualInterface {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect_id")

    private String directConnectId;

    /**
     * 接入网关的类型：包括VGW,GDGW,LGW等
     */
    public static final class ServiceTypeEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final ServiceTypeEnum VPC = new ServiceTypeEnum("vpc");

        /**
         * Enum VGW for value: "VGW"
         */
        public static final ServiceTypeEnum VGW = new ServiceTypeEnum("VGW");

        /**
         * Enum GDWW for value: "GDWW"
         */
        public static final ServiceTypeEnum GDWW = new ServiceTypeEnum("GDWW");

        /**
         * Enum LGW for value: "LGW"
         */
        public static final ServiceTypeEnum LGW = new ServiceTypeEnum("LGW");

        private static final Map<String, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceTypeEnum> createStaticFields() {
            Map<String, ServiceTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("VGW", VGW);
            map.put("GDWW", GDWW);
            map.put("LGW", LGW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ServiceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ServiceTypeEnum(value);
            }
            return result;
        }

        public static ServiceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceTypeEnum) {
                return this.value.equals(((ServiceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private ServiceTypeEnum serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    /**
     * 接口类型：private/public,
     */
    public static final class TypeEnum {

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final TypeEnum PRIVATE = new TypeEnum("private");

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final TypeEnum PUBLIC = new TypeEnum("public");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("private", PRIVATE);
            map.put("public", PUBLIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan")

    private Integer vlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_limit")

    private Integer routeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_nqa")

    private Boolean enableNqa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_bfd")

    private Boolean enableBfd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag_id")

    private String lagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_peers")

    private List<VifPeer> vifPeers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_attribute")

    private VifExtendAttribute extendAttribute;

    public VirtualInterface withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 虚拟接口的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VirtualInterface withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟接口的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualInterface withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 管理状态：true或false
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public VirtualInterface withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 虚拟接口接入带宽
     * minimum: 2
     * maximum: 2147483647
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public VirtualInterface withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 虚拟接口创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public VirtualInterface withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 虚拟接口更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public VirtualInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 虚拟接口的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VirtualInterface withDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
        return this;
    }

    /**
     * 物理专线的ID
     * @return directConnectId
     */
    public String getDirectConnectId() {
        return directConnectId;
    }

    public void setDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
    }

    public VirtualInterface withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 接入网关的类型：包括VGW,GDGW,LGW等
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public VirtualInterface withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 操作状态，合法值是：ACTIVE，DOWN，BUILD，ERROR，PENDING_CREATE，PENDING_UPDATE，PENDING_DELETE，DELETED，AUTHORIZATION，REJECTED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VirtualInterface withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public VirtualInterface withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 接口类型：private/public,
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public VirtualInterface withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * 虚拟网关的ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public VirtualInterface withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * 同用户网关对接的vlan, 配置范围0-3999
     * minimum: 0
     * maximum: 3999
     * @return vlan
     */
    public Integer getVlan() {
        return vlan;
    }

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    public VirtualInterface withRouteLimit(Integer routeLimit) {
        this.routeLimit = routeLimit;
        return this;
    }

    /**
     * VIF远端子网路由配置规格
     * minimum: 1
     * maximum: 200
     * @return routeLimit
     */
    public Integer getRouteLimit() {
        return routeLimit;
    }

    public void setRouteLimit(Integer routeLimit) {
        this.routeLimit = routeLimit;
    }

    public VirtualInterface withEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
        return this;
    }

    /**
     * 是否使能nqa功能：true或false
     * @return enableNqa
     */
    public Boolean getEnableNqa() {
        return enableNqa;
    }

    public void setEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
    }

    public VirtualInterface withEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
        return this;
    }

    /**
     * 是否使能nqa功能：true或false
     * @return enableBfd
     */
    public Boolean getEnableBfd() {
        return enableBfd;
    }

    public void setEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
    }

    public VirtualInterface withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * VIF关联的链路聚合组ID
     * @return lagId
     */
    public String getLagId() {
        return lagId;
    }

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    public VirtualInterface withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 归属的设备ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public VirtualInterface withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public VirtualInterface withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public VirtualInterface addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VirtualInterface withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public VirtualInterface withVifPeers(List<VifPeer> vifPeers) {
        this.vifPeers = vifPeers;
        return this;
    }

    public VirtualInterface addVifPeersItem(VifPeer vifPeersItem) {
        if (this.vifPeers == null) {
            this.vifPeers = new ArrayList<>();
        }
        this.vifPeers.add(vifPeersItem);
        return this;
    }

    public VirtualInterface withVifPeers(Consumer<List<VifPeer>> vifPeersSetter) {
        if (this.vifPeers == null) {
            this.vifPeers = new ArrayList<>();
        }
        vifPeersSetter.accept(this.vifPeers);
        return this;
    }

    /**
     * vif的Peer的相关信息
     * @return vifPeers
     */
    public List<VifPeer> getVifPeers() {
        return vifPeers;
    }

    public void setVifPeers(List<VifPeer> vifPeers) {
        this.vifPeers = vifPeers;
    }

    public VirtualInterface withExtendAttribute(VifExtendAttribute extendAttribute) {
        this.extendAttribute = extendAttribute;
        return this;
    }

    public VirtualInterface withExtendAttribute(Consumer<VifExtendAttribute> extendAttributeSetter) {
        if (this.extendAttribute == null) {
            this.extendAttribute = new VifExtendAttribute();
            extendAttributeSetter.accept(this.extendAttribute);
        }

        return this;
    }

    /**
     * Get extendAttribute
     * @return extendAttribute
     */
    public VifExtendAttribute getExtendAttribute() {
        return extendAttribute;
    }

    public void setExtendAttribute(VifExtendAttribute extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualInterface virtualInterface = (VirtualInterface) o;
        return Objects.equals(this.id, virtualInterface.id) && Objects.equals(this.name, virtualInterface.name)
            && Objects.equals(this.adminStateUp, virtualInterface.adminStateUp)
            && Objects.equals(this.bandwidth, virtualInterface.bandwidth)
            && Objects.equals(this.createTime, virtualInterface.createTime)
            && Objects.equals(this.updateTime, virtualInterface.updateTime)
            && Objects.equals(this.description, virtualInterface.description)
            && Objects.equals(this.directConnectId, virtualInterface.directConnectId)
            && Objects.equals(this.serviceType, virtualInterface.serviceType)
            && Objects.equals(this.status, virtualInterface.status)
            && Objects.equals(this.tenantId, virtualInterface.tenantId)
            && Objects.equals(this.type, virtualInterface.type) && Objects.equals(this.vgwId, virtualInterface.vgwId)
            && Objects.equals(this.vlan, virtualInterface.vlan)
            && Objects.equals(this.routeLimit, virtualInterface.routeLimit)
            && Objects.equals(this.enableNqa, virtualInterface.enableNqa)
            && Objects.equals(this.enableBfd, virtualInterface.enableBfd)
            && Objects.equals(this.lagId, virtualInterface.lagId)
            && Objects.equals(this.deviceId, virtualInterface.deviceId)
            && Objects.equals(this.enterpriseProjectId, virtualInterface.enterpriseProjectId)
            && Objects.equals(this.tags, virtualInterface.tags)
            && Objects.equals(this.vifPeers, virtualInterface.vifPeers)
            && Objects.equals(this.extendAttribute, virtualInterface.extendAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            adminStateUp,
            bandwidth,
            createTime,
            updateTime,
            description,
            directConnectId,
            serviceType,
            status,
            tenantId,
            type,
            vgwId,
            vlan,
            routeLimit,
            enableNqa,
            enableBfd,
            lagId,
            deviceId,
            enterpriseProjectId,
            tags,
            vifPeers,
            extendAttribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualInterface {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directConnectId: ").append(toIndentedString(directConnectId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
        sb.append("    routeLimit: ").append(toIndentedString(routeLimit)).append("\n");
        sb.append("    enableNqa: ").append(toIndentedString(enableNqa)).append("\n");
        sb.append("    enableBfd: ").append(toIndentedString(enableBfd)).append("\n");
        sb.append("    lagId: ").append(toIndentedString(lagId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vifPeers: ").append(toIndentedString(vifPeers)).append("\n");
        sb.append("    extendAttribute: ").append(toIndentedString(extendAttribute)).append("\n");
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
