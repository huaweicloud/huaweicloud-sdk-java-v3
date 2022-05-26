package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ValidateSignatureResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_valid")

    private String signatureValid;

    public ValidateSignatureResponse withKeyId(String keyId) {
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

    public ValidateSignatureResponse withSignatureValid(String signatureValid) {
        this.signatureValid = signatureValid;
        return this;
    }

    /**
     * 签名验证合法性，“true”表示验证签名合法，“false”表示验证签名非法。
     * @return signatureValid
     */
    public String getSignatureValid() {
        return signatureValid;
    }

    public void setSignatureValid(String signatureValid) {
        this.signatureValid = signatureValid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidateSignatureResponse validateSignatureResponse = (ValidateSignatureResponse) o;
        return Objects.equals(this.keyId, validateSignatureResponse.keyId)
            && Objects.equals(this.signatureValid, validateSignatureResponse.signatureValid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, signatureValid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateSignatureResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    signatureValid: ").append(toIndentedString(signatureValid)).append("\n");
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
