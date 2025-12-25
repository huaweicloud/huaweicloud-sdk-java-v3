package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IDERepoSearchDO
 */
public class IDERepoSearchDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_name")

    private String artifactName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_type")

    private String artifactType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_project")

    private Boolean inProject;

    public IDERepoSearchDO withArtifactName(String artifactName) {
        this.artifactName = artifactName;
        return this;
    }

    /**
     * 搜索制品名称
     * @return artifactName
     */
    public String getArtifactName() {
        return artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public IDERepoSearchDO withArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * 制品类型
     * @return artifactType
     */
    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public IDERepoSearchDO withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页码
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public IDERepoSearchDO withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public IDERepoSearchDO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IDERepoSearchDO withInProject(Boolean inProject) {
        this.inProject = inProject;
        return this;
    }

    /**
     * 是否在项目中
     * @return inProject
     */
    public Boolean getInProject() {
        return inProject;
    }

    public void setInProject(Boolean inProject) {
        this.inProject = inProject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDERepoSearchDO that = (IDERepoSearchDO) obj;
        return Objects.equals(this.artifactName, that.artifactName)
            && Objects.equals(this.artifactType, that.artifactType) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.inProject, that.inProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactName, artifactType, pageNo, pageSize, projectId, inProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDERepoSearchDO {\n");
        sb.append("    artifactName: ").append(toIndentedString(artifactName)).append("\n");
        sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    inProject: ").append(toIndentedString(inProject)).append("\n");
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
