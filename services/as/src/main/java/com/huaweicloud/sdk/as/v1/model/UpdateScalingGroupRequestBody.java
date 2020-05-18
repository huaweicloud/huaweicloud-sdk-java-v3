package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.LbaasListeners;
import com.huaweicloud.sdk.as.v1.model.Networks;
import com.huaweicloud.sdk.as.v1.model.SecurityGroups;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 修改伸缩组详情
 */
public class UpdateScalingGroupRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_name")
    
    private String scalingGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desire_instance_number")
    
    private Integer desireInstanceNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_instance_number")
    
    private Integer minInstanceNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_instance_number")
    
    private Integer maxInstanceNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cool_down_time")
    
    private Integer coolDownTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zones")
    
    private List<String> availableZones = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="networks")
    
    private List<Networks> networks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SecurityGroups> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lb_listener_id")
    
    private String lbListenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lbaas_listeners")
    
    private List<LbaasListeners> lbaasListeners = null;
        /**
     * 伸缩组实例健康检查方式：ELB_AUDIT和NOVA_AUDIT。当伸缩组参数中设置负载均衡时，默认为ELB_AUDIT；否则默认为NOVA_AUDIT。ELB_AUDIT表示负载均衡健康检查方式，在有监听器的伸缩组中有效。NOVA_AUDIT表示弹性伸缩自带的健康检查方式。
     */
    public static class HealthPeriodicAuditMethodEnum {

        
        /**
         * Enum ELB_AUDIT for value: "ELB_AUDIT"
         */
        public static final HealthPeriodicAuditMethodEnum ELB_AUDIT = new HealthPeriodicAuditMethodEnum("ELB_AUDIT");

        
        /**
         * Enum NOVA_AUDIT for value: "NOVA_AUDIT"
         */
        public static final HealthPeriodicAuditMethodEnum NOVA_AUDIT = new HealthPeriodicAuditMethodEnum("NOVA_AUDIT");

        

        public static Map<String, HealthPeriodicAuditMethodEnum> staticFields =
                new HashMap<String, HealthPeriodicAuditMethodEnum>() {
                    { 
                        put("ELB_AUDIT", ELB_AUDIT);
                        put("NOVA_AUDIT", NOVA_AUDIT);
                    }
                };

        private String value;

        HealthPeriodicAuditMethodEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HealthPeriodicAuditMethodEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            HealthPeriodicAuditMethodEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new HealthPeriodicAuditMethodEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static HealthPeriodicAuditMethodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HealthPeriodicAuditMethodEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HealthPeriodicAuditMethodEnum) {
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
    @JsonProperty(value="health_periodic_audit_method")
    
    private HealthPeriodicAuditMethodEnum healthPeriodicAuditMethod;
    /**
     * 伸缩组实例健康检查周期（分钟）：1、5、15、60、180。若设置为0，可以实现10秒级健康检查。
     */
    public static class HealthPeriodicAuditTimeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final HealthPeriodicAuditTimeEnum NUMBER_0 = new HealthPeriodicAuditTimeEnum(0);

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final HealthPeriodicAuditTimeEnum NUMBER_1 = new HealthPeriodicAuditTimeEnum(1);

        
        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final HealthPeriodicAuditTimeEnum NUMBER_5 = new HealthPeriodicAuditTimeEnum(5);

        
        /**
         * Enum NUMBER_15 for value: 15
         */
        public static final HealthPeriodicAuditTimeEnum NUMBER_15 = new HealthPeriodicAuditTimeEnum(15);

        
        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final HealthPeriodicAuditTimeEnum NUMBER_60 = new HealthPeriodicAuditTimeEnum(60);

        
        /**
         * Enum NUMBER_180 for value: 180
         */
        public static final HealthPeriodicAuditTimeEnum NUMBER_180 = new HealthPeriodicAuditTimeEnum(180);

        

        public static Map<Integer, HealthPeriodicAuditTimeEnum> staticFields =
                new HashMap<Integer, HealthPeriodicAuditTimeEnum>() {
                    { 
                        put(0, NUMBER_0);
                        put(1, NUMBER_1);
                        put(5, NUMBER_5);
                        put(15, NUMBER_15);
                        put(60, NUMBER_60);
                        put(180, NUMBER_180);
                    }
                };

        private Integer value;

        HealthPeriodicAuditTimeEnum(Integer value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HealthPeriodicAuditTimeEnum fromValue(Integer value) {
           if( value == null ){
                return null;
            }
            HealthPeriodicAuditTimeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new HealthPeriodicAuditTimeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static HealthPeriodicAuditTimeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            HealthPeriodicAuditTimeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HealthPeriodicAuditTimeEnum) {
                return this.value.equals(((HealthPeriodicAuditTimeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="health_periodic_audit_time")
    
    private HealthPeriodicAuditTimeEnum healthPeriodicAuditTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="health_periodic_audit_grace_period")
    
    private Integer healthPeriodicAuditGracePeriod;
    /**
     * 伸缩组实例移除策略：OLD_CONFIG_OLD_INSTANCE（默认）：从根据“较早创建的配置”创建的实例中筛选出较早创建的实例被优先移除。OLD_CONFIG_NEW_INSTANCE：从根据“较早创建的配置”创建的实例中筛选出较新创建的实例被优先移除。OLD_INSTANCE：较早创建的实例被优先移除。NEW_INSTANCE：较新创建的实例将被优先移除。
     */
    public static class InstanceTerminatePolicyEnum {

        
        /**
         * Enum OLD_CONFIG_OLD_INSTANCE for value: "OLD_CONFIG_OLD_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum OLD_CONFIG_OLD_INSTANCE = new InstanceTerminatePolicyEnum("OLD_CONFIG_OLD_INSTANCE");

        
        /**
         * Enum OLD_CONFIG_NEW_INSTANCE for value: "OLD_CONFIG_NEW_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum OLD_CONFIG_NEW_INSTANCE = new InstanceTerminatePolicyEnum("OLD_CONFIG_NEW_INSTANCE");

        
        /**
         * Enum OLD_INSTANCE for value: "OLD_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum OLD_INSTANCE = new InstanceTerminatePolicyEnum("OLD_INSTANCE");

        
        /**
         * Enum NEW_INSTANCE for value: "NEW_INSTANCE"
         */
        public static final InstanceTerminatePolicyEnum NEW_INSTANCE = new InstanceTerminatePolicyEnum("NEW_INSTANCE");

        

        public static Map<String, InstanceTerminatePolicyEnum> staticFields =
                new HashMap<String, InstanceTerminatePolicyEnum>() {
                    { 
                        put("OLD_CONFIG_OLD_INSTANCE", OLD_CONFIG_OLD_INSTANCE);
                        put("OLD_CONFIG_NEW_INSTANCE", OLD_CONFIG_NEW_INSTANCE);
                        put("OLD_INSTANCE", OLD_INSTANCE);
                        put("NEW_INSTANCE", NEW_INSTANCE);
                    }
                };

        private String value;

        InstanceTerminatePolicyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InstanceTerminatePolicyEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            InstanceTerminatePolicyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new InstanceTerminatePolicyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static InstanceTerminatePolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InstanceTerminatePolicyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof InstanceTerminatePolicyEnum) {
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
    @JsonProperty(value="instance_terminate_policy")
    
    private InstanceTerminatePolicyEnum instanceTerminatePolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_id")
    
    private String scalingConfigurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notifications")
    
    private List<String> notifications = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_publicip")
    
    private Boolean deletePublicip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public UpdateScalingGroupRequestBody withScalingGroupName(String scalingGroupName) {
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

    public UpdateScalingGroupRequestBody withDesireInstanceNumber(Integer desireInstanceNumber) {
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

    public UpdateScalingGroupRequestBody withMinInstanceNumber(Integer minInstanceNumber) {
        this.minInstanceNumber = minInstanceNumber;
        return this;
    }

    


    /**
     * 最小实例数量。
     * @return minInstanceNumber
     */
    public Integer getMinInstanceNumber() {
        return minInstanceNumber;
    }

    public void setMinInstanceNumber(Integer minInstanceNumber) {
        this.minInstanceNumber = minInstanceNumber;
    }

    public UpdateScalingGroupRequestBody withMaxInstanceNumber(Integer maxInstanceNumber) {
        this.maxInstanceNumber = maxInstanceNumber;
        return this;
    }

    


    /**
     * 最大实例数量，大于等于最小实例数。
     * @return maxInstanceNumber
     */
    public Integer getMaxInstanceNumber() {
        return maxInstanceNumber;
    }

    public void setMaxInstanceNumber(Integer maxInstanceNumber) {
        this.maxInstanceNumber = maxInstanceNumber;
    }

    public UpdateScalingGroupRequestBody withCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
        return this;
    }

    


    /**
     * 冷却时间，取值范围0-86400，单位是秒。
     * minimum: 0
     * maximum: 86400
     * @return coolDownTime
     */
    public Integer getCoolDownTime() {
        return coolDownTime;
    }

    public void setCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
    }

    public UpdateScalingGroupRequestBody withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    
    public UpdateScalingGroupRequestBody addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public UpdateScalingGroupRequestBody withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if(this.availableZones == null ){
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用分区信息。弹性伸缩活动中自动添加的云服务器会被创建在指定的可用区中。如果没有指定可用分区，会由系统自动指定可用分区。详情请参考地区和终端节点。仅当同时满足以下条件时才可以修改：伸缩组中无伸缩活动；实例数为0；伸缩组为非启用状态。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public UpdateScalingGroupRequestBody withNetworks(List<Networks> networks) {
        this.networks = networks;
        return this;
    }

    
    public UpdateScalingGroupRequestBody addNetworksItem(Networks networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public UpdateScalingGroupRequestBody withNetworks(Consumer<List<Networks>> networksSetter) {
        if(this.networks == null ){
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * 网络信息，最多支持选择5个子网，传入的第一个子网默认作为云服务器的主网卡。使用vpc_id通过查询VPC服务子网列表接口获取，仅当同时满足以下条件时，才可以修改：伸缩组中无伸缩活动；实例数为0；伸缩组为非启用状态。
     * @return networks
     */
    public List<Networks> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Networks> networks) {
        this.networks = networks;
    }

    public UpdateScalingGroupRequestBody withSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public UpdateScalingGroupRequestBody addSecurityGroupsItem(SecurityGroups securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public UpdateScalingGroupRequestBody withSecurityGroups(Consumer<List<SecurityGroups>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组信息，最多支持选择1个安全组。使用vpc_id通过查询VPC服务安全组列表接口获取，详见《虚拟私有云API参考》的“查询安全组列表”。当伸缩配置和伸缩组同时指定安全组时，将以伸缩配置中的安全组为准；当伸缩配置和伸缩组都没有指定安全组时，将使用默认安全组。为了使用灵活性更高，推荐在伸缩配置中指定安全组。仅当同时满足以下条件时，才可以修改：伸缩组无伸缩活动；实例数为0；伸缩组为非启用状态。
     * @return securityGroups
     */
    public List<SecurityGroups> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public UpdateScalingGroupRequestBody withLbListenerId(String lbListenerId) {
        this.lbListenerId = lbListenerId;
        return this;
    }

    


    /**
     * 弹性负载均衡（经典型）监听器ID，最多支持绑定3个负载均衡监听器，多个负载均衡监听器ID以逗号分隔。首先使用vpc_id通过查询ELB服务负载均衡器列表接口获取负载均衡器的ID，详见《弹性负载均衡API参考》的“查询负载均衡器列表”，再使用该ID查询监听器列表获取，详见《弹性负载均衡API参考》的“查询监听器列表”。仅当同时满足以下条件时，才可以修改：伸缩组无伸缩活动；实例数为0；伸缩组为非启用状态。
     * @return lbListenerId
     */
    public String getLbListenerId() {
        return lbListenerId;
    }

    public void setLbListenerId(String lbListenerId) {
        this.lbListenerId = lbListenerId;
    }

    public UpdateScalingGroupRequestBody withLbaasListeners(List<LbaasListeners> lbaasListeners) {
        this.lbaasListeners = lbaasListeners;
        return this;
    }

    
    public UpdateScalingGroupRequestBody addLbaasListenersItem(LbaasListeners lbaasListenersItem) {
        if (this.lbaasListeners == null) {
            this.lbaasListeners = new ArrayList<>();
        }
        this.lbaasListeners.add(lbaasListenersItem);
        return this;
    }

    public UpdateScalingGroupRequestBody withLbaasListeners(Consumer<List<LbaasListeners>> lbaasListenersSetter) {
        if(this.lbaasListeners == null ){
            this.lbaasListeners = new ArrayList<>();
        }
        lbaasListenersSetter.accept(this.lbaasListeners);
        return this;
    }

    /**
     * 弹性负载均衡器（增强型）信息，最多支持绑定3个负载均衡。该字段与lb_listener_id互斥。
     * @return lbaasListeners
     */
    public List<LbaasListeners> getLbaasListeners() {
        return lbaasListeners;
    }

    public void setLbaasListeners(List<LbaasListeners> lbaasListeners) {
        this.lbaasListeners = lbaasListeners;
    }

    public UpdateScalingGroupRequestBody withHealthPeriodicAuditMethod(HealthPeriodicAuditMethodEnum healthPeriodicAuditMethod) {
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

    public UpdateScalingGroupRequestBody withHealthPeriodicAuditTime(HealthPeriodicAuditTimeEnum healthPeriodicAuditTime) {
        this.healthPeriodicAuditTime = healthPeriodicAuditTime;
        return this;
    }

    


    /**
     * 伸缩组实例健康检查周期（分钟）：1、5、15、60、180。若设置为0，可以实现10秒级健康检查。
     * @return healthPeriodicAuditTime
     */
    public HealthPeriodicAuditTimeEnum getHealthPeriodicAuditTime() {
        return healthPeriodicAuditTime;
    }

    public void setHealthPeriodicAuditTime(HealthPeriodicAuditTimeEnum healthPeriodicAuditTime) {
        this.healthPeriodicAuditTime = healthPeriodicAuditTime;
    }

    public UpdateScalingGroupRequestBody withHealthPeriodicAuditGracePeriod(Integer healthPeriodicAuditGracePeriod) {
        this.healthPeriodicAuditGracePeriod = healthPeriodicAuditGracePeriod;
        return this;
    }

    


    /**
     * 伸缩组实例健康状况检查宽限期，取值范围0-86400，单位是秒。当实例加入伸缩组并且进入已启用状态后，健康状况检查宽限期才会启动，伸缩组会等健康状况检查宽限期结束后才检查实例的运行状况。当伸缩组实例健康检查方式为ELB_AUDIT时，该参数生效，若不设置该参数，默认为10分钟。
     * minimum: 0
     * maximum: 86400
     * @return healthPeriodicAuditGracePeriod
     */
    public Integer getHealthPeriodicAuditGracePeriod() {
        return healthPeriodicAuditGracePeriod;
    }

    public void setHealthPeriodicAuditGracePeriod(Integer healthPeriodicAuditGracePeriod) {
        this.healthPeriodicAuditGracePeriod = healthPeriodicAuditGracePeriod;
    }

    public UpdateScalingGroupRequestBody withInstanceTerminatePolicy(InstanceTerminatePolicyEnum instanceTerminatePolicy) {
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

    public UpdateScalingGroupRequestBody withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    


    /**
     * 伸缩配置ID，通过查询弹性伸缩配置列表接口获取，详见查询弹性伸缩配置列表
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public UpdateScalingGroupRequestBody withNotifications(List<String> notifications) {
        this.notifications = notifications;
        return this;
    }

    
    public UpdateScalingGroupRequestBody addNotificationsItem(String notificationsItem) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    public UpdateScalingGroupRequestBody withNotifications(Consumer<List<String>> notificationsSetter) {
        if(this.notifications == null ){
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

    public UpdateScalingGroupRequestBody withDeletePublicip(Boolean deletePublicip) {
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

    public UpdateScalingGroupRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID，用于指定伸缩组归属的企业项目。当伸缩组配置企业项目时，由该伸缩组创建的弹性云服务器将归属于该企业项目。当没有指定企业项目时，将使用企业项目ID为0的默认项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateScalingGroupRequestBody updateScalingGroupRequestBody = (UpdateScalingGroupRequestBody) o;
        return Objects.equals(this.scalingGroupName, updateScalingGroupRequestBody.scalingGroupName) &&
            Objects.equals(this.desireInstanceNumber, updateScalingGroupRequestBody.desireInstanceNumber) &&
            Objects.equals(this.minInstanceNumber, updateScalingGroupRequestBody.minInstanceNumber) &&
            Objects.equals(this.maxInstanceNumber, updateScalingGroupRequestBody.maxInstanceNumber) &&
            Objects.equals(this.coolDownTime, updateScalingGroupRequestBody.coolDownTime) &&
            Objects.equals(this.availableZones, updateScalingGroupRequestBody.availableZones) &&
            Objects.equals(this.networks, updateScalingGroupRequestBody.networks) &&
            Objects.equals(this.securityGroups, updateScalingGroupRequestBody.securityGroups) &&
            Objects.equals(this.lbListenerId, updateScalingGroupRequestBody.lbListenerId) &&
            Objects.equals(this.lbaasListeners, updateScalingGroupRequestBody.lbaasListeners) &&
            Objects.equals(this.healthPeriodicAuditMethod, updateScalingGroupRequestBody.healthPeriodicAuditMethod) &&
            Objects.equals(this.healthPeriodicAuditTime, updateScalingGroupRequestBody.healthPeriodicAuditTime) &&
            Objects.equals(this.healthPeriodicAuditGracePeriod, updateScalingGroupRequestBody.healthPeriodicAuditGracePeriod) &&
            Objects.equals(this.instanceTerminatePolicy, updateScalingGroupRequestBody.instanceTerminatePolicy) &&
            Objects.equals(this.scalingConfigurationId, updateScalingGroupRequestBody.scalingConfigurationId) &&
            Objects.equals(this.notifications, updateScalingGroupRequestBody.notifications) &&
            Objects.equals(this.deletePublicip, updateScalingGroupRequestBody.deletePublicip) &&
            Objects.equals(this.enterpriseProjectId, updateScalingGroupRequestBody.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupName, desireInstanceNumber, minInstanceNumber, maxInstanceNumber, coolDownTime, availableZones, networks, securityGroups, lbListenerId, lbaasListeners, healthPeriodicAuditMethod, healthPeriodicAuditTime, healthPeriodicAuditGracePeriod, instanceTerminatePolicy, scalingConfigurationId, notifications, deletePublicip, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScalingGroupRequestBody {\n");
            sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
            sb.append("    desireInstanceNumber: ").append(toIndentedString(desireInstanceNumber)).append("\n");
            sb.append("    minInstanceNumber: ").append(toIndentedString(minInstanceNumber)).append("\n");
            sb.append("    maxInstanceNumber: ").append(toIndentedString(maxInstanceNumber)).append("\n");
            sb.append("    coolDownTime: ").append(toIndentedString(coolDownTime)).append("\n");
            sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
            sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    lbListenerId: ").append(toIndentedString(lbListenerId)).append("\n");
            sb.append("    lbaasListeners: ").append(toIndentedString(lbaasListeners)).append("\n");
            sb.append("    healthPeriodicAuditMethod: ").append(toIndentedString(healthPeriodicAuditMethod)).append("\n");
            sb.append("    healthPeriodicAuditTime: ").append(toIndentedString(healthPeriodicAuditTime)).append("\n");
            sb.append("    healthPeriodicAuditGracePeriod: ").append(toIndentedString(healthPeriodicAuditGracePeriod)).append("\n");
            sb.append("    instanceTerminatePolicy: ").append(toIndentedString(instanceTerminatePolicy)).append("\n");
            sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
            sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
            sb.append("    deletePublicip: ").append(toIndentedString(deletePublicip)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

