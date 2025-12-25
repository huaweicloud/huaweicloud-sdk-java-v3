package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AnalysisField
 */
public class AnalysisField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 字段类型；可选值：boolean、byte、short、integer、long、float、half_float、scaled_float、double、keyword、text、date、ip、binary、object、nested
     */
    public static final class TypeEnum {

        /**
         * Enum BOOLEAN for value: "boolean"
         */
        public static final TypeEnum BOOLEAN = new TypeEnum("boolean");

        /**
         * Enum BYTE for value: "byte"
         */
        public static final TypeEnum BYTE = new TypeEnum("byte");

        /**
         * Enum SHORT for value: "short"
         */
        public static final TypeEnum SHORT = new TypeEnum("short");

        /**
         * Enum INTEGER for value: "integer"
         */
        public static final TypeEnum INTEGER = new TypeEnum("integer");

        /**
         * Enum LONG for value: "long"
         */
        public static final TypeEnum LONG = new TypeEnum("long");

        /**
         * Enum FLOAT for value: "float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("float");

        /**
         * Enum HALF_FLOAT for value: "half_float"
         */
        public static final TypeEnum HALF_FLOAT = new TypeEnum("half_float");

        /**
         * Enum SCALED_FLOAT for value: "scaled_float"
         */
        public static final TypeEnum SCALED_FLOAT = new TypeEnum("scaled_float");

        /**
         * Enum DOUBLE for value: "double"
         */
        public static final TypeEnum DOUBLE = new TypeEnum("double");

        /**
         * Enum KEYWORD for value: "keyword"
         */
        public static final TypeEnum KEYWORD = new TypeEnum("keyword");

        /**
         * Enum TEXT for value: "text"
         */
        public static final TypeEnum TEXT = new TypeEnum("text");

        /**
         * Enum DATE for value: "date"
         */
        public static final TypeEnum DATE = new TypeEnum("date");

        /**
         * Enum IP for value: "ip"
         */
        public static final TypeEnum IP = new TypeEnum("ip");

        /**
         * Enum BINARY for value: "binary"
         */
        public static final TypeEnum BINARY = new TypeEnum("binary");

        /**
         * Enum OBJECT for value: "object"
         */
        public static final TypeEnum OBJECT = new TypeEnum("object");

        /**
         * Enum NESTED for value: "nested"
         */
        public static final TypeEnum NESTED = new TypeEnum("nested");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("boolean", BOOLEAN);
            map.put("byte", BYTE);
            map.put("short", SHORT);
            map.put("integer", INTEGER);
            map.put("long", LONG);
            map.put("float", FLOAT);
            map.put("half_float", HALF_FLOAT);
            map.put("scaled_float", SCALED_FLOAT);
            map.put("double", DOUBLE);
            map.put("keyword", KEYWORD);
            map.put("text", TEXT);
            map.put("date", DATE);
            map.put("ip", IP);
            map.put("binary", BINARY);
            map.put("object", OBJECT);
            map.put("nested", NESTED);
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

    public AnalysisField withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 字段别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public AnalysisField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnalysisField withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 字段类型；可选值：boolean、byte、short、integer、long、float、half_float、scaled_float、double、keyword、text、date、ip、binary、object、nested
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
        AnalysisField that = (AnalysisField) obj;
        return Objects.equals(this.alias, that.alias) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisField {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
