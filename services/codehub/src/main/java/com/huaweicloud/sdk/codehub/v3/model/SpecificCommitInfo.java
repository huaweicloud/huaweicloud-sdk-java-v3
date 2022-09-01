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
 * SpecificCommitInfo
 */
public class SpecificCommitInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_id")

    @JacksonXmlProperty(localName = "short_id")

    private String shortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    @JacksonXmlProperty(localName = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    @JacksonXmlProperty(localName = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email")

    @JacksonXmlProperty(localName = "author_email")

    private String authorEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_name")

    @JacksonXmlProperty(localName = "committer_name")

    private String committerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_email")

    @JacksonXmlProperty(localName = "committer_email")

    private String committerEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_ids")

    @JacksonXmlProperty(localName = "parent_ids")

    private List<String> parentIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committed_date")

    @JacksonXmlProperty(localName = "committed_date")

    private OffsetDateTime committedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authored_date")

    @JacksonXmlProperty(localName = "authored_date")

    private OffsetDateTime authoredDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stats")

    @JacksonXmlProperty(localName = "stats")

    private SpecificCommitInfoStats stats;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_pipeline")

    @JacksonXmlProperty(localName = "last_pipeline")

    private SpecificCommitInfoLastPipeline lastPipeline;

    public SpecificCommitInfo withId(String id) {
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

    public SpecificCommitInfo withShortId(String shortId) {
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

    public SpecificCommitInfo withTitle(String title) {
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

    public SpecificCommitInfo withAuthorName(String authorName) {
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

    public SpecificCommitInfo withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * 作者邮箱
     * @return authorEmail
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public SpecificCommitInfo withCommitterName(String committerName) {
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

    public SpecificCommitInfo withCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
        return this;
    }

    /**
     * 提交作者邮箱
     * @return committerEmail
     */
    public String getCommitterEmail() {
        return committerEmail;
    }

    public void setCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
    }

    public SpecificCommitInfo withCreatedAt(String createdAt) {
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

    public SpecificCommitInfo withMessage(String message) {
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

    public SpecificCommitInfo withParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
        return this;
    }

    public SpecificCommitInfo addParentIdsItem(String parentIdsItem) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        this.parentIds.add(parentIdsItem);
        return this;
    }

    public SpecificCommitInfo withParentIds(Consumer<List<String>> parentIdsSetter) {
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

    public SpecificCommitInfo withCommittedDate(OffsetDateTime committedDate) {
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

    public SpecificCommitInfo withAuthoredDate(OffsetDateTime authoredDate) {
        this.authoredDate = authoredDate;
        return this;
    }

    /**
     * 作者提交时间
     * @return authoredDate
     */
    public OffsetDateTime getAuthoredDate() {
        return authoredDate;
    }

    public void setAuthoredDate(OffsetDateTime authoredDate) {
        this.authoredDate = authoredDate;
    }

    public SpecificCommitInfo withStats(SpecificCommitInfoStats stats) {
        this.stats = stats;
        return this;
    }

    public SpecificCommitInfo withStats(Consumer<SpecificCommitInfoStats> statsSetter) {
        if (this.stats == null) {
            this.stats = new SpecificCommitInfoStats();
            statsSetter.accept(this.stats);
        }

        return this;
    }

    /**
     * Get stats
     * @return stats
     */
    public SpecificCommitInfoStats getStats() {
        return stats;
    }

    public void setStats(SpecificCommitInfoStats stats) {
        this.stats = stats;
    }

    public SpecificCommitInfo withLastPipeline(SpecificCommitInfoLastPipeline lastPipeline) {
        this.lastPipeline = lastPipeline;
        return this;
    }

    public SpecificCommitInfo withLastPipeline(Consumer<SpecificCommitInfoLastPipeline> lastPipelineSetter) {
        if (this.lastPipeline == null) {
            this.lastPipeline = new SpecificCommitInfoLastPipeline();
            lastPipelineSetter.accept(this.lastPipeline);
        }

        return this;
    }

    /**
     * Get lastPipeline
     * @return lastPipeline
     */
    public SpecificCommitInfoLastPipeline getLastPipeline() {
        return lastPipeline;
    }

    public void setLastPipeline(SpecificCommitInfoLastPipeline lastPipeline) {
        this.lastPipeline = lastPipeline;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpecificCommitInfo specificCommitInfo = (SpecificCommitInfo) o;
        return Objects.equals(this.id, specificCommitInfo.id)
            && Objects.equals(this.shortId, specificCommitInfo.shortId)
            && Objects.equals(this.title, specificCommitInfo.title)
            && Objects.equals(this.authorName, specificCommitInfo.authorName)
            && Objects.equals(this.authorEmail, specificCommitInfo.authorEmail)
            && Objects.equals(this.committerName, specificCommitInfo.committerName)
            && Objects.equals(this.committerEmail, specificCommitInfo.committerEmail)
            && Objects.equals(this.createdAt, specificCommitInfo.createdAt)
            && Objects.equals(this.message, specificCommitInfo.message)
            && Objects.equals(this.parentIds, specificCommitInfo.parentIds)
            && Objects.equals(this.committedDate, specificCommitInfo.committedDate)
            && Objects.equals(this.authoredDate, specificCommitInfo.authoredDate)
            && Objects.equals(this.stats, specificCommitInfo.stats)
            && Objects.equals(this.lastPipeline, specificCommitInfo.lastPipeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            shortId,
            title,
            authorName,
            authorEmail,
            committerName,
            committerEmail,
            createdAt,
            message,
            parentIds,
            committedDate,
            authoredDate,
            stats,
            lastPipeline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecificCommitInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
        sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
        sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
        sb.append("    committedDate: ").append(toIndentedString(committedDate)).append("\n");
        sb.append("    authoredDate: ").append(toIndentedString(authoredDate)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
        sb.append("    lastPipeline: ").append(toIndentedString(lastPipeline)).append("\n");
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
