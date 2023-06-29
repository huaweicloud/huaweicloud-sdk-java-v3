package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Kafka安全认证相关参数
 */
public class KafkaSecurity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_key_name")

    private String trustStoreKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_key")

    private String trustStoreKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_password")

    private String trustStorePassword;

    /**
     * 认证类型，PLAINTEXT为无认证，，使用安全认证时必填。
     */
    public static final class TypeEnum {

        /**
         * Enum PLAINTEXT for value: "PLAINTEXT"
         */
        public static final TypeEnum PLAINTEXT = new TypeEnum("PLAINTEXT");

        /**
         * Enum SASL_SSL for value: "SASL_SSL"
         */
        public static final TypeEnum SASL_SSL = new TypeEnum("SASL_SSL");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("PLAINTEXT", PLAINTEXT);
            map.put("SASL_SSL", SASL_SSL);
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

    public KafkaSecurity withTrustStoreKeyName(String trustStoreKeyName) {
        this.trustStoreKeyName = trustStoreKeyName;
        return this;
    }

    /**
     * 证书名称，使用安全认证时必填。
     * @return trustStoreKeyName
     */
    public String getTrustStoreKeyName() {
        return trustStoreKeyName;
    }

    public void setTrustStoreKeyName(String trustStoreKeyName) {
        this.trustStoreKeyName = trustStoreKeyName;
    }

    public KafkaSecurity withTrustStoreKey(String trustStoreKey) {
        this.trustStoreKey = trustStoreKey;
        return this;
    }

    /**
     * 安全证书base64转码后的值，使用安全认证时必填。
     * @return trustStoreKey
     */
    public String getTrustStoreKey() {
        return trustStoreKey;
    }

    public void setTrustStoreKey(String trustStoreKey) {
        this.trustStoreKey = trustStoreKey;
    }

    public KafkaSecurity withTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
        return this;
    }

    /**
     * 证书密码，使用安全认证时必填。
     * @return trustStorePassword
     */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    public void setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
    }

    public KafkaSecurity withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 认证类型，PLAINTEXT为无认证，，使用安全认证时必填。
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
        KafkaSecurity that = (KafkaSecurity) obj;
        return Objects.equals(this.trustStoreKeyName, that.trustStoreKeyName)
            && Objects.equals(this.trustStoreKey, that.trustStoreKey)
            && Objects.equals(this.trustStorePassword, that.trustStorePassword) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustStoreKeyName, trustStoreKey, trustStorePassword, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaSecurity {\n");
        sb.append("    trustStoreKeyName: ").append(toIndentedString(trustStoreKeyName)).append("\n");
        sb.append("    trustStoreKey: ").append(toIndentedString(trustStoreKey)).append("\n");
        sb.append("    trustStorePassword: ").append(toIndentedString(trustStorePassword)).append("\n");
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
