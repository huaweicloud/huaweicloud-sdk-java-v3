package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GenerateReportInfo
 */
public class GenerateReportInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workpiece_type")

    private String workpieceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_dim_row")

    private String analysisDimRow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_dim_column")

    private String compareDimColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private ReportFilter filter;

    public GenerateReportInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 报表名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenerateReportInfo withWorkpieceType(String workpieceType) {
        this.workpieceType = workpieceType;
        return this;
    }

    /**
     * 工件类型(用例：case,测试套：suite)
     * @return workpieceType
     */
    public String getWorkpieceType() {
        return workpieceType;
    }

    public void setWorkpieceType(String workpieceType) {
        this.workpieceType = workpieceType;
    }

    public GenerateReportInfo withAnalysisDimRow(String analysisDimRow) {
        this.analysisDimRow = analysisDimRow;
        return this;
    }

    /**
     * 分析维度
     * @return analysisDimRow
     */
    public String getAnalysisDimRow() {
        return analysisDimRow;
    }

    public void setAnalysisDimRow(String analysisDimRow) {
        this.analysisDimRow = analysisDimRow;
    }

    public GenerateReportInfo withCompareDimColumn(String compareDimColumn) {
        this.compareDimColumn = compareDimColumn;
        return this;
    }

    /**
     * 对比维度
     * @return compareDimColumn
     */
    public String getCompareDimColumn() {
        return compareDimColumn;
    }

    public void setCompareDimColumn(String compareDimColumn) {
        this.compareDimColumn = compareDimColumn;
    }

    public GenerateReportInfo withFilter(ReportFilter filter) {
        this.filter = filter;
        return this;
    }

    public GenerateReportInfo withFilter(Consumer<ReportFilter> filterSetter) {
        if (this.filter == null) {
            this.filter = new ReportFilter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public ReportFilter getFilter() {
        return filter;
    }

    public void setFilter(ReportFilter filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateReportInfo generateReportInfo = (GenerateReportInfo) o;
        return Objects.equals(this.name, generateReportInfo.name)
            && Objects.equals(this.workpieceType, generateReportInfo.workpieceType)
            && Objects.equals(this.analysisDimRow, generateReportInfo.analysisDimRow)
            && Objects.equals(this.compareDimColumn, generateReportInfo.compareDimColumn)
            && Objects.equals(this.filter, generateReportInfo.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workpieceType, analysisDimRow, compareDimColumn, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateReportInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workpieceType: ").append(toIndentedString(workpieceType)).append("\n");
        sb.append("    analysisDimRow: ").append(toIndentedString(analysisDimRow)).append("\n");
        sb.append("    compareDimColumn: ").append(toIndentedString(compareDimColumn)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
