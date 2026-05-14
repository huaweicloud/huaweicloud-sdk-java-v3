package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeriveSharedSecretRequestBody
 */
public class DeriveSharedSecretRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    /**
     * 密钥协商算法，仅支持ECDH
     */
    public static final class KeyAgreementAlgorithmEnum {

        /**
         * Enum ECDH for value: "ECDH"
         */
        public static final KeyAgreementAlgorithmEnum ECDH = new KeyAgreementAlgorithmEnum("ECDH");

        private static final Map<String, KeyAgreementAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyAgreementAlgorithmEnum> createStaticFields() {
            Map<String, KeyAgreementAlgorithmEnum> map = new HashMap<>();
            map.put("ECDH", ECDH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyAgreementAlgorithmEnum(String value) {
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
        public static KeyAgreementAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyAgreementAlgorithmEnum(value));
        }

        public static KeyAgreementAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyAgreementAlgorithmEnum) {
                return this.value.equals(((KeyAgreementAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_agreement_algorithm")

    private KeyAgreementAlgorithmEnum keyAgreementAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipient")

    private Recipient recipient;

    public DeriveSharedSecretRequestBody withKeyId(String keyId) {
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

    public DeriveSharedSecretRequestBody withKeyAgreementAlgorithm(KeyAgreementAlgorithmEnum keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
        return this;
    }

    /**
     * 密钥协商算法，仅支持ECDH
     * @return keyAgreementAlgorithm
     */
    public KeyAgreementAlgorithmEnum getKeyAgreementAlgorithm() {
        return keyAgreementAlgorithm;
    }

    public void setKeyAgreementAlgorithm(KeyAgreementAlgorithmEnum keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
    }

    public DeriveSharedSecretRequestBody withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * 对端密钥对的的公钥，您需要保证是EC_P256，EC_384，SECP256K1或SM2(仅中国区域支持)密钥对的公钥。公钥的格式必须是DER-encoded X.509类型的Base64的字符串
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public DeriveSharedSecretRequestBody withRecipient(Recipient recipient) {
        this.recipient = recipient;
        return this;
    }

    public DeriveSharedSecretRequestBody withRecipient(Consumer<Recipient> recipientSetter) {
        if (this.recipient == null) {
            this.recipient = new Recipient();
            recipientSetter.accept(this.recipient);
        }

        return this;
    }

    /**
     * Get recipient
     * @return recipient
     */
    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeriveSharedSecretRequestBody that = (DeriveSharedSecretRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId)
            && Objects.equals(this.keyAgreementAlgorithm, that.keyAgreementAlgorithm)
            && Objects.equals(this.publicKey, that.publicKey) && Objects.equals(this.recipient, that.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyAgreementAlgorithm, publicKey, recipient);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeriveSharedSecretRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyAgreementAlgorithm: ").append(toIndentedString(keyAgreementAlgorithm)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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
