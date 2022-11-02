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
public class ListAttachedDomainsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bound_domains")

    private List<UrlDomainRefInfo> boundDomains = null;

    public ListAttachedDomainsV2Response withSize(Integer size) {
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

    public ListAttachedDomainsV2Response withTotal(Long total) {
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

    public ListAttachedDomainsV2Response withBoundDomains(List<UrlDomainRefInfo> boundDomains) {
        this.boundDomains = boundDomains;
        return this;
    }

    public ListAttachedDomainsV2Response addBoundDomainsItem(UrlDomainRefInfo boundDomainsItem) {
        if (this.boundDomains == null) {
            this.boundDomains = new ArrayList<>();
        }
        this.boundDomains.add(boundDomainsItem);
        return this;
    }

    public ListAttachedDomainsV2Response withBoundDomains(Consumer<List<UrlDomainRefInfo>> boundDomainsSetter) {
        if (this.boundDomains == null) {
            this.boundDomains = new ArrayList<>();
        }
        boundDomainsSetter.accept(this.boundDomains);
        return this;
    }

    /**
     * 已绑定域名集合
     * @return boundDomains
     */
    public List<UrlDomainRefInfo> getBoundDomains() {
        return boundDomains;
    }

    public void setBoundDomains(List<UrlDomainRefInfo> boundDomains) {
        this.boundDomains = boundDomains;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAttachedDomainsV2Response listAttachedDomainsV2Response = (ListAttachedDomainsV2Response) o;
        return Objects.equals(this.size, listAttachedDomainsV2Response.size)
            && Objects.equals(this.total, listAttachedDomainsV2Response.total)
            && Objects.equals(this.boundDomains, listAttachedDomainsV2Response.boundDomains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, boundDomains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAttachedDomainsV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    boundDomains: ").append(toIndentedString(boundDomains)).append("\n");
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
