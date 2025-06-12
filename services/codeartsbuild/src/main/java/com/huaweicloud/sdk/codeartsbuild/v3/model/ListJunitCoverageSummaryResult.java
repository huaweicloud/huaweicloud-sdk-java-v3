package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回结果
 */
public class ListJunitCoverageSummaryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_summary_list")

    private List<ListJunitCoverageSummaryResultUnitSummaryList> unitSummaryList = null;

    public ListJunitCoverageSummaryResult withUnitSummaryList(
        List<ListJunitCoverageSummaryResultUnitSummaryList> unitSummaryList) {
        this.unitSummaryList = unitSummaryList;
        return this;
    }

    public ListJunitCoverageSummaryResult addUnitSummaryListItem(
        ListJunitCoverageSummaryResultUnitSummaryList unitSummaryListItem) {
        if (this.unitSummaryList == null) {
            this.unitSummaryList = new ArrayList<>();
        }
        this.unitSummaryList.add(unitSummaryListItem);
        return this;
    }

    public ListJunitCoverageSummaryResult withUnitSummaryList(
        Consumer<List<ListJunitCoverageSummaryResultUnitSummaryList>> unitSummaryListSetter) {
        if (this.unitSummaryList == null) {
            this.unitSummaryList = new ArrayList<>();
        }
        unitSummaryListSetter.accept(this.unitSummaryList);
        return this;
    }

    /**
     * 单元测试覆盖率报告列表
     * @return unitSummaryList
     */
    public List<ListJunitCoverageSummaryResultUnitSummaryList> getUnitSummaryList() {
        return unitSummaryList;
    }

    public void setUnitSummaryList(List<ListJunitCoverageSummaryResultUnitSummaryList> unitSummaryList) {
        this.unitSummaryList = unitSummaryList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJunitCoverageSummaryResult that = (ListJunitCoverageSummaryResult) obj;
        return Objects.equals(this.unitSummaryList, that.unitSummaryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitSummaryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJunitCoverageSummaryResult {\n");
        sb.append("    unitSummaryList: ").append(toIndentedString(unitSummaryList)).append("\n");
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
