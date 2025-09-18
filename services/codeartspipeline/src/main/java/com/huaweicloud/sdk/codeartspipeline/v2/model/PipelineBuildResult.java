package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PipelineBuildResult
 */
public class PipelineBuildResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_id")

    private String buildId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elapse_time")

    private String elapseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outcome")

    private String outcome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    private String pipelineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public PipelineBuildResult withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * **参数解释**： 流水线执行ID。 **取值范围**： 不涉及。 
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
     * **参数解释**： 运行耗时，单位为毫秒。 **取值范围**： 不涉及。 
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
     * **参数解释**： 执行结束时间。 **取值范围**： 不涉及。 
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
     * **参数解释**： 运行结果。 **取值范围**： - success：成功。 - error：失败。 - aborted：终止。 
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
     * **参数解释**： 流水线id。 **取值范围**： 32位字符，由数字和字母组成。 
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
     * **参数解释**： 流水线名称。 **取值范围**： 不涉及。 
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
     * **参数解释**： 执行开始时间。 **取值范围**： 不涉及。 
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
     * **参数解释**： 运行状态。 **取值范围**： - waiting：等待中。 - running：运行中。 - verifying：待审核。 - suspending：挂起。 - completed：执行完成。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineBuildResult that = (PipelineBuildResult) obj;
        return Objects.equals(this.buildId, that.buildId) && Objects.equals(this.elapseTime, that.elapseTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.outcome, that.outcome)
            && Objects.equals(this.pipelineId, that.pipelineId) && Objects.equals(this.pipelineName, that.pipelineName)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status);
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
