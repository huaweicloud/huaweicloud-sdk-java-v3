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
 * EncryptDatakeyRequestBody
 */
public class EncryptDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plain_text")

    private String plainText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_plain_length")

    private String datakeyPlainLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_authenticated_data")

    private String additionalAuthenticatedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pin")

    private String pin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pin_type")

    private String pinType;

    /**
     * 指定生成的密钥算法。有效值： SM2、RSA。
     */
    public static final class KeySpecEnum {

        /**
         * Enum SM2 for value: "SM2"
         */
        public static final KeySpecEnum SM2 = new KeySpecEnum("SM2");

        /**
         * Enum RSA for value: "RSA"
         */
        public static final KeySpecEnum RSA = new KeySpecEnum("RSA");

        private static final Map<String, KeySpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeySpecEnum> createStaticFields() {
            Map<String, KeySpecEnum> map = new HashMap<>();
            map.put("SM2", SM2);
            map.put("RSA", RSA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeySpecEnum(String value) {
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
        public static KeySpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeySpecEnum(value));
        }

        public static KeySpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeySpecEnum) {
                return this.value.equals(((KeySpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_spec")

    private KeySpecEnum keySpec;

    public EncryptDatakeyRequestBody withKeyId(String keyId) {
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

    public EncryptDatakeyRequestBody withPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    /**
     * CMK为AES时，DEK明文和DEK明文的SHA256（32字节）；CMK为SM4时，DEK明文和DEK明文的SM3（32字节），均为16进制字符串表示。
     * @return plainText
     */
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public EncryptDatakeyRequestBody withDatakeyPlainLength(String datakeyPlainLength) {
        this.datakeyPlainLength = datakeyPlainLength;
        return this;
    }

    /**
     * DEK明文字节长度，取值范围为1~1024。 DEK明文字节长度，取值为“64”。
     * @return datakeyPlainLength
     */
    public String getDatakeyPlainLength() {
        return datakeyPlainLength;
    }

    public void setDatakeyPlainLength(String datakeyPlainLength) {
        this.datakeyPlainLength = datakeyPlainLength;
    }

    public EncryptDatakeyRequestBody withAdditionalAuthenticatedData(String additionalAuthenticatedData) {
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

    public EncryptDatakeyRequestBody withSequence(String sequence) {
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

    public EncryptDatakeyRequestBody withPin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * 指定PIN码保护。仅四级密评场景支持该参数。
     * @return pin
     */
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public EncryptDatakeyRequestBody withPinType(String pinType) {
        this.pinType = pinType;
        return this;
    }

    /**
     * pin码的类型，默认为“CipherText”，可选“PlainText”。仅四级密评场景支持该参数。
     * @return pinType
     */
    public String getPinType() {
        return pinType;
    }

    public void setPinType(String pinType) {
        this.pinType = pinType;
    }

    public EncryptDatakeyRequestBody withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * 指定生成的密钥算法。有效值： SM2、RSA。
     * @return keySpec
     */
    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptDatakeyRequestBody that = (EncryptDatakeyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.plainText, that.plainText)
            && Objects.equals(this.datakeyPlainLength, that.datakeyPlainLength)
            && Objects.equals(this.additionalAuthenticatedData, that.additionalAuthenticatedData)
            && Objects.equals(this.sequence, that.sequence) && Objects.equals(this.pin, that.pin)
            && Objects.equals(this.pinType, that.pinType) && Objects.equals(this.keySpec, that.keySpec);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(keyId, plainText, datakeyPlainLength, additionalAuthenticatedData, sequence, pin, pinType, keySpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
        sb.append("    datakeyPlainLength: ").append(toIndentedString(datakeyPlainLength)).append("\n");
        sb.append("    additionalAuthenticatedData: ")
            .append(toIndentedString(additionalAuthenticatedData))
            .append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
        sb.append("    pinType: ").append(toIndentedString(pinType)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
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
