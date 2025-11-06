package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubmoduleDto
 */
public class SubmoduleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submodule_branch")

    private String submoduleBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_uuid")

    private String namespaceUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submodule_repo_id")

    private Integer submoduleRepoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_commitId")

    private String subCommitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployKey_status")

    private Integer deployKeyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public SubmoduleDto withRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。
     * @return repoId
     */
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    public SubmoduleDto withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支名。 **取值范围：** 最小1个字节，最大200字节。
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public SubmoduleDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 分支名。 **取值范围：** 最小1个字节，最大200字节
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SubmoduleDto withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释：** 子模块Git地址。
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public SubmoduleDto withSubmoduleBranch(String submoduleBranch) {
        this.submoduleBranch = submoduleBranch;
        return this;
    }

    /**
     * **参数解释：** 子模块分支名。 **取值范围：** 最小1个字节，最大200字节。
     * @return submoduleBranch
     */
    public String getSubmoduleBranch() {
        return submoduleBranch;
    }

    public void setSubmoduleBranch(String submoduleBranch) {
        this.submoduleBranch = submoduleBranch;
    }

    public SubmoduleDto withNamespaceUuid(String namespaceUuid) {
        this.namespaceUuid = namespaceUuid;
        return this;
    }

    /**
     * 组织名/组织名.../仓库名
     * @return namespaceUuid
     */
    public String getNamespaceUuid() {
        return namespaceUuid;
    }

    public void setNamespaceUuid(String namespaceUuid) {
        this.namespaceUuid = namespaceUuid;
    }

    public SubmoduleDto withSubmoduleRepoId(Integer submoduleRepoId) {
        this.submoduleRepoId = submoduleRepoId;
        return this;
    }

    /**
     * **参数解释：** 子模块仓库ID。
     * @return submoduleRepoId
     */
    public Integer getSubmoduleRepoId() {
        return submoduleRepoId;
    }

    public void setSubmoduleRepoId(Integer submoduleRepoId) {
        this.submoduleRepoId = submoduleRepoId;
    }

    public SubmoduleDto withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释：** 子模块仓库名称。
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public SubmoduleDto withSubCommitId(String subCommitId) {
        this.subCommitId = subCommitId;
        return this;
    }

    /**
     * **参数解释：** 子模块仓库提交。
     * @return subCommitId
     */
    public String getSubCommitId() {
        return subCommitId;
    }

    public void setSubCommitId(String subCommitId) {
        this.subCommitId = subCommitId;
    }

    public SubmoduleDto withDeployKeyStatus(Integer deployKeyStatus) {
        this.deployKeyStatus = deployKeyStatus;
        return this;
    }

    /**
     * **参数解释：** 部署密钥同步状态。 **取值范围：** - 0，不同步。 - 1，同步。
     * @return deployKeyStatus
     */
    public Integer getDeployKeyStatus() {
        return deployKeyStatus;
    }

    public void setDeployKeyStatus(Integer deployKeyStatus) {
        this.deployKeyStatus = deployKeyStatus;
    }

    public SubmoduleDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 子模块状态。 **取值范围：** - 0，异常。 - 1，正常。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubmoduleDto that = (SubmoduleDto) obj;
        return Objects.equals(this.repoId, that.repoId) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.path, that.path) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.submoduleBranch, that.submoduleBranch)
            && Objects.equals(this.namespaceUuid, that.namespaceUuid)
            && Objects.equals(this.submoduleRepoId, that.submoduleRepoId)
            && Objects.equals(this.repoName, that.repoName) && Objects.equals(this.subCommitId, that.subCommitId)
            && Objects.equals(this.deployKeyStatus, that.deployKeyStatus) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoId,
            branch,
            path,
            gitUrl,
            submoduleBranch,
            namespaceUuid,
            submoduleRepoId,
            repoName,
            subCommitId,
            deployKeyStatus,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmoduleDto {\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    submoduleBranch: ").append(toIndentedString(submoduleBranch)).append("\n");
        sb.append("    namespaceUuid: ").append(toIndentedString(namespaceUuid)).append("\n");
        sb.append("    submoduleRepoId: ").append(toIndentedString(submoduleRepoId)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    subCommitId: ").append(toIndentedString(subCommitId)).append("\n");
        sb.append("    deployKeyStatus: ").append(toIndentedString(deployKeyStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
