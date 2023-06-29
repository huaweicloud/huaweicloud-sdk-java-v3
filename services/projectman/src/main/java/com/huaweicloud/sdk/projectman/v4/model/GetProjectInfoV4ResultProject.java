package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目信息
 */
public class GetProjectInfoV4ResultProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_num_id")

    private Integer projectNumId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_on")

    private Long createdOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_on")

    private Long updatedOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_type")

    private String projectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive")

    private Integer archive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_code")

    private String projectCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private GetProjectInfoV4ResultProjectCreator creator;

    public GetProjectInfoV4ResultProject withProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
        return this;
    }

    /**
     * 项目numId
     * @return projectNumId
     */
    public Integer getProjectNumId() {
        return projectNumId;
    }

    public void setProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
    }

    public GetProjectInfoV4ResultProject withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目uuid
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public GetProjectInfoV4ResultProject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetProjectInfoV4ResultProject withCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * 项目创建时间
     * @return createdOn
     */
    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public GetProjectInfoV4ResultProject withUpdatedOn(Long updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * 项目更新时间
     * @return updatedOn
     */
    public Long getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Long updatedOn) {
        this.updatedOn = updatedOn;
    }

    public GetProjectInfoV4ResultProject withProjectType(String projectType) {
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

    public GetProjectInfoV4ResultProject withArchive(Integer archive) {
        this.archive = archive;
        return this;
    }

    /**
     * 是否归档
     * @return archive
     */
    public Integer getArchive() {
        return archive;
    }

    public void setArchive(Integer archive) {
        this.archive = archive;
    }

    public GetProjectInfoV4ResultProject withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public GetProjectInfoV4ResultProject withProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }

    /**
     * 项目代号
     * @return projectCode
     */
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public GetProjectInfoV4ResultProject withCreator(GetProjectInfoV4ResultProjectCreator creator) {
        this.creator = creator;
        return this;
    }

    public GetProjectInfoV4ResultProject withCreator(Consumer<GetProjectInfoV4ResultProjectCreator> creatorSetter) {
        if (this.creator == null) {
            this.creator = new GetProjectInfoV4ResultProjectCreator();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public GetProjectInfoV4ResultProjectCreator getCreator() {
        return creator;
    }

    public void setCreator(GetProjectInfoV4ResultProjectCreator creator) {
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
        GetProjectInfoV4ResultProject that = (GetProjectInfoV4ResultProject) obj;
        return Objects.equals(this.projectNumId, that.projectNumId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.createdOn, that.createdOn)
            && Objects.equals(this.updatedOn, that.updatedOn) && Objects.equals(this.projectType, that.projectType)
            && Objects.equals(this.archive, that.archive) && Objects.equals(this.enterpriseId, that.enterpriseId)
            && Objects.equals(this.projectCode, that.projectCode) && Objects.equals(this.creator, that.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectNumId,
            projectId,
            name,
            createdOn,
            updatedOn,
            projectType,
            archive,
            enterpriseId,
            projectCode,
            creator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProjectInfoV4ResultProject {\n");
        sb.append("    projectNumId: ").append(toIndentedString(projectNumId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    projectCode: ").append(toIndentedString(projectCode)).append("\n");
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
