package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * commit相关信息
 */
public class CommitDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_ids")

    private List<String> parentIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authored_date")

    private String authoredDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email")

    private String authorEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committed_date")

    private String committedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_name")

    private String committerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_email")

    private String committerEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_gpg_verified")

    private Boolean openGpgVerified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_status")

    private Integer verificationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_primary_key_id")

    private String gpgPrimaryKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_nick_name")

    private String gpgNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_tenant_name")

    private String gpgTenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_user_name")

    private String gpgUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_id")

    private String shortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_avatar_url")

    private String authorAvatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_avatar_url")

    private String committerAvatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_url")

    private List<RelatedCommitSimpleDto> relateUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public CommitDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CommitDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CommitDto withParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
        return this;
    }

    public CommitDto addParentIdsItem(String parentIdsItem) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        this.parentIds.add(parentIdsItem);
        return this;
    }

    public CommitDto withParentIds(Consumer<List<String>> parentIdsSetter) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        parentIdsSetter.accept(this.parentIds);
        return this;
    }

    /**
     * 父节点提交ID
     * @return parentIds
     */
    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public CommitDto withAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
        return this;
    }

    /**
     * 创建该分支的时间
     * @return authoredDate
     */
    public String getAuthoredDate() {
        return authoredDate;
    }

    public void setAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
    }

    public CommitDto withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * 创建者名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public CommitDto withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * 创建者邮箱
     * @return authorEmail
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public CommitDto withCommittedDate(String committedDate) {
        this.committedDate = committedDate;
        return this;
    }

    /**
     * 代码提交的日期和时间
     * @return committedDate
     */
    public String getCommittedDate() {
        return committedDate;
    }

    public void setCommittedDate(String committedDate) {
        this.committedDate = committedDate;
    }

    public CommitDto withCommitterName(String committerName) {
        this.committerName = committerName;
        return this;
    }

    /**
     * 提交者名称
     * @return committerName
     */
    public String getCommitterName() {
        return committerName;
    }

    public void setCommitterName(String committerName) {
        this.committerName = committerName;
    }

    public CommitDto withCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
        return this;
    }

    /**
     * 提交者邮箱
     * @return committerEmail
     */
    public String getCommitterEmail() {
        return committerEmail;
    }

    public void setCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
    }

    public CommitDto withOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
        return this;
    }

    /**
     * 是否打开gpg校验
     * @return openGpgVerified
     */
    public Boolean getOpenGpgVerified() {
        return openGpgVerified;
    }

    public void setOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
    }

    public CommitDto withVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * 验证状态
     * minimum: 0
     * maximum: 1
     * @return verificationStatus
     */
    public Integer getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public CommitDto withGpgPrimaryKeyId(String gpgPrimaryKeyId) {
        this.gpgPrimaryKeyId = gpgPrimaryKeyId;
        return this;
    }

    /**
     * GPG公钥的标识符
     * @return gpgPrimaryKeyId
     */
    public String getGpgPrimaryKeyId() {
        return gpgPrimaryKeyId;
    }

    public void setGpgPrimaryKeyId(String gpgPrimaryKeyId) {
        this.gpgPrimaryKeyId = gpgPrimaryKeyId;
    }

    public CommitDto withName(String name) {
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

    public CommitDto withGpgNickName(String gpgNickName) {
        this.gpgNickName = gpgNickName;
        return this;
    }

    /**
     * 昵称
     * @return gpgNickName
     */
    public String getGpgNickName() {
        return gpgNickName;
    }

    public void setGpgNickName(String gpgNickName) {
        this.gpgNickName = gpgNickName;
    }

    public CommitDto withGpgTenantName(String gpgTenantName) {
        this.gpgTenantName = gpgTenantName;
        return this;
    }

    /**
     * 租户名
     * @return gpgTenantName
     */
    public String getGpgTenantName() {
        return gpgTenantName;
    }

    public void setGpgTenantName(String gpgTenantName) {
        this.gpgTenantName = gpgTenantName;
    }

    public CommitDto withGpgUserName(String gpgUserName) {
        this.gpgUserName = gpgUserName;
        return this;
    }

    /**
     * 特定GPG用户相关的信息
     * @return gpgUserName
     */
    public String getGpgUserName() {
        return gpgUserName;
    }

    public void setGpgUserName(String gpgUserName) {
        this.gpgUserName = gpgUserName;
    }

    public CommitDto withShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    /**
     * 短id
     * @return shortId
     */
    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public CommitDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CommitDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CommitDto withAuthorAvatarUrl(String authorAvatarUrl) {
        this.authorAvatarUrl = authorAvatarUrl;
        return this;
    }

    /**
     * author_avatar_url
     * @return authorAvatarUrl
     */
    public String getAuthorAvatarUrl() {
        return authorAvatarUrl;
    }

    public void setAuthorAvatarUrl(String authorAvatarUrl) {
        this.authorAvatarUrl = authorAvatarUrl;
    }

    public CommitDto withCommitterAvatarUrl(String committerAvatarUrl) {
        this.committerAvatarUrl = committerAvatarUrl;
        return this;
    }

    /**
     * committer_avatar_url
     * @return committerAvatarUrl
     */
    public String getCommitterAvatarUrl() {
        return committerAvatarUrl;
    }

    public void setCommitterAvatarUrl(String committerAvatarUrl) {
        this.committerAvatarUrl = committerAvatarUrl;
    }

    public CommitDto withRelateUrl(List<RelatedCommitSimpleDto> relateUrl) {
        this.relateUrl = relateUrl;
        return this;
    }

    public CommitDto addRelateUrlItem(RelatedCommitSimpleDto relateUrlItem) {
        if (this.relateUrl == null) {
            this.relateUrl = new ArrayList<>();
        }
        this.relateUrl.add(relateUrlItem);
        return this;
    }

    public CommitDto withRelateUrl(Consumer<List<RelatedCommitSimpleDto>> relateUrlSetter) {
        if (this.relateUrl == null) {
            this.relateUrl = new ArrayList<>();
        }
        relateUrlSetter.accept(this.relateUrl);
        return this;
    }

    /**
     * only for DevCloud
     * @return relateUrl
     */
    public List<RelatedCommitSimpleDto> getRelateUrl() {
        return relateUrl;
    }

    public void setRelateUrl(List<RelatedCommitSimpleDto> relateUrl) {
        this.relateUrl = relateUrl;
    }

    public CommitDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 标题
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public CommitDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * tenant_name
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public CommitDto withUserName(String userName) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitDto that = (CommitDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.message, that.message)
            && Objects.equals(this.parentIds, that.parentIds) && Objects.equals(this.authoredDate, that.authoredDate)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.authorEmail, that.authorEmail)
            && Objects.equals(this.committedDate, that.committedDate)
            && Objects.equals(this.committerName, that.committerName)
            && Objects.equals(this.committerEmail, that.committerEmail)
            && Objects.equals(this.openGpgVerified, that.openGpgVerified)
            && Objects.equals(this.verificationStatus, that.verificationStatus)
            && Objects.equals(this.gpgPrimaryKeyId, that.gpgPrimaryKeyId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.gpgNickName, that.gpgNickName)
            && Objects.equals(this.gpgTenantName, that.gpgTenantName)
            && Objects.equals(this.gpgUserName, that.gpgUserName) && Objects.equals(this.shortId, that.shortId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.title, that.title)
            && Objects.equals(this.authorAvatarUrl, that.authorAvatarUrl)
            && Objects.equals(this.committerAvatarUrl, that.committerAvatarUrl)
            && Objects.equals(this.relateUrl, that.relateUrl) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            message,
            parentIds,
            authoredDate,
            authorName,
            authorEmail,
            committedDate,
            committerName,
            committerEmail,
            openGpgVerified,
            verificationStatus,
            gpgPrimaryKeyId,
            name,
            gpgNickName,
            gpgTenantName,
            gpgUserName,
            shortId,
            createdAt,
            title,
            authorAvatarUrl,
            committerAvatarUrl,
            relateUrl,
            nickName,
            tenantName,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
        sb.append("    authoredDate: ").append(toIndentedString(authoredDate)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
        sb.append("    committedDate: ").append(toIndentedString(committedDate)).append("\n");
        sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
        sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
        sb.append("    openGpgVerified: ").append(toIndentedString(openGpgVerified)).append("\n");
        sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
        sb.append("    gpgPrimaryKeyId: ").append(toIndentedString(gpgPrimaryKeyId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    gpgNickName: ").append(toIndentedString(gpgNickName)).append("\n");
        sb.append("    gpgTenantName: ").append(toIndentedString(gpgTenantName)).append("\n");
        sb.append("    gpgUserName: ").append(toIndentedString(gpgUserName)).append("\n");
        sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    authorAvatarUrl: ").append(toIndentedString(authorAvatarUrl)).append("\n");
        sb.append("    committerAvatarUrl: ").append(toIndentedString(committerAvatarUrl)).append("\n");
        sb.append("    relateUrl: ").append(toIndentedString(relateUrl)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
