package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DecryptDatakeyCapsuleRequestBody
 */
public class DecryptDatakeyCapsuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_capsule")

    private String datakeyCapsule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attestation_document")

    private DecryptDatakeyCapsuleRequestBodyAttestationDocument attestationDocument;

    public DecryptDatakeyCapsuleRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释：** 密钥ID **约束限制：** UUID格式，满足正则表达式^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$ **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public DecryptDatakeyCapsuleRequestBody withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * **参数解释：** 公钥信息，使用RSAES_OAEP_SHA_256算法加密；如果传递了public_key，KMS会使用该公钥对明文数据密钥进行加密，并返回加密后的数据密钥 **约束限制：** 仅支持RSA公钥 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public DecryptDatakeyCapsuleRequestBody withDatakeyCapsule(String datakeyCapsule) {
        this.datakeyCapsule = datakeyCapsule;
        return this;
    }

    /**
     * **参数解释：** 密钥胶囊 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return datakeyCapsule
     */
    public String getDatakeyCapsule() {
        return datakeyCapsule;
    }

    public void setDatakeyCapsule(String datakeyCapsule) {
        this.datakeyCapsule = datakeyCapsule;
    }

    public DecryptDatakeyCapsuleRequestBody withAttestationDocument(
        DecryptDatakeyCapsuleRequestBodyAttestationDocument attestationDocument) {
        this.attestationDocument = attestationDocument;
        return this;
    }

    public DecryptDatakeyCapsuleRequestBody withAttestationDocument(
        Consumer<DecryptDatakeyCapsuleRequestBodyAttestationDocument> attestationDocumentSetter) {
        if (this.attestationDocument == null) {
            this.attestationDocument = new DecryptDatakeyCapsuleRequestBodyAttestationDocument();
            attestationDocumentSetter.accept(this.attestationDocument);
        }

        return this;
    }

    /**
     * Get attestationDocument
     * @return attestationDocument
     */
    public DecryptDatakeyCapsuleRequestBodyAttestationDocument getAttestationDocument() {
        return attestationDocument;
    }

    public void setAttestationDocument(DecryptDatakeyCapsuleRequestBodyAttestationDocument attestationDocument) {
        this.attestationDocument = attestationDocument;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecryptDatakeyCapsuleRequestBody that = (DecryptDatakeyCapsuleRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.publicKey, that.publicKey)
            && Objects.equals(this.datakeyCapsule, that.datakeyCapsule)
            && Objects.equals(this.attestationDocument, that.attestationDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, publicKey, datakeyCapsule, attestationDocument);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyCapsuleRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    datakeyCapsule: ").append(toIndentedString(datakeyCapsule)).append("\n");
        sb.append("    attestationDocument: ").append(toIndentedString(attestationDocument)).append("\n");
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
