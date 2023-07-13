package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合或NULL
 */
public class CustomReportListVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private ReportFilter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workpiece_type")

    private String workpieceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_dimension")

    private String analysisDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_dimension")

    private String compareDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_data")

    private List<ReportChartDataVo> chartData = null;

    public CustomReportListVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 报表id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomReportListVo withName(String name) {
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

    public CustomReportListVo withFilter(ReportFilter filter) {
        this.filter = filter;
        return this;
    }

    public CustomReportListVo withFilter(Consumer<ReportFilter> filterSetter) {
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

    public CustomReportListVo withWorkpieceType(String workpieceType) {
        this.workpieceType = workpieceType;
        return this;
    }

    /**
     * 工件类型(用例：case,测试套：task)
     * @return workpieceType
     */
    public String getWorkpieceType() {
        return workpieceType;
    }

    public void setWorkpieceType(String workpieceType) {
        this.workpieceType = workpieceType;
    }

    public CustomReportListVo withAnalysisDimension(String analysisDimension) {
        this.analysisDimension = analysisDimension;
        return this;
    }

    /**
     * 分析维度
     * @return analysisDimension
     */
    public String getAnalysisDimension() {
        return analysisDimension;
    }

    public void setAnalysisDimension(String analysisDimension) {
        this.analysisDimension = analysisDimension;
    }

    public CustomReportListVo withCompareDimension(String compareDimension) {
        this.compareDimension = compareDimension;
        return this;
    }

    /**
     * 对比维度
     * @return compareDimension
     */
    public String getCompareDimension() {
        return compareDimension;
    }

    public void setCompareDimension(String compareDimension) {
        this.compareDimension = compareDimension;
    }

    public CustomReportListVo withChartData(List<ReportChartDataVo> chartData) {
        this.chartData = chartData;
        return this;
    }

    public CustomReportListVo addChartDataItem(ReportChartDataVo chartDataItem) {
        if (this.chartData == null) {
            this.chartData = new ArrayList<>();
        }
        this.chartData.add(chartDataItem);
        return this;
    }

    public CustomReportListVo withChartData(Consumer<List<ReportChartDataVo>> chartDataSetter) {
        if (this.chartData == null) {
            this.chartData = new ArrayList<>();
        }
        chartDataSetter.accept(this.chartData);
        return this;
    }

    /**
     * 报表数据
     * @return chartData
     */
    public List<ReportChartDataVo> getChartData() {
        return chartData;
    }

    public void setChartData(List<ReportChartDataVo> chartData) {
        this.chartData = chartData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomReportListVo that = (CustomReportListVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.workpieceType, that.workpieceType)
            && Objects.equals(this.analysisDimension, that.analysisDimension)
            && Objects.equals(this.compareDimension, that.compareDimension)
            && Objects.equals(this.chartData, that.chartData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, filter, workpieceType, analysisDimension, compareDimension, chartData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomReportListVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    workpieceType: ").append(toIndentedString(workpieceType)).append("\n");
        sb.append("    analysisDimension: ").append(toIndentedString(analysisDimension)).append("\n");
        sb.append("    compareDimension: ").append(toIndentedString(compareDimension)).append("\n");
        sb.append("    chartData: ").append(toIndentedString(chartData)).append("\n");
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
