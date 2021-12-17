package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class StartJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Integer parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtu")

    private Integer rtu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_savepoint")

    private Boolean resumeSavepoint;

    public StartJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 作业ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StartJobRequest withParallel(Integer parallel) {
        this.parallel = parallel;
        return this;
    }

    /** 运行作业的并发度 minimum: 0 maximum: 1000
     * 
     * @return parallel */
    public Integer getParallel() {
        return parallel;
    }

    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    public StartJobRequest withRtu(Integer rtu) {
        this.rtu = rtu;
        return this;
    }

    /** 运行作业的RTU个数 minimum: 0 maximum: 1000
     * 
     * @return rtu */
    public Integer getRtu() {
        return rtu;
    }

    public void setRtu(Integer rtu) {
        this.rtu = rtu;
    }

    public StartJobRequest withResumeSavepoint(Boolean resumeSavepoint) {
        this.resumeSavepoint = resumeSavepoint;
        return this;
    }

    /** 运行作业使用历史缓存数据
     * 
     * @return resumeSavepoint */
    public Boolean getResumeSavepoint() {
        return resumeSavepoint;
    }

    public void setResumeSavepoint(Boolean resumeSavepoint) {
        this.resumeSavepoint = resumeSavepoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartJobRequest startJobRequest = (StartJobRequest) o;
        return Objects.equals(this.jobId, startJobRequest.jobId)
            && Objects.equals(this.parallel, startJobRequest.parallel) && Objects.equals(this.rtu, startJobRequest.rtu)
            && Objects.equals(this.resumeSavepoint, startJobRequest.resumeSavepoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, parallel, rtu, resumeSavepoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartJobRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("    rtu: ").append(toIndentedString(rtu)).append("\n");
        sb.append("    resumeSavepoint: ").append(toIndentedString(resumeSavepoint)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
