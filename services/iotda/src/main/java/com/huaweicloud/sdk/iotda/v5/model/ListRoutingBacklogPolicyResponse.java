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
public class ListRoutingBacklogPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backlog_policies")

    private List<BacklogPolicyInfo> backlogPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListRoutingBacklogPolicyResponse withBacklogPolicies(List<BacklogPolicyInfo> backlogPolicies) {
        this.backlogPolicies = backlogPolicies;
        return this;
    }

    public ListRoutingBacklogPolicyResponse addBacklogPoliciesItem(BacklogPolicyInfo backlogPoliciesItem) {
        if (this.backlogPolicies == null) {
            this.backlogPolicies = new ArrayList<>();
        }
        this.backlogPolicies.add(backlogPoliciesItem);
        return this;
    }

    public ListRoutingBacklogPolicyResponse withBacklogPolicies(
        Consumer<List<BacklogPolicyInfo>> backlogPoliciesSetter) {
        if (this.backlogPolicies == null) {
            this.backlogPolicies = new ArrayList<>();
        }
        backlogPoliciesSetter.accept(this.backlogPolicies);
        return this;
    }

    /**
     * 数据流转积压策略列表。
     * @return backlogPolicies
     */
    public List<BacklogPolicyInfo> getBacklogPolicies() {
        return backlogPolicies;
    }

    public void setBacklogPolicies(List<BacklogPolicyInfo> backlogPolicies) {
        this.backlogPolicies = backlogPolicies;
    }

    public ListRoutingBacklogPolicyResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 满足查询条件的记录总数。
     * minimum: 0
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListRoutingBacklogPolicyResponse withMarker(String marker) {
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
        ListRoutingBacklogPolicyResponse that = (ListRoutingBacklogPolicyResponse) obj;
        return Objects.equals(this.backlogPolicies, that.backlogPolicies) && Objects.equals(this.count, that.count)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backlogPolicies, count, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRoutingBacklogPolicyResponse {\n");
        sb.append("    backlogPolicies: ").append(toIndentedString(backlogPolicies)).append("\n");
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
