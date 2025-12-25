package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAnalysisScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_script_id")

    private String analysisScriptId;

    public DeleteAnalysisScriptRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public DeleteAnalysisScriptRequest withAnalysisScriptId(String analysisScriptId) {
        this.analysisScriptId = analysisScriptId;
        return this;
    }

    /**
     * 分析脚本 ID
     * @return analysisScriptId
     */
    public String getAnalysisScriptId() {
        return analysisScriptId;
    }

    public void setAnalysisScriptId(String analysisScriptId) {
        this.analysisScriptId = analysisScriptId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAnalysisScriptRequest that = (DeleteAnalysisScriptRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.analysisScriptId, that.analysisScriptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, analysisScriptId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAnalysisScriptRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    analysisScriptId: ").append(toIndentedString(analysisScriptId)).append("\n");
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
