package com.huaweicloud.sdk.apig.v2.model;

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
public class ListCustomIngressPortDomainsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_infos")

    private List<PortBindingDomainInfo> domainInfos = null;

    public ListCustomIngressPortDomainsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCustomIngressPortDomainsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListCustomIngressPortDomainsResponse withDomainInfos(List<PortBindingDomainInfo> domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }

    public ListCustomIngressPortDomainsResponse addDomainInfosItem(PortBindingDomainInfo domainInfosItem) {
        if (this.domainInfos == null) {
            this.domainInfos = new ArrayList<>();
        }
        this.domainInfos.add(domainInfosItem);
        return this;
    }

    public ListCustomIngressPortDomainsResponse withDomainInfos(
        Consumer<List<PortBindingDomainInfo>> domainInfosSetter) {
        if (this.domainInfos == null) {
            this.domainInfos = new ArrayList<>();
        }
        domainInfosSetter.accept(this.domainInfos);
        return this;
    }

    /**
     * 入方向端口绑定的域名信息列表。
     * @return domainInfos
     */
    public List<PortBindingDomainInfo> getDomainInfos() {
        return domainInfos;
    }

    public void setDomainInfos(List<PortBindingDomainInfo> domainInfos) {
        this.domainInfos = domainInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomIngressPortDomainsResponse that = (ListCustomIngressPortDomainsResponse) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.domainInfos, that.domainInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, domainInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomIngressPortDomainsResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    domainInfos: ").append(toIndentedString(domainInfos)).append("\n");
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
