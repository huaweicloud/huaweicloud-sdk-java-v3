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
public class ListServicePrincipalsV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_principals")

    private List<ServicePrincipalMetadata> servicePrincipals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListServicePrincipalsV5Response withServicePrincipals(List<ServicePrincipalMetadata> servicePrincipals) {
        this.servicePrincipals = servicePrincipals;
        return this;
    }

    public ListServicePrincipalsV5Response addServicePrincipalsItem(ServicePrincipalMetadata servicePrincipalsItem) {
        if (this.servicePrincipals == null) {
            this.servicePrincipals = new ArrayList<>();
        }
        this.servicePrincipals.add(servicePrincipalsItem);
        return this;
    }

    public ListServicePrincipalsV5Response withServicePrincipals(
        Consumer<List<ServicePrincipalMetadata>> servicePrincipalsSetter) {
        if (this.servicePrincipals == null) {
            this.servicePrincipals = new ArrayList<>();
        }
        servicePrincipalsSetter.accept(this.servicePrincipals);
        return this;
    }

    /**
     * 服务主体列表。
     * @return servicePrincipals
     */
    public List<ServicePrincipalMetadata> getServicePrincipals() {
        return servicePrincipals;
    }

    public void setServicePrincipals(List<ServicePrincipalMetadata> servicePrincipals) {
        this.servicePrincipals = servicePrincipals;
    }

    public ListServicePrincipalsV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListServicePrincipalsV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListServicePrincipalsV5Response that = (ListServicePrincipalsV5Response) obj;
        return Objects.equals(this.servicePrincipals, that.servicePrincipals)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePrincipals, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServicePrincipalsV5Response {\n");
        sb.append("    servicePrincipals: ").append(toIndentedString(servicePrincipals)).append("\n");
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
