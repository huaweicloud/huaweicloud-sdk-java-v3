package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateRequest
 */
public class BatchUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rules")

    private List<BatchAlarmRulesBody> alarmRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_action_rules")

    private List<BatchUpdateActionRules> updateActionRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_type")

    private String updateType;

    public BatchUpdateRequest withAlarmRules(List<BatchAlarmRulesBody> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }

    public BatchUpdateRequest addAlarmRulesItem(BatchAlarmRulesBody alarmRulesItem) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        this.alarmRules.add(alarmRulesItem);
        return this;
    }

    public BatchUpdateRequest withAlarmRules(Consumer<List<BatchAlarmRulesBody>> alarmRulesSetter) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        alarmRulesSetter.accept(this.alarmRules);
        return this;
    }

    /**
     * 批量启停的告警规则列表。批量启停告警规则时，该参数必填。
     * @return alarmRules
     */
    public List<BatchAlarmRulesBody> getAlarmRules() {
        return alarmRules;
    }

    public void setAlarmRules(List<BatchAlarmRulesBody> alarmRules) {
        this.alarmRules = alarmRules;
    }

    public BatchUpdateRequest withUpdateActionRules(List<BatchUpdateActionRules> updateActionRules) {
        this.updateActionRules = updateActionRules;
        return this;
    }

    public BatchUpdateRequest addUpdateActionRulesItem(BatchUpdateActionRules updateActionRulesItem) {
        if (this.updateActionRules == null) {
            this.updateActionRules = new ArrayList<>();
        }
        this.updateActionRules.add(updateActionRulesItem);
        return this;
    }

    public BatchUpdateRequest withUpdateActionRules(Consumer<List<BatchUpdateActionRules>> updateActionRulesSetter) {
        if (this.updateActionRules == null) {
            this.updateActionRules = new ArrayList<>();
        }
        updateActionRulesSetter.accept(this.updateActionRules);
        return this;
    }

    /**
     * 批量修改告警行动规则的告警规则列表。批量修改告警行动规则时，该参数必填。
     * @return updateActionRules
     */
    public List<BatchUpdateActionRules> getUpdateActionRules() {
        return updateActionRules;
    }

    public void setUpdateActionRules(List<BatchUpdateActionRules> updateActionRules) {
        this.updateActionRules = updateActionRules;
    }

    public BatchUpdateRequest withUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * 更新类型：BATCH_UPDATE_ACTION_RULE。批量修改告警行动规则时，该参数必填。
     * @return updateType
     */
    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateRequest that = (BatchUpdateRequest) obj;
        return Objects.equals(this.alarmRules, that.alarmRules)
            && Objects.equals(this.updateActionRules, that.updateActionRules)
            && Objects.equals(this.updateType, that.updateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRules, updateActionRules, updateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateRequest {\n");
        sb.append("    alarmRules: ").append(toIndentedString(alarmRules)).append("\n");
        sb.append("    updateActionRules: ").append(toIndentedString(updateActionRules)).append("\n");
        sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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
