package com.huaweicloud.sdk.aos.v1.model;

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
public class ListStackSetOperationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_operations")

    private List<StackSetOperation> stackSetOperations = null;

    public ListStackSetOperationsResponse withStackSetOperations(List<StackSetOperation> stackSetOperations) {
        this.stackSetOperations = stackSetOperations;
        return this;
    }

    public ListStackSetOperationsResponse addStackSetOperationsItem(StackSetOperation stackSetOperationsItem) {
        if (this.stackSetOperations == null) {
            this.stackSetOperations = new ArrayList<>();
        }
        this.stackSetOperations.add(stackSetOperationsItem);
        return this;
    }

    public ListStackSetOperationsResponse withStackSetOperations(
        Consumer<List<StackSetOperation>> stackSetOperationsSetter) {
        if (this.stackSetOperations == null) {
            this.stackSetOperations = new ArrayList<>();
        }
        stackSetOperationsSetter.accept(this.stackSetOperations);
        return this;
    }

    /**
     * 资源栈集操作列表
     * @return stackSetOperations
     */
    public List<StackSetOperation> getStackSetOperations() {
        return stackSetOperations;
    }

    public void setStackSetOperations(List<StackSetOperation> stackSetOperations) {
        this.stackSetOperations = stackSetOperations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStackSetOperationsResponse that = (ListStackSetOperationsResponse) obj;
        return Objects.equals(this.stackSetOperations, that.stackSetOperations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetOperations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackSetOperationsResponse {\n");
        sb.append("    stackSetOperations: ").append(toIndentedString(stackSetOperations)).append("\n");
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
