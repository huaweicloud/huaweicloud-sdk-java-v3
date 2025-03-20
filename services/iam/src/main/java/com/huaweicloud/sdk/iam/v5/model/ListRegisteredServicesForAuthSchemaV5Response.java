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
public class ListRegisteredServicesForAuthSchemaV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_codes")

    private List<String> serviceCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListRegisteredServicesForAuthSchemaV5Response withServiceCodes(List<String> serviceCodes) {
        this.serviceCodes = serviceCodes;
        return this;
    }

    public ListRegisteredServicesForAuthSchemaV5Response addServiceCodesItem(String serviceCodesItem) {
        if (this.serviceCodes == null) {
            this.serviceCodes = new ArrayList<>();
        }
        this.serviceCodes.add(serviceCodesItem);
        return this;
    }

    public ListRegisteredServicesForAuthSchemaV5Response withServiceCodes(Consumer<List<String>> serviceCodesSetter) {
        if (this.serviceCodes == null) {
            this.serviceCodes = new ArrayList<>();
        }
        serviceCodesSetter.accept(this.serviceCodes);
        return this;
    }

    /**
     * 服务名称缩写列表。
     * @return serviceCodes
     */
    public List<String> getServiceCodes() {
        return serviceCodes;
    }

    public void setServiceCodes(List<String> serviceCodes) {
        this.serviceCodes = serviceCodes;
    }

    public ListRegisteredServicesForAuthSchemaV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRegisteredServicesForAuthSchemaV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListRegisteredServicesForAuthSchemaV5Response that = (ListRegisteredServicesForAuthSchemaV5Response) obj;
        return Objects.equals(this.serviceCodes, that.serviceCodes) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCodes, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegisteredServicesForAuthSchemaV5Response {\n");
        sb.append("    serviceCodes: ").append(toIndentedString(serviceCodes)).append("\n");
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
