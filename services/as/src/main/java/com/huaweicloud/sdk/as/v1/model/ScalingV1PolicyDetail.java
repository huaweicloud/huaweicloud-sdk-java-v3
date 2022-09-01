package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 伸缩策略
 */
public class ScalingV1PolicyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_id")

    @JacksonXmlProperty(localName = "scaling_group_id")

    private String scalingGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_name")

    @JacksonXmlProperty(localName = "scaling_policy_name")

    private String scalingPolicyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_id")

    @JacksonXmlProperty(localName = "scaling_policy_id")

    private String scalingPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_status")

    @JacksonXmlProperty(localName = "policy_status")

    private String policyStatus;

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
            ScalingPolicyTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScalingPolicyTypeEnum(value);
            }
            return result;
        }

        public static ScalingPolicyTypeEnum valueOf(String value) {
            if (value == null) {
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

    @JacksonXmlProperty(localName = "scaling_policy_type")

    private ScalingPolicyTypeEnum scalingPolicyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    @JacksonXmlProperty(localName = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_policy")

    @JacksonXmlProperty(localName = "scheduled_policy")

    private ScheduledPolicy scheduledPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_action")

    @JacksonXmlProperty(localName = "scaling_policy_action")

    private ScalingPolicyActionV1 scalingPolicyAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cool_down_time")

    @JacksonXmlProperty(localName = "cool_down_time")

    private Integer coolDownTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    public ScalingV1PolicyDetail withScalingGroupId(String scalingGroupId) {
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

    public ScalingV1PolicyDetail withScalingPolicyName(String scalingPolicyName) {
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

    public ScalingV1PolicyDetail withScalingPolicyId(String scalingPolicyId) {
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

    public ScalingV1PolicyDetail withPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }

    /**
     * 伸缩策略状态  INSERVICE：已启用 PAUSED：已停用 EXECUTING：执行中
     * @return policyStatus
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public ScalingV1PolicyDetail withScalingPolicyType(ScalingPolicyTypeEnum scalingPolicyType) {
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

    public ScalingV1PolicyDetail withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警ID，即告警规则的ID，当scaling_policy_type为ALARM时该项必选，此时scheduled_policy不生效。创建告警策略成功后，会自动为该告警ID对应的告警规则的alarm_actions字段增加类型为autoscaling的告警触发动作。告警ID通过查询云监控告警规则列表获取，详见《云监控API参考》的“查询告警规则列表”。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ScalingV1PolicyDetail withScheduledPolicy(ScheduledPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
        return this;
    }

    public ScalingV1PolicyDetail withScheduledPolicy(Consumer<ScheduledPolicy> scheduledPolicySetter) {
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

    public ScalingV1PolicyDetail withScalingPolicyAction(ScalingPolicyActionV1 scalingPolicyAction) {
        this.scalingPolicyAction = scalingPolicyAction;
        return this;
    }

    public ScalingV1PolicyDetail withScalingPolicyAction(Consumer<ScalingPolicyActionV1> scalingPolicyActionSetter) {
        if (this.scalingPolicyAction == null) {
            this.scalingPolicyAction = new ScalingPolicyActionV1();
            scalingPolicyActionSetter.accept(this.scalingPolicyAction);
        }

        return this;
    }

    /**
     * Get scalingPolicyAction
     * @return scalingPolicyAction
     */
    public ScalingPolicyActionV1 getScalingPolicyAction() {
        return scalingPolicyAction;
    }

    public void setScalingPolicyAction(ScalingPolicyActionV1 scalingPolicyAction) {
        this.scalingPolicyAction = scalingPolicyAction;
    }

    public ScalingV1PolicyDetail withCoolDownTime(Integer coolDownTime) {
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

    public ScalingV1PolicyDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建伸缩策略时间，遵循UTC时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingV1PolicyDetail scalingV1PolicyDetail = (ScalingV1PolicyDetail) o;
        return Objects.equals(this.scalingGroupId, scalingV1PolicyDetail.scalingGroupId)
            && Objects.equals(this.scalingPolicyName, scalingV1PolicyDetail.scalingPolicyName)
            && Objects.equals(this.scalingPolicyId, scalingV1PolicyDetail.scalingPolicyId)
            && Objects.equals(this.policyStatus, scalingV1PolicyDetail.policyStatus)
            && Objects.equals(this.scalingPolicyType, scalingV1PolicyDetail.scalingPolicyType)
            && Objects.equals(this.alarmId, scalingV1PolicyDetail.alarmId)
            && Objects.equals(this.scheduledPolicy, scalingV1PolicyDetail.scheduledPolicy)
            && Objects.equals(this.scalingPolicyAction, scalingV1PolicyDetail.scalingPolicyAction)
            && Objects.equals(this.coolDownTime, scalingV1PolicyDetail.coolDownTime)
            && Objects.equals(this.createTime, scalingV1PolicyDetail.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId,
            scalingPolicyName,
            scalingPolicyId,
            policyStatus,
            scalingPolicyType,
            alarmId,
            scheduledPolicy,
            scalingPolicyAction,
            coolDownTime,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingV1PolicyDetail {\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
        sb.append("    scalingPolicyName: ").append(toIndentedString(scalingPolicyName)).append("\n");
        sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
        sb.append("    policyStatus: ").append(toIndentedString(policyStatus)).append("\n");
        sb.append("    scalingPolicyType: ").append(toIndentedString(scalingPolicyType)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
        sb.append("    scalingPolicyAction: ").append(toIndentedString(scalingPolicyAction)).append("\n");
        sb.append("    coolDownTime: ").append(toIndentedString(coolDownTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
