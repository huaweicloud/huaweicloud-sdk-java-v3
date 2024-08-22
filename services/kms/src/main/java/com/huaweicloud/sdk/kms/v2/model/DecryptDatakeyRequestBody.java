package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DecryptDatakeyRequestBody
 */
public class DecryptDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    private String cipherText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_cipher_length")

    private String datakeyCipherLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_authenticated_data")

    private String additionalAuthenticatedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public DecryptDatakeyRequestBody withKeyId(String keyId) {
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

    public DecryptDatakeyRequestBody withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    /**
     * DEK密文及元数据的16进制字符串。取值为加密数据密钥结果中的cipher_text的值。
     * @return cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public DecryptDatakeyRequestBody withDatakeyCipherLength(String datakeyCipherLength) {
        this.datakeyCipherLength = datakeyCipherLength;
        return this;
    }

    /**
     * 密钥字节长度，取值范围为1~1024。 密钥字节长度，取值为“64”。
     * @return datakeyCipherLength
     */
    public String getDatakeyCipherLength() {
        return datakeyCipherLength;
    }

    public void setDatakeyCipherLength(String datakeyCipherLength) {
        this.datakeyCipherLength = datakeyCipherLength;
    }

    public DecryptDatakeyRequestBody withAdditionalAuthenticatedData(String additionalAuthenticatedData) {
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

    public DecryptDatakeyRequestBody withSequence(String sequence) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecryptDatakeyRequestBody that = (DecryptDatakeyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.cipherText, that.cipherText)
            && Objects.equals(this.datakeyCipherLength, that.datakeyCipherLength)
            && Objects.equals(this.additionalAuthenticatedData, that.additionalAuthenticatedData)
            && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, cipherText, datakeyCipherLength, additionalAuthenticatedData, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
        sb.append("    datakeyCipherLength: ").append(toIndentedString(datakeyCipherLength)).append("\n");
        sb.append("    additionalAuthenticatedData: ")
            .append(toIndentedString(additionalAuthenticatedData))
            .append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
