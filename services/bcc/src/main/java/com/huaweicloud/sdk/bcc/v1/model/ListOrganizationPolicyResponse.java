package com.huaweicloud.sdk.bcc.v1.model;

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
public class ListOrganizationPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcc_organization_policies")

    private List<BccOrganizationPolicy> bccOrganizationPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListOrganizationPolicyResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListOrganizationPolicyResponse withBccOrganizationPolicies(
        List<BccOrganizationPolicy> bccOrganizationPolicies) {
        this.bccOrganizationPolicies = bccOrganizationPolicies;
        return this;
    }

    public ListOrganizationPolicyResponse addBccOrganizationPoliciesItem(
        BccOrganizationPolicy bccOrganizationPoliciesItem) {
        if (this.bccOrganizationPolicies == null) {
            this.bccOrganizationPolicies = new ArrayList<>();
        }
        this.bccOrganizationPolicies.add(bccOrganizationPoliciesItem);
        return this;
    }

    public ListOrganizationPolicyResponse withBccOrganizationPolicies(
        Consumer<List<BccOrganizationPolicy>> bccOrganizationPoliciesSetter) {
        if (this.bccOrganizationPolicies == null) {
            this.bccOrganizationPolicies = new ArrayList<>();
        }
        bccOrganizationPoliciesSetter.accept(this.bccOrganizationPolicies);
        return this;
    }

    /**
     * bccOrganizationPolicies
     * @return bccOrganizationPolicies
     */
    public List<BccOrganizationPolicy> getBccOrganizationPolicies() {
        return bccOrganizationPolicies;
    }

    public void setBccOrganizationPolicies(List<BccOrganizationPolicy> bccOrganizationPolicies) {
        this.bccOrganizationPolicies = bccOrganizationPolicies;
    }

    public ListOrganizationPolicyResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOrganizationPolicyResponse that = (ListOrganizationPolicyResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.bccOrganizationPolicies, that.bccOrganizationPolicies)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, bccOrganizationPolicies, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrganizationPolicyResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    bccOrganizationPolicies: ").append(toIndentedString(bccOrganizationPolicies)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
