package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DNS配置结果集
 */
public class DnsMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns")

    private List<DnsMappingNode> dns = null;

    public DnsMapping withDns(List<DnsMappingNode> dns) {
        this.dns = dns;
        return this;
    }

    public DnsMapping addDnsItem(DnsMappingNode dnsItem) {
        if (this.dns == null) {
            this.dns = new ArrayList<>();
        }
        this.dns.add(dnsItem);
        return this;
    }

    public DnsMapping withDns(Consumer<List<DnsMappingNode>> dnsSetter) {
        if (this.dns == null) {
            this.dns = new ArrayList<>();
        }
        dnsSetter.accept(this.dns);
        return this;
    }

    /**
     * Get dns
     * @return dns
     */
    public List<DnsMappingNode> getDns() {
        return dns;
    }

    public void setDns(List<DnsMappingNode> dns) {
        this.dns = dns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DnsMapping that = (DnsMapping) obj;
        return Objects.equals(this.dns, that.dns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsMapping {\n");
        sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
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
