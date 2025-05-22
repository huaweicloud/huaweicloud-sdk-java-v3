package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单元测试报告
 */
public class ShowReportSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private Integer buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    private String stageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Integer success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failures")

    private Integer failures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private Integer errors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "others")

    private Integer others;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Integer executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "genrate_time")

    private String genrateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    public ShowReportSummary withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务编号
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowReportSummary withBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
        return this;
    }

    /**
     * 构建编号
     * @return buildNo
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public ShowReportSummary withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * 步骤名称，对应构建步骤，例如stage2
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public ShowReportSummary withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 报告编号
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public ShowReportSummary withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowReportSummary withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * 成功数量
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public ShowReportSummary withFailures(Integer failures) {
        this.failures = failures;
        return this;
    }

    /**
     * 失败数量
     * @return failures
     */
    public Integer getFailures() {
        return failures;
    }

    public void setFailures(Integer failures) {
        this.failures = failures;
    }

    public ShowReportSummary withErrors(Integer errors) {
        this.errors = errors;
        return this;
    }

    /**
     * 错误数量
     * @return errors
     */
    public Integer getErrors() {
        return errors;
    }

    public void setErrors(Integer errors) {
        this.errors = errors;
    }

    public ShowReportSummary withOthers(Integer others) {
        this.others = others;
        return this;
    }

    /**
     * 其他
     * @return others
     */
    public Integer getOthers() {
        return others;
    }

    public void setOthers(Integer others) {
        this.others = others;
    }

    public ShowReportSummary withExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * 执行耗时
     * @return executionTime
     */
    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public ShowReportSummary withGenrateTime(String genrateTime) {
        this.genrateTime = genrateTime;
        return this;
    }

    /**
     * 生成时间
     * @return genrateTime
     */
    public String getGenrateTime() {
        return genrateTime;
    }

    public void setGenrateTime(String genrateTime) {
        this.genrateTime = genrateTime;
    }

    public ShowReportSummary withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 局点
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowReportSummary withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否通过
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportSummary that = (ShowReportSummary) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.buildNo, that.buildNo)
            && Objects.equals(this.stageName, that.stageName) && Objects.equals(this.rootId, that.rootId)
            && Objects.equals(this.total, that.total) && Objects.equals(this.success, that.success)
            && Objects.equals(this.failures, that.failures) && Objects.equals(this.errors, that.errors)
            && Objects.equals(this.others, that.others) && Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.genrateTime, that.genrateTime) && Objects.equals(this.region, that.region)
            && Objects.equals(this.isSuccess, that.isSuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            buildNo,
            stageName,
            rootId,
            total,
            success,
            failures,
            errors,
            others,
            executionTime,
            genrateTime,
            region,
            isSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportSummary {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    others: ").append(toIndentedString(others)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    genrateTime: ").append(toIndentedString(genrateTime)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
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
