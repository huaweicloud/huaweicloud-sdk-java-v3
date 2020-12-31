package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.ModifyJobReq;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量修改任务请求体
 */
public class BatchModifyJobReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<ModifyJobReq> jobs = new ArrayList<>();
    
    public BatchModifyJobReq withJobs(List<ModifyJobReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchModifyJobReq addJobsItem(ModifyJobReq jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchModifyJobReq withJobs(Consumer<List<ModifyJobReq>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 修改任务请求体
     * @return jobs
     */
    public List<ModifyJobReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<ModifyJobReq> jobs) {
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
        BatchModifyJobReq batchModifyJobReq = (BatchModifyJobReq) o;
        return Objects.equals(this.jobs, batchModifyJobReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifyJobReq {\n");
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

