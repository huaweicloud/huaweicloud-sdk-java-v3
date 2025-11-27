package com.huaweicloud.sdk.elb.v3.model;

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
 * 负载均衡器的详细信息。
 */
public class RecycleLoadBalancer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_terminate_time")

    private String autoTerminateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<PoolRef> pools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<ListenerRef> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_subnet_cidr_id")

    private String vipSubnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_port_id")

    private String vipPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guaranteed")

    private Boolean guaranteed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eips")

    private List<EipInfo> eips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private String ipv6VipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_virsubnet_id")

    private String ipv6VipVirsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_port_id")

    private String ipv6VipPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_list")

    private List<String> availabilityZoneList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_flavor_id")

    private String l4FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_scale_flavor_id")

    private String l4ScaleFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private String l7FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_scale_flavor_id")

    private String l7ScaleFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<PublicIpInfo> publicips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eips")

    private List<GlobalEipInfo> globalEips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_ids")

    private List<String> elbVirsubnetIds = null;

    /**
     * **参数解释**：下联面子网类型。  **取值范围**： - ipv4：ipv4 - dualstack：双栈
     */
    public static final class ElbVirsubnetTypeEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final ElbVirsubnetTypeEnum IPV4 = new ElbVirsubnetTypeEnum("ipv4");

        /**
         * Enum DUALSTACK for value: "dualstack"
         */
        public static final ElbVirsubnetTypeEnum DUALSTACK = new ElbVirsubnetTypeEnum("dualstack");

        private static final Map<String, ElbVirsubnetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ElbVirsubnetTypeEnum> createStaticFields() {
            Map<String, ElbVirsubnetTypeEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("dualstack", DUALSTACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ElbVirsubnetTypeEnum(String value) {
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
        public static ElbVirsubnetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ElbVirsubnetTypeEnum(value));
        }

        public static ElbVirsubnetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ElbVirsubnetTypeEnum) {
                return this.value.equals(((ElbVirsubnetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_type")

    private ElbVirsubnetTypeEnum elbVirsubnetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_target_enable")

    private Boolean ipTargetEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_scene")

    private String frozenScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth")

    private BandwidthRef ipv6Bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletion_protection_enable")

    private Boolean deletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private AutoscalingRef autoscaling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_failure_action")

    private String wafFailureAction;

    /**
     * **参数解释**：修改保护状态。  **取值范围**： - nonProtection: 不保护。 - consoleProtection: 控制台修改保护。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private String logTopicId;

    public RecycleLoadBalancer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：负载均衡器ID。  **取值范围**：不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecycleLoadBalancer withAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
        return this;
    }

    /**
     * **参数解释**：回收站elb的自动到期销毁时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'  **取值范围**：不涉及
     * @return autoTerminateTime
     */
    public String getAutoTerminateTime() {
        return autoTerminateTime;
    }

    public void setAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
    }

    public RecycleLoadBalancer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：负载均衡器描述信息。  **取值范围**：不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecycleLoadBalancer withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的配置状态。  **取值范围**： - RECYCLING：处于回收站用中。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public RecycleLoadBalancer withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的启用状态。  **取值范围**： - true ：启用。 - false：停用。  [不支持该字段，请勿使用。](tag:dt)
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public RecycleLoadBalancer withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的生产者名称。固定为vlb。  **取值范围**：不涉及
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public RecycleLoadBalancer withPools(List<PoolRef> pools) {
        this.pools = pools;
        return this;
    }

    public RecycleLoadBalancer addPoolsItem(PoolRef poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public RecycleLoadBalancer withPools(Consumer<List<PoolRef>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * **参数解释**：负载均衡器直接关联的后端服务器组的ID列表。
     * @return pools
     */
    public List<PoolRef> getPools() {
        return pools;
    }

    public void setPools(List<PoolRef> pools) {
        this.pools = pools;
    }

    public RecycleLoadBalancer withListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
        return this;
    }

    public RecycleLoadBalancer addListenersItem(ListenerRef listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public RecycleLoadBalancer withListeners(Consumer<List<ListenerRef>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * **参数解释**：负载均衡器关联的监听器的ID列表。
     * @return listeners
     */
    public List<ListenerRef> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
    }

    public RecycleLoadBalancer withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的操作状态。  **取值范围**： - ONLINE：在线。 - FROZEN：已冻结。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public RecycleLoadBalancer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的名称。  **取值范围**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecycleLoadBalancer withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器所属的项目ID。  **取值范围**：不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RecycleLoadBalancer withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器所在子网的IPv4子网ID，也称为该负载均衡器实例的前端子网。  **取值范围**：不涉及
     * @return vipSubnetCidrId
     */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public RecycleLoadBalancer withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的IPv4私网IP地址。  **取值范围**：不涉及
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public RecycleLoadBalancer withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的IPv4对应的port ID。 [创建弹性负载均衡时，会自动为负载均衡创建一个port并关联一个默认的安全组，这个安全组对所有流量不生效。 ](tag:dt,hcso_dt)  **取值范围**：不涉及
     * @return vipPortId
     */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    public RecycleLoadBalancer withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public RecycleLoadBalancer addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public RecycleLoadBalancer withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：负载均衡的标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public RecycleLoadBalancer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的创建时间。  **取值范围**： 格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecycleLoadBalancer withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的更新时间。  **取值范围**： 格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RecycleLoadBalancer withGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    /**
     * **参数解释**：是否独享型LB。  **取值范围**： - false：共享型。 - true：独享型。
     * @return guaranteed
     */
    public Boolean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    public RecycleLoadBalancer withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器所在VPC ID。  **取值范围**：不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public RecycleLoadBalancer withEips(List<EipInfo> eips) {
        this.eips = eips;
        return this;
    }

    public RecycleLoadBalancer addEipsItem(EipInfo eipsItem) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        this.eips.add(eipsItem);
        return this;
    }

    public RecycleLoadBalancer withEips(Consumer<List<EipInfo>> eipsSetter) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /**
     * **参数解释**：负载均衡器绑定的EIP。 注：该字段与publicips一致。
     * @return eips
     */
    public List<EipInfo> getEips() {
        return eips;
    }

    public void setEips(List<EipInfo> eips) {
        this.eips = eips;
    }

    public RecycleLoadBalancer withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    /**
     * **参数解释**：双栈类型负载均衡器的IPv6地址。  **取值范围**：不涉及  [不支持IPv6，请勿使用。](tag:dt)
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public RecycleLoadBalancer withIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    /**
     * **参数解释**：双栈类型负载均衡器所在子网的IPv6网络ID，也称为该负载均衡器实例的前端子网。  **取值范围**：不涉及  [不支持IPv6，请勿使用。](tag:dt)
     * @return ipv6VipVirsubnetId
     */
    public String getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    public RecycleLoadBalancer withIpv6VipPortId(String ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
        return this;
    }

    /**
     * **参数解释**：双栈类型负载均衡器的IPv6对应的port ID。  **取值范围**：不涉及  [不支持IPv6，请勿使用。](tag:dt)
     * @return ipv6VipPortId
     */
    public String getIpv6VipPortId() {
        return ipv6VipPortId;
    }

    public void setIpv6VipPortId(String ipv6VipPortId) {
        this.ipv6VipPortId = ipv6VipPortId;
    }

    public RecycleLoadBalancer withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    public RecycleLoadBalancer addAvailabilityZoneListItem(String availabilityZoneListItem) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public RecycleLoadBalancer withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * **参数解释**：负载均衡器所在的可用区列表。  **取值范围**：不涉及
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    public RecycleLoadBalancer withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**：资源所属的企业项目ID。  **取值范围**： - \"0\"：表示资源属于default企业项目。 - UUID格式的字符串，表示非默认企业项目。  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RecycleLoadBalancer withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * **参数解释**：资源账单信息。  **取值范围**： - 空：按需计费。 [- 非空：包周期计费，  包周期计费billing_info字段的格式为：order_id:product_id:region_id:project_id，如： CS2107161019CDJZZ:OFFI569702121789763584:az:057ef081eb00d2732fd1c01a9be75e6f  不支持该字段，请勿使用](tag:hws_eu,g42,hk_g42,dt,hcso_dt,hcso,hk_vdf,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public RecycleLoadBalancer withL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    /**
     * **参数解释**：网络型规格ID。 对于弹性扩缩容实例，表示上限规格。  **取值范围**：不涉及 [HCSO场景下所有LB实例共享带宽，该字段无效，请勿使用。](tag:hcso,hk_vdf,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return l4FlavorId
     */
    public String getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    public RecycleLoadBalancer withL4ScaleFlavorId(String l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
        return this;
    }

    /**
     * **参数解释**：四层弹性Flavor ID。  **取值范围**：不涉及  不支持该字段，请勿使用。
     * @return l4ScaleFlavorId
     */
    public String getL4ScaleFlavorId() {
        return l4ScaleFlavorId;
    }

    public void setL4ScaleFlavorId(String l4ScaleFlavorId) {
        this.l4ScaleFlavorId = l4ScaleFlavorId;
    }

    public RecycleLoadBalancer withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    /**
     * **参数解释**：应用型ID。 对于弹性扩缩容实例，表示上限规格ID。  **取值范围**：不涉及  [HCSO场景下所有LB实例共享带宽，该字段无效，请勿使用。](tag:hcso,hk_vdf,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public RecycleLoadBalancer withL7ScaleFlavorId(String l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
        return this;
    }

    /**
     * **参数解释**：七层弹性Flavor ID。  **取值范围**：不涉及  不支持该字段，请勿使用。
     * @return l7ScaleFlavorId
     */
    public String getL7ScaleFlavorId() {
        return l7ScaleFlavorId;
    }

    public void setL7ScaleFlavorId(String l7ScaleFlavorId) {
        this.l7ScaleFlavorId = l7ScaleFlavorId;
    }

    public RecycleLoadBalancer withPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
        return this;
    }

    public RecycleLoadBalancer addPublicipsItem(PublicIpInfo publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public RecycleLoadBalancer withPublicips(Consumer<List<PublicIpInfo>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * **参数解释**：负载均衡器绑定的公网IP。只支持绑定一个公网IP。  注：该字段与eips一致。
     * @return publicips
     */
    public List<PublicIpInfo> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
    }

    public RecycleLoadBalancer withGlobalEips(List<GlobalEipInfo> globalEips) {
        this.globalEips = globalEips;
        return this;
    }

    public RecycleLoadBalancer addGlobalEipsItem(GlobalEipInfo globalEipsItem) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        this.globalEips.add(globalEipsItem);
        return this;
    }

    public RecycleLoadBalancer withGlobalEips(Consumer<List<GlobalEipInfo>> globalEipsSetter) {
        if (this.globalEips == null) {
            this.globalEips = new ArrayList<>();
        }
        globalEipsSetter.accept(this.globalEips);
        return this;
    }

    /**
     * **参数解释**：负载均衡器绑定的global eip。  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42,dt,hcso_dt,hk_vdf,fcs,ctc,ocb,hws_ocb)
     * @return globalEips
     */
    public List<GlobalEipInfo> getGlobalEips() {
        return globalEips;
    }

    public void setGlobalEips(List<GlobalEipInfo> globalEips) {
        this.globalEips = globalEips;
    }

    public RecycleLoadBalancer withElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
        return this;
    }

    public RecycleLoadBalancer addElbVirsubnetIdsItem(String elbVirsubnetIdsItem) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        this.elbVirsubnetIds.add(elbVirsubnetIdsItem);
        return this;
    }

    public RecycleLoadBalancer withElbVirsubnetIds(Consumer<List<String>> elbVirsubnetIdsSetter) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /**
     * **参数解释**：下联面子网的网络ID列表。  **取值范围**：不涉及
     * @return elbVirsubnetIds
     */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
    }

    public RecycleLoadBalancer withElbVirsubnetType(ElbVirsubnetTypeEnum elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
        return this;
    }

    /**
     * **参数解释**：下联面子网类型。  **取值范围**： - ipv4：ipv4 - dualstack：双栈
     * @return elbVirsubnetType
     */
    public ElbVirsubnetTypeEnum getElbVirsubnetType() {
        return elbVirsubnetType;
    }

    public void setElbVirsubnetType(ElbVirsubnetTypeEnum elbVirsubnetType) {
        this.elbVirsubnetType = elbVirsubnetType;
    }

    public RecycleLoadBalancer withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    /**
     * **参数解释**：是否启用IP类型后端转发。 [开启IP类型后端转发后，后端服务器组不仅支持添加云上VPC内的服务器，还支持添加其他VPC、其他公有云、云下数据中心的服务器。](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,dt,hcso_dt,hws_eu) [开启IP类型后端转发后，后端服务器组不仅支持添加云上VPC内的服务器，还支持添加其他VPC、云下数据中心的服务器。](tag:fcs)  **取值范围**： - true：开启。 - false：不开启。  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return ipTargetEnable
     */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public RecycleLoadBalancer withFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的冻结场景。 [若负载均衡器有多个冻结场景，用逗号分隔。  **取值范围**： [- POLICE：公安冻结场景。](tag:hws) - ILLEGAL：违规冻结场景。 - VERIFY：客户未实名认证冻结场景。 - PARTNER：合作伙伴冻结（合作伙伴冻结子客户资源）。 - AREAR：欠费冻结场景。](tag:hws,hws_hk)  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42,dt,hcso_dt,ocb,hws_ocb)
     * @return frozenScene
     */
    public String getFrozenScene() {
        return frozenScene;
    }

    public void setFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
    }

    public RecycleLoadBalancer withIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public RecycleLoadBalancer withIpv6Bandwidth(Consumer<BandwidthRef> ipv6BandwidthSetter) {
        if (this.ipv6Bandwidth == null) {
            this.ipv6Bandwidth = new BandwidthRef();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }

        return this;
    }

    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public BandwidthRef getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }

    public RecycleLoadBalancer withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    /**
     * **参数解释**：是否开启删除保护。  **取值范围**： - false：不开启。 - true：开启。  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42)  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return deletionProtectionEnable
     */
    public Boolean getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
    }

    public RecycleLoadBalancer withAutoscaling(AutoscalingRef autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public RecycleLoadBalancer withAutoscaling(Consumer<AutoscalingRef> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new AutoscalingRef();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    /**
     * Get autoscaling
     * @return autoscaling
     */
    public AutoscalingRef getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(AutoscalingRef autoscaling) {
        this.autoscaling = autoscaling;
    }

    public RecycleLoadBalancer withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * **参数解释**：LB所属AZ组。  **取值范围**：不涉及
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public RecycleLoadBalancer withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * **参数解释**：负载均衡器实例的计费模式。  **取值范围**： - flavor：按规格计费 - lcu：按使用量计费 - 空值：若是共享型表示免费实例。若是独享型则与flavor模式一致，都是按规格计费。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public RecycleLoadBalancer withWafFailureAction(String wafFailureAction) {
        this.wafFailureAction = wafFailureAction;
        return this;
    }

    /**
     * **参数解释**：WAF故障时的流量处理策略。  **取值范围**：discard:丢弃，forward: 转发到后端。  [不支持该字段，请勿使用。](tag:hws_eu,hws_test,hcs,hcs_sm,hcso,hk_vdf,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b,hcso_dt,dt,ocb,ctc,cmcc,tm,ct,sbc,g42,hws_ocb,hk_sbc,hk_tm,hk_g42)
     * @return wafFailureAction
     */
    public String getWafFailureAction() {
        return wafFailureAction;
    }

    public void setWafFailureAction(String wafFailureAction) {
        this.wafFailureAction = wafFailureAction;
    }

    public RecycleLoadBalancer withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * **参数解释**：修改保护状态。  **取值范围**： - nonProtection: 不保护。 - consoleProtection: 控制台修改保护。
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public RecycleLoadBalancer withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * **参数解释**：设置保护的原因。作为protection_status的转态设置的原因。  **取值范围**：除<和>外通用Unicode字符集字符，最大255个字符。
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    public RecycleLoadBalancer withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * **参数解释**：LB所绑定的logtank对应的group id。  **取值范围**：不涉及
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public RecycleLoadBalancer withLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    /**
     * **参数解释**：LB所绑定的logtank对应的topic id。  **取值范围**：不涉及
     * @return logTopicId
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecycleLoadBalancer that = (RecycleLoadBalancer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.autoTerminateTime, that.autoTerminateTime)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.pools, that.pools) && Objects.equals(this.listeners, that.listeners)
            && Objects.equals(this.operatingStatus, that.operatingStatus) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.vipSubnetCidrId, that.vipSubnetCidrId)
            && Objects.equals(this.vipAddress, that.vipAddress) && Objects.equals(this.vipPortId, that.vipPortId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.guaranteed, that.guaranteed)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.eips, that.eips)
            && Objects.equals(this.ipv6VipAddress, that.ipv6VipAddress)
            && Objects.equals(this.ipv6VipVirsubnetId, that.ipv6VipVirsubnetId)
            && Objects.equals(this.ipv6VipPortId, that.ipv6VipPortId)
            && Objects.equals(this.availabilityZoneList, that.availabilityZoneList)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.billingInfo, that.billingInfo) && Objects.equals(this.l4FlavorId, that.l4FlavorId)
            && Objects.equals(this.l4ScaleFlavorId, that.l4ScaleFlavorId)
            && Objects.equals(this.l7FlavorId, that.l7FlavorId)
            && Objects.equals(this.l7ScaleFlavorId, that.l7ScaleFlavorId)
            && Objects.equals(this.publicips, that.publicips) && Objects.equals(this.globalEips, that.globalEips)
            && Objects.equals(this.elbVirsubnetIds, that.elbVirsubnetIds)
            && Objects.equals(this.elbVirsubnetType, that.elbVirsubnetType)
            && Objects.equals(this.ipTargetEnable, that.ipTargetEnable)
            && Objects.equals(this.frozenScene, that.frozenScene)
            && Objects.equals(this.ipv6Bandwidth, that.ipv6Bandwidth)
            && Objects.equals(this.deletionProtectionEnable, that.deletionProtectionEnable)
            && Objects.equals(this.autoscaling, that.autoscaling)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.wafFailureAction, that.wafFailureAction)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logTopicId, that.logTopicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            autoTerminateTime,
            description,
            provisioningStatus,
            adminStateUp,
            provider,
            pools,
            listeners,
            operatingStatus,
            name,
            projectId,
            vipSubnetCidrId,
            vipAddress,
            vipPortId,
            tags,
            createdAt,
            updatedAt,
            guaranteed,
            vpcId,
            eips,
            ipv6VipAddress,
            ipv6VipVirsubnetId,
            ipv6VipPortId,
            availabilityZoneList,
            enterpriseProjectId,
            billingInfo,
            l4FlavorId,
            l4ScaleFlavorId,
            l7FlavorId,
            l7ScaleFlavorId,
            publicips,
            globalEips,
            elbVirsubnetIds,
            elbVirsubnetType,
            ipTargetEnable,
            frozenScene,
            ipv6Bandwidth,
            deletionProtectionEnable,
            autoscaling,
            publicBorderGroup,
            chargeMode,
            wafFailureAction,
            protectionStatus,
            protectionReason,
            logGroupId,
            logTopicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleLoadBalancer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    autoTerminateTime: ").append(toIndentedString(autoTerminateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    ipv6VipPortId: ").append(toIndentedString(ipv6VipPortId)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l4ScaleFlavorId: ").append(toIndentedString(l4ScaleFlavorId)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    l7ScaleFlavorId: ").append(toIndentedString(l7ScaleFlavorId)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    globalEips: ").append(toIndentedString(globalEips)).append("\n");
        sb.append("    elbVirsubnetIds: ").append(toIndentedString(elbVirsubnetIds)).append("\n");
        sb.append("    elbVirsubnetType: ").append(toIndentedString(elbVirsubnetType)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    frozenScene: ").append(toIndentedString(frozenScene)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    wafFailureAction: ").append(toIndentedString(wafFailureAction)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
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
