package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SslInfo
 */
public class SslInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_id")

    private String sslId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_name")

    private String sslName;

    /**
     * 证书算法类型： - RSA - ECC - SM2  [暂不支持](tag:hws;hws_hk;g42;Site)
     */
    public static final class AlgorithmTypeEnum {

        /**
         * Enum RSA for value: "RSA"
         */
        public static final AlgorithmTypeEnum RSA = new AlgorithmTypeEnum("RSA");

        /**
         * Enum ECC for value: "ECC"
         */
        public static final AlgorithmTypeEnum ECC = new AlgorithmTypeEnum("ECC");

        /**
         * Enum SM2 for value: "SM2"
         */
        public static final AlgorithmTypeEnum SM2 = new AlgorithmTypeEnum("SM2");

        private static final Map<String, AlgorithmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlgorithmTypeEnum> createStaticFields() {
            Map<String, AlgorithmTypeEnum> map = new HashMap<>();
            map.put("RSA", RSA);
            map.put("ECC", ECC);
            map.put("SM2", SM2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlgorithmTypeEnum(String value) {
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
        public static AlgorithmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlgorithmTypeEnum(value));
        }

        public static AlgorithmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlgorithmTypeEnum) {
                return this.value.equals(((AlgorithmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private AlgorithmTypeEnum algorithmType;

    /**
     * 证书可见范围： - instance：当前实例 - global：全局
     */
    public static final class TypeEnum {

        /**
         * Enum INSTANCE for value: "instance"
         */
        public static final TypeEnum INSTANCE = new TypeEnum("instance");

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final TypeEnum GLOBAL = new TypeEnum("global");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("instance", INSTANCE);
            map.put("global", GLOBAL);
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

    public SslInfo withSslId(String sslId) {
        this.sslId = sslId;
        return this;
    }

    /**
     * SSL证书编号
     * @return sslId
     */
    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    public SslInfo withSslName(String sslName) {
        this.sslName = sslName;
        return this;
    }

    /**
     * SSL证书名称
     * @return sslName
     */
    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    public SslInfo withAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 证书算法类型： - RSA - ECC - SM2  [暂不支持](tag:hws;hws_hk;g42;Site)
     * @return algorithmType
     */
    public AlgorithmTypeEnum getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
    }

    public SslInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 证书可见范围： - instance：当前实例 - global：全局
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
        SslInfo that = (SslInfo) obj;
        return Objects.equals(this.sslId, that.sslId) && Objects.equals(this.sslName, that.sslName)
            && Objects.equals(this.algorithmType, that.algorithmType) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sslId, sslName, algorithmType, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SslInfo {\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
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
