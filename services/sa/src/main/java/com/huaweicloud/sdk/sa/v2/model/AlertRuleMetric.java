package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlertRuleMetric
 */
public class AlertRuleMetric {

    /**
     * category. GROUP_COUNT
     */
    public static final class CategoryEnum {

        /**
         * Enum GROUP_COUNT for value: "GROUP_COUNT"
         */
        public static final CategoryEnum GROUP_COUNT = new CategoryEnum("GROUP_COUNT");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("GROUP_COUNT", GROUP_COUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private Map<String, BigDecimal> metric = null;

    public AlertRuleMetric withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * category. GROUP_COUNT
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public AlertRuleMetric withMetric(Map<String, BigDecimal> metric) {
        this.metric = metric;
        return this;
    }

    public AlertRuleMetric putMetricItem(String key, BigDecimal metricItem) {
        if (this.metric == null) {
            this.metric = new HashMap<>();
        }
        this.metric.put(key, metricItem);
        return this;
    }

    public AlertRuleMetric withMetric(Consumer<Map<String, BigDecimal>> metricSetter) {
        if (this.metric == null) {
            this.metric = new HashMap<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * metric
     * @return metric
     */
    public Map<String, BigDecimal> getMetric() {
        return metric;
    }

    public void setMetric(Map<String, BigDecimal> metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertRuleMetric that = (AlertRuleMetric) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.metric, that.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRuleMetric {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
