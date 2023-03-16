package com.huaweicloud.sdk.organizations.v1.model;

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
public class ListDelegatedAdministratorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegated_administrators")

    private List<DelegatedAdministratorDto> delegatedAdministrators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListDelegatedAdministratorsResponse withDelegatedAdministrators(
        List<DelegatedAdministratorDto> delegatedAdministrators) {
        this.delegatedAdministrators = delegatedAdministrators;
        return this;
    }

    public ListDelegatedAdministratorsResponse addDelegatedAdministratorsItem(
        DelegatedAdministratorDto delegatedAdministratorsItem) {
        if (this.delegatedAdministrators == null) {
            this.delegatedAdministrators = new ArrayList<>();
        }
        this.delegatedAdministrators.add(delegatedAdministratorsItem);
        return this;
    }

    public ListDelegatedAdministratorsResponse withDelegatedAdministrators(
        Consumer<List<DelegatedAdministratorDto>> delegatedAdministratorsSetter) {
        if (this.delegatedAdministrators == null) {
            this.delegatedAdministrators = new ArrayList<>();
        }
        delegatedAdministratorsSetter.accept(this.delegatedAdministrators);
        return this;
    }

    /**
     * 组织中委托管理员列表。
     * @return delegatedAdministrators
     */
    public List<DelegatedAdministratorDto> getDelegatedAdministrators() {
        return delegatedAdministrators;
    }

    public void setDelegatedAdministrators(List<DelegatedAdministratorDto> delegatedAdministrators) {
        this.delegatedAdministrators = delegatedAdministrators;
    }

    public ListDelegatedAdministratorsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListDelegatedAdministratorsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
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
        ListDelegatedAdministratorsResponse listDelegatedAdministratorsResponse =
            (ListDelegatedAdministratorsResponse) o;
        return Objects.equals(this.delegatedAdministrators, listDelegatedAdministratorsResponse.delegatedAdministrators)
            && Objects.equals(this.pageInfo, listDelegatedAdministratorsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegatedAdministrators, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDelegatedAdministratorsResponse {\n");
        sb.append("    delegatedAdministrators: ").append(toIndentedString(delegatedAdministrators)).append("\n");
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
