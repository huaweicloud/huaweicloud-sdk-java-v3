package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImportWorkflowReq
 */
public class ImportWorkflowReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_workflow_id")

    private String sourceWorkflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_workflow_name")

    private String destinationWorkflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_workflow_version")

    private String destinationWorkflowVersion;

    public ImportWorkflowReq withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public ImportWorkflowReq withSourceWorkflowId(String sourceWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
        return this;
    }

    /**
     * 源流程id
     * @return sourceWorkflowId
     */
    public String getSourceWorkflowId() {
        return sourceWorkflowId;
    }

    public void setSourceWorkflowId(String sourceWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
    }

    public ImportWorkflowReq withDestinationWorkflowName(String destinationWorkflowName) {
        this.destinationWorkflowName = destinationWorkflowName;
        return this;
    }

    /**
     * 目标流程名称 取值范围[1,56]，允许大小写字母、数字、以及特殊字符中划线(-)和下划线(_)。
     * @return destinationWorkflowName
     */
    public String getDestinationWorkflowName() {
        return destinationWorkflowName;
    }

    public void setDestinationWorkflowName(String destinationWorkflowName) {
        this.destinationWorkflowName = destinationWorkflowName;
    }

    public ImportWorkflowReq withDestinationWorkflowVersion(String destinationWorkflowVersion) {
        this.destinationWorkflowVersion = destinationWorkflowVersion;
        return this;
    }

    /**
     * 目标流程版本 取值范围[1,24]，以小写字母或数字或大写字母开头，允许出现中划线，必须以小写字母或数字或大写字母结尾。
     * @return destinationWorkflowVersion
     */
    public String getDestinationWorkflowVersion() {
        return destinationWorkflowVersion;
    }

    public void setDestinationWorkflowVersion(String destinationWorkflowVersion) {
        this.destinationWorkflowVersion = destinationWorkflowVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportWorkflowReq that = (ImportWorkflowReq) obj;
        return Objects.equals(this.sourceProjectId, that.sourceProjectId)
            && Objects.equals(this.sourceWorkflowId, that.sourceWorkflowId)
            && Objects.equals(this.destinationWorkflowName, that.destinationWorkflowName)
            && Objects.equals(this.destinationWorkflowVersion, that.destinationWorkflowVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceProjectId, sourceWorkflowId, destinationWorkflowName, destinationWorkflowVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportWorkflowReq {\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceWorkflowId: ").append(toIndentedString(sourceWorkflowId)).append("\n");
        sb.append("    destinationWorkflowName: ").append(toIndentedString(destinationWorkflowName)).append("\n");
        sb.append("    destinationWorkflowVersion: ").append(toIndentedString(destinationWorkflowVersion)).append("\n");
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
