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
 * CreateEcDatakeyPairRequestBody
 */
public class CreateEcDatakeyPairRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    /**
     * 需要包含算法、长度、曲线信息。可选值有ECC_NIST_P256 | ECC_NIST_P384 | ECC_NIST_P521 | ECC_SECG_P256K1 | SM2
     */
    public static final class KeySpecEnum {

        /**
         * Enum ECC_NIST_P256 for value: "ECC_NIST_P256"
         */
        public static final KeySpecEnum ECC_NIST_P256 = new KeySpecEnum("ECC_NIST_P256");

        /**
         * Enum ECC_NIST_P384 for value: "ECC_NIST_P384"
         */
        public static final KeySpecEnum ECC_NIST_P384 = new KeySpecEnum("ECC_NIST_P384");

        /**
         * Enum ECC_NIST_P521 for value: "ECC_NIST_P521"
         */
        public static final KeySpecEnum ECC_NIST_P521 = new KeySpecEnum("ECC_NIST_P521");

        /**
         * Enum ECC_SECG_P256K1 for value: "ECC_SECG_P256K1"
         */
        public static final KeySpecEnum ECC_SECG_P256K1 = new KeySpecEnum("ECC_SECG_P256K1");

        /**
         * Enum SM2 for value: "SM2"
         */
        public static final KeySpecEnum SM2 = new KeySpecEnum("SM2");

        private static final Map<String, KeySpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeySpecEnum> createStaticFields() {
            Map<String, KeySpecEnum> map = new HashMap<>();
            map.put("ECC_NIST_P256", ECC_NIST_P256);
            map.put("ECC_NIST_P384", ECC_NIST_P384);
            map.put("ECC_NIST_P521", ECC_NIST_P521);
            map.put("ECC_SECG_P256K1", ECC_SECG_P256K1);
            map.put("SM2", SM2);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_plain_text")

    private Boolean withPlainText;

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

    public CreateEcDatakeyPairRequestBody withKeyId(String keyId) {
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

    public CreateEcDatakeyPairRequestBody withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * 需要包含算法、长度、曲线信息。可选值有ECC_NIST_P256 | ECC_NIST_P384 | ECC_NIST_P521 | ECC_SECG_P256K1 | SM2
     * @return keySpec
     */
    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    public CreateEcDatakeyPairRequestBody withWithPlainText(Boolean withPlainText) {
        this.withPlainText = withPlainText;
        return this;
    }

    /**
     * 是否返回明文私钥，默认为true
     * @return withPlainText
     */
    public Boolean getWithPlainText() {
        return withPlainText;
    }

    public void setWithPlainText(Boolean withPlainText) {
        this.withPlainText = withPlainText;
    }

    public CreateEcDatakeyPairRequestBody withAdditionalAuthenticatedData(String additionalAuthenticatedData) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        return this;
    }

    /**
     * 认证加密的额外信息，请不要填写敏感信息
     * @return additionalAuthenticatedData
     */
    public String getAdditionalAuthenticatedData() {
        return additionalAuthenticatedData;
    }

    public void setAdditionalAuthenticatedData(String additionalAuthenticatedData) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
    }

    public CreateEcDatakeyPairRequestBody withSequence(String sequence) {
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

    public CreateEcDatakeyPairRequestBody withPin(String pin) {
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

    public CreateEcDatakeyPairRequestBody withPinType(String pinType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEcDatakeyPairRequestBody that = (CreateEcDatakeyPairRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.keySpec, that.keySpec)
            && Objects.equals(this.withPlainText, that.withPlainText)
            && Objects.equals(this.additionalAuthenticatedData, that.additionalAuthenticatedData)
            && Objects.equals(this.sequence, that.sequence) && Objects.equals(this.pin, that.pin)
            && Objects.equals(this.pinType, that.pinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keySpec, withPlainText, additionalAuthenticatedData, sequence, pin, pinType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEcDatakeyPairRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    withPlainText: ").append(toIndentedString(withPlainText)).append("\n");
        sb.append("    additionalAuthenticatedData: ")
            .append(toIndentedString(additionalAuthenticatedData))
            .append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
        sb.append("    pinType: ").append(toIndentedString(pinType)).append("\n");
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
