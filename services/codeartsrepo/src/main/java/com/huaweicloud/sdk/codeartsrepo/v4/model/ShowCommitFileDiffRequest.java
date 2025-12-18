package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCommitFileDiffRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_path")

    private String oldPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_whitespace_change")

    private Boolean ignoreWhitespaceChange;

    public ShowCommitFileDiffRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[[查询用户所有仓库](https://support.huaweicloud.com/eu/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowCommitFileDiffRequest withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * **参数解释：** 分支名、tag名、提交ID。
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ShowCommitFileDiffRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **取值范围：** 字符串长度不少于1，不超过100000。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowCommitFileDiffRequest withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * **参数解释：** 改名之前的文件路径。 **取值范围：** 字符串长度不少于1，不超过100000。
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public ShowCommitFileDiffRequest withIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
        return this;
    }

    /**
     * **参数解释：** 是否忽略空白数量更改。 **取值范围：** - true，忽略空白数量的更改。 - false，不会忽略空白数量的更改。
     * @return ignoreWhitespaceChange
     */
    public Boolean getIgnoreWhitespaceChange() {
        return ignoreWhitespaceChange;
    }

    public void setIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCommitFileDiffRequest that = (ShowCommitFileDiffRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.path, that.path) && Objects.equals(this.oldPath, that.oldPath)
            && Objects.equals(this.ignoreWhitespaceChange, that.ignoreWhitespaceChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, sha, path, oldPath, ignoreWhitespaceChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommitFileDiffRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    ignoreWhitespaceChange: ").append(toIndentedString(ignoreWhitespaceChange)).append("\n");
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
