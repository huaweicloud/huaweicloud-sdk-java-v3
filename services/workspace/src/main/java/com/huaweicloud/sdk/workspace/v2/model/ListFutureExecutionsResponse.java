package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListFutureExecutionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "future_executions")

    private List<String> futureExecutions = null;

    public ListFutureExecutionsResponse withFutureExecutions(List<String> futureExecutions) {
        this.futureExecutions = futureExecutions;
        return this;
    }

    public ListFutureExecutionsResponse addFutureExecutionsItem(String futureExecutionsItem) {
        if (this.futureExecutions == null) {
            this.futureExecutions = new ArrayList<>();
        }
        this.futureExecutions.add(futureExecutionsItem);
        return this;
    }

    public ListFutureExecutionsResponse withFutureExecutions(Consumer<List<String>> futureExecutionsSetter) {
        if (this.futureExecutions == null) {
            this.futureExecutions = new ArrayList<>();
        }
        futureExecutionsSetter.accept(this.futureExecutions);
        return this;
    }

    /**
     * 未来执行的具体时间列表。
     * @return futureExecutions
     */
    public List<String> getFutureExecutions() {
        return futureExecutions;
    }

    public void setFutureExecutions(List<String> futureExecutions) {
        this.futureExecutions = futureExecutions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFutureExecutionsResponse that = (ListFutureExecutionsResponse) obj;
        return Objects.equals(this.futureExecutions, that.futureExecutions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(futureExecutions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFutureExecutionsResponse {\n");
        sb.append("    futureExecutions: ").append(toIndentedString(futureExecutions)).append("\n");
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
