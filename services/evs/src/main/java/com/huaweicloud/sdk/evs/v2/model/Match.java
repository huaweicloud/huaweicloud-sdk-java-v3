package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Match
 */
public class Match {

    /**
     * 键。取值范围如下： resource_name：资源名称。 service_type：服务类型。
     */
    public static final class KeyEnum {

        /**
         * Enum RESOURCE_NAME for value: "resource_name"
         */
        public static final KeyEnum RESOURCE_NAME = new KeyEnum("resource_name");

        /**
         * Enum SERVICE_TYPE for value: "service_type"
         */
        public static final KeyEnum SERVICE_TYPE = new KeyEnum("service_type");

        private static final Map<String, KeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyEnum> createStaticFields() {
            Map<String, KeyEnum> map = new HashMap<>();
            map.put("resource_name", RESOURCE_NAME);
            map.put("service_type", SERVICE_TYPE);
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
            KeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeyEnum(value);
            }
            return result;
        }

        public static KeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "key")

    private KeyEnum key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    public Match withKey(KeyEnum key) {
        this.key = key;
        return this;
    }

    /**
     * 键。取值范围如下： resource_name：资源名称。 service_type：服务类型。
     * @return key
     */
    public KeyEnum getKey() {
        return key;
    }

    public void setKey(KeyEnum key) {
        this.key = key;
    }

    public Match withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值。最大长度255个字符。 key为“resource_name”时，value为模糊匹配。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Match match = (Match) o;
        return Objects.equals(this.key, match.key) && Objects.equals(this.value, match.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Match {\n");
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
