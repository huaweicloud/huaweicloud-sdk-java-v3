package com.huaweicloud.sdk.rds.v3.model;

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
public class BatchExecuteEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<EventJobResult> results = null;

    public BatchExecuteEventsResponse withResults(List<EventJobResult> results) {
        this.results = results;
        return this;
    }

    public BatchExecuteEventsResponse addResultsItem(EventJobResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchExecuteEventsResponse withResults(Consumer<List<EventJobResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * **参数解释**：  事件操作响应结果  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return results
     */
    public List<EventJobResult> getResults() {
        return results;
    }

    public void setResults(List<EventJobResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchExecuteEventsResponse that = (BatchExecuteEventsResponse) obj;
        return Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchExecuteEventsResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
