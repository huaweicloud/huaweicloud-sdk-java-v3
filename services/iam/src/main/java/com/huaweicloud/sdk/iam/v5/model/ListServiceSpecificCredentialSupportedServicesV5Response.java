package com.huaweicloud.sdk.iam.v5.model;

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
public class ListServiceSpecificCredentialSupportedServicesV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "services")

    private List<SupportedService> services = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListServiceSpecificCredentialSupportedServicesV5Response withServices(List<SupportedService> services) {
        this.services = services;
        return this;
    }

    public ListServiceSpecificCredentialSupportedServicesV5Response addServicesItem(SupportedService servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public ListServiceSpecificCredentialSupportedServicesV5Response withServices(
        Consumer<List<SupportedService>> servicesSetter) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /**
     * 服务专属凭证所属云服务信息列表。
     * @return services
     */
    public List<SupportedService> getServices() {
        return services;
    }

    public void setServices(List<SupportedService> services) {
        this.services = services;
    }

    public ListServiceSpecificCredentialSupportedServicesV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListServiceSpecificCredentialSupportedServicesV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListServiceSpecificCredentialSupportedServicesV5Response that =
            (ListServiceSpecificCredentialSupportedServicesV5Response) obj;
        return Objects.equals(this.services, that.services) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(services, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceSpecificCredentialSupportedServicesV5Response {\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
