package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 自动扩缩容策略详情中的扩缩容规则。
 */
public class AutoScalingRuleRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_replicas")

    private Integer targetReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    /**
     * 规则最新状态。可选值如下： - creating：规则创建中 - creation-succeed：规则创建成功。 - creation-failed：规则创建失败。 - trigger-succeed：规则触发成功。 - trigger-failed：规则触发失败。
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum CREATION_SUCCEED for value: "creation-succeed"
         */
        public static final StatusEnum CREATION_SUCCEED = new StatusEnum("creation-succeed");

        /**
         * Enum CREATION_FAILED for value: "creation-failed"
         */
        public static final StatusEnum CREATION_FAILED = new StatusEnum("creation-failed");

        /**
         * Enum TRIGGER_SUCCEED for value: "trigger-succeed"
         */
        public static final StatusEnum TRIGGER_SUCCEED = new StatusEnum("trigger-succeed");

        /**
         * Enum TRIGGER_FAILED for value: "trigger-failed"
         */
        public static final StatusEnum TRIGGER_FAILED = new StatusEnum("trigger-failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("creating", CREATING);
            map.put("creation-succeed", CREATION_SUCCEED);
            map.put("creation-failed", CREATION_FAILED);
            map.put("trigger-succeed", TRIGGER_SUCCEED);
            map.put("trigger-failed", TRIGGER_FAILED);
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
    @JsonProperty(value = "trigger_time")

    private String triggerTime;

    public AutoScalingRuleRsp withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 自动扩缩容规则的名称。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AutoScalingRuleRsp withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 在定时类型自动扩缩容策略中，任务运行的时间与周期。
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public AutoScalingRuleRsp withTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
        return this;
    }

    /**
     * 自动扩缩容的目标实例数。
     * @return targetReplicas
     */
    public Integer getTargetReplicas() {
        return targetReplicas;
    }

    public void setTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
    }

    public AutoScalingRuleRsp withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * 规则是否禁用。可选值如下： - true：该规则设置禁用状态。 - false：该规则设置启用状态。
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public AutoScalingRuleRsp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 规则最新状态。可选值如下： - creating：规则创建中 - creation-succeed：规则创建成功。 - creation-failed：规则创建失败。 - trigger-succeed：规则触发成功。 - trigger-failed：规则触发失败。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AutoScalingRuleRsp withTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * 最近一次规则触发时间
     * @return triggerTime
     */
    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoScalingRuleRsp that = (AutoScalingRuleRsp) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.schedule, that.schedule)
            && Objects.equals(this.targetReplicas, that.targetReplicas) && Objects.equals(this.disable, that.disable)
            && Objects.equals(this.status, that.status) && Objects.equals(this.triggerTime, that.triggerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, schedule, targetReplicas, disable, status, triggerTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingRuleRsp {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    targetReplicas: ").append(toIndentedString(targetReplicas)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
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
