package com.huaweicloud.sdk.coc.v1.model;

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
 * Sla 的规则
 */
public class SlaRuleInfo {

    /**
     * 状态类型: EVENT_TICKET_NOT_ACCEPTED EVENT_TICKET_PROCESSING EVENT_TICKET_RESOLVED ALARM_TICKET_ALARMING CHANGE_REVIEW CHANGE_IMPLEMENTATION CHANGE_VERIFICATION TO_DO_TASKS_TO_BE_HANDLED TO_DO_TASKS_PROCESSING ISSUE_TICKET_NOT_ACCEPTED ISSUE_TICKET_POSITIONING ISSUE_TICKET_WAITING_IMPLEMENT ISSUE_TICKET_RESOLVED
     */
    public static final class StatusTypeEnum {

        /**
         * Enum EVENT_TICKET_NOT_ACCEPTED for value: "EVENT_TICKET_NOT_ACCEPTED"
         */
        public static final StatusTypeEnum EVENT_TICKET_NOT_ACCEPTED = new StatusTypeEnum("EVENT_TICKET_NOT_ACCEPTED");

        /**
         * Enum EVENT_TICKET_PROCESSING for value: "EVENT_TICKET_PROCESSING"
         */
        public static final StatusTypeEnum EVENT_TICKET_PROCESSING = new StatusTypeEnum("EVENT_TICKET_PROCESSING");

        /**
         * Enum EVENT_TICKET_RESOLVED for value: "EVENT_TICKET_RESOLVED"
         */
        public static final StatusTypeEnum EVENT_TICKET_RESOLVED = new StatusTypeEnum("EVENT_TICKET_RESOLVED");

        /**
         * Enum ALARM_TICKET_ALARMING for value: "ALARM_TICKET_ALARMING"
         */
        public static final StatusTypeEnum ALARM_TICKET_ALARMING = new StatusTypeEnum("ALARM_TICKET_ALARMING");

        /**
         * Enum CHANGE_REVIEW for value: "CHANGE_REVIEW"
         */
        public static final StatusTypeEnum CHANGE_REVIEW = new StatusTypeEnum("CHANGE_REVIEW");

        /**
         * Enum CHANGE_IMPLEMENTATION for value: "CHANGE_IMPLEMENTATION"
         */
        public static final StatusTypeEnum CHANGE_IMPLEMENTATION = new StatusTypeEnum("CHANGE_IMPLEMENTATION");

        /**
         * Enum CHANGE_VERIFICATION for value: "CHANGE_VERIFICATION"
         */
        public static final StatusTypeEnum CHANGE_VERIFICATION = new StatusTypeEnum("CHANGE_VERIFICATION");

        /**
         * Enum TO_DO_TASKS_TO_BE_HANDLED for value: "TO_DO_TASKS_TO_BE_HANDLED"
         */
        public static final StatusTypeEnum TO_DO_TASKS_TO_BE_HANDLED = new StatusTypeEnum("TO_DO_TASKS_TO_BE_HANDLED");

        /**
         * Enum TO_DO_TASKS_PROCESSING for value: "TO_DO_TASKS_PROCESSING"
         */
        public static final StatusTypeEnum TO_DO_TASKS_PROCESSING = new StatusTypeEnum("TO_DO_TASKS_PROCESSING");

        /**
         * Enum ISSUE_TICKET_NOT_ACCEPTED for value: "ISSUE_TICKET_NOT_ACCEPTED"
         */
        public static final StatusTypeEnum ISSUE_TICKET_NOT_ACCEPTED = new StatusTypeEnum("ISSUE_TICKET_NOT_ACCEPTED");

        /**
         * Enum ISSUE_TICKET_POSITIONING for value: "ISSUE_TICKET_POSITIONING"
         */
        public static final StatusTypeEnum ISSUE_TICKET_POSITIONING = new StatusTypeEnum("ISSUE_TICKET_POSITIONING");

        /**
         * Enum ISSUE_TICKET_WAITING_IMPLEMENT for value: "ISSUE_TICKET_WAITING_IMPLEMENT"
         */
        public static final StatusTypeEnum ISSUE_TICKET_WAITING_IMPLEMENT =
            new StatusTypeEnum("ISSUE_TICKET_WAITING_IMPLEMENT");

