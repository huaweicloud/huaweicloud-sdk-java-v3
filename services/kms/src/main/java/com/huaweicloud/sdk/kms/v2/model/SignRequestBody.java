package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SignRequestBody
 */
public class SignRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    @JacksonXmlProperty(localName = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    /**
     * 签名算法，枚举如下：  - RSASSA_PSS_SHA_256  - RSASSA_PSS_SHA_384  - RSASSA_PSS_SHA_512  - RSASSA_PKCS1_V1_5_SHA_256  - RSASSA_PKCS1_V1_5_SHA_384  - RSASSA_PKCS1_V1_5_SHA_512  - ECDSA_SHA_256  - ECDSA_SHA_384  - ECDSA_SHA_512  - SM2DSA_SM3
     */
    public static final class SigningAlgorithmEnum {

        /**
         * Enum RSASSA_PSS_SHA_256 for value: "RSASSA_PSS_SHA_256"
         */
        public static final SigningAlgorithmEnum RSASSA_PSS_SHA_256 = new SigningAlgorithmEnum("RSASSA_PSS_SHA_256");

        /**
         * Enum RSASSA_PSS_SHA_384 for value: "RSASSA_PSS_SHA_384"
         */
        public static final SigningAlgorithmEnum RSASSA_PSS_SHA_384 = new SigningAlgorithmEnum("RSASSA_PSS_SHA_384");

        /**
         * Enum RSASSA_PSS_SHA_512 for value: "RSASSA_PSS_SHA_512"
         */
        public static final SigningAlgorithmEnum RSASSA_PSS_SHA_512 = new SigningAlgorithmEnum("RSASSA_PSS_SHA_512");

        /**
         * Enum RSASSA_PKCS1_V1_5_SHA_256 for value: "RSASSA_PKCS1_V1_5_SHA_256"
         */
        public static final SigningAlgorithmEnum RSASSA_PKCS1_V1_5_SHA_256 =
            new SigningAlgorithmEnum("RSASSA_PKCS1_V1_5_SHA_256");

        /**
         * Enum RSASSA_PKCS1_V1_5_SHA_384 for value: "RSASSA_PKCS1_V1_5_SHA_384"
         */
        public static final SigningAlgorithmEnum RSASSA_PKCS1_V1_5_SHA_384 =
            new SigningAlgorithmEnum("RSASSA_PKCS1_V1_5_SHA_384");

        /**
         * Enum RSASSA_PKCS1_V1_5_SHA_512 for value: "RSASSA_PKCS1_V1_5_SHA_512"
         */
        public static final SigningAlgorithmEnum RSASSA_PKCS1_V1_5_SHA_512 =
            new SigningAlgorithmEnum("RSASSA_PKCS1_V1_5_SHA_512");

        /**
         * Enum ECDSA_SHA_256 for value: "ECDSA_SHA_256"
         */
        public static final SigningAlgorithmEnum ECDSA_SHA_256 = new SigningAlgorithmEnum("ECDSA_SHA_256");

        /**
         * Enum ECDSA_SHA_384 for value: "ECDSA_SHA_384"
         */
        public static final SigningAlgorithmEnum ECDSA_SHA_384 = new SigningAlgorithmEnum("ECDSA_SHA_384");

        /**
         * Enum ECDSA_SHA_512 for value: "ECDSA_SHA_512"
         */
        public static final SigningAlgorithmEnum ECDSA_SHA_512 = new SigningAlgorithmEnum("ECDSA_SHA_512");

        /**
         * Enum SM2DSA_SM3 for value: "SM2DSA_SM3"
         */
        public static final SigningAlgorithmEnum SM2DSA_SM3 = new SigningAlgorithmEnum("SM2DSA_SM3");

        private static final Map<String, SigningAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SigningAlgorithmEnum> createStaticFields() {
            Map<String, SigningAlgorithmEnum> map = new HashMap<>();
            map.put("RSASSA_PSS_SHA_256", RSASSA_PSS_SHA_256);
            map.put("RSASSA_PSS_SHA_384", RSASSA_PSS_SHA_384);
            map.put("RSASSA_PSS_SHA_512", RSASSA_PSS_SHA_512);
            map.put("RSASSA_PKCS1_V1_5_SHA_256", RSASSA_PKCS1_V1_5_SHA_256);
            map.put("RSASSA_PKCS1_V1_5_SHA_384", RSASSA_PKCS1_V1_5_SHA_384);
            map.put("RSASSA_PKCS1_V1_5_SHA_512", RSASSA_PKCS1_V1_5_SHA_512);
            map.put("ECDSA_SHA_256", ECDSA_SHA_256);
            map.put("ECDSA_SHA_384", ECDSA_SHA_384);
            map.put("ECDSA_SHA_512", ECDSA_SHA_512);
            map.put("SM2DSA_SM3", SM2DSA_SM3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SigningAlgorithmEnum(String value) {
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
        public static SigningAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SigningAlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SigningAlgorithmEnum(value);
            }
            return result;
        }

        public static SigningAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SigningAlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SigningAlgorithmEnum) {
                return this.value.equals(((SigningAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signing_algorithm")

    @JacksonXmlProperty(localName = "signing_algorithm")

    private SigningAlgorithmEnum signingAlgorithm;

    /**
     * 消息类型，默认为“DIGEST”，枚举如下：  - DIGEST 表示消息摘要  - RAW 表示消息原文
     */
    public static final class MessageTypeEnum {

        /**
         * Enum DIGEST for value: "DIGEST"
         */
        public static final MessageTypeEnum DIGEST = new MessageTypeEnum("DIGEST");

        /**
         * Enum RAW for value: "RAW"
         */
        public static final MessageTypeEnum RAW = new MessageTypeEnum("RAW");

        private static final Map<String, MessageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MessageTypeEnum> createStaticFields() {
            Map<String, MessageTypeEnum> map = new HashMap<>();
            map.put("DIGEST", DIGEST);
            map.put("RAW", RAW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MessageTypeEnum(String value) {
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
        public static MessageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MessageTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MessageTypeEnum(value);
            }
            return result;
        }

        public static MessageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MessageTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MessageTypeEnum) {
                return this.value.equals(((MessageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_type")

    @JacksonXmlProperty(localName = "message_type")

    private MessageTypeEnum messageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    @JacksonXmlProperty(localName = "sequence")

    private String sequence;

    public SignRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 密钥ID，36字节，满足正则匹配“^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$”。 例如：0d0466b0-e727-4d9c-b35d-f84bb474a37f。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public SignRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 待签名的消息摘要或者消息，消息长度要求小于4096字节，使用Base64编码。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SignRequestBody withSigningAlgorithm(SigningAlgorithmEnum signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * 签名算法，枚举如下：  - RSASSA_PSS_SHA_256  - RSASSA_PSS_SHA_384  - RSASSA_PSS_SHA_512  - RSASSA_PKCS1_V1_5_SHA_256  - RSASSA_PKCS1_V1_5_SHA_384  - RSASSA_PKCS1_V1_5_SHA_512  - ECDSA_SHA_256  - ECDSA_SHA_384  - ECDSA_SHA_512  - SM2DSA_SM3
     * @return signingAlgorithm
     */
    public SigningAlgorithmEnum getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(SigningAlgorithmEnum signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public SignRequestBody withMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 消息类型，默认为“DIGEST”，枚举如下：  - DIGEST 表示消息摘要  - RAW 表示消息原文
     * @return messageType
     */
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public SignRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 请求消息序列号，36字节序列号。 例如：919c82d4-8046-4722-9094-35c3c6524cff。
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignRequestBody signRequestBody = (SignRequestBody) o;
        return Objects.equals(this.keyId, signRequestBody.keyId)
            && Objects.equals(this.message, signRequestBody.message)
            && Objects.equals(this.signingAlgorithm, signRequestBody.signingAlgorithm)
            && Objects.equals(this.messageType, signRequestBody.messageType)
            && Objects.equals(this.sequence, signRequestBody.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, message, signingAlgorithm, messageType, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    signingAlgorithm: ").append(toIndentedString(signingAlgorithm)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
