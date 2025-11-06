package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 提交信息参数。
 */
public class CommitParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionDto> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_branch")

    private String startBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email")

    private String authorEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stats")

    private Boolean stats;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    public CommitParams withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支名称。 **取值范围：** 不涉及。
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public CommitParams withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * **参数解释：** 提交信息。 **取值范围：** 不涉及。
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public CommitParams withActions(List<ActionDto> actions) {
        this.actions = actions;
        return this;
    }

    public CommitParams addActionsItem(ActionDto actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public CommitParams withActions(Consumer<List<ActionDto>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 在提交时执行的操作。 **取值范围：** 不涉及。
     * @return actions
     */
    public List<ActionDto> getActions() {
        return actions;
    }

    public void setActions(List<ActionDto> actions) {
        this.actions = actions;
    }

    public CommitParams withStartBranch(String startBranch) {
        this.startBranch = startBranch;
        return this;
    }

    /**
     * **参数解释：** 从该分支开始新的提交。  **取值范围：** 不涉及。
     * @return startBranch
     */
    public String getStartBranch() {
        return startBranch;
    }

    public void setStartBranch(String startBranch) {
        this.startBranch = startBranch;
    }

    public CommitParams withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * **参数解释：** 作者邮箱。  **取值范围：** 不涉及。
     * @return authorEmail
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public CommitParams withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * **参数解释：** 作者名称。  **取值范围：** 不涉及。
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public CommitParams withStats(Boolean stats) {
        this.stats = stats;
        return this;
    }

    /**
     * **参数解释：** 是否包括提交统计信息。 **取值范围：** - true，包括提交统计信息。 - false，不包括提交统计信息
     * @return stats
     */
    public Boolean getStats() {
        return stats;
    }

    public void setStats(Boolean stats) {
        this.stats = stats;
    }

    public CommitParams withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * **参数解释：** 是否强制提交。 **取值范围：** - true，强制提交。 - false，非强制提交
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitParams that = (CommitParams) obj;
        return Objects.equals(this.branch, that.branch) && Objects.equals(this.commitMessage, that.commitMessage)
            && Objects.equals(this.actions, that.actions) && Objects.equals(this.startBranch, that.startBranch)
            && Objects.equals(this.authorEmail, that.authorEmail) && Objects.equals(this.authorName, that.authorName)
            && Objects.equals(this.stats, that.stats) && Objects.equals(this.force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, commitMessage, actions, startBranch, authorEmail, authorName, stats, force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitParams {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    startBranch: ").append(toIndentedString(startBranch)).append("\n");
        sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
