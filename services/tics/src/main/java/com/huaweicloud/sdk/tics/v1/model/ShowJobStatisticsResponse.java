package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_cnt")

    private Long jobCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ins_cnt")

    private Long jobInsCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ins_fail_cnt")

    private Long jobInsFailCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ins_intercept_cnt")

    private Long jobInsInterceptCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ins_success_cnt")

    private Long jobInsSuccessCnt;

    public ShowJobStatisticsResponse withJobCnt(Long jobCnt) {
        this.jobCnt = jobCnt;
        return this;
    }

    /**
     * 作业数量统计
     * @return jobCnt
     */
    public Long getJobCnt() {
        return jobCnt;
    }

    public void setJobCnt(Long jobCnt) {
        this.jobCnt = jobCnt;
    }

    public ShowJobStatisticsResponse withJobInsCnt(Long jobInsCnt) {
        this.jobInsCnt = jobInsCnt;
        return this;
    }

    /**
     * 作业实例次数
     * @return jobInsCnt
     */
    public Long getJobInsCnt() {
        return jobInsCnt;
    }

    public void setJobInsCnt(Long jobInsCnt) {
        this.jobInsCnt = jobInsCnt;
    }

    public ShowJobStatisticsResponse withJobInsFailCnt(Long jobInsFailCnt) {
        this.jobInsFailCnt = jobInsFailCnt;
        return this;
    }

    /**
     * 作业实例失败次数
     * @return jobInsFailCnt
     */
    public Long getJobInsFailCnt() {
        return jobInsFailCnt;
    }

    public void setJobInsFailCnt(Long jobInsFailCnt) {
        this.jobInsFailCnt = jobInsFailCnt;
    }

    public ShowJobStatisticsResponse withJobInsInterceptCnt(Long jobInsInterceptCnt) {
        this.jobInsInterceptCnt = jobInsInterceptCnt;
        return this;
    }

    /**
     * 作业实例拦截次数
     * @return jobInsInterceptCnt
     */
    public Long getJobInsInterceptCnt() {
        return jobInsInterceptCnt;
    }

    public void setJobInsInterceptCnt(Long jobInsInterceptCnt) {
        this.jobInsInterceptCnt = jobInsInterceptCnt;
    }

    public ShowJobStatisticsResponse withJobInsSuccessCnt(Long jobInsSuccessCnt) {
        this.jobInsSuccessCnt = jobInsSuccessCnt;
        return this;
    }

    /**
     * 作业实例成功次数
     * @return jobInsSuccessCnt
     */
    public Long getJobInsSuccessCnt() {
        return jobInsSuccessCnt;
    }

    public void setJobInsSuccessCnt(Long jobInsSuccessCnt) {
        this.jobInsSuccessCnt = jobInsSuccessCnt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobStatisticsResponse that = (ShowJobStatisticsResponse) obj;
        return Objects.equals(this.jobCnt, that.jobCnt) && Objects.equals(this.jobInsCnt, that.jobInsCnt)
            && Objects.equals(this.jobInsFailCnt, that.jobInsFailCnt)
            && Objects.equals(this.jobInsInterceptCnt, that.jobInsInterceptCnt)
            && Objects.equals(this.jobInsSuccessCnt, that.jobInsSuccessCnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobCnt, jobInsCnt, jobInsFailCnt, jobInsInterceptCnt, jobInsSuccessCnt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobStatisticsResponse {\n");
        sb.append("    jobCnt: ").append(toIndentedString(jobCnt)).append("\n");
        sb.append("    jobInsCnt: ").append(toIndentedString(jobInsCnt)).append("\n");
        sb.append("    jobInsFailCnt: ").append(toIndentedString(jobInsFailCnt)).append("\n");
        sb.append("    jobInsInterceptCnt: ").append(toIndentedString(jobInsInterceptCnt)).append("\n");
        sb.append("    jobInsSuccessCnt: ").append(toIndentedString(jobInsSuccessCnt)).append("\n");
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
