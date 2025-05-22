package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class ShowReportSummaryBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private ShowReportSummary summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_summarys")

    private List<ShowReportSummary> subSummarys = null;

    public ShowReportSummaryBodyResult withSummary(ShowReportSummary summary) {
        this.summary = summary;
        return this;
    }

    public ShowReportSummaryBodyResult withSummary(Consumer<ShowReportSummary> summarySetter) {
        if (this.summary == null) {
            this.summary = new ShowReportSummary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public ShowReportSummary getSummary() {
        return summary;
    }

    public void setSummary(ShowReportSummary summary) {
        this.summary = summary;
    }

    public ShowReportSummaryBodyResult withSubSummarys(List<ShowReportSummary> subSummarys) {
        this.subSummarys = subSummarys;
        return this;
    }

    public ShowReportSummaryBodyResult addSubSummarysItem(ShowReportSummary subSummarysItem) {
        if (this.subSummarys == null) {
            this.subSummarys = new ArrayList<>();
        }
        this.subSummarys.add(subSummarysItem);
        return this;
    }

    public ShowReportSummaryBodyResult withSubSummarys(Consumer<List<ShowReportSummary>> subSummarysSetter) {
        if (this.subSummarys == null) {
            this.subSummarys = new ArrayList<>();
        }
        subSummarysSetter.accept(this.subSummarys);
        return this;
    }

    /**
     * 单元测试报告列表
     * @return subSummarys
     */
    public List<ShowReportSummary> getSubSummarys() {
        return subSummarys;
    }

    public void setSubSummarys(List<ShowReportSummary> subSummarys) {
        this.subSummarys = subSummarys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportSummaryBodyResult that = (ShowReportSummaryBodyResult) obj;
        return Objects.equals(this.summary, that.summary) && Objects.equals(this.subSummarys, that.subSummarys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, subSummarys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportSummaryBodyResult {\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    subSummarys: ").append(toIndentedString(subSummarys)).append("\n");
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
