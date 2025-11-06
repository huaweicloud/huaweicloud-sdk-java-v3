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
public class ListAlarmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_alarms")

    private List<MetricAlarmsResp> metricAlarms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaDataResp metaData;

    public ListAlarmsResponse withMetricAlarms(List<MetricAlarmsResp> metricAlarms) {
        this.metricAlarms = metricAlarms;
        return this;
    }

    public ListAlarmsResponse addMetricAlarmsItem(MetricAlarmsResp metricAlarmsItem) {
        if (this.metricAlarms == null) {
            this.metricAlarms = new ArrayList<>();
        }
        this.metricAlarms.add(metricAlarmsItem);
        return this;
    }

    public ListAlarmsResponse withMetricAlarms(Consumer<List<MetricAlarmsResp>> metricAlarmsSetter) {
        if (this.metricAlarms == null) {
            this.metricAlarms = new ArrayList<>();
        }
        metricAlarmsSetter.accept(this.metricAlarms);
        return this;
    }

    /**
     * **参数解释**： 查询的告警对象列表。 
     * @return metricAlarms
     */
    public List<MetricAlarmsResp> getMetricAlarms() {
        return metricAlarms;
    }

    public void setMetricAlarms(List<MetricAlarmsResp> metricAlarms) {
        this.metricAlarms = metricAlarms;
    }

    public ListAlarmsResponse withMetaData(MetaDataResp metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListAlarmsResponse withMetaData(Consumer<MetaDataResp> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaDataResp();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public MetaDataResp getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataResp metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmsResponse that = (ListAlarmsResponse) obj;
        return Objects.equals(this.metricAlarms, that.metricAlarms) && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricAlarms, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmsResponse {\n");
        sb.append("    metricAlarms: ").append(toIndentedString(metricAlarms)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
