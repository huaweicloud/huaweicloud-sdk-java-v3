package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceReplicationPolicyExecutionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executions")

    private List<Execution> executions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceReplicationPolicyExecutionsResponse withExecutions(List<Execution> executions) {
        this.executions = executions;
        return this;
    }

    public ListInstanceReplicationPolicyExecutionsResponse addExecutionsItem(Execution executionsItem) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        this.executions.add(executionsItem);
        return this;
    }

    public ListInstanceReplicationPolicyExecutionsResponse withExecutions(Consumer<List<Execution>> executionsSetter) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        executionsSetter.accept(this.executions);
        return this;
    }

    /**
     * 执行记录列表
     * @return executions
     */
    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }

    public ListInstanceReplicationPolicyExecutionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 执行记录总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceReplicationPolicyExecutionsResponse that = (ListInstanceReplicationPolicyExecutionsResponse) obj;
        return Objects.equals(this.executions, that.executions) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executions, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceReplicationPolicyExecutionsResponse {\n");
        sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
