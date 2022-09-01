package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * RepoStatistics
 */
public class RepoStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_lines")

    @JacksonXmlProperty(localName = "add_lines")

    private Integer addLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    @JacksonXmlProperty(localName = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_count")

    @JacksonXmlProperty(localName = "commit_count")

    private Integer commitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_lines")

    @JacksonXmlProperty(localName = "delete_lines")

    private Integer deleteLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    public RepoStatistics withAddLines(Integer addLines) {
        this.addLines = addLines;
        return this;
    }

    /**
     * 添加代码行
     * @return addLines
     */
    public Integer getAddLines() {
        return addLines;
    }

    public void setAddLines(Integer addLines) {
        this.addLines = addLines;
    }

    public RepoStatistics withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 分支名
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public RepoStatistics withCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * 提交次数
     * @return commitCount
     */
    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public RepoStatistics withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 仓库统计创建的时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RepoStatistics withDeleteLines(Integer deleteLines) {
        this.deleteLines = deleteLines;
        return this;
    }

    /**
     * 删除代码行
     * @return deleteLines
     */
    public Integer getDeleteLines() {
        return deleteLines;
    }

    public void setDeleteLines(Integer deleteLines) {
        this.deleteLines = deleteLines;
    }

    public RepoStatistics withId(Integer id) {
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

    public RepoStatistics withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 仓库id
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public RepoStatistics withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 仓库统计更新的时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RepoStatistics withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoStatistics repoStatistics = (RepoStatistics) o;
        return Objects.equals(this.addLines, repoStatistics.addLines)
            && Objects.equals(this.branch, repoStatistics.branch)
            && Objects.equals(this.commitCount, repoStatistics.commitCount)
            && Objects.equals(this.createdAt, repoStatistics.createdAt)
            && Objects.equals(this.deleteLines, repoStatistics.deleteLines)
            && Objects.equals(this.id, repoStatistics.id) && Objects.equals(this.projectId, repoStatistics.projectId)
            && Objects.equals(this.updatedAt, repoStatistics.updatedAt)
            && Objects.equals(this.userName, repoStatistics.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addLines, branch, commitCount, createdAt, deleteLines, id, projectId, updatedAt, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoStatistics {\n");
        sb.append("    addLines: ").append(toIndentedString(addLines)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deleteLines: ").append(toIndentedString(deleteLines)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
