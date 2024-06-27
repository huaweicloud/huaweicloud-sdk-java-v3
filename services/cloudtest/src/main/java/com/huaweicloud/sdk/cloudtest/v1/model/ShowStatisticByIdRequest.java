package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStatisticByIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_id")

    private String mindmapId;

    public ShowStatisticByIdRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowStatisticByIdRequest withMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
        return this;
    }

    /**
     * 脑图ID
     * @return mindmapId
     */
    public String getMindmapId() {
        return mindmapId;
    }

    public void setMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticByIdRequest that = (ShowStatisticByIdRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.mindmapId, that.mindmapId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, mindmapId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticByIdRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    mindmapId: ").append(toIndentedString(mindmapId)).append("\n");
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
