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
public class ListDelegatedServicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegated_services")

    private List<DelegatedServiceDto> delegatedServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListDelegatedServicesResponse withDelegatedServices(List<DelegatedServiceDto> delegatedServices) {
        this.delegatedServices = delegatedServices;
        return this;
    }

    public ListDelegatedServicesResponse addDelegatedServicesItem(DelegatedServiceDto delegatedServicesItem) {
        if (this.delegatedServices == null) {
            this.delegatedServices = new ArrayList<>();
        }
        this.delegatedServices.add(delegatedServicesItem);
        return this;
    }

    public ListDelegatedServicesResponse withDelegatedServices(
        Consumer<List<DelegatedServiceDto>> delegatedServicesSetter) {
        if (this.delegatedServices == null) {
            this.delegatedServices = new ArrayList<>();
        }
        delegatedServicesSetter.accept(this.delegatedServices);
        return this;
    }

    /**
     * 帐号是其委托管理员的服务。
     * @return delegatedServices
     */
    public List<DelegatedServiceDto> getDelegatedServices() {
        return delegatedServices;
    }

    public void setDelegatedServices(List<DelegatedServiceDto> delegatedServices) {
        this.delegatedServices = delegatedServices;
    }

    public ListDelegatedServicesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListDelegatedServicesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListDelegatedServicesResponse listDelegatedServicesResponse = (ListDelegatedServicesResponse) o;
        return Objects.equals(this.delegatedServices, listDelegatedServicesResponse.delegatedServices)
            && Objects.equals(this.pageInfo, listDelegatedServicesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegatedServices, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDelegatedServicesResponse {\n");
        sb.append("    delegatedServices: ").append(toIndentedString(delegatedServices)).append("\n");
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
