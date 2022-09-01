package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class StopPipelineJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    @JacksonXmlProperty(localName = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_savepoint")

    @JacksonXmlProperty(localName = "trigger_savepoint")

    private Boolean triggerSavepoint;

    public StopPipelineJobRequest withPipelineId(String pipelineId) {
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

    public StopPipelineJobRequest withTriggerSavepoint(Boolean triggerSavepoint) {
        this.triggerSavepoint = triggerSavepoint;
        return this;
    }

    /**
     * 停止管道作业触发savepoint
     * @return triggerSavepoint
     */
    public Boolean getTriggerSavepoint() {
        return triggerSavepoint;
    }

    public void setTriggerSavepoint(Boolean triggerSavepoint) {
        this.triggerSavepoint = triggerSavepoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopPipelineJobRequest stopPipelineJobRequest = (StopPipelineJobRequest) o;
        return Objects.equals(this.pipelineId, stopPipelineJobRequest.pipelineId)
            && Objects.equals(this.triggerSavepoint, stopPipelineJobRequest.triggerSavepoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId, triggerSavepoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopPipelineJobRequest {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    triggerSavepoint: ").append(toIndentedString(triggerSavepoint)).append("\n");
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
