package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建成功率
 */
public class JobSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_success_ratio")

    private Integer avgSuccessRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private Integer buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_total")

    private Integer jobTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_total")

    private String versionTotal;

    public JobSummary withAvgSuccessRatio(Integer avgSuccessRatio) {
        this.avgSuccessRatio = avgSuccessRatio;
        return this;
    }

    /**
     * 构建成功率
     * @return avgSuccessRatio
     */
    public Integer getAvgSuccessRatio() {
        return avgSuccessRatio;
    }

    public void setAvgSuccessRatio(Integer avgSuccessRatio) {
        this.avgSuccessRatio = avgSuccessRatio;
    }

    public JobSummary withBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
        return this;
    }

    /**
     * 构建总时长
     * @return buildNo
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public JobSummary withJobTotal(Integer jobTotal) {
        this.jobTotal = jobTotal;
        return this;
    }

    /**
     * 任务总数
     * @return jobTotal
     */
    public Integer getJobTotal() {
        return jobTotal;
    }

    public void setJobTotal(Integer jobTotal) {
        this.jobTotal = jobTotal;
    }

    public JobSummary withVersionTotal(String versionTotal) {
        this.versionTotal = versionTotal;
        return this;
    }

    /**
     * 版本
     * @return versionTotal
     */
    public String getVersionTotal() {
        return versionTotal;
    }

    public void setVersionTotal(String versionTotal) {
        this.versionTotal = versionTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobSummary that = (JobSummary) obj;
        return Objects.equals(this.avgSuccessRatio, that.avgSuccessRatio) && Objects.equals(this.buildNo, that.buildNo)
            && Objects.equals(this.jobTotal, that.jobTotal) && Objects.equals(this.versionTotal, that.versionTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avgSuccessRatio, buildNo, jobTotal, versionTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobSummary {\n");
        sb.append("    avgSuccessRatio: ").append(toIndentedString(avgSuccessRatio)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    jobTotal: ").append(toIndentedString(jobTotal)).append("\n");
        sb.append("    versionTotal: ").append(toIndentedString(versionTotal)).append("\n");
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
