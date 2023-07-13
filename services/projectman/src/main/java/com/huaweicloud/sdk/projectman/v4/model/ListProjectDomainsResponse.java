package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProjectDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<CreateProjectDomainResponseBody> domains = null;

    public ListProjectDomainsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 领域总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListProjectDomainsResponse withDomains(List<CreateProjectDomainResponseBody> domains) {
        this.domains = domains;
        return this;
    }

    public ListProjectDomainsResponse addDomainsItem(CreateProjectDomainResponseBody domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public ListProjectDomainsResponse withDomains(Consumer<List<CreateProjectDomainResponseBody>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 领域列表
     * @return domains
     */
    public List<CreateProjectDomainResponseBody> getDomains() {
        return domains;
    }

    public void setDomains(List<CreateProjectDomainResponseBody> domains) {
        this.domains = domains;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectDomainsResponse that = (ListProjectDomainsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.domains, that.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectDomainsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
