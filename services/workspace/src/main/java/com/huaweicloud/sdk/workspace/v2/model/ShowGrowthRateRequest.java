package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowGrowthRateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim")

    private String dim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    /**
     * 环比周期 | DAY - 天 MONTH - 月。
     */
    public static final class GrowPeriodEnum {

        /**
         * Enum DAY for value: "DAY"
         */
        public static final GrowPeriodEnum DAY = new GrowPeriodEnum("DAY");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final GrowPeriodEnum MONTH = new GrowPeriodEnum("MONTH");

        private static final Map<String, GrowPeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GrowPeriodEnum> createStaticFields() {
            Map<String, GrowPeriodEnum> map = new HashMap<>();
            map.put("DAY", DAY);
            map.put("MONTH", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GrowPeriodEnum(String value) {
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
        public static GrowPeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GrowPeriodEnum(value));
        }

        public static GrowPeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GrowPeriodEnum) {
                return this.value.equals(((GrowPeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grow_period")

    private GrowPeriodEnum growPeriod;

    public ShowGrowthRateRequest withDim(String dim) {
        this.dim = dim;
        return this;
    }

    /**
     * 指标维度 | 目前最大支持3个维度，必须从0开始；维度格式为dim.{i}=key,value，key的最大长度32，value的最大长度为256。 单维度：dim.0=instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 多维度：dim.0=key,value&dim.1=key,value。
     * @return dim
     */
    public String getDim() {
        return dim;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public ShowGrowthRateRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowGrowthRateRequest withGrowPeriod(GrowPeriodEnum growPeriod) {
        this.growPeriod = growPeriod;
        return this;
    }

    /**
     * 环比周期 | DAY - 天 MONTH - 月。
     * @return growPeriod
     */
    public GrowPeriodEnum getGrowPeriod() {
        return growPeriod;
    }

    public void setGrowPeriod(GrowPeriodEnum growPeriod) {
        this.growPeriod = growPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGrowthRateRequest that = (ShowGrowthRateRequest) obj;
        return Objects.equals(this.dim, that.dim) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.growPeriod, that.growPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dim, metricName, growPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGrowthRateRequest {\n");
        sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    growPeriod: ").append(toIndentedString(growPeriod)).append("\n");
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
