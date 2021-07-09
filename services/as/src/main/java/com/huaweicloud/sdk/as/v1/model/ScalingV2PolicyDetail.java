package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ScalingPolicyActionV2;
import com.huaweicloud.sdk.as.v1.model.ScalingPolicyV2MetaData;
import com.huaweicloud.sdk.as.v1.model.ScheduledPolicy;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 伸缩策略详情
 */
public class ScalingV2PolicyDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_name")
    
    private String scalingPolicyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_id")
    
    private String scalingPolicyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_resource_id")
    
    private String scalingResourceId;
    /**
     * 伸缩资源类型。伸缩组：SCALING_GROUP。带宽：BANDWIDTH。
     */
    public static final class ScalingResourceTypeEnum {

        
        /**
         * Enum SCALING_GROUP for value: "SCALING_GROUP"
         */
        public static final ScalingResourceTypeEnum SCALING_GROUP = new ScalingResourceTypeEnum("SCALING_GROUP");
        
        /**
         * Enum BANDWIDTH for value: "BANDWIDTH"
         */
        public static final ScalingResourceTypeEnum BANDWIDTH = new ScalingResourceTypeEnum("BANDWIDTH");
        

        private static final Map<String, ScalingResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScalingResourceTypeEnum> createStaticFields() {
            Map<String, ScalingResourceTypeEnum> map = new HashMap<>();
            map.put("SCALING_GROUP", SCALING_GROUP);
            map.put("BANDWIDTH", BANDWIDTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScalingResourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingResourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ScalingResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScalingResourceTypeEnum(value);
            }
            return result;
        }

        public static ScalingResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScalingResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ScalingResourceTypeEnum) {
                return this.value.equals(((ScalingResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_resource_type")
    
    private ScalingResourceTypeEnum scalingResourceType;
    /**
     * 伸缩策略状态。INSERVICE：使用中。PAUSED：停止。EXECUTING：执行中。
     */
    public static final class PolicyStatusEnum {

        
        /**
         * Enum INSERVICE for value: "INSERVICE"
         */
        public static final PolicyStatusEnum INSERVICE = new PolicyStatusEnum("INSERVICE");
        
        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final PolicyStatusEnum PAUSED = new PolicyStatusEnum("PAUSED");
        
        /**
         * Enum EXECUTING for value: "EXECUTING"
         */
        public static final PolicyStatusEnum EXECUTING = new PolicyStatusEnum("EXECUTING");
        

        private static final Map<String, PolicyStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyStatusEnum> createStaticFields() {
            Map<String, PolicyStatusEnum> map = new HashMap<>();
            map.put("INSERVICE", INSERVICE);
            map.put("PAUSED", PAUSED);
            map.put("EXECUTING", EXECUTING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PolicyStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PolicyStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PolicyStatusEnum(value);
            }
            return result;
        }

        public static PolicyStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PolicyStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PolicyStatusEnum) {
                return this.value.equals(((PolicyStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_status")
    
    private PolicyStatusEnum policyStatus;
    /**
     * 伸缩策略类型：ALARM：告警策略，此时alarm_id有返回，scheduled_policy不会返回。SCHEDULED：定时策略，此时alarm_id不会返回，scheduled_policy有返回，并且recurrence_type、recurrence_value、start_time和end_time不会返回。RECURRENCE：周期策略，此时alarm_id不会返回，scheduled_policy有返回，并且recurrence_type、recurrence_value、start_time和end_time有返回。
     */
    public static final class ScalingPolicyTypeEnum {

        
        /**
         * Enum ALARM for value: "ALARM"
         */
        public static final ScalingPolicyTypeEnum ALARM = new ScalingPolicyTypeEnum("ALARM");
        
        /**
         * Enum SCHEDULED for value: "SCHEDULED"
         */
        public static final ScalingPolicyTypeEnum SCHEDULED = new ScalingPolicyTypeEnum("SCHEDULED");
        
        /**
         * Enum RECURRENCE for value: "RECURRENCE"
         */
        public static final ScalingPolicyTypeEnum RECURRENCE = new ScalingPolicyTypeEnum("RECURRENCE");
        

        private static final Map<String, ScalingPolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScalingPolicyTypeEnum> createStaticFields() {
            Map<String, ScalingPolicyTypeEnum> map = new HashMap<>();
            map.put("ALARM", ALARM);
            map.put("SCHEDULED", SCHEDULED);
            map.put("RECURRENCE", RECURRENCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScalingPolicyTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingPolicyTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ScalingPolicyTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScalingPolicyTypeEnum(value);
            }
            return result;
        }

        public static ScalingPolicyTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScalingPolicyTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ScalingPolicyTypeEnum) {
                return this.value.equals(((ScalingPolicyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_type")
    
    private ScalingPolicyTypeEnum scalingPolicyType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_id")
    
    private String alarmId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduled_policy")
    
    private ScheduledPolicy scheduledPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_action")
    
    private ScalingPolicyActionV2 scalingPolicyAction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cool_down_time")
    
    private Integer coolDownTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private ScalingPolicyV2MetaData metaData;

    public ScalingV2PolicyDetail withScalingPolicyName(String scalingPolicyName) {
        this.scalingPolicyName = scalingPolicyName;
        return this;
    }

    


    /**
     * 伸缩策略名称。
     * @return scalingPolicyName
     */
    public String getScalingPolicyName() {
        return scalingPolicyName;
    }

    public void setScalingPolicyName(String scalingPolicyName) {
        this.scalingPolicyName = scalingPolicyName;
    }

    

    public ScalingV2PolicyDetail withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    


    /**
     * 伸缩策略ID。
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }

    

    public ScalingV2PolicyDetail withScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
        return this;
    }

    


    /**
     * 伸缩资源ID。
     * @return scalingResourceId
     */
    public String getScalingResourceId() {
        return scalingResourceId;
    }

    public void setScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
    }

    

    public ScalingV2PolicyDetail withScalingResourceType(ScalingResourceTypeEnum scalingResourceType) {
        this.scalingResourceType = scalingResourceType;
        return this;
    }

    


    /**
     * 伸缩资源类型。伸缩组：SCALING_GROUP。带宽：BANDWIDTH。
     * @return scalingResourceType
     */
    public ScalingResourceTypeEnum getScalingResourceType() {
        return scalingResourceType;
    }

    public void setScalingResourceType(ScalingResourceTypeEnum scalingResourceType) {
        this.scalingResourceType = scalingResourceType;
    }

    

    public ScalingV2PolicyDetail withPolicyStatus(PolicyStatusEnum policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }

    


    /**
     * 伸缩策略状态。INSERVICE：使用中。PAUSED：停止。EXECUTING：执行中。
     * @return policyStatus
     */
    public PolicyStatusEnum getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(PolicyStatusEnum policyStatus) {
        this.policyStatus = policyStatus;
    }

    

    public ScalingV2PolicyDetail withScalingPolicyType(ScalingPolicyTypeEnum scalingPolicyType) {
        this.scalingPolicyType = scalingPolicyType;
        return this;
    }

    


    /**
     * 伸缩策略类型：ALARM：告警策略，此时alarm_id有返回，scheduled_policy不会返回。SCHEDULED：定时策略，此时alarm_id不会返回，scheduled_policy有返回，并且recurrence_type、recurrence_value、start_time和end_time不会返回。RECURRENCE：周期策略，此时alarm_id不会返回，scheduled_policy有返回，并且recurrence_type、recurrence_value、start_time和end_time有返回。
     * @return scalingPolicyType
     */
    public ScalingPolicyTypeEnum getScalingPolicyType() {
        return scalingPolicyType;
    }

    public void setScalingPolicyType(ScalingPolicyTypeEnum scalingPolicyType) {
        this.scalingPolicyType = scalingPolicyType;
    }

    

    public ScalingV2PolicyDetail withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    


    /**
     * 告警ID。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    

    public ScalingV2PolicyDetail withScheduledPolicy(ScheduledPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
        return this;
    }

    public ScalingV2PolicyDetail withScheduledPolicy(Consumer<ScheduledPolicy> scheduledPolicySetter) {
        if(this.scheduledPolicy == null ){
            this.scheduledPolicy = new ScheduledPolicy();
            scheduledPolicySetter.accept(this.scheduledPolicy);
        }
        
        return this;
    }


    /**
     * Get scheduledPolicy
     * @return scheduledPolicy
     */
    public ScheduledPolicy getScheduledPolicy() {
        return scheduledPolicy;
    }

    public void setScheduledPolicy(ScheduledPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
    }

    

    public ScalingV2PolicyDetail withScalingPolicyAction(ScalingPolicyActionV2 scalingPolicyAction) {
        this.scalingPolicyAction = scalingPolicyAction;
        return this;
    }

    public ScalingV2PolicyDetail withScalingPolicyAction(Consumer<ScalingPolicyActionV2> scalingPolicyActionSetter) {
        if(this.scalingPolicyAction == null ){
            this.scalingPolicyAction = new ScalingPolicyActionV2();
            scalingPolicyActionSetter.accept(this.scalingPolicyAction);
        }
        
        return this;
    }


    /**
     * Get scalingPolicyAction
     * @return scalingPolicyAction
     */
    public ScalingPolicyActionV2 getScalingPolicyAction() {
        return scalingPolicyAction;
    }

    public void setScalingPolicyAction(ScalingPolicyActionV2 scalingPolicyAction) {
        this.scalingPolicyAction = scalingPolicyAction;
    }

    

    public ScalingV2PolicyDetail withCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
        return this;
    }

    


    /**
     * 冷却时间，取值范围0-86400，默认为300，单位是秒。
     * maximum: 86400
     * @return coolDownTime
     */
    public Integer getCoolDownTime() {
        return coolDownTime;
    }

    public void setCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
    }

    

    public ScalingV2PolicyDetail withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建伸缩策略时间，遵循UTC时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    

    public ScalingV2PolicyDetail withMetaData(ScalingPolicyV2MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ScalingV2PolicyDetail withMetaData(Consumer<ScalingPolicyV2MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new ScalingPolicyV2MetaData();
            metaDataSetter.accept(this.metaData);
        }
        
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public ScalingPolicyV2MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ScalingPolicyV2MetaData metaData) {
        this.metaData = metaData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingV2PolicyDetail scalingV2PolicyDetail = (ScalingV2PolicyDetail) o;
        return Objects.equals(this.scalingPolicyName, scalingV2PolicyDetail.scalingPolicyName) &&
            Objects.equals(this.scalingPolicyId, scalingV2PolicyDetail.scalingPolicyId) &&
            Objects.equals(this.scalingResourceId, scalingV2PolicyDetail.scalingResourceId) &&
            Objects.equals(this.scalingResourceType, scalingV2PolicyDetail.scalingResourceType) &&
            Objects.equals(this.policyStatus, scalingV2PolicyDetail.policyStatus) &&
            Objects.equals(this.scalingPolicyType, scalingV2PolicyDetail.scalingPolicyType) &&
            Objects.equals(this.alarmId, scalingV2PolicyDetail.alarmId) &&
            Objects.equals(this.scheduledPolicy, scalingV2PolicyDetail.scheduledPolicy) &&
            Objects.equals(this.scalingPolicyAction, scalingV2PolicyDetail.scalingPolicyAction) &&
            Objects.equals(this.coolDownTime, scalingV2PolicyDetail.coolDownTime) &&
            Objects.equals(this.createTime, scalingV2PolicyDetail.createTime) &&
            Objects.equals(this.metaData, scalingV2PolicyDetail.metaData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyName, scalingPolicyId, scalingResourceId, scalingResourceType, policyStatus, scalingPolicyType, alarmId, scheduledPolicy, scalingPolicyAction, coolDownTime, createTime, metaData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingV2PolicyDetail {\n");
        sb.append("    scalingPolicyName: ").append(toIndentedString(scalingPolicyName)).append("\n");
        sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
        sb.append("    scalingResourceId: ").append(toIndentedString(scalingResourceId)).append("\n");
        sb.append("    scalingResourceType: ").append(toIndentedString(scalingResourceType)).append("\n");
        sb.append("    policyStatus: ").append(toIndentedString(policyStatus)).append("\n");
        sb.append("    scalingPolicyType: ").append(toIndentedString(scalingPolicyType)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
        sb.append("    scalingPolicyAction: ").append(toIndentedString(scalingPolicyAction)).append("\n");
        sb.append("    coolDownTime: ").append(toIndentedString(coolDownTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

