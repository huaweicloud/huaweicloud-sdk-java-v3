package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepoEncryptionDto
 */
public class RepoEncryptionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private Integer ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_iam_id")

    private String ownerIamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_tenant_name")

    private String ownerTenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_nick_name")

    private String ownerNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    public RepoEncryptionDto withRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * **参数解释：** 代码仓id。
     * minimum: 1
     * maximum: 2147483647
     * @return repoId
     */
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    public RepoEncryptionDto withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释：** 代码仓名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public RepoEncryptionDto withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * **参数解释：** 代码仓全路径。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public RepoEncryptionDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepoEncryptionDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public RepoEncryptionDto withOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * **参数解释：** 代码仓所有者id。
     * minimum: 1
     * maximum: 2147483647
     * @return ownerId
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public RepoEncryptionDto withOwnerIamId(String ownerIamId) {
        this.ownerIamId = ownerIamId;
        return this;
    }

    /**
     * **参数解释：** 代码仓所有者iamId。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return ownerIamId
     */
    public String getOwnerIamId() {
        return ownerIamId;
    }

    public void setOwnerIamId(String ownerIamId) {
        this.ownerIamId = ownerIamId;
    }

    public RepoEncryptionDto withOwnerTenantName(String ownerTenantName) {
        this.ownerTenantName = ownerTenantName;
        return this;
    }

    /**
     * **参数解释：** 代码仓所有者租户id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return ownerTenantName
     */
    public String getOwnerTenantName() {
        return ownerTenantName;
    }

    public void setOwnerTenantName(String ownerTenantName) {
        this.ownerTenantName = ownerTenantName;
    }

    public RepoEncryptionDto withOwnerNickName(String ownerNickName) {
        this.ownerNickName = ownerNickName;
        return this;
    }

    /**
     * **参数解释：** 代码仓所有者昵称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return ownerNickName
     */
    public String getOwnerNickName() {
        return ownerNickName;
    }

    public void setOwnerNickName(String ownerNickName) {
        this.ownerNickName = ownerNickName;
    }

    public RepoEncryptionDto withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * **参数解释：** 代码仓所有者名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoEncryptionDto that = (RepoEncryptionDto) obj;
        return Objects.equals(this.repoId, that.repoId) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.fullPath, that.fullPath) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.ownerIamId, that.ownerIamId)
            && Objects.equals(this.ownerTenantName, that.ownerTenantName)
            && Objects.equals(this.ownerNickName, that.ownerNickName) && Objects.equals(this.ownerName, that.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoId,
            repoName,
            fullPath,
            projectId,
            projectName,
            ownerId,
            ownerIamId,
            ownerTenantName,
            ownerNickName,
            ownerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoEncryptionDto {\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerIamId: ").append(toIndentedString(ownerIamId)).append("\n");
        sb.append("    ownerTenantName: ").append(toIndentedString(ownerTenantName)).append("\n");
        sb.append("    ownerNickName: ").append(toIndentedString(ownerNickName)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
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
