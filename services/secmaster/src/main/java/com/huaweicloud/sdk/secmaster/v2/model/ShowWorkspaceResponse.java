package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private ShowWorkspaceResponseBodyWorkspace workspace;

    public ShowWorkspaceResponse withWorkspace(ShowWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }

    public ShowWorkspaceResponse withWorkspace(Consumer<ShowWorkspaceResponseBodyWorkspace> workspaceSetter) {
        if (this.workspace == null) {
            this.workspace = new ShowWorkspaceResponseBodyWorkspace();
            workspaceSetter.accept(this.workspace);
        }

        return this;
    }

    /**
     * Get workspace
     * @return workspace
     */
    public ShowWorkspaceResponseBodyWorkspace getWorkspace() {
        return workspace;
    }

    public void setWorkspace(ShowWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkspaceResponse that = (ShowWorkspaceResponse) obj;
        return Objects.equals(this.workspace, that.workspace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkspaceResponse {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