        /**
         * Enum ISSUE_TICKET_RESOLVED for value: "ISSUE_TICKET_RESOLVED"
         */
        public static final StatusTypeEnum ISSUE_TICKET_RESOLVED = new StatusTypeEnum("ISSUE_TICKET_RESOLVED");

        private static final Map<String, StatusTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusTypeEnum> createStaticFields() {
            Map<String, StatusTypeEnum> map = new HashMap<>();
            map.put("EVENT_TICKET_NOT_ACCEPTED", EVENT_TICKET_NOT_ACCEPTED);
            map.put("EVENT_TICKET_PROCESSING", EVENT_TICKET_PROCESSING);
            map.put("EVENT_TICKET_RESOLVED", EVENT_TICKET_RESOLVED);
            map.put("ALARM_TICKET_ALARMING", ALARM_TICKET_ALARMING);
            map.put("CHANGE_REVIEW", CHANGE_REVIEW);
            map.put("CHANGE_IMPLEMENTATION", CHANGE_IMPLEMENTATION);
            map.put("CHANGE_VERIFICATION", CHANGE_VERIFICATION);
            map.put("TO_DO_TASKS_TO_BE_HANDLED", TO_DO_TASKS_TO_BE_HANDLED);
            map.put("TO_DO_TASKS_PROCESSING", TO_DO_TASKS_PROCESSING);
            map.put("ISSUE_TICKET_NOT_ACCEPTED", ISSUE_TICKET_NOT_ACCEPTED);
            map.put("ISSUE_TICKET_POSITIONING", ISSUE_TICKET_POSITIONING);
            map.put("ISSUE_TICKET_WAITING_IMPLEMENT", ISSUE_TICKET_WAITING_IMPLEMENT);
            map.put("ISSUE_TICKET_RESOLVED", ISSUE_TICKET_RESOLVED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusTypeEnum(String value) {
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
        public static StatusTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusTypeEnum(value));
        }

        public static StatusTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusTypeEnum) {
                return this.value.equals(((StatusTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_type")

    private StatusTypeEnum statusType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggering_rule_enable")

    private Boolean triggeringRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_warning_rule_enable")

    private Boolean preWarningRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escalate_rule_enable")

    private Boolean escalateRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggering_rule")

    private SlaTriggeringRuleInfo triggeringRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_warning_rule")

    private SlaPreWarningRuleInfo preWarningRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escalate_rules")

    private List<SlaEscalationRuleInfo> escalateRules = null;

    public SlaRuleInfo withStatusType(StatusTypeEnum statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * 状态类型: EVENT_TICKET_NOT_ACCEPTED EVENT_TICKET_PROCESSING EVENT_TICKET_RESOLVED ALARM_TICKET_ALARMING CHANGE_REVIEW CHANGE_IMPLEMENTATION CHANGE_VERIFICATION TO_DO_TASKS_TO_BE_HANDLED TO_DO_TASKS_PROCESSING ISSUE_TICKET_NOT_ACCEPTED ISSUE_TICKET_POSITIONING ISSUE_TICKET_WAITING_IMPLEMENT ISSUE_TICKET_RESOLVED
     * @return statusType
     */
    public StatusTypeEnum getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusTypeEnum statusType) {
        this.statusType = statusType;
    }

    public SlaRuleInfo withTriggeringRuleEnable(Boolean triggeringRuleEnable) {
        this.triggeringRuleEnable = triggeringRuleEnable;
        return this;
    }

    /**
     * 触发规则是否生效
     * @return triggeringRuleEnable
     */
    public Boolean getTriggeringRuleEnable() {
        return triggeringRuleEnable;
    }

    public void setTriggeringRuleEnable(Boolean triggeringRuleEnable) {
        this.triggeringRuleEnable = triggeringRuleEnable;
    }

    public SlaRuleInfo withPreWarningRuleEnable(Boolean preWarningRuleEnable) {
        this.preWarningRuleEnable = preWarningRuleEnable;
        return this;
    }

    /**
     * 预警规则是否生效
     * @return preWarningRuleEnable
     */
    public Boolean getPreWarningRuleEnable() {
        return preWarningRuleEnable;
    }

    public void setPreWarningRuleEnable(Boolean preWarningRuleEnable) {
        this.preWarningRuleEnable = preWarningRuleEnable;
    }

    public SlaRuleInfo withEscalateRuleEnable(Boolean escalateRuleEnable) {
        this.escalateRuleEnable = escalateRuleEnable;
        return this;
    }

    /**
     * 上升规则是否生效
     * @return escalateRuleEnable
     */
    public Boolean getEscalateRuleEnable() {
        return escalateRuleEnable;
    }

    public void setEscalateRuleEnable(Boolean escalateRuleEnable) {
        this.escalateRuleEnable = escalateRuleEnable;
    }

    public SlaRuleInfo withTriggeringRule(SlaTriggeringRuleInfo triggeringRule) {
        this.triggeringRule = triggeringRule;
        return this;
    }

    public SlaRuleInfo withTriggeringRule(Consumer<SlaTriggeringRuleInfo> triggeringRuleSetter) {
        if (this.triggeringRule == null) {
            this.triggeringRule = new SlaTriggeringRuleInfo();
            triggeringRuleSetter.accept(this.triggeringRule);
        }

        return this;
    }

    /**
     * Get triggeringRule
     * @return triggeringRule
     */
    public SlaTriggeringRuleInfo getTriggeringRule() {
        return triggeringRule;
    }

    public void setTriggeringRule(SlaTriggeringRuleInfo triggeringRule) {
        this.triggeringRule = triggeringRule;
    }

    public SlaRuleInfo withPreWarningRule(SlaPreWarningRuleInfo preWarningRule) {
        this.preWarningRule = preWarningRule;
        return this;
    }

    public SlaRuleInfo withPreWarningRule(Consumer<SlaPreWarningRuleInfo> preWarningRuleSetter) {
        if (this.preWarningRule == null) {
            this.preWarningRule = new SlaPreWarningRuleInfo();
            preWarningRuleSetter.accept(this.preWarningRule);
        }

        return this;
    }

    /**
     * Get preWarningRule
     * @return preWarningRule
     */
    public SlaPreWarningRuleInfo getPreWarningRule() {
        return preWarningRule;
    }

    public void setPreWarningRule(SlaPreWarningRuleInfo preWarningRule) {
        this.preWarningRule = preWarningRule;
    }

    public SlaRuleInfo withEscalateRules(List<SlaEscalationRuleInfo> escalateRules) {
        this.escalateRules = escalateRules;
        return this;
    }

    public SlaRuleInfo addEscalateRulesItem(SlaEscalationRuleInfo escalateRulesItem) {
        if (this.escalateRules == null) {
            this.escalateRules = new ArrayList<>();
        }
        this.escalateRules.add(escalateRulesItem);
        return this;
    }

    public SlaRuleInfo withEscalateRules(Consumer<List<SlaEscalationRuleInfo>> escalateRulesSetter) {
        if (this.escalateRules == null) {
            this.escalateRules = new ArrayList<>();
        }
        escalateRulesSetter.accept(this.escalateRules);
        return this;
    }

    /**
     * 通知配置
     * @return escalateRules
     */
    public List<SlaEscalationRuleInfo> getEscalateRules() {
        return escalateRules;
    }

    public void setEscalateRules(List<SlaEscalationRuleInfo> escalateRules) {
        this.escalateRules = escalateRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlaRuleInfo that = (SlaRuleInfo) obj;
        return Objects.equals(this.statusType, that.statusType)
            && Objects.equals(this.triggeringRuleEnable, that.triggeringRuleEnable)
            && Objects.equals(this.preWarningRuleEnable, that.preWarningRuleEnable)
            && Objects.equals(this.escalateRuleEnable, that.escalateRuleEnable)
            && Objects.equals(this.triggeringRule, that.triggeringRule)
            && Objects.equals(this.preWarningRule, that.preWarningRule)
            && Objects.equals(this.escalateRules, that.escalateRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusType,
            triggeringRuleEnable,
            preWarningRuleEnable,
            escalateRuleEnable,
            triggeringRule,
            preWarningRule,
            escalateRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlaRuleInfo {\n");
        sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
        sb.append("    triggeringRuleEnable: ").append(toIndentedString(triggeringRuleEnable)).append("\n");
        sb.append("    preWarningRuleEnable: ").append(toIndentedString(preWarningRuleEnable)).append("\n");
        sb.append("    escalateRuleEnable: ").append(toIndentedString(escalateRuleEnable)).append("\n");
        sb.append("    triggeringRule: ").append(toIndentedString(triggeringRule)).append("\n");
        sb.append("    preWarningRule: ").append(toIndentedString(preWarningRule)).append("\n");
        sb.append("    escalateRules: ").append(toIndentedString(escalateRules)).append("\n");
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
