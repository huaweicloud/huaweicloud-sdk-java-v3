package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowHealthObjectCompareJobOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_result")

    private List<ObjectsHealthCompareOverviewInfo> compareResult = null;

    public ShowHealthObjectCompareJobOverviewResponse withCompareResult(
        List<ObjectsHealthCompareOverviewInfo> compareResult) {
        this.compareResult = compareResult;
        return this;
    }

    public ShowHealthObjectCompareJobOverviewResponse addCompareResultItem(
        ObjectsHealthCompareOverviewInfo compareResultItem) {
        if (this.compareResult == null) {
            this.compareResult = new ArrayList<>();
        }
        this.compareResult.add(compareResultItem);
        return this;
    }

    public ShowHealthObjectCompareJobOverviewResponse withCompareResult(
        Consumer<List<ObjectsHealthCompareOverviewInfo>> compareResultSetter) {
        if (this.compareResult == null) {
            this.compareResult = new ArrayList<>();
        }
        compareResultSetter.accept(this.compareResult);
        return this;
    }

    /**
     * 健康对比对象级对比结果。
     * @return compareResult
     */
    public List<ObjectsHealthCompareOverviewInfo> getCompareResult() {
        return compareResult;
    }

    public void setCompareResult(List<ObjectsHealthCompareOverviewInfo> compareResult) {
        this.compareResult = compareResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHealthObjectCompareJobOverviewResponse that = (ShowHealthObjectCompareJobOverviewResponse) obj;
        return Objects.equals(this.compareResult, that.compareResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthObjectCompareJobOverviewResponse {\n");
        sb.append("    compareResult: ").append(toIndentedString(compareResult)).append("\n");
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
