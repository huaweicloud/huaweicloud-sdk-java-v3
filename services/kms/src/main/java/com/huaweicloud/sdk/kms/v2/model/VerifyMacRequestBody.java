package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VerifyMacRequestBody
 */
public class VerifyMacRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    /**
     * Mac算法，HMAC_SM3只有中国区支持。枚举如下： - HMAC_SHA_256 - HMAC_SHA_384 - HMAC_SHA_512 - HMAC_SM3
     */
    public static final class MacAlgorithmEnum {

        /**
         * Enum HMAC_SHA_256 for value: "HMAC_SHA_256"
         */
        public static final MacAlgorithmEnum HMAC_SHA_256 = new MacAlgorithmEnum("HMAC_SHA_256");

        /**
         * Enum HMAC_SHA_384 for value: "HMAC_SHA_384"
         */
        public static final MacAlgorithmEnum HMAC_SHA_384 = new MacAlgorithmEnum("HMAC_SHA_384");

        /**
         * Enum HMAC_SHA_512 for value: "HMAC_SHA_512"
         */
        public static final MacAlgorithmEnum HMAC_SHA_512 = new MacAlgorithmEnum("HMAC_SHA_512");

        /**
         * Enum HMAC_SM3 for value: "HMAC_SM3"
         */
        public static final MacAlgorithmEnum HMAC_SM3 = new MacAlgorithmEnum("HMAC_SM3");

        private static final Map<String, MacAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MacAlgorithmEnum> createStaticFields() {
            Map<String, MacAlgorithmEnum> map = new HashMap<>();
            map.put("HMAC_SHA_256", HMAC_SHA_256);
            map.put("HMAC_SHA_384", HMAC_SHA_384);
            map.put("HMAC_SHA_512", HMAC_SHA_512);
            map.put("HMAC_SM3", HMAC_SM3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MacAlgorithmEnum(String value) {
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
        public static MacAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MacAlgorithmEnum(value));
        }

        public static MacAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MacAlgorithmEnum) {
                return this.value.equals(((MacAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_algorithm")

    private MacAlgorithmEnum macAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac")

    private String mac;

    public VerifyMacRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 密钥ID
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public VerifyMacRequestBody withMacAlgorithm(MacAlgorithmEnum macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        return this;
    }

    /**
     * Mac算法，HMAC_SM3只有中国区支持。枚举如下： - HMAC_SHA_256 - HMAC_SHA_384 - HMAC_SHA_512 - HMAC_SM3
     * @return macAlgorithm
     */
    public MacAlgorithmEnum getMacAlgorithm() {
        return macAlgorithm;
    }

    public void setMacAlgorithm(MacAlgorithmEnum macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    public VerifyMacRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 待处理消息。原消息最小长度1、最大长度4096。请将原消息转为Base64格式后传入
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public VerifyMacRequestBody withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * 待校验的消息验证码
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerifyMacRequestBody that = (VerifyMacRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.macAlgorithm, that.macAlgorithm)
            && Objects.equals(this.message, that.message) && Objects.equals(this.mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, macAlgorithm, message, mac);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyMacRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    macAlgorithm: ").append(toIndentedString(macAlgorithm)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
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
