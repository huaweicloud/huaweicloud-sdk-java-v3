package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class AcceptManualReviewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_run_id")

    private String jobRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_run_id")

    private String pipelineRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_run_id")

    private String stepRunId;

    public AcceptManualReviewRequest withJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }

    /**
     * 流水线任务ID
     * @return jobRunId
     */
    public String getJobRunId() {
        return jobRunId;
    }

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    public AcceptManualReviewRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AcceptManualReviewRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 流水线ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public AcceptManualReviewRequest withPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }

    /**
     * 流水线运行实例ID
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return pipelineRunId;
    }

    public void setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
    }

    public AcceptManualReviewRequest withStepRunId(String stepRunId) {
        this.stepRunId = stepRunId;
        return this;
    }

    /**
     * 流水线步骤ID
     * @return stepRunId
     */
    public String getStepRunId() {
        return stepRunId;
    }

    public void setStepRunId(String stepRunId) {
        this.stepRunId = stepRunId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcceptManualReviewRequest that = (AcceptManualReviewRequest) obj;
        return Objects.equals(this.jobRunId, that.jobRunId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.pipelineId, that.pipelineId)
            && Objects.equals(this.pipelineRunId, that.pipelineRunId) && Objects.equals(this.stepRunId, that.stepRunId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRunId, projectId, pipelineId, pipelineRunId, stepRunId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptManualReviewRequest {\n");
        sb.append("    jobRunId: ").append(toIndentedString(jobRunId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineRunId: ").append(toIndentedString(pipelineRunId)).append("\n");
        sb.append("    stepRunId: ").append(toIndentedString(stepRunId)).append("\n");
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
