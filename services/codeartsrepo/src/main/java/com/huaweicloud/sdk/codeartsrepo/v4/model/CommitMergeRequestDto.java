package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提交关联的合并请求详情
 */
public class CommitMergeRequestDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Integer iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_by")

    private UserBasicDto mergedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_at")

    private String mergedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_by")

    private UserBasicDto closedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_at")

    private String closedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_notes_count")

    private Integer userNotesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upvotes")

    private Integer upvotes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downvotes")

    private Integer downvotes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserBasicDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private List<UserBasicDto> assignee = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_repository_id")

    private Integer sourceRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_repository_id")

    private Integer targetRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_in_progress")

    private Boolean workInProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "milestone")

    private MilestoneBasicDto milestone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_when_pipeline_succeeds")

    private Boolean mergeWhenPipelineSucceeds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_status")

    private String mergeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_commit_sha")

    private String mergeCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discussion_locked")

    private Boolean discussionLocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_remove_source_branch")

    private Boolean forceRemoveSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "should_remove_source_branch")

    private Boolean shouldRemoveSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_collaboration")

    private Boolean allowCollaboration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_maintainer_to_push")

    private Boolean allowMaintainerToPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_stats")

    private IssuableTimeStatsDto timeStats;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash")

    private Boolean squash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_type")

    private String mergeRequestType;

    public CommitMergeRequestDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 合并请求的ID。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CommitMergeRequestDto withIid(Integer iid) {
        this.iid = iid;
        return this;
    }

    /**
     * **参数解释：** 合并请求的序号。
     * @return iid
     */
    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public CommitMergeRequestDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 合并请求的标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CommitMergeRequestDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 合并请求的详细描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommitMergeRequestDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 合并请求的状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CommitMergeRequestDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求创建的时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CommitMergeRequestDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求最后一次更新的时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CommitMergeRequestDto withMergedBy(UserBasicDto mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }

    public CommitMergeRequestDto withMergedBy(Consumer<UserBasicDto> mergedBySetter) {
        if (this.mergedBy == null) {
            this.mergedBy = new UserBasicDto();
            mergedBySetter.accept(this.mergedBy);
        }

        return this;
    }

    /**
     * Get mergedBy
     * @return mergedBy
     */
    public UserBasicDto getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(UserBasicDto mergedBy) {
        this.mergedBy = mergedBy;
    }

    public CommitMergeRequestDto withMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求被合并的时间。
     * @return mergedAt
     */
    public String getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }

    public CommitMergeRequestDto withClosedBy(UserBasicDto closedBy) {
        this.closedBy = closedBy;
        return this;
    }

    public CommitMergeRequestDto withClosedBy(Consumer<UserBasicDto> closedBySetter) {
        if (this.closedBy == null) {
            this.closedBy = new UserBasicDto();
            closedBySetter.accept(this.closedBy);
        }

        return this;
    }

    /**
     * Get closedBy
     * @return closedBy
     */
    public UserBasicDto getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(UserBasicDto closedBy) {
        this.closedBy = closedBy;
    }

    public CommitMergeRequestDto withClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求被关闭的时间。
     * @return closedAt
     */
    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public CommitMergeRequestDto withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 合并请求的目标分支名称。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public CommitMergeRequestDto withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * **参数解释：** 合并请求的源分支名称。
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public CommitMergeRequestDto withUserNotesCount(Integer userNotesCount) {
        this.userNotesCount = userNotesCount;
        return this;
    }

    /**
     * **参数解释：** 合并请求中检视意见的数量。
     * @return userNotesCount
     */
    public Integer getUserNotesCount() {
        return userNotesCount;
    }

    public void setUserNotesCount(Integer userNotesCount) {
        this.userNotesCount = userNotesCount;
    }

    public CommitMergeRequestDto withUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
        return this;
    }

    /**
     * **参数解释：** 合并请求的正向评分数量。
     * @return upvotes
     */
    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public CommitMergeRequestDto withDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
        return this;
    }

    /**
     * **参数解释：** 合并请求的负向评分数量。
     * @return downvotes
     */
    public Integer getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    public CommitMergeRequestDto withAuthor(UserBasicDto author) {
        this.author = author;
        return this;
    }

    public CommitMergeRequestDto withAuthor(Consumer<UserBasicDto> authorSetter) {
        if (this.author == null) {
            this.author = new UserBasicDto();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public UserBasicDto getAuthor() {
        return author;
    }

    public void setAuthor(UserBasicDto author) {
        this.author = author;
    }

    public CommitMergeRequestDto withAssignee(List<UserBasicDto> assignee) {
        this.assignee = assignee;
        return this;
    }

    public CommitMergeRequestDto addAssigneeItem(UserBasicDto assigneeItem) {
        if (this.assignee == null) {
            this.assignee = new ArrayList<>();
        }
        this.assignee.add(assigneeItem);
        return this;
    }

    public CommitMergeRequestDto withAssignee(Consumer<List<UserBasicDto>> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new ArrayList<>();
        }
        assigneeSetter.accept(this.assignee);
        return this;
    }

    /**
     * **参数解释：** 合并请求的可合并人列表。
     * @return assignee
     */
    public List<UserBasicDto> getAssignee() {
        return assignee;
    }

    public void setAssignee(List<UserBasicDto> assignee) {
        this.assignee = assignee;
    }

    public CommitMergeRequestDto withSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
        return this;
    }

    /**
     * **参数解释：** 源仓库的唯一标识符。
     * @return sourceRepositoryId
     */
    public Integer getSourceRepositoryId() {
        return sourceRepositoryId;
    }

    public void setSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
    }

    public CommitMergeRequestDto withTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
        return this;
    }

    /**
     * **参数解释：** 目标仓库的唯一标识符。
     * @return targetRepositoryId
     */
    public Integer getTargetRepositoryId() {
        return targetRepositoryId;
    }

    public void setTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
    }

    public CommitMergeRequestDto withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public CommitMergeRequestDto addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CommitMergeRequestDto withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释：** 合并请求关联的标签列表。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public CommitMergeRequestDto withWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }

    /**
     * **参数解释：** 表示合并请求是否处于“工作进行中”状态。
     * @return workInProgress
     */
    public Boolean getWorkInProgress() {
        return workInProgress;
    }

    public void setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
    }

    public CommitMergeRequestDto withMilestone(MilestoneBasicDto milestone) {
        this.milestone = milestone;
        return this;
    }

    public CommitMergeRequestDto withMilestone(Consumer<MilestoneBasicDto> milestoneSetter) {
        if (this.milestone == null) {
            this.milestone = new MilestoneBasicDto();
            milestoneSetter.accept(this.milestone);
        }

        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    public MilestoneBasicDto getMilestone() {
        return milestone;
    }

    public void setMilestone(MilestoneBasicDto milestone) {
        this.milestone = milestone;
    }

    public CommitMergeRequestDto withMergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
        this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
        return this;
    }

    /**
     * **参数解释：** 表示是否在CI/CD管道成功时自动合并请求。
     * @return mergeWhenPipelineSucceeds
     */
    public Boolean getMergeWhenPipelineSucceeds() {
        return mergeWhenPipelineSucceeds;
    }

    public void setMergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
        this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
    }

    public CommitMergeRequestDto withMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }

    /**
     * **参数解释：** 合并请求的合并状态。
     * @return mergeStatus
     */
    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public CommitMergeRequestDto withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * **参数解释：** 合并请求的提交哈希值。
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public CommitMergeRequestDto withMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }

    /**
     * **参数解释：** 合并提交的哈希值。
     * @return mergeCommitSha
     */
    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    public CommitMergeRequestDto withDiscussionLocked(Boolean discussionLocked) {
        this.discussionLocked = discussionLocked;
        return this;
    }

    /**
     * **参数解释：** 表示合并请求的讨论是否被锁定。
     * @return discussionLocked
     */
    public Boolean getDiscussionLocked() {
        return discussionLocked;
    }

    public void setDiscussionLocked(Boolean discussionLocked) {
        this.discussionLocked = discussionLocked;
    }

    public CommitMergeRequestDto withForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
        return this;
    }

    /**
     * **参数解释：** 表示是否强制删除源分支。
     * @return forceRemoveSourceBranch
     */
    public Boolean getForceRemoveSourceBranch() {
        return forceRemoveSourceBranch;
    }

    public void setForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
    }

    public CommitMergeRequestDto withShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }

    /**
     * **参数解释：** 表示是否应该删除源分支。
     * @return shouldRemoveSourceBranch
     */
    public Boolean getShouldRemoveSourceBranch() {
        return shouldRemoveSourceBranch;
    }

    public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
    }

    public CommitMergeRequestDto withAllowCollaboration(Boolean allowCollaboration) {
        this.allowCollaboration = allowCollaboration;
        return this;
    }

    /**
     * **参数解释：** 表示是否允许协作者参与。
     * @return allowCollaboration
     */
    public Boolean getAllowCollaboration() {
        return allowCollaboration;
    }

    public void setAllowCollaboration(Boolean allowCollaboration) {
        this.allowCollaboration = allowCollaboration;
    }

    public CommitMergeRequestDto withAllowMaintainerToPush(Boolean allowMaintainerToPush) {
        this.allowMaintainerToPush = allowMaintainerToPush;
        return this;
    }

    /**
     * **参数解释：** 表示是否允许维护者推送代码。
     * @return allowMaintainerToPush
     */
    public Boolean getAllowMaintainerToPush() {
        return allowMaintainerToPush;
    }

    public void setAllowMaintainerToPush(Boolean allowMaintainerToPush) {
        this.allowMaintainerToPush = allowMaintainerToPush;
    }

    public CommitMergeRequestDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * **参数解释：** 合并请求的网页URL链接。
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public CommitMergeRequestDto withTimeStats(IssuableTimeStatsDto timeStats) {
        this.timeStats = timeStats;
        return this;
    }

    public CommitMergeRequestDto withTimeStats(Consumer<IssuableTimeStatsDto> timeStatsSetter) {
        if (this.timeStats == null) {
            this.timeStats = new IssuableTimeStatsDto();
            timeStatsSetter.accept(this.timeStats);
        }

        return this;
    }

    /**
     * Get timeStats
     * @return timeStats
     */
    public IssuableTimeStatsDto getTimeStats() {
        return timeStats;
    }

    public void setTimeStats(IssuableTimeStatsDto timeStats) {
        this.timeStats = timeStats;
    }

    public CommitMergeRequestDto withSquash(Boolean squash) {
        this.squash = squash;
        return this;
    }

    /**
     * **参数解释：** 表示是否在合并时将提交压缩为一个。
     * @return squash
     */
    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public CommitMergeRequestDto withMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
        return this;
    }

    /**
     * **参数解释：** 合并请求的类型。
     * @return mergeRequestType
     */
    public String getMergeRequestType() {
        return mergeRequestType;
    }

    public void setMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitMergeRequestDto that = (CommitMergeRequestDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iid, that.iid)
            && Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.state, that.state) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.mergedBy, that.mergedBy)
            && Objects.equals(this.mergedAt, that.mergedAt) && Objects.equals(this.closedBy, that.closedBy)
            && Objects.equals(this.closedAt, that.closedAt) && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.userNotesCount, that.userNotesCount) && Objects.equals(this.upvotes, that.upvotes)
            && Objects.equals(this.downvotes, that.downvotes) && Objects.equals(this.author, that.author)
            && Objects.equals(this.assignee, that.assignee)
            && Objects.equals(this.sourceRepositoryId, that.sourceRepositoryId)
            && Objects.equals(this.targetRepositoryId, that.targetRepositoryId)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.workInProgress, that.workInProgress)
            && Objects.equals(this.milestone, that.milestone)
            && Objects.equals(this.mergeWhenPipelineSucceeds, that.mergeWhenPipelineSucceeds)
            && Objects.equals(this.mergeStatus, that.mergeStatus) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.mergeCommitSha, that.mergeCommitSha)
            && Objects.equals(this.discussionLocked, that.discussionLocked)
            && Objects.equals(this.forceRemoveSourceBranch, that.forceRemoveSourceBranch)
            && Objects.equals(this.shouldRemoveSourceBranch, that.shouldRemoveSourceBranch)
            && Objects.equals(this.allowCollaboration, that.allowCollaboration)
            && Objects.equals(this.allowMaintainerToPush, that.allowMaintainerToPush)
            && Objects.equals(this.webUrl, that.webUrl) && Objects.equals(this.timeStats, that.timeStats)
            && Objects.equals(this.squash, that.squash) && Objects.equals(this.mergeRequestType, that.mergeRequestType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iid,
            title,
            description,
            state,
            createdAt,
            updatedAt,
            mergedBy,
            mergedAt,
            closedBy,
            closedAt,
            targetBranch,
            sourceBranch,
            userNotesCount,
            upvotes,
            downvotes,
            author,
            assignee,
            sourceRepositoryId,
            targetRepositoryId,
            labels,
            workInProgress,
            milestone,
            mergeWhenPipelineSucceeds,
            mergeStatus,
            sha,
            mergeCommitSha,
            discussionLocked,
            forceRemoveSourceBranch,
            shouldRemoveSourceBranch,
            allowCollaboration,
            allowMaintainerToPush,
            webUrl,
            timeStats,
            squash,
            mergeRequestType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitMergeRequestDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    userNotesCount: ").append(toIndentedString(userNotesCount)).append("\n");
        sb.append("    upvotes: ").append(toIndentedString(upvotes)).append("\n");
        sb.append("    downvotes: ").append(toIndentedString(downvotes)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    sourceRepositoryId: ").append(toIndentedString(sourceRepositoryId)).append("\n");
        sb.append("    targetRepositoryId: ").append(toIndentedString(targetRepositoryId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    workInProgress: ").append(toIndentedString(workInProgress)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    mergeWhenPipelineSucceeds: ").append(toIndentedString(mergeWhenPipelineSucceeds)).append("\n");
        sb.append("    mergeStatus: ").append(toIndentedString(mergeStatus)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    mergeCommitSha: ").append(toIndentedString(mergeCommitSha)).append("\n");
        sb.append("    discussionLocked: ").append(toIndentedString(discussionLocked)).append("\n");
        sb.append("    forceRemoveSourceBranch: ").append(toIndentedString(forceRemoveSourceBranch)).append("\n");
        sb.append("    shouldRemoveSourceBranch: ").append(toIndentedString(shouldRemoveSourceBranch)).append("\n");
        sb.append("    allowCollaboration: ").append(toIndentedString(allowCollaboration)).append("\n");
        sb.append("    allowMaintainerToPush: ").append(toIndentedString(allowMaintainerToPush)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    timeStats: ").append(toIndentedString(timeStats)).append("\n");
        sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
        sb.append("    mergeRequestType: ").append(toIndentedString(mergeRequestType)).append("\n");
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
