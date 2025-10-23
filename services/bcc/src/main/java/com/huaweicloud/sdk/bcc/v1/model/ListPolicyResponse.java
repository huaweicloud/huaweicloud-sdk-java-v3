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
public class ListPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcc_policies")

    private List<BccPolicy> bccPolicies = null;

    public ListPolicyResponse withCount(Integer count) {
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

    public ListPolicyResponse withBccPolicies(List<BccPolicy> bccPolicies) {
        this.bccPolicies = bccPolicies;
        return this;
    }

    public ListPolicyResponse addBccPoliciesItem(BccPolicy bccPoliciesItem) {
        if (this.bccPolicies == null) {
            this.bccPolicies = new ArrayList<>();
        }
        this.bccPolicies.add(bccPoliciesItem);
        return this;
    }

    public ListPolicyResponse withBccPolicies(Consumer<List<BccPolicy>> bccPoliciesSetter) {
        if (this.bccPolicies == null) {
            this.bccPolicies = new ArrayList<>();
        }
        bccPoliciesSetter.accept(this.bccPolicies);
        return this;
    }

    /**
     * bccPolicies
     * @return bccPolicies
     */
    public List<BccPolicy> getBccPolicies() {
        return bccPolicies;
    }

    public void setBccPolicies(List<BccPolicy> bccPolicies) {
        this.bccPolicies = bccPolicies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyResponse that = (ListPolicyResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.bccPolicies, that.bccPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, bccPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    bccPolicies: ").append(toIndentedString(bccPolicies)).append("\n");
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
