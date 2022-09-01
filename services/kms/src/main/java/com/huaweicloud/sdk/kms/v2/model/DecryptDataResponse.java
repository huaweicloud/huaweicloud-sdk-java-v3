package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DecryptDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    @JacksonXmlProperty(localName = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plain_text")

    @JacksonXmlProperty(localName = "plain_text")

    private String plainText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plain_text_base64")

    @JacksonXmlProperty(localName = "plain_text_base64")

    private String plainTextBase64;

    public DecryptDataResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 密钥ID。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public DecryptDataResponse withPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    /**
     * 明文。
     * @return plainText
     */
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public DecryptDataResponse withPlainTextBase64(String plainTextBase64) {
        this.plainTextBase64 = plainTextBase64;
        return this;
    }

    /**
     * 明文的Base64值，在非对称加密场景下，若加密的明文中含有不可见字符，则解密结果以该值为准。
     * @return plainTextBase64
     */
    public String getPlainTextBase64() {
        return plainTextBase64;
    }

    public void setPlainTextBase64(String plainTextBase64) {
        this.plainTextBase64 = plainTextBase64;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DecryptDataResponse decryptDataResponse = (DecryptDataResponse) o;
        return Objects.equals(this.keyId, decryptDataResponse.keyId)
            && Objects.equals(this.plainText, decryptDataResponse.plainText)
            && Objects.equals(this.plainTextBase64, decryptDataResponse.plainTextBase64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, plainText, plainTextBase64);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDataResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
        sb.append("    plainTextBase64: ").append(toIndentedString(plainTextBase64)).append("\n");
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
