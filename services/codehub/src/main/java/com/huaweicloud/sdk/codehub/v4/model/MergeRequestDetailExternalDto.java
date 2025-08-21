package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeRequestDetailExternalDto
 */
public class MergeRequestDetailExternalDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Integer iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

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
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_source_branch_protected")

    private Boolean isSourceBranchProtected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devcloud_source_branch")

    private String devcloudSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserBasicExternalDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_repository_id")

    private Integer sourceRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_repository_id")

    private Integer targetRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<Object> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_in_progress")

    private Boolean workInProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "milestone")

    private MilestoneBasicDto milestone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_when_build_succeeds")

    private Boolean mergeWhenBuildSucceeds;

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
    @JsonProperty(value = "subscribed")

    private Boolean subscribed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_by")

    private UserBasicExternalDto mergedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_at")

    private String mergedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_by")

    private UserBasicExternalDto closedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_at")

    private String closedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_notes_count")

    private Integer userNotesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_remove_source_branch")

    private Boolean forceRemoveSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_diff")

    private MergeRequestDiffExternalDto mergeRequestDiff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_reviewers_count")

    private Integer mergeRequestReviewersCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_review_count")

    private Integer mergeRequestReviewCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_reviewer_list")

    private List<MergeRequestReviewerExternalDto> mergeRequestReviewerList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_assignee_list")

    private List<UserBasicExternalDto> mergeRequestAssigneeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private Integer notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codecheck_state")

    private Integer codecheckState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codecheck_defect_count")

    private Integer codecheckDefectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_related_work_items")

    private List<MergeRequestRelatedWorkItemDto> mergeRequestRelatedWorkItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diverged_commits_count")

    private Integer divergedCommitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_result")

    private Boolean moderationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_time")

    private Long moderationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_status")

    private Integer moderationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_use_temp_branch")

    private Boolean isUseTempBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_merge_request_approvers")

    private List<ApprovalUserDto> approvalMergeRequestApprovers = null;

    /**
     * 合并请求模式
     */
    public static final class ReviewModeEnum {

        /**
         * Enum VOTE for value: "vote"
         */
        public static final ReviewModeEnum VOTE = new ReviewModeEnum("vote");

        /**
         * Enum APPROVAL for value: "approval"
         */
        public static final ReviewModeEnum APPROVAL = new ReviewModeEnum("approval");

        private static final Map<String, ReviewModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReviewModeEnum> createStaticFields() {
            Map<String, ReviewModeEnum> map = new HashMap<>();
            map.put("vote", VOTE);
            map.put("approval", APPROVAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReviewModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReviewModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReviewModeEnum(value));
        }

        public static ReviewModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReviewModeEnum) {
                return this.value.equals(((ReviewModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_mode")

    private ReviewModeEnum reviewMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash")

    private Boolean squash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash_commit_message")

    private String squashCommitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rebase_in_progress")

    private Boolean rebaseInProgress;

    public MergeRequestDetailExternalDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 合并请求id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MergeRequestDetailExternalDto withIid(Integer iid) {
        this.iid = iid;
        return this;
    }

    /**
     * 合并请求iid
     * @return iid
     */
    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public MergeRequestDetailExternalDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 目标仓库id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public MergeRequestDetailExternalDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 合并请求标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MergeRequestDetailExternalDto withDescription(String description) {
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

    public MergeRequestDetailExternalDto withState(String state) {
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

    public MergeRequestDetailExternalDto withCreatedAt(String createdAt) {
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

    public MergeRequestDetailExternalDto withUpdatedAt(String updatedAt) {
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

    public MergeRequestDetailExternalDto withSourceBranch(String sourceBranch) {
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

    public MergeRequestDetailExternalDto withTargetBranch(String targetBranch) {
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

    public MergeRequestDetailExternalDto withIsSourceBranchProtected(Boolean isSourceBranchProtected) {
        this.isSourceBranchProtected = isSourceBranchProtected;
        return this;
    }

    /**
     * 源分支是否为保护分支
     * @return isSourceBranchProtected
     */
    public Boolean getIsSourceBranchProtected() {
        return isSourceBranchProtected;
    }

    public void setIsSourceBranchProtected(Boolean isSourceBranchProtected) {
        this.isSourceBranchProtected = isSourceBranchProtected;
    }

    public MergeRequestDetailExternalDto withDevcloudSourceBranch(String devcloudSourceBranch) {
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

    public MergeRequestDetailExternalDto withAuthor(UserBasicExternalDto author) {
        this.author = author;
        return this;
    }

    public MergeRequestDetailExternalDto withAuthor(Consumer<UserBasicExternalDto> authorSetter) {
        if (this.author == null) {
            this.author = new UserBasicExternalDto();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public UserBasicExternalDto getAuthor() {
        return author;
    }

    public void setAuthor(UserBasicExternalDto author) {
        this.author = author;
    }

    public MergeRequestDetailExternalDto withSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
        return this;
    }

    /**
     * 源仓库id
     * @return sourceRepositoryId
     */
    public Integer getSourceRepositoryId() {
        return sourceRepositoryId;
    }

    public void setSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
    }

    public MergeRequestDetailExternalDto withTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
        return this;
    }

    /**
     * 目标仓库id
     * @return targetRepositoryId
     */
    public Integer getTargetRepositoryId() {
        return targetRepositoryId;
    }

    public void setTargetRepositoryId(Integer targetRepositoryId) {
        this.targetRepositoryId = targetRepositoryId;
    }

    public MergeRequestDetailExternalDto withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public MergeRequestDetailExternalDto withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 目标项目id
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public MergeRequestDetailExternalDto withLabels(List<Object> labels) {
        this.labels = labels;
        return this;
    }

    public MergeRequestDetailExternalDto addLabelsItem(Object labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public MergeRequestDetailExternalDto withLabels(Consumer<List<Object>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签
     * @return labels
     */
    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public MergeRequestDetailExternalDto withWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }

    /**
     * WIP状态
     * @return workInProgress
     */
    public Boolean getWorkInProgress() {
        return workInProgress;
    }

    public void setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
    }

    public MergeRequestDetailExternalDto withMilestone(MilestoneBasicDto milestone) {
        this.milestone = milestone;
        return this;
    }

    public MergeRequestDetailExternalDto withMilestone(Consumer<MilestoneBasicDto> milestoneSetter) {
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

    public MergeRequestDetailExternalDto withMergeWhenBuildSucceeds(Boolean mergeWhenBuildSucceeds) {
        this.mergeWhenBuildSucceeds = mergeWhenBuildSucceeds;
        return this;
    }

    /**
     * 流水线成功后自动合入
     * @return mergeWhenBuildSucceeds
     */
    public Boolean getMergeWhenBuildSucceeds() {
        return mergeWhenBuildSucceeds;
    }

    public void setMergeWhenBuildSucceeds(Boolean mergeWhenBuildSucceeds) {
        this.mergeWhenBuildSucceeds = mergeWhenBuildSucceeds;
    }

    public MergeRequestDetailExternalDto withMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }

    /**
     * 可合并状态
     * @return mergeStatus
     */
    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public MergeRequestDetailExternalDto withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * 当前合并请求最新commit
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public MergeRequestDetailExternalDto withMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }

    /**
     * 合入commit节点
     * @return mergeCommitSha
     */
    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    public MergeRequestDetailExternalDto withSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }

    /**
     * 订阅
     * @return subscribed
     */
    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public MergeRequestDetailExternalDto withMergedBy(UserBasicExternalDto mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }

    public MergeRequestDetailExternalDto withMergedBy(Consumer<UserBasicExternalDto> mergedBySetter) {
        if (this.mergedBy == null) {
            this.mergedBy = new UserBasicExternalDto();
            mergedBySetter.accept(this.mergedBy);
        }

        return this;
    }

    /**
     * Get mergedBy
     * @return mergedBy
     */
    public UserBasicExternalDto getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(UserBasicExternalDto mergedBy) {
        this.mergedBy = mergedBy;
    }

    public MergeRequestDetailExternalDto withMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * 合并时间
     * @return mergedAt
     */
    public String getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }

    public MergeRequestDetailExternalDto withClosedBy(UserBasicExternalDto closedBy) {
        this.closedBy = closedBy;
        return this;
    }

    public MergeRequestDetailExternalDto withClosedBy(Consumer<UserBasicExternalDto> closedBySetter) {
        if (this.closedBy == null) {
            this.closedBy = new UserBasicExternalDto();
            closedBySetter.accept(this.closedBy);
        }

        return this;
    }

    /**
     * Get closedBy
     * @return closedBy
     */
    public UserBasicExternalDto getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(UserBasicExternalDto closedBy) {
        this.closedBy = closedBy;
    }

    public MergeRequestDetailExternalDto withClosedAt(String closedAt) {
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

    public MergeRequestDetailExternalDto withUserNotesCount(Integer userNotesCount) {
        this.userNotesCount = userNotesCount;
        return this;
    }

    /**
     * 检视意见数量
     * @return userNotesCount
     */
    public Integer getUserNotesCount() {
        return userNotesCount;
    }

    public void setUserNotesCount(Integer userNotesCount) {
        this.userNotesCount = userNotesCount;
    }

    public MergeRequestDetailExternalDto withForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
        return this;
    }

    /**
     * 合入后删除源分支
     * @return forceRemoveSourceBranch
     */
    public Boolean getForceRemoveSourceBranch() {
        return forceRemoveSourceBranch;
    }

    public void setForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
    }

    public MergeRequestDetailExternalDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 主页url
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public MergeRequestDetailExternalDto withMergeRequestDiff(MergeRequestDiffExternalDto mergeRequestDiff) {
        this.mergeRequestDiff = mergeRequestDiff;
        return this;
    }

    public MergeRequestDetailExternalDto withMergeRequestDiff(
        Consumer<MergeRequestDiffExternalDto> mergeRequestDiffSetter) {
        if (this.mergeRequestDiff == null) {
            this.mergeRequestDiff = new MergeRequestDiffExternalDto();
            mergeRequestDiffSetter.accept(this.mergeRequestDiff);
        }

        return this;
    }

    /**
     * Get mergeRequestDiff
     * @return mergeRequestDiff
     */
    public MergeRequestDiffExternalDto getMergeRequestDiff() {
        return mergeRequestDiff;
    }

    public void setMergeRequestDiff(MergeRequestDiffExternalDto mergeRequestDiff) {
        this.mergeRequestDiff = mergeRequestDiff;
    }

    public MergeRequestDetailExternalDto withMergeRequestReviewersCount(Integer mergeRequestReviewersCount) {
        this.mergeRequestReviewersCount = mergeRequestReviewersCount;
        return this;
    }

    /**
     * 评审人数量
     * @return mergeRequestReviewersCount
     */
    public Integer getMergeRequestReviewersCount() {
        return mergeRequestReviewersCount;
    }

    public void setMergeRequestReviewersCount(Integer mergeRequestReviewersCount) {
        this.mergeRequestReviewersCount = mergeRequestReviewersCount;
    }

    public MergeRequestDetailExternalDto withMergeRequestReviewCount(Integer mergeRequestReviewCount) {
        this.mergeRequestReviewCount = mergeRequestReviewCount;
        return this;
    }

    /**
     * 打分
     * @return mergeRequestReviewCount
     */
    public Integer getMergeRequestReviewCount() {
        return mergeRequestReviewCount;
    }

    public void setMergeRequestReviewCount(Integer mergeRequestReviewCount) {
        this.mergeRequestReviewCount = mergeRequestReviewCount;
    }

    public MergeRequestDetailExternalDto withMergeRequestReviewerList(
        List<MergeRequestReviewerExternalDto> mergeRequestReviewerList) {
        this.mergeRequestReviewerList = mergeRequestReviewerList;
        return this;
    }

    public MergeRequestDetailExternalDto addMergeRequestReviewerListItem(
        MergeRequestReviewerExternalDto mergeRequestReviewerListItem) {
        if (this.mergeRequestReviewerList == null) {
            this.mergeRequestReviewerList = new ArrayList<>();
        }
        this.mergeRequestReviewerList.add(mergeRequestReviewerListItem);
        return this;
    }

    public MergeRequestDetailExternalDto withMergeRequestReviewerList(
        Consumer<List<MergeRequestReviewerExternalDto>> mergeRequestReviewerListSetter) {
        if (this.mergeRequestReviewerList == null) {
            this.mergeRequestReviewerList = new ArrayList<>();
        }
        mergeRequestReviewerListSetter.accept(this.mergeRequestReviewerList);
        return this;
    }

    /**
     * 评审人列表
     * @return mergeRequestReviewerList
     */
    public List<MergeRequestReviewerExternalDto> getMergeRequestReviewerList() {
        return mergeRequestReviewerList;
    }

    public void setMergeRequestReviewerList(List<MergeRequestReviewerExternalDto> mergeRequestReviewerList) {
        this.mergeRequestReviewerList = mergeRequestReviewerList;
    }

    public MergeRequestDetailExternalDto withMergeRequestAssigneeList(
        List<UserBasicExternalDto> mergeRequestAssigneeList) {
        this.mergeRequestAssigneeList = mergeRequestAssigneeList;
        return this;
    }

    public MergeRequestDetailExternalDto addMergeRequestAssigneeListItem(
        UserBasicExternalDto mergeRequestAssigneeListItem) {
        if (this.mergeRequestAssigneeList == null) {
            this.mergeRequestAssigneeList = new ArrayList<>();
        }
        this.mergeRequestAssigneeList.add(mergeRequestAssigneeListItem);
        return this;
    }

    public MergeRequestDetailExternalDto withMergeRequestAssigneeList(
        Consumer<List<UserBasicExternalDto>> mergeRequestAssigneeListSetter) {
        if (this.mergeRequestAssigneeList == null) {
            this.mergeRequestAssigneeList = new ArrayList<>();
        }
        mergeRequestAssigneeListSetter.accept(this.mergeRequestAssigneeList);
        return this;
    }

    /**
     * 合并人列表
     * @return mergeRequestAssigneeList
     */
    public List<UserBasicExternalDto> getMergeRequestAssigneeList() {
        return mergeRequestAssigneeList;
    }

    public void setMergeRequestAssigneeList(List<UserBasicExternalDto> mergeRequestAssigneeList) {
        this.mergeRequestAssigneeList = mergeRequestAssigneeList;
    }

    public MergeRequestDetailExternalDto withNotes(Integer notes) {
        this.notes = notes;
        return this;
    }

    /**
     * 检视意见
     * @return notes
     */
    public Integer getNotes() {
        return notes;
    }

    public void setNotes(Integer notes) {
        this.notes = notes;
    }

    public MergeRequestDetailExternalDto withCodecheckState(Integer codecheckState) {
        this.codecheckState = codecheckState;
        return this;
    }

    /**
     * 代码检查状态
     * @return codecheckState
     */
    public Integer getCodecheckState() {
        return codecheckState;
    }

    public void setCodecheckState(Integer codecheckState) {
        this.codecheckState = codecheckState;
    }

    public MergeRequestDetailExternalDto withCodecheckDefectCount(Integer codecheckDefectCount) {
        this.codecheckDefectCount = codecheckDefectCount;
        return this;
    }

    /**
     * 代码检查问题数
     * @return codecheckDefectCount
     */
    public Integer getCodecheckDefectCount() {
        return codecheckDefectCount;
    }

    public void setCodecheckDefectCount(Integer codecheckDefectCount) {
        this.codecheckDefectCount = codecheckDefectCount;
    }

    public MergeRequestDetailExternalDto withMergeRequestRelatedWorkItems(
        List<MergeRequestRelatedWorkItemDto> mergeRequestRelatedWorkItems) {
        this.mergeRequestRelatedWorkItems = mergeRequestRelatedWorkItems;
        return this;
    }

    public MergeRequestDetailExternalDto addMergeRequestRelatedWorkItemsItem(
        MergeRequestRelatedWorkItemDto mergeRequestRelatedWorkItemsItem) {
        if (this.mergeRequestRelatedWorkItems == null) {
            this.mergeRequestRelatedWorkItems = new ArrayList<>();
        }
        this.mergeRequestRelatedWorkItems.add(mergeRequestRelatedWorkItemsItem);
        return this;
    }

    public MergeRequestDetailExternalDto withMergeRequestRelatedWorkItems(
        Consumer<List<MergeRequestRelatedWorkItemDto>> mergeRequestRelatedWorkItemsSetter) {
        if (this.mergeRequestRelatedWorkItems == null) {
            this.mergeRequestRelatedWorkItems = new ArrayList<>();
        }
        mergeRequestRelatedWorkItemsSetter.accept(this.mergeRequestRelatedWorkItems);
        return this;
    }

    /**
     * 合并请求关联单数量
     * @return mergeRequestRelatedWorkItems
     */
    public List<MergeRequestRelatedWorkItemDto> getMergeRequestRelatedWorkItems() {
        return mergeRequestRelatedWorkItems;
    }

    public void setMergeRequestRelatedWorkItems(List<MergeRequestRelatedWorkItemDto> mergeRequestRelatedWorkItems) {
        this.mergeRequestRelatedWorkItems = mergeRequestRelatedWorkItems;
    }

    public MergeRequestDetailExternalDto withDivergedCommitsCount(Integer divergedCommitsCount) {
        this.divergedCommitsCount = divergedCommitsCount;
        return this;
    }

    /**
     * 源分支落后commit数
     * @return divergedCommitsCount
     */
    public Integer getDivergedCommitsCount() {
        return divergedCommitsCount;
    }

    public void setDivergedCommitsCount(Integer divergedCommitsCount) {
        this.divergedCommitsCount = divergedCommitsCount;
    }

    public MergeRequestDetailExternalDto withModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }

    /**
     * 送审结果
     * @return moderationResult
     */
    public Boolean getModerationResult() {
        return moderationResult;
    }

    public void setModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
    }

    public MergeRequestDetailExternalDto withModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
        return this;
    }

    /**
     * 送审时间时间戳
     * minimum: 1
     * maximum: 9223372036854775807
     * @return moderationTime
     */
    public Long getModerationTime() {
        return moderationTime;
    }

    public void setModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
    }

    public MergeRequestDetailExternalDto withModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
        return this;
    }

    /**
     * 送审状态码
     * minimum: 1
     * maximum: 2147483647
     * @return moderationStatus
     */
    public Integer getModerationStatus() {
        return moderationStatus;
    }

    public void setModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    public MergeRequestDetailExternalDto withIsUseTempBranch(Boolean isUseTempBranch) {
        this.isUseTempBranch = isUseTempBranch;
        return this;
    }

    /**
     * 是否使用临时分支
     * @return isUseTempBranch
     */
    public Boolean getIsUseTempBranch() {
        return isUseTempBranch;
    }

    public void setIsUseTempBranch(Boolean isUseTempBranch) {
        this.isUseTempBranch = isUseTempBranch;
    }

    public MergeRequestDetailExternalDto withApprovalMergeRequestApprovers(
        List<ApprovalUserDto> approvalMergeRequestApprovers) {
        this.approvalMergeRequestApprovers = approvalMergeRequestApprovers;
        return this;
    }

    public MergeRequestDetailExternalDto addApprovalMergeRequestApproversItem(
        ApprovalUserDto approvalMergeRequestApproversItem) {
        if (this.approvalMergeRequestApprovers == null) {
            this.approvalMergeRequestApprovers = new ArrayList<>();
        }
        this.approvalMergeRequestApprovers.add(approvalMergeRequestApproversItem);
        return this;
    }

    public MergeRequestDetailExternalDto withApprovalMergeRequestApprovers(
        Consumer<List<ApprovalUserDto>> approvalMergeRequestApproversSetter) {
        if (this.approvalMergeRequestApprovers == null) {
            this.approvalMergeRequestApprovers = new ArrayList<>();
        }
        approvalMergeRequestApproversSetter.accept(this.approvalMergeRequestApprovers);
        return this;
    }

    /**
     * 审核人
     * @return approvalMergeRequestApprovers
     */
    public List<ApprovalUserDto> getApprovalMergeRequestApprovers() {
        return approvalMergeRequestApprovers;
    }

    public void setApprovalMergeRequestApprovers(List<ApprovalUserDto> approvalMergeRequestApprovers) {
        this.approvalMergeRequestApprovers = approvalMergeRequestApprovers;
    }

    public MergeRequestDetailExternalDto withReviewMode(ReviewModeEnum reviewMode) {
        this.reviewMode = reviewMode;
        return this;
    }

    /**
     * 合并请求模式
     * @return reviewMode
     */
    public ReviewModeEnum getReviewMode() {
        return reviewMode;
    }

    public void setReviewMode(ReviewModeEnum reviewMode) {
        this.reviewMode = reviewMode;
    }

    public MergeRequestDetailExternalDto withSquash(Boolean squash) {
        this.squash = squash;
        return this;
    }

    /**
     * squash合入
     * @return squash
     */
    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public MergeRequestDetailExternalDto withSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
        return this;
    }

    /**
     * squash提交信息
     * @return squashCommitMessage
     */
    public String getSquashCommitMessage() {
        return squashCommitMessage;
    }

    public void setSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
    }

    public MergeRequestDetailExternalDto withRebaseInProgress(Boolean rebaseInProgress) {
        this.rebaseInProgress = rebaseInProgress;
        return this;
    }

    /**
     * 是否正在rebase
     * @return rebaseInProgress
     */
    public Boolean getRebaseInProgress() {
        return rebaseInProgress;
    }

    public void setRebaseInProgress(Boolean rebaseInProgress) {
        this.rebaseInProgress = rebaseInProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestDetailExternalDto that = (MergeRequestDetailExternalDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iid, that.iid)
            && Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.state, that.state)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.isSourceBranchProtected, that.isSourceBranchProtected)
            && Objects.equals(this.devcloudSourceBranch, that.devcloudSourceBranch)
            && Objects.equals(this.author, that.author)
            && Objects.equals(this.sourceRepositoryId, that.sourceRepositoryId)
            && Objects.equals(this.targetRepositoryId, that.targetRepositoryId)
            && Objects.equals(this.sourceProjectId, that.sourceProjectId)
            && Objects.equals(this.targetProjectId, that.targetProjectId) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.workInProgress, that.workInProgress)
            && Objects.equals(this.milestone, that.milestone)
            && Objects.equals(this.mergeWhenBuildSucceeds, that.mergeWhenBuildSucceeds)
            && Objects.equals(this.mergeStatus, that.mergeStatus) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.mergeCommitSha, that.mergeCommitSha)
            && Objects.equals(this.subscribed, that.subscribed) && Objects.equals(this.mergedBy, that.mergedBy)
            && Objects.equals(this.mergedAt, that.mergedAt) && Objects.equals(this.closedBy, that.closedBy)
            && Objects.equals(this.closedAt, that.closedAt) && Objects.equals(this.userNotesCount, that.userNotesCount)
            && Objects.equals(this.forceRemoveSourceBranch, that.forceRemoveSourceBranch)
            && Objects.equals(this.webUrl, that.webUrl) && Objects.equals(this.mergeRequestDiff, that.mergeRequestDiff)
            && Objects.equals(this.mergeRequestReviewersCount, that.mergeRequestReviewersCount)
            && Objects.equals(this.mergeRequestReviewCount, that.mergeRequestReviewCount)
            && Objects.equals(this.mergeRequestReviewerList, that.mergeRequestReviewerList)
            && Objects.equals(this.mergeRequestAssigneeList, that.mergeRequestAssigneeList)
            && Objects.equals(this.notes, that.notes) && Objects.equals(this.codecheckState, that.codecheckState)
            && Objects.equals(this.codecheckDefectCount, that.codecheckDefectCount)
            && Objects.equals(this.mergeRequestRelatedWorkItems, that.mergeRequestRelatedWorkItems)
            && Objects.equals(this.divergedCommitsCount, that.divergedCommitsCount)
            && Objects.equals(this.moderationResult, that.moderationResult)
            && Objects.equals(this.moderationTime, that.moderationTime)
            && Objects.equals(this.moderationStatus, that.moderationStatus)
            && Objects.equals(this.isUseTempBranch, that.isUseTempBranch)
            && Objects.equals(this.approvalMergeRequestApprovers, that.approvalMergeRequestApprovers)
            && Objects.equals(this.reviewMode, that.reviewMode) && Objects.equals(this.squash, that.squash)
            && Objects.equals(this.squashCommitMessage, that.squashCommitMessage)
            && Objects.equals(this.rebaseInProgress, that.rebaseInProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iid,
            repositoryId,
            title,
            description,
            state,
            createdAt,
            updatedAt,
            sourceBranch,
            targetBranch,
            isSourceBranchProtected,
            devcloudSourceBranch,
            author,
            sourceRepositoryId,
            targetRepositoryId,
            sourceProjectId,
            targetProjectId,
            labels,
            workInProgress,
            milestone,
            mergeWhenBuildSucceeds,
            mergeStatus,
            sha,
            mergeCommitSha,
            subscribed,
            mergedBy,
            mergedAt,
            closedBy,
            closedAt,
            userNotesCount,
            forceRemoveSourceBranch,
            webUrl,
            mergeRequestDiff,
            mergeRequestReviewersCount,
            mergeRequestReviewCount,
            mergeRequestReviewerList,
            mergeRequestAssigneeList,
            notes,
            codecheckState,
            codecheckDefectCount,
            mergeRequestRelatedWorkItems,
            divergedCommitsCount,
            moderationResult,
            moderationTime,
            moderationStatus,
            isUseTempBranch,
            approvalMergeRequestApprovers,
            reviewMode,
            squash,
            squashCommitMessage,
            rebaseInProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestDetailExternalDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    isSourceBranchProtected: ").append(toIndentedString(isSourceBranchProtected)).append("\n");
        sb.append("    devcloudSourceBranch: ").append(toIndentedString(devcloudSourceBranch)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    sourceRepositoryId: ").append(toIndentedString(sourceRepositoryId)).append("\n");
        sb.append("    targetRepositoryId: ").append(toIndentedString(targetRepositoryId)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    workInProgress: ").append(toIndentedString(workInProgress)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    mergeWhenBuildSucceeds: ").append(toIndentedString(mergeWhenBuildSucceeds)).append("\n");
        sb.append("    mergeStatus: ").append(toIndentedString(mergeStatus)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    mergeCommitSha: ").append(toIndentedString(mergeCommitSha)).append("\n");
        sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
        sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    userNotesCount: ").append(toIndentedString(userNotesCount)).append("\n");
        sb.append("    forceRemoveSourceBranch: ").append(toIndentedString(forceRemoveSourceBranch)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    mergeRequestDiff: ").append(toIndentedString(mergeRequestDiff)).append("\n");
        sb.append("    mergeRequestReviewersCount: ").append(toIndentedString(mergeRequestReviewersCount)).append("\n");
        sb.append("    mergeRequestReviewCount: ").append(toIndentedString(mergeRequestReviewCount)).append("\n");
        sb.append("    mergeRequestReviewerList: ").append(toIndentedString(mergeRequestReviewerList)).append("\n");
        sb.append("    mergeRequestAssigneeList: ").append(toIndentedString(mergeRequestAssigneeList)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    codecheckState: ").append(toIndentedString(codecheckState)).append("\n");
        sb.append("    codecheckDefectCount: ").append(toIndentedString(codecheckDefectCount)).append("\n");
        sb.append("    mergeRequestRelatedWorkItems: ")
            .append(toIndentedString(mergeRequestRelatedWorkItems))
            .append("\n");
        sb.append("    divergedCommitsCount: ").append(toIndentedString(divergedCommitsCount)).append("\n");
        sb.append("    moderationResult: ").append(toIndentedString(moderationResult)).append("\n");
        sb.append("    moderationTime: ").append(toIndentedString(moderationTime)).append("\n");
        sb.append("    moderationStatus: ").append(toIndentedString(moderationStatus)).append("\n");
        sb.append("    isUseTempBranch: ").append(toIndentedString(isUseTempBranch)).append("\n");
        sb.append("    approvalMergeRequestApprovers: ")
            .append(toIndentedString(approvalMergeRequestApprovers))
            .append("\n");
        sb.append("    reviewMode: ").append(toIndentedString(reviewMode)).append("\n");
        sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
        sb.append("    squashCommitMessage: ").append(toIndentedString(squashCommitMessage)).append("\n");
        sb.append("    rebaseInProgress: ").append(toIndentedString(rebaseInProgress)).append("\n");
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
