package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryInfo
 */
public class RepositoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gitignore")

    private String gitignore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_permission")

    private Integer memberPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readme_permission")

    private Integer readmePermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_level")

    private Integer visibilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license_id")

    private Integer licenseId;

    public RepositoryInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 代码仓的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 代码仓描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RepositoryInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepositoryInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public RepositoryInfo withGitignore(String gitignore) {
        this.gitignore = gitignore;
        return this;
    }

    /**
     * 根据编程语言生成gitignore文件。
     * @return gitignore
     */
    public String getGitignore() {
        return gitignore;
    }

    public void setGitignore(String gitignore) {
        this.gitignore = gitignore;
    }

    public RepositoryInfo withMemberPermission(Integer memberPermission) {
        this.memberPermission = memberPermission;
        return this;
    }

    /**
     * 是否允许项目内成员访问仓库： - 0：不允许 - 1：允许 
     * minimum: 0
     * maximum: 1
     * @return memberPermission
     */
    public Integer getMemberPermission() {
        return memberPermission;
    }

    public void setMemberPermission(Integer memberPermission) {
        this.memberPermission = memberPermission;
    }

    public RepositoryInfo withReadmePermission(Integer readmePermission) {
        this.readmePermission = readmePermission;
        return this;
    }

    /**
     * 是否允许生成README文件： - 0：不允许 - 1：允许 
     * minimum: 0
     * maximum: 1
     * @return readmePermission
     */
    public Integer getReadmePermission() {
        return readmePermission;
    }

    public void setReadmePermission(Integer readmePermission) {
        this.readmePermission = readmePermission;
    }

    public RepositoryInfo withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * 是否公开： - 0：私有 - 20：公开只读 
     * minimum: 0
     * maximum: 20
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public RepositoryInfo withLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    /**
     *  开源许可证id （0:默认）。
     * minimum: 0
     * maximum: 100
     * @return licenseId
     */
    public Integer getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryInfo that = (RepositoryInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.gitignore, that.gitignore)
            && Objects.equals(this.memberPermission, that.memberPermission)
            && Objects.equals(this.readmePermission, that.readmePermission)
            && Objects.equals(this.visibilityLevel, that.visibilityLevel)
            && Objects.equals(this.licenseId, that.licenseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            projectId,
            regionId,
            gitignore,
            memberPermission,
            readmePermission,
            visibilityLevel,
            licenseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    gitignore: ").append(toIndentedString(gitignore)).append("\n");
        sb.append("    memberPermission: ").append(toIndentedString(memberPermission)).append("\n");
        sb.append("    readmePermission: ").append(toIndentedString(readmePermission)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
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
