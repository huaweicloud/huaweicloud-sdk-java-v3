package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_count")

    private Integer jobCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ListJobsJobs> jobs = null;

    public ListJobsResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求发送是否成功。“true”表示请求发送成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListJobsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListJobsResponse withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    /**
     * 作业总个数。
     * @return jobCount
     */
    public Integer getJobCount() {
        return jobCount;
    }

    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    public ListJobsResponse withJobs(List<ListJobsJobs> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListJobsResponse addJobsItem(ListJobsJobs jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListJobsResponse withJobs(Consumer<List<ListJobsJobs>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 作业信息。具体参数请参见表jobs
     * @return jobs
     */
    public List<ListJobsJobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<ListJobsJobs> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobsResponse listJobsResponse = (ListJobsResponse) o;
        return Objects.equals(this.isSuccess, listJobsResponse.isSuccess)
            && Objects.equals(this.message, listJobsResponse.message)
            && Objects.equals(this.jobCount, listJobsResponse.jobCount)
            && Objects.equals(this.jobs, listJobsResponse.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobCount, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobCount: ").append(toIndentedString(jobCount)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
