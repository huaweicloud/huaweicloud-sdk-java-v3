package com.huaweicloud.sdk.ces.v3.model;

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
public class ListAgentInvocationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocations")

    private List<InvocationInfo> invocations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAgentInvocationsResponse withInvocations(List<InvocationInfo> invocations) {
        this.invocations = invocations;
        return this;
    }

    public ListAgentInvocationsResponse addInvocationsItem(InvocationInfo invocationsItem) {
        if (this.invocations == null) {
            this.invocations = new ArrayList<>();
        }
        this.invocations.add(invocationsItem);
        return this;
    }

    public ListAgentInvocationsResponse withInvocations(Consumer<List<InvocationInfo>> invocationsSetter) {
        if (this.invocations == null) {
            this.invocations = new ArrayList<>();
        }
        invocationsSetter.accept(this.invocations);
        return this;
    }

    /**
     * 任务列表
     * @return invocations
     */
    public List<InvocationInfo> getInvocations() {
        return invocations;
    }

    public void setInvocations(List<InvocationInfo> invocations) {
        this.invocations = invocations;
    }

    public ListAgentInvocationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 任务列表总量
     * minimum: 0
     * maximum: 9999999999999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentInvocationsResponse that = (ListAgentInvocationsResponse) obj;
        return Objects.equals(this.invocations, that.invocations) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocations, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentInvocationsResponse {\n");
        sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
