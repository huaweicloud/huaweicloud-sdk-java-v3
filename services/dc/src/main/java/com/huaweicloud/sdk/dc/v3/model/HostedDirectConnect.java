package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 托管专线对象信息
 */
public class HostedDirectConnect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_location")

    private String peerLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting_id")

    private String hostingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan")

    private Integer vlan;

    /**
     * 操作状态，合法值是： BUILD：已开通 ACTIVE：托管专线正常 DOWN：专线对应的端口处于down的状态，可能存在线路故障等异常。 ERROR：托管专线异常 PENDING_DELETE：删除中 PENDING_UPDATE：更新中 PENDING_CREATE：创建中
     */
    public static final class StatusEnum {

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");

        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILD", BUILD);
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            map.put("ERROR", ERROR);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
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
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private OffsetDateTime applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    /**
     * 托管专线的运营商操作状态，合法值是：ACTIVE， DOWN
     */
    public static final class ProviderStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final ProviderStatusEnum ACTIVE = new ProviderStatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final ProviderStatusEnum DOWN = new ProviderStatusEnum("DOWN");

        private static final Map<String, ProviderStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderStatusEnum> createStaticFields() {
            Map<String, ProviderStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderStatusEnum(String value) {
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
        public static ProviderStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderStatusEnum(value));
        }

        public static ProviderStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderStatusEnum) {
                return this.value.equals(((ProviderStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_status")

    private ProviderStatusEnum providerStatus;

    /**
     * 托管专线接入接口的类型，支持1G 10G 40G 100G
     */
    public static final class PortTypeEnum {

        /**
         * Enum _1G for value: "1G"
         */
        public static final PortTypeEnum _1G = new PortTypeEnum("1G");

        /**
         * Enum _10G for value: "10G"
         */
        public static final PortTypeEnum _10G = new PortTypeEnum("10G");

        /**
         * Enum _40G for value: "40G"
         */
        public static final PortTypeEnum _40G = new PortTypeEnum("40G");

        /**
         * Enum _100G for value: "100G"
         */
        public static final PortTypeEnum _100G = new PortTypeEnum("100G");

        private static final Map<String, PortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PortTypeEnum> createStaticFields() {
            Map<String, PortTypeEnum> map = new HashMap<>();
            map.put("1G", _1G);
            map.put("10G", _10G);
            map.put("40G", _40G);
            map.put("100G", _100G);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PortTypeEnum(String value) {
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
        public static PortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PortTypeEnum(value));
        }

        public static PortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PortTypeEnum) {
                return this.value.equals(((PortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private PortTypeEnum portType;

    /**
     * 托管专线的类型，类型包括标准(standard)，运营专线(hosting)，托管专线（hosted）[，一站式标准（onestop_standard），一站式托管（onestop_hosted）](tag:hws)。
     */
    public static final class TypeEnum {

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final TypeEnum STANDARD = new TypeEnum("standard");

        /**
         * Enum HOSTING for value: "hosting"
         */
        public static final TypeEnum HOSTING = new TypeEnum("hosting");

        /**
         * Enum HOSTED for value: "hosted"
         */
        public static final TypeEnum HOSTED = new TypeEnum("hosted");

        /**
         * Enum ONESTOP_STANDARD for value: "onestop_standard"
         */
        public static final TypeEnum ONESTOP_STANDARD = new TypeEnum("onestop_standard");

        /**
         * Enum ONESTOP_HOSTED for value: "onestop_hosted"
         */
        public static final TypeEnum ONESTOP_HOSTED = new TypeEnum("onestop_hosted");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("standard", STANDARD);
            map.put("hosting", HOSTING);
            map.put("hosted", HOSTED);
            map.put("onestop_standard", ONESTOP_STANDARD);
            map.put("onestop_hosted", ONESTOP_HOSTED);
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

    public HostedDirectConnect withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 托管专线ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HostedDirectConnect withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public HostedDirectConnect withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 托管专线名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostedDirectConnect withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 托管专线的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HostedDirectConnect withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 托管专线接入带宽，单位Mbps。
     * minimum: 2
     * maximum: 400000
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public HostedDirectConnect withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 专线的接入位置信息
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public HostedDirectConnect withPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }

    /**
     * 托管专线对端所在的物理位置，省/市/街道或IDC名字。
     * @return peerLocation
     */
    public String getPeerLocation() {
        return peerLocation;
    }

    public void setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
    }

    public HostedDirectConnect withHostingId(String hostingId) {
        this.hostingId = hostingId;
        return this;
    }

    /**
     * hosted物理专线对应的hosting物理专线的ID
     * @return hostingId
     */
    public String getHostingId() {
        return hostingId;
    }

    public void setHostingId(String hostingId) {
        this.hostingId = hostingId;
    }

    public HostedDirectConnect withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 专线线路的提供商
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public HostedDirectConnect withAdminStateUp(Boolean adminStateUp) {
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

    public HostedDirectConnect withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * hosted物理专线预分配的vlan。
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

    public HostedDirectConnect withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 操作状态，合法值是： BUILD：已开通 ACTIVE：托管专线正常 DOWN：专线对应的端口处于down的状态，可能存在线路故障等异常。 ERROR：托管专线异常 PENDING_DELETE：删除中 PENDING_UPDATE：更新中 PENDING_CREATE：创建中
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public HostedDirectConnect withApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 托管专线申请时间。采用UTC时间格式，格式为：yyyy-MM-ddTHH:mm:ss.SSSZ
     * @return applyTime
     */
    public OffsetDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public HostedDirectConnect withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 托管专线创建时间。采用UTC时间格式，格式为：yyyy-MM-ddTHH:mm:ss.SSSZ
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public HostedDirectConnect withProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
        return this;
    }

    /**
     * 托管专线的运营商操作状态，合法值是：ACTIVE， DOWN
     * @return providerStatus
     */
    public ProviderStatusEnum getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
    }

    public HostedDirectConnect withPortType(PortTypeEnum portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 托管专线接入接口的类型，支持1G 10G 40G 100G
     * @return portType
     */
    public PortTypeEnum getPortType() {
        return portType;
    }

    public void setPortType(PortTypeEnum portType) {
        this.portType = portType;
    }

    public HostedDirectConnect withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 托管专线的类型，类型包括标准(standard)，运营专线(hosting)，托管专线（hosted）[，一站式标准（onestop_standard），一站式托管（onestop_hosted）](tag:hws)。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostedDirectConnect that = (HostedDirectConnect) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.location, that.location)
            && Objects.equals(this.peerLocation, that.peerLocation) && Objects.equals(this.hostingId, that.hostingId)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.vlan, that.vlan) && Objects.equals(this.status, that.status)
            && Objects.equals(this.applyTime, that.applyTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.providerStatus, that.providerStatus) && Objects.equals(this.portType, that.portType)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            bandwidth,
            location,
            peerLocation,
            hostingId,
            provider,
            adminStateUp,
            vlan,
            status,
            applyTime,
            createTime,
            providerStatus,
            portType,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedDirectConnect {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
        sb.append("    hostingId: ").append(toIndentedString(hostingId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    providerStatus: ").append(toIndentedString(providerStatus)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
