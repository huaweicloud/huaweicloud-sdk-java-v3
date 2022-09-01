package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 容器网络网段，指定cidrs字段使用时必填。
 */
public class ContainerCIDR {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    @JacksonXmlProperty(localName = "cidr")

    private String cidr;

    public ContainerCIDR withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 容器网络网段，建议使用网段10.0.0.0/12~19，172.16.0.0/16~19，192.168.0.0/16~19。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerCIDR containerCIDR = (ContainerCIDR) o;
        return Objects.equals(this.cidr, containerCIDR.cidr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerCIDR {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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
