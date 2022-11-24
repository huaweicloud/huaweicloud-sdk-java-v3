package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListStacksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack")

    private StacksTags stack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ListStacksResponse withStack(StacksTags stack) {
        this.stack = stack;
        return this;
    }

    public ListStacksResponse withStack(Consumer<StacksTags> stackSetter) {
        if (this.stack == null) {
            this.stack = new StacksTags();
            stackSetter.accept(this.stack);
        }

        return this;
    }

    /**
     * Get stack
     * @return stack
     */
    public StacksTags getStack() {
        return stack;
    }

    public void setStack(StacksTags stack) {
        this.stack = stack;
    }

    public ListStacksResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStacksResponse listStacksResponse = (ListStacksResponse) o;
        return Objects.equals(this.stack, listStacksResponse.stack)
            && Objects.equals(this.status, listStacksResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stack, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStacksResponse {\n");
        sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
