package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.QueryCompareResultReq;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量查询对比结果请求体。
 */
public class BatchQueryCompareResultReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<QueryCompareResultReq> jobs = new ArrayList<>();
    
    public BatchQueryCompareResultReq withJobs(List<QueryCompareResultReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchQueryCompareResultReq addJobsItem(QueryCompareResultReq jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchQueryCompareResultReq withJobs(Consumer<List<QueryCompareResultReq>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量查询对比结果请求列表。默认查询对比任务列表。查询具体对比任务的结果，需要指定compare_task_id。
     * @return jobs
     */
    public List<QueryCompareResultReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<QueryCompareResultReq> jobs) {
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
        BatchQueryCompareResultReq batchQueryCompareResultReq = (BatchQueryCompareResultReq) o;
        return Objects.equals(this.jobs, batchQueryCompareResultReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchQueryCompareResultReq {\n");
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

