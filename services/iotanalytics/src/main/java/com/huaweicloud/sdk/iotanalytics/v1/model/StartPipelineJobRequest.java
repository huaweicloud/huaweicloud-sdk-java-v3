package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class StartPipelineJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Integer parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtu")

    private Integer rtu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_savepoint")

    private Boolean resumeSavepoint;

    public StartPipelineJobRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 管道ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public StartPipelineJobRequest withParallel(Integer parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 运行管道的并发度
     * minimum: 0
     * maximum: 1000
     * @return parallel
     */
    public Integer getParallel() {
        return parallel;
    }

    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    public StartPipelineJobRequest withRtu(Integer rtu) {
        this.rtu = rtu;
        return this;
    }

    /**
     * 运行管道的RTU个数
     * minimum: 0
     * maximum: 1000
     * @return rtu
     */
    public Integer getRtu() {
        return rtu;
    }

    public void setRtu(Integer rtu) {
        this.rtu = rtu;
    }

    public StartPipelineJobRequest withResumeSavepoint(Boolean resumeSavepoint) {
        this.resumeSavepoint = resumeSavepoint;
        return this;
    }

    /**
     * 运行管道作业使用历史缓存数据
     * @return resumeSavepoint
     */
    public Boolean getResumeSavepoint() {
        return resumeSavepoint;
    }

    public void setResumeSavepoint(Boolean resumeSavepoint) {
        this.resumeSavepoint = resumeSavepoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartPipelineJobRequest that = (StartPipelineJobRequest) obj;
        return Objects.equals(this.pipelineId, that.pipelineId) && Objects.equals(this.parallel, that.parallel)
            && Objects.equals(this.rtu, that.rtu) && Objects.equals(this.resumeSavepoint, that.resumeSavepoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId, parallel, rtu, resumeSavepoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartPipelineJobRequest {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("    rtu: ").append(toIndentedString(rtu)).append("\n");
        sb.append("    resumeSavepoint: ").append(toIndentedString(resumeSavepoint)).append("\n");
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
