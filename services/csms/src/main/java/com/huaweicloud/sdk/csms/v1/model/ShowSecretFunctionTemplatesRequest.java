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
 * Request Object
 */
public class ShowSecretFunctionTemplatesRequest {

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

    /**
     * 凭据轮转账号类型。 - SingleUser：单用户模式轮转 - MultiUser：双用户模式轮转
     */
    public static final class SecretSubTypeEnum {

        /**
         * Enum SINGLEUSER for value: "SingleUser"
         */
        public static final SecretSubTypeEnum SINGLEUSER = new SecretSubTypeEnum("SingleUser");

        /**
         * Enum MULTIUSER for value: "MultiUser"
         */
        public static final SecretSubTypeEnum MULTIUSER = new SecretSubTypeEnum("MultiUser");

        private static final Map<String, SecretSubTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecretSubTypeEnum> createStaticFields() {
            Map<String, SecretSubTypeEnum> map = new HashMap<>();
            map.put("SingleUser", SINGLEUSER);
            map.put("MultiUser", MULTIUSER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecretSubTypeEnum(String value) {
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
        public static SecretSubTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SecretSubTypeEnum(value));
        }

        public static SecretSubTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecretSubTypeEnum) {
                return this.value.equals(((SecretSubTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_sub_type")

    private SecretSubTypeEnum secretSubType;

    /**
     * 数据库类型。凭据类型为RDS-FG时为必填参数，可传入mysql、postgresql、sqlserver。其余凭据类型不支持。
     */
    public static final class EngineEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineEnum MYSQL = new EngineEnum("mysql");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EngineEnum POSTGRESQL = new EngineEnum("postgresql");

        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final EngineEnum SQLSERVER = new EngineEnum("sqlserver");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("postgresql", POSTGRESQL);
            map.put("sqlserver", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineEnum(value));
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    public ShowSecretFunctionTemplatesRequest withSecretType(SecretTypeEnum secretType) {
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

    public ShowSecretFunctionTemplatesRequest withSecretSubType(SecretSubTypeEnum secretSubType) {
        this.secretSubType = secretSubType;
        return this;
    }

    /**
     * 凭据轮转账号类型。 - SingleUser：单用户模式轮转 - MultiUser：双用户模式轮转
     * @return secretSubType
     */
    public SecretSubTypeEnum getSecretSubType() {
        return secretSubType;
    }

    public void setSecretSubType(SecretSubTypeEnum secretSubType) {
        this.secretSubType = secretSubType;
    }

    public ShowSecretFunctionTemplatesRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 数据库类型。凭据类型为RDS-FG时为必填参数，可传入mysql、postgresql、sqlserver。其余凭据类型不支持。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecretFunctionTemplatesRequest that = (ShowSecretFunctionTemplatesRequest) obj;
        return Objects.equals(this.secretType, that.secretType)
            && Objects.equals(this.secretSubType, that.secretSubType) && Objects.equals(this.engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretType, secretSubType, engine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecretFunctionTemplatesRequest {\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretSubType: ").append(toIndentedString(secretSubType)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
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
