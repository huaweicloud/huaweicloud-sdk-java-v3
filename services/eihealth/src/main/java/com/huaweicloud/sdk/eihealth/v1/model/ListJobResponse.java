package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<JobListDto> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private Integer runningCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_count")

    private Integer waitingCount;

    public ListJobResponse withJobs(List<JobListDto> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListJobResponse addJobsItem(JobListDto jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListJobResponse withJobs(Consumer<List<JobListDto>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 作业列表
     * @return jobs
     */
    public List<JobListDto> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobListDto> jobs) {
        this.jobs = jobs;
    }

    public ListJobResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 作业总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListJobResponse withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * **参数解释**： 运行中作业总数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public ListJobResponse withWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
        return this;
    }

    /**
     * **参数解释**： 等待中作业总数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return waitingCount
     */
    public Integer getWaitingCount() {
        return waitingCount;
    }

    public void setWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobResponse that = (ListJobResponse) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.count, that.count)
            && Objects.equals(this.runningCount, that.runningCount)
            && Objects.equals(this.waitingCount, that.waitingCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, count, runningCount, waitingCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    waitingCount: ").append(toIndentedString(waitingCount)).append("\n");
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
