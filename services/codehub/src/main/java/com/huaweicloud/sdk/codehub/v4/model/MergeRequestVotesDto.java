package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 合并请求打分记录(单人)
 */
public class MergeRequestVotesDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_username")

    private String authorUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_committed_id")

    private String lastCommittedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private Integer authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avatar_url")

    private String avatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    public MergeRequestVotesDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 打分记录的id。
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

    public MergeRequestVotesDto withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 分数。
     * minimum: -2
     * maximum: 2
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public MergeRequestVotesDto withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * **参数解释：** 作者名。
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public MergeRequestVotesDto withAuthorUsername(String authorUsername) {
        this.authorUsername = authorUsername;
        return this;
    }

    /**
     * **参数解释：** 作者用户名。
     * @return authorUsername
     */
    public String getAuthorUsername() {
        return authorUsername;
    }

    public void setAuthorUsername(String authorUsername) {
        this.authorUsername = authorUsername;
    }

    public MergeRequestVotesDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public MergeRequestVotesDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MergeRequestVotesDto withLastCommittedId(String lastCommittedId) {
        this.lastCommittedId = lastCommittedId;
        return this;
    }

    /**
     * **参数解释：** 最后一次提交记录的id。
     * @return lastCommittedId
     */
    public String getLastCommittedId() {
        return lastCommittedId;
    }

    public void setLastCommittedId(String lastCommittedId) {
        this.lastCommittedId = lastCommittedId;
    }

    public MergeRequestVotesDto withAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * **参数解释：** 作者id。
     * @return authorId
     */
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public MergeRequestVotesDto withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * **参数解释：** 作者头像url。
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public MergeRequestVotesDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 作者昵称。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public MergeRequestVotesDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 作者租户名称。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestVotesDto that = (MergeRequestVotesDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.score, that.score)
            && Objects.equals(this.authorName, that.authorName)
            && Objects.equals(this.authorUsername, that.authorUsername)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.lastCommittedId, that.lastCommittedId)
            && Objects.equals(this.authorId, that.authorId) && Objects.equals(this.avatarUrl, that.avatarUrl)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.tenantName, that.tenantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            score,
            authorName,
            authorUsername,
            createdAt,
            updatedAt,
            lastCommittedId,
            authorId,
            avatarUrl,
            nickName,
            tenantName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestVotesDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    authorUsername: ").append(toIndentedString(authorUsername)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    lastCommittedId: ").append(toIndentedString(lastCommittedId)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
