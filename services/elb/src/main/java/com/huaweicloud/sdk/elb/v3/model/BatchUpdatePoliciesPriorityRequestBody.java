package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class BatchUpdatePoliciesPriorityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policies")

    private List<BatchUpdatePriorityRequestBody> l7policies = null;

    public BatchUpdatePoliciesPriorityRequestBody withL7policies(List<BatchUpdatePriorityRequestBody> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    public BatchUpdatePoliciesPriorityRequestBody addL7policiesItem(BatchUpdatePriorityRequestBody l7policiesItem) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public BatchUpdatePoliciesPriorityRequestBody withL7policies(
        Consumer<List<BatchUpdatePriorityRequestBody>> l7policiesSetter) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        l7policiesSetter.accept(this.l7policies);
        return this;
    }

    /** 转发策略的结构体
     * 
     * @return l7policies */
    public List<BatchUpdatePriorityRequestBody> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<BatchUpdatePriorityRequestBody> l7policies) {
        this.l7policies = l7policies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdatePoliciesPriorityRequestBody batchUpdatePoliciesPriorityRequestBody =
            (BatchUpdatePoliciesPriorityRequestBody) o;
        return Objects.equals(this.l7policies, batchUpdatePoliciesPriorityRequestBody.l7policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePoliciesPriorityRequestBody {\n");
        sb.append("    l7policies: ").append(toIndentedString(l7policies)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
