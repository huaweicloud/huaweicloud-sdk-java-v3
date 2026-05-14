package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeriveSharedSecretResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_agreement_algorithm")

    private String keyAgreementAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_secret")

    private String sharedSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphertext_recipient")

    private String ciphertextRecipient;

    public DeriveSharedSecretResponse withKeyId(String keyId) {
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

    public DeriveSharedSecretResponse withKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
        return this;
    }

    /**
     * 密钥协商算法
     * @return keyAgreementAlgorithm
     */
    public String getKeyAgreementAlgorithm() {
        return keyAgreementAlgorithm;
    }

    public void setKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
    }

    public DeriveSharedSecretResponse withSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
        return this;
    }

    /**
     * 由KMS私钥和您的对端公钥协商出的密钥，Base64格式，如果响应体包含了ciphertext_recipient，则不会包含shared_secret
     * @return sharedSecret
     */
    public String getSharedSecret() {
        return sharedSecret;
    }

    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    public DeriveSharedSecretResponse withCiphertextRecipient(String ciphertextRecipient) {
        this.ciphertextRecipient = ciphertextRecipient;
        return this;
    }

    /**
     * KMS私钥和您的对端公钥协商出的密钥经过擎天证明文档加密后的密文，密文仅能被机密环境中的私钥解密，指定擎天证明文档后，才会响应ciphertext_recipient，否则通过shared_secret响应明文的共享密钥
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
        DeriveSharedSecretResponse that = (DeriveSharedSecretResponse) obj;
        return Objects.equals(this.keyId, that.keyId)
            && Objects.equals(this.keyAgreementAlgorithm, that.keyAgreementAlgorithm)
            && Objects.equals(this.sharedSecret, that.sharedSecret)
            && Objects.equals(this.ciphertextRecipient, that.ciphertextRecipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyAgreementAlgorithm, sharedSecret, ciphertextRecipient);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeriveSharedSecretResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyAgreementAlgorithm: ").append(toIndentedString(keyAgreementAlgorithm)).append("\n");
        sb.append("    sharedSecret: ").append(toIndentedString(sharedSecret)).append("\n");
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
