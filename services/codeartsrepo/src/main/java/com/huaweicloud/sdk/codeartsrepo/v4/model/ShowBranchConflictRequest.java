package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBranchConflictRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_repository_id")

    private Integer sourceRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_repository_id")

    private Integer targetRepositoryId;

    public ShowBranchConflictRequest withRepositoryId(Integer repositoryId) {
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

    public ShowBranchConflictRequest withSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
        return this;
    }

    /**
     * **参数解释：** 查询指定源仓库的数据。
     * minimum: 1
     * maximum: 2147483647
     * @return sourceRepositoryId
     */
    public Integer getSourceRepositoryId() {
        return sourceRepositoryId;
    }

    public void setSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
    }

    public ShowBranchConflictRequest withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * **参数解释：** 源分支。
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public ShowBranchConflictRequest withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 目标分支。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ShowBranchConflictRequest withTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
        return this;
    }

    /**
     * **参数解释：** 目标仓库id。创建MR时，代码将要合入的仓库。
     * minimum: 1
     * maximum: 2147483647
     * @return targetRepositoryId
     */
    public Integer getTargetRepositoryId() {
        return targetRepositoryId;
    }

    public void setTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBranchConflictRequest that = (ShowBranchConflictRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.sourceRepositoryId, that.sourceRepositoryId)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.targetRepositoryId, that.targetRepositoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, sourceRepositoryId, sourceBranch, targetBranch, targetRepositoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBranchConflictRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    sourceRepositoryId: ").append(toIndentedString(sourceRepositoryId)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    targetRepositoryId: ").append(toIndentedString(targetRepositoryId)).append("\n");
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
