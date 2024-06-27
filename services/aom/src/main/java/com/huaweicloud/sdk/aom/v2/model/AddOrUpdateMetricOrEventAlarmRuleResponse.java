package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddOrUpdateMetricOrEventAlarmRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rules")

    private List<AddOrUpdateAlarmRuleV4ItemResult> alarmRules = null;

    public AddOrUpdateMetricOrEventAlarmRuleResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public AddOrUpdateMetricOrEventAlarmRuleResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AddOrUpdateMetricOrEventAlarmRuleResponse withAlarmRules(List<AddOrUpdateAlarmRuleV4ItemResult> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }

    public AddOrUpdateMetricOrEventAlarmRuleResponse addAlarmRulesItem(
        AddOrUpdateAlarmRuleV4ItemResult alarmRulesItem) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        this.alarmRules.add(alarmRulesItem);
        return this;
    }

    public AddOrUpdateMetricOrEventAlarmRuleResponse withAlarmRules(
        Consumer<List<AddOrUpdateAlarmRuleV4ItemResult>> alarmRulesSetter) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        alarmRulesSetter.accept(this.alarmRules);
        return this;
    }

    /**
     * 告警规则列表。
     * @return alarmRules
     */
    public List<AddOrUpdateAlarmRuleV4ItemResult> getAlarmRules() {
        return alarmRules;
    }

    public void setAlarmRules(List<AddOrUpdateAlarmRuleV4ItemResult> alarmRules) {
        this.alarmRules = alarmRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddOrUpdateMetricOrEventAlarmRuleResponse that = (AddOrUpdateMetricOrEventAlarmRuleResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.alarmRules, that.alarmRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage, alarmRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateMetricOrEventAlarmRuleResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    alarmRules: ").append(toIndentedString(alarmRules)).append("\n");
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
