package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StreamConnect flow解密信息
 */
public class FlowSourceDecryption {

    /**
     * 加密算法，aes128: 加密算法为aes-128，aes192:加密算法为aes-192，aes256: 加密算法为AES-256
     */
    public static final class AlgorithmEnum {

        /**
         * Enum AES128 for value: "aes128"
         */
        public static final AlgorithmEnum AES128 = new AlgorithmEnum("aes128");

        /**
         * Enum AES192 for value: "aes192"
         */
        public static final AlgorithmEnum AES192 = new AlgorithmEnum("aes192");

        /**
         * Enum AES256 for value: "aes256"
         */
        public static final AlgorithmEnum AES256 = new AlgorithmEnum("aes256");

        private static final Map<String, AlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlgorithmEnum> createStaticFields() {
            Map<String, AlgorithmEnum> map = new HashMap<>();
            map.put("aes128", AES128);
            map.put("aes192", AES192);
            map.put("aes256", AES256);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlgorithmEnum(String value) {
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
        public static AlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlgorithmEnum(value));
        }

        public static AlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlgorithmEnum) {
                return this.value.equals(((AlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private AlgorithmEnum algorithm;

    /**
     * 秘钥类型,speke:使用speke协议获取秘钥,static-key:静态秘钥,srt-password:SRT协议秘钥 目前仅支持srt-password类型，其他类型暂不支持
     */
    public static final class KeyTypeEnum {

        /**
         * Enum SPEKE for value: "speke"
         */
        public static final KeyTypeEnum SPEKE = new KeyTypeEnum("speke");

        /**
         * Enum STATIC_KEY for value: "static-key"
         */
        public static final KeyTypeEnum STATIC_KEY = new KeyTypeEnum("static-key");

        /**
         * Enum SRT_PASSWORD for value: "srt-password"
         */
        public static final KeyTypeEnum SRT_PASSWORD = new KeyTypeEnum("srt-password");

        private static final Map<String, KeyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyTypeEnum> createStaticFields() {
            Map<String, KeyTypeEnum> map = new HashMap<>();
            map.put("speke", SPEKE);
            map.put("static-key", STATIC_KEY);
            map.put("srt-password", SRT_PASSWORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyTypeEnum(String value) {
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
        public static KeyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyTypeEnum(value));
        }

        public static KeyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyTypeEnum) {
                return this.value.equals(((KeyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_type")

    private KeyTypeEnum keyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passphrase")

    private String passphrase;

    public FlowSourceDecryption withAlgorithm(AlgorithmEnum algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 加密算法，aes128: 加密算法为aes-128，aes192:加密算法为aes-192，aes256: 加密算法为AES-256
     * @return algorithm
     */
    public AlgorithmEnum getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(AlgorithmEnum algorithm) {
        this.algorithm = algorithm;
    }

    public FlowSourceDecryption withKeyType(KeyTypeEnum keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * 秘钥类型,speke:使用speke协议获取秘钥,static-key:静态秘钥,srt-password:SRT协议秘钥 目前仅支持srt-password类型，其他类型暂不支持
     * @return keyType
     */
    public KeyTypeEnum getKeyType() {
        return keyType;
    }

    public void setKeyType(KeyTypeEnum keyType) {
        this.keyType = keyType;
    }

    public FlowSourceDecryption withPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    /**
     * srt解密秘钥，用于flow对srt流进行解密
     * @return passphrase
     */
    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowSourceDecryption that = (FlowSourceDecryption) obj;
        return Objects.equals(this.algorithm, that.algorithm) && Objects.equals(this.keyType, that.keyType)
            && Objects.equals(this.passphrase, that.passphrase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithm, keyType, passphrase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowSourceDecryption {\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
        sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
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
