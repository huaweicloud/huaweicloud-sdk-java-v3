package com.huaweicloud.sdk.edgesec.v2.model;

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
public class ShowDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_used_quota")

    private Long domainUsedQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_list")

    private List<DomainInfo> domainList = null;

    public ShowDomainsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 全部防护域名的数量
     * minimum: 0
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ShowDomainsResponse withDomainUsedQuota(Long domainUsedQuota) {
        this.domainUsedQuota = domainUsedQuota;
        return this;
    }

    /**
     * 域名已使用配额
     * minimum: 0
     * @return domainUsedQuota
     */
    public Long getDomainUsedQuota() {
        return domainUsedQuota;
    }

    public void setDomainUsedQuota(Long domainUsedQuota) {
        this.domainUsedQuota = domainUsedQuota;
    }

    public ShowDomainsResponse withDomainList(List<DomainInfo> domainList) {
        this.domainList = domainList;
        return this;
    }

    public ShowDomainsResponse addDomainListItem(DomainInfo domainListItem) {
        if (this.domainList == null) {
            this.domainList = new ArrayList<>();
        }
        this.domainList.add(domainListItem);
        return this;
    }

    public ShowDomainsResponse withDomainList(Consumer<List<DomainInfo>> domainListSetter) {
        if (this.domainList == null) {
            this.domainList = new ArrayList<>();
        }
        domainListSetter.accept(this.domainList);
        return this;
    }

    /**
     * 详细的防护域名信息
     * @return domainList
     */
    public List<DomainInfo> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<DomainInfo> domainList) {
        this.domainList = domainList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainsResponse that = (ShowDomainsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.domainUsedQuota, that.domainUsedQuota)
            && Objects.equals(this.domainList, that.domainList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, domainUsedQuota, domainList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    domainUsedQuota: ").append(toIndentedString(domainUsedQuota)).append("\n");
        sb.append("    domainList: ").append(toIndentedString(domainList)).append("\n");
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
