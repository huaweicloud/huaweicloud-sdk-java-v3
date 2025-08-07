package com.huaweicloud.sdk.ram.v1.model;

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
public class SearchDistinctPrincipalsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinct_shared_principals")

    private List<DistinctSharedPrincipal> distinctSharedPrincipals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public SearchDistinctPrincipalsResponse withDistinctSharedPrincipals(
        List<DistinctSharedPrincipal> distinctSharedPrincipals) {
        this.distinctSharedPrincipals = distinctSharedPrincipals;
        return this;
    }

    public SearchDistinctPrincipalsResponse addDistinctSharedPrincipalsItem(
        DistinctSharedPrincipal distinctSharedPrincipalsItem) {
        if (this.distinctSharedPrincipals == null) {
            this.distinctSharedPrincipals = new ArrayList<>();
        }
        this.distinctSharedPrincipals.add(distinctSharedPrincipalsItem);
        return this;
    }

    public SearchDistinctPrincipalsResponse withDistinctSharedPrincipals(
        Consumer<List<DistinctSharedPrincipal>> distinctSharedPrincipalsSetter) {
        if (this.distinctSharedPrincipals == null) {
            this.distinctSharedPrincipals = new ArrayList<>();
        }
        distinctSharedPrincipalsSetter.accept(this.distinctSharedPrincipals);
        return this;
    }

    /**
     * 不同角色的信息列表。
     * @return distinctSharedPrincipals
     */
    public List<DistinctSharedPrincipal> getDistinctSharedPrincipals() {
        return distinctSharedPrincipals;
    }

    public void setDistinctSharedPrincipals(List<DistinctSharedPrincipal> distinctSharedPrincipals) {
        this.distinctSharedPrincipals = distinctSharedPrincipals;
    }

    public SearchDistinctPrincipalsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchDistinctPrincipalsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchDistinctPrincipalsResponse that = (SearchDistinctPrincipalsResponse) obj;
        return Objects.equals(this.distinctSharedPrincipals, that.distinctSharedPrincipals)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distinctSharedPrincipals, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchDistinctPrincipalsResponse {\n");
        sb.append("    distinctSharedPrincipals: ").append(toIndentedString(distinctSharedPrincipals)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
