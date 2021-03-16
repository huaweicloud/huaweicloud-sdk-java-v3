package com.huaweicloud.sdk.dgc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.JobInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListJobsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<JobInfo> jobs = null;
    
    public ListJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListJobsResponse withJobs(List<JobInfo> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public ListJobsResponse addJobsItem(JobInfo jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public ListJobsResponse withJobs(Consumer<List<JobInfo>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    public List<JobInfo> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobInfo> jobs) {
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
        return Objects.equals(this.total, listJobsResponse.total) &&
            Objects.equals(this.jobs, listJobsResponse.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

