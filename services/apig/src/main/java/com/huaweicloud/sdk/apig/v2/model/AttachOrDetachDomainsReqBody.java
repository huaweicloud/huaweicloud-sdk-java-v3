package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 证书批量绑定或解绑域名请求体
 */
public class AttachOrDetachDomainsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<AttachOrDetachDomainInfo> domains = null;

    public AttachOrDetachDomainsReqBody withDomains(List<AttachOrDetachDomainInfo> domains) {
        this.domains = domains;
        return this;
    }

    public AttachOrDetachDomainsReqBody addDomainsItem(AttachOrDetachDomainInfo domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public AttachOrDetachDomainsReqBody withDomains(Consumer<List<AttachOrDetachDomainInfo>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 证书绑定或解绑域名列表
     * @return domains
     */
    public List<AttachOrDetachDomainInfo> getDomains() {
        return domains;
    }

    public void setDomains(List<AttachOrDetachDomainInfo> domains) {
        this.domains = domains;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttachOrDetachDomainsReqBody attachOrDetachDomainsReqBody = (AttachOrDetachDomainsReqBody) o;
        return Objects.equals(this.domains, attachOrDetachDomainsReqBody.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachOrDetachDomainsReqBody {\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
