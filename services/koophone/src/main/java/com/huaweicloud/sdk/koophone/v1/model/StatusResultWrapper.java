package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 状态查询结果包装
 */
public class StatusResultWrapper {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_results")

    private List<StatusResult> statusResults = null;

    public StatusResultWrapper withStatusResults(List<StatusResult> statusResults) {
        this.statusResults = statusResults;
        return this;
    }

    public StatusResultWrapper addStatusResultsItem(StatusResult statusResultsItem) {
        if (this.statusResults == null) {
            this.statusResults = new ArrayList<>();
        }
        this.statusResults.add(statusResultsItem);
        return this;
    }

    public StatusResultWrapper withStatusResults(Consumer<List<StatusResult>> statusResultsSetter) {
        if (this.statusResults == null) {
            this.statusResults = new ArrayList<>();
        }
        statusResultsSetter.accept(this.statusResults);
        return this;
    }

    /**
     * 状态查询结果
     * @return statusResults
     */
    public List<StatusResult> getStatusResults() {
        return statusResults;
    }

    public void setStatusResults(List<StatusResult> statusResults) {
        this.statusResults = statusResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusResultWrapper that = (StatusResultWrapper) obj;
        return Objects.equals(this.statusResults, that.statusResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusResultWrapper {\n");
        sb.append("    statusResults: ").append(toIndentedString(statusResults)).append("\n");
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
