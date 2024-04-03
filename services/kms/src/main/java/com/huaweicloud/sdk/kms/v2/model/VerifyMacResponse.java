package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class VerifyMacResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_algorithm")

    private String macAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_valid")

    private Boolean macValid;

    public VerifyMacResponse withKeyId(String keyId) {
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

    public VerifyMacResponse withMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        return this;
    }

    /**
     * MAC算法
     * @return macAlgorithm
     */
    public String getMacAlgorithm() {
        return macAlgorithm;
    }

    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    public VerifyMacResponse withMacValid(Boolean macValid) {
        this.macValid = macValid;
        return this;
    }

    /**
     * 消息验证码校验结果
     * @return macValid
     */
    public Boolean getMacValid() {
        return macValid;
    }

    public void setMacValid(Boolean macValid) {
        this.macValid = macValid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerifyMacResponse that = (VerifyMacResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.macAlgorithm, that.macAlgorithm)
            && Objects.equals(this.macValid, that.macValid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, macAlgorithm, macValid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyMacResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    macAlgorithm: ").append(toIndentedString(macAlgorithm)).append("\n");
        sb.append("    macValid: ").append(toIndentedString(macValid)).append("\n");
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
