package com.huaweicloud.sdk.workspace.v2.model;

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
public class ResizeDesktopResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ResizeDesktopJobResponse> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ResizeDesktopResponse withJobs(List<ResizeDesktopJobResponse> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ResizeDesktopResponse addJobsItem(ResizeDesktopJobResponse jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ResizeDesktopResponse withJobs(Consumer<List<ResizeDesktopJobResponse>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 按需桌面变更规格返回的任务信息（jobs字段后续会下线，请使用job_id字段）。
     * @return jobs
     */
    public List<ResizeDesktopJobResponse> getJobs() {
        return jobs;
    }

    public void setJobs(List<ResizeDesktopJobResponse> jobs) {
        this.jobs = jobs;
    }

    public ResizeDesktopResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 变更规格任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeDesktopResponse that = (ResizeDesktopResponse) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
