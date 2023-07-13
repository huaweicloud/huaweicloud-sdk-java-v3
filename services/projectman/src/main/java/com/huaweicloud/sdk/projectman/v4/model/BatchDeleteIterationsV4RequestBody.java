package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteIterationsV4RequestBody
 */
public class BatchDeleteIterationsV4RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_ids")

    private List<Integer> iterationIds = null;

    public BatchDeleteIterationsV4RequestBody withIterationIds(List<Integer> iterationIds) {
        this.iterationIds = iterationIds;
        return this;
    }

    public BatchDeleteIterationsV4RequestBody addIterationIdsItem(Integer iterationIdsItem) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        this.iterationIds.add(iterationIdsItem);
        return this;
    }

    public BatchDeleteIterationsV4RequestBody withIterationIds(Consumer<List<Integer>> iterationIdsSetter) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        iterationIdsSetter.accept(this.iterationIds);
        return this;
    }

    /**
     * 迭代的id
     * @return iterationIds
     */
    public List<Integer> getIterationIds() {
        return iterationIds;
    }

    public void setIterationIds(List<Integer> iterationIds) {
        this.iterationIds = iterationIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteIterationsV4RequestBody that = (BatchDeleteIterationsV4RequestBody) obj;
        return Objects.equals(this.iterationIds, that.iterationIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iterationIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIterationsV4RequestBody {\n");
        sb.append("    iterationIds: ").append(toIndentedString(iterationIds)).append("\n");
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
