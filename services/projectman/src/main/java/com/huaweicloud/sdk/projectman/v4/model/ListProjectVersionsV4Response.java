package com.huaweicloud.sdk.projectman.v4.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectVersionsV4ResponseBodyIterations;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListProjectVersionsV4Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iterations")
    
    private List<ListProjectVersionsV4ResponseBodyIterations> iterations = null;
    
    public ListProjectVersionsV4Response withTotal(Integer total) {
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

    public ListProjectVersionsV4Response withIterations(List<ListProjectVersionsV4ResponseBodyIterations> iterations) {
        this.iterations = iterations;
        return this;
    }

    
    public ListProjectVersionsV4Response addIterationsItem(ListProjectVersionsV4ResponseBodyIterations iterationsItem) {
        if (this.iterations == null) {
            this.iterations = new ArrayList<>();
        }
        this.iterations.add(iterationsItem);
        return this;
    }

    public ListProjectVersionsV4Response withIterations(Consumer<List<ListProjectVersionsV4ResponseBodyIterations>> iterationsSetter) {
        if(this.iterations == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectVersionsV4Response listProjectVersionsV4Response = (ListProjectVersionsV4Response) o;
        return Objects.equals(this.total, listProjectVersionsV4Response.total) &&
            Objects.equals(this.iterations, listProjectVersionsV4Response.iterations);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, iterations);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectVersionsV4Response {\n");
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

