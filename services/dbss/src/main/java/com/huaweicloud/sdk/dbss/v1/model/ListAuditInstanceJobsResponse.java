package com.huaweicloud.sdk.dbss.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.JobBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAuditInstanceJobsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    
    private List<JobBean> jobs = null;
    
    public ListAuditInstanceJobsResponse withJobs(List<JobBean> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public ListAuditInstanceJobsResponse addJobsItem(JobBean jobsItem) {
        if(this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListAuditInstanceJobsResponse withJobs(Consumer<List<JobBean>> jobsSetter) {
        if(this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 实例创建任务列表
     * @return jobs
     */
    public List<JobBean> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobBean> jobs) {
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
        ListAuditInstanceJobsResponse listAuditInstanceJobsResponse = (ListAuditInstanceJobsResponse) o;
        return Objects.equals(this.jobs, listAuditInstanceJobsResponse.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditInstanceJobsResponse {\n");
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

