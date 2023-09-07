package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据过滤数条件信息体
 */
public class DataFilteringCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    /**
     * 过滤条件类型  contentConditionalFilter: 简单条件过滤 configConditionalFilter: 关联表过滤
     */
    public static final class FilteringTypeEnum {

        /**
         * Enum CONTENTCONDITIONALFILTER for value: "contentConditionalFilter"
         */
        public static final FilteringTypeEnum CONTENTCONDITIONALFILTER =
            new FilteringTypeEnum("contentConditionalFilter");

        /**
         * Enum _CONFIGCONDITIONALFILTER for value: " configConditionalFilter"
         */
        public static final FilteringTypeEnum _CONFIGCONDITIONALFILTER =
            new FilteringTypeEnum(" configConditionalFilter");

        private static final Map<String, FilteringTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilteringTypeEnum> createStaticFields() {
            Map<String, FilteringTypeEnum> map = new HashMap<>();
            map.put("contentConditionalFilter", CONTENTCONDITIONALFILTER);
            map.put(" configConditionalFilter", _CONFIGCONDITIONALFILTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilteringTypeEnum(String value) {
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
        public static FilteringTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilteringTypeEnum(value));
        }

        public static FilteringTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilteringTypeEnum) {
                return this.value.equals(((FilteringTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filtering_type")

    private FilteringTypeEnum filteringType;

    public DataFilteringCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 过滤条件 当filtering_type是configConditionalFilter时， value默认填写config 当filtering_type是contentConditionalFilter时， value默认填写过滤条件  注意： 每张表仅支持添加一个校验规则。 数据过滤每次最多支持500张表。 过滤表达式不支持使用某种数据库引擎特有的package、函数、变量、常量等写法，须使用通用SQL标准。请直接输入SQL语句中WHERE之后的部分（不包含WHERE和分号，例如：sid > 3 and sname like \"G %\"），最多支持输入512个字符。 过滤条件填写的SQL语句中，关键字需要用反引号，datatime类型（包含日期和时间）需要用单引号，例如：update > '2022-07-13 00:00:00' and age >10。 不支持对LOB字段设置过滤条件，如CLOB、BLOB、BYTEA等大字段类型。 不支持库名、表名带有换行符的对象设置过滤规则。 建议不要对非精确类型字段设置过滤条件，如FLOAT、DECIMAL、DOUBLE等。 建议不要对带有特殊字符的字段设置过滤条件。 不建议使用非幂等表达式或函数作为数据加工条件，如SYSTIMESTAMP，SYSDATE等，因其每次调用返回的结果可能会有差异，导致达不到预期。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DataFilteringCondition withFilteringType(FilteringTypeEnum filteringType) {
        this.filteringType = filteringType;
        return this;
    }

    /**
     * 过滤条件类型  contentConditionalFilter: 简单条件过滤 configConditionalFilter: 关联表过滤
     * @return filteringType
     */
    public FilteringTypeEnum getFilteringType() {
        return filteringType;
    }

    public void setFilteringType(FilteringTypeEnum filteringType) {
        this.filteringType = filteringType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataFilteringCondition that = (DataFilteringCondition) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.filteringType, that.filteringType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, filteringType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFilteringCondition {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    filteringType: ").append(toIndentedString(filteringType)).append("\n");
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
