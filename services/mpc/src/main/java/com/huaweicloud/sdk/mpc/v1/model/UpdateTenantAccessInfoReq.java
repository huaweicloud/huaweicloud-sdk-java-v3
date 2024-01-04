package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateTenantAccessInfoReq
 */
public class UpdateTenantAccessInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    private Boolean isOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_version")

    private Integer agreementVersion;

    public UpdateTenantAccessInfoReq withIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * 是否已开通服务 - false：未开通 - true：已开通 
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public UpdateTenantAccessInfoReq withAgreementVersion(Integer agreementVersion) {
        this.agreementVersion = agreementVersion;
        return this;
    }

    /**
     * 服务协议版本 
     * @return agreementVersion
     */
    public Integer getAgreementVersion() {
        return agreementVersion;
    }

    public void setAgreementVersion(Integer agreementVersion) {
        this.agreementVersion = agreementVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTenantAccessInfoReq that = (UpdateTenantAccessInfoReq) obj;
        return Objects.equals(this.isOpen, that.isOpen) && Objects.equals(this.agreementVersion, that.agreementVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen, agreementVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantAccessInfoReq {\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
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
