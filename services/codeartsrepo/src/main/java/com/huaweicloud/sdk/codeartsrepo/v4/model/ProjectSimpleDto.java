package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Get the simplest project info, used to the list of projects
 */
public class ProjectSimpleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_with_namespace")

    private String nameWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_with_namespace")

    private String pathWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_kia")

    private Boolean isKia;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_url_to_repo")

    private String sshUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_url_to_repo")

    private String httpUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readme_url")

    private String readmeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private String developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_result")

    private Boolean moderationResult;

    public ProjectSimpleDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 仓库id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProjectSimpleDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 仓库描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectSimpleDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectSimpleDto withNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    /**
     * 组织名/组织名.../仓库名
     * @return nameWithNamespace
     */
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public ProjectSimpleDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 仓库路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ProjectSimpleDto withPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    /**
     * 仓库完整路径
     * @return pathWithNamespace
     */
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public ProjectSimpleDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ProjectSimpleDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProjectSimpleDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * 是否归档
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ProjectSimpleDto withIsKia(Boolean isKia) {
        this.isKia = isKia;
        return this;
    }

    /**
     * 是否机密
     * @return isKia
     */
    public Boolean getIsKia() {
        return isKia;
    }

    public void setIsKia(Boolean isKia) {
        this.isKia = isKia;
    }

    public ProjectSimpleDto withSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }

    /**
     * 仓库ssh地址
     * @return sshUrlToRepo
     */
    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    public void setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
    }

    public ProjectSimpleDto withHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }

    /**
     * 仓库http地址
     * @return httpUrlToRepo
     */
    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    public void setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
    }

    public ProjectSimpleDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 仓库页面链接
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public ProjectSimpleDto withReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
        return this;
    }

    /**
     * 仓库readme文件链接
     * @return readmeUrl
     */
    public String getReadmeUrl() {
        return readmeUrl;
    }

    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    public ProjectSimpleDto withProjectId(String projectId) {
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

    public ProjectSimpleDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProjectSimpleDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * 仓库开发模式：normal、CR
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public ProjectSimpleDto withModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }

    /**
     * 审核状态
     * @return moderationResult
     */
    public Boolean getModerationResult() {
        return moderationResult;
    }

    public void setModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectSimpleDto that = (ProjectSimpleDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameWithNamespace, that.nameWithNamespace)
            && Objects.equals(this.path, that.path) && Objects.equals(this.pathWithNamespace, that.pathWithNamespace)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.archived, that.archived) && Objects.equals(this.isKia, that.isKia)
            && Objects.equals(this.sshUrlToRepo, that.sshUrlToRepo)
            && Objects.equals(this.httpUrlToRepo, that.httpUrlToRepo) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.readmeUrl, that.readmeUrl) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.developMode, that.developMode)
            && Objects.equals(this.moderationResult, that.moderationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            name,
            nameWithNamespace,
            path,
            pathWithNamespace,
            createdAt,
            updatedAt,
            archived,
            isKia,
            sshUrlToRepo,
            httpUrlToRepo,
            webUrl,
            readmeUrl,
            projectId,
            projectName,
            developMode,
            moderationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectSimpleDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameWithNamespace: ").append(toIndentedString(nameWithNamespace)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathWithNamespace: ").append(toIndentedString(pathWithNamespace)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    isKia: ").append(toIndentedString(isKia)).append("\n");
        sb.append("    sshUrlToRepo: ").append(toIndentedString(sshUrlToRepo)).append("\n");
        sb.append("    httpUrlToRepo: ").append(toIndentedString(httpUrlToRepo)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    readmeUrl: ").append(toIndentedString(readmeUrl)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    moderationResult: ").append(toIndentedString(moderationResult)).append("\n");
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
