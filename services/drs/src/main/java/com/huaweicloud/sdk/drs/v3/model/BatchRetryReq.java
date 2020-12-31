package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.RetryInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量续传任务请求列表
 */
public class BatchRetryReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<RetryInfo> jobs = new ArrayList<>();
    
    public BatchRetryReq withJobs(List<RetryInfo> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchRetryReq addJobsItem(RetryInfo jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchRetryReq withJobs(Consumer<List<RetryInfo>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量续传任务请求列表
     * @return jobs
     */
    public List<RetryInfo> getJobs() {
        return jobs;
    }

    public void setJobs(List<RetryInfo> jobs) {
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
        BatchRetryReq batchRetryReq = (BatchRetryReq) o;
        return Objects.equals(this.jobs, batchRetryReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRetryReq {\n");
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

