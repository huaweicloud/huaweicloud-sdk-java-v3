package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 擎天机密计算请求体
 */
public class Recipient {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attestation_document")

    private String attestationDocument;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_encryption_algorithm")

    private String keyEncryptionAlgorithm;

    public Recipient withAttestationDocument(String attestationDocument) {
        this.attestationDocument = attestationDocument;
        return this;
    }

    /**
     * 擎天机密计算证明文档
     * @return attestationDocument
     */
    public String getAttestationDocument() {
        return attestationDocument;
    }

    public void setAttestationDocument(String attestationDocument) {
        this.attestationDocument = attestationDocument;
    }

    public Recipient withKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
        return this;
    }

    /**
     * 指定加密算法，仅支持RSAES_OAEP_SHA_256
     * @return keyEncryptionAlgorithm
     */
    public String getKeyEncryptionAlgorithm() {
        return keyEncryptionAlgorithm;
    }

    public void setKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Recipient that = (Recipient) obj;
        return Objects.equals(this.attestationDocument, that.attestationDocument)
            && Objects.equals(this.keyEncryptionAlgorithm, that.keyEncryptionAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attestationDocument, keyEncryptionAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Recipient {\n");
        sb.append("    attestationDocument: ").append(toIndentedString(attestationDocument)).append("\n");
        sb.append("    keyEncryptionAlgorithm: ").append(toIndentedString(keyEncryptionAlgorithm)).append("\n");
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
