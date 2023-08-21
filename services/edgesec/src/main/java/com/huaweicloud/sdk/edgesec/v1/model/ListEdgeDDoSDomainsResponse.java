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
public class ListEdgeDDoSDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_list")

    private List<EdgeDDoSDomainVo> domainList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListEdgeDDoSDomainsResponse withDomainList(List<EdgeDDoSDomainVo> domainList) {
        this.domainList = domainList;
        return this;
    }

    public ListEdgeDDoSDomainsResponse addDomainListItem(EdgeDDoSDomainVo domainListItem) {
        if (this.domainList == null) {
            this.domainList = new ArrayList<>();
        }
        this.domainList.add(domainListItem);
        return this;
    }

    public ListEdgeDDoSDomainsResponse withDomainList(Consumer<List<EdgeDDoSDomainVo>> domainListSetter) {
        if (this.domainList == null) {
            this.domainList = new ArrayList<>();
        }
        domainListSetter.accept(this.domainList);
        return this;
    }

    /**
     * 域名列表
     * @return domainList
     */
    public List<EdgeDDoSDomainVo> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<EdgeDDoSDomainVo> domainList) {
        this.domainList = domainList;
    }

    public ListEdgeDDoSDomainsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 域名总条目
     * minimum: 0
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgeDDoSDomainsResponse that = (ListEdgeDDoSDomainsResponse) obj;
        return Objects.equals(this.domainList, that.domainList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeDDoSDomainsResponse {\n");
        sb.append("    domainList: ").append(toIndentedString(domainList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
