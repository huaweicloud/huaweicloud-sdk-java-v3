package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 项目配置ID信息，包含项目配置ID和集群ID。
 */
public class ProjectConfigClusterGroupIdEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_group_id")

    private String clusterGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_config_id")

    private String projectConfigId;

    public ProjectConfigClusterGroupIdEntity withClusterGroupId(String clusterGroupId) {
        this.clusterGroupId = clusterGroupId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterGroupId
     */
    public String getClusterGroupId() {
        return clusterGroupId;
    }

    public void setClusterGroupId(String clusterGroupId) {
        this.clusterGroupId = clusterGroupId;
    }

    public ProjectConfigClusterGroupIdEntity withProjectConfigId(String projectConfigId) {
        this.projectConfigId = projectConfigId;
        return this;
    }

    /**
     * 项目配置ID
     * @return projectConfigId
     */
    public String getProjectConfigId() {
        return projectConfigId;
    }

    public void setProjectConfigId(String projectConfigId) {
        this.projectConfigId = projectConfigId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectConfigClusterGroupIdEntity that = (ProjectConfigClusterGroupIdEntity) obj;
        return Objects.equals(this.clusterGroupId, that.clusterGroupId)
            && Objects.equals(this.projectConfigId, that.projectConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterGroupId, projectConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectConfigClusterGroupIdEntity {\n");
        sb.append("    clusterGroupId: ").append(toIndentedString(clusterGroupId)).append("\n");
        sb.append("    projectConfigId: ").append(toIndentedString(projectConfigId)).append("\n");
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
