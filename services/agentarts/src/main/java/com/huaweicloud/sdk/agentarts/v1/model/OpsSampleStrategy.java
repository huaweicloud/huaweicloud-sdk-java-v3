package com.huaweicloud.sdk.agentarts.v1.model;

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
 * OpsSampleStrategy
 */
public class OpsSampleStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_ratio")

    private Integer sampleRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_sample_count")

    private Integer maxSampleCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<OpsSampleFilter> filters = null;

    /**
     * **参数解释：** 连接标识，用于标明查询语句中条件之间且或者或的关系。 **约束限制：** 不涉及  **取值范围：** and，or **默认取值：** and
     */
    public static final class FilterSignEnum {

        /**
         * Enum AND for value: "and"
         */
        public static final FilterSignEnum AND = new FilterSignEnum("and");

        /**
         * Enum OR for value: "or"
         */
        public static final FilterSignEnum OR = new FilterSignEnum("or");

        private static final Map<String, FilterSignEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterSignEnum> createStaticFields() {
            Map<String, FilterSignEnum> map = new HashMap<>();
            map.put("and", AND);
            map.put("or", OR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterSignEnum(String value) {
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
        public static FilterSignEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterSignEnum(value));
        }

        public static FilterSignEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterSignEnum) {
                return this.value.equals(((FilterSignEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_sign")

    private FilterSignEnum filterSign;

    public OpsSampleStrategy withSampleRatio(Integer sampleRatio) {
        this.sampleRatio = sampleRatio;
        return this;
    }

    /**
     * **参数解释：** 数据采样率。  **约束限制：** 不涉及  **取值范围：** 数值在1到100之间。  **默认取值：** 100。
     * minimum: 1
     * maximum: 100
     * @return sampleRatio
     */
    public Integer getSampleRatio() {
        return sampleRatio;
    }

    public void setSampleRatio(Integer sampleRatio) {
        this.sampleRatio = sampleRatio;
    }

    public OpsSampleStrategy withMaxSampleCount(Integer maxSampleCount) {
        this.maxSampleCount = maxSampleCount;
        return this;
    }

    /**
     * **参数解释：** 最大数据采样个数。  **约束限制：** 不涉及  **取值范围：** 数值在1到500之间。  **默认取值：** 100。
     * minimum: 1
     * maximum: 500
     * @return maxSampleCount
     */
    public Integer getMaxSampleCount() {
        return maxSampleCount;
    }

    public void setMaxSampleCount(Integer maxSampleCount) {
        this.maxSampleCount = maxSampleCount;
    }

    public OpsSampleStrategy withFilters(List<OpsSampleFilter> filters) {
        this.filters = filters;
        return this;
    }

    public OpsSampleStrategy addFiltersItem(OpsSampleFilter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public OpsSampleStrategy withFilters(Consumer<List<OpsSampleFilter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * **参数解释：** 数据采样的筛选条件。  **约束限制：** 不涉及  **取值范围：** 数组长度0-5。  **默认取值：** 空数组。
     * @return filters
     */
    public List<OpsSampleFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<OpsSampleFilter> filters) {
        this.filters = filters;
    }

    public OpsSampleStrategy withFilterSign(FilterSignEnum filterSign) {
        this.filterSign = filterSign;
        return this;
    }

    /**
     * **参数解释：** 连接标识，用于标明查询语句中条件之间且或者或的关系。 **约束限制：** 不涉及  **取值范围：** and，or **默认取值：** and
     * @return filterSign
     */
    public FilterSignEnum getFilterSign() {
        return filterSign;
    }

    public void setFilterSign(FilterSignEnum filterSign) {
        this.filterSign = filterSign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsSampleStrategy that = (OpsSampleStrategy) obj;
        return Objects.equals(this.sampleRatio, that.sampleRatio)
            && Objects.equals(this.maxSampleCount, that.maxSampleCount) && Objects.equals(this.filters, that.filters)
            && Objects.equals(this.filterSign, that.filterSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleRatio, maxSampleCount, filters, filterSign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsSampleStrategy {\n");
        sb.append("    sampleRatio: ").append(toIndentedString(sampleRatio)).append("\n");
        sb.append("    maxSampleCount: ").append(toIndentedString(maxSampleCount)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    filterSign: ").append(toIndentedString(filterSign)).append("\n");
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
