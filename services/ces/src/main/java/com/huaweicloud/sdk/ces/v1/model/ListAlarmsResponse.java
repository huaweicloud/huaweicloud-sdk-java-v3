package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.MetaData;
import com.huaweicloud.sdk.ces.v1.model.MetricAlarms;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListAlarmsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_alarms")
    
    private List<MetricAlarms> metricAlarms = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private MetaData metaData = null;

    public ListAlarmsResponse withMetricAlarms(List<MetricAlarms> metricAlarms) {
        this.metricAlarms = metricAlarms;
        return this;
    }

    
    public ListAlarmsResponse addMetricAlarmsItem(MetricAlarms metricAlarmsItem) {
        if (this.metricAlarms == null) {
            this.metricAlarms = new ArrayList<>();
        }
        this.metricAlarms.add(metricAlarmsItem);
        return this;
    }

    public ListAlarmsResponse withMetricAlarms(Consumer<List<MetricAlarms>> metricAlarmsSetter) {
        if(this.metricAlarms == null ){
            this.metricAlarms = new ArrayList<>();
        }
        metricAlarmsSetter.accept(this.metricAlarms);
        return this;
    }

    /**
     * 
     * @return metricAlarms
     */
    public List<MetricAlarms> getMetricAlarms() {
        return metricAlarms;
    }

    public void setMetricAlarms(List<MetricAlarms> metricAlarms) {
        this.metricAlarms = metricAlarms;
    }

    public ListAlarmsResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListAlarmsResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaData();
        }
        metaDataSetter.accept(this.metaData);
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmsResponse listAlarmsResponse = (ListAlarmsResponse) o;
        return Objects.equals(this.metricAlarms, listAlarmsResponse.metricAlarms) &&
            Objects.equals(this.metaData, listAlarmsResponse.metaData);
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

