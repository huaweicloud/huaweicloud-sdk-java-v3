package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建虚拟接口对象参数
 */
public class CreateVirtualInterface {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect_id")

    private String directConnectId;

    /**
     * 虚拟接口的类型,private
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

    /**
     * 接入网关类型：VGW/GDGW/LGW
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
    @JsonProperty(value = "vlan")

    private Integer vlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

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
    @JsonProperty(value = "local_gateway_v4_ip")

    private String localGatewayV4Ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_gateway_v4_ip")

    private String remoteGatewayV4Ip;

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
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    /**
     * 路由模式：static/bgp
     */
    public static final class RouteModeEnum {

        /**
         * Enum STATIC for value: "static"
         */
        public static final RouteModeEnum STATIC = new RouteModeEnum("static");

        /**
         * Enum BGP for value: "bgp"
         */
        public static final RouteModeEnum BGP = new RouteModeEnum("bgp");

        private static final Map<String, RouteModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RouteModeEnum> createStaticFields() {
            Map<String, RouteModeEnum> map = new HashMap<>();
            map.put("static", STATIC);
            map.put("bgp", BGP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RouteModeEnum(String value) {
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
        public static RouteModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RouteModeEnum(value));
        }

        public static RouteModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RouteModeEnum) {
                return this.value.equals(((RouteModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private RouteModeEnum routeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Integer bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_md5")

    private String bgpMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ep_group")

    private List<String> remoteEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_ep_group")

    private List<String> serviceEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_bfd")

    private Boolean enableBfd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_nqa")

    private Boolean enableNqa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag_id")

    private String lagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tenant_id")

    private String resourceTenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateVirtualInterface withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟接口名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVirtualInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 虚拟接口描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVirtualInterface withDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
        return this;
    }

    /**
     * 虚拟接口关联的物理专线ID。在创建虚拟接口时，需要关联direct_connect_id或lag_id，当LAG功能在当前局点不支持时，该参数为必选。
     * @return directConnectId
     */
    public String getDirectConnectId() {
        return directConnectId;
    }

    public void setDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
    }

    public CreateVirtualInterface withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 虚拟接口的类型,private
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateVirtualInterface withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 接入网关类型：VGW/GDGW/LGW
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public CreateVirtualInterface withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * 对接客户侧vlan。当关联物理连接选择托管专线时，vlan需要和托管专线保持一致。
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

    public CreateVirtualInterface withBandwidth(Integer bandwidth) {
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

    public CreateVirtualInterface withPriority(PriorityEnum priority) {
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

    public CreateVirtualInterface withLocalGatewayV4Ip(String localGatewayV4Ip) {
        this.localGatewayV4Ip = localGatewayV4Ip;
        return this;
    }

    /**
     * 云侧网关IPv4接口地址,如果address_family是IPv4，是必选参数
     * @return localGatewayV4Ip
     */
    public String getLocalGatewayV4Ip() {
        return localGatewayV4Ip;
    }

    public void setLocalGatewayV4Ip(String localGatewayV4Ip) {
        this.localGatewayV4Ip = localGatewayV4Ip;
    }

    public CreateVirtualInterface withRemoteGatewayV4Ip(String remoteGatewayV4Ip) {
        this.remoteGatewayV4Ip = remoteGatewayV4Ip;
        return this;
    }

    /**
     * 客户侧网关IPv4接口地址,如果address_family是IPv4，是必选参数
     * @return remoteGatewayV4Ip
     */
    public String getRemoteGatewayV4Ip() {
        return remoteGatewayV4Ip;
    }

    public void setRemoteGatewayV4Ip(String remoteGatewayV4Ip) {
        this.remoteGatewayV4Ip = remoteGatewayV4Ip;
    }

    public CreateVirtualInterface withAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * 接口的地址簇类型，ipv4，ipv6
     * @return addressFamily
     */
    public String getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    public CreateVirtualInterface withLocalGatewayV6Ip(String localGatewayV6Ip) {
        this.localGatewayV6Ip = localGatewayV6Ip;
        return this;
    }

    /**
     * 云侧网关IPv6接口地址,如果address_family是IPv6，是必选参数
     * @return localGatewayV6Ip
     */
    public String getLocalGatewayV6Ip() {
        return localGatewayV6Ip;
    }

    public void setLocalGatewayV6Ip(String localGatewayV6Ip) {
        this.localGatewayV6Ip = localGatewayV6Ip;
    }

    public CreateVirtualInterface withRemoteGatewayV6Ip(String remoteGatewayV6Ip) {
        this.remoteGatewayV6Ip = remoteGatewayV6Ip;
        return this;
    }

    /**
     * 客户侧网关IPv6接口地址,如果address_family是IPv6，是必选参数
     * @return remoteGatewayV6Ip
     */
    public String getRemoteGatewayV6Ip() {
        return remoteGatewayV6Ip;
    }

    public void setRemoteGatewayV6Ip(String remoteGatewayV6Ip) {
        this.remoteGatewayV6Ip = remoteGatewayV6Ip;
    }

    public CreateVirtualInterface withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * 虚拟接口连接的虚拟网关的ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public CreateVirtualInterface withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 虚拟接口关联的网关的ID。 当虚拟接口接入网关类型为全域接入网关时该参数必填，gateway_id值为全域接入网关的id
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public CreateVirtualInterface withRouteMode(RouteModeEnum routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 路由模式：static/bgp
     * @return routeMode
     */
    public RouteModeEnum getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(RouteModeEnum routeMode) {
        this.routeMode = routeMode;
    }

    public CreateVirtualInterface withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * 客户侧BGP邻居的AS号
     * minimum: 1
     * maximum: 4294967295
     * @return bgpAsn
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateVirtualInterface withBgpMd5(String bgpMd5) {
        this.bgpMd5 = bgpMd5;
        return this;
    }

    /**
     * BGP邻居的MD5密码
     * @return bgpMd5
     */
    public String getBgpMd5() {
        return bgpMd5;
    }

    public void setBgpMd5(String bgpMd5) {
        this.bgpMd5 = bgpMd5;
    }

    public CreateVirtualInterface withRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
        return this;
    }

    public CreateVirtualInterface addRemoteEpGroupItem(String remoteEpGroupItem) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        this.remoteEpGroup.add(remoteEpGroupItem);
        return this;
    }

    public CreateVirtualInterface withRemoteEpGroup(Consumer<List<String>> remoteEpGroupSetter) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        remoteEpGroupSetter.accept(this.remoteEpGroup);
        return this;
    }

    /**
     * 远端子网列表，记录租户侧的cidrs
     * @return remoteEpGroup
     */
    public List<String> getRemoteEpGroup() {
        return remoteEpGroup;
    }

    public void setRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
    }

    public CreateVirtualInterface withServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
        return this;
    }

