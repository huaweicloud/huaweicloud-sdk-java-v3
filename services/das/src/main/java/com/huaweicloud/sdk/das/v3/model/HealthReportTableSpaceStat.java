package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportTableSpaceStat
 */
public class HealthReportTableSpaceStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_top")

    private List<HealthReportTableSpaceInfo> sizeTop = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_top")

    private List<HealthReportTableSpaceInfo> rowsTop = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_incr_top")

    private List<HealthReportTableSpaceIncrInfo> sizeIncrTop = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_incr_top")

    private List<HealthReportTableSpaceIncrInfo> rowsIncrTop = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyze_success")

    private Boolean analyzeSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public HealthReportTableSpaceStat withSizeTop(List<HealthReportTableSpaceInfo> sizeTop) {
        this.sizeTop = sizeTop;
        return this;
    }

    public HealthReportTableSpaceStat addSizeTopItem(HealthReportTableSpaceInfo sizeTopItem) {
        if (this.sizeTop == null) {
            this.sizeTop = new ArrayList<>();
        }
        this.sizeTop.add(sizeTopItem);
        return this;
    }

    public HealthReportTableSpaceStat withSizeTop(Consumer<List<HealthReportTableSpaceInfo>> sizeTopSetter) {
        if (this.sizeTop == null) {
            this.sizeTop = new ArrayList<>();
        }
        sizeTopSetter.accept(this.sizeTop);
        return this;
    }

    /**
     * 表大小Top列表。
     * @return sizeTop
     */
    public List<HealthReportTableSpaceInfo> getSizeTop() {
        return sizeTop;
    }

    public void setSizeTop(List<HealthReportTableSpaceInfo> sizeTop) {
        this.sizeTop = sizeTop;
    }

    public HealthReportTableSpaceStat withRowsTop(List<HealthReportTableSpaceInfo> rowsTop) {
        this.rowsTop = rowsTop;
        return this;
    }

    public HealthReportTableSpaceStat addRowsTopItem(HealthReportTableSpaceInfo rowsTopItem) {
        if (this.rowsTop == null) {
            this.rowsTop = new ArrayList<>();
        }
        this.rowsTop.add(rowsTopItem);
        return this;
    }

    public HealthReportTableSpaceStat withRowsTop(Consumer<List<HealthReportTableSpaceInfo>> rowsTopSetter) {
        if (this.rowsTop == null) {
            this.rowsTop = new ArrayList<>();
        }
        rowsTopSetter.accept(this.rowsTop);
        return this;
    }

    /**
     * 表行数量Top列表。
     * @return rowsTop
     */
    public List<HealthReportTableSpaceInfo> getRowsTop() {
        return rowsTop;
    }

    public void setRowsTop(List<HealthReportTableSpaceInfo> rowsTop) {
        this.rowsTop = rowsTop;
    }

    public HealthReportTableSpaceStat withSizeIncrTop(List<HealthReportTableSpaceIncrInfo> sizeIncrTop) {
        this.sizeIncrTop = sizeIncrTop;
        return this;
    }

    public HealthReportTableSpaceStat addSizeIncrTopItem(HealthReportTableSpaceIncrInfo sizeIncrTopItem) {
        if (this.sizeIncrTop == null) {
            this.sizeIncrTop = new ArrayList<>();
        }
        this.sizeIncrTop.add(sizeIncrTopItem);
        return this;
    }

    public HealthReportTableSpaceStat withSizeIncrTop(
        Consumer<List<HealthReportTableSpaceIncrInfo>> sizeIncrTopSetter) {
        if (this.sizeIncrTop == null) {
            this.sizeIncrTop = new ArrayList<>();
        }
        sizeIncrTopSetter.accept(this.sizeIncrTop);
        return this;
    }

    /**
     * 表大小增长Top列表。
     * @return sizeIncrTop
     */
    public List<HealthReportTableSpaceIncrInfo> getSizeIncrTop() {
        return sizeIncrTop;
    }

    public void setSizeIncrTop(List<HealthReportTableSpaceIncrInfo> sizeIncrTop) {
        this.sizeIncrTop = sizeIncrTop;
    }

    public HealthReportTableSpaceStat withRowsIncrTop(List<HealthReportTableSpaceIncrInfo> rowsIncrTop) {
        this.rowsIncrTop = rowsIncrTop;
        return this;
    }

    public HealthReportTableSpaceStat addRowsIncrTopItem(HealthReportTableSpaceIncrInfo rowsIncrTopItem) {
        if (this.rowsIncrTop == null) {
            this.rowsIncrTop = new ArrayList<>();
        }
        this.rowsIncrTop.add(rowsIncrTopItem);
        return this;
    }

    public HealthReportTableSpaceStat withRowsIncrTop(
        Consumer<List<HealthReportTableSpaceIncrInfo>> rowsIncrTopSetter) {
        if (this.rowsIncrTop == null) {
            this.rowsIncrTop = new ArrayList<>();
        }
        rowsIncrTopSetter.accept(this.rowsIncrTop);
        return this;
    }

    /**
     * 表行数量增长Top列表。
     * @return rowsIncrTop
     */
    public List<HealthReportTableSpaceIncrInfo> getRowsIncrTop() {
        return rowsIncrTop;
    }

    public void setRowsIncrTop(List<HealthReportTableSpaceIncrInfo> rowsIncrTop) {
        this.rowsIncrTop = rowsIncrTop;
    }

    public HealthReportTableSpaceStat withAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
        return this;
    }

    /**
     * 统计分析是否成功。
     * @return analyzeSuccess
     */
    public Boolean getAnalyzeSuccess() {
        return analyzeSuccess;
    }

    public void setAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
    }

    public HealthReportTableSpaceStat withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportTableSpaceStat that = (HealthReportTableSpaceStat) obj;
        return Objects.equals(this.sizeTop, that.sizeTop) && Objects.equals(this.rowsTop, that.rowsTop)
            && Objects.equals(this.sizeIncrTop, that.sizeIncrTop) && Objects.equals(this.rowsIncrTop, that.rowsIncrTop)
            && Objects.equals(this.analyzeSuccess, that.analyzeSuccess)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeTop, rowsTop, sizeIncrTop, rowsIncrTop, analyzeSuccess, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceStat {\n");
        sb.append("    sizeTop: ").append(toIndentedString(sizeTop)).append("\n");
        sb.append("    rowsTop: ").append(toIndentedString(rowsTop)).append("\n");
        sb.append("    sizeIncrTop: ").append(toIndentedString(sizeIncrTop)).append("\n");
        sb.append("    rowsIncrTop: ").append(toIndentedString(rowsIncrTop)).append("\n");
        sb.append("    analyzeSuccess: ").append(toIndentedString(analyzeSuccess)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
