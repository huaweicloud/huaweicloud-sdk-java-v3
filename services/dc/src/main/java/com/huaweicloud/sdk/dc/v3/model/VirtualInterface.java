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
         * Enum VGW for value: "VGW"
         */
        public static final ServiceTypeEnum VGW = new ServiceTypeEnum("VGW");

        /**
         * Enum GDGW for value: "GDGW"
         */
        public static final ServiceTypeEnum GDGW = new ServiceTypeEnum("GDGW");

        /**
         * Enum LGW for value: "LGW"
         */
        public static final ServiceTypeEnum LGW = new ServiceTypeEnum("LGW");

        private static final Map<String, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceTypeEnum> createStaticFields() {
            Map<String, ServiceTypeEnum> map = new HashMap<>();
            map.put("VGW", VGW);
            map.put("GDGW", GDGW);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceTypeEnum(value));
        }

        public static ServiceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
     * 表示接口类型：private
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "local_gateway_v4_ip")

    private String localGatewayV4Ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_gateway_v4_ip")

    private String remoteGatewayV4Ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ies_id")

    private String iesId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private Boolean rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_family")

    private String addressFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_gateway_v6_ip")

    private String localGatewayV6Ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_gateway_v6_ip")

    private String remoteGatewayV6Ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lgw_id")

    private String lgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ep_group")

    private List<String> remoteEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_ep_group")

    private List<String> serviceEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_route_limit")

    private Integer bgpRouteLimit;

    /**
     * 虚拟接口的优先级，支持两种优先级状态normal和low。 接口优先级相同时表示负载关系，接口优先级不同时表示主备关系，出云流量优先转到优先级更高的normal接口。 目前仅BGP模式接口支持。
     */
    public static final class PriorityEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final PriorityEnum NORMAL = new PriorityEnum("normal");

        /**
         * Enum LOW for value: "low"
         */
        public static final PriorityEnum LOW = new PriorityEnum("low");

        private static final Map<String, PriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PriorityEnum> createStaticFields() {
            Map<String, PriorityEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("low", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PriorityEnum(String value) {
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
        public static PriorityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PriorityEnum(value));
        }

        public static PriorityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PriorityEnum) {
                return this.value.equals(((PriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private PriorityEnum priority;

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
     * 表示接口类型：private
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

    public VirtualInterface withLocalGatewayV4Ip(String localGatewayV4Ip) {
        this.localGatewayV4Ip = localGatewayV4Ip;
        return this;
    }

    /**
     * 云侧网关IPv4接口地址，该字段现已经移到vifpeer参数列表中，未来将会废弃。
     * @return localGatewayV4Ip
     */
    public String getLocalGatewayV4Ip() {
        return localGatewayV4Ip;
    }

    public void setLocalGatewayV4Ip(String localGatewayV4Ip) {
        this.localGatewayV4Ip = localGatewayV4Ip;
    }

    public VirtualInterface withRemoteGatewayV4Ip(String remoteGatewayV4Ip) {
        this.remoteGatewayV4Ip = remoteGatewayV4Ip;
        return this;
    }

    /**
     * 客户侧网关IPv4接口地址，该字段现已经移到vifpeer参数列表中，未来将会废弃。
     * @return remoteGatewayV4Ip
     */
    public String getRemoteGatewayV4Ip() {
        return remoteGatewayV4Ip;
    }

    public void setRemoteGatewayV4Ip(String remoteGatewayV4Ip) {
        this.remoteGatewayV4Ip = remoteGatewayV4Ip;
    }

    public VirtualInterface withIesId(String iesId) {
        this.iesId = iesId;
        return this;
    }

    /**
     * 归属的IES站点的ID[（功能暂不支持）](tag:dt)
     * @return iesId
     */
    public String getIesId() {
        return iesId;
    }

    public void setIesId(String iesId) {
        this.iesId = iesId;
    }

    public VirtualInterface withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 如果资源的状态是Error的情况下，该参数会显示相关错误信息。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public VirtualInterface withRateLimit(Boolean rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * 标识虚拟接口是否开启限速
     * @return rateLimit
     */
    public Boolean getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Boolean rateLimit) {
        this.rateLimit = rateLimit;
    }

    public VirtualInterface withAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * 接口的地址簇类型，ipv4，ipv6。该字段现已迁移到vifpeer参数列表中，未来将会废弃。
     * @return addressFamily
     */
    public String getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    public VirtualInterface withLocalGatewayV6Ip(String localGatewayV6Ip) {
        this.localGatewayV6Ip = localGatewayV6Ip;
        return this;
    }

    /**
     * 云侧网关IPv6接口地址，该字段现已迁移到vifpeer参数列表中，未来将会废弃。
     * @return localGatewayV6Ip
     */
    public String getLocalGatewayV6Ip() {
        return localGatewayV6Ip;
    }

    public void setLocalGatewayV6Ip(String localGatewayV6Ip) {
        this.localGatewayV6Ip = localGatewayV6Ip;
    }

    public VirtualInterface withRemoteGatewayV6Ip(String remoteGatewayV6Ip) {
        this.remoteGatewayV6Ip = remoteGatewayV6Ip;
        return this;
    }

    /**
     * 客户侧网关IPv6接口地址，该字段现已迁移到vifpeer参数列表中，未来将会废弃。
     * @return remoteGatewayV6Ip
     */
    public String getRemoteGatewayV6Ip() {
        return remoteGatewayV6Ip;
    }

    public void setRemoteGatewayV6Ip(String remoteGatewayV6Ip) {
        this.remoteGatewayV6Ip = remoteGatewayV6Ip;
    }

    public VirtualInterface withLgwId(String lgwId) {
        this.lgwId = lgwId;
        return this;
    }

    /**
     * 本地网关的ID，用于IES场景。[（功能暂不支持）](tag:dt)
     * @return lgwId
     */
    public String getLgwId() {
        return lgwId;
    }

    public void setLgwId(String lgwId) {
        this.lgwId = lgwId;
    }

    public VirtualInterface withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 虚拟接口关联的网关的ID
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public VirtualInterface withRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
        return this;
    }

    public VirtualInterface addRemoteEpGroupItem(String remoteEpGroupItem) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        this.remoteEpGroup.add(remoteEpGroupItem);
        return this;
    }

    public VirtualInterface withRemoteEpGroup(Consumer<List<String>> remoteEpGroupSetter) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        remoteEpGroupSetter.accept(this.remoteEpGroup);
        return this;
    }

    /**
     * 远端子网列表，记录租户侧的cidrs。该字段现已迁移到vifpeer参数列表中，未来将会废弃。
     * @return remoteEpGroup
     */
    public List<String> getRemoteEpGroup() {
        return remoteEpGroup;
    }

    public void setRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
    }

    public VirtualInterface withServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
        return this;
    }

    public VirtualInterface addServiceEpGroupItem(String serviceEpGroupItem) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        this.serviceEpGroup.add(serviceEpGroupItem);
        return this;
    }

    public VirtualInterface withServiceEpGroup(Consumer<List<String>> serviceEpGroupSetter) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        serviceEpGroupSetter.accept(this.serviceEpGroup);
        return this;
    }

    /**
     * 该字段用于公网专线接口，表示租户可以访问云上公网服务地址列表。该字段现已迁移到vifpeer参数列表中，未来将会废弃。
     * @return serviceEpGroup
     */
    public List<String> getServiceEpGroup() {
        return serviceEpGroup;
    }

    public void setServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
    }

    public VirtualInterface withBgpRouteLimit(Integer bgpRouteLimit) {
        this.bgpRouteLimit = bgpRouteLimit;
        return this;
    }

    /**
     * BGP的路由配置规格
     * @return bgpRouteLimit
     */
    public Integer getBgpRouteLimit() {
        return bgpRouteLimit;
    }

    public void setBgpRouteLimit(Integer bgpRouteLimit) {
        this.bgpRouteLimit = bgpRouteLimit;
    }

    public VirtualInterface withPriority(PriorityEnum priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 虚拟接口的优先级，支持两种优先级状态normal和low。 接口优先级相同时表示负载关系，接口优先级不同时表示主备关系，出云流量优先转到优先级更高的normal接口。 目前仅BGP模式接口支持。
     * @return priority
     */
    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualInterface that = (VirtualInterface) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.directConnectId, that.directConnectId)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.vgwId, that.vgwId) && Objects.equals(this.vlan, that.vlan)
            && Objects.equals(this.routeLimit, that.routeLimit) && Objects.equals(this.enableNqa, that.enableNqa)
            && Objects.equals(this.enableBfd, that.enableBfd) && Objects.equals(this.lagId, that.lagId)
            && Objects.equals(this.deviceId, that.deviceId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.localGatewayV4Ip, that.localGatewayV4Ip)
            && Objects.equals(this.remoteGatewayV4Ip, that.remoteGatewayV4Ip) && Objects.equals(this.iesId, that.iesId)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.rateLimit, that.rateLimit)
            && Objects.equals(this.addressFamily, that.addressFamily)
            && Objects.equals(this.localGatewayV6Ip, that.localGatewayV6Ip)
            && Objects.equals(this.remoteGatewayV6Ip, that.remoteGatewayV6Ip) && Objects.equals(this.lgwId, that.lgwId)
            && Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.remoteEpGroup, that.remoteEpGroup)
            && Objects.equals(this.serviceEpGroup, that.serviceEpGroup)
            && Objects.equals(this.bgpRouteLimit, that.bgpRouteLimit) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.vifPeers, that.vifPeers)
            && Objects.equals(this.extendAttribute, that.extendAttribute);
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
            localGatewayV4Ip,
            remoteGatewayV4Ip,
            iesId,
            reason,
            rateLimit,
            addressFamily,
            localGatewayV6Ip,
            remoteGatewayV6Ip,
            lgwId,
            gatewayId,
            remoteEpGroup,
            serviceEpGroup,
            bgpRouteLimit,
            priority,
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
        sb.append("    localGatewayV4Ip: ").append(toIndentedString(localGatewayV4Ip)).append("\n");
        sb.append("    remoteGatewayV4Ip: ").append(toIndentedString(remoteGatewayV4Ip)).append("\n");
        sb.append("    iesId: ").append(toIndentedString(iesId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
        sb.append("    localGatewayV6Ip: ").append(toIndentedString(localGatewayV6Ip)).append("\n");
        sb.append("    remoteGatewayV6Ip: ").append(toIndentedString(remoteGatewayV6Ip)).append("\n");
        sb.append("    lgwId: ").append(toIndentedString(lgwId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    remoteEpGroup: ").append(toIndentedString(remoteEpGroup)).append("\n");
        sb.append("    serviceEpGroup: ").append(toIndentedString(serviceEpGroup)).append("\n");
        sb.append("    bgpRouteLimit: ").append(toIndentedString(bgpRouteLimit)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
