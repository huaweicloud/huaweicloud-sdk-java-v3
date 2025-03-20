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
 * Sla 规则记录
 */
public class SlaRecord {

    /**
     * 状态类型: EVENT_TICKET_NOT_ACCEPTED EVENT_TICKET_PROCESSING EVENT_TICKET_NOT_IN_TIME EVENT_TICKET_RESOLVED ALARM_TICKET_RESOLVED ALARM_TICKET_ALARMING ALARM_TICKET_NOT_IN_TIME CHANGE_NOT_IN_TIME CHANGE_REVIEW CHANGE_IMPLEMENTATION CHANGE_VERIFICATION TO_DO_TASKS_NOT_IN_TIME TO_DO_TASKS_TO_BE_HANDLED TO_DO_TASKS_PROCESSING TO_DO_TASKS_COMPLETED ISSUE_TICKET_NOT_IN_TIME ISSUE_TICKET_NOT_ACCEPTED ISSUE_TICKET_POSITIONING ISSUE_TICKET_WAITING_IMPLEMENT ISSUE_TICKET_RESOLVED
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
         * Enum EVENT_TICKET_NOT_IN_TIME for value: "EVENT_TICKET_NOT_IN_TIME"
         */
        public static final StatusTypeEnum EVENT_TICKET_NOT_IN_TIME = new StatusTypeEnum("EVENT_TICKET_NOT_IN_TIME");

        /**
         * Enum EVENT_TICKET_RESOLVED for value: "EVENT_TICKET_RESOLVED"
         */
        public static final StatusTypeEnum EVENT_TICKET_RESOLVED = new StatusTypeEnum("EVENT_TICKET_RESOLVED");

        /**
         * Enum ALARM_TICKET_RESOLVED for value: "ALARM_TICKET_RESOLVED"
         */
        public static final StatusTypeEnum ALARM_TICKET_RESOLVED = new StatusTypeEnum("ALARM_TICKET_RESOLVED");

        /**
         * Enum ALARM_TICKET_ALARMING for value: "ALARM_TICKET_ALARMING"
         */
        public static final StatusTypeEnum ALARM_TICKET_ALARMING = new StatusTypeEnum("ALARM_TICKET_ALARMING");

        /**
         * Enum ALARM_TICKET_NOT_IN_TIME for value: "ALARM_TICKET_NOT_IN_TIME"
         */
        public static final StatusTypeEnum ALARM_TICKET_NOT_IN_TIME = new StatusTypeEnum("ALARM_TICKET_NOT_IN_TIME");

        /**
         * Enum CHANGE_NOT_IN_TIME for value: "CHANGE_NOT_IN_TIME"
         */
        public static final StatusTypeEnum CHANGE_NOT_IN_TIME = new StatusTypeEnum("CHANGE_NOT_IN_TIME");

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
         * Enum TO_DO_TASKS_NOT_IN_TIME for value: "TO_DO_TASKS_NOT_IN_TIME"
         */
        public static final StatusTypeEnum TO_DO_TASKS_NOT_IN_TIME = new StatusTypeEnum("TO_DO_TASKS_NOT_IN_TIME");

        /**
         * Enum TO_DO_TASKS_TO_BE_HANDLED for value: "TO_DO_TASKS_TO_BE_HANDLED"
         */
        public static final StatusTypeEnum TO_DO_TASKS_TO_BE_HANDLED = new StatusTypeEnum("TO_DO_TASKS_TO_BE_HANDLED");

        /**
         * Enum TO_DO_TASKS_PROCESSING for value: "TO_DO_TASKS_PROCESSING"
         */
        public static final StatusTypeEnum TO_DO_TASKS_PROCESSING = new StatusTypeEnum("TO_DO_TASKS_PROCESSING");

        /**
         * Enum TO_DO_TASKS_COMPLETED for value: "TO_DO_TASKS_COMPLETED"
         */
        public static final StatusTypeEnum TO_DO_TASKS_COMPLETED = new StatusTypeEnum("TO_DO_TASKS_COMPLETED");

