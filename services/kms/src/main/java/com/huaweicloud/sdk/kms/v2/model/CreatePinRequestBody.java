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
 * CreatePinRequestBody
 */
public class CreatePinRequestBody {

    /**
     * pin码的类型，默认为“CipherText”： - PlainText - CipherText
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    private String keystoreId;

    public CreatePinRequestBody withPinType(PinTypeEnum pinType) {
        this.pinType = pinType;
        return this;
    }

    /**
     * pin码的类型，默认为“CipherText”： - PlainText - CipherText
     * @return pinType
     */
    public PinTypeEnum getPinType() {
        return pinType;
    }

    public void setPinType(PinTypeEnum pinType) {
        this.pinType = pinType;
    }

    public CreatePinRequestBody withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    /**
     * 密钥库ID，指定密文pin时必选： 1：管理面manage_az集群（共享卡集群） 2：数据面共享集群(pod区) 其它：租户专属
     * @return keystoreId
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePinRequestBody that = (CreatePinRequestBody) obj;
        return Objects.equals(this.pinType, that.pinType) && Objects.equals(this.keystoreId, that.keystoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinType, keystoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePinRequestBody {\n");
        sb.append("    pinType: ").append(toIndentedString(pinType)).append("\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
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
