package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateDnsNameRequestBody */
public class CreateDnsNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_type")

    private String dnsType;

    public CreateDnsNameRequestBody withDnsType(String dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /** 域名类型，当前只支持private
     * 
     * @return dnsType */
    public String getDnsType() {
        return dnsType;
    }

    public void setDnsType(String dnsType) {
        this.dnsType = dnsType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDnsNameRequestBody createDnsNameRequestBody = (CreateDnsNameRequestBody) o;
        return Objects.equals(this.dnsType, createDnsNameRequestBody.dnsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDnsNameRequestBody {\n");
        sb.append("    dnsType: ").append(toIndentedString(dnsType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
