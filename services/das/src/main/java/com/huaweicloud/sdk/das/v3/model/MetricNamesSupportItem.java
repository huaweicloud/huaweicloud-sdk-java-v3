package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricNamesSupportItem对象
 */
public class MetricNamesSupportItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_types")

    private List<String> engineTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name_des")

    private String metricNameDes;

    public MetricNamesSupportItem withEngineTypes(List<String> engineTypes) {
        this.engineTypes = engineTypes;
        return this;
    }

    public MetricNamesSupportItem addEngineTypesItem(String engineTypesItem) {
        if (this.engineTypes == null) {
            this.engineTypes = new ArrayList<>();
        }
        this.engineTypes.add(engineTypesItem);
        return this;
    }

    public MetricNamesSupportItem withEngineTypes(Consumer<List<String>> engineTypesSetter) {
        if (this.engineTypes == null) {
            this.engineTypes = new ArrayList<>();
        }
        engineTypesSetter.accept(this.engineTypes);
        return this;
    }

    /**
     * 数据库类型
     * @return engineTypes
     */
    public List<String> getEngineTypes() {
        return engineTypes;
    }

    public void setEngineTypes(List<String> engineTypes) {
        this.engineTypes = engineTypes;
    }

    public MetricNamesSupportItem withMetricName(String metricName) {
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

    public MetricNamesSupportItem withUnit(String unit) {
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

    public MetricNamesSupportItem withMetricNameDes(String metricNameDes) {
        this.metricNameDes = metricNameDes;
        return this;
    }

    /**
     * 描述
     * @return metricNameDes
     */
    public String getMetricNameDes() {
        return metricNameDes;
    }

    public void setMetricNameDes(String metricNameDes) {
        this.metricNameDes = metricNameDes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricNamesSupportItem that = (MetricNamesSupportItem) obj;
        return Objects.equals(this.engineTypes, that.engineTypes) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.metricNameDes, that.metricNameDes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineTypes, metricName, unit, metricNameDes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricNamesSupportItem {\n");
        sb.append("    engineTypes: ").append(toIndentedString(engineTypes)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    metricNameDes: ").append(toIndentedString(metricNameDes)).append("\n");
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
