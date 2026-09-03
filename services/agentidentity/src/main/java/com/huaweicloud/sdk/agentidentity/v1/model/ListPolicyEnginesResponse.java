package com.huaweicloud.sdk.agentidentity.v1.model;

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
public class ListPolicyEnginesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_engines")

    private List<PolicyEngineSummary> policyEngines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListPolicyEnginesResponse withPolicyEngines(List<PolicyEngineSummary> policyEngines) {
        this.policyEngines = policyEngines;
        return this;
    }

    public ListPolicyEnginesResponse addPolicyEnginesItem(PolicyEngineSummary policyEnginesItem) {
        if (this.policyEngines == null) {
            this.policyEngines = new ArrayList<>();
        }
        this.policyEngines.add(policyEnginesItem);
        return this;
    }

    public ListPolicyEnginesResponse withPolicyEngines(Consumer<List<PolicyEngineSummary>> policyEnginesSetter) {
        if (this.policyEngines == null) {
            this.policyEngines = new ArrayList<>();
        }
        policyEnginesSetter.accept(this.policyEngines);
        return this;
    }

    /**
     * Get policyEngines
     * @return policyEngines
     */
    public List<PolicyEngineSummary> getPolicyEngines() {
        return policyEngines;
    }

    public void setPolicyEngines(List<PolicyEngineSummary> policyEngines) {
        this.policyEngines = policyEngines;
    }

    public ListPolicyEnginesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPolicyEnginesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListPolicyEnginesResponse that = (ListPolicyEnginesResponse) obj;
        return Objects.equals(this.policyEngines, that.policyEngines) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyEngines, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyEnginesResponse {\n");
        sb.append("    policyEngines: ").append(toIndentedString(policyEngines)).append("\n");
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
