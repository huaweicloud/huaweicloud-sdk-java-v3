package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DetachCustomerManagedPolicyReferenceFromPermissionSet请求体
 */
public class DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_managed_policy_reference")

    private CustomerManagedPolicyReferenceDto customerManagedPolicyReference;

    public DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody withCustomerManagedPolicyReference(
        CustomerManagedPolicyReferenceDto customerManagedPolicyReference) {
        this.customerManagedPolicyReference = customerManagedPolicyReference;
        return this;
    }

    public DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody withCustomerManagedPolicyReference(
        Consumer<CustomerManagedPolicyReferenceDto> customerManagedPolicyReferenceSetter) {
        if (this.customerManagedPolicyReference == null) {
            this.customerManagedPolicyReference = new CustomerManagedPolicyReferenceDto();
            customerManagedPolicyReferenceSetter.accept(this.customerManagedPolicyReference);
        }

        return this;
    }

    /**
     * Get customerManagedPolicyReference
     * @return customerManagedPolicyReference
     */
    public CustomerManagedPolicyReferenceDto getCustomerManagedPolicyReference() {
        return customerManagedPolicyReference;
    }

    public void setCustomerManagedPolicyReference(CustomerManagedPolicyReferenceDto customerManagedPolicyReference) {
        this.customerManagedPolicyReference = customerManagedPolicyReference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody that =
            (DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody) obj;
        return Objects.equals(this.customerManagedPolicyReference, that.customerManagedPolicyReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerManagedPolicyReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody {\n");
        sb.append("    customerManagedPolicyReference: ")
            .append(toIndentedString(customerManagedPolicyReference))
            .append("\n");
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
