package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 分类别统计数据
 */
public class CategoryStatistics {

    /**
     * 防护类型
     */
    public static final class CategoryTypeEnum {

        /**
         * Enum CONTENT_COMPLIANCE for value: "CONTENT_COMPLIANCE"
         */
        public static final CategoryTypeEnum CONTENT_COMPLIANCE = new CategoryTypeEnum("CONTENT_COMPLIANCE");

        /**
         * Enum PROMPT_INJECTION for value: "PROMPT_INJECTION"
         */
        public static final CategoryTypeEnum PROMPT_INJECTION = new CategoryTypeEnum("PROMPT_INJECTION");

        /**
         * Enum SENSITIVE_CONTENT for value: "SENSITIVE_CONTENT"
         */
        public static final CategoryTypeEnum SENSITIVE_CONTENT = new CategoryTypeEnum("SENSITIVE_CONTENT");

        private static final Map<String, CategoryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryTypeEnum> createStaticFields() {
            Map<String, CategoryTypeEnum> map = new HashMap<>();
            map.put("CONTENT_COMPLIANCE", CONTENT_COMPLIANCE);
            map.put("PROMPT_INJECTION", PROMPT_INJECTION);
            map.put("SENSITIVE_CONTENT", SENSITIVE_CONTENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryTypeEnum(String value) {
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
        public static CategoryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryTypeEnum(value));
        }

        public static CategoryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryTypeEnum) {
                return this.value.equals(((CategoryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_type")

    private CategoryTypeEnum categoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_count")

    private Long riskCount;

    public CategoryStatistics withCategoryType(CategoryTypeEnum categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    /**
     * 防护类型
     * @return categoryType
     */
    public CategoryTypeEnum getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryTypeEnum categoryType) {
        this.categoryType = categoryType;
    }

    public CategoryStatistics withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 累计检测数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public CategoryStatistics withRiskCount(Long riskCount) {
        this.riskCount = riskCount;
        return this;
    }

    /**
     * 检出风险数
     * @return riskCount
     */
    public Long getRiskCount() {
        return riskCount;
    }

    public void setRiskCount(Long riskCount) {
        this.riskCount = riskCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryStatistics that = (CategoryStatistics) obj;
        return Objects.equals(this.categoryType, that.categoryType) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.riskCount, that.riskCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryType, totalCount, riskCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryStatistics {\n");
        sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    riskCount: ").append(toIndentedString(riskCount)).append("\n");
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
