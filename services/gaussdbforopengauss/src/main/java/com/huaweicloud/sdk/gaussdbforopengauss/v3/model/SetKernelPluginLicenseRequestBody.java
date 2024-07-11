package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetKernelPluginLicenseRequestBody
 */
public class SetKernelPluginLicenseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license_str")

    private String licenseStr;

    public SetKernelPluginLicenseRequestBody withLicenseStr(String licenseStr) {
        this.licenseStr = licenseStr;
        return this;
    }

    /**
     * license
     * @return licenseStr
     */
    public String getLicenseStr() {
        return licenseStr;
    }

    public void setLicenseStr(String licenseStr) {
        this.licenseStr = licenseStr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetKernelPluginLicenseRequestBody that = (SetKernelPluginLicenseRequestBody) obj;
        return Objects.equals(this.licenseStr, that.licenseStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licenseStr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetKernelPluginLicenseRequestBody {\n");
        sb.append("    licenseStr: ").append(toIndentedString(licenseStr)).append("\n");
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
