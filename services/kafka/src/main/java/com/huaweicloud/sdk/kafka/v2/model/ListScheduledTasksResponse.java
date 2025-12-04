package com.huaweicloud.sdk.kafka.v2.model;

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
public class ListScheduledTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_count")

    private String jobCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ScheduledTaskEntity> jobs = null;

    public ListScheduledTasksResponse withJobCount(String jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    /**
     * **参数解释**： 任务总数。 **取值范围**： 不涉及。
     * @return jobCount
     */
    public String getJobCount() {
        return jobCount;
    }

    public void setJobCount(String jobCount) {
        this.jobCount = jobCount;
    }

    public ListScheduledTasksResponse withJobs(List<ScheduledTaskEntity> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListScheduledTasksResponse addJobsItem(ScheduledTaskEntity jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListScheduledTasksResponse withJobs(Consumer<List<ScheduledTaskEntity>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * **参数解释**： 任务列表。
     * @return jobs
     */
    public List<ScheduledTaskEntity> getJobs() {
        return jobs;
    }

    public void setJobs(List<ScheduledTaskEntity> jobs) {
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
        ListScheduledTasksResponse that = (ListScheduledTasksResponse) obj;
        return Objects.equals(this.jobCount, that.jobCount) && Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobCount, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTasksResponse {\n");
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
