package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_level_domain_num")

    @JacksonXmlProperty(localName = "top_level_domain_num")

    private Integer topLevelDomainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    @JacksonXmlProperty(localName = "domains")

    private List<DomainItem> domains = null;

    public ListDomainsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 域名总数
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDomainsResponse withTopLevelDomainNum(Integer topLevelDomainNum) {
        this.topLevelDomainNum = topLevelDomainNum;
        return this;
    }

    /**
     * 一级域名总数
     * minimum: 0
     * maximum: 1000
     * @return topLevelDomainNum
     */
    public Integer getTopLevelDomainNum() {
        return topLevelDomainNum;
    }

    public void setTopLevelDomainNum(Integer topLevelDomainNum) {
        this.topLevelDomainNum = topLevelDomainNum;
    }

    public ListDomainsResponse withDomains(List<DomainItem> domains) {
        this.domains = domains;
        return this;
    }

    public ListDomainsResponse addDomainsItem(DomainItem domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public ListDomainsResponse withDomains(Consumer<List<DomainItem>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 域名列表
     * @return domains
     */
    public List<DomainItem> getDomains() {
        return domains;
    }

    public void setDomains(List<DomainItem> domains) {
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
        ListDomainsResponse listDomainsResponse = (ListDomainsResponse) o;
        return Objects.equals(this.total, listDomainsResponse.total)
            && Objects.equals(this.topLevelDomainNum, listDomainsResponse.topLevelDomainNum)
            && Objects.equals(this.domains, listDomainsResponse.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, topLevelDomainNum, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    topLevelDomainNum: ").append(toIndentedString(topLevelDomainNum)).append("\n");
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
