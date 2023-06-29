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
public class ListTrustedServicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trusted_services")

    private List<TrustedServiceDto> trustedServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListTrustedServicesResponse withTrustedServices(List<TrustedServiceDto> trustedServices) {
        this.trustedServices = trustedServices;
        return this;
    }

    public ListTrustedServicesResponse addTrustedServicesItem(TrustedServiceDto trustedServicesItem) {
        if (this.trustedServices == null) {
            this.trustedServices = new ArrayList<>();
        }
        this.trustedServices.add(trustedServicesItem);
        return this;
    }

    public ListTrustedServicesResponse withTrustedServices(Consumer<List<TrustedServiceDto>> trustedServicesSetter) {
        if (this.trustedServices == null) {
            this.trustedServices = new ArrayList<>();
        }
        trustedServicesSetter.accept(this.trustedServices);
        return this;
    }

    /**
     * 启用与组织集成的服务主体列表。
     * @return trustedServices
     */
    public List<TrustedServiceDto> getTrustedServices() {
        return trustedServices;
    }

    public void setTrustedServices(List<TrustedServiceDto> trustedServices) {
        this.trustedServices = trustedServices;
    }

    public ListTrustedServicesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTrustedServicesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrustedServicesResponse that = (ListTrustedServicesResponse) obj;
        return Objects.equals(this.trustedServices, that.trustedServices)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustedServices, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrustedServicesResponse {\n");
        sb.append("    trustedServices: ").append(toIndentedString(trustedServices)).append("\n");
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
