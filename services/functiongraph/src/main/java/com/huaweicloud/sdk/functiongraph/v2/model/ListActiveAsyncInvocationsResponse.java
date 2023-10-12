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
public class ListActiveAsyncInvocationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocations")

    private List<ListFunctionAsyncInvocationsResult> invocations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Integer nextMarker;

    public ListActiveAsyncInvocationsResponse withInvocations(List<ListFunctionAsyncInvocationsResult> invocations) {
        this.invocations = invocations;
        return this;
    }

    public ListActiveAsyncInvocationsResponse addInvocationsItem(ListFunctionAsyncInvocationsResult invocationsItem) {
        if (this.invocations == null) {
            this.invocations = new ArrayList<>();
        }
        this.invocations.add(invocationsItem);
        return this;
    }

    public ListActiveAsyncInvocationsResponse withInvocations(
        Consumer<List<ListFunctionAsyncInvocationsResult>> invocationsSetter) {
        if (this.invocations == null) {
            this.invocations = new ArrayList<>();
        }
        invocationsSetter.accept(this.invocations);
        return this;
    }

    /**
     * 异步调用记录列表。
     * @return invocations
     */
    public List<ListFunctionAsyncInvocationsResult> getInvocations() {
        return invocations;
    }

    public void setInvocations(List<ListFunctionAsyncInvocationsResult> invocations) {
        this.invocations = invocations;
    }

    public ListActiveAsyncInvocationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询数据总条数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListActiveAsyncInvocationsResponse withNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 查询下一页的起始位置
     * @return nextMarker
     */
    public Integer getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListActiveAsyncInvocationsResponse that = (ListActiveAsyncInvocationsResponse) obj;
        return Objects.equals(this.invocations, that.invocations) && Objects.equals(this.count, that.count)
            && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocations, count, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListActiveAsyncInvocationsResponse {\n");
        sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
