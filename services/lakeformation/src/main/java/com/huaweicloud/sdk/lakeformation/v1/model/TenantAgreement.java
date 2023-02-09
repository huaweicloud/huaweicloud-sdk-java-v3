package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户协议
 */
public class TenantAgreement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_name")

    private String agreementName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_version")

    private String agreementVersion;

    public TenantAgreement withAgreementName(String agreementName) {
        this.agreementName = agreementName;
        return this;
    }

    /**
     * 协议名称
     * @return agreementName
     */
    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public TenantAgreement withAgreementVersion(String agreementVersion) {
        this.agreementVersion = agreementVersion;
        return this;
    }

    /**
     * 协议版本号
     * @return agreementVersion
     */
    public String getAgreementVersion() {
        return agreementVersion;
    }

    public void setAgreementVersion(String agreementVersion) {
        this.agreementVersion = agreementVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantAgreement tenantAgreement = (TenantAgreement) o;
        return Objects.equals(this.agreementName, tenantAgreement.agreementName)
            && Objects.equals(this.agreementVersion, tenantAgreement.agreementVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementName, agreementVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantAgreement {\n");
        sb.append("    agreementName: ").append(toIndentedString(agreementName)).append("\n");
        sb.append("    agreementVersion: ").append(toIndentedString(agreementVersion)).append("\n");
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
