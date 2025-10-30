package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Annotations
 */
public class Annotations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_info")

    private String logInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_value")

    private String currentValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_annotations")

    private String oldAnnotations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_rule_name")

    private String alarmActionRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_alias")

    private String alarmRuleAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_url")

    private String alarmRuleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_status")

    private String alarmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")

    private String conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression_with_value")

    private String conditionExpressionWithValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_frequency")

    private String notificationFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_policy")

    private Boolean recoveryPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<Results> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public Annotations withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 告警列表详情
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Annotations withLogInfo(String logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    /**
     * 日志组/流id,名称
     * @return logInfo
     */
    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    public Annotations withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * 当前值
     * @return currentValue
     */
    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public Annotations withOldAnnotations(String oldAnnotations) {
        this.oldAnnotations = oldAnnotations;
        return this;
    }

    /**
     * (sql/关键词)告警详情原始数据
     * @return oldAnnotations
     */
    public String getOldAnnotations() {
        return oldAnnotations;
    }

    public void setOldAnnotations(String oldAnnotations) {
        this.oldAnnotations = oldAnnotations;
    }

    public Annotations withAlarmActionRuleName(String alarmActionRuleName) {
        this.alarmActionRuleName = alarmActionRuleName;
        return this;
    }

    /**
     * **参数解释：** 告警行动规则名称。 **取值范围：** 不涉及。
     * @return alarmActionRuleName
     */
    public String getAlarmActionRuleName() {
        return alarmActionRuleName;
    }

    public void setAlarmActionRuleName(String alarmActionRuleName) {
        this.alarmActionRuleName = alarmActionRuleName;
    }

    public Annotations withAlarmRuleAlias(String alarmRuleAlias) {
        this.alarmRuleAlias = alarmRuleAlias;
        return this;
    }

    /**
     * **参数解释：** 告警规则别名。 **取值范围：** 不涉及。
     * @return alarmRuleAlias
     */
    public String getAlarmRuleAlias() {
        return alarmRuleAlias;
    }

    public void setAlarmRuleAlias(String alarmRuleAlias) {
        this.alarmRuleAlias = alarmRuleAlias;
    }

    public Annotations withAlarmRuleUrl(String alarmRuleUrl) {
        this.alarmRuleUrl = alarmRuleUrl;
        return this;
    }

    /**
     * **参数解释：** 告警规则url。 **取值范围：** 不涉及。
     * @return alarmRuleUrl
     */
    public String getAlarmRuleUrl() {
        return alarmRuleUrl;
    }

    public void setAlarmRuleUrl(String alarmRuleUrl) {
        this.alarmRuleUrl = alarmRuleUrl;
    }

    public Annotations withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * **参数解释：** 告警触发状态。 **取值范围：** - 触发(firing) - 恢复(resolved)
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Annotations withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * **参数解释：** 告警触发条件表达式。 **取值范围：** 不涉及。
     * @return conditionExpression
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public Annotations withConditionExpressionWithValue(String conditionExpressionWithValue) {
        this.conditionExpressionWithValue = conditionExpressionWithValue;
        return this;
    }

    /**
     * **参数解释：** 告警触发表达式带值。例如：条件表达式为pv > 0，则condition_expression_with_value取值为：100 > 0。 **取值范围：** 不涉及。
     * @return conditionExpressionWithValue
     */
    public String getConditionExpressionWithValue() {
        return conditionExpressionWithValue;
    }

    public void setConditionExpressionWithValue(String conditionExpressionWithValue) {
        this.conditionExpressionWithValue = conditionExpressionWithValue;
    }

    public Annotations withNotificationFrequency(String notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
        return this;
    }

    /**
     * **参数解释：** 通知频率。 **取值范围：** 不涉及。
     * @return notificationFrequency
     */
    public String getNotificationFrequency() {
        return notificationFrequency;
    }

    public void setNotificationFrequency(String notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
    }

    public Annotations withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * **参数解释：** 告警ID。 **取值范围：** 不涉及。
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Annotations withRecoveryPolicy(Boolean recoveryPolicy) {
        this.recoveryPolicy = recoveryPolicy;
        return this;
    }

    /**
     * **参数解释：** 是否开启告警恢复开关。 **取值范围：** - true： 开启告警恢复 - false： 关闭告警恢复
     * @return recoveryPolicy
     */
    public Boolean getRecoveryPolicy() {
        return recoveryPolicy;
    }

    public void setRecoveryPolicy(Boolean recoveryPolicy) {
        this.recoveryPolicy = recoveryPolicy;
    }

    public Annotations withResults(List<Results> results) {
        this.results = results;
        return this;
    }

    public Annotations addResultsItem(Results resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public Annotations withResults(Consumer<List<Results>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * **参数解释：** 告警通知的详细信息。
     * @return results
     */
    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public Annotations withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * **参数解释：** 告警统计周期。 **取值范围：** 不涉及。
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Annotations withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 告警规则类型。 **取值范围：** - sql： sql告警 - keywords： 关键词告警
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Annotations that = (Annotations) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.logInfo, that.logInfo)
            && Objects.equals(this.currentValue, that.currentValue)
            && Objects.equals(this.oldAnnotations, that.oldAnnotations)
            && Objects.equals(this.alarmActionRuleName, that.alarmActionRuleName)
            && Objects.equals(this.alarmRuleAlias, that.alarmRuleAlias)
            && Objects.equals(this.alarmRuleUrl, that.alarmRuleUrl)
            && Objects.equals(this.alarmStatus, that.alarmStatus)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.conditionExpressionWithValue, that.conditionExpressionWithValue)
            && Objects.equals(this.notificationFrequency, that.notificationFrequency)
            && Objects.equals(this.recordId, that.recordId) && Objects.equals(this.recoveryPolicy, that.recoveryPolicy)
            && Objects.equals(this.results, that.results) && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message,
            logInfo,
            currentValue,
            oldAnnotations,
            alarmActionRuleName,
            alarmRuleAlias,
            alarmRuleUrl,
            alarmStatus,
            conditionExpression,
            conditionExpressionWithValue,
            notificationFrequency,
            recordId,
            recoveryPolicy,
            results,
            frequency,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Annotations {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
        sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
        sb.append("    oldAnnotations: ").append(toIndentedString(oldAnnotations)).append("\n");
        sb.append("    alarmActionRuleName: ").append(toIndentedString(alarmActionRuleName)).append("\n");
        sb.append("    alarmRuleAlias: ").append(toIndentedString(alarmRuleAlias)).append("\n");
        sb.append("    alarmRuleUrl: ").append(toIndentedString(alarmRuleUrl)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    conditionExpressionWithValue: ")
            .append(toIndentedString(conditionExpressionWithValue))
            .append("\n");
        sb.append("    notificationFrequency: ").append(toIndentedString(notificationFrequency)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    recoveryPolicy: ").append(toIndentedString(recoveryPolicy)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
