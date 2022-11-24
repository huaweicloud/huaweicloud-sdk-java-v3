package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class ListRunsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runs")

    private List<Run> runs = null;

    public ListRunsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 作业总个数。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListRunsResponse withRuns(List<Run> runs) {
        this.runs = runs;
        return this;
    }

    public ListRunsResponse addRunsItem(Run runsItem) {
        if (this.runs == null) {
            this.runs = new ArrayList<>();
        }
        this.runs.add(runsItem);
        return this;
    }

    public ListRunsResponse withRuns(Consumer<List<Run>> runsSetter) {
        if (this.runs == null) {
            this.runs = new ArrayList<>();
        }
        runsSetter.accept(this.runs);
        return this;
    }

    /**
     * 作业运行列表。
     * @return runs
     */
    public List<Run> getRuns() {
        return runs;
    }

    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRunsResponse listRunsResponse = (ListRunsResponse) o;
        return Objects.equals(this.count, listRunsResponse.count) && Objects.equals(this.runs, listRunsResponse.runs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, runs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRunsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
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
