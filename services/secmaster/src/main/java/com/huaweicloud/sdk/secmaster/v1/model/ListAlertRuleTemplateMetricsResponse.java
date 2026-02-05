package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAlertRuleTemplateMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private AlertRuleTemplateMetric severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AlertRuleTemplateMetric status;

    public ListAlertRuleTemplateMetricsResponse withSeverity(AlertRuleTemplateMetric severity) {
        this.severity = severity;
        return this;
    }

    public ListAlertRuleTemplateMetricsResponse withSeverity(Consumer<AlertRuleTemplateMetric> severitySetter) {
        if (this.severity == null) {
            this.severity = new AlertRuleTemplateMetric();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public AlertRuleTemplateMetric getSeverity() {
        return severity;
    }

    public void setSeverity(AlertRuleTemplateMetric severity) {
        this.severity = severity;
    }

    public ListAlertRuleTemplateMetricsResponse withStatus(AlertRuleTemplateMetric status) {
        this.status = status;
        return this;
    }

    public ListAlertRuleTemplateMetricsResponse withStatus(Consumer<AlertRuleTemplateMetric> statusSetter) {
        if (this.status == null) {
            this.status = new AlertRuleTemplateMetric();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AlertRuleTemplateMetric getStatus() {
        return status;
    }

    public void setStatus(AlertRuleTemplateMetric status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlertRuleTemplateMetricsResponse that = (ListAlertRuleTemplateMetricsResponse) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRuleTemplateMetricsResponse {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
