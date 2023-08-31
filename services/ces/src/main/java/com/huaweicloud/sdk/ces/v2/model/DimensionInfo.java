package com.huaweicloud.sdk.ces.v2.model;

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
 * DimensionInfo
 */
public class DimensionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 资源类型, all_instances: 全部资源, specific_instances: 指定资源
     */
    public static final class FilterTypeEnum {

        /**
         * Enum ALL_INSTANCES for value: "all_instances"
         */
        public static final FilterTypeEnum ALL_INSTANCES = new FilterTypeEnum("all_instances");

        /**
         * Enum SPECIFIC_INSTANCES for value: "specific_instances"
         */
        public static final FilterTypeEnum SPECIFIC_INSTANCES = new FilterTypeEnum("specific_instances");

        private static final Map<String, FilterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterTypeEnum> createStaticFields() {
            Map<String, FilterTypeEnum> map = new HashMap<>();
            map.put("all_instances", ALL_INSTANCES);
            map.put("specific_instances", SPECIFIC_INSTANCES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterTypeEnum(String value) {
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
        public static FilterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterTypeEnum(value));
        }

        public static FilterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterTypeEnum) {
                return this.value.equals(((FilterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_type")

    private FilterTypeEnum filterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public DimensionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 维度名称，多维度用逗号分隔，各服务支持的维度可参考：“[服务维度名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DimensionInfo withFilterType(FilterTypeEnum filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * 资源类型, all_instances: 全部资源, specific_instances: 指定资源
     * @return filterType
     */
    public FilterTypeEnum getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterTypeEnum filterType) {
        this.filterType = filterType;
    }

    public DimensionInfo withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public DimensionInfo addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public DimensionInfo withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 维度值列表
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionInfo that = (DimensionInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.filterType, that.filterType)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, filterType, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
