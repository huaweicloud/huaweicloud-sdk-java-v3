package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Column
 */
public class Column {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_family_name")

    private String columnFamilyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    /**
     * 通道内JSON数据的JSON属性的类型名称。
     */
    public static final class TypeEnum {

        /**
         * Enum BIGINT for value: "Bigint"
         */
        public static final TypeEnum BIGINT = new TypeEnum("Bigint");

        /**
         * Enum DOUBLE for value: "Double"
         */
        public static final TypeEnum DOUBLE = new TypeEnum("Double");

        /**
         * Enum BOOLEAN for value: "Boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("Boolean");

        /**
         * Enum TIMESTAMP for value: "Timestamp"
         */
        public static final TypeEnum TIMESTAMP = new TypeEnum("Timestamp");

        /**
         * Enum STRING for value: "String"
         */
        public static final TypeEnum STRING = new TypeEnum("String");

        /**
         * Enum DECIMAL for value: "Decimal"
         */
        public static final TypeEnum DECIMAL = new TypeEnum("Decimal");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Bigint", BIGINT);
            map.put("Double", DOUBLE);
            map.put("Boolean", BOOLEAN);
            map.put("Timestamp", TIMESTAMP);
            map.put("String", STRING);
            map.put("Decimal", DECIMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public Column withColumnFamilyName(String columnFamilyName) {
        this.columnFamilyName = columnFamilyName;
        return this;
    }

    /**
     * 存储该通道数据的HBase表数据的列族名称。
     * @return columnFamilyName
     */
    public String getColumnFamilyName() {
        return columnFamilyName;
    }

    public void setColumnFamilyName(String columnFamilyName) {
        this.columnFamilyName = columnFamilyName;
    }

    public Column withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 存储该通道数据的HBase表数据的列名称。  取值范围：1～32，只能包含英文字母、数字和下划线。
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Column withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 通道内JSON数据的JSON属性名，用于生成HBase数据的列值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Column withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 通道内JSON数据的JSON属性的类型名称。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Column that = (Column) obj;
        return Objects.equals(this.columnFamilyName, that.columnFamilyName)
            && Objects.equals(this.columnName, that.columnName) && Objects.equals(this.value, that.value)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnFamilyName, columnName, value, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Column {\n");
        sb.append("    columnFamilyName: ").append(toIndentedString(columnFamilyName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
