package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class EncryptDatakeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    private String cipherText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_length")

    private String datakeyLength;

    public EncryptDatakeyResponse withKeyId(String keyId) {
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

    public EncryptDatakeyResponse withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    /**
     * DEK密文16进制，两位表示1byte。
     * @return cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public EncryptDatakeyResponse withDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
        return this;
    }

    /**
     * DEK字节长度。
     * @return datakeyLength
     */
    public String getDatakeyLength() {
        return datakeyLength;
    }

    public void setDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptDatakeyResponse that = (EncryptDatakeyResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.cipherText, that.cipherText)
            && Objects.equals(this.datakeyLength, that.datakeyLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, cipherText, datakeyLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDatakeyResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
        sb.append("    datakeyLength: ").append(toIndentedString(datakeyLength)).append("\n");
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
