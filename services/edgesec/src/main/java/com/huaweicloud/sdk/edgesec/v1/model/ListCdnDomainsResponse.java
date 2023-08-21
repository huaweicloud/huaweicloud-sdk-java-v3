package com.huaweicloud.sdk.edgesec.v1.model;

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
public class ListCdnDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<ShowCdnDomainResponseBody> domains = null;

    public ListCdnDomainsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 全部CDN域名的数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCdnDomainsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询结果CDN域名的数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListCdnDomainsResponse withDomains(List<ShowCdnDomainResponseBody> domains) {
        this.domains = domains;
        return this;
    }

    public ListCdnDomainsResponse addDomainsItem(ShowCdnDomainResponseBody domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public ListCdnDomainsResponse withDomains(Consumer<List<ShowCdnDomainResponseBody>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 详细的CDN域名信息
     * @return domains
     */
    public List<ShowCdnDomainResponseBody> getDomains() {
        return domains;
    }

    public void setDomains(List<ShowCdnDomainResponseBody> domains) {
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
        ListCdnDomainsResponse that = (ListCdnDomainsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.count, that.count)
            && Objects.equals(this.domains, that.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, count, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnDomainsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
