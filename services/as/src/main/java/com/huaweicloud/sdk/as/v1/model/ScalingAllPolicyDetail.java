package com.huaweicloud.sdk.as.v1.model;

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
 * 伸缩策略
 */
public class ScalingAllPolicyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_name")

    private String scalingPolicyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_id")

    private String scalingPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_resource_id")

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScalingResourceTypeEnum(value));
        }

        public static ScalingResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScalingResourceTypeEnum) {
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
    @JsonProperty(value = "scaling_resource_type")

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PolicyStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyStatusEnum(value));
        }

        public static PolicyStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyStatusEnum) {
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
    @JsonProperty(value = "policy_status")

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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScalingPolicyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScalingPolicyTypeEnum(value));
        }

        public static ScalingPolicyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScalingPolicyTypeEnum) {
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
    @JsonProperty(value = "scaling_policy_type")

    private ScalingPolicyTypeEnum scalingPolicyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_policy")

    private ScheduledPolicy scheduledPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_action")

    private ScalingPolicyActionV2 scalingPolicyAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_alarm_actions")

    private List<IntervalAlarmActionsV2> intervalAlarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cool_down_time")

    private Integer coolDownTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private ScalingPolicyV2MetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ScalingAllPolicyDetail withScalingPolicyName(String scalingPolicyName) {
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

    public ScalingAllPolicyDetail withScalingPolicyId(String scalingPolicyId) {
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

    public ScalingAllPolicyDetail withScalingResourceId(String scalingResourceId) {
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

    public ScalingAllPolicyDetail withScalingResourceType(ScalingResourceTypeEnum scalingResourceType) {
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

    public ScalingAllPolicyDetail withPolicyStatus(PolicyStatusEnum policyStatus) {
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

    public ScalingAllPolicyDetail withScalingPolicyType(ScalingPolicyTypeEnum scalingPolicyType) {
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

    public ScalingAllPolicyDetail withAlarmId(String alarmId) {
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

    public ScalingAllPolicyDetail withScheduledPolicy(ScheduledPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
        return this;
    }

    public ScalingAllPolicyDetail withScheduledPolicy(Consumer<ScheduledPolicy> scheduledPolicySetter) {
        if (this.scheduledPolicy == null) {
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

    public ScalingAllPolicyDetail withScalingPolicyAction(ScalingPolicyActionV2 scalingPolicyAction) {
        this.scalingPolicyAction = scalingPolicyAction;
        return this;
    }

    public ScalingAllPolicyDetail withScalingPolicyAction(Consumer<ScalingPolicyActionV2> scalingPolicyActionSetter) {
        if (this.scalingPolicyAction == null) {
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

    public ScalingAllPolicyDetail withIntervalAlarmActions(List<IntervalAlarmActionsV2> intervalAlarmActions) {
        this.intervalAlarmActions = intervalAlarmActions;
        return this;
    }

    public ScalingAllPolicyDetail addIntervalAlarmActionsItem(IntervalAlarmActionsV2 intervalAlarmActionsItem) {
        if (this.intervalAlarmActions == null) {
            this.intervalAlarmActions = new ArrayList<>();
        }
        this.intervalAlarmActions.add(intervalAlarmActionsItem);
        return this;
    }

    public ScalingAllPolicyDetail withIntervalAlarmActions(
        Consumer<List<IntervalAlarmActionsV2>> intervalAlarmActionsSetter) {
        if (this.intervalAlarmActions == null) {
            this.intervalAlarmActions = new ArrayList<>();
        }
        intervalAlarmActionsSetter.accept(this.intervalAlarmActions);
        return this;
    }

    /**
     * Get intervalAlarmActions
     * @return intervalAlarmActions
     */
    public List<IntervalAlarmActionsV2> getIntervalAlarmActions() {
        return intervalAlarmActions;
    }

    public void setIntervalAlarmActions(List<IntervalAlarmActionsV2> intervalAlarmActions) {
        this.intervalAlarmActions = intervalAlarmActions;
    }

    public ScalingAllPolicyDetail withCoolDownTime(Integer coolDownTime) {
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

    public ScalingAllPolicyDetail withCreateTime(OffsetDateTime createTime) {
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

    public ScalingAllPolicyDetail withMetaData(ScalingPolicyV2MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ScalingAllPolicyDetail withMetaData(Consumer<ScalingPolicyV2MetaData> metaDataSetter) {
        if (this.metaData == null) {
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

    public ScalingAllPolicyDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 伸缩策略描述（1-256个字符）
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingAllPolicyDetail that = (ScalingAllPolicyDetail) obj;
        return Objects.equals(this.scalingPolicyName, that.scalingPolicyName)
            && Objects.equals(this.scalingPolicyId, that.scalingPolicyId)
            && Objects.equals(this.scalingResourceId, that.scalingResourceId)
            && Objects.equals(this.scalingResourceType, that.scalingResourceType)
            && Objects.equals(this.policyStatus, that.policyStatus)
            && Objects.equals(this.scalingPolicyType, that.scalingPolicyType)
            && Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.scheduledPolicy, that.scheduledPolicy)
            && Objects.equals(this.scalingPolicyAction, that.scalingPolicyAction)
            && Objects.equals(this.intervalAlarmActions, that.intervalAlarmActions)
            && Objects.equals(this.coolDownTime, that.coolDownTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.metaData, that.metaData) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyName,
            scalingPolicyId,
            scalingResourceId,
            scalingResourceType,
            policyStatus,
            scalingPolicyType,
            alarmId,
            scheduledPolicy,
            scalingPolicyAction,
            intervalAlarmActions,
            coolDownTime,
            createTime,
            metaData,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingAllPolicyDetail {\n");
        sb.append("    scalingPolicyName: ").append(toIndentedString(scalingPolicyName)).append("\n");
        sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
        sb.append("    scalingResourceId: ").append(toIndentedString(scalingResourceId)).append("\n");
        sb.append("    scalingResourceType: ").append(toIndentedString(scalingResourceType)).append("\n");
        sb.append("    policyStatus: ").append(toIndentedString(policyStatus)).append("\n");
        sb.append("    scalingPolicyType: ").append(toIndentedString(scalingPolicyType)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
        sb.append("    scalingPolicyAction: ").append(toIndentedString(scalingPolicyAction)).append("\n");
        sb.append("    intervalAlarmActions: ").append(toIndentedString(intervalAlarmActions)).append("\n");
        sb.append("    coolDownTime: ").append(toIndentedString(coolDownTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
