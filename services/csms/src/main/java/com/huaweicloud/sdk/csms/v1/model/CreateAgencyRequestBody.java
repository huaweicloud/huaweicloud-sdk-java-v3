package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建服务委托的请求消息体。
 */
public class CreateAgencyRequestBody {

    /**
     * 凭据类型。
     */
    public static final class SecretTypeEnum {

        /**
         * Enum RDS_FG for value: "RDS-FG"
         */
        public static final SecretTypeEnum RDS_FG = new SecretTypeEnum("RDS-FG");

        /**
         * Enum GAUSSDB_FG for value: "GaussDB-FG"
         */
        public static final SecretTypeEnum GAUSSDB_FG = new SecretTypeEnum("GaussDB-FG");

        private static final Map<String, SecretTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecretTypeEnum> createStaticFields() {
            Map<String, SecretTypeEnum> map = new HashMap<>();
            map.put("RDS-FG", RDS_FG);
            map.put("GaussDB-FG", GAUSSDB_FG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecretTypeEnum(String value) {
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
        public static SecretTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SecretTypeEnum(value));
        }

        public static SecretTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecretTypeEnum) {
                return this.value.equals(((SecretTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private SecretTypeEnum secretType;

    public CreateAgencyRequestBody withSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * 凭据类型。
     * @return secretType
     */
    public SecretTypeEnum getSecretType() {
        return secretType;
    }

    public void setSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAgencyRequestBody that = (CreateAgencyRequestBody) obj;
        return Objects.equals(this.secretType, that.secretType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyRequestBody {\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
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
