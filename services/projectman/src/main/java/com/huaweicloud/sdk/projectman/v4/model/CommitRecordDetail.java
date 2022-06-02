package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 代码提交记录 / 分支创建记录 详细信息
 */
public class CommitRecordDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private String repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_short_id")

    private String commitShortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_msg")

    private String commitMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_url")

    private String commitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private SimpleUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private String createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_date")

    private String updateDate;

    public CommitRecordDetail withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库ID
     * @return repositoryId
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public CommitRecordDetail withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * 分支名称
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public CommitRecordDetail withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * commit id
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public CommitRecordDetail withCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
        return this;
    }

    /**
     * commit short id
     * @return commitShortId
     */
    public String getCommitShortId() {
        return commitShortId;
    }

    public void setCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
    }

    public CommitRecordDetail withCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }

    /**
     * commit 信息
     * @return commitMsg
     */
    public String getCommitMsg() {
        return commitMsg;
    }

    public void setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
    }

    public CommitRecordDetail withCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * commit URL
     * @return commitUrl
     */
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public CommitRecordDetail withUser(SimpleUser user) {
        this.user = user;
        return this;
    }

    public CommitRecordDetail withUser(Consumer<SimpleUser> userSetter) {
        if (this.user == null) {
            this.user = new SimpleUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public SimpleUser getUser() {
        return user;
    }

    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public CommitRecordDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 查询的类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CommitRecordDetail withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 创建时间
     * @return createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public CommitRecordDetail withUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * 更新时间
     * @return updateDate
     */
    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitRecordDetail commitRecordDetail = (CommitRecordDetail) o;
        return Objects.equals(this.repositoryId, commitRecordDetail.repositoryId)
            && Objects.equals(this.branchName, commitRecordDetail.branchName)
            && Objects.equals(this.commitId, commitRecordDetail.commitId)
            && Objects.equals(this.commitShortId, commitRecordDetail.commitShortId)
            && Objects.equals(this.commitMsg, commitRecordDetail.commitMsg)
            && Objects.equals(this.commitUrl, commitRecordDetail.commitUrl)
            && Objects.equals(this.user, commitRecordDetail.user) && Objects.equals(this.type, commitRecordDetail.type)
            && Objects.equals(this.createDate, commitRecordDetail.createDate)
            && Objects.equals(this.updateDate, commitRecordDetail.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId,
            branchName,
            commitId,
            commitShortId,
            commitMsg,
            commitUrl,
            user,
            type,
            createDate,
            updateDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitRecordDetail {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitShortId: ").append(toIndentedString(commitShortId)).append("\n");
        sb.append("    commitMsg: ").append(toIndentedString(commitMsg)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
