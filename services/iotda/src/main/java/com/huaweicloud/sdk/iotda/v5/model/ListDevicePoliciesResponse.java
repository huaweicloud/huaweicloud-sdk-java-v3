package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListDevicePoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<ListDevicePolicyBase> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListDevicePoliciesResponse withPolicies(List<ListDevicePolicyBase> policies) {
        this.policies = policies;
        return this;
    }

    public ListDevicePoliciesResponse addPoliciesItem(ListDevicePolicyBase policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListDevicePoliciesResponse withPolicies(Consumer<List<ListDevicePolicyBase>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 策略信息列表。
     * @return policies
     */
    public List<ListDevicePolicyBase> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ListDevicePolicyBase> policies) {
        this.policies = policies;
    }

    public ListDevicePoliciesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListDevicePoliciesResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDevicePoliciesResponse that = (ListDevicePoliciesResponse) obj;
        return Objects.equals(this.policies, that.policies) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevicePoliciesResponse {\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
