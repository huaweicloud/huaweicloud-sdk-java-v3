package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ListFunctionAsMetricResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<FunctionMetric> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Long nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListFunctionAsMetricResponse withValues(List<FunctionMetric> values) {
        this.values = values;
        return this;
    }

    public ListFunctionAsMetricResponse addValuesItem(FunctionMetric valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ListFunctionAsMetricResponse withValues(Consumer<List<FunctionMetric>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 函数Urn及其指标数
     * @return values
     */
    public List<FunctionMetric> getValues() {
        return values;
    }

    public void setValues(List<FunctionMetric> values) {
        this.values = values;
    }

    public ListFunctionAsMetricResponse withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下次读取位置
     * @return nextMarker
     */
    public Long getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListFunctionAsMetricResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 返回函数总数
     * @return count
     */
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
        ListFunctionAsMetricResponse listFunctionAsMetricResponse = (ListFunctionAsMetricResponse) o;
        return Objects.equals(this.values, listFunctionAsMetricResponse.values)
            && Objects.equals(this.nextMarker, listFunctionAsMetricResponse.nextMarker)
            && Objects.equals(this.count, listFunctionAsMetricResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, nextMarker, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionAsMetricResponse {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
