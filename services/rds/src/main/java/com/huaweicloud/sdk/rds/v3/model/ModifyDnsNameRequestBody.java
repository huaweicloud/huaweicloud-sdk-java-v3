package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ModifyDnsNameRequestBody
 */
public class ModifyDnsNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_name")

    @JacksonXmlProperty(localName = "dns_name")

    private String dnsName;

    public ModifyDnsNameRequestBody withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * 新域名的前缀，校验规则是^[0-9a-zA-Z]{8,64}$
     * @return dnsName
     */
    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyDnsNameRequestBody modifyDnsNameRequestBody = (ModifyDnsNameRequestBody) o;
        return Objects.equals(this.dnsName, modifyDnsNameRequestBody.dnsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDnsNameRequestBody {\n");
        sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
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
