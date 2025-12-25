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
 * 告警严重程度
 */
public class AlertSeverities {

    /**
     * **参数解释**: 目录 - SEVERITY 严重性  **约束限制** 不涉及 **取值范围**: - SEVERITY  **默认值** 不涉及  
     */
    public static final class SeverityCategoryEnum {

        /**
         * Enum SEVERITY for value: "SEVERITY"
         */
        public static final SeverityCategoryEnum SEVERITY = new SeverityCategoryEnum("SEVERITY");

        private static final Map<String, SeverityCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityCategoryEnum> createStaticFields() {
            Map<String, SeverityCategoryEnum> map = new HashMap<>();
            map.put("SEVERITY", SEVERITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityCategoryEnum(String value) {
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
        public static SeverityCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityCategoryEnum(value));
        }

        public static SeverityCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityCategoryEnum) {
                return this.value.equals(((SeverityCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_category")

    private SeverityCategoryEnum severityCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private MetricMap metric;

    public AlertSeverities withSeverityCategory(SeverityCategoryEnum severityCategory) {
        this.severityCategory = severityCategory;
        return this;
    }

    /**
     * **参数解释**: 目录 - SEVERITY 严重性  **约束限制** 不涉及 **取值范围**: - SEVERITY  **默认值** 不涉及  
     * @return severityCategory
     */
    public SeverityCategoryEnum getSeverityCategory() {
        return severityCategory;
    }

    public void setSeverityCategory(SeverityCategoryEnum severityCategory) {
        this.severityCategory = severityCategory;
    }

    public AlertSeverities withMetric(MetricMap metric) {
        this.metric = metric;
        return this;
    }

    public AlertSeverities withMetric(Consumer<MetricMap> metricSetter) {
        if (this.metric == null) {
            this.metric = new MetricMap();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public MetricMap getMetric() {
        return metric;
    }

    public void setMetric(MetricMap metric) {
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
        AlertSeverities that = (AlertSeverities) obj;
        return Objects.equals(this.severityCategory, that.severityCategory) && Objects.equals(this.metric, that.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severityCategory, metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertSeverities {\n");
        sb.append("    severityCategory: ").append(toIndentedString(severityCategory)).append("\n");
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