    public CreateVirtualInterface addServiceEpGroupItem(String serviceEpGroupItem) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        this.serviceEpGroup.add(serviceEpGroupItem);
        return this;
    }

    public CreateVirtualInterface withServiceEpGroup(Consumer<List<String>> serviceEpGroupSetter) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        serviceEpGroupSetter.accept(this.serviceEpGroup);
        return this;
    }

    /**
     * 访问公网服务的子网列表
     * @return serviceEpGroup
     */
    public List<String> getServiceEpGroup() {
        return serviceEpGroup;
    }

    public void setServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
    }

    public CreateVirtualInterface withEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
        return this;
    }

    /**
     * 是否使能bfd功能：true或false。[（预留字段暂不支持）](tag:dt)
     * @return enableBfd
     */
    public Boolean getEnableBfd() {
        return enableBfd;
    }

    public void setEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
    }

    public CreateVirtualInterface withEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
        return this;
    }

    /**
     * 是否使能nqa功能：true或false。[（预留字段暂不支持）](tag:dt)
     * @return enableNqa
     */
    public Boolean getEnableNqa() {
        return enableNqa;
    }

    public void setEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
    }

    public CreateVirtualInterface withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * 虚拟接口关联的链路聚合组ID
     * @return lagId
     */
    public String getLagId() {
        return lagId;
    }

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    public CreateVirtualInterface withResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }

    /**
     * 目标的租户的ID,用于跨租户创建虚拟接口场景
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return resourceTenantId;
    }

    public void setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
    }

    public CreateVirtualInterface withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateVirtualInterface withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateVirtualInterface addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateVirtualInterface withTags(Consumer<List<Tag>> tagsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVirtualInterface that = (CreateVirtualInterface) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.directConnectId, that.directConnectId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.vlan, that.vlan)
            && Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.localGatewayV4Ip, that.localGatewayV4Ip)
            && Objects.equals(this.remoteGatewayV4Ip, that.remoteGatewayV4Ip)
            && Objects.equals(this.addressFamily, that.addressFamily)
            && Objects.equals(this.localGatewayV6Ip, that.localGatewayV6Ip)
            && Objects.equals(this.remoteGatewayV6Ip, that.remoteGatewayV6Ip) && Objects.equals(this.vgwId, that.vgwId)
            && Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.routeMode, that.routeMode)
            && Objects.equals(this.bgpAsn, that.bgpAsn) && Objects.equals(this.bgpMd5, that.bgpMd5)
            && Objects.equals(this.remoteEpGroup, that.remoteEpGroup)
            && Objects.equals(this.serviceEpGroup, that.serviceEpGroup)
            && Objects.equals(this.enableBfd, that.enableBfd) && Objects.equals(this.enableNqa, that.enableNqa)
            && Objects.equals(this.lagId, that.lagId) && Objects.equals(this.resourceTenantId, that.resourceTenantId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            directConnectId,
            type,
            serviceType,
            vlan,
            bandwidth,
            priority,
            localGatewayV4Ip,
            remoteGatewayV4Ip,
            addressFamily,
            localGatewayV6Ip,
            remoteGatewayV6Ip,
            vgwId,
            gatewayId,
            routeMode,
            bgpAsn,
            bgpMd5,
            remoteEpGroup,
            serviceEpGroup,
            enableBfd,
            enableNqa,
            lagId,
            resourceTenantId,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualInterface {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directConnectId: ").append(toIndentedString(directConnectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    localGatewayV4Ip: ").append(toIndentedString(localGatewayV4Ip)).append("\n");
        sb.append("    remoteGatewayV4Ip: ").append(toIndentedString(remoteGatewayV4Ip)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
        sb.append("    localGatewayV6Ip: ").append(toIndentedString(localGatewayV6Ip)).append("\n");
        sb.append("    remoteGatewayV6Ip: ").append(toIndentedString(remoteGatewayV6Ip)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    bgpMd5: ").append(toIndentedString(bgpMd5)).append("\n");
        sb.append("    remoteEpGroup: ").append(toIndentedString(remoteEpGroup)).append("\n");
        sb.append("    serviceEpGroup: ").append(toIndentedString(serviceEpGroup)).append("\n");
        sb.append("    enableBfd: ").append(toIndentedString(enableBfd)).append("\n");
        sb.append("    enableNqa: ").append(toIndentedString(enableNqa)).append("\n");
        sb.append("    lagId: ").append(toIndentedString(lagId)).append("\n");
        sb.append("    resourceTenantId: ").append(toIndentedString(resourceTenantId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
