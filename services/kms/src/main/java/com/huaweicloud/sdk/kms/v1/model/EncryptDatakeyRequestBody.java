package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EncryptDatakeyRequestBody
 */
public class EncryptDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_context")

    private Object encryptionContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plain_text")

    private String plainText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_plain_length")

    private String datakeyPlainLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public EncryptDatakeyRequestBody withKeyId(String keyId) {
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

    public EncryptDatakeyRequestBody withEncryptionContext(Object encryptionContext) {
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

    public EncryptDatakeyRequestBody withPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    /**
     * DEK明文和DEK明文的SHA256（32字节），均为16进制字符串表示。 DEK明文（64字节）和DEK明文的SHA256（32字节），均为16进制字符串表示
     * @return plainText
     */
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public EncryptDatakeyRequestBody withDatakeyPlainLength(String datakeyPlainLength) {
        this.datakeyPlainLength = datakeyPlainLength;
        return this;
    }

    /**
     * DEK明文字节长度，取值范围为1~1024。 DEK明文字节长度，取值为“64”。
     * @return datakeyPlainLength
     */
    public String getDatakeyPlainLength() {
        return datakeyPlainLength;
    }

    public void setDatakeyPlainLength(String datakeyPlainLength) {
        this.datakeyPlainLength = datakeyPlainLength;
    }

    public EncryptDatakeyRequestBody withSequence(String sequence) {
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
        EncryptDatakeyRequestBody encryptDatakeyRequestBody = (EncryptDatakeyRequestBody) o;
        return Objects.equals(this.keyId, encryptDatakeyRequestBody.keyId)
            && Objects.equals(this.encryptionContext, encryptDatakeyRequestBody.encryptionContext)
            && Objects.equals(this.plainText, encryptDatakeyRequestBody.plainText)
            && Objects.equals(this.datakeyPlainLength, encryptDatakeyRequestBody.datakeyPlainLength)
            && Objects.equals(this.sequence, encryptDatakeyRequestBody.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, encryptionContext, plainText, datakeyPlainLength, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    encryptionContext: ").append(toIndentedString(encryptionContext)).append("\n");
        sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
        sb.append("    datakeyPlainLength: ").append(toIndentedString(datakeyPlainLength)).append("\n");
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
