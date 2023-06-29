package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListProjectIterationsV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterations")

    private List<ListProjectVersionsV4ResponseBodyIterations> iterations = null;

    public ListProjectIterationsV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 迭代总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListProjectIterationsV4Response withIterations(
        List<ListProjectVersionsV4ResponseBodyIterations> iterations) {
        this.iterations = iterations;
        return this;
    }

    public ListProjectIterationsV4Response addIterationsItem(
        ListProjectVersionsV4ResponseBodyIterations iterationsItem) {
        if (this.iterations == null) {
            this.iterations = new ArrayList<>();
        }
        this.iterations.add(iterationsItem);
        return this;
    }

    public ListProjectIterationsV4Response withIterations(
        Consumer<List<ListProjectVersionsV4ResponseBodyIterations>> iterationsSetter) {
        if (this.iterations == null) {
            this.iterations = new ArrayList<>();
        }
        iterationsSetter.accept(this.iterations);
        return this;
    }

    /**
     * 迭代信息
     * @return iterations
     */
    public List<ListProjectVersionsV4ResponseBodyIterations> getIterations() {
        return iterations;
    }

    public void setIterations(List<ListProjectVersionsV4ResponseBodyIterations> iterations) {
        this.iterations = iterations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectIterationsV4Response that = (ListProjectIterationsV4Response) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.iterations, that.iterations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, iterations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectIterationsV4Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
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
