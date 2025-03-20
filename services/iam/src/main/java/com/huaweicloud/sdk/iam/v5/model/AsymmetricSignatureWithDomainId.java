package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 账号非对称签名开关信息。
 */
public class AsymmetricSignatureWithDomainId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asymmetric_signature_switch")

    private Boolean asymmetricSignatureSwitch;

    public AsymmetricSignatureWithDomainId withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AsymmetricSignatureWithDomainId withAsymmetricSignatureSwitch(Boolean asymmetricSignatureSwitch) {
        this.asymmetricSignatureSwitch = asymmetricSignatureSwitch;
        return this;
    }

    /**
     * 凭证非对称签名开关。
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
        AsymmetricSignatureWithDomainId that = (AsymmetricSignatureWithDomainId) obj;
        return Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.asymmetricSignatureSwitch, that.asymmetricSignatureSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, asymmetricSignatureSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsymmetricSignatureWithDomainId {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
