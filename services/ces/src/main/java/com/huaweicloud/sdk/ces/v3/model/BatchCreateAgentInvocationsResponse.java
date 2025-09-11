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
public class BatchCreateAgentInvocationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocations")

    private List<BatchCreateInvocationInfo> invocations = null;

    public BatchCreateAgentInvocationsResponse withInvocations(List<BatchCreateInvocationInfo> invocations) {
        this.invocations = invocations;
        return this;
    }

    public BatchCreateAgentInvocationsResponse addInvocationsItem(BatchCreateInvocationInfo invocationsItem) {
        if (this.invocations == null) {
            this.invocations = new ArrayList<>();
        }
        this.invocations.add(invocationsItem);
        return this;
    }

    public BatchCreateAgentInvocationsResponse withInvocations(
        Consumer<List<BatchCreateInvocationInfo>> invocationsSetter) {
        if (this.invocations == null) {
            this.invocations = new ArrayList<>();
        }
        invocationsSetter.accept(this.invocations);
        return this;
    }

    /**
     * **参数解释**: 创建任务的信息列表 **取值范围**: 数组长度范围为[0,100] 
     * @return invocations
     */
    public List<BatchCreateInvocationInfo> getInvocations() {
        return invocations;
    }

    public void setInvocations(List<BatchCreateInvocationInfo> invocations) {
        this.invocations = invocations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateAgentInvocationsResponse that = (BatchCreateAgentInvocationsResponse) obj;
        return Objects.equals(this.invocations, that.invocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateAgentInvocationsResponse {\n");
        sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
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
