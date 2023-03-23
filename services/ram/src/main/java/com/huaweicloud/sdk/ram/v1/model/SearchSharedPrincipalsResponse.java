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
public class SearchSharedPrincipalsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_principals")

    private List<SharedPrincipal> sharedPrincipals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public SearchSharedPrincipalsResponse withSharedPrincipals(List<SharedPrincipal> sharedPrincipals) {
        this.sharedPrincipals = sharedPrincipals;
        return this;
    }

    public SearchSharedPrincipalsResponse addSharedPrincipalsItem(SharedPrincipal sharedPrincipalsItem) {
        if (this.sharedPrincipals == null) {
            this.sharedPrincipals = new ArrayList<>();
        }
        this.sharedPrincipals.add(sharedPrincipalsItem);
        return this;
    }

    public SearchSharedPrincipalsResponse withSharedPrincipals(Consumer<List<SharedPrincipal>> sharedPrincipalsSetter) {
        if (this.sharedPrincipals == null) {
            this.sharedPrincipals = new ArrayList<>();
        }
        sharedPrincipalsSetter.accept(this.sharedPrincipals);
        return this;
    }

    /**
     * 资源使用者的详细信息列表。
     * @return sharedPrincipals
     */
    public List<SharedPrincipal> getSharedPrincipals() {
        return sharedPrincipals;
    }

    public void setSharedPrincipals(List<SharedPrincipal> sharedPrincipals) {
        this.sharedPrincipals = sharedPrincipals;
    }

    public SearchSharedPrincipalsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchSharedPrincipalsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchSharedPrincipalsResponse searchSharedPrincipalsResponse = (SearchSharedPrincipalsResponse) o;
        return Objects.equals(this.sharedPrincipals, searchSharedPrincipalsResponse.sharedPrincipals)
            && Objects.equals(this.pageInfo, searchSharedPrincipalsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedPrincipals, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSharedPrincipalsResponse {\n");
        sb.append("    sharedPrincipals: ").append(toIndentedString(sharedPrincipals)).append("\n");
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
