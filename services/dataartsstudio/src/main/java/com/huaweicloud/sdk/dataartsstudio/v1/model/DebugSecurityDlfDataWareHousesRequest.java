package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DebugSecurityDlfDataWareHousesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    public DebugSecurityDlfDataWareHousesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public DebugSecurityDlfDataWareHousesRequest withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugSecurityDlfDataWareHousesRequest that = (DebugSecurityDlfDataWareHousesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.dwId, that.dwId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, dwId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugSecurityDlfDataWareHousesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
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
