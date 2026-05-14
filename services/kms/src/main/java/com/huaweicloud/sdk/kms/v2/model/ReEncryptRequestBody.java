package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重加密的请求体
 */
public class ReEncryptRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_key_id")

    private String sourceKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_additional_authenticated_data")

    private String sourceAdditionalAuthenticatedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_encryption_algorithm")

    private String sourceEncryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_key_id")

    private String destinationKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_additional_authenticated_data")

    private String destinationAdditionalAuthenticatedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_encryption_algorithm")

    private String destinationEncryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_cipher_length")

    private String datakeyCipherLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    private String cipherText;

    public ReEncryptRequestBody withSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }

    /**
     * 原密钥ID，用于解密密文。对于非对称密钥加密的密文source_key_id必填。对于对称密钥加密的密文，推荐填写source_key_id。kms会优先使用您填写的source_key_id进行解密。不填时会尝试从密文中解析出加密时使用的密钥ID进行解密。
     * @return sourceKeyId
     */
    public String getSourceKeyId() {
        return sourceKeyId;
    }

    public void setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
    }

    public ReEncryptRequestBody withSourceAdditionalAuthenticatedData(String sourceAdditionalAuthenticatedData) {
        this.sourceAdditionalAuthenticatedData = sourceAdditionalAuthenticatedData;
        return this;
    }

    /**
     * 加密原密文时使用的aad信息。如果加密时，没指定aad，则不能填写，否则会造成解密失败
     * @return sourceAdditionalAuthenticatedData
     */
    public String getSourceAdditionalAuthenticatedData() {
        return sourceAdditionalAuthenticatedData;
    }

    public void setSourceAdditionalAuthenticatedData(String sourceAdditionalAuthenticatedData) {
        this.sourceAdditionalAuthenticatedData = sourceAdditionalAuthenticatedData;
    }

    public ReEncryptRequestBody withSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
        return this;
    }

    /**
     * 加密原密文时使用的加密算法。默认值为“SYMMETRIC_DEFAULT”，合法枚举值如下： SYMMETRIC_DEFAULT RSAES_OAEP_SHA_1 RSAES_OAEP_SHA_256 SM2_ENCRYPT 注意：RSAES_OAEP_SHA_1已不再安全，请谨慎使用
     * @return sourceEncryptionAlgorithm
     */
    public String getSourceEncryptionAlgorithm() {
        return sourceEncryptionAlgorithm;
    }

    public void setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
    }

    public ReEncryptRequestBody withDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
        return this;
    }

    /**
     * 目的密钥ID,用于加密解密后的明文
     * @return destinationKeyId
     */
    public String getDestinationKeyId() {
        return destinationKeyId;
    }

    public void setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
    }

    public ReEncryptRequestBody withDestinationAdditionalAuthenticatedData(
        String destinationAdditionalAuthenticatedData) {
        this.destinationAdditionalAuthenticatedData = destinationAdditionalAuthenticatedData;
        return this;
    }

    /**
     * 如果指定了值，会在重加密时，作为aad参与计算
     * @return destinationAdditionalAuthenticatedData
     */
    public String getDestinationAdditionalAuthenticatedData() {
        return destinationAdditionalAuthenticatedData;
    }

    public void setDestinationAdditionalAuthenticatedData(String destinationAdditionalAuthenticatedData) {
        this.destinationAdditionalAuthenticatedData = destinationAdditionalAuthenticatedData;
    }

    public ReEncryptRequestBody withDestinationEncryptionAlgorithm(String destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm;
        return this;
    }

    /**
     * 重加密新密文时使用的加密算法。默认值为“SYMMETRIC_DEFAULT”，合法枚举值如下： SYMMETRIC_DEFAULT RSAES_OAEP_SHA_1 RSAES_OAEP_SHA_256 SM2_ENCRYPT 注意：RSAES_OAEP_SHA_1已不再安全，请谨慎使用
     * @return destinationEncryptionAlgorithm
     */
    public String getDestinationEncryptionAlgorithm() {
        return destinationEncryptionAlgorithm;
    }

    public void setDestinationEncryptionAlgorithm(String destinationEncryptionAlgorithm) {
        this.destinationEncryptionAlgorithm = destinationEncryptionAlgorithm;
    }

    public ReEncryptRequestBody withDatakeyCipherLength(String datakeyCipherLength) {
        this.datakeyCipherLength = datakeyCipherLength;
        return this;
    }

    /**
     * 当密文是CBC 模式加密的 数据密钥时，需要指定datakey_cipher_length。表示明文密钥材料的字节数
     * @return datakeyCipherLength
     */
    public String getDatakeyCipherLength() {
        return datakeyCipherLength;
    }

    public void setDatakeyCipherLength(String datakeyCipherLength) {
        this.datakeyCipherLength = datakeyCipherLength;
    }

    public ReEncryptRequestBody withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    /**
     * 需要进行重加密的密文。
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
        ReEncryptRequestBody that = (ReEncryptRequestBody) obj;
        return Objects.equals(this.sourceKeyId, that.sourceKeyId)
            && Objects.equals(this.sourceAdditionalAuthenticatedData, that.sourceAdditionalAuthenticatedData)
            && Objects.equals(this.sourceEncryptionAlgorithm, that.sourceEncryptionAlgorithm)
            && Objects.equals(this.destinationKeyId, that.destinationKeyId)
            && Objects.equals(this.destinationAdditionalAuthenticatedData, that.destinationAdditionalAuthenticatedData)
            && Objects.equals(this.destinationEncryptionAlgorithm, that.destinationEncryptionAlgorithm)
            && Objects.equals(this.datakeyCipherLength, that.datakeyCipherLength)
            && Objects.equals(this.cipherText, that.cipherText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceKeyId,
            sourceAdditionalAuthenticatedData,
            sourceEncryptionAlgorithm,
            destinationKeyId,
            destinationAdditionalAuthenticatedData,
            destinationEncryptionAlgorithm,
            datakeyCipherLength,
            cipherText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReEncryptRequestBody {\n");
        sb.append("    sourceKeyId: ").append(toIndentedString(sourceKeyId)).append("\n");
        sb.append("    sourceAdditionalAuthenticatedData: ")
            .append(toIndentedString(sourceAdditionalAuthenticatedData))
            .append("\n");
        sb.append("    sourceEncryptionAlgorithm: ").append(toIndentedString(sourceEncryptionAlgorithm)).append("\n");
        sb.append("    destinationKeyId: ").append(toIndentedString(destinationKeyId)).append("\n");
        sb.append("    destinationAdditionalAuthenticatedData: ")
            .append(toIndentedString(destinationAdditionalAuthenticatedData))
            .append("\n");
        sb.append("    destinationEncryptionAlgorithm: ")
            .append(toIndentedString(destinationEncryptionAlgorithm))
            .append("\n");
        sb.append("    datakeyCipherLength: ").append(toIndentedString(datakeyCipherLength)).append("\n");
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
