package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeRequestsItem
 */
public class MergeRequestsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private Author author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_at")

    private String closedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devcloud_source_branch")

    private String devcloudSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Double id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Double iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_assignee_list")

    private List<Author> mergeRequestAssigneeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_status")

    private String mergeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public MergeRequestsItem withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public MergeRequestsItem withAuthor(Consumer<Author> authorSetter) {
        if (this.author == null) {
            this.author = new Author();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public MergeRequestsItem withClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * 关闭时间
     * @return closedAt
     */
    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public MergeRequestsItem withCreatedAt(String createdAt) {
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

    public MergeRequestsItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 合并请求描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MergeRequestsItem withDevcloudSourceBranch(String devcloudSourceBranch) {
        this.devcloudSourceBranch = devcloudSourceBranch;
        return this;
    }

    /**
     * 源分支
     * @return devcloudSourceBranch
     */
    public String getDevcloudSourceBranch() {
        return devcloudSourceBranch;
    }

    public void setDevcloudSourceBranch(String devcloudSourceBranch) {
        this.devcloudSourceBranch = devcloudSourceBranch;
    }

    public MergeRequestsItem withId(Double id) {
        this.id = id;
        return this;
    }

    /**
     * 合并请求id
     * @return id
     */
    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public MergeRequestsItem withIid(Double iid) {
        this.iid = iid;
        return this;
    }

    /**
     * 当前仓库内合并请求序号
     * @return iid
     */
    public Double getIid() {
        return iid;
    }

    public void setIid(Double iid) {
        this.iid = iid;
    }

    public MergeRequestsItem withMergeRequestAssigneeList(List<Author> mergeRequestAssigneeList) {
        this.mergeRequestAssigneeList = mergeRequestAssigneeList;
        return this;
    }

    public MergeRequestsItem addMergeRequestAssigneeListItem(Author mergeRequestAssigneeListItem) {
        if (this.mergeRequestAssigneeList == null) {
            this.mergeRequestAssigneeList = new ArrayList<>();
        }
        this.mergeRequestAssigneeList.add(mergeRequestAssigneeListItem);
        return this;
    }

    public MergeRequestsItem withMergeRequestAssigneeList(Consumer<List<Author>> mergeRequestAssigneeListSetter) {
        if (this.mergeRequestAssigneeList == null) {
            this.mergeRequestAssigneeList = new ArrayList<>();
        }
        mergeRequestAssigneeListSetter.accept(this.mergeRequestAssigneeList);
        return this;
    }

    /**
     * 检视人
     * @return mergeRequestAssigneeList
     */
    public List<Author> getMergeRequestAssigneeList() {
        return mergeRequestAssigneeList;
    }

    public void setMergeRequestAssigneeList(List<Author> mergeRequestAssigneeList) {
        this.mergeRequestAssigneeList = mergeRequestAssigneeList;
    }

    public MergeRequestsItem withMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }

    /**
     * 是否可以被合并
     * @return mergeStatus
     */
    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public MergeRequestsItem withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * 源分支
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public MergeRequestsItem withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 合并请求状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MergeRequestsItem withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * 目标分支
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public MergeRequestsItem withTitle(String title) {
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

    public MergeRequestsItem withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestsItem that = (MergeRequestsItem) obj;
        return Objects.equals(this.author, that.author) && Objects.equals(this.closedAt, that.closedAt)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.devcloudSourceBranch, that.devcloudSourceBranch) && Objects.equals(this.id, that.id)
            && Objects.equals(this.iid, that.iid)
            && Objects.equals(this.mergeRequestAssigneeList, that.mergeRequestAssigneeList)
            && Objects.equals(this.mergeStatus, that.mergeStatus)
            && Objects.equals(this.sourceBranch, that.sourceBranch) && Objects.equals(this.state, that.state)
            && Objects.equals(this.targetBranch, that.targetBranch) && Objects.equals(this.title, that.title)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author,
            closedAt,
            createdAt,
            description,
            devcloudSourceBranch,
            id,
            iid,
            mergeRequestAssigneeList,
            mergeStatus,
            sourceBranch,
            state,
            targetBranch,
            title,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestsItem {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    devcloudSourceBranch: ").append(toIndentedString(devcloudSourceBranch)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    mergeRequestAssigneeList: ").append(toIndentedString(mergeRequestAssigneeList)).append("\n");
        sb.append("    mergeStatus: ").append(toIndentedString(mergeStatus)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
