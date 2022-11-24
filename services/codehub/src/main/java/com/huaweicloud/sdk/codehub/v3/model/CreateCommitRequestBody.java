package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCommitRequestBody
 */
public class CreateCommitRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_branch")

    private String startBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<CommitAction> actions = null;

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

    public CreateCommitRequestBody withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 目标分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public CreateCommitRequestBody withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * 提交信息
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public CreateCommitRequestBody withStartBranch(String startBranch) {
        this.startBranch = startBranch;
        return this;
    }

    /**
     * 创建分支时，新的分支名
     * @return startBranch
     */
    public String getStartBranch() {
        return startBranch;
    }

    public void setStartBranch(String startBranch) {
        this.startBranch = startBranch;
    }

    public CreateCommitRequestBody withActions(List<CommitAction> actions) {
        this.actions = actions;
        return this;
    }

    public CreateCommitRequestBody addActionsItem(CommitAction actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public CreateCommitRequestBody withActions(Consumer<List<CommitAction>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 提交处理列表
     * @return actions
     */
    public List<CommitAction> getActions() {
        return actions;
    }

    public void setActions(List<CommitAction> actions) {
        this.actions = actions;
    }

    public CreateCommitRequestBody withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * 提交作者的电子邮件地址
     * @return authorEmail
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public CreateCommitRequestBody withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * 提交作者的名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public CreateCommitRequestBody withStats(Boolean stats) {
        this.stats = stats;
        return this;
    }

    /**
     * 是否包括提交统计信息。默认值为true
     * @return stats
     */
    public Boolean getStats() {
        return stats;
    }

    public void setStats(Boolean stats) {
        this.stats = stats;
    }

    public CreateCommitRequestBody withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * 是否覆盖目标分支。当true时，使用基于start_branch的新提交覆盖目标分支
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCommitRequestBody createCommitRequestBody = (CreateCommitRequestBody) o;
        return Objects.equals(this.branch, createCommitRequestBody.branch)
            && Objects.equals(this.commitMessage, createCommitRequestBody.commitMessage)
            && Objects.equals(this.startBranch, createCommitRequestBody.startBranch)
            && Objects.equals(this.actions, createCommitRequestBody.actions)
            && Objects.equals(this.authorEmail, createCommitRequestBody.authorEmail)
            && Objects.equals(this.authorName, createCommitRequestBody.authorName)
            && Objects.equals(this.stats, createCommitRequestBody.stats)
            && Objects.equals(this.force, createCommitRequestBody.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, commitMessage, startBranch, actions, authorEmail, authorName, stats, force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCommitRequestBody {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    startBranch: ").append(toIndentedString(startBranch)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
