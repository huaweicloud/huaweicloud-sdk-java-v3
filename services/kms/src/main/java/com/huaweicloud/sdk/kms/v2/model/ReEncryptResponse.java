package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ReEncryptResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_key_id")

    private String sourceKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_encryption_algorithm")

    private String sourceEncryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_encryption_algorithm")

    private String destinationEncryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    private String cipherText;

    public ReEncryptResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 重新加密时使用的密钥ID
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public ReEncryptResponse withSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }

    /**
     * 加密原密文时使用的密钥ID
     * @return sourceKeyId
     */
    public String getSourceKeyId() {
        return sourceKeyId;
    }

    public void setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
    }

    public ReEncryptResponse withSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
        return this;
    }

    /**
     * 原密文加密时使用的加密算法
     * @return sourceEncryptionAlgorithm
     */
    public String getSourceEncryptionAlgorithm() {
        return sourceEncryptionAlgorithm;
    }

    public void setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
    }

    public ReEncryptResponse withDestinationEncryptionAlgorithm(String destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm;
        return this;
    }

    /**
     * 重新加密时使用的加密算法
     * @return destinationEncryptionAlgorithm
     */
    public String getDestinationEncryptionAlgorithm() {
        return destinationEncryptionAlgorithm;
    }

    public void setDestinationEncryptionAlgorithm(String destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm;
    }

    public ReEncryptResponse withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    /**
     * 重新加密后的密文
     * @return cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReEncryptResponse that = (ReEncryptResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.sourceKeyId, that.sourceKeyId)
            && Objects.equals(this.sourceEncryptionAlgorithm, that.sourceEncryptionAlgorithm)
            && Objects.equals(this.destinationEncryptionAlgorithm, that.destinationEncryptionAlgorithm)
            && Objects.equals(this.cipherText, that.cipherText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, sourceKeyId, sourceEncryptionAlgorithm, destinationEncryptionAlgorithm, cipherText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReEncryptResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    sourceKeyId: ").append(toIndentedString(sourceKeyId)).append("\n");
        sb.append("    sourceEncryptionAlgorithm: ").append(toIndentedString(sourceEncryptionAlgorithm)).append("\n");
        sb.append("    destinationEncryptionAlgorithm: ")
            .append(toIndentedString(destinationEncryptionAlgorithm))
            .append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
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
