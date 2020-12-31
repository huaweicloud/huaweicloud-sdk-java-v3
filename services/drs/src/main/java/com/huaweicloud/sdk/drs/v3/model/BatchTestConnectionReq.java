package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.TestEndPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量测试连接任务请求体
 */
public class BatchTestConnectionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<TestEndPoint> jobs = new ArrayList<>();
    
    public BatchTestConnectionReq withJobs(List<TestEndPoint> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchTestConnectionReq addJobsItem(TestEndPoint jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchTestConnectionReq withJobs(Consumer<List<TestEndPoint>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量测试连接请求列表。
     * @return jobs
     */
    public List<TestEndPoint> getJobs() {
        return jobs;
    }

    public void setJobs(List<TestEndPoint> jobs) {
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
        BatchTestConnectionReq batchTestConnectionReq = (BatchTestConnectionReq) o;
        return Objects.equals(this.jobs, batchTestConnectionReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTestConnectionReq {\n");
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

