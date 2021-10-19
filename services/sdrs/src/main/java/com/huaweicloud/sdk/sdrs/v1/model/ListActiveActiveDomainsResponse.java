package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListActiveActiveDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<ShowActiveActiveDomainParams> domains = null;

    public ListActiveActiveDomainsResponse withDomains(List<ShowActiveActiveDomainParams> domains) {
        this.domains = domains;
        return this;
    }

    public ListActiveActiveDomainsResponse addDomainsItem(ShowActiveActiveDomainParams domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public ListActiveActiveDomainsResponse withDomains(Consumer<List<ShowActiveActiveDomainParams>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /** 双活域列表信息。
     * 
     * @return domains */
    public List<ShowActiveActiveDomainParams> getDomains() {
        return domains;
    }

    public void setDomains(List<ShowActiveActiveDomainParams> domains) {
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
        ListActiveActiveDomainsResponse listActiveActiveDomainsResponse = (ListActiveActiveDomainsResponse) o;
        return Objects.equals(this.domains, listActiveActiveDomainsResponse.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListActiveActiveDomainsResponse {\n");
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
