package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.PreCheckInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量预检查请求体
 */
public class BatchPrecheckReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<PreCheckInfo> jobs = null;
    
    public BatchPrecheckReq withJobs(List<PreCheckInfo> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchPrecheckReq addJobsItem(PreCheckInfo jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchPrecheckReq withJobs(Consumer<List<PreCheckInfo>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量预检查请求列表
     * @return jobs
     */
    public List<PreCheckInfo> getJobs() {
        return jobs;
    }

    public void setJobs(List<PreCheckInfo> jobs) {
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
        BatchPrecheckReq batchPrecheckReq = (BatchPrecheckReq) o;
        return Objects.equals(this.jobs, batchPrecheckReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPrecheckReq {\n");
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

