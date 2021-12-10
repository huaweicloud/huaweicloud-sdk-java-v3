package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowResDatasourceWorkDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ShowResDatasourceWorkDetailRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /** 工作空间id。
     * 
     * @return workspaceId */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowResDatasourceWorkDetailRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 资源id。
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowResDatasourceWorkDetailRequest withType(String type) {
        this.type = type;
        return this;
    }

    /** 任务类型： - DATA_STRUCT，数据结构 - DATA_INSPECTION，数据检测 - DATA_EXPLORATION，数据探索
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResDatasourceWorkDetailRequest showResDatasourceWorkDetailRequest = (ShowResDatasourceWorkDetailRequest) o;
        return Objects.equals(this.workspaceId, showResDatasourceWorkDetailRequest.workspaceId)
            && Objects.equals(this.resourceId, showResDatasourceWorkDetailRequest.resourceId)
            && Objects.equals(this.type, showResDatasourceWorkDetailRequest.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, resourceId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResDatasourceWorkDetailRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
