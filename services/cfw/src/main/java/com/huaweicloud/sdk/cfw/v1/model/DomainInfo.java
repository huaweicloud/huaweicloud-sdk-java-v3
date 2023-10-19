package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainInfo
 */
public class DomainInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_address_id")

    private String domainAddressId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_ips")

    private List<String> dnsIps = null;

    public DomainInfo withDomainAddressId(String domainAddressId) {
        this.domainAddressId = domainAddressId;
        return this;
    }

    /**
     * 域名地址id
     * @return domainAddressId
     */
    public String getDomainAddressId() {
        return domainAddressId;
    }

    public void setDomainAddressId(String domainAddressId) {
        this.domainAddressId = domainAddressId;
    }

    public DomainInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DomainInfo withDnsIps(List<String> dnsIps) {
        this.dnsIps = dnsIps;
        return this;
    }

    public DomainInfo addDnsIpsItem(String dnsIpsItem) {
        if (this.dnsIps == null) {
            this.dnsIps = new ArrayList<>();
        }
        this.dnsIps.add(dnsIpsItem);
        return this;
    }

    public DomainInfo withDnsIps(Consumer<List<String>> dnsIpsSetter) {
        if (this.dnsIps == null) {
            this.dnsIps = new ArrayList<>();
        }
        dnsIpsSetter.accept(this.dnsIps);
        return this;
    }

    /**
     * 域名服务器列表
     * @return dnsIps
     */
    public List<String> getDnsIps() {
        return dnsIps;
    }

    public void setDnsIps(List<String> dnsIps) {
        this.dnsIps = dnsIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainInfo that = (DomainInfo) obj;
        return Objects.equals(this.domainAddressId, that.domainAddressId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.dnsIps, that.dnsIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainAddressId, domainName, description, dnsIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainInfo {\n");
        sb.append("    domainAddressId: ").append(toIndentedString(domainAddressId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsIps: ").append(toIndentedString(dnsIps)).append("\n");
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
