package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DecryptDatakeyRequestBody
 */
public class DecryptDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    @JacksonXmlProperty(localName = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_context")

    @JacksonXmlProperty(localName = "encryption_context")

    private Object encryptionContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    @JacksonXmlProperty(localName = "cipher_text")

    private String cipherText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_cipher_length")

    @JacksonXmlProperty(localName = "datakey_cipher_length")

    private String datakeyCipherLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    @JacksonXmlProperty(localName = "sequence")

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

    public DecryptDatakeyRequestBody withEncryptionContext(Object encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }

    /**
     * 一系列key-value键值对，用于记录资源上下文信息，用于保护数据的完整性，不应包含敏感信息，最大长度为8192。 当在加密时指定了该参数时，解密密文时，需要传入相同的参数，才能正确的解密。 例如：{\"Key1\":\"Value1\",\"Key2\":\"Value2\"}
     * @return encryptionContext
     */
    public Object getEncryptionContext() {
        return encryptionContext;
    }

    public void setEncryptionContext(Object encryptionContext) {
        this.encryptionContext = encryptionContext;
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DecryptDatakeyRequestBody decryptDatakeyRequestBody = (DecryptDatakeyRequestBody) o;
        return Objects.equals(this.keyId, decryptDatakeyRequestBody.keyId)
            && Objects.equals(this.encryptionContext, decryptDatakeyRequestBody.encryptionContext)
            && Objects.equals(this.cipherText, decryptDatakeyRequestBody.cipherText)
            && Objects.equals(this.datakeyCipherLength, decryptDatakeyRequestBody.datakeyCipherLength)
            && Objects.equals(this.sequence, decryptDatakeyRequestBody.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, encryptionContext, cipherText, datakeyCipherLength, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    encryptionContext: ").append(toIndentedString(encryptionContext)).append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
        sb.append("    datakeyCipherLength: ").append(toIndentedString(datakeyCipherLength)).append("\n");
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
