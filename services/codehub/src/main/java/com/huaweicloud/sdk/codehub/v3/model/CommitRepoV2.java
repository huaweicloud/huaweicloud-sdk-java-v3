package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommitRepoV2
 */
public class CommitRepoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_id")

    @JacksonXmlProperty(localName = "short_id")

    private String shortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    @JacksonXmlProperty(localName = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_ids")

    @JacksonXmlProperty(localName = "parent_ids")

    private List<String> parentIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    @JacksonXmlProperty(localName = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_name")

    @JacksonXmlProperty(localName = "committer_name")

    private String committerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committed_date")

    @JacksonXmlProperty(localName = "committed_date")

    private OffsetDateTime committedDate;

    public CommitRepoV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 提交对应的SHA id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CommitRepoV2 withShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    /**
     * 提交对应的短SHA id
     * @return shortId
     */
    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public CommitRepoV2 withCreatedAt(String createdAt) {
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

    public CommitRepoV2 withTitle(String title) {
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

    public CommitRepoV2 withParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
        return this;
    }

    public CommitRepoV2 addParentIdsItem(String parentIdsItem) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        this.parentIds.add(parentIdsItem);
        return this;
    }

    public CommitRepoV2 withParentIds(Consumer<List<String>> parentIdsSetter) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        parentIdsSetter.accept(this.parentIds);
        return this;
    }

    /**
     * 父提交id
     * @return parentIds
     */
    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public CommitRepoV2 withMessage(String message) {
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

    public CommitRepoV2 withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * 作者
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public CommitRepoV2 withCommitterName(String committerName) {
        this.committerName = committerName;
        return this;
    }

    /**
     * 提交作者
     * @return committerName
     */
    public String getCommitterName() {
        return committerName;
    }

    public void setCommitterName(String committerName) {
        this.committerName = committerName;
    }

    public CommitRepoV2 withCommittedDate(OffsetDateTime committedDate) {
        this.committedDate = committedDate;
        return this;
    }

    /**
     * 提交时间
     * @return committedDate
     */
    public OffsetDateTime getCommittedDate() {
        return committedDate;
    }

    public void setCommittedDate(OffsetDateTime committedDate) {
        this.committedDate = committedDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitRepoV2 commitRepoV2 = (CommitRepoV2) o;
        return Objects.equals(this.id, commitRepoV2.id) && Objects.equals(this.shortId, commitRepoV2.shortId)
            && Objects.equals(this.createdAt, commitRepoV2.createdAt) && Objects.equals(this.title, commitRepoV2.title)
            && Objects.equals(this.parentIds, commitRepoV2.parentIds)
            && Objects.equals(this.message, commitRepoV2.message)
            && Objects.equals(this.authorName, commitRepoV2.authorName)
            && Objects.equals(this.committerName, commitRepoV2.committerName)
            && Objects.equals(this.committedDate, commitRepoV2.committedDate);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, shortId, createdAt, title, parentIds, message, authorName, committerName, committedDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitRepoV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
        sb.append("    committedDate: ").append(toIndentedString(committedDate)).append("\n");
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
