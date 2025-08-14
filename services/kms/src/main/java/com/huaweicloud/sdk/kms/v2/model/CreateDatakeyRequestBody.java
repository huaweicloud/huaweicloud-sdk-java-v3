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
 * CreateDatakeyRequestBody
 */
public class CreateDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    /**
     * 指定生成的密钥bit位长度。有效值：AES_256、AES_128、SM4、HMAC_256、HMAC_384、HMAC_512、HMAC_SM3。  - AES_256：表示256比特的对称密钥。  - AES_128：表示128比特的对称密钥。  - SM4：表示SM4密钥。  - HMAC_256：表示HMAC_256密钥。  - HMAC_384：表示HMAC_384密钥。  - HMAC_512：表示HMAC_512密钥。  - HMAC_SM3：表示HMAC_SM3密钥。     说明：  datakey_length和key_spec二选一。   - 若datakey_length和key_spec都为空，默认生成256bit的密钥。   - 若datakey_length和key_spec都指定了值，仅datakey_length生效。
     */
    public static final class KeySpecEnum {

        /**
         * Enum AES_256 for value: "AES_256"
         */
        public static final KeySpecEnum AES_256 = new KeySpecEnum("AES_256");

        /**
         * Enum AES_128 for value: "AES_128"
         */
        public static final KeySpecEnum AES_128 = new KeySpecEnum("AES_128");

        /**
         * Enum SM4 for value: "SM4"
         */
        public static final KeySpecEnum SM4 = new KeySpecEnum("SM4");

        /**
         * Enum HMAC_256 for value: "HMAC_256"
         */
        public static final KeySpecEnum HMAC_256 = new KeySpecEnum("HMAC_256");

        /**
         * Enum HMAC_384 for value: "HMAC_384"
         */
        public static final KeySpecEnum HMAC_384 = new KeySpecEnum("HMAC_384");

        /**
         * Enum HMAC_512 for value: "HMAC_512"
         */
        public static final KeySpecEnum HMAC_512 = new KeySpecEnum("HMAC_512");

        /**
         * Enum HMAC_SM3 for value: "HMAC_SM3"
         */
        public static final KeySpecEnum HMAC_SM3 = new KeySpecEnum("HMAC_SM3");

        private static final Map<String, KeySpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeySpecEnum> createStaticFields() {
            Map<String, KeySpecEnum> map = new HashMap<>();
            map.put("AES_256", AES_256);
            map.put("AES_128", AES_128);
            map.put("SM4", SM4);
            map.put("HMAC_256", HMAC_256);
            map.put("HMAC_384", HMAC_384);
            map.put("HMAC_512", HMAC_512);
            map.put("HMAC_SM3", HMAC_SM3);
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
    @JsonProperty(value = "datakey_length")

    private String datakeyLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_authenticated_data")

    private String additionalAuthenticatedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pin")

    private String pin;

    /**
     * pin码的类型，默认为“CipherText”： - PlainText：表示明文pin - CipherText：表示密文pin
     */
    public static final class PinTypeEnum {

        /**
         * Enum CIPHERTEXT for value: "CipherText"
         */
        public static final PinTypeEnum CIPHERTEXT = new PinTypeEnum("CipherText");

        /**
         * Enum PLAINTEXT for value: "PlainText"
         */
        public static final PinTypeEnum PLAINTEXT = new PinTypeEnum("PlainText");

        private static final Map<String, PinTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PinTypeEnum> createStaticFields() {
            Map<String, PinTypeEnum> map = new HashMap<>();
            map.put("CipherText", CIPHERTEXT);
            map.put("PlainText", PLAINTEXT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PinTypeEnum(String value) {
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
        public static PinTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PinTypeEnum(value));
        }

        public static PinTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PinTypeEnum) {
                return this.value.equals(((PinTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pin_type")

    private PinTypeEnum pinType;

    public CreateDatakeyRequestBody withKeyId(String keyId) {
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

    public CreateDatakeyRequestBody withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * 指定生成的密钥bit位长度。有效值：AES_256、AES_128、SM4、HMAC_256、HMAC_384、HMAC_512、HMAC_SM3。  - AES_256：表示256比特的对称密钥。  - AES_128：表示128比特的对称密钥。  - SM4：表示SM4密钥。  - HMAC_256：表示HMAC_256密钥。  - HMAC_384：表示HMAC_384密钥。  - HMAC_512：表示HMAC_512密钥。  - HMAC_SM3：表示HMAC_SM3密钥。     说明：  datakey_length和key_spec二选一。   - 若datakey_length和key_spec都为空，默认生成256bit的密钥。   - 若datakey_length和key_spec都指定了值，仅datakey_length生效。
     * @return keySpec
     */
    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    public CreateDatakeyRequestBody withDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
        return this;
    }

    /**
     * 密钥bit位长度。取值为8的倍数，取值范围为8~8192。 说明：  datakey_length和key_spec二选一。   - 若datakey_length和key_spec都为空，默认生成256bit的密钥。   - 若datakey_length和key_spec都指定了值，仅datakey_length生效。
     * @return datakeyLength
     */
    public String getDatakeyLength() {
        return datakeyLength;
    }

    public void setDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
    }

    public CreateDatakeyRequestBody withAdditionalAuthenticatedData(String additionalAuthenticatedData) {
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

    public CreateDatakeyRequestBody withSequence(String sequence) {
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

    public CreateDatakeyRequestBody withPin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * pin码，用于数据密钥的认证，仅四级密评场景生效
     * @return pin
     */
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public CreateDatakeyRequestBody withPinType(PinTypeEnum pinType) {
        this.pinType = pinType;
        return this;
    }

    /**
     * pin码的类型，默认为“CipherText”： - PlainText：表示明文pin - CipherText：表示密文pin
     * @return pinType
     */
    public PinTypeEnum getPinType() {
        return pinType;
    }

    public void setPinType(PinTypeEnum pinType) {
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
        CreateDatakeyRequestBody that = (CreateDatakeyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.keySpec, that.keySpec)
            && Objects.equals(this.datakeyLength, that.datakeyLength)
            && Objects.equals(this.additionalAuthenticatedData, that.additionalAuthenticatedData)
            && Objects.equals(this.sequence, that.sequence) && Objects.equals(this.pin, that.pin)
            && Objects.equals(this.pinType, that.pinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keySpec, datakeyLength, additionalAuthenticatedData, sequence, pin, pinType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    datakeyLength: ").append(toIndentedString(datakeyLength)).append("\n");
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
