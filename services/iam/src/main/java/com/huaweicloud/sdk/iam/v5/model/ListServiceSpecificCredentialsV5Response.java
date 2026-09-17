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
public class ListServiceSpecificCredentialsV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_specific_credentials")

    private List<ServiceSpecificCredentialMetadata> serviceSpecificCredentials = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListServiceSpecificCredentialsV5Response withServiceSpecificCredentials(
        List<ServiceSpecificCredentialMetadata> serviceSpecificCredentials) {
        this.serviceSpecificCredentials = serviceSpecificCredentials;
        return this;
    }

    public ListServiceSpecificCredentialsV5Response addServiceSpecificCredentialsItem(
        ServiceSpecificCredentialMetadata serviceSpecificCredentialsItem) {
        if (this.serviceSpecificCredentials == null) {
            this.serviceSpecificCredentials = new ArrayList<>();
        }
        this.serviceSpecificCredentials.add(serviceSpecificCredentialsItem);
        return this;
    }

    public ListServiceSpecificCredentialsV5Response withServiceSpecificCredentials(
        Consumer<List<ServiceSpecificCredentialMetadata>> serviceSpecificCredentialsSetter) {
        if (this.serviceSpecificCredentials == null) {
            this.serviceSpecificCredentials = new ArrayList<>();
        }
        serviceSpecificCredentialsSetter.accept(this.serviceSpecificCredentials);
        return this;
    }

    /**
     * 服务专属凭证列表。
     * @return serviceSpecificCredentials
     */
    public List<ServiceSpecificCredentialMetadata> getServiceSpecificCredentials() {
        return serviceSpecificCredentials;
    }

    public void setServiceSpecificCredentials(List<ServiceSpecificCredentialMetadata> serviceSpecificCredentials) {
        this.serviceSpecificCredentials = serviceSpecificCredentials;
    }

    public ListServiceSpecificCredentialsV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListServiceSpecificCredentialsV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListServiceSpecificCredentialsV5Response that = (ListServiceSpecificCredentialsV5Response) obj;
        return Objects.equals(this.serviceSpecificCredentials, that.serviceSpecificCredentials)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceSpecificCredentials, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceSpecificCredentialsV5Response {\n");
        sb.append("    serviceSpecificCredentials: ").append(toIndentedString(serviceSpecificCredentials)).append("\n");
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
