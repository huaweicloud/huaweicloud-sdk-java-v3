package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecyclePolicyResponseBody
 */
public class RecyclePolicyResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_policy")

    private RecyclePolicy recyclePolicy;

    public RecyclePolicyResponseBody withRecyclePolicy(RecyclePolicy recyclePolicy) {
        this.recyclePolicy = recyclePolicy;
        return this;
    }

    public RecyclePolicyResponseBody withRecyclePolicy(Consumer<RecyclePolicy> recyclePolicySetter) {
        if (this.recyclePolicy == null) {
            this.recyclePolicy = new RecyclePolicy();
            recyclePolicySetter.accept(this.recyclePolicy);
        }

        return this;
    }

    /**
     * Get recyclePolicy
     * @return recyclePolicy
     */
    public RecyclePolicy getRecyclePolicy() {
        return recyclePolicy;
    }

    public void setRecyclePolicy(RecyclePolicy recyclePolicy) {
        this.recyclePolicy = recyclePolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecyclePolicyResponseBody recyclePolicyResponseBody = (RecyclePolicyResponseBody) o;
        return Objects.equals(this.recyclePolicy, recyclePolicyResponseBody.recyclePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recyclePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclePolicyResponseBody {\n");
        sb.append("    recyclePolicy: ").append(toIndentedString(recyclePolicy)).append("\n");
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
