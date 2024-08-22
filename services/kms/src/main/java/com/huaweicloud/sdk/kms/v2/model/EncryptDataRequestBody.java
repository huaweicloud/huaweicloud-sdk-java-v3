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
 * EncryptDataRequestBody
 */
public class EncryptDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plain_text")

    private String plainText;

    /**
     * 数据加密算法，仅使用非对称密钥需要指定该参数，默认值为“SYMMETRIC_DEFAULT”，合法枚举值如下：  - SYMMETRIC_DEFAULT  - RSAES_OAEP_SHA_256  - SM2_ENCRYPT
     */
    public static final class EncryptionAlgorithmEnum {

        /**
         * Enum SYMMETRIC_DEFAULT for value: "SYMMETRIC_DEFAULT"
         */
        public static final EncryptionAlgorithmEnum SYMMETRIC_DEFAULT =
            new EncryptionAlgorithmEnum("SYMMETRIC_DEFAULT");

        /**
         * Enum RSAES_OAEP_SHA_256 for value: "RSAES_OAEP_SHA_256"
         */
        public static final EncryptionAlgorithmEnum RSAES_OAEP_SHA_256 =
            new EncryptionAlgorithmEnum("RSAES_OAEP_SHA_256");

        /**
         * Enum SM2_ENCRYPT for value: "SM2_ENCRYPT"
         */
        public static final EncryptionAlgorithmEnum SM2_ENCRYPT = new EncryptionAlgorithmEnum("SM2_ENCRYPT");

        private static final Map<String, EncryptionAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptionAlgorithmEnum> createStaticFields() {
            Map<String, EncryptionAlgorithmEnum> map = new HashMap<>();
            map.put("SYMMETRIC_DEFAULT", SYMMETRIC_DEFAULT);
            map.put("RSAES_OAEP_SHA_256", RSAES_OAEP_SHA_256);
            map.put("SM2_ENCRYPT", SM2_ENCRYPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncryptionAlgorithmEnum(String value) {
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
        public static EncryptionAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptionAlgorithmEnum(value));
        }

        public static EncryptionAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncryptionAlgorithmEnum) {
                return this.value.equals(((EncryptionAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_algorithm")

    private EncryptionAlgorithmEnum encryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_authenticated_data")

    private String additionalAuthenticatedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public EncryptDataRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 密钥ID，36字节，满足正则匹配“^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$”。 例如：0d0466b0-e727-4d9c-b35d-f84bb474a37f。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public EncryptDataRequestBody withPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    /**
     * 明文数据，1~4096字节，满足正则匹配“^.{1,4096}$”，且转化为byte数组后长度取值范围为1~4096字节。
     * @return plainText
     */
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public EncryptDataRequestBody withEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * 数据加密算法，仅使用非对称密钥需要指定该参数，默认值为“SYMMETRIC_DEFAULT”，合法枚举值如下：  - SYMMETRIC_DEFAULT  - RSAES_OAEP_SHA_256  - SM2_ENCRYPT
     * @return encryptionAlgorithm
     */
    public EncryptionAlgorithmEnum getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public EncryptDataRequestBody withAdditionalAuthenticatedData(String additionalAuthenticatedData) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        return this;
    }

    /**
     * 身份验证的非敏感额外数据。任意字符串，长度不超过128字节。
     * @return additionalAuthenticatedData
     */
    public String getAdditionalAuthenticatedData() {
        return additionalAuthenticatedData;
    }

    public void setAdditionalAuthenticatedData(String additionalAuthenticatedData) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
    }

    public EncryptDataRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 请求消息序列号，36字节序列号。 例如：919c82d4-8046-4722-9094-35c3c6524cff
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptDataRequestBody that = (EncryptDataRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.plainText, that.plainText)
            && Objects.equals(this.encryptionAlgorithm, that.encryptionAlgorithm)
            && Objects.equals(this.additionalAuthenticatedData, that.additionalAuthenticatedData)
            && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, plainText, encryptionAlgorithm, additionalAuthenticatedData, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDataRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
        sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
        sb.append("    additionalAuthenticatedData: ")
            .append(toIndentedString(additionalAuthenticatedData))
            .append("\n");
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
