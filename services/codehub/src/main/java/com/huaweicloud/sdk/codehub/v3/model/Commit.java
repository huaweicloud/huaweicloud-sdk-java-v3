package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Commit */
public class Commit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email")

    private String authorEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authored_date")

    private OffsetDateTime authoredDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committed_date")

    private OffsetDateTime committedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_email")

    private String committerEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_name")

    private String committerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private Object format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_ids")

    private List<String> parentIds = null;

    public Commit withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /** 作者邮箱
     * 
     * @return authorEmail */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public Commit withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /** 作者
     * 
     * @return authorName */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Commit withAuthoredDate(OffsetDateTime authoredDate) {
        this.authoredDate = authoredDate;
        return this;
    }

    /** 作者提交时间
     * 
     * @return authoredDate */
    public OffsetDateTime getAuthoredDate() {
        return authoredDate;
    }

    public void setAuthoredDate(OffsetDateTime authoredDate) {
        this.authoredDate = authoredDate;
    }

    public Commit withCommittedDate(OffsetDateTime committedDate) {
        this.committedDate = committedDate;
        return this;
    }

    /** 提交时间
     * 
     * @return committedDate */
    public OffsetDateTime getCommittedDate() {
        return committedDate;
    }

    public void setCommittedDate(OffsetDateTime committedDate) {
        this.committedDate = committedDate;
    }

    public Commit withCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
        return this;
    }

    /** 提交作者邮箱
     * 
     * @return committerEmail */
    public String getCommitterEmail() {
        return committerEmail;
    }

    public void setCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
    }

    public Commit withCommitterName(String committerName) {
        this.committerName = committerName;
        return this;
    }

    /** 提交作者
     * 
     * @return committerName */
    public String getCommitterName() {
        return committerName;
    }

    public void setCommitterName(String committerName) {
        this.committerName = committerName;
    }

    public Commit withFormat(Object format) {
        this.format = format;
        return this;
    }

    /** 文件变更的详情信息，其格式由请求查询参数 stat_format 决定
     * 
     * @return format */
    public Object getFormat() {
        return format;
    }

    public void setFormat(Object format) {
        this.format = format;
    }

    public Commit withId(String id) {
        this.id = id;
        return this;
    }

    /** 提交对应的SHA id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Commit withMessage(String message) {
        this.message = message;
        return this;
    }

    /** 提交的信息
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Commit withParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
        return this;
    }

    public Commit addParentIdsItem(String parentIdsItem) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        this.parentIds.add(parentIdsItem);
        return this;
    }

    public Commit withParentIds(Consumer<List<String>> parentIdsSetter) {
        if (this.parentIds == null) {
            this.parentIds = new ArrayList<>();
        }
        parentIdsSetter.accept(this.parentIds);
        return this;
    }

    /** 父提交id
     * 
     * @return parentIds */
    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Commit commit = (Commit) o;
        return Objects.equals(this.authorEmail, commit.authorEmail)
            && Objects.equals(this.authorName, commit.authorName)
            && Objects.equals(this.authoredDate, commit.authoredDate)
            && Objects.equals(this.committedDate, commit.committedDate)
            && Objects.equals(this.committerEmail, commit.committerEmail)
            && Objects.equals(this.committerName, commit.committerName) && Objects.equals(this.format, commit.format)
            && Objects.equals(this.id, commit.id) && Objects.equals(this.message, commit.message)
            && Objects.equals(this.parentIds, commit.parentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorEmail,
            authorName,
            authoredDate,
            committedDate,
            committerEmail,
            committerName,
            format,
            id,
            message,
            parentIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Commit {\n");
        sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    authoredDate: ").append(toIndentedString(authoredDate)).append("\n");
        sb.append("    committedDate: ").append(toIndentedString(committedDate)).append("\n");
        sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
        sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
