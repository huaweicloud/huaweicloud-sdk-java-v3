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
 * 使用指标值对象
 */
public class CuUsage {

    /**
     * **参数解释**: 目录 - USAGE 使用  **约束限制** 不涉及 **取值范围**: - USAGE  **默认值** 不涉及  
     */
    public static final class UsageCategoryEnum {

        /**
         * Enum USAGE for value: "USAGE"
         */
        public static final UsageCategoryEnum USAGE = new UsageCategoryEnum("USAGE");

        private static final Map<String, UsageCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UsageCategoryEnum> createStaticFields() {
            Map<String, UsageCategoryEnum> map = new HashMap<>();
            map.put("USAGE", USAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UsageCategoryEnum(String value) {
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
        public static UsageCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UsageCategoryEnum(value));
        }

        public static UsageCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UsageCategoryEnum) {
                return this.value.equals(((UsageCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_category")

    private UsageCategoryEnum usageCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_metric")

    private UsageMetric usageMetric;

    public CuUsage withUsageCategory(UsageCategoryEnum usageCategory) {
        this.usageCategory = usageCategory;
        return this;
    }

    /**
     * **参数解释**: 目录 - USAGE 使用  **约束限制** 不涉及 **取值范围**: - USAGE  **默认值** 不涉及  
     * @return usageCategory
     */
    public UsageCategoryEnum getUsageCategory() {
        return usageCategory;
    }

    public void setUsageCategory(UsageCategoryEnum usageCategory) {
        this.usageCategory = usageCategory;
    }

    public CuUsage withUsageMetric(UsageMetric usageMetric) {
        this.usageMetric = usageMetric;
        return this;
    }

    public CuUsage withUsageMetric(Consumer<UsageMetric> usageMetricSetter) {
        if (this.usageMetric == null) {
            this.usageMetric = new UsageMetric();
            usageMetricSetter.accept(this.usageMetric);
        }

        return this;
    }

    /**
     * Get usageMetric
     * @return usageMetric
     */
    public UsageMetric getUsageMetric() {
        return usageMetric;
    }

    public void setUsageMetric(UsageMetric usageMetric) {
        this.usageMetric = usageMetric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CuUsage that = (CuUsage) obj;
        return Objects.equals(this.usageCategory, that.usageCategory)
            && Objects.equals(this.usageMetric, that.usageMetric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usageCategory, usageMetric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CuUsage {\n");
        sb.append("    usageCategory: ").append(toIndentedString(usageCategory)).append("\n");
        sb.append("    usageMetric: ").append(toIndentedString(usageMetric)).append("\n");
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
