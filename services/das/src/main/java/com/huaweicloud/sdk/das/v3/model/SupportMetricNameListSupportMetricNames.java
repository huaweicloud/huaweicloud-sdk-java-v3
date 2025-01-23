package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SupportMetricNameListSupportMetricNames
 */
public class SupportMetricNameListSupportMetricNames {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private List<String> datastoreType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public SupportMetricNameListSupportMetricNames withDatastoreType(List<String> datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    public SupportMetricNameListSupportMetricNames addDatastoreTypeItem(String datastoreTypeItem) {
        if (this.datastoreType == null) {
            this.datastoreType = new ArrayList<>();
        }
        this.datastoreType.add(datastoreTypeItem);
        return this;
    }

    public SupportMetricNameListSupportMetricNames withDatastoreType(Consumer<List<String>> datastoreTypeSetter) {
        if (this.datastoreType == null) {
            this.datastoreType = new ArrayList<>();
        }
        datastoreTypeSetter.accept(this.datastoreType);
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public List<String> getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(List<String> datastoreType) {
        this.datastoreType = datastoreType;
    }

    public SupportMetricNameListSupportMetricNames withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public SupportMetricNameListSupportMetricNames withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public SupportMetricNameListSupportMetricNames withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportMetricNameListSupportMetricNames that = (SupportMetricNameListSupportMetricNames) obj;
        return Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, metricName, unit, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportMetricNameListSupportMetricNames {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
