package com.huaweicloud.sdk.iam.v5.model;

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
 * 条件键。
 */
public class Condition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    /**
     * 条件值的数据类型。
     */
    public static final class ValueTypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final ValueTypeEnum STRING = new ValueTypeEnum("string");

        /**
         * Enum NUMERIC for value: "numeric"
         */
        public static final ValueTypeEnum NUMERIC = new ValueTypeEnum("numeric");

        /**
         * Enum DATE for value: "date"
         */
        public static final ValueTypeEnum DATE = new ValueTypeEnum("date");

        /**
         * Enum BOOLEAN for value: "boolean"
         */
        public static final ValueTypeEnum BOOLEAN = new ValueTypeEnum("boolean");

        /**
         * Enum IP_ADDRESS for value: "ip_address"
         */
        public static final ValueTypeEnum IP_ADDRESS = new ValueTypeEnum("ip_address");

        private static final Map<String, ValueTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ValueTypeEnum> createStaticFields() {
            Map<String, ValueTypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("numeric", NUMERIC);
            map.put("date", DATE);
            map.put("boolean", BOOLEAN);
            map.put("ip_address", IP_ADDRESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ValueTypeEnum(String value) {
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
        public static ValueTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ValueTypeEnum(value));
        }

        public static ValueTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ValueTypeEnum) {
                return this.value.equals(((ValueTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private ValueTypeEnum valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_valued")

    private Boolean multiValued;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private Description description;

    public Condition withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 条件键的名称。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Condition withValueType(ValueTypeEnum valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 条件值的数据类型。
     * @return valueType
     */
    public ValueTypeEnum getValueType() {
        return valueType;
    }

    public void setValueType(ValueTypeEnum valueType) {
        this.valueType = valueType;
    }

    public Condition withMultiValued(Boolean multiValued) {
        this.multiValued = multiValued;
        return this;
    }

    /**
     * 条件值是否为多值。
     * @return multiValued
     */
    public Boolean getMultiValued() {
        return multiValued;
    }

    public void setMultiValued(Boolean multiValued) {
        this.multiValued = multiValued;
    }

    public Condition withDescription(Description description) {
        this.description = description;
        return this;
    }

    public Condition withDescription(Consumer<Description> descriptionSetter) {
        if (this.description == null) {
            this.description = new Description();
            descriptionSetter.accept(this.description);
        }

        return this;
    }

    /**
     * Get description
     * @return description
     */
    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Condition that = (Condition) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.valueType, that.valueType)
            && Objects.equals(this.multiValued, that.multiValued) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, valueType, multiValued, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
