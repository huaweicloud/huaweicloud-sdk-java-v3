package com.huaweicloud.sdk.vpc.v2.model;

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
 * network对象列表
 */
public class NeutronNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 功能说明：网络状态 取值范围：ACTIVE，DOWN，BUILD或ERROR
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            map.put("BUILD", BUILD);
            map.put("ERROR", ERROR);
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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<String> subnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router:external")

    private Boolean routerExternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider:network_type")

    private String providerNetworkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_hints")

    private List<String> availabilityZoneHints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<String> availabilityZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_security_enabled")

    private Boolean portSecurityEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_domain")

    private String dnsDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public NeutronNetwork withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网络ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeutronNetwork withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 功能说明：网络状态 取值范围：ACTIVE，DOWN，BUILD或ERROR
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NeutronNetwork withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：网络名称 取值范围：0-255个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronNetwork withSubnets(List<String> subnets) {
        this.subnets = subnets;
        return this;
    }

    public NeutronNetwork addSubnetsItem(String subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public NeutronNetwork withSubnets(Consumer<List<String>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * 功能说明：网络关联的子网ID列表 约束：一个network仅支持关联一个 subnet。
     * @return subnets
     */
    public List<String> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<String> subnets) {
        this.subnets = subnets;
    }

    public NeutronNetwork withRouterExternal(Boolean routerExternal) {
        this.routerExternal = routerExternal;
        return this;
    }

    /**
     * 功能说明：扩展属性，是否外部网络 取值范围：true、false 约束：不支持设置和更新
     * @return routerExternal
     */
    public Boolean getRouterExternal() {
        return routerExternal;
    }

    public void setRouterExternal(Boolean routerExternal) {
        this.routerExternal = routerExternal;
    }

    public NeutronNetwork withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 功能说明：资源的管理状态 取值范围：true、false 约束：只支持true
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public NeutronNetwork withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 功能说明：是否支持跨租户共享此资源 取值范围：true(共享)、false(非共享) 约束：不支持设置和更新
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public NeutronNetwork withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronNetwork withProviderNetworkType(String providerNetworkType) {
        this.providerNetworkType = providerNetworkType;
        return this;
    }

    /**
     * 功能说明：扩展属性，网络类型（支持vxlan, geneve） 取值范围：vxlan，geneve
     * @return providerNetworkType
     */
    public String getProviderNetworkType() {
        return providerNetworkType;
    }

    public void setProviderNetworkType(String providerNetworkType) {
        this.providerNetworkType = providerNetworkType;
    }

    public NeutronNetwork withAvailabilityZoneHints(List<String> availabilityZoneHints) {
        this.availabilityZoneHints = availabilityZoneHints;
        return this;
    }

    public NeutronNetwork addAvailabilityZoneHintsItem(String availabilityZoneHintsItem) {
        if (this.availabilityZoneHints == null) {
            this.availabilityZoneHints = new ArrayList<>();
        }
        this.availabilityZoneHints.add(availabilityZoneHintsItem);
        return this;
    }

    public NeutronNetwork withAvailabilityZoneHints(Consumer<List<String>> availabilityZoneHintsSetter) {
        if (this.availabilityZoneHints == null) {
            this.availabilityZoneHints = new ArrayList<>();
        }
        availabilityZoneHintsSetter.accept(this.availabilityZoneHints);
        return this;
    }

    /**
     * 功能说明：本网络的候选可用域
     * @return availabilityZoneHints
     */
    public List<String> getAvailabilityZoneHints() {
        return availabilityZoneHints;
    }

    public void setAvailabilityZoneHints(List<String> availabilityZoneHints) {
        this.availabilityZoneHints = availabilityZoneHints;
    }

    public NeutronNetwork withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public NeutronNetwork addAvailabilityZonesItem(String availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public NeutronNetwork withAvailabilityZones(Consumer<List<String>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * 功能说明：本网络的可用域。 取值范围：当前region下的可用域
     * @return availabilityZones
     */
    public List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public NeutronNetwork withPortSecurityEnabled(Boolean portSecurityEnabled) {
        this.portSecurityEnabled = portSecurityEnabled;
        return this;
    }

    /**
     * 功能说明：端口安全使能标记 取值范围：true（启用）、false（禁用） 约束：如果不使能，则network下所有虚机的安全组和dhcp防欺骗不生效
     * @return portSecurityEnabled
     */
    public Boolean getPortSecurityEnabled() {
        return portSecurityEnabled;
    }

    public void setPortSecurityEnabled(Boolean portSecurityEnabled) {
        this.portSecurityEnabled = portSecurityEnabled;
    }

    public NeutronNetwork withDnsDomain(String dnsDomain) {
        this.dnsDomain = dnsDomain;
        return this;
    }

    /**
     * 功能说明：默认内网DNS域地址 约束：系统自动生成维护，不支持设置和更新
     * @return dnsDomain
     */
    public String getDnsDomain() {
        return dnsDomain;
    }

    public void setDnsDomain(String dnsDomain) {
        this.dnsDomain = dnsDomain;
    }

    public NeutronNetwork withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NeutronNetwork withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：资源创建UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NeutronNetwork withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 功能说明：资源更新UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronNetwork that = (NeutronNetwork) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.name, that.name) && Objects.equals(this.subnets, that.subnets)
            && Objects.equals(this.routerExternal, that.routerExternal)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.shared, that.shared)
            && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.providerNetworkType, that.providerNetworkType)
            && Objects.equals(this.availabilityZoneHints, that.availabilityZoneHints)
            && Objects.equals(this.availabilityZones, that.availabilityZones)
            && Objects.equals(this.portSecurityEnabled, that.portSecurityEnabled)
            && Objects.equals(this.dnsDomain, that.dnsDomain) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            name,
            subnets,
            routerExternal,
            adminStateUp,
            shared,
            tenantId,
            providerNetworkType,
            availabilityZoneHints,
            availabilityZones,
            portSecurityEnabled,
            dnsDomain,
            projectId,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronNetwork {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
        sb.append("    routerExternal: ").append(toIndentedString(routerExternal)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    providerNetworkType: ").append(toIndentedString(providerNetworkType)).append("\n");
        sb.append("    availabilityZoneHints: ").append(toIndentedString(availabilityZoneHints)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    portSecurityEnabled: ").append(toIndentedString(portSecurityEnabled)).append("\n");
        sb.append("    dnsDomain: ").append(toIndentedString(dnsDomain)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
