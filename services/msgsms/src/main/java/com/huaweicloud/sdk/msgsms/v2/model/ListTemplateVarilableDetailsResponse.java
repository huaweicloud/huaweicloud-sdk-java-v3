package com.huaweicloud.sdk.msgsms.v2.model;

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
public class ListTemplateVarilableDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<ApiTemplateVariable> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListTemplateVarilableDetailsResponse withResults(List<ApiTemplateVariable> results) {
        this.results = results;
        return this;
    }

    public ListTemplateVarilableDetailsResponse addResultsItem(ApiTemplateVariable resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public ListTemplateVarilableDetailsResponse withResults(Consumer<List<ApiTemplateVariable>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 查询结果
     * @return results
     */
    public List<ApiTemplateVariable> getResults() {
        return results;
    }

    public void setResults(List<ApiTemplateVariable> results) {
        this.results = results;
    }

    public ListTemplateVarilableDetailsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplateVarilableDetailsResponse listTemplateVarilableDetailsResponse =
            (ListTemplateVarilableDetailsResponse) o;
        return Objects.equals(this.results, listTemplateVarilableDetailsResponse.results)
            && Objects.equals(this.total, listTemplateVarilableDetailsResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateVarilableDetailsResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
