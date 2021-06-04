package com.huaweicloud.sdk.cloudpipeline.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PipelineBuildResult
 */
public class PipelineBuildResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_id")
    
    private String buildId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elapse_time")
    
    private String elapseTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="outcome")
    
    private String outcome;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_id")
    
    private String pipelineId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_name")
    
    private String pipelineName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public PipelineBuildResult withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    


    /**
     * 执行ID
     * @return buildId
     */
    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    

    public PipelineBuildResult withElapseTime(String elapseTime) {
        this.elapseTime = elapseTime;
        return this;
    }

    


    /**
     * 运行耗时
     * @return elapseTime
     */
    public String getElapseTime() {
        return elapseTime;
    }

    public void setElapseTime(String elapseTime) {
        this.elapseTime = elapseTime;
    }

    

    public PipelineBuildResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 执行结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public PipelineBuildResult withOutcome(String outcome) {
        this.outcome = outcome;
        return this;
    }

    


    /**
     * 运行结果
     * @return outcome
     */
    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    

    public PipelineBuildResult withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    


    /**
     * 流水线id
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    

    public PipelineBuildResult withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    


    /**
     * 流水线名称
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    

    public PipelineBuildResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 执行开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public PipelineBuildResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineBuildResult pipelineBuildResult = (PipelineBuildResult) o;
        return Objects.equals(this.buildId, pipelineBuildResult.buildId) &&
            Objects.equals(this.elapseTime, pipelineBuildResult.elapseTime) &&
            Objects.equals(this.endTime, pipelineBuildResult.endTime) &&
            Objects.equals(this.outcome, pipelineBuildResult.outcome) &&
            Objects.equals(this.pipelineId, pipelineBuildResult.pipelineId) &&
            Objects.equals(this.pipelineName, pipelineBuildResult.pipelineName) &&
            Objects.equals(this.startTime, pipelineBuildResult.startTime) &&
            Objects.equals(this.status, pipelineBuildResult.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(buildId, elapseTime, endTime, outcome, pipelineId, pipelineName, startTime, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineBuildResult {\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
        sb.append("    elapseTime: ").append(toIndentedString(elapseTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

