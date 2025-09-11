package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricDataResult
 */
public class MetricDataResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private String metric;

    /**
     * **参数解释** 指标类型 *取值范围* - INSTANCE：实例类型。 - NODE：节点类型。 - COMPONENT：组件类型。 
     */
    public static final class TypeEnum {

        /**
         * Enum INSTANCE for value: "INSTANCE"
         */
        public static final TypeEnum INSTANCE = new TypeEnum("INSTANCE");

        /**
         * Enum NODE for value: "NODE"
         */
        public static final TypeEnum NODE = new TypeEnum("NODE");

        /**
         * Enum COMPONENT for value: "COMPONENT"
         */
        public static final TypeEnum COMPONENT = new TypeEnum("COMPONENT");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("INSTANCE", INSTANCE);
            map.put("NODE", NODE);
            map.put("COMPONENT", COMPONENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<DatapointResult> datapoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamps")

    private List<String> timestamps = null;

    public MetricDataResult withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * **参数解释**: 指标ID。 **取值范围**: 不涉及。
     * @return metric
     */
    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public MetricDataResult withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释** 指标类型 *取值范围* - INSTANCE：实例类型。 - NODE：节点类型。 - COMPONENT：组件类型。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MetricDataResult withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**: 指标单位。 **取值范围**: 不涉及。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public MetricDataResult withDatapoints(List<DatapointResult> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public MetricDataResult addDatapointsItem(DatapointResult datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public MetricDataResult withDatapoints(Consumer<List<DatapointResult>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * **参数解释**: 指标维度及指标值。 **取值范围**: 不涉及。
     * @return datapoints
     */
    public List<DatapointResult> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<DatapointResult> datapoints) {
        this.datapoints = datapoints;
    }

    public MetricDataResult withTimestamps(List<String> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    public MetricDataResult addTimestampsItem(String timestampsItem) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        this.timestamps.add(timestampsItem);
        return this;
    }

    public MetricDataResult withTimestamps(Consumer<List<String>> timestampsSetter) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        timestampsSetter.accept(this.timestamps);
        return this;
    }

    /**
     * **参数解释**: 时间戳，例如1699495140000。 **取值范围**: 不涉及。
     * @return timestamps
     */
    public List<String> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<String> timestamps) {
        this.timestamps = timestamps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricDataResult that = (MetricDataResult) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.type, that.type)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.datapoints, that.datapoints)
            && Objects.equals(this.timestamps, that.timestamps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, type, unit, datapoints, timestamps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataResult {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
