package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 供应商
 */
public class OcaIpVendor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_xc")

    private Boolean isXc;

    public OcaIpVendor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 供应名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OcaIpVendor withIsXc(Boolean isXc) {
        this.isXc = isXc;
        return this;
    }

    /**
     * 供应商是否是国产
     * @return isXc
     */
    public Boolean getIsXc() {
        return isXc;
    }

    public void setIsXc(Boolean isXc) {
        this.isXc = isXc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OcaIpVendor that = (OcaIpVendor) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.isXc, that.isXc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isXc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OcaIpVendor {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isXc: ").append(toIndentedString(isXc)).append("\n");
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
