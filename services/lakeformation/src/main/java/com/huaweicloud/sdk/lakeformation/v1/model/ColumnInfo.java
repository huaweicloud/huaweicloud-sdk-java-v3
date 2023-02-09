package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * column input when grant policy
 */
public class ColumnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private List<String> columnName = null;

    /**
    * 是否排除：Include包含,Exclude排除
    */
    public static final class FilterEnum {

        /**
         * Enum INCLUDE for value: "Include"
         */
        public static final FilterEnum INCLUDE = new FilterEnum("Include");

        /**
         * Enum EXCLUDE for value: "Exclude"
         */
        public static final FilterEnum EXCLUDE = new FilterEnum("Exclude");

        private static final Map<String, FilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterEnum> createStaticFields() {
            Map<String, FilterEnum> map = new HashMap<>();
            map.put("Include", INCLUDE);
            map.put("Exclude", EXCLUDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterEnum(String value) {
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
        public static FilterEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FilterEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FilterEnum(value);
            }
            return result;
        }

        public static FilterEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FilterEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterEnum) {
                return this.value.equals(((FilterEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private FilterEnum filter;

    public ColumnInfo withColumnName(List<String> columnName) {
        this.columnName = columnName;
        return this;
    }

    public ColumnInfo addColumnNameItem(String columnNameItem) {
        if (this.columnName == null) {
            this.columnName = new ArrayList<>();
        }
        this.columnName.add(columnNameItem);
        return this;
    }

    public ColumnInfo withColumnName(Consumer<List<String>> columnNameSetter) {
        if (this.columnName == null) {
            this.columnName = new ArrayList<>();
        }
        columnNameSetter.accept(this.columnName);
        return this;
    }

    /**
     * 列名
     * @return columnName
     */
    public List<String> getColumnName() {
        return columnName;
    }

    public void setColumnName(List<String> columnName) {
        this.columnName = columnName;
    }

    public ColumnInfo withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 是否排除：Include包含,Exclude排除
     * @return filter
     */
    public FilterEnum getFilter() {
        return filter;
    }

    public void setFilter(FilterEnum filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColumnInfo columnInfo = (ColumnInfo) o;
        return Objects.equals(this.columnName, columnInfo.columnName) && Objects.equals(this.filter, columnInfo.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnInfo {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
