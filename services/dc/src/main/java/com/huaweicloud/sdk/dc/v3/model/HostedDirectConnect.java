package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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
     * 操作状态，合法值是：ACTIVE， ERROR，PENDING_CREATE，PENDING_UPDATE。ACTIVE：虚拟网关正常ERROR： 虚拟网关异常PENDING_CREATE：创建中PENDING_UPDATE：更新中
     */
    public static final class StatusEnum {

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");

        /**
         * Enum PAID for value: "PAID"
         */
        public static final StatusEnum PAID = new StatusEnum("PAID");

        /**
         * Enum APPLY for value: "APPLY"
         */
        public static final StatusEnum APPLY = new StatusEnum("APPLY");

        /**
         * Enum PENDING_SURVEY for value: "PENDING_SURVEY"
         */
        public static final StatusEnum PENDING_SURVEY = new StatusEnum("PENDING_SURVEY");

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
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final StatusEnum DENY = new StatusEnum("DENY");

        /**
         * Enum PENDING_PAY for value: "PENDING_PAY"
         */
        public static final StatusEnum PENDING_PAY = new StatusEnum("PENDING_PAY");

        /**
         * Enum ORDERING for value: "ORDERING"
         */
        public static final StatusEnum ORDERING = new StatusEnum("ORDERING");

        /**
         * Enum ACCEPT for value: "ACCEPT"
         */
        public static final StatusEnum ACCEPT = new StatusEnum("ACCEPT");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final StatusEnum REJECTED = new StatusEnum("REJECTED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILD", BUILD);
            map.put("PAID", PAID);
            map.put("APPLY", APPLY);
            map.put("PENDING_SURVEY", PENDING_SURVEY);
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            map.put("ERROR", ERROR);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("DELETED", DELETED);
            map.put("DENY", DENY);
            map.put("PENDING_PAY", PENDING_PAY);
            map.put("ORDERING", ORDERING);
            map.put("ACCEPT", ACCEPT);
            map.put("REJECTED", REJECTED);
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

    private String applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    /**
     * 物理专线的运营商操作状态，合法值是：ACTIVE， DOWN
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
     * 物理专线名字
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
     * 物理专线的描述信息
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
     * 物理专线接入带宽，单位Mbps。
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
     * 物理专线对端所在的物理位置，省/市/街道或IDC名字。
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
     * 操作状态，合法值是：ACTIVE， ERROR，PENDING_CREATE，PENDING_UPDATE。ACTIVE：虚拟网关正常ERROR： 虚拟网关异常PENDING_CREATE：创建中PENDING_UPDATE：更新中
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public HostedDirectConnect withApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 物理专线申请时间
     * @return applyTime
     */
    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public HostedDirectConnect withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 物理专线创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public HostedDirectConnect withProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
        return this;
    }

    /**
     * 物理专线的运营商操作状态，合法值是：ACTIVE， DOWN
     * @return providerStatus
     */
    public ProviderStatusEnum getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
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
            && Objects.equals(this.providerStatus, that.providerStatus);
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
            providerStatus);
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
