package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAlertRuleMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_usage")

    private CuUsage cuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_severities")

    private AlertSeverities alertSeverities;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics_status")

    private MetricsStatus metricsStatus;

    public ListAlertRuleMetricsResponse withCuUsage(CuUsage cuUsage) {
        this.cuUsage = cuUsage;
        return this;
    }

    public ListAlertRuleMetricsResponse withCuUsage(Consumer<CuUsage> cuUsageSetter) {
        if (this.cuUsage == null) {
            this.cuUsage = new CuUsage();
            cuUsageSetter.accept(this.cuUsage);
        }

        return this;
    }

    /**
     * Get cuUsage
     * @return cuUsage
     */
    public CuUsage getCuUsage() {
        return cuUsage;
    }

    public void setCuUsage(CuUsage cuUsage) {
        this.cuUsage = cuUsage;
    }

    public ListAlertRuleMetricsResponse withAlertSeverities(AlertSeverities alertSeverities) {
        this.alertSeverities = alertSeverities;
        return this;
    }

    public ListAlertRuleMetricsResponse withAlertSeverities(Consumer<AlertSeverities> alertSeveritiesSetter) {
        if (this.alertSeverities == null) {
            this.alertSeverities = new AlertSeverities();
            alertSeveritiesSetter.accept(this.alertSeverities);
        }

        return this;
    }

    /**
     * Get alertSeverities
     * @return alertSeverities
     */
    public AlertSeverities getAlertSeverities() {
        return alertSeverities;
    }

    public void setAlertSeverities(AlertSeverities alertSeverities) {
        this.alertSeverities = alertSeverities;
    }

    public ListAlertRuleMetricsResponse withMetricsStatus(MetricsStatus metricsStatus) {
        this.metricsStatus = metricsStatus;
        return this;
    }

    public ListAlertRuleMetricsResponse withMetricsStatus(Consumer<MetricsStatus> metricsStatusSetter) {
        if (this.metricsStatus == null) {
            this.metricsStatus = new MetricsStatus();
            metricsStatusSetter.accept(this.metricsStatus);
        }

        return this;
    }

    /**
     * Get metricsStatus
     * @return metricsStatus
     */
    public MetricsStatus getMetricsStatus() {
        return metricsStatus;
    }

    public void setMetricsStatus(MetricsStatus metricsStatus) {
        this.metricsStatus = metricsStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlertRuleMetricsResponse that = (ListAlertRuleMetricsResponse) obj;
        return Objects.equals(this.cuUsage, that.cuUsage) && Objects.equals(this.alertSeverities, that.alertSeverities)
            && Objects.equals(this.metricsStatus, that.metricsStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuUsage, alertSeverities, metricsStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRuleMetricsResponse {\n");
        sb.append("    cuUsage: ").append(toIndentedString(cuUsage)).append("\n");
        sb.append("    alertSeverities: ").append(toIndentedString(alertSeverities)).append("\n");
        sb.append("    metricsStatus: ").append(toIndentedString(metricsStatus)).append("\n");
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
