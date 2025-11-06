package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatisticEventsDto
 */
public class StatisticEventsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Integer userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_date")

    private String statDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public StatisticEventsDto withId(Integer id) {
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

    public StatisticEventsDto withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释：** 用户ID。
     * minimum: 1
     * maximum: 2147483647
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public StatisticEventsDto withProjectId(Integer projectId) {
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

    public StatisticEventsDto withBranch(String branch) {
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

    public StatisticEventsDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 统计状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatisticEventsDto withStatDate(String statDate) {
        this.statDate = statDate;
        return this;
    }

    /**
     * **参数解释：** 统计时间。
     * @return statDate
     */
    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    public StatisticEventsDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 统计创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public StatisticEventsDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 统计更新时间。
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
        StatisticEventsDto that = (StatisticEventsDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statDate, that.statDate)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, projectId, branch, status, statDate, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticEventsDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statDate: ").append(toIndentedString(statDate)).append("\n");
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
