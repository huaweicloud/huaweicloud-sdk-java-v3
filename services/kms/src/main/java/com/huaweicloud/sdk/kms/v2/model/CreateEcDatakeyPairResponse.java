package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateEcDatakeyPairResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    /**
     * 需要包含算法、长度、曲线信息。可选值有RSA_2048 | RSA_3072 | RSA_4096 | ECC_NIST_P256 | ECC_NIST_P384 | ECC_NIST_P521 | ECC_SECG_P256K1 | SM2
     */
    public static final class KeySpecEnum {

        /**
         * Enum RSA_2048 for value: "RSA_2048"
         */
        public static final KeySpecEnum RSA_2048 = new KeySpecEnum("RSA_2048");

        /**
         * Enum RSA_3072 for value: "RSA_3072"
         */
        public static final KeySpecEnum RSA_3072 = new KeySpecEnum("RSA_3072");

        /**
         * Enum RSA_4096 for value: "RSA_4096"
         */
        public static final KeySpecEnum RSA_4096 = new KeySpecEnum("RSA_4096");

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
            map.put("RSA_2048", RSA_2048);
            map.put("RSA_3072", RSA_3072);
            map.put("RSA_4096", RSA_4096);
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
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key_cipher_text")

    private String privateKeyCipherText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key_plain_text")

    private String privateKeyPlainText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wrapped_private_key")

    private String wrappedPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphertext_recipient")

    private String ciphertextRecipient;

    public CreateEcDatakeyPairResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 密钥ID。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateEcDatakeyPairResponse withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * 需要包含算法、长度、曲线信息。可选值有RSA_2048 | RSA_3072 | RSA_4096 | ECC_NIST_P256 | ECC_NIST_P384 | ECC_NIST_P521 | ECC_SECG_P256K1 | SM2
     * @return keySpec
     */
    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    public CreateEcDatakeyPairResponse withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * 明文公钥信息
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public CreateEcDatakeyPairResponse withPrivateKeyCipherText(String privateKeyCipherText) {
        this.privateKeyCipherText = privateKeyCipherText;
        return this;
    }

    /**
     * 密文私钥
     * @return privateKeyCipherText
     */
    public String getPrivateKeyCipherText() {
        return privateKeyCipherText;
    }

    public void setPrivateKeyCipherText(String privateKeyCipherText) {
        this.privateKeyCipherText = privateKeyCipherText;
    }

    public CreateEcDatakeyPairResponse withPrivateKeyPlainText(String privateKeyPlainText) {
        this.privateKeyPlainText = privateKeyPlainText;
        return this;
    }

    /**
     * 明文私钥。private_key_plain_text、wrapped_private_key和ciphertext_recipient只能有一个有值
     * @return privateKeyPlainText
     */
    public String getPrivateKeyPlainText() {
        return privateKeyPlainText;
    }

    public void setPrivateKeyPlainText(String privateKeyPlainText) {
        this.privateKeyPlainText = privateKeyPlainText;
    }

    public CreateEcDatakeyPairResponse withWrappedPrivateKey(String wrappedPrivateKey) {
        this.wrappedPrivateKey = wrappedPrivateKey;
        return this;
    }

    /**
     * 由自定义私钥加密的密文私钥。private_key_plain_text、wrapped_private_key和ciphertext_recipient只能有一个有值
     * @return wrappedPrivateKey
     */
    public String getWrappedPrivateKey() {
        return wrappedPrivateKey;
    }

    public void setWrappedPrivateKey(String wrappedPrivateKey) {
        this.wrappedPrivateKey = wrappedPrivateKey;
    }

    public CreateEcDatakeyPairResponse withCiphertextRecipient(String ciphertextRecipient) {
        this.ciphertextRecipient = ciphertextRecipient;
        return this;
    }

    /**
     * 由擎天公钥信息加密的密文私钥。private_key_plain_text、wrapped_private_key和ciphertext_recipient只能有一个有值
     * @return ciphertextRecipient
     */
    public String getCiphertextRecipient() {
        return ciphertextRecipient;
    }

    public void setCiphertextRecipient(String ciphertextRecipient) {
        this.ciphertextRecipient = ciphertextRecipient;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEcDatakeyPairResponse that = (CreateEcDatakeyPairResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.keySpec, that.keySpec)
            && Objects.equals(this.publicKey, that.publicKey)
            && Objects.equals(this.privateKeyCipherText, that.privateKeyCipherText)
            && Objects.equals(this.privateKeyPlainText, that.privateKeyPlainText)
            && Objects.equals(this.wrappedPrivateKey, that.wrappedPrivateKey)
            && Objects.equals(this.ciphertextRecipient, that.ciphertextRecipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId,
            keySpec,
            publicKey,
            privateKeyCipherText,
            privateKeyPlainText,
            wrappedPrivateKey,
            ciphertextRecipient);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEcDatakeyPairResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    privateKeyCipherText: ").append(toIndentedString(privateKeyCipherText)).append("\n");
        sb.append("    privateKeyPlainText: ").append(toIndentedString(privateKeyPlainText)).append("\n");
        sb.append("    wrappedPrivateKey: ").append(toIndentedString(wrappedPrivateKey)).append("\n");
        sb.append("    ciphertextRecipient: ").append(toIndentedString(ciphertextRecipient)).append("\n");
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
