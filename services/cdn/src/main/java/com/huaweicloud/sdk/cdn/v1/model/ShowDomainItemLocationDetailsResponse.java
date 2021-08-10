package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowDomainItemLocationDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<DomainItemLocationDetails> domains = null;

    public ShowDomainItemLocationDetailsResponse withDomains(List<DomainItemLocationDetails> domains) {
        this.domains = domains;
        return this;
    }

    public ShowDomainItemLocationDetailsResponse addDomainsItem(DomainItemLocationDetails domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public ShowDomainItemLocationDetailsResponse withDomains(Consumer<List<DomainItemLocationDetails>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /** 域名详情数据列表
     * 
     * @return domains */
    public List<DomainItemLocationDetails> getDomains() {
        return domains;
    }

    public void setDomains(List<DomainItemLocationDetails> domains) {
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
        ShowDomainItemLocationDetailsResponse showDomainItemLocationDetailsResponse =
            (ShowDomainItemLocationDetailsResponse) o;
        return Objects.equals(this.domains, showDomainItemLocationDetailsResponse.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainItemLocationDetailsResponse {\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
