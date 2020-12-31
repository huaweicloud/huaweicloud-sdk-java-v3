package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.CheckDataTransformationReq;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量数据加工规则请求体
 */
public class BatchDataTransformationReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<CheckDataTransformationReq> jobs = new ArrayList<>();
    
    public BatchDataTransformationReq withJobs(List<CheckDataTransformationReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public BatchDataTransformationReq addJobsItem(CheckDataTransformationReq jobsItem) {
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchDataTransformationReq withJobs(Consumer<List<CheckDataTransformationReq>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量数据加工规则请求列表
     * @return jobs
     */
    public List<CheckDataTransformationReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<CheckDataTransformationReq> jobs) {
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
        BatchDataTransformationReq batchDataTransformationReq = (BatchDataTransformationReq) o;
        return Objects.equals(this.jobs, batchDataTransformationReq.jobs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDataTransformationReq {\n");
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

