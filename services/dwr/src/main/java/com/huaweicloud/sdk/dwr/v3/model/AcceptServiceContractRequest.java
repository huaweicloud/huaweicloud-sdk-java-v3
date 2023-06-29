package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class AcceptServiceContractRequest {

    /**
     * 服务协议名称 使用公共Action的免责声明协议: use_public_action_privacy_statement 注册公共Action的免责声明协议: register_public_action_privacy_statement
     */
    public static final class TypeEnum {

        /**
         * Enum USE_PUBLIC_ACTION_PRIVACY_STATEMENT for value: "use_public_action_privacy_statement"
         */
        public static final TypeEnum USE_PUBLIC_ACTION_PRIVACY_STATEMENT =
            new TypeEnum("use_public_action_privacy_statement");

        /**
         * Enum REGISTER_PUBLIC_ACTION_PRIVACY_STATEMENT for value: "register_public_action_privacy_statement"
         */
        public static final TypeEnum REGISTER_PUBLIC_ACTION_PRIVACY_STATEMENT =
            new TypeEnum("register_public_action_privacy_statement");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("use_public_action_privacy_statement", USE_PUBLIC_ACTION_PRIVACY_STATEMENT);
            map.put("register_public_action_privacy_statement", REGISTER_PUBLIC_ACTION_PRIVACY_STATEMENT);
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

    public AcceptServiceContractRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 服务协议名称 使用公共Action的免责声明协议: use_public_action_privacy_statement 注册公共Action的免责声明协议: register_public_action_privacy_statement
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
        AcceptServiceContractRequest that = (AcceptServiceContractRequest) obj;
        return Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptServiceContractRequest {\n");
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
