package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListQueriesData
 */
public class ListQueriesData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queries")

    private List<ListQueriesDto> queries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ListQueriesStatus status;

    public ListQueriesData withQueries(List<ListQueriesDto> queries) {
        this.queries = queries;
        return this;
    }

    public ListQueriesData addQueriesItem(ListQueriesDto queriesItem) {
        if (this.queries == null) {
            this.queries = new ArrayList<>();
        }
        this.queries.add(queriesItem);
        return this;
    }

    public ListQueriesData withQueries(Consumer<List<ListQueriesDto>> queriesSetter) {
        if (this.queries == null) {
            this.queries = new ArrayList<>();
        }
        queriesSetter.accept(this.queries);
        return this;
    }

    /**
     * 查询数据列表。
     * @return queries
     */
    public List<ListQueriesDto> getQueries() {
        return queries;
    }

    public void setQueries(List<ListQueriesDto> queries) {
        this.queries = queries;
    }

    public ListQueriesData withStatus(ListQueriesStatus status) {
        this.status = status;
        return this;
    }

    public ListQueriesData withStatus(Consumer<ListQueriesStatus> statusSetter) {
        if (this.status == null) {
            this.status = new ListQueriesStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ListQueriesStatus getStatus() {
        return status;
    }

    public void setStatus(ListQueriesStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQueriesData that = (ListQueriesData) obj;
        return Objects.equals(this.queries, that.queries) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queries, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueriesData {\n");
        sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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
