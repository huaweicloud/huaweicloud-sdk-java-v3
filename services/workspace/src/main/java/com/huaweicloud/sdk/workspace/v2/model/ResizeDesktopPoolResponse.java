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
public class ResizeDesktopPoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ResizeDesktopPoolJobResponse> jobs = null;

    public ResizeDesktopPoolResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 创建云桌面总任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ResizeDesktopPoolResponse withJobs(List<ResizeDesktopPoolJobResponse> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ResizeDesktopPoolResponse addJobsItem(ResizeDesktopPoolJobResponse jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ResizeDesktopPoolResponse withJobs(Consumer<List<ResizeDesktopPoolJobResponse>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 按需桌面变更规格返回的任务信息。
     * @return jobs
     */
    public List<ResizeDesktopPoolJobResponse> getJobs() {
        return jobs;
    }

    public void setJobs(List<ResizeDesktopPoolJobResponse> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeDesktopPoolResponse that = (ResizeDesktopPoolResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopPoolResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