        /**
         * Enum ISSUE_TICKET_NOT_IN_TIME for value: "ISSUE_TICKET_NOT_IN_TIME"
         */
        public static final StatusTypeEnum ISSUE_TICKET_NOT_IN_TIME = new StatusTypeEnum("ISSUE_TICKET_NOT_IN_TIME");

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
            map.put("EVENT_TICKET_NOT_IN_TIME", EVENT_TICKET_NOT_IN_TIME);
            map.put("EVENT_TICKET_RESOLVED", EVENT_TICKET_RESOLVED);
            map.put("ALARM_TICKET_RESOLVED", ALARM_TICKET_RESOLVED);
            map.put("ALARM_TICKET_ALARMING", ALARM_TICKET_ALARMING);
            map.put("ALARM_TICKET_NOT_IN_TIME", ALARM_TICKET_NOT_IN_TIME);
            map.put("CHANGE_NOT_IN_TIME", CHANGE_NOT_IN_TIME);
            map.put("CHANGE_REVIEW", CHANGE_REVIEW);
            map.put("CHANGE_IMPLEMENTATION", CHANGE_IMPLEMENTATION);
            map.put("CHANGE_VERIFICATION", CHANGE_VERIFICATION);
            map.put("TO_DO_TASKS_NOT_IN_TIME", TO_DO_TASKS_NOT_IN_TIME);
            map.put("TO_DO_TASKS_TO_BE_HANDLED", TO_DO_TASKS_TO_BE_HANDLED);
            map.put("TO_DO_TASKS_PROCESSING", TO_DO_TASKS_PROCESSING);
            map.put("TO_DO_TASKS_COMPLETED", TO_DO_TASKS_COMPLETED);
            map.put("ISSUE_TICKET_NOT_IN_TIME", ISSUE_TICKET_NOT_IN_TIME);
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

    /**
     * 子状态(NORMAL,FORWARDING,RESUBMIT)
     */
    public static final class SubTriggerNodeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final SubTriggerNodeEnum NORMAL = new SubTriggerNodeEnum("NORMAL");

        /**
         * Enum FORWARDING for value: "FORWARDING"
         */
        public static final SubTriggerNodeEnum FORWARDING = new SubTriggerNodeEnum("FORWARDING");

        /**
         * Enum RESUBMIT for value: "RESUBMIT"
         */
        public static final SubTriggerNodeEnum RESUBMIT = new SubTriggerNodeEnum("RESUBMIT");

