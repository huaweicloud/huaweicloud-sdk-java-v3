package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 基于某一任务创建分支任务、MR任务时使用的参数。 **约束限制：** 不涉及。
 */
public class IncConfigV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_task_id")

    private String parentTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_source_branch")

    private String gitSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_target_branch")

    private String gitTargetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_id")

    private String mergeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public IncConfigV2 withParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }

    /**
     * **参数解释：** 需要关联的任务ID。 **约束限制：** 32位UUID。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return parentTaskId
     */
    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public IncConfigV2 withGitSourceBranch(String gitSourceBranch) {
        this.gitSourceBranch = gitSourceBranch;
        return this;
    }

    /**
     * **参数解释：** MR增量任务的源分支。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return gitSourceBranch
     */
    public String getGitSourceBranch() {
        return gitSourceBranch;
    }

    public void setGitSourceBranch(String gitSourceBranch) {
        this.gitSourceBranch = gitSourceBranch;
    }

    public IncConfigV2 withGitTargetBranch(String gitTargetBranch) {
        this.gitTargetBranch = gitTargetBranch;
        return this;
    }

    /**
     * **参数解释：** MR增量任务的目标分支。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return gitTargetBranch
     */
    public String getGitTargetBranch() {
        return gitTargetBranch;
    }

    public void setGitTargetBranch(String gitTargetBranch) {
        this.gitTargetBranch = gitTargetBranch;
    }

    public IncConfigV2 withMergeId(String mergeId) {
        this.mergeId = mergeId;
        return this;
    }

    /**
     * **参数解释：** MR编号。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return mergeId
     */
    public String getMergeId() {
        return mergeId;
    }

    public void setMergeId(String mergeId) {
        this.mergeId = mergeId;
    }

    public IncConfigV2 withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释：** 创建MR增量任务时需传。 **约束限制：** 不涉及。 **取值范围：** merge_request。 **默认取值：** 不涉及。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public IncConfigV2 withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 创建MR增量任务时需传。 **约束限制：** 不涉及。 **取值范围：** open。 **默认取值：** 不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public IncConfigV2 withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 创建MR增量任务时需传，MR标题。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncConfigV2 that = (IncConfigV2) obj;
        return Objects.equals(this.parentTaskId, that.parentTaskId)
            && Objects.equals(this.gitSourceBranch, that.gitSourceBranch)
            && Objects.equals(this.gitTargetBranch, that.gitTargetBranch) && Objects.equals(this.mergeId, that.mergeId)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.action, that.action)
            && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentTaskId, gitSourceBranch, gitTargetBranch, mergeId, eventType, action, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncConfigV2 {\n");
        sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
        sb.append("    gitSourceBranch: ").append(toIndentedString(gitSourceBranch)).append("\n");
        sb.append("    gitTargetBranch: ").append(toIndentedString(gitTargetBranch)).append("\n");
        sb.append("    mergeId: ").append(toIndentedString(mergeId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
