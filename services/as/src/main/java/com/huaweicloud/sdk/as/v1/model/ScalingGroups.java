package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.LbaasListenersResult;
import com.huaweicloud.sdk.as.v1.model.Networks;
import com.huaweicloud.sdk.as.v1.model.SecurityGroupsResult;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 伸缩组详情
 */
public class ScalingGroups  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_name")
    
    private String scalingGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;
    /**
     * 伸缩组状态。
     */
    public static class ScalingGroupStatusEnum {

        
        /**
         * Enum INSERVICE for value: "INSERVICE"
         */
        public static final ScalingGroupStatusEnum INSERVICE = new ScalingGroupStatusEnum("INSERVICE");

        
        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final ScalingGroupStatusEnum PAUSED = new ScalingGroupStatusEnum("PAUSED");

        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ScalingGroupStatusEnum ERROR = new ScalingGroupStatusEnum("ERROR");

        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final ScalingGroupStatusEnum DELETING = new ScalingGroupStatusEnum("DELETING");

        
        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final ScalingGroupStatusEnum FREEZED = new ScalingGroupStatusEnum("FREEZED");

        

        public static Map<String, ScalingGroupStatusEnum> staticFields =
                new HashMap<String, ScalingGroupStatusEnum>() {
                    { 
                        put("INSERVICE", INSERVICE);
                        put("PAUSED", PAUSED);
                        put("ERROR", ERROR);
                        put("DELETING", DELETING);
                        put("FREEZED", FREEZED);
                    }
                };

        private String value;

        ScalingGroupStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingGroupStatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ScalingGroupStatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ScalingGroupStatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ScalingGroupStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScalingGroupStatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ScalingGroupStatusEnum) {
                return this.value.equals(((ScalingGroupStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_status")
    
    private ScalingGroupStatusEnum scalingGroupStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_id")
    
    private String scalingConfigurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_name")
    
    private String scalingConfigurationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="current_instance_number")
    
    private Integer currentInstanceNumber;


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
    @JsonProperty(value="lb_listener_id")
    
    private String lbListenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lbaas_listeners")
    
    private List<LbaasListenersResult> lbaasListeners = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zones")
    
    private List<String> availableZones = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="networks")
    
    private List<Networks> networks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SecurityGroupsResult> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private String detail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_scaling")
    
    private Boolean isScaling;
    /**
     * 健康检查方式。
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
     * 健康检查的间隔时间。
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
     * 移除策略。
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
    @JsonProperty(value="notifications")
    
    private List<String> notifications = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_publicip")
    
    private Boolean deletePublicip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_location_id")
    
    private String cloudLocationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ScalingGroups withScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }

    


    /**
     * 伸缩组名称。
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return scalingGroupName;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    public ScalingGroups withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    


    /**
     * 伸缩组ID。
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public ScalingGroups withScalingGroupStatus(ScalingGroupStatusEnum scalingGroupStatus) {
        this.scalingGroupStatus = scalingGroupStatus;
        return this;
    }

    


    /**
     * 伸缩组状态。
     * @return scalingGroupStatus
     */
    public ScalingGroupStatusEnum getScalingGroupStatus() {
        return scalingGroupStatus;
    }

    public void setScalingGroupStatus(ScalingGroupStatusEnum scalingGroupStatus) {
        this.scalingGroupStatus = scalingGroupStatus;
    }

    public ScalingGroups withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    


    /**
     * 伸缩配置ID。
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public ScalingGroups withScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }

    


    /**
     * 伸缩配置名称。
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return scalingConfigurationName;
    }

    public void setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
    }

    public ScalingGroups withCurrentInstanceNumber(Integer currentInstanceNumber) {
        this.currentInstanceNumber = currentInstanceNumber;
        return this;
    }

    


    /**
     * 伸缩组中当前实例数。
     * @return currentInstanceNumber
     */
    public Integer getCurrentInstanceNumber() {
        return currentInstanceNumber;
    }

    public void setCurrentInstanceNumber(Integer currentInstanceNumber) {
        this.currentInstanceNumber = currentInstanceNumber;
    }

    public ScalingGroups withDesireInstanceNumber(Integer desireInstanceNumber) {
        this.desireInstanceNumber = desireInstanceNumber;
        return this;
    }

    


    /**
     * 伸缩组期望实例数。
     * @return desireInstanceNumber
     */
    public Integer getDesireInstanceNumber() {
        return desireInstanceNumber;
    }

    public void setDesireInstanceNumber(Integer desireInstanceNumber) {
        this.desireInstanceNumber = desireInstanceNumber;
    }

    public ScalingGroups withMinInstanceNumber(Integer minInstanceNumber) {
        this.minInstanceNumber = minInstanceNumber;
        return this;
    }

    


    /**
     * 伸缩组最小实例数。
     * @return minInstanceNumber
     */
    public Integer getMinInstanceNumber() {
        return minInstanceNumber;
    }

    public void setMinInstanceNumber(Integer minInstanceNumber) {
        this.minInstanceNumber = minInstanceNumber;
    }

    public ScalingGroups withMaxInstanceNumber(Integer maxInstanceNumber) {
        this.maxInstanceNumber = maxInstanceNumber;
        return this;
    }

    


    /**
     * 伸缩组最大实例数
     * @return maxInstanceNumber
     */
    public Integer getMaxInstanceNumber() {
        return maxInstanceNumber;
    }

    public void setMaxInstanceNumber(Integer maxInstanceNumber) {
        this.maxInstanceNumber = maxInstanceNumber;
    }

    public ScalingGroups withCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
        return this;
    }

    


    /**
     * 冷却时间，单位是秒。
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

    public ScalingGroups withLbListenerId(String lbListenerId) {
        this.lbListenerId = lbListenerId;
        return this;
    }

    


    /**
     * 经典型负载均衡监听器ID，多个负载均衡监听器ID以逗号分隔。
     * @return lbListenerId
     */
    public String getLbListenerId() {
        return lbListenerId;
    }

    public void setLbListenerId(String lbListenerId) {
        this.lbListenerId = lbListenerId;
    }

    public ScalingGroups withLbaasListeners(List<LbaasListenersResult> lbaasListeners) {
        this.lbaasListeners = lbaasListeners;
        return this;
    }

    
    public ScalingGroups addLbaasListenersItem(LbaasListenersResult lbaasListenersItem) {
        if (this.lbaasListeners == null) {
            this.lbaasListeners = new ArrayList<>();
        }
        this.lbaasListeners.add(lbaasListenersItem);
        return this;
    }

    public ScalingGroups withLbaasListeners(Consumer<List<LbaasListenersResult>> lbaasListenersSetter) {
        if(this.lbaasListeners == null ){
            this.lbaasListeners = new ArrayList<>();
        }
        lbaasListenersSetter.accept(this.lbaasListeners);
        return this;
    }

    /**
     * 增强型负载均衡器信息，该参数为预留字段。
     * @return lbaasListeners
     */
    public List<LbaasListenersResult> getLbaasListeners() {
        return lbaasListeners;
    }

    public void setLbaasListeners(List<LbaasListenersResult> lbaasListeners) {
        this.lbaasListeners = lbaasListeners;
    }

    public ScalingGroups withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    
    public ScalingGroups addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ScalingGroups withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if(this.availableZones == null ){
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用分区信息
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ScalingGroups withNetworks(List<Networks> networks) {
        this.networks = networks;
        return this;
    }

    
    public ScalingGroups addNetworksItem(Networks networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public ScalingGroups withNetworks(Consumer<List<Networks>> networksSetter) {
        if(this.networks == null ){
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * 网络信息
     * @return networks
     */
    public List<Networks> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Networks> networks) {
        this.networks = networks;
    }

    public ScalingGroups withSecurityGroups(List<SecurityGroupsResult> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public ScalingGroups addSecurityGroupsItem(SecurityGroupsResult securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ScalingGroups withSecurityGroups(Consumer<List<SecurityGroupsResult>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组信息
     * @return securityGroups
     */
    public List<SecurityGroupsResult> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupsResult> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ScalingGroups withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建伸缩组时间，遵循UTC时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ScalingGroups withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 伸缩组所在的VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ScalingGroups withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 伸缩组详情。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ScalingGroups withIsScaling(Boolean isScaling) {
        this.isScaling = isScaling;
        return this;
    }

    


    /**
     * 伸缩组伸缩标志。
     * @return isScaling
     */
    public Boolean getIsScaling() {
        return isScaling;
    }

    public void setIsScaling(Boolean isScaling) {
        this.isScaling = isScaling;
    }

    public ScalingGroups withHealthPeriodicAuditMethod(HealthPeriodicAuditMethodEnum healthPeriodicAuditMethod) {
        this.healthPeriodicAuditMethod = healthPeriodicAuditMethod;
        return this;
    }

    


    /**
     * 健康检查方式。
     * @return healthPeriodicAuditMethod
     */
    public HealthPeriodicAuditMethodEnum getHealthPeriodicAuditMethod() {
        return healthPeriodicAuditMethod;
    }

    public void setHealthPeriodicAuditMethod(HealthPeriodicAuditMethodEnum healthPeriodicAuditMethod) {
        this.healthPeriodicAuditMethod = healthPeriodicAuditMethod;
    }

    public ScalingGroups withHealthPeriodicAuditTime(HealthPeriodicAuditTimeEnum healthPeriodicAuditTime) {
        this.healthPeriodicAuditTime = healthPeriodicAuditTime;
        return this;
    }

    


    /**
     * 健康检查的间隔时间。
     * @return healthPeriodicAuditTime
     */
    public HealthPeriodicAuditTimeEnum getHealthPeriodicAuditTime() {
        return healthPeriodicAuditTime;
    }

    public void setHealthPeriodicAuditTime(HealthPeriodicAuditTimeEnum healthPeriodicAuditTime) {
        this.healthPeriodicAuditTime = healthPeriodicAuditTime;
    }

    public ScalingGroups withHealthPeriodicAuditGracePeriod(Integer healthPeriodicAuditGracePeriod) {
        this.healthPeriodicAuditGracePeriod = healthPeriodicAuditGracePeriod;
        return this;
    }

    


    /**
     * 健康状况检查宽限期。
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

    public ScalingGroups withInstanceTerminatePolicy(InstanceTerminatePolicyEnum instanceTerminatePolicy) {
        this.instanceTerminatePolicy = instanceTerminatePolicy;
        return this;
    }

    


    /**
     * 移除策略。
     * @return instanceTerminatePolicy
     */
    public InstanceTerminatePolicyEnum getInstanceTerminatePolicy() {
        return instanceTerminatePolicy;
    }

    public void setInstanceTerminatePolicy(InstanceTerminatePolicyEnum instanceTerminatePolicy) {
        this.instanceTerminatePolicy = instanceTerminatePolicy;
    }

    public ScalingGroups withNotifications(List<String> notifications) {
        this.notifications = notifications;
        return this;
    }

    
    public ScalingGroups addNotificationsItem(String notificationsItem) {
        if (this.notifications == null) {
            this.notifications = new ArrayList<>();
        }
        this.notifications.add(notificationsItem);
        return this;
    }

    public ScalingGroups withNotifications(Consumer<List<String>> notificationsSetter) {
        if(this.notifications == null ){
            this.notifications = new ArrayList<>();
        }
        notificationsSetter.accept(this.notifications);
        return this;
    }

    /**
     * 通知方式：EMAIL为发送邮件通知。
     * @return notifications
     */
    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }

    public ScalingGroups withDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
        return this;
    }

    


    /**
     * 删除云服务器是否删除云服务器绑定的弹性IP。
     * @return deletePublicip
     */
    public Boolean getDeletePublicip() {
        return deletePublicip;
    }

    public void setDeletePublicip(Boolean deletePublicip) {
        this.deletePublicip = deletePublicip;
    }

    public ScalingGroups withCloudLocationId(String cloudLocationId) {
        this.cloudLocationId = cloudLocationId;
        return this;
    }

    


    /**
     * 该参数为预留字段
     * @return cloudLocationId
     */
    public String getCloudLocationId() {
        return cloudLocationId;
    }

    public void setCloudLocationId(String cloudLocationId) {
        this.cloudLocationId = cloudLocationId;
    }

    public ScalingGroups withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID
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
        ScalingGroups scalingGroups = (ScalingGroups) o;
        return Objects.equals(this.scalingGroupName, scalingGroups.scalingGroupName) &&
            Objects.equals(this.scalingGroupId, scalingGroups.scalingGroupId) &&
            Objects.equals(this.scalingGroupStatus, scalingGroups.scalingGroupStatus) &&
            Objects.equals(this.scalingConfigurationId, scalingGroups.scalingConfigurationId) &&
            Objects.equals(this.scalingConfigurationName, scalingGroups.scalingConfigurationName) &&
            Objects.equals(this.currentInstanceNumber, scalingGroups.currentInstanceNumber) &&
            Objects.equals(this.desireInstanceNumber, scalingGroups.desireInstanceNumber) &&
            Objects.equals(this.minInstanceNumber, scalingGroups.minInstanceNumber) &&
            Objects.equals(this.maxInstanceNumber, scalingGroups.maxInstanceNumber) &&
            Objects.equals(this.coolDownTime, scalingGroups.coolDownTime) &&
            Objects.equals(this.lbListenerId, scalingGroups.lbListenerId) &&
            Objects.equals(this.lbaasListeners, scalingGroups.lbaasListeners) &&
            Objects.equals(this.availableZones, scalingGroups.availableZones) &&
            Objects.equals(this.networks, scalingGroups.networks) &&
            Objects.equals(this.securityGroups, scalingGroups.securityGroups) &&
            Objects.equals(this.createTime, scalingGroups.createTime) &&
            Objects.equals(this.vpcId, scalingGroups.vpcId) &&
            Objects.equals(this.detail, scalingGroups.detail) &&
            Objects.equals(this.isScaling, scalingGroups.isScaling) &&
            Objects.equals(this.healthPeriodicAuditMethod, scalingGroups.healthPeriodicAuditMethod) &&
            Objects.equals(this.healthPeriodicAuditTime, scalingGroups.healthPeriodicAuditTime) &&
            Objects.equals(this.healthPeriodicAuditGracePeriod, scalingGroups.healthPeriodicAuditGracePeriod) &&
            Objects.equals(this.instanceTerminatePolicy, scalingGroups.instanceTerminatePolicy) &&
            Objects.equals(this.notifications, scalingGroups.notifications) &&
            Objects.equals(this.deletePublicip, scalingGroups.deletePublicip) &&
            Objects.equals(this.cloudLocationId, scalingGroups.cloudLocationId) &&
            Objects.equals(this.enterpriseProjectId, scalingGroups.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupName, scalingGroupId, scalingGroupStatus, scalingConfigurationId, scalingConfigurationName, currentInstanceNumber, desireInstanceNumber, minInstanceNumber, maxInstanceNumber, coolDownTime, lbListenerId, lbaasListeners, availableZones, networks, securityGroups, createTime, vpcId, detail, isScaling, healthPeriodicAuditMethod, healthPeriodicAuditTime, healthPeriodicAuditGracePeriod, instanceTerminatePolicy, notifications, deletePublicip, cloudLocationId, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingGroups {\n");
            sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
            sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
            sb.append("    scalingGroupStatus: ").append(toIndentedString(scalingGroupStatus)).append("\n");
            sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
            sb.append("    scalingConfigurationName: ").append(toIndentedString(scalingConfigurationName)).append("\n");
            sb.append("    currentInstanceNumber: ").append(toIndentedString(currentInstanceNumber)).append("\n");
            sb.append("    desireInstanceNumber: ").append(toIndentedString(desireInstanceNumber)).append("\n");
            sb.append("    minInstanceNumber: ").append(toIndentedString(minInstanceNumber)).append("\n");
            sb.append("    maxInstanceNumber: ").append(toIndentedString(maxInstanceNumber)).append("\n");
            sb.append("    coolDownTime: ").append(toIndentedString(coolDownTime)).append("\n");
            sb.append("    lbListenerId: ").append(toIndentedString(lbListenerId)).append("\n");
            sb.append("    lbaasListeners: ").append(toIndentedString(lbaasListeners)).append("\n");
            sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
            sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
            sb.append("    isScaling: ").append(toIndentedString(isScaling)).append("\n");
            sb.append("    healthPeriodicAuditMethod: ").append(toIndentedString(healthPeriodicAuditMethod)).append("\n");
            sb.append("    healthPeriodicAuditTime: ").append(toIndentedString(healthPeriodicAuditTime)).append("\n");
            sb.append("    healthPeriodicAuditGracePeriod: ").append(toIndentedString(healthPeriodicAuditGracePeriod)).append("\n");
            sb.append("    instanceTerminatePolicy: ").append(toIndentedString(instanceTerminatePolicy)).append("\n");
            sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
            sb.append("    deletePublicip: ").append(toIndentedString(deletePublicip)).append("\n");
            sb.append("    cloudLocationId: ").append(toIndentedString(cloudLocationId)).append("\n");
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

