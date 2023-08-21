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
public class ListEdgeWafDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_list")

    private List<ShowWafDomainResponseBody> domainList = null;

    public ListEdgeWafDomainsResponse withTotal(Long total) {
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

    public ListEdgeWafDomainsResponse withDomainList(List<ShowWafDomainResponseBody> domainList) {
        this.domainList = domainList;
        return this;
    }

    public ListEdgeWafDomainsResponse addDomainListItem(ShowWafDomainResponseBody domainListItem) {
        if (this.domainList == null) {
            this.domainList = new ArrayList<>();
        }
        this.domainList.add(domainListItem);
        return this;
    }

    public ListEdgeWafDomainsResponse withDomainList(Consumer<List<ShowWafDomainResponseBody>> domainListSetter) {
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
    public List<ShowWafDomainResponseBody> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<ShowWafDomainResponseBody> domainList) {
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
        ListEdgeWafDomainsResponse that = (ListEdgeWafDomainsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.domainList, that.domainList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, domainList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeWafDomainsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
