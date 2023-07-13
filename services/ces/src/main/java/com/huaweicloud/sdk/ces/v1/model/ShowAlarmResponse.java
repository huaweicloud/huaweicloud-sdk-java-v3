package com.huaweicloud.sdk.ces.v1.model;

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
public class ShowAlarmResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_alarms")

    private List<MetricAlarms> metricAlarms = null;

    public ShowAlarmResponse withMetricAlarms(List<MetricAlarms> metricAlarms) {
        this.metricAlarms = metricAlarms;
        return this;
    }

    public ShowAlarmResponse addMetricAlarmsItem(MetricAlarms metricAlarmsItem) {
        if (this.metricAlarms == null) {
            this.metricAlarms = new ArrayList<>();
        }
        this.metricAlarms.add(metricAlarmsItem);
        return this;
    }

    public ShowAlarmResponse withMetricAlarms(Consumer<List<MetricAlarms>> metricAlarmsSetter) {
        if (this.metricAlarms == null) {
            this.metricAlarms = new ArrayList<>();
        }
        metricAlarmsSetter.accept(this.metricAlarms);
        return this;
    }

    /**
     * 告警对象列表。
     * @return metricAlarms
     */
    public List<MetricAlarms> getMetricAlarms() {
        return metricAlarms;
    }

    public void setMetricAlarms(List<MetricAlarms> metricAlarms) {
        this.metricAlarms = metricAlarms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmResponse that = (ShowAlarmResponse) obj;
        return Objects.equals(this.metricAlarms, that.metricAlarms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricAlarms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmResponse {\n");
        sb.append("    metricAlarms: ").append(toIndentedString(metricAlarms)).append("\n");
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
