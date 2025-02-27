package com.huaweicloud.sdk.elb.v2.model;

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
 * 负载均衡器响应体
 */
public class LoadbalancerResp {

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
    @JsonProperty(value = "vip_subnet_id")

    private String vipSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_port_id")

    private String vipPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<ResourceList> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<ResourceList> pools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    /**
     * 负载均衡器的操作状态
     */
    public static final class OperatingStatusEnum {

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final OperatingStatusEnum ONLINE = new OperatingStatusEnum("ONLINE");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final OperatingStatusEnum OFFLINE = new OperatingStatusEnum("OFFLINE");

        /**
         * Enum DEGRADED for value: "DEGRADED"
         */
        public static final OperatingStatusEnum DEGRADED = new OperatingStatusEnum("DEGRADED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final OperatingStatusEnum DISABLED = new OperatingStatusEnum("DISABLED");

        /**
         * Enum NO_MONITOR for value: "NO_MONITOR"
         */
        public static final OperatingStatusEnum NO_MONITOR = new OperatingStatusEnum("NO_MONITOR");

        private static final Map<String, OperatingStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatingStatusEnum> createStaticFields() {
            Map<String, OperatingStatusEnum> map = new HashMap<>();
            map.put("ONLINE", ONLINE);
            map.put("OFFLINE", OFFLINE);
            map.put("DEGRADED", DEGRADED);
            map.put("DISABLED", DISABLED);
            map.put("NO_MONITOR", NO_MONITOR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperatingStatusEnum(String value) {
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
        public static OperatingStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperatingStatusEnum(value));
        }

        public static OperatingStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperatingStatusEnum) {
                return this.value.equals(((OperatingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private OperatingStatusEnum operatingStatus;

    /**
     * 负载均衡器的配置状态
     */
    public static final class ProvisioningStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final ProvisioningStatusEnum ACTIVE = new ProvisioningStatusEnum("ACTIVE");

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final ProvisioningStatusEnum PENDING_CREATE = new ProvisioningStatusEnum("PENDING_CREATE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ProvisioningStatusEnum ERROR = new ProvisioningStatusEnum("ERROR");

        private static final Map<String, ProvisioningStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProvisioningStatusEnum> createStaticFields() {
            Map<String, ProvisioningStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProvisioningStatusEnum(String value) {
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
        public static ProvisioningStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProvisioningStatusEnum(value));
        }

        public static ProvisioningStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProvisioningStatusEnum) {
                return this.value.equals(((ProvisioningStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private ProvisioningStatusEnum provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<PublicIpInfo> publicips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_scene")

    private String frozenScene;

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护
     */
    public static final class ProtectionStatusEnum {

        /**
         * Enum NONPROTECTION for value: "nonProtection"
         */
        public static final ProtectionStatusEnum NONPROTECTION = new ProtectionStatusEnum("nonProtection");

        /**
         * Enum CONSOLEPROTECTION for value: "consoleProtection"
         */
        public static final ProtectionStatusEnum CONSOLEPROTECTION = new ProtectionStatusEnum("consoleProtection");

        private static final Map<String, ProtectionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionStatusEnum> createStaticFields() {
            Map<String, ProtectionStatusEnum> map = new HashMap<>();
            map.put("nonProtection", NONPROTECTION);
            map.put("consoleProtection", CONSOLEPROTECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionStatusEnum(String value) {
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
        public static ProtectionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionStatusEnum(value));
        }

        public static ProtectionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionStatusEnum) {
                return this.value.equals(((ProtectionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private ProtectionStatusEnum protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private String protectionReason;

    public LoadbalancerResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 负载均衡器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadbalancerResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 负载均衡器所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public LoadbalancerResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadbalancerResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 负载均衡器的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LoadbalancerResp withVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
        return this;
    }

    /**
     * 负载均衡器所在的子网的IPv4子网ID。仅支持内网类型。
     * @return vipSubnetId
     */
    public String getVipSubnetId() {
        return vipSubnetId;
    }

    public void setVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
    }

    public LoadbalancerResp withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    /**
     * 负载均衡器虚拟IP对应的端口ID
     * @return vipPortId
     */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    public LoadbalancerResp withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * 负载均衡器的虚拟IP。
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public LoadbalancerResp withListeners(List<ResourceList> listeners) {
        this.listeners = listeners;
        return this;
    }

    public LoadbalancerResp addListenersItem(ResourceList listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadbalancerResp withListeners(Consumer<List<ResourceList>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 负载均衡器关联的监听器ID的列表
     * @return listeners
     */
    public List<ResourceList> getListeners() {
        return listeners;
    }

    public void setListeners(List<ResourceList> listeners) {
        this.listeners = listeners;
    }

    public LoadbalancerResp withPools(List<ResourceList> pools) {
        this.pools = pools;
        return this;
    }

    public LoadbalancerResp addPoolsItem(ResourceList poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public LoadbalancerResp withPools(Consumer<List<ResourceList>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 负载均衡器关联的后端云服务器组ID的列表。
     * @return pools
     */
    public List<ResourceList> getPools() {
        return pools;
    }

    public void setPools(List<ResourceList> pools) {
        this.pools = pools;
    }

    public LoadbalancerResp withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 负载均衡器的供应者名称。只支持vlb
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public LoadbalancerResp withOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /**
     * 负载均衡器的操作状态
     * @return operatingStatus
     */
    public OperatingStatusEnum getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(OperatingStatusEnum operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public LoadbalancerResp withProvisioningStatus(ProvisioningStatusEnum provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 负载均衡器的配置状态
     * @return provisioningStatus
     */
    public ProvisioningStatusEnum getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(ProvisioningStatusEnum provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadbalancerResp withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 负载均衡器的管理状态。只支持设定为true，该字段的值无实际意义。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public LoadbalancerResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 负载均衡器的创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public LoadbalancerResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 负载均衡器的更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LoadbalancerResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 负载均衡器的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public LoadbalancerResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 负载均衡器所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public LoadbalancerResp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public LoadbalancerResp addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public LoadbalancerResp withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 负载均衡器的标签列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public LoadbalancerResp withPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
        return this;
    }

    public LoadbalancerResp addPublicipsItem(PublicIpInfo publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public LoadbalancerResp withPublicips(Consumer<List<PublicIpInfo>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 负载均衡器绑定的公网IP。只支持绑定一个公网IP。
     * @return publicips
     */
    public List<PublicIpInfo> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
    }

    public LoadbalancerResp withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 收费模式。取值：  flavor：按规格计费 lcu：按使用量计费 说明：弹性扩缩容实例该字段无效，按lcu收费；包周期实例该字段无效，按预付费收费。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public LoadbalancerResp withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * 资源账单信息，取值：     - 空：按需计费。     - 非空：包周期计费，  包周期计费billing_info字段的格式为：order_id:product_id:region_id:project_id。
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public LoadbalancerResp withFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
        return this;
    }

    /**
     * 负载均衡器的冻结场景。若负载均衡器有多个冻结场景，用逗号分隔。取值：  POLICE：公安冻结场景。 ILLEGAL：违规冻结场景。 VERIFY：客户未实名认证冻结场景。 PARTNER：合作伙伴冻结（合作伙伴冻结子客户资源）。 AREAR：欠费冻结场景。
     * @return frozenScene
     */
    public String getFrozenScene() {
        return frozenScene;
    }

    public void setFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
    }

    public LoadbalancerResp withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public LoadbalancerResp withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * 设置保护的原因 >仅当protection_status为consoleProtection时有效。
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadbalancerResp that = (LoadbalancerResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.vipSubnetId, that.vipSubnetId) && Objects.equals(this.vipPortId, that.vipPortId)
            && Objects.equals(this.vipAddress, that.vipAddress) && Objects.equals(this.listeners, that.listeners)
            && Objects.equals(this.pools, that.pools) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.operatingStatus, that.operatingStatus)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.publicips, that.publicips) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.billingInfo, that.billingInfo) && Objects.equals(this.frozenScene, that.frozenScene)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            vipSubnetId,
            vipPortId,
            vipAddress,
            listeners,
            pools,
            provider,
            operatingStatus,
            provisioningStatus,
            adminStateUp,
            createdAt,
            updatedAt,
            enterpriseProjectId,
            projectId,
            tags,
            publicips,
            chargeMode,
            billingInfo,
            frozenScene,
            protectionStatus,
            protectionReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadbalancerResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vipSubnetId: ").append(toIndentedString(vipSubnetId)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    frozenScene: ").append(toIndentedString(frozenScene)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
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
