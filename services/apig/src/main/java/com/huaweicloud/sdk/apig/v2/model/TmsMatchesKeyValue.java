package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TmsMatchesKeyValue
 */
public class TmsMatchesKeyValue {

    /**
     * 要匹配的字段 - resource_name 表示按照APIG实例的名称去匹配 
     */
    public static final class KeyEnum {

        /**
         * Enum RESOURCE_NAME for value: "resource_name"
         */
        public static final KeyEnum RESOURCE_NAME = new KeyEnum("resource_name");

        private static final Map<String, KeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyEnum> createStaticFields() {
            Map<String, KeyEnum> map = new HashMap<>();
            map.put("resource_name", RESOURCE_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyEnum(String value) {
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
        public static KeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyEnum(value));
        }

        public static KeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyEnum) {
                return this.value.equals(((KeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private KeyEnum key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public TmsMatchesKeyValue withKey(KeyEnum key) {
        this.key = key;
        return this;
    }

    /**
     * 要匹配的字段 - resource_name 表示按照APIG实例的名称去匹配 
     * @return key
     */
    public KeyEnum getKey() {
        return key;
    }

    public void setKey(KeyEnum key) {
        this.key = key;
    }

    public TmsMatchesKeyValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值。 支持可用 UTF-8 格式表示的字母(包含中文)、数字和空格，以及以下字符： _ . : / = + - @ 
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
        TmsMatchesKeyValue that = (TmsMatchesKeyValue) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TmsMatchesKeyValue {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
