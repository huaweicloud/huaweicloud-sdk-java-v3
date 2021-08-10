package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListFunctionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functions")

    private List<ListFunctionResult> functions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Integer nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListFunctionsResponse withFunctions(List<ListFunctionResult> functions) {
        this.functions = functions;
        return this;
    }

    public ListFunctionsResponse addFunctionsItem(ListFunctionResult functionsItem) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(functionsItem);
        return this;
    }

    public ListFunctionsResponse withFunctions(Consumer<List<ListFunctionResult>> functionsSetter) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        functionsSetter.accept(this.functions);
        return this;
    }

    /** 函数列表。
     * 
     * @return functions */
    public List<ListFunctionResult> getFunctions() {
        return functions;
    }

    public void setFunctions(List<ListFunctionResult> functions) {
        this.functions = functions;
    }

    public ListFunctionsResponse withNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /** 函数下次记录读取位置。
     * 
     * @return nextMarker */
    public Integer getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListFunctionsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /** 满足查询条件的函数总数。
     * 
     * @return count */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionsResponse listFunctionsResponse = (ListFunctionsResponse) o;
        return Objects.equals(this.functions, listFunctionsResponse.functions)
            && Objects.equals(this.nextMarker, listFunctionsResponse.nextMarker)
            && Objects.equals(this.count, listFunctionsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functions, nextMarker, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionsResponse {\n");
        sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
