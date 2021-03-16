package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量查询RPO和RTO的请求体
 */
public class BatchQueryRpoAndRtoReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<String> jobs = null;
    
    public BatchQueryRpoAndRtoReq withJobs(List<String> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchQueryRpoAndRtoReq addJobsItem(String jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchQueryRpoAndRtoReq withJobs(Consumer<List<String>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量查询RPO和RTO的任务详情ID请求列表
     * @return jobs
     */
    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
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
        BatchQueryRpoAndRtoReq batchQueryRpoAndRtoReq = (BatchQueryRpoAndRtoReq) o;
        return Objects.equals(this.jobs, batchQueryRpoAndRtoReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchQueryRpoAndRtoReq {\n");
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

