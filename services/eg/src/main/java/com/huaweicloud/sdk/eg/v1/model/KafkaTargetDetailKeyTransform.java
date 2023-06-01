package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 键值规则
 */
public class KafkaTargetDetailKeyTransform {

    /**
     * 键值规则类型
     */
    public static final class TypeEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final TypeEnum NONE = new TypeEnum("NONE");

        /**
         * Enum VARIABLE for value: "VARIABLE"
         */
        public static final TypeEnum VARIABLE = new TypeEnum("VARIABLE");

        /**
         * Enum CONSTANT for value: "CONSTANT"
         */
        public static final TypeEnum CONSTANT = new TypeEnum("CONSTANT");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("VARIABLE", VARIABLE);
            map.put("CONSTANT", CONSTANT);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    public KafkaTargetDetailKeyTransform withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 键值规则类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public KafkaTargetDetailKeyTransform withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 键值规则，键值规则为VARIABLE，CONSTANT时必填
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public KafkaTargetDetailKeyTransform withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 键值规则模板，键值规则为VARIABLE时必填
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KafkaTargetDetailKeyTransform kafkaTargetDetailKeyTransform = (KafkaTargetDetailKeyTransform) o;
        return Objects.equals(this.type, kafkaTargetDetailKeyTransform.type)
            && Objects.equals(this.value, kafkaTargetDetailKeyTransform.value)
            && Objects.equals(this.template, kafkaTargetDetailKeyTransform.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaTargetDetailKeyTransform {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
