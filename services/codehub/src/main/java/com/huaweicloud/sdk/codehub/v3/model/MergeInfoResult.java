package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeInfoResult
 */
public class MergeInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvalMergeRequestApprovers")

    private List<ApprovalMergeRequestApproversItem> approvalMergeRequestApprovers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private Author author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closedAt")

    private String closedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdAt")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devcloudSourceBranch")

    private String devcloudSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Double id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Double iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSourceBranchExist")

    private Boolean isSourceBranchExist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mergeRequestAssigneeList")

    private List<MergeRequestAssigneeListItem> mergeRequestAssigneeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mergeRequestDiff")

    private MergeRequestDiff mergeRequestDiff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mergeStatus")

    private String mergeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceBranch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetBranch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updatedAt")

    private String updatedAt;

    public MergeInfoResult withApprovalMergeRequestApprovers(
        List<ApprovalMergeRequestApproversItem> approvalMergeRequestApprovers) {
        this.approvalMergeRequestApprovers = approvalMergeRequestApprovers;
        return this;
    }

    public MergeInfoResult addApprovalMergeRequestApproversItem(
        ApprovalMergeRequestApproversItem approvalMergeRequestApproversItem) {
        if (this.approvalMergeRequestApprovers == null) {
            this.approvalMergeRequestApprovers = new ArrayList<>();
        }
        this.approvalMergeRequestApprovers.add(approvalMergeRequestApproversItem);
        return this;
    }

    public MergeInfoResult withApprovalMergeRequestApprovers(
        Consumer<List<ApprovalMergeRequestApproversItem>> approvalMergeRequestApproversSetter) {
        if (this.approvalMergeRequestApprovers == null) {
            this.approvalMergeRequestApprovers = new ArrayList<>();
        }
        approvalMergeRequestApproversSetter.accept(this.approvalMergeRequestApprovers);
        return this;
    }

    /**
     * 评审人
     * @return approvalMergeRequestApprovers
     */
    public List<ApprovalMergeRequestApproversItem> getApprovalMergeRequestApprovers() {
        return approvalMergeRequestApprovers;
    }

    public void setApprovalMergeRequestApprovers(
        List<ApprovalMergeRequestApproversItem> approvalMergeRequestApprovers) {
        this.approvalMergeRequestApprovers = approvalMergeRequestApprovers;
    }

    public MergeInfoResult withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public MergeInfoResult withAuthor(Consumer<Author> authorSetter) {
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

    public MergeInfoResult withClosedAt(String closedAt) {
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

    public MergeInfoResult withCreatedAt(String createdAt) {
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

    public MergeInfoResult withDescription(String description) {
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

    public MergeInfoResult withDevcloudSourceBranch(String devcloudSourceBranch) {
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

    public MergeInfoResult withId(Double id) {
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

    public MergeInfoResult withIid(Double iid) {
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

    public MergeInfoResult withIsSourceBranchExist(Boolean isSourceBranchExist) {
        this.isSourceBranchExist = isSourceBranchExist;
        return this;
    }

    /**
     * 源分支是否存在
     * @return isSourceBranchExist
     */
    public Boolean getIsSourceBranchExist() {
        return isSourceBranchExist;
    }

    public void setIsSourceBranchExist(Boolean isSourceBranchExist) {
        this.isSourceBranchExist = isSourceBranchExist;
    }

    public MergeInfoResult withMergeRequestAssigneeList(List<MergeRequestAssigneeListItem> mergeRequestAssigneeList) {
        this.mergeRequestAssigneeList = mergeRequestAssigneeList;
        return this;
    }

    public MergeInfoResult addMergeRequestAssigneeListItem(MergeRequestAssigneeListItem mergeRequestAssigneeListItem) {
        if (this.mergeRequestAssigneeList == null) {
            this.mergeRequestAssigneeList = new ArrayList<>();
        }
        this.mergeRequestAssigneeList.add(mergeRequestAssigneeListItem);
        return this;
    }

    public MergeInfoResult withMergeRequestAssigneeList(
        Consumer<List<MergeRequestAssigneeListItem>> mergeRequestAssigneeListSetter) {
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
    public List<MergeRequestAssigneeListItem> getMergeRequestAssigneeList() {
        return mergeRequestAssigneeList;
    }

    public void setMergeRequestAssigneeList(List<MergeRequestAssigneeListItem> mergeRequestAssigneeList) {
        this.mergeRequestAssigneeList = mergeRequestAssigneeList;
    }

    public MergeInfoResult withMergeRequestDiff(MergeRequestDiff mergeRequestDiff) {
        this.mergeRequestDiff = mergeRequestDiff;
        return this;
    }

    public MergeInfoResult withMergeRequestDiff(Consumer<MergeRequestDiff> mergeRequestDiffSetter) {
        if (this.mergeRequestDiff == null) {
            this.mergeRequestDiff = new MergeRequestDiff();
            mergeRequestDiffSetter.accept(this.mergeRequestDiff);
        }

        return this;
    }

    /**
     * Get mergeRequestDiff
     * @return mergeRequestDiff
     */
    public MergeRequestDiff getMergeRequestDiff() {
        return mergeRequestDiff;
    }

    public void setMergeRequestDiff(MergeRequestDiff mergeRequestDiff) {
        this.mergeRequestDiff = mergeRequestDiff;
    }

    public MergeInfoResult withMergeStatus(String mergeStatus) {
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

    public MergeInfoResult withSourceBranch(String sourceBranch) {
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

    public MergeInfoResult withState(String state) {
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

    public MergeInfoResult withTargetBranch(String targetBranch) {
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

    public MergeInfoResult withTitle(String title) {
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

    public MergeInfoResult withUpdatedAt(String updatedAt) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeInfoResult mergeInfoResult = (MergeInfoResult) o;
        return Objects.equals(this.approvalMergeRequestApprovers, mergeInfoResult.approvalMergeRequestApprovers)
            && Objects.equals(this.author, mergeInfoResult.author)
            && Objects.equals(this.closedAt, mergeInfoResult.closedAt)
            && Objects.equals(this.createdAt, mergeInfoResult.createdAt)
            && Objects.equals(this.description, mergeInfoResult.description)
            && Objects.equals(this.devcloudSourceBranch, mergeInfoResult.devcloudSourceBranch)
            && Objects.equals(this.id, mergeInfoResult.id) && Objects.equals(this.iid, mergeInfoResult.iid)
            && Objects.equals(this.isSourceBranchExist, mergeInfoResult.isSourceBranchExist)
            && Objects.equals(this.mergeRequestAssigneeList, mergeInfoResult.mergeRequestAssigneeList)
            && Objects.equals(this.mergeRequestDiff, mergeInfoResult.mergeRequestDiff)
            && Objects.equals(this.mergeStatus, mergeInfoResult.mergeStatus)
            && Objects.equals(this.sourceBranch, mergeInfoResult.sourceBranch)
            && Objects.equals(this.state, mergeInfoResult.state)
            && Objects.equals(this.targetBranch, mergeInfoResult.targetBranch)
            && Objects.equals(this.title, mergeInfoResult.title)
            && Objects.equals(this.updatedAt, mergeInfoResult.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalMergeRequestApprovers,
            author,
            closedAt,
            createdAt,
            description,
            devcloudSourceBranch,
            id,
            iid,
            isSourceBranchExist,
            mergeRequestAssigneeList,
            mergeRequestDiff,
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
        sb.append("class MergeInfoResult {\n");
        sb.append("    approvalMergeRequestApprovers: ")
            .append(toIndentedString(approvalMergeRequestApprovers))
            .append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    devcloudSourceBranch: ").append(toIndentedString(devcloudSourceBranch)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    isSourceBranchExist: ").append(toIndentedString(isSourceBranchExist)).append("\n");
        sb.append("    mergeRequestAssigneeList: ").append(toIndentedString(mergeRequestAssigneeList)).append("\n");
        sb.append("    mergeRequestDiff: ").append(toIndentedString(mergeRequestDiff)).append("\n");
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
