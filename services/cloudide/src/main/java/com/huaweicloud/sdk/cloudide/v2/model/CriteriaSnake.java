package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CriteriaSnake
 */
public class CriteriaSnake {

    /**
     * 过滤类型 - 1 按插件Tag过滤 - 2 按diplayName过滤 - 3 按publisherId过滤 - 4 按插件Id过滤 - 5 按插件分类过滤 - 7 按照作者名.插件名过滤 - 8 按Target（客户端）过滤 - 10 按关键字（客户端输入的）过滤 - 12 根据flags传入的值来进行过滤,eg:flags=2name就排除flags=2的插件. - 13 根据flags传入的值来进行过滤,eg:flags=2name就查询出flags=2的插件 - 18 按publisherName过滤 - 19 按publisherDisplayName过滤 - 102 按照插件状态排除插件 - 103 按照插件状态过滤出插件 - 107 supportIdeInfo - 108 根据插件ids查询
     */
    public static final class FilterTypeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final FilterTypeEnum NUMBER_1 = new FilterTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final FilterTypeEnum NUMBER_2 = new FilterTypeEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final FilterTypeEnum NUMBER_3 = new FilterTypeEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final FilterTypeEnum NUMBER_4 = new FilterTypeEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final FilterTypeEnum NUMBER_5 = new FilterTypeEnum(5);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final FilterTypeEnum NUMBER_7 = new FilterTypeEnum(7);

        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final FilterTypeEnum NUMBER_8 = new FilterTypeEnum(8);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final FilterTypeEnum NUMBER_10 = new FilterTypeEnum(10);

        /**
         * Enum NUMBER_12 for value: 12
         */
        public static final FilterTypeEnum NUMBER_12 = new FilterTypeEnum(12);

        /**
         * Enum NUMBER_13 for value: 13
         */
        public static final FilterTypeEnum NUMBER_13 = new FilterTypeEnum(13);

        /**
         * Enum NUMBER_18 for value: 18
         */
        public static final FilterTypeEnum NUMBER_18 = new FilterTypeEnum(18);

        /**
         * Enum NUMBER_19 for value: 19
         */
        public static final FilterTypeEnum NUMBER_19 = new FilterTypeEnum(19);

        /**
         * Enum NUMBER_102 for value: 102
         */
        public static final FilterTypeEnum NUMBER_102 = new FilterTypeEnum(102);

        /**
         * Enum NUMBER_103 for value: 103
         */
        public static final FilterTypeEnum NUMBER_103 = new FilterTypeEnum(103);

        /**
         * Enum NUMBER_107 for value: 107
         */
        public static final FilterTypeEnum NUMBER_107 = new FilterTypeEnum(107);

        /**
         * Enum NUMBER_108 for value: 108
         */
        public static final FilterTypeEnum NUMBER_108 = new FilterTypeEnum(108);

        private static final Map<Integer, FilterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, FilterTypeEnum> createStaticFields() {
            Map<Integer, FilterTypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(7, NUMBER_7);
            map.put(8, NUMBER_8);
            map.put(10, NUMBER_10);
            map.put(12, NUMBER_12);
            map.put(13, NUMBER_13);
            map.put(18, NUMBER_18);
            map.put(19, NUMBER_19);
            map.put(102, NUMBER_102);
            map.put(103, NUMBER_103);
            map.put(107, NUMBER_107);
            map.put(108, NUMBER_108);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        FilterTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FilterTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterTypeEnum(value));
        }

        public static FilterTypeEnum valueOf(Integer value) {
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
    @JsonProperty(value = "value")

    private String value;

    public CriteriaSnake withFilterType(FilterTypeEnum filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * 过滤类型 - 1 按插件Tag过滤 - 2 按diplayName过滤 - 3 按publisherId过滤 - 4 按插件Id过滤 - 5 按插件分类过滤 - 7 按照作者名.插件名过滤 - 8 按Target（客户端）过滤 - 10 按关键字（客户端输入的）过滤 - 12 根据flags传入的值来进行过滤,eg:flags=2name就排除flags=2的插件. - 13 根据flags传入的值来进行过滤,eg:flags=2name就查询出flags=2的插件 - 18 按publisherName过滤 - 19 按publisherDisplayName过滤 - 102 按照插件状态排除插件 - 103 按照插件状态过滤出插件 - 107 supportIdeInfo - 108 根据插件ids查询
     * @return filterType
     */
    public FilterTypeEnum getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterTypeEnum filterType) {
        this.filterType = filterType;
    }

    public CriteriaSnake withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 过滤类型对应字段名称
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CriteriaSnake that = (CriteriaSnake) obj;
        return Objects.equals(this.filterType, that.filterType) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CriteriaSnake {\n");
        sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
