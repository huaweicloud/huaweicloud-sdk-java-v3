package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListDomainNotAddedProjectsV4ResponseBodyProjects
 */
public class ListDomainNotAddedProjectsV4ResponseBodyProjects {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_num_id")

    private Integer projectNumId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private Long updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_type")

    private String projectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private ListDomainNotAddedProjectsV4ResponseBodyCreator creator;

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
        return this;
    }

    /**
     * 项目数字id
     * @return projectNumId
     */
    public Integer getProjectNumId() {
        return projectNumId;
    }

    public void setProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
    }

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withProjectId(String projectId) {
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

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 项目创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 项目更新时间
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    /**
     * 项目类型
     * @return projectType
     */
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withCreator(
        ListDomainNotAddedProjectsV4ResponseBodyCreator creator) {
        this.creator = creator;
        return this;
    }

    public ListDomainNotAddedProjectsV4ResponseBodyProjects withCreator(
        Consumer<ListDomainNotAddedProjectsV4ResponseBodyCreator> creatorSetter) {
        if (this.creator == null) {
            this.creator = new ListDomainNotAddedProjectsV4ResponseBodyCreator();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public ListDomainNotAddedProjectsV4ResponseBodyCreator getCreator() {
        return creator;
    }

    public void setCreator(ListDomainNotAddedProjectsV4ResponseBodyCreator creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainNotAddedProjectsV4ResponseBodyProjects that = (ListDomainNotAddedProjectsV4ResponseBodyProjects) obj;
        return Objects.equals(this.projectNumId, that.projectNumId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.projectType, that.projectType) && Objects.equals(this.creator, that.creator);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(projectNumId, projectId, projectName, description, createdTime, updatedTime, projectType, creator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainNotAddedProjectsV4ResponseBodyProjects {\n");
        sb.append("    projectNumId: ").append(toIndentedString(projectNumId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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
