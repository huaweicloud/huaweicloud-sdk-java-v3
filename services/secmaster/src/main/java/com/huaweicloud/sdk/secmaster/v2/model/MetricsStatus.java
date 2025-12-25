package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 指标状态
 */
public class MetricsStatus {

    /**
     * **参数解释**: 目录指标 - STATUS 状态  **约束限制** 不涉及 **取值范围**: - STATUS  **默认值** 不涉及  
     */
    public static final class MetricsCategoryEnum {

        /**
         * Enum STATUS for value: "STATUS"
         */
        public static final MetricsCategoryEnum STATUS = new MetricsCategoryEnum("STATUS");

        private static final Map<String, MetricsCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricsCategoryEnum> createStaticFields() {
            Map<String, MetricsCategoryEnum> map = new HashMap<>();
            map.put("STATUS", STATUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MetricsCategoryEnum(String value) {
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
        public static MetricsCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MetricsCategoryEnum(value));
        }

        public static MetricsCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MetricsCategoryEnum) {
                return this.value.equals(((MetricsCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics_category")

    private MetricsCategoryEnum metricsCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_metric")

    private StatusMetric statusMetric;

    public MetricsStatus withMetricsCategory(MetricsCategoryEnum metricsCategory) {
        this.metricsCategory = metricsCategory;
        return this;
    }

    /**
     * **参数解释**: 目录指标 - STATUS 状态  **约束限制** 不涉及 **取值范围**: - STATUS  **默认值** 不涉及  
     * @return metricsCategory
     */
    public MetricsCategoryEnum getMetricsCategory() {
        return metricsCategory;
    }

    public void setMetricsCategory(MetricsCategoryEnum metricsCategory) {
        this.metricsCategory = metricsCategory;
    }

    public MetricsStatus withStatusMetric(StatusMetric statusMetric) {
        this.statusMetric = statusMetric;
        return this;
    }

    public MetricsStatus withStatusMetric(Consumer<StatusMetric> statusMetricSetter) {
        if (this.statusMetric == null) {
            this.statusMetric = new StatusMetric();
            statusMetricSetter.accept(this.statusMetric);
        }

        return this;
    }

    /**
     * Get statusMetric
     * @return statusMetric
     */
    public StatusMetric getStatusMetric() {
        return statusMetric;
    }

    public void setStatusMetric(StatusMetric statusMetric) {
        this.statusMetric = statusMetric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricsStatus that = (MetricsStatus) obj;
        return Objects.equals(this.metricsCategory, that.metricsCategory)
            && Objects.equals(this.statusMetric, that.statusMetric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricsCategory, statusMetric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricsStatus {\n");
        sb.append("    metricsCategory: ").append(toIndentedString(metricsCategory)).append("\n");
        sb.append("    statusMetric: ").append(toIndentedString(statusMetric)).append("\n");
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
