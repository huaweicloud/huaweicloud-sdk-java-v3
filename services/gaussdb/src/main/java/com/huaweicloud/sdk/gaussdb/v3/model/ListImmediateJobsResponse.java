package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.TaskDetailInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListImmediateJobsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    
    private List<TaskDetailInfo> jobs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListImmediateJobsResponse withJobs(List<TaskDetailInfo> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public ListImmediateJobsResponse addJobsItem(TaskDetailInfo jobsItem) {
        if(this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListImmediateJobsResponse withJobs(Consumer<List<TaskDetailInfo>> jobsSetter) {
        if(this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 任务详情。
     * @return jobs
     */
    public List<TaskDetailInfo> getJobs() {
        return jobs;
    }

    public void setJobs(List<TaskDetailInfo> jobs) {
        this.jobs = jobs;
    }

    

    public ListImmediateJobsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 任务总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListImmediateJobsResponse listImmediateJobsResponse = (ListImmediateJobsResponse) o;
        return Objects.equals(this.jobs, listImmediateJobsResponse.jobs) &&
            Objects.equals(this.totalCount, listImmediateJobsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImmediateJobsResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

