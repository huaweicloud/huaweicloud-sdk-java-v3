package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SimpleTaskInfoV2
 */
public class SimpleTaskInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_branch")

    private String gitBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_check_time")

    private String lastCheckTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sm_level")

    private String smLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sm_level_name_en")

    private String smLevelNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sm_level_name")

    private String smLevelName;

    public SimpleTaskInfoV2 withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 任务下的默认分支任务的ID。 **取值范围：** 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SimpleTaskInfoV2 withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释：** 任务名称。 **取值范围：** 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public SimpleTaskInfoV2 withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释：** 任务创建者的用户ID。 **取值范围：** 不涉及。
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public SimpleTaskInfoV2 withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释：** 代码仓地址。 **取值范围：** 不涉及。
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public SimpleTaskInfoV2 withGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    /**
     * **参数解释：** 任务的默认分支，非代码仓默认分支。 **取值范围：** 不涉及。
     * @return gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public SimpleTaskInfoV2 withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 任务创建时间。 **取值范围：** UTC格式，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SimpleTaskInfoV2 withLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }

    /**
     * **参数解释：** 任务下所有分支任务、增量任务的最近检查时间。 **取值范围：** UTC格式，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。
     * @return lastCheckTime
     */
    public String getLastCheckTime() {
        return lastCheckTime;
    }

    public void setLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    public SimpleTaskInfoV2 withSmLevel(String smLevel) {
        this.smLevel = smLevel;
        return this;
    }

    /**
     * **参数解释：** [密级ID,可见信息密级的ID，从页面接口GET https://{endpoint}/projects/v1/options的响应参数中获取，其中的code值即为密级ID。](tag:hcs_sm,hcs_sitesm)[该参数暂无业务意义，忽略。](tag:fcs) **取值范围：** [不涉及,取值根据用户配置的密级情况变化。](tag:hcs_sm,hcs_sitesm)[不涉及。](tag:fcs)
     * @return smLevel
     */
    public String getSmLevel() {
        return smLevel;
    }

    public void setSmLevel(String smLevel) {
        this.smLevel = smLevel;
    }

    public SimpleTaskInfoV2 withSmLevelNameEn(String smLevelNameEn) {
        this.smLevelNameEn = smLevelNameEn;
        return this;
    }

    /**
     * **参数解释：** [密级英文名称，取值根据用户配置的密级情况变化。](tag:hcs_sm,hcs_sitesm)[该参数暂无业务意义，忽略。](tag:fcs) **取值范围：** 不涉及。
     * @return smLevelNameEn
     */
    public String getSmLevelNameEn() {
        return smLevelNameEn;
    }

    public void setSmLevelNameEn(String smLevelNameEn) {
        this.smLevelNameEn = smLevelNameEn;
    }

    public SimpleTaskInfoV2 withSmLevelName(String smLevelName) {
        this.smLevelName = smLevelName;
        return this;
    }

    /**
     * **参数解释：** [密级中文名称，取值根据用户配置的密级情况变化。](tag:hcs_sm,hcs_sitesm)[该参数暂无业务意义，忽略。](tag:fcs) **取值范围：** 不涉及。
     * @return smLevelName
     */
    public String getSmLevelName() {
        return smLevelName;
    }

    public void setSmLevelName(String smLevelName) {
        this.smLevelName = smLevelName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleTaskInfoV2 that = (SimpleTaskInfoV2) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.gitBranch, that.gitBranch) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.lastCheckTime, that.lastCheckTime) && Objects.equals(this.smLevel, that.smLevel)
            && Objects.equals(this.smLevelNameEn, that.smLevelNameEn)
            && Objects.equals(this.smLevelName, that.smLevelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            creatorId,
            gitUrl,
            gitBranch,
            createdAt,
            lastCheckTime,
            smLevel,
            smLevelNameEn,
            smLevelName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleTaskInfoV2 {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    lastCheckTime: ").append(toIndentedString(lastCheckTime)).append("\n");
        sb.append("    smLevel: ").append(toIndentedString(smLevel)).append("\n");
        sb.append("    smLevelNameEn: ").append(toIndentedString(smLevelNameEn)).append("\n");
        sb.append("    smLevelName: ").append(toIndentedString(smLevelName)).append("\n");
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
