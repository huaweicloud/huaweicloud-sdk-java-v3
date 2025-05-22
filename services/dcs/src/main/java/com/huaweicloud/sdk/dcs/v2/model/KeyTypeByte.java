package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Key类型总大小。
 */
public class KeyTypeByte {

    /**
     * **参数解释**： Key的数据类型。 **取值范围**： string list set zset hash 
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final TypeEnum STRING = new TypeEnum("string");

        /**
         * Enum LIST for value: "list"
         */
        public static final TypeEnum LIST = new TypeEnum("list");

        /**
         * Enum SET for value: "set"
         */
        public static final TypeEnum SET = new TypeEnum("set");

        /**
         * Enum ZSET for value: "zset"
         */
        public static final TypeEnum ZSET = new TypeEnum("zset");

        /**
         * Enum HASH for value: "hash"
         */
        public static final TypeEnum HASH = new TypeEnum("hash");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("list", LIST);
            map.put("set", SET);
            map.put("zset", ZSET);
            map.put("hash", HASH);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes")

    private Integer bytes;

    public KeyTypeByte withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： Key的数据类型。 **取值范围**： string list set zset hash 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public KeyTypeByte withBytes(Integer bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * **参数解释**： 每种数据类型Key的总大小，单位：Bytes。 **取值范围**： 不涉及。 
     * @return bytes
     */
    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyTypeByte that = (KeyTypeByte) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.bytes, that.bytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, bytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyTypeByte {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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
