package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    public ShowScriptRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间id
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ShowScriptRequest withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * Get scriptName
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScriptRequest showScriptRequest = (ShowScriptRequest) o;
        return Objects.equals(this.workspace, showScriptRequest.workspace)
            && Objects.equals(this.scriptName, showScriptRequest.scriptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, scriptName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScriptRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
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
