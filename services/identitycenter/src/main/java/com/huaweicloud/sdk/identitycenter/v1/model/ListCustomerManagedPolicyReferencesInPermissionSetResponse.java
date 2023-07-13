package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListCustomerManagedPolicyReferencesInPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_managed_policy_references")

    private List<CustomerManagedPolicyReferenceDto> customerManagedPolicyReferences = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListCustomerManagedPolicyReferencesInPermissionSetResponse withCustomerManagedPolicyReferences(
        List<CustomerManagedPolicyReferenceDto> customerManagedPolicyReferences) {
        this.customerManagedPolicyReferences = customerManagedPolicyReferences;
        return this;
    }

    public ListCustomerManagedPolicyReferencesInPermissionSetResponse addCustomerManagedPolicyReferencesItem(
        CustomerManagedPolicyReferenceDto customerManagedPolicyReferencesItem) {
        if (this.customerManagedPolicyReferences == null) {
            this.customerManagedPolicyReferences = new ArrayList<>();
        }
        this.customerManagedPolicyReferences.add(customerManagedPolicyReferencesItem);
        return this;
    }

    public ListCustomerManagedPolicyReferencesInPermissionSetResponse withCustomerManagedPolicyReferences(
        Consumer<List<CustomerManagedPolicyReferenceDto>> customerManagedPolicyReferencesSetter) {
        if (this.customerManagedPolicyReferences == null) {
            this.customerManagedPolicyReferences = new ArrayList<>();
        }
        customerManagedPolicyReferencesSetter.accept(this.customerManagedPolicyReferences);
        return this;
    }

    /**
     * 指定附加到权限集的客户管理策略的名称和路径.
     * @return customerManagedPolicyReferences
     */
    public List<CustomerManagedPolicyReferenceDto> getCustomerManagedPolicyReferences() {
        return customerManagedPolicyReferences;
    }

    public void setCustomerManagedPolicyReferences(
        List<CustomerManagedPolicyReferenceDto> customerManagedPolicyReferences) {
        this.customerManagedPolicyReferences = customerManagedPolicyReferences;
    }

    public ListCustomerManagedPolicyReferencesInPermissionSetResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCustomerManagedPolicyReferencesInPermissionSetResponse withPageInfo(
        Consumer<PageInfoDto> pageInfoSetter) {
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
        ListCustomerManagedPolicyReferencesInPermissionSetResponse that =
            (ListCustomerManagedPolicyReferencesInPermissionSetResponse) obj;
        return Objects.equals(this.customerManagedPolicyReferences, that.customerManagedPolicyReferences)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerManagedPolicyReferences, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerManagedPolicyReferencesInPermissionSetResponse {\n");
        sb.append("    customerManagedPolicyReferences: ")
            .append(toIndentedString(customerManagedPolicyReferences))
            .append("\n");
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
