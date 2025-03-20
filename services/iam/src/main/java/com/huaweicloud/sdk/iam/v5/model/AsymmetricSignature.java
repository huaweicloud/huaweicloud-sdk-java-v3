package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置账号是否开启非对称签名功能。
 */
public class AsymmetricSignature {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asymmetric_signature_switch")

    private Boolean asymmetricSignatureSwitch;

    public AsymmetricSignature withAsymmetricSignatureSwitch(Boolean asymmetricSignatureSwitch) {
        this.asymmetricSignatureSwitch = asymmetricSignatureSwitch;
        return this;
    }

    /**
     * 非对称签名开关。
     * @return asymmetricSignatureSwitch
     */
    public Boolean getAsymmetricSignatureSwitch() {
        return asymmetricSignatureSwitch;
    }

    public void setAsymmetricSignatureSwitch(Boolean asymmetricSignatureSwitch) {
        this.asymmetricSignatureSwitch = asymmetricSignatureSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsymmetricSignature that = (AsymmetricSignature) obj;
        return Objects.equals(this.asymmetricSignatureSwitch, that.asymmetricSignatureSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asymmetricSignatureSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsymmetricSignature {\n");
        sb.append("    asymmetricSignatureSwitch: ").append(toIndentedString(asymmetricSignatureSwitch)).append("\n");
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
