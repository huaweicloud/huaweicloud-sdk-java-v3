package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatisticDto
 */
public class StatisticDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_lines")

    private Integer addLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_lines")

    private Integer deleteLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_count")

    private Integer commitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public StatisticDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 统计ID。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatisticDto withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。
     * minimum: 1
     * maximum: 2147483647
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public StatisticDto withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支名。 **取值范围：** 最小1个字节，最大200字节
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public StatisticDto withUserName(String userName) {
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

    public StatisticDto withAddLines(Integer addLines) {
        this.addLines = addLines;
        return this;
    }

    /**
     * **参数解释：** 增加行数。
     * minimum: 0
     * maximum: 2147483647
     * @return addLines
     */
    public Integer getAddLines() {
        return addLines;
    }

    public void setAddLines(Integer addLines) {
        this.addLines = addLines;
    }

    public StatisticDto withDeleteLines(Integer deleteLines) {
        this.deleteLines = deleteLines;
        return this;
    }

    /**
     * **参数解释：** 删除行数。
     * minimum: 0
     * maximum: 2147483647
     * @return deleteLines
     */
    public Integer getDeleteLines() {
        return deleteLines;
    }

    public void setDeleteLines(Integer deleteLines) {
        this.deleteLines = deleteLines;
    }

    public StatisticDto withCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * **参数解释：** 总的提交数量。
     * minimum: 0
     * maximum: 2147483647
     * @return commitCount
     */
    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public StatisticDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 最早提交时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public StatisticDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 最新更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticDto that = (StatisticDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.branch, that.branch) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.addLines, that.addLines) && Objects.equals(this.deleteLines, that.deleteLines)
            && Objects.equals(this.commitCount, that.commitCount) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, branch, userName, addLines, deleteLines, commitCount, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    addLines: ").append(toIndentedString(addLines)).append("\n");
        sb.append("    deleteLines: ").append(toIndentedString(deleteLines)).append("\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
