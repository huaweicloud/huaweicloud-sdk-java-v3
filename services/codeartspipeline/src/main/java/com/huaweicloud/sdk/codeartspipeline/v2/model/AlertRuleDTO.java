package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警规则DTO
 */
public class AlertRuleDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleType")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thresholdValue")

    private Integer thresholdValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isEnabled")

    private Boolean isEnabled;

    public AlertRuleDTO withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释**： 规则类型。 **约束限制**： 不涉及。 **取值范围**： - CONCURRENCY：并发数。 - FAIL_COUNT：失败次数。 - QUEUE_BACKLOG：队列积压。 **默认取值**： 不涉及。 
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public AlertRuleDTO withThresholdValue(Integer thresholdValue) {
        this.thresholdValue = thresholdValue;
        return this;
    }

    /**
     * **参数解释**： 阈值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return thresholdValue
     */
    public Integer getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(Integer thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    public AlertRuleDTO withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 严重级别。 **约束限制**： 不涉及。 **取值范围**： - GENERAL：一般。 - WARNING：警告。 - MAJOR：严重。 **默认取值**： 不涉及。 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public AlertRuleDTO withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否启用。 **约束限制**： 不涉及。 **取值范围**： - true：启用。 - false：禁用。 **默认取值**： 不涉及。 
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertRuleDTO that = (AlertRuleDTO) obj;
        return Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.thresholdValue, that.thresholdValue)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.isEnabled, that.isEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleType, thresholdValue, severity, isEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRuleDTO {\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
