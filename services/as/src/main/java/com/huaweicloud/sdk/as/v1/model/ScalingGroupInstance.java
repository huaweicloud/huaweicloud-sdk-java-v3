package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 伸缩组实例详情
 */
public class ScalingGroupInstance  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_name")
    
    private String scalingGroupName;
    /**
     * 实例在伸缩组中的实力状态周期：INSERVICE： 正在使用。PENDING：正在加入伸缩组。REMOVING：正在移出伸缩组。PENDING_WAIT：正在加入伸缩组：等待。REMOVING_WAIT：正在移出伸缩组：等待。
     */
    public static class LifeCycleStateEnum {

        
        /**
         * Enum INSERVICE for value: "INSERVICE"
         */
        public static final LifeCycleStateEnum INSERVICE = new LifeCycleStateEnum("INSERVICE");

        
        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final LifeCycleStateEnum PENDING = new LifeCycleStateEnum("PENDING");

        
        /**
         * Enum REMOVING for value: "REMOVING"
         */
        public static final LifeCycleStateEnum REMOVING = new LifeCycleStateEnum("REMOVING");

        
        /**
         * Enum PENDING_WAIT for value: "PENDING_WAIT"
         */
        public static final LifeCycleStateEnum PENDING_WAIT = new LifeCycleStateEnum("PENDING_WAIT");

        
        /**
         * Enum REMOVING_WAIT for value: "REMOVING_WAIT"
         */
        public static final LifeCycleStateEnum REMOVING_WAIT = new LifeCycleStateEnum("REMOVING_WAIT");

        

        public static Map<String, LifeCycleStateEnum> staticFields =
                new HashMap<String, LifeCycleStateEnum>() {
                    { 
                        put("INSERVICE", INSERVICE);
                        put("PENDING", PENDING);
                        put("REMOVING", REMOVING);
                        put("PENDING_WAIT", PENDING_WAIT);
                        put("REMOVING_WAIT", REMOVING_WAIT);
                    }
                };

        private String value;

        LifeCycleStateEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LifeCycleStateEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            LifeCycleStateEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new LifeCycleStateEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static LifeCycleStateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LifeCycleStateEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LifeCycleStateEnum) {
                return this.value.equals(((LifeCycleStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="life_cycle_state")
    
    private LifeCycleStateEnum lifeCycleState;
    /**
     * 实例健康状态:INITAILIZING:初始化；NORMAL：正常；ERROR：错误。
     */
    public static class HealthStatusEnum {

        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final HealthStatusEnum NORMAL = new HealthStatusEnum("NORMAL");

        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final HealthStatusEnum ERROR = new HealthStatusEnum("ERROR");

        
        /**
         * Enum INITAILIZING for value: "INITAILIZING"
         */
        public static final HealthStatusEnum INITAILIZING = new HealthStatusEnum("INITAILIZING");

        

        public static Map<String, HealthStatusEnum> staticFields =
                new HashMap<String, HealthStatusEnum>() {
                    { 
                        put("NORMAL", NORMAL);
                        put("ERROR", ERROR);
                        put("INITAILIZING", INITAILIZING);
                    }
                };

        private String value;

        HealthStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HealthStatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            HealthStatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new HealthStatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static HealthStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HealthStatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HealthStatusEnum) {
                return this.value.equals(((HealthStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="health_status")
    
    private HealthStatusEnum healthStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_name")
    
    private String scalingConfigurationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_id")
    
    private String scalingConfigurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protect_from_scaling_down")
    
    private Boolean protectFromScalingDown;

    public ScalingGroupInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ScalingGroupInstance withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ScalingGroupInstance withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    


    /**
     * 实例所在伸缩组ID。
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public ScalingGroupInstance withScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }

    


    /**
     * 实例所在伸缩组名称。
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return scalingGroupName;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    public ScalingGroupInstance withLifeCycleState(LifeCycleStateEnum lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
        return this;
    }

    


    /**
     * 实例在伸缩组中的实力状态周期：INSERVICE： 正在使用。PENDING：正在加入伸缩组。REMOVING：正在移出伸缩组。PENDING_WAIT：正在加入伸缩组：等待。REMOVING_WAIT：正在移出伸缩组：等待。
     * @return lifeCycleState
     */
    public LifeCycleStateEnum getLifeCycleState() {
        return lifeCycleState;
    }

    public void setLifeCycleState(LifeCycleStateEnum lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    public ScalingGroupInstance withHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    


    /**
     * 实例健康状态:INITAILIZING:初始化；NORMAL：正常；ERROR：错误。
     * @return healthStatus
     */
    public HealthStatusEnum getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
    }

    public ScalingGroupInstance withScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }

    


    /**
     * 伸缩配置名称。如果返回为空，表示伸缩配置已经被删除。如果返回MANNUAL_ADD，表示实例为手动加入。
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return scalingConfigurationName;
    }

    public void setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
    }

    public ScalingGroupInstance withScalingConfigurationId(String scalingConfigurationId) {
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

    public ScalingGroupInstance withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 实例加入伸缩组的时间，遵循UTC时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ScalingGroupInstance withProtectFromScalingDown(Boolean protectFromScalingDown) {
        this.protectFromScalingDown = protectFromScalingDown;
        return this;
    }

    


    /**
     * 实例的实例保护属性。
     * @return protectFromScalingDown
     */
    public Boolean getProtectFromScalingDown() {
        return protectFromScalingDown;
    }

    public void setProtectFromScalingDown(Boolean protectFromScalingDown) {
        this.protectFromScalingDown = protectFromScalingDown;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingGroupInstance scalingGroupInstance = (ScalingGroupInstance) o;
        return Objects.equals(this.instanceId, scalingGroupInstance.instanceId) &&
            Objects.equals(this.instanceName, scalingGroupInstance.instanceName) &&
            Objects.equals(this.scalingGroupId, scalingGroupInstance.scalingGroupId) &&
            Objects.equals(this.scalingGroupName, scalingGroupInstance.scalingGroupName) &&
            Objects.equals(this.lifeCycleState, scalingGroupInstance.lifeCycleState) &&
            Objects.equals(this.healthStatus, scalingGroupInstance.healthStatus) &&
            Objects.equals(this.scalingConfigurationName, scalingGroupInstance.scalingConfigurationName) &&
            Objects.equals(this.scalingConfigurationId, scalingGroupInstance.scalingConfigurationId) &&
            Objects.equals(this.createTime, scalingGroupInstance.createTime) &&
            Objects.equals(this.protectFromScalingDown, scalingGroupInstance.protectFromScalingDown);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, scalingGroupId, scalingGroupName, lifeCycleState, healthStatus, scalingConfigurationName, scalingConfigurationId, createTime, protectFromScalingDown);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingGroupInstance {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
            sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
            sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
            sb.append("    lifeCycleState: ").append(toIndentedString(lifeCycleState)).append("\n");
            sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
            sb.append("    scalingConfigurationName: ").append(toIndentedString(scalingConfigurationName)).append("\n");
            sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
            sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
            sb.append("    protectFromScalingDown: ").append(toIndentedString(protectFromScalingDown)).append("\n");
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

