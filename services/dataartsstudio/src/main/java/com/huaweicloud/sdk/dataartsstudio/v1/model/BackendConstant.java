package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BackendConstant
 */
public class BackendConstant {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 常量参数类型
     */
    public static final class TypeEnum {

        /**
         * Enum REQUEST_PARAMETER_TYPE_NUMBER for value: "REQUEST_PARAMETER_TYPE_NUMBER"
         */
        public static final TypeEnum REQUEST_PARAMETER_TYPE_NUMBER = new TypeEnum("REQUEST_PARAMETER_TYPE_NUMBER");

        /**
         * Enum REQUEST_PARAMETER_TYPE_STRING for value: "REQUEST_PARAMETER_TYPE_STRING"
         */
        public static final TypeEnum REQUEST_PARAMETER_TYPE_STRING = new TypeEnum("REQUEST_PARAMETER_TYPE_STRING");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("REQUEST_PARAMETER_TYPE_NUMBER", REQUEST_PARAMETER_TYPE_NUMBER);
            map.put("REQUEST_PARAMETER_TYPE_STRING", REQUEST_PARAMETER_TYPE_STRING);
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

    /**
     * 常量参数位置
     */
    public static final class PositionEnum {

        /**
         * Enum REQUEST_PARAMETER_POSITION_PATH for value: "REQUEST_PARAMETER_POSITION_PATH"
         */
        public static final PositionEnum REQUEST_PARAMETER_POSITION_PATH =
            new PositionEnum("REQUEST_PARAMETER_POSITION_PATH");

        /**
         * Enum REQUEST_PARAMETER_POSITION_HEADER for value: "REQUEST_PARAMETER_POSITION_HEADER"
         */
        public static final PositionEnum REQUEST_PARAMETER_POSITION_HEADER =
            new PositionEnum("REQUEST_PARAMETER_POSITION_HEADER");

        /**
         * Enum REQUEST_PARAMETER_POSITION_QUERY for value: "REQUEST_PARAMETER_POSITION_QUERY"
         */
        public static final PositionEnum REQUEST_PARAMETER_POSITION_QUERY =
            new PositionEnum("REQUEST_PARAMETER_POSITION_QUERY");

        private static final Map<String, PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionEnum> createStaticFields() {
            Map<String, PositionEnum> map = new HashMap<>();
            map.put("REQUEST_PARAMETER_POSITION_PATH", REQUEST_PARAMETER_POSITION_PATH);
            map.put("REQUEST_PARAMETER_POSITION_HEADER", REQUEST_PARAMETER_POSITION_HEADER);
            map.put("REQUEST_PARAMETER_POSITION_QUERY", REQUEST_PARAMETER_POSITION_QUERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionEnum(String value) {
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
        public static PositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PositionEnum(value));
        }

        public static PositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PositionEnum) {
                return this.value.equals(((PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private PositionEnum position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public BackendConstant withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 常量参数名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackendConstant withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 常量参数类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BackendConstant withPosition(PositionEnum position) {
        this.position = position;
        return this;
    }

    /**
     * 常量参数位置
     * @return position
     */
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public BackendConstant withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 常量参数描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BackendConstant withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 常量参数值
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
        BackendConstant that = (BackendConstant) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.position, that.position) && Objects.equals(this.description, that.description)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, position, description, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendConstant {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
