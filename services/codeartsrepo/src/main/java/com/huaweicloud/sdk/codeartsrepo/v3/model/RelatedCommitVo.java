package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RelatedCommitVo
 */
public class RelatedCommitVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iamId")

    private String iamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userName")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositoryId")

    private String repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userId")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branchName")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commitId")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commitShortId")

    private String commitShortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commitMsg")

    private String commitMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commitUrl")

    private String commitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commitType")

    private String commitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relatedId")

    private String relatedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createAt")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relatedUrl")

    private String relatedUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public RelatedCommitVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RelatedCommitVo withIamId(String iamId) {
        this.iamId = iamId;
        return this;
    }

    /**
     * 用户ID
     * @return iamId
     */
    public String getIamId() {
        return iamId;
    }

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    public RelatedCommitVo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RelatedCommitVo withRepositoryId(String repositoryId) {
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

    public RelatedCommitVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RelatedCommitVo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RelatedCommitVo withBranchName(String branchName) {
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

    public RelatedCommitVo withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Commit ID
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public RelatedCommitVo withCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
        return this;
    }

    /**
     * Commit 短ID
     * @return commitShortId
     */
    public String getCommitShortId() {
        return commitShortId;
    }

    public void setCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
    }

    public RelatedCommitVo withCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }

    /**
     * 提交信息
     * @return commitMsg
     */
    public String getCommitMsg() {
        return commitMsg;
    }

    public void setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
    }

    public RelatedCommitVo withCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * 提交URL
     * @return commitUrl
     */
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public RelatedCommitVo withCommitType(String commitType) {
        this.commitType = commitType;
        return this;
    }

    /**
     * 提交类型
     * @return commitType
     */
    public String getCommitType() {
        return commitType;
    }

    public void setCommitType(String commitType) {
        this.commitType = commitType;
    }

    public RelatedCommitVo withRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    /**
     * Get relatedId
     * @return relatedId
     */
    public String getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }

    public RelatedCommitVo withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public RelatedCommitVo withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public RelatedCommitVo withRelatedUrl(String relatedUrl) {
        this.relatedUrl = relatedUrl;
        return this;
    }

    /**
     * Get relatedUrl
     * @return relatedUrl
     */
    public String getRelatedUrl() {
        return relatedUrl;
    }

    public void setRelatedUrl(String relatedUrl) {
        this.relatedUrl = relatedUrl;
    }

    public RelatedCommitVo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 描述
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelatedCommitVo that = (RelatedCommitVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iamId, that.iamId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.branchName, that.branchName) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.commitShortId, that.commitShortId) && Objects.equals(this.commitMsg, that.commitMsg)
            && Objects.equals(this.commitUrl, that.commitUrl) && Objects.equals(this.commitType, that.commitType)
            && Objects.equals(this.relatedId, that.relatedId) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.relatedUrl, that.relatedUrl)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iamId,
            userName,
            repositoryId,
            type,
            userId,
            branchName,
            commitId,
            commitShortId,
            commitMsg,
            commitUrl,
            commitType,
            relatedId,
            createAt,
            updateAt,
            relatedUrl,
            message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedCommitVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iamId: ").append(toIndentedString(iamId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitShortId: ").append(toIndentedString(commitShortId)).append("\n");
        sb.append("    commitMsg: ").append(toIndentedString(commitMsg)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    commitType: ").append(toIndentedString(commitType)).append("\n");
        sb.append("    relatedId: ").append(toIndentedString(relatedId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    relatedUrl: ").append(toIndentedString(relatedUrl)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
