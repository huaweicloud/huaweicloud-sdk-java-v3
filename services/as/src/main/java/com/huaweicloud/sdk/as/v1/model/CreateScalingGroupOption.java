package com.huaweicloud.sdk.as.v1.model;

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
 * 创建伸缩组请求
 */
public class CreateScalingGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_name")

    private String scalingGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_configuration_id")

    private String scalingConfigurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desire_instance_number")

    private Integer desireInstanceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_instance_number")

    private Integer minInstanceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_instance_number")

    private Integer maxInstanceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cool_down_time")

    private Integer coolDownTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_listener_id")

    private String lbListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lbaas_listeners")

    private List<LbaasListeners> lbaasListeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<Networks> networks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    /**
     * 伸缩组实例健康检查方式：ELB_AUDIT和NOVA_AUDIT。当伸缩组参数中设置负载均衡时，默认为ELB_AUDIT；否则默认为NOVA_AUDIT。ELB_AUDIT表示负载均衡健康检查方式，在有监听器的伸缩组中有效。NOVA_AUDIT表示弹性伸缩自带的健康检查方式。
     */
    public static final class HealthPeriodicAuditMethodEnum {

        /**
         * Enum ELB_AUDIT for value: "ELB_AUDIT"
         */
        public static final HealthPeriodicAuditMethodEnum ELB_AUDIT = new HealthPeriodicAuditMethodEnum("ELB_AUDIT");

        /**
         * Enum NOVA_AUDIT for value: "NOVA_AUDIT"
         */
        public static final HealthPeriodicAuditMethodEnum NOVA_AUDIT = new HealthPeriodicAuditMethodEnum("NOVA_AUDIT");

        private static final Map<String, HealthPeriodicAuditMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HealthPeriodicAuditMethodEnum> createStaticFields() {
            Map<String, HealthPeriodicAuditMethodEnum> map = new HashMap<>();
            map.put("ELB_AUDIT", ELB_AUDIT);
            map.put("NOVA_AUDIT", NOVA_AUDIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HealthPeriodicAuditMethodEnum(String value) {
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
        public static HealthPeriodicAuditMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new HealthPeriodicAuditMethodEnum(value));
        }

        public static HealthPeriodicAuditMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HealthPeriodicAuditMethodEnum) {
                return this.value.equals(((HealthPeriodicAuditMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_periodic_audit_method")

    private HealthPeriodicAuditMethodEnum healthPeriodicAuditMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_periodic_audit_time")

    private Integer healthPeriodicAuditTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_periodic_audit_grace_period")

    private Integer healthPeriodicAuditGracePeriod;

    /**
     * 伸缩组实例移除策略：OLD_CONFIG_OLD_INSTANCE（默认）：从根据“较早创建的配置”创建的实例中筛选出较早创建的实例被优先移除。OLD_CONFIG_NEW_INSTANCE：从根据“较早创建的配置”创建的实例中筛选出较新创建的实例被优先移除。OLD_INSTANCE：较早创建的实例被优先移除。NEW_INSTANCE：较新创建的实例将被优先移除。
     */
    public static final class InstanceTerminatePolicyEnum {

        /**
         * Enum OLD_CONFIG_OLD_INSTANCE for value: "OLD_CONFIG_OLD_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum OLD_CONFIG_OLD_INSTANCE =
            new InstanceTerminatePolicyEnum("OLD_CONFIG_OLD_INSTANCE");

        /**
         * Enum OLD_CONFIG_NEW_INSTANCE for value: "OLD_CONFIG_NEW_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum OLD_CONFIG_NEW_INSTANCE =
            new InstanceTerminatePolicyEnum("OLD_CONFIG_NEW_INSTANCE");

        /**
         * Enum OLD_INSTANCE for value: "OLD_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum OLD_INSTANCE = new InstanceTerminatePolicyEnum("OLD_INSTANCE");

        /**
         * Enum NEW_INSTANCE for value: "NEW_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum NEW_INSTANCE = new InstanceTerminatePolicyEnum("NEW_INSTANCE");

        private static final Map<String, InstanceTerminatePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTerminatePolicyEnum> createStaticFields() {
            Map<String, InstanceTerminatePolicyEnum> map = new HashMap<>();
            map.put("OLD_CONFIG_OLD_INSTANCE", OLD_CONFIG_OLD_INSTANCE);
            map.put("OLD_CONFIG_NEW_INSTANCE", OLD_CONFIG_NEW_INSTANCE);
            map.put("OLD_INSTANCE", OLD_INSTANCE);
            map.put("NEW_INSTANCE", NEW_INSTANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTerminatePolicyEnum(String value) {
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
        public static InstanceTerminatePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new InstanceTerminatePolicyEnum(value));
        }

        public static InstanceTerminatePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTerminatePolicyEnum) {
                return this.value.equals(((InstanceTerminatePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_terminate_policy")

    private InstanceTerminatePolicyEnum instanceTerminatePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifications")

    private List<String> notifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_publicip")

    private Boolean deletePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_volume")

    private Boolean deleteVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 伸缩组扩缩容时目标AZ选择的优先级策略：EQUILIBRIUM_DISTRIBUTE（默认）：均衡分布，云服务器扩缩容时优先保证available_zones列表中各AZ下虚拟机数量均衡，当无法在目标AZ下完成虚拟机扩容时，按照PICK_FIRST原则选择其他可用AZ。PICK_FIRST：选择优先，虚拟机扩缩容时目标AZ的选择按照available_zones列表的顺序进行优先级排序。
     */
    public static final class MultiAzPriorityPolicyEnum {

        /**
         * Enum EQUILIBRIUM_DISTRIBUTE for value: "EQUILIBRIUM_DISTRIBUTE"
         */
        public static final MultiAzPriorityPolicyEnum EQUILIBRIUM_DISTRIBUTE =
            new MultiAzPriorityPolicyEnum("EQUILIBRIUM_DISTRIBUTE");

        /**
         * Enum PICK_FIRST for value: "PICK_FIRST"
         */
        public static final MultiAzPriorityPolicyEnum PICK_FIRST = new MultiAzPriorityPolicyEnum("PICK_FIRST");

        private static final Map<String, MultiAzPriorityPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MultiAzPriorityPolicyEnum> createStaticFields() {
            Map<String, MultiAzPriorityPolicyEnum> map = new HashMap<>();
            map.put("EQUILIBRIUM_DISTRIBUTE", EQUILIBRIUM_DISTRIBUTE);
            map.put("PICK_FIRST", PICK_FIRST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MultiAzPriorityPolicyEnum(String value) {
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
        public static MultiAzPriorityPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MultiAzPriorityPolicyEnum(value));
        }

        public static MultiAzPriorityPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MultiAzPriorityPolicyEnum) {
                return this.value.equals(((MultiAzPriorityPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_az_priority_policy")

    private MultiAzPriorityPolicyEnum multiAzPriorityPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_agency_name")

    private String iamAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsSingleValue> tags = null;

    public CreateScalingGroupOption withScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }

    /**
     * 伸缩组名称(1-64个字符)，只能包含中文、字母、数字、下划线、中划线。
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return scalingGroupName;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    public CreateScalingGroupOption withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    /**
     * 伸缩配置ID，通过查询弹性伸缩配置列表接口获取。
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public CreateScalingGroupOption withDesireInstanceNumber(Integer desireInstanceNumber) {
        this.desireInstanceNumber = desireInstanceNumber;
        return this;
    }

    /**
     * 期望实例数量，默认值为最小实例数。最小实例数<=期望实例数<=最大实例数
     * @return desireInstanceNumber
     */
    public Integer getDesireInstanceNumber() {
        return desireInstanceNumber;
    }

    public void setDesireInstanceNumber(Integer desireInstanceNumber) {
        this.desireInstanceNumber = desireInstanceNumber;
    }

    public CreateScalingGroupOption withMinInstanceNumber(Integer minInstanceNumber) {
        this.minInstanceNumber = minInstanceNumber;
        return this;
    }

    /**
     * 最小实例数量，默认值为0。
     * @return minInstanceNumber
     */
    public Integer getMinInstanceNumber() {
        return minInstanceNumber;
    }

    public void setMinInstanceNumber(Integer minInstanceNumber) {
        this.minInstanceNumber = minInstanceNumber;
    }

    public CreateScalingGroupOption withMaxInstanceNumber(Integer maxInstanceNumber) {
        this.maxInstanceNumber = maxInstanceNumber;
        return this;
    }

    /**
     * 最大实例数量，默认值为0。
     * @return maxInstanceNumber
     */
    public Integer getMaxInstanceNumber() {
        return maxInstanceNumber;
    }

    public void setMaxInstanceNumber(Integer maxInstanceNumber) {
        this.maxInstanceNumber = maxInstanceNumber;
    }

    public CreateScalingGroupOption withCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
        return this;
    }

    /**
     * 冷却时间，取值范围0-86400，默认为300，单位是秒。 只针对告警策略生效，定时、周期策略和手动触发策略不受该参数限制。
     * maximum: 86400
     * @return coolDownTime
     */
    public Integer getCoolDownTime() {
        return coolDownTime;
    }

    public void setCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
    }

    public CreateScalingGroupOption withLbListenerId(String lbListenerId) {
        this.lbListenerId = lbListenerId;
        return this;
    }

    /**
     * 弹性负载均衡（经典型）监听器ID，最多支持绑定6个负载均衡监听器，多个负载均衡监听器ID以逗号分隔。首先使用vpc_id通过查询ELB服务负载均衡器列表接口获取负载均衡器的ID，详见《弹性负载均衡API参考》的“查询负载均衡器列表”，再使用该ID查询监听器列表获取，详见《弹性负载均衡API参考》的“查询监听器列表”。
     * @return lbListenerId
     */
    public String getLbListenerId() {
        return lbListenerId;
    }

    public void setLbListenerId(String lbListenerId) {
        this.lbListenerId = lbListenerId;
    }

    public CreateScalingGroupOption withLbaasListeners(List<LbaasListeners> lbaasListeners) {
        this.lbaasListeners = lbaasListeners;
        return this;
    }

    public CreateScalingGroupOption addLbaasListenersItem(LbaasListeners lbaasListenersItem) {
        if (this.lbaasListeners == null) {
            this.lbaasListeners = new ArrayList<>();
        }
        this.lbaasListeners.add(lbaasListenersItem);
        return this;
    }

    public CreateScalingGroupOption withLbaasListeners(Consumer<List<LbaasListeners>> lbaasListenersSetter) {
        if (this.lbaasListeners == null) {
            this.lbaasListeners = new ArrayList<>();
        }
        lbaasListenersSetter.accept(this.lbaasListeners);
        return this;
    }

    /**
     * 弹性负载均衡器（增强型）信息，最多支持绑定6个负载均衡。该字段与lb_listener_id互斥。
     * @return lbaasListeners
     */
    public List<LbaasListeners> getLbaasListeners() {
        return lbaasListeners;
    }

    public void setLbaasListeners(List<LbaasListeners> lbaasListeners) {
        this.lbaasListeners = lbaasListeners;
    }

    public CreateScalingGroupOption withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public CreateScalingGroupOption addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public CreateScalingGroupOption withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用分区信息。弹性伸缩活动中自动添加的云服务器会被创建在指定的可用区中。如果没有指定可用分区，会由系统自动指定可用分区。详情请参考地区和终端节点。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public CreateScalingGroupOption withNetworks(List<Networks> networks) {
        this.networks = networks;
        return this;
    }

    public CreateScalingGroupOption addNetworksItem(Networks networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public CreateScalingGroupOption withNetworks(Consumer<List<Networks>> networksSetter) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * 网络信息，最多支持选择5个子网，传入的第一个子网默认作为云服务器的主网卡。获取子网信息请参考[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)。
     * @return networks
     */
    public List<Networks> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Networks> networks) {
        this.networks = networks;
    }

    public CreateScalingGroupOption withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateScalingGroupOption addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateScalingGroupOption withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组信息，最多支持选择1个安全组。使用vpc_id通过查询VPC服务安全组列表接口获取，详见《虚拟私有云API参考》的“查询安全组列表”。当伸缩配置和伸缩组同时指定安全组时，将以伸缩配置中的安全组为准；当伸缩配置和伸缩组都没有指定安全组时，将使用默认安全组。为了使用灵活性更高，推荐在伸缩配置中指定安全组。
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CreateScalingGroupOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC信息，通过查询VPC服务VPC列表接口获取，详见《虚拟私有云API参考》的“查询VPC列表”。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateScalingGroupOption withHealthPeriodicAuditMethod(
        HealthPeriodicAuditMethodEnum healthPeriodicAuditMethod) {
        this.healthPeriodicAuditMethod = healthPeriodicAuditMethod;
        return this;
    }

    /**
     * 伸缩组实例健康检查方式：ELB_AUDIT和NOVA_AUDIT。当伸缩组参数中设置负载均衡时，默认为ELB_AUDIT；否则默认为NOVA_AUDIT。ELB_AUDIT表示负载均衡健康检查方式，在有监听器的伸缩组中有效。NOVA_AUDIT表示弹性伸缩自带的健康检查方式。
     * @return healthPeriodicAuditMethod
     */
    public HealthPeriodicAuditMethodEnum getHealthPeriodicAuditMethod() {
        return healthPeriodicAuditMethod;
    }

    public void setHealthPeriodicAuditMethod(HealthPeriodicAuditMethodEnum healthPeriodicAuditMethod) {
        this.healthPeriodicAuditMethod = healthPeriodicAuditMethod;
    }

    public CreateScalingGroupOption withHealthPeriodicAuditTime(Integer healthPeriodicAuditTime) {
        this.healthPeriodicAuditTime = healthPeriodicAuditTime;
        return this;
    }

    /**
     * 伸缩组实例的健康检查周期，可设置为1、5、15、60、180（分钟），若不设置该参数，默认为5。若设置为0，可以实现10秒级健康检查。
     * @return healthPeriodicAuditTime
     */
    public Integer getHealthPeriodicAuditTime() {
        return healthPeriodicAuditTime;
    }

    public void setHealthPeriodicAuditTime(Integer healthPeriodicAuditTime) {
        this.healthPeriodicAuditTime = healthPeriodicAuditTime;
    }

    public CreateScalingGroupOption withHealthPeriodicAuditGracePeriod(Integer healthPeriodicAuditGracePeriod) {
        this.healthPeriodicAuditGracePeriod = healthPeriodicAuditGracePeriod;
        return this;
    }

    /**
     * 伸缩组实例健康状况检查宽限期，取值范围0-86400，单位是秒。当实例加入伸缩组并且进入已启用状态后，健康状况检查宽限期才会启动，伸缩组会等健康状况检查宽限期结束后才检查实例的运行状况。当伸缩组实例健康检查方式为ELB_AUDIT时，该参数生效，若不设置该参数，默认为600秒。
     * maximum: 86400
     * @return healthPeriodicAuditGracePeriod
     */
    public Integer getHealthPeriodicAuditGracePeriod() {
        return healthPeriodicAuditGracePeriod;
    }

    public void setHealthPeriodicAuditGracePeriod(Integer healthPeriodicAuditGracePeriod) {
        this.healthPeriodicAuditGracePeriod = healthPeriodicAuditGracePeriod;
    }

    public CreateScalingGroupOption withInstanceTerminatePolicy(InstanceTerminatePolicyEnum instanceTerminatePolicy) {
        this.instanceTerminatePolicy = instanceTerminatePolicy;
        return this;
    }

    /**
     * 伸缩组实例移除策略：OLD_CONFIG_OLD_INSTANCE（默认）：从根据“较早创建的配置”创建的实例中筛选出较早创建的实例被优先移除。OLD_CONFIG_NEW_INSTANCE：从根据“较早创建的配置”创建的实例中筛选出较新创建的实例被优先移除。OLD_INSTANCE：较早创建的实例被优先移除。NEW_INSTANCE：较新创建的实例将被优先移除。
     * @return instanceTerminatePolicy
     */
    public InstanceTerminatePolicyEnum getInstanceTerminatePolicy() {
        return instanceTerminatePolicy;
    }

    public void setInstanceTerminatePolicy(InstanceTerminatePolicyEnum instanceTerminatePolicy) {
        this.instanceTerminatePolicy = instanceTerminatePolicy;
    }

    public CreateScalingGroupOption withNotifications(List<String> notifications) {
        this.notifications = notifications;
        return this;
    }

    public CreateScalingGroupOption addNotificationsItem(String notificationsItem) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    public CreateScalingGroupOption withNotifications(Consumer<List<String>> notificationsSetter) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        notificationsSetter.accept(this.notifications);
        return this;
    }

    /**
     * 通知方式：EMAIL为发送邮件通知。该通知方式即将被废除，建议给弹性伸缩组配置通知功能。详见通知。
     * @return notifications
     */
    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }

    public CreateScalingGroupOption withDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
        return this;
    }

    /**
     * 配置删除云服务器时是否删除云服务器绑定的弹性IP。取值为true或false，默认为false。true：删除云服务器时，会同时删除绑定在云服务器上的弹性IP。当弹性IP的计费方式为包年包月时，不会被删除。false：删除云服务器时，仅解绑定在云服务器上的弹性IP，不删除弹性IP。
     * @return deletePublicip
     */
    public Boolean getDeletePublicip() {
        return deletePublicip;
    }

    public void setDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
    }

    public CreateScalingGroupOption withDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
        return this;
    }

    /**
     * 配置删除云服务器时是否删除云服务器绑定的数据盘。取值为true或false，默认为false。 true：删除云服务器时，会同时删除绑定在云服务器上的数据盘。当数据盘的计费方式为包年包月时，不会被删除。 false：删除云服务器时，仅解绑定在云服务器上的数据盘，不删除数据盘。
     * @return deleteVolume
     */
    public Boolean getDeleteVolume() {
        return deleteVolume;
    }

    public void setDeleteVolume(Boolean deleteVolume) {
        this.deleteVolume = deleteVolume;
    }

    public CreateScalingGroupOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，用于指定伸缩组归属的企业项目。取值为0或无该值，表示属于default企业项目。取值为UUID，表示属于该UUID对应的企业项目，如何获取企业项目ID，请参考[查询企业项目列表](https://support.huaweicloud.com/api-em/zh-cn_topic_0121230880.html)。当伸缩组配置企业项目时，由该伸缩组创建的弹性云服务器将归属于该企业项目。否则将使用默认企业项目。说明：关于企业项目特性的详细信息，请参见[企业项目管理](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0131965280.html)。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateScalingGroupOption withMultiAzPriorityPolicy(MultiAzPriorityPolicyEnum multiAzPriorityPolicy) {
        this.multiAzPriorityPolicy = multiAzPriorityPolicy;
        return this;
    }

    /**
     * 伸缩组扩缩容时目标AZ选择的优先级策略：EQUILIBRIUM_DISTRIBUTE（默认）：均衡分布，云服务器扩缩容时优先保证available_zones列表中各AZ下虚拟机数量均衡，当无法在目标AZ下完成虚拟机扩容时，按照PICK_FIRST原则选择其他可用AZ。PICK_FIRST：选择优先，虚拟机扩缩容时目标AZ的选择按照available_zones列表的顺序进行优先级排序。
     * @return multiAzPriorityPolicy
     */
    public MultiAzPriorityPolicyEnum getMultiAzPriorityPolicy() {
        return multiAzPriorityPolicy;
    }

    public void setMultiAzPriorityPolicy(MultiAzPriorityPolicyEnum multiAzPriorityPolicy) {
        this.multiAzPriorityPolicy = multiAzPriorityPolicy;
    }

    public CreateScalingGroupOption withIamAgencyName(String iamAgencyName) {
        this.iamAgencyName = iamAgencyName;
        return this;
    }

    /**
     * 委托的名称委托是由租户管理员在统一身份认证服务（Identity and Access Management，IAM）上创建的，可以为弹性云服务器提供访问云服务的临时凭证。
     * @return iamAgencyName
     */
    public String getIamAgencyName() {
        return iamAgencyName;
    }

    public void setIamAgencyName(String iamAgencyName) {
        this.iamAgencyName = iamAgencyName;
    }

    public CreateScalingGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 伸缩组描述信息(0-256个字符)
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateScalingGroupOption withTags(List<TagsSingleValue> tags) {
        this.tags = tags;
        return this;
    }

    public CreateScalingGroupOption addTagsItem(TagsSingleValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateScalingGroupOption withTags(Consumer<List<TagsSingleValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 创建特定标签并将其添加到伸缩组。每个伸缩组最多添加10个标签。
     * @return tags
     */
    public List<TagsSingleValue> getTags() {
        return tags;
    }

    public void setTags(List<TagsSingleValue> tags) {
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
        CreateScalingGroupOption that = (CreateScalingGroupOption) obj;
        return Objects.equals(this.scalingGroupName, that.scalingGroupName)
            && Objects.equals(this.scalingConfigurationId, that.scalingConfigurationId)
            && Objects.equals(this.desireInstanceNumber, that.desireInstanceNumber)
            && Objects.equals(this.minInstanceNumber, that.minInstanceNumber)
            && Objects.equals(this.maxInstanceNumber, that.maxInstanceNumber)
            && Objects.equals(this.coolDownTime, that.coolDownTime)
            && Objects.equals(this.lbListenerId, that.lbListenerId)
            && Objects.equals(this.lbaasListeners, that.lbaasListeners)
            && Objects.equals(this.availableZones, that.availableZones) && Objects.equals(this.networks, that.networks)
            && Objects.equals(this.securityGroups, that.securityGroups) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.healthPeriodicAuditMethod, that.healthPeriodicAuditMethod)
            && Objects.equals(this.healthPeriodicAuditTime, that.healthPeriodicAuditTime)
            && Objects.equals(this.healthPeriodicAuditGracePeriod, that.healthPeriodicAuditGracePeriod)
            && Objects.equals(this.instanceTerminatePolicy, that.instanceTerminatePolicy)
            && Objects.equals(this.notifications, that.notifications)
            && Objects.equals(this.deletePublicip, that.deletePublicip)
            && Objects.equals(this.deleteVolume, that.deleteVolume)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.multiAzPriorityPolicy, that.multiAzPriorityPolicy)
            && Objects.equals(this.iamAgencyName, that.iamAgencyName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupName,
            scalingConfigurationId,
            desireInstanceNumber,
            minInstanceNumber,
            maxInstanceNumber,
            coolDownTime,
            lbListenerId,
            lbaasListeners,
            availableZones,
            networks,
            securityGroups,
            vpcId,
            healthPeriodicAuditMethod,
            healthPeriodicAuditTime,
            healthPeriodicAuditGracePeriod,
            instanceTerminatePolicy,
            notifications,
            deletePublicip,
            deleteVolume,
            enterpriseProjectId,
            multiAzPriorityPolicy,
            iamAgencyName,
            description,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScalingGroupOption {\n");
        sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
        sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
        sb.append("    desireInstanceNumber: ").append(toIndentedString(desireInstanceNumber)).append("\n");
        sb.append("    minInstanceNumber: ").append(toIndentedString(minInstanceNumber)).append("\n");
        sb.append("    maxInstanceNumber: ").append(toIndentedString(maxInstanceNumber)).append("\n");
        sb.append("    coolDownTime: ").append(toIndentedString(coolDownTime)).append("\n");
        sb.append("    lbListenerId: ").append(toIndentedString(lbListenerId)).append("\n");
        sb.append("    lbaasListeners: ").append(toIndentedString(lbaasListeners)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    healthPeriodicAuditMethod: ").append(toIndentedString(healthPeriodicAuditMethod)).append("\n");
        sb.append("    healthPeriodicAuditTime: ").append(toIndentedString(healthPeriodicAuditTime)).append("\n");
        sb.append("    healthPeriodicAuditGracePeriod: ")
            .append(toIndentedString(healthPeriodicAuditGracePeriod))
            .append("\n");
        sb.append("    instanceTerminatePolicy: ").append(toIndentedString(instanceTerminatePolicy)).append("\n");
        sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
        sb.append("    deletePublicip: ").append(toIndentedString(deletePublicip)).append("\n");
        sb.append("    deleteVolume: ").append(toIndentedString(deleteVolume)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    multiAzPriorityPolicy: ").append(toIndentedString(multiAzPriorityPolicy)).append("\n");
        sb.append("    iamAgencyName: ").append(toIndentedString(iamAgencyName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
