package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskDefectsStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private StatisticSeverityV2 severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatisticStatusV2 status;

    public ShowTaskDefectsStatisticResponse withSeverity(StatisticSeverityV2 severity) {
        this.severity = severity;
        return this;
    }

    public ShowTaskDefectsStatisticResponse withSeverity(Consumer<StatisticSeverityV2> severitySetter) {
        if (this.severity == null) {
            this.severity = new StatisticSeverityV2();
            severitySetter.accept(this.severity);
        }

        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    public StatisticSeverityV2 getSeverity() {
        return severity;
    }

    public void setSeverity(StatisticSeverityV2 severity) {
        this.severity = severity;
    }

    public ShowTaskDefectsStatisticResponse withStatus(StatisticStatusV2 status) {
        this.status = status;
        return this;
    }

    public ShowTaskDefectsStatisticResponse withStatus(Consumer<StatisticStatusV2> statusSetter) {
        if (this.status == null) {
            this.status = new StatisticStatusV2();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatisticStatusV2 getStatus() {
        return status;
    }

    public void setStatus(StatisticStatusV2 status) {
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
        ShowTaskDefectsStatisticResponse that = (ShowTaskDefectsStatisticResponse) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskDefectsStatisticResponse {\n");
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
