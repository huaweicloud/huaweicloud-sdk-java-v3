package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合并请求commit列表详情
 */
public class MergeRequestCommitDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_id")

    private String shortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authored_date")

    private String authoredDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committed_date")

    private String committedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_name")

    private String committerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_primary_key_id")

    private String gpgPrimaryKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_gpg_verified")

    private Boolean openGpgVerified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_status")

    private Boolean verificationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_ids")

    private List<String> parentIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public MergeRequestCommitDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * commit id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MergeRequestCommitDto withShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    /**
     * commit 短id
     * @return shortId
     */
    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public MergeRequestCommitDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 提交标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MergeRequestCommitDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 提交信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MergeRequestCommitDto withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * commit 作者名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public MergeRequestCommitDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MergeRequestCommitDto withUserName(String userName) {
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

    public MergeRequestCommitDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public MergeRequestCommitDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public MergeRequestCommitDto withAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
        return this;
    }

    /**
     * 最初commit 提交日期（本地提交日期）
     * @return authoredDate
     */
    public String getAuthoredDate() {
        return authoredDate;
    }

    public void setAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
    }

    public MergeRequestCommitDto withCommittedDate(String committedDate) {
        this.committedDate = committedDate;
        return this;
    }

    /**
     * commit提交日期（推送至仓库日期）
     * @return committedDate
     */
    public String getCommittedDate() {
        return committedDate;
    }

    public void setCommittedDate(String committedDate) {
        this.committedDate = committedDate;
    }

    public MergeRequestCommitDto withCommitterName(String committerName) {
        this.committerName = committerName;
        return this;
    }

    /**
     * commit 提交者名称
     * @return committerName
     */
    public String getCommitterName() {
        return committerName;
    }

    public void setCommitterName(String committerName) {
        this.committerName = committerName;
    }

    public MergeRequestCommitDto withGpgPrimaryKeyId(String gpgPrimaryKeyId) {
        this.gpgPrimaryKeyId = gpgPrimaryKeyId;
        return this;
    }

    /**
     * pgp key id
     * @return gpgPrimaryKeyId
     */
    public String getGpgPrimaryKeyId() {
        return gpgPrimaryKeyId;
    }

    public void setGpgPrimaryKeyId(String gpgPrimaryKeyId) {
        this.gpgPrimaryKeyId = gpgPrimaryKeyId;
    }

    public MergeRequestCommitDto withOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
        return this;
    }

    /**
     * gpg公钥验证是否开启
     * @return openGpgVerified
     */
    public Boolean getOpenGpgVerified() {
        return openGpgVerified;
    }

    public void setOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
    }

    public MergeRequestCommitDto withVerificationStatus(Boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * gpg公钥验证是否通过
     * @return verificationStatus
     */
    public Boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(Boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public MergeRequestCommitDto withParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
        return this;
    }

    public MergeRequestCommitDto addParentIdsItem(String parentIdsItem) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        this.parentIds.add(parentIdsItem);
        return this;
    }

    public MergeRequestCommitDto withParentIds(Consumer<List<String>> parentIdsSetter) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        parentIdsSetter.accept(this.parentIds);
        return this;
    }

    /**
     * 提交父commit节点
     * @return parentIds
     */
    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public MergeRequestCommitDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * commit 数据库记录创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestCommitDto that = (MergeRequestCommitDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.shortId, that.shortId)
            && Objects.equals(this.title, that.title) && Objects.equals(this.message, that.message)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.tenantName, that.tenantName)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.authoredDate, that.authoredDate)
            && Objects.equals(this.committedDate, that.committedDate)
            && Objects.equals(this.committerName, that.committerName)
            && Objects.equals(this.gpgPrimaryKeyId, that.gpgPrimaryKeyId)
            && Objects.equals(this.openGpgVerified, that.openGpgVerified)
            && Objects.equals(this.verificationStatus, that.verificationStatus)
            && Objects.equals(this.parentIds, that.parentIds) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            shortId,
            title,
            message,
            authorName,
            name,
            userName,
            tenantName,
            nickName,
            authoredDate,
            committedDate,
            committerName,
            gpgPrimaryKeyId,
            openGpgVerified,
            verificationStatus,
            parentIds,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestCommitDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    authoredDate: ").append(toIndentedString(authoredDate)).append("\n");
        sb.append("    committedDate: ").append(toIndentedString(committedDate)).append("\n");
        sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
        sb.append("    gpgPrimaryKeyId: ").append(toIndentedString(gpgPrimaryKeyId)).append("\n");
        sb.append("    openGpgVerified: ").append(toIndentedString(openGpgVerified)).append("\n");
        sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
        sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
