package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改内网域名
 */
public class ModifyDnsNameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_name")

    private String dnsName;

    public ModifyDnsNameReq withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * 新域名的前缀，取值范围如下：8~63个字符之间，可以包含小写字母、数字，不能包含其他特殊字符。
     * @return dnsName
     */
    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyDnsNameReq that = (ModifyDnsNameReq) obj;
        return Objects.equals(this.dnsName, that.dnsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDnsNameReq {\n");
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
