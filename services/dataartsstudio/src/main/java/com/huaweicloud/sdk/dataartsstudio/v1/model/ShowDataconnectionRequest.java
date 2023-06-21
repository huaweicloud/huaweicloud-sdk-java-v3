package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDataconnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connection_id")

    private String dataConnectionId;

    public ShowDataconnectionRequest withWorkspace(String workspace) {
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

    public ShowDataconnectionRequest withDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
        return this;
    }

    /**
     * 数据连接ID
     * @return dataConnectionId
     */
    public String getDataConnectionId() {
        return dataConnectionId;
    }

    public void setDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDataconnectionRequest showDataconnectionRequest = (ShowDataconnectionRequest) o;
        return Objects.equals(this.workspace, showDataconnectionRequest.workspace)
            && Objects.equals(this.dataConnectionId, showDataconnectionRequest.dataConnectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, dataConnectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataconnectionRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dataConnectionId: ").append(toIndentedString(dataConnectionId)).append("\n");
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
