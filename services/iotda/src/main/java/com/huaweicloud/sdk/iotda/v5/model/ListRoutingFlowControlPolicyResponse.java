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
public class ListRoutingFlowControlPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flowcontrol_policies")

    private List<FlowControlPolicyInfo> flowcontrolPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListRoutingFlowControlPolicyResponse withFlowcontrolPolicies(
        List<FlowControlPolicyInfo> flowcontrolPolicies) {
        this.flowcontrolPolicies = flowcontrolPolicies;
        return this;
    }

    public ListRoutingFlowControlPolicyResponse addFlowcontrolPoliciesItem(
        FlowControlPolicyInfo flowcontrolPoliciesItem) {
        if (this.flowcontrolPolicies == null) {
            this.flowcontrolPolicies = new ArrayList<>();
        }
        this.flowcontrolPolicies.add(flowcontrolPoliciesItem);
        return this;
    }

    public ListRoutingFlowControlPolicyResponse withFlowcontrolPolicies(
        Consumer<List<FlowControlPolicyInfo>> flowcontrolPoliciesSetter) {
        if (this.flowcontrolPolicies == null) {
            this.flowcontrolPolicies = new ArrayList<>();
        }
        flowcontrolPoliciesSetter.accept(this.flowcontrolPolicies);
        return this;
    }

    /**
     * 数据流转流控策略列表。
     * @return flowcontrolPolicies
     */
    public List<FlowControlPolicyInfo> getFlowcontrolPolicies() {
        return flowcontrolPolicies;
    }

    public void setFlowcontrolPolicies(List<FlowControlPolicyInfo> flowcontrolPolicies) {
        this.flowcontrolPolicies = flowcontrolPolicies;
    }

    public ListRoutingFlowControlPolicyResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 满足查询条件的记录总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListRoutingFlowControlPolicyResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 本次分页查询结果中最后一条记录的ID，可在下一次分页查询时使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRoutingFlowControlPolicyResponse that = (ListRoutingFlowControlPolicyResponse) obj;
        return Objects.equals(this.flowcontrolPolicies, that.flowcontrolPolicies)
            && Objects.equals(this.count, that.count) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowcontrolPolicies, count, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRoutingFlowControlPolicyResponse {\n");
        sb.append("    flowcontrolPolicies: ").append(toIndentedString(flowcontrolPolicies)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