        private static final Map<String, SubTriggerNodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubTriggerNodeEnum> createStaticFields() {
            Map<String, SubTriggerNodeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("FORWARDING", FORWARDING);
            map.put("RESUBMIT", RESUBMIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubTriggerNodeEnum(String value) {
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
        public static SubTriggerNodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubTriggerNodeEnum(value));
        }

        public static SubTriggerNodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubTriggerNodeEnum) {
                return this.value.equals(((SubTriggerNodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_trigger_node")

    private SubTriggerNodeEnum subTriggerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_status")

    private Boolean slaStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_order_id")

    private String slaOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggering_rule_enable")

    private Boolean triggeringRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggering_rule")

    private SlaTriggeringRuleInfo triggeringRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "break_time")

    private String breakTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_time")

    private String noticeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_start_time")

    private String statusStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_warning_rule_enable")

    private Boolean preWarningRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_warning_rule")

    private SlaPreWarningRuleInfo preWarningRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escalate_rule_enable")

    private Boolean escalateRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escalate_rules")

    private List<SlaEscalationRuleInfo> escalateRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_node")

    private Boolean currentNode;

    public SlaRecord withStatusType(StatusTypeEnum statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * 状态类型: EVENT_TICKET_NOT_ACCEPTED EVENT_TICKET_PROCESSING EVENT_TICKET_NOT_IN_TIME EVENT_TICKET_RESOLVED ALARM_TICKET_RESOLVED ALARM_TICKET_ALARMING ALARM_TICKET_NOT_IN_TIME CHANGE_NOT_IN_TIME CHANGE_REVIEW CHANGE_IMPLEMENTATION CHANGE_VERIFICATION TO_DO_TASKS_NOT_IN_TIME TO_DO_TASKS_TO_BE_HANDLED TO_DO_TASKS_PROCESSING TO_DO_TASKS_COMPLETED ISSUE_TICKET_NOT_IN_TIME ISSUE_TICKET_NOT_ACCEPTED ISSUE_TICKET_POSITIONING ISSUE_TICKET_WAITING_IMPLEMENT ISSUE_TICKET_RESOLVED
     * @return statusType
     */
    public StatusTypeEnum getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusTypeEnum statusType) {
        this.statusType = statusType;
    }

    public SlaRecord withSubTriggerNode(SubTriggerNodeEnum subTriggerNode) {
        this.subTriggerNode = subTriggerNode;
        return this;
    }

    /**
     * 子状态(NORMAL,FORWARDING,RESUBMIT)
     * @return subTriggerNode
     */
    public SubTriggerNodeEnum getSubTriggerNode() {
        return subTriggerNode;
    }

    public void setSubTriggerNode(SubTriggerNodeEnum subTriggerNode) {
        this.subTriggerNode = subTriggerNode;
    }

    public SlaRecord withSlaStatus(Boolean slaStatus) {
        this.slaStatus = slaStatus;
        return this;
    }

    /**
     * Sla状态  false 未打破
     * @return slaStatus
     */
    public Boolean getSlaStatus() {
        return slaStatus;
    }

    public void setSlaStatus(Boolean slaStatus) {
        this.slaStatus = slaStatus;
    }

    public SlaRecord withSlaOrderId(String slaOrderId) {
        this.slaOrderId = slaOrderId;
        return this;
    }

    /**
     * 工单ID
     * @return slaOrderId
     */
    public String getSlaOrderId() {
        return slaOrderId;
    }

    public void setSlaOrderId(String slaOrderId) {
        this.slaOrderId = slaOrderId;
    }

    public SlaRecord withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 持续时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public SlaRecord withTriggeringRuleEnable(Boolean triggeringRuleEnable) {
        this.triggeringRuleEnable = triggeringRuleEnable;
        return this;
    }

    /**
     * SLA 触发规则是否开启
     * @return triggeringRuleEnable
     */
    public Boolean getTriggeringRuleEnable() {
        return triggeringRuleEnable;
    }

    public void setTriggeringRuleEnable(Boolean triggeringRuleEnable) {
        this.triggeringRuleEnable = triggeringRuleEnable;
    }

    public SlaRecord withTriggeringRule(SlaTriggeringRuleInfo triggeringRule) {
        this.triggeringRule = triggeringRule;
        return this;
    }

    public SlaRecord withTriggeringRule(Consumer<SlaTriggeringRuleInfo> triggeringRuleSetter) {
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

    public SlaRecord withBreakTime(String breakTime) {
        this.breakTime = breakTime;
        return this;
    }

    /**
     * 打破时间
     * @return breakTime
     */
    public String getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(String breakTime) {
        this.breakTime = breakTime;
    }

    public SlaRecord withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 对象ID
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public SlaRecord withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 对象人名
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public SlaRecord withNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
        return this;
    }

    /**
     * 通知时间
     * @return noticeTime
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public SlaRecord withStatusStartTime(String statusStartTime) {
        this.statusStartTime = statusStartTime;
        return this;
    }

    /**
     * 状态开始时间
     * @return statusStartTime
     */
    public String getStatusStartTime() {
        return statusStartTime;
    }

    public void setStatusStartTime(String statusStartTime) {
        this.statusStartTime = statusStartTime;
    }

    public SlaRecord withPreWarningRuleEnable(Boolean preWarningRuleEnable) {
        this.preWarningRuleEnable = preWarningRuleEnable;
        return this;
    }

    /**
     * SLA 预警通知是否开启
     * @return preWarningRuleEnable
     */
    public Boolean getPreWarningRuleEnable() {
        return preWarningRuleEnable;
    }

    public void setPreWarningRuleEnable(Boolean preWarningRuleEnable) {
        this.preWarningRuleEnable = preWarningRuleEnable;
    }

    public SlaRecord withPreWarningRule(SlaPreWarningRuleInfo preWarningRule) {
        this.preWarningRule = preWarningRule;
        return this;
    }

    public SlaRecord withPreWarningRule(Consumer<SlaPreWarningRuleInfo> preWarningRuleSetter) {
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

    public SlaRecord withEscalateRuleEnable(Boolean escalateRuleEnable) {
        this.escalateRuleEnable = escalateRuleEnable;
        return this;
    }

    /**
     * SLA 上升通知是否开启
     * @return escalateRuleEnable
     */
    public Boolean getEscalateRuleEnable() {
        return escalateRuleEnable;
    }

    public void setEscalateRuleEnable(Boolean escalateRuleEnable) {
        this.escalateRuleEnable = escalateRuleEnable;
    }

    public SlaRecord withEscalateRules(List<SlaEscalationRuleInfo> escalateRules) {
        this.escalateRules = escalateRules;
        return this;
    }

    public SlaRecord addEscalateRulesItem(SlaEscalationRuleInfo escalateRulesItem) {
        if (this.escalateRules == null) {
            this.escalateRules = new ArrayList<>();
        }
        this.escalateRules.add(escalateRulesItem);
        return this;
    }

    public SlaRecord withEscalateRules(Consumer<List<SlaEscalationRuleInfo>> escalateRulesSetter) {
        if (this.escalateRules == null) {
            this.escalateRules = new ArrayList<>();
        }
        escalateRulesSetter.accept(this.escalateRules);
        return this;
    }

    /**
     * SLA 上升通知配置
     * @return escalateRules
     */
    public List<SlaEscalationRuleInfo> getEscalateRules() {
        return escalateRules;
    }

    public void setEscalateRules(List<SlaEscalationRuleInfo> escalateRules) {
        this.escalateRules = escalateRules;
    }

    public SlaRecord withCurrentNode(Boolean currentNode) {
        this.currentNode = currentNode;
        return this;
    }

    /**
     * SLA是否在当前状态
     * @return currentNode
     */
    public Boolean getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Boolean currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlaRecord that = (SlaRecord) obj;
        return Objects.equals(this.statusType, that.statusType)
            && Objects.equals(this.subTriggerNode, that.subTriggerNode)
            && Objects.equals(this.slaStatus, that.slaStatus) && Objects.equals(this.slaOrderId, that.slaOrderId)
            && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.triggeringRuleEnable, that.triggeringRuleEnable)
            && Objects.equals(this.triggeringRule, that.triggeringRule)
            && Objects.equals(this.breakTime, that.breakTime) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.ownerName, that.ownerName) && Objects.equals(this.noticeTime, that.noticeTime)
            && Objects.equals(this.statusStartTime, that.statusStartTime)
            && Objects.equals(this.preWarningRuleEnable, that.preWarningRuleEnable)
            && Objects.equals(this.preWarningRule, that.preWarningRule)
            && Objects.equals(this.escalateRuleEnable, that.escalateRuleEnable)
            && Objects.equals(this.escalateRules, that.escalateRules)
            && Objects.equals(this.currentNode, that.currentNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusType,
            subTriggerNode,
            slaStatus,
            slaOrderId,
            duration,
            triggeringRuleEnable,
            triggeringRule,
            breakTime,
            ownerId,
            ownerName,
            noticeTime,
            statusStartTime,
            preWarningRuleEnable,
            preWarningRule,
            escalateRuleEnable,
            escalateRules,
            currentNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlaRecord {\n");
        sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
        sb.append("    subTriggerNode: ").append(toIndentedString(subTriggerNode)).append("\n");
        sb.append("    slaStatus: ").append(toIndentedString(slaStatus)).append("\n");
        sb.append("    slaOrderId: ").append(toIndentedString(slaOrderId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    triggeringRuleEnable: ").append(toIndentedString(triggeringRuleEnable)).append("\n");
        sb.append("    triggeringRule: ").append(toIndentedString(triggeringRule)).append("\n");
        sb.append("    breakTime: ").append(toIndentedString(breakTime)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    noticeTime: ").append(toIndentedString(noticeTime)).append("\n");
        sb.append("    statusStartTime: ").append(toIndentedString(statusStartTime)).append("\n");
        sb.append("    preWarningRuleEnable: ").append(toIndentedString(preWarningRuleEnable)).append("\n");
        sb.append("    preWarningRule: ").append(toIndentedString(preWarningRule)).append("\n");
        sb.append("    escalateRuleEnable: ").append(toIndentedString(escalateRuleEnable)).append("\n");
        sb.append("    escalateRules: ").append(toIndentedString(escalateRules)).append("\n");
        sb.append("    currentNode: ").append(toIndentedString(currentNode)).append("\n");
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
