package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 构建成功率
 */
public class ShowJobBuildSuccessRatioResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_success_count")

    private Integer totalSuccessCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_success_ratio_fraction")

    private String totalSuccessRatioFraction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "every_day_report")

    private List<ShowJobBuildSuccessRatioResultEveryDayReport> everyDayReport = null;

    public ShowJobBuildSuccessRatioResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobBuildSuccessRatioResult withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ShowJobBuildSuccessRatioResult withTotalSuccessCount(Integer totalSuccessCount) {
        this.totalSuccessCount = totalSuccessCount;
        return this;
    }

    /**
     * 构建成功总数
     * @return totalSuccessCount
     */
    public Integer getTotalSuccessCount() {
        return totalSuccessCount;
    }

    public void setTotalSuccessCount(Integer totalSuccessCount) {
        this.totalSuccessCount = totalSuccessCount;
    }

    public ShowJobBuildSuccessRatioResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 构建总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowJobBuildSuccessRatioResult withTotalSuccessRatioFraction(String totalSuccessRatioFraction) {
        this.totalSuccessRatioFraction = totalSuccessRatioFraction;
        return this;
    }

    /**
     * 总成功比率分数
     * @return totalSuccessRatioFraction
     */
    public String getTotalSuccessRatioFraction() {
        return totalSuccessRatioFraction;
    }

    public void setTotalSuccessRatioFraction(String totalSuccessRatioFraction) {
        this.totalSuccessRatioFraction = totalSuccessRatioFraction;
    }

    public ShowJobBuildSuccessRatioResult withEveryDayReport(
        List<ShowJobBuildSuccessRatioResultEveryDayReport> everyDayReport) {
        this.everyDayReport = everyDayReport;
        return this;
    }

    public ShowJobBuildSuccessRatioResult addEveryDayReportItem(
        ShowJobBuildSuccessRatioResultEveryDayReport everyDayReportItem) {
        if (this.everyDayReport == null) {
            this.everyDayReport = new ArrayList<>();
        }
        this.everyDayReport.add(everyDayReportItem);
        return this;
    }

    public ShowJobBuildSuccessRatioResult withEveryDayReport(
        Consumer<List<ShowJobBuildSuccessRatioResultEveryDayReport>> everyDayReportSetter) {
        if (this.everyDayReport == null) {
            this.everyDayReport = new ArrayList<>();
        }
        everyDayReportSetter.accept(this.everyDayReport);
        return this;
    }

    /**
     * 每日构建成功率
     * @return everyDayReport
     */
    public List<ShowJobBuildSuccessRatioResultEveryDayReport> getEveryDayReport() {
        return everyDayReport;
    }

    public void setEveryDayReport(List<ShowJobBuildSuccessRatioResultEveryDayReport> everyDayReport) {
        this.everyDayReport = everyDayReport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobBuildSuccessRatioResult that = (ShowJobBuildSuccessRatioResult) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.totalSuccessCount, that.totalSuccessCount)
            && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.totalSuccessRatioFraction, that.totalSuccessRatioFraction)
            && Objects.equals(this.everyDayReport, that.everyDayReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, branch, totalSuccessCount, totalCount, totalSuccessRatioFraction, everyDayReport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobBuildSuccessRatioResult {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    totalSuccessCount: ").append(toIndentedString(totalSuccessCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalSuccessRatioFraction: ").append(toIndentedString(totalSuccessRatioFraction)).append("\n");
        sb.append("    everyDayReport: ").append(toIndentedString(everyDayReport)).append("\n");
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
