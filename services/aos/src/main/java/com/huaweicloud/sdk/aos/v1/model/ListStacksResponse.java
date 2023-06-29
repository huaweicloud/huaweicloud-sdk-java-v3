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
public class ListStacksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stacks")

    private List<Stack> stacks = null;

    public ListStacksResponse withStacks(List<Stack> stacks) {
        this.stacks = stacks;
        return this;
    }

    public ListStacksResponse addStacksItem(Stack stacksItem) {
        if (this.stacks == null) {
            this.stacks = new ArrayList<>();
        }
        this.stacks.add(stacksItem);
        return this;
    }

    public ListStacksResponse withStacks(Consumer<List<Stack>> stacksSetter) {
        if (this.stacks == null) {
            this.stacks = new ArrayList<>();
        }
        stacksSetter.accept(this.stacks);
        return this;
    }

    /**
     * 资源栈列表。默认按照生成时间排序，最早生成的在最前
     * @return stacks
     */
    public List<Stack> getStacks() {
        return stacks;
    }

    public void setStacks(List<Stack> stacks) {
        this.stacks = stacks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStacksResponse that = (ListStacksResponse) obj;
        return Objects.equals(this.stacks, that.stacks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stacks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStacksResponse {\n");
        sb.append("    stacks: ").append(toIndentedString(stacks)).append("\n");
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
