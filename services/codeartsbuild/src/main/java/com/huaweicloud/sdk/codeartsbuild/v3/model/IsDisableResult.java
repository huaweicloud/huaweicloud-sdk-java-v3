package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 返回结果
 */
public class IsDisableResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbiddener")

    private String forbiddener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reson")

    private String reson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Integer disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_time")

    private BigDecimal forbiddenTime;

    public IsDisableResult withForbiddener(String forbiddener) {
        this.forbiddener = forbiddener;
        return this;
    }

    /**
     * 禁用者
     * @return forbiddener
     */
    public String getForbiddener() {
        return forbiddener;
    }

    public void setForbiddener(String forbiddener) {
        this.forbiddener = forbiddener;
    }

    public IsDisableResult withReson(String reson) {
        this.reson = reson;
        return this;
    }

    /**
     * 禁用描述
     * @return reson
     */
    public String getReson() {
        return reson;
    }

    public void setReson(String reson) {
        this.reson = reson;
    }

    public IsDisableResult withDisabled(Integer disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 禁用标识
     * @return disabled
     */
    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public IsDisableResult withJobId(String jobId) {
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

    public IsDisableResult withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 明文名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public IsDisableResult withForbiddenTime(BigDecimal forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
        return this;
    }

    /**
     * 禁用时间
     * @return forbiddenTime
     */
    public BigDecimal getForbiddenTime() {
        return forbiddenTime;
    }

    public void setForbiddenTime(BigDecimal forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsDisableResult that = (IsDisableResult) obj;
        return Objects.equals(this.forbiddener, that.forbiddener) && Objects.equals(this.reson, that.reson)
            && Objects.equals(this.disabled, that.disabled) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.forbiddenTime, that.forbiddenTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forbiddener, reson, disabled, jobId, jobName, forbiddenTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsDisableResult {\n");
        sb.append("    forbiddener: ").append(toIndentedString(forbiddener)).append("\n");
        sb.append("    reson: ").append(toIndentedString(reson)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    forbiddenTime: ").append(toIndentedString(forbiddenTime)).append("\n");
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
