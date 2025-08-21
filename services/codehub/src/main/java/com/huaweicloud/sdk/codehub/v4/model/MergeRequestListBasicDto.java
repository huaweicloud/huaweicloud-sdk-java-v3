package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合并请求基本信息
 */
public class MergeRequestListBasicDto {

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
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

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
    @JsonProperty(value = "source_repository_id")

    private Integer sourceRepositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_mode")

    private String reviewMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserBasicDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_at")

    private String closedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_by")

    private UserBasicDto closedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_at")

    private String mergedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged_by")

    private UserBasicDto mergedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_status")

    private String pipelineStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codequality_status")

    private String codequalityStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_status_with_code_quality")

    private String pipelineStatusWithCodeQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private Integer notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_repository")

    private ProjectSimpleDto sourceRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_repository")

    private ProjectSimpleDto targetRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_type")

    private String mergeRequestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_git_url")

    private String sourceGitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<Map<String, Object>> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_merged_score")

    private Integer minMergedScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_product_id")

    private String sourceProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_product_id")

    private String targetProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes_count")

    private NotesCountDto notesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_result")

    private Boolean moderationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_time")

    private Long moderationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_status")

    private Integer moderationStatus;

    public MergeRequestListBasicDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 合并请求ID。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MergeRequestListBasicDto withIid(Integer iid) {
        this.iid = iid;
        return this;
    }

    /**
     * **参数解释：** 合并请求位于当前仓库序号。
     * @return iid
     */
    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public MergeRequestListBasicDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 合并请求标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MergeRequestListBasicDto withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * **参数解释：** 合并请求源分支。
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public MergeRequestListBasicDto withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 合并请求目标分支。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public MergeRequestListBasicDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 合并请求状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MergeRequestListBasicDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public MergeRequestListBasicDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MergeRequestListBasicDto withSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
        return this;
    }

    /**
     * **参数解释：** 合并请求源仓库ID。
     * @return sourceRepositoryId
     */
    public Integer getSourceRepositoryId() {
        return sourceRepositoryId;
    }

    public void setSourceRepositoryId(Integer sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
    }

    public MergeRequestListBasicDto withReviewMode(String reviewMode) {
        this.reviewMode = reviewMode;
        return this;
    }

    /**
     * **参数解释：** 合并请求检视模式。
     * @return reviewMode
     */
    public String getReviewMode() {
        return reviewMode;
    }

    public void setReviewMode(String reviewMode) {
        this.reviewMode = reviewMode;
    }

    public MergeRequestListBasicDto withAuthor(UserBasicDto author) {
        this.author = author;
        return this;
    }

    public MergeRequestListBasicDto withAuthor(Consumer<UserBasicDto> authorSetter) {
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

    public MergeRequestListBasicDto withClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求关闭时间。
     * @return closedAt
     */
    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public MergeRequestListBasicDto withClosedBy(UserBasicDto closedBy) {
        this.closedBy = closedBy;
        return this;
    }

    public MergeRequestListBasicDto withClosedBy(Consumer<UserBasicDto> closedBySetter) {
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

    public MergeRequestListBasicDto withMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    /**
     * **参数解释：** 合并请求合并时间。
     * @return mergedAt
     */
    public String getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }

    public MergeRequestListBasicDto withMergedBy(UserBasicDto mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }

    public MergeRequestListBasicDto withMergedBy(Consumer<UserBasicDto> mergedBySetter) {
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

    public MergeRequestListBasicDto withPipelineStatus(String pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
        return this;
    }

    /**
     * **参数解释：** 合并请求流水线状态。
     * @return pipelineStatus
     */
    public String getPipelineStatus() {
        return pipelineStatus;
    }

    public void setPipelineStatus(String pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
    }

    public MergeRequestListBasicDto withCodequalityStatus(String codequalityStatus) {
        this.codequalityStatus = codequalityStatus;
        return this;
    }

    /**
     * **参数解释：** 合并请求代码质量状态。
     * @return codequalityStatus
     */
    public String getCodequalityStatus() {
        return codequalityStatus;
    }

    public void setCodequalityStatus(String codequalityStatus) {
        this.codequalityStatus = codequalityStatus;
    }

    public MergeRequestListBasicDto withPipelineStatusWithCodeQuality(String pipelineStatusWithCodeQuality) {
        this.pipelineStatusWithCodeQuality = pipelineStatusWithCodeQuality;
        return this;
    }

    /**
     * **参数解释：** 合并请求流水线状态。
     * @return pipelineStatusWithCodeQuality
     */
    public String getPipelineStatusWithCodeQuality() {
        return pipelineStatusWithCodeQuality;
    }

    public void setPipelineStatusWithCodeQuality(String pipelineStatusWithCodeQuality) {
        this.pipelineStatusWithCodeQuality = pipelineStatusWithCodeQuality;
    }

    public MergeRequestListBasicDto withNotes(Integer notes) {
        this.notes = notes;
        return this;
    }

    /**
     * **参数解释：** 合并请求检视意见。
     * @return notes
     */
    public Integer getNotes() {
        return notes;
    }

    public void setNotes(Integer notes) {
        this.notes = notes;
    }

    public MergeRequestListBasicDto withSourceRepository(ProjectSimpleDto sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    public MergeRequestListBasicDto withSourceRepository(Consumer<ProjectSimpleDto> sourceRepositorySetter) {
        if (this.sourceRepository == null) {
            this.sourceRepository = new ProjectSimpleDto();
            sourceRepositorySetter.accept(this.sourceRepository);
        }

        return this;
    }

    /**
     * Get sourceRepository
     * @return sourceRepository
     */
    public ProjectSimpleDto getSourceRepository() {
        return sourceRepository;
    }

    public void setSourceRepository(ProjectSimpleDto sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    public MergeRequestListBasicDto withTargetRepository(ProjectSimpleDto targetRepository) {
        this.targetRepository = targetRepository;
        return this;
    }

    public MergeRequestListBasicDto withTargetRepository(Consumer<ProjectSimpleDto> targetRepositorySetter) {
        if (this.targetRepository == null) {
            this.targetRepository = new ProjectSimpleDto();
            targetRepositorySetter.accept(this.targetRepository);
        }

        return this;
    }

    /**
     * Get targetRepository
     * @return targetRepository
     */
    public ProjectSimpleDto getTargetRepository() {
        return targetRepository;
    }

    public void setTargetRepository(ProjectSimpleDto targetRepository) {
        this.targetRepository = targetRepository;
    }

    public MergeRequestListBasicDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * **参数解释：** 合并请求URL地址。
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public MergeRequestListBasicDto withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * **参数解释：** 合并请求新增代码行数。
     * @return addedLines
     */
    public Integer getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
    }

    public MergeRequestListBasicDto withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * **参数解释：** 合并请求删除代码行数。
     * @return removedLines
     */
    public Integer getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
    }

    public MergeRequestListBasicDto withMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
        return this;
    }

    /**
     * **参数解释：** 合并请求检视模式。
     * @return mergeRequestType
     */
    public String getMergeRequestType() {
        return mergeRequestType;
    }

    public void setMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
    }

    public MergeRequestListBasicDto withSourceGitUrl(String sourceGitUrl) {
        this.sourceGitUrl = sourceGitUrl;
        return this;
    }

    /**
     * **参数解释：** 合并请求git地址。
     * @return sourceGitUrl
     */
    public String getSourceGitUrl() {
        return sourceGitUrl;
    }

    public void setSourceGitUrl(String sourceGitUrl) {
        this.sourceGitUrl = sourceGitUrl;
    }

    public MergeRequestListBasicDto withLabels(List<Map<String, Object>> labels) {
        this.labels = labels;
        return this;
    }

    public MergeRequestListBasicDto addLabelsItem(Map<String, Object> labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public MergeRequestListBasicDto withLabels(Consumer<List<Map<String, Object>>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释：** 合并请求标签。
     * @return labels
     */
    public List<Map<String, Object>> getLabels() {
        return labels;
    }

    public void setLabels(List<Map<String, Object>> labels) {
        this.labels = labels;
    }

    public MergeRequestListBasicDto withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 合并请求分数。
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public MergeRequestListBasicDto withMinMergedScore(Integer minMergedScore) {
        this.minMergedScore = minMergedScore;
        return this;
    }

    /**
     * **参数解释：** 合并请求最小合入分数。
     * @return minMergedScore
     */
    public Integer getMinMergedScore() {
        return minMergedScore;
    }

    public void setMinMergedScore(Integer minMergedScore) {
        this.minMergedScore = minMergedScore;
    }

    public MergeRequestListBasicDto withSourceProductId(String sourceProductId) {
        this.sourceProductId = sourceProductId;
        return this;
    }

    /**
     * **参数解释：** 合并请求源项目ID。
     * @return sourceProductId
     */
    public String getSourceProductId() {
        return sourceProductId;
    }

    public void setSourceProductId(String sourceProductId) {
        this.sourceProductId = sourceProductId;
    }

    public MergeRequestListBasicDto withTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
        return this;
    }

    /**
     * **参数解释：** 合并请求目标项目ID。
     * @return targetProductId
     */
    public String getTargetProductId() {
        return targetProductId;
    }

    public void setTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
    }

    public MergeRequestListBasicDto withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * **参数解释：** 合并请求项目名。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public MergeRequestListBasicDto withNotesCount(NotesCountDto notesCount) {
        this.notesCount = notesCount;
        return this;
    }

    public MergeRequestListBasicDto withNotesCount(Consumer<NotesCountDto> notesCountSetter) {
        if (this.notesCount == null) {
            this.notesCount = new NotesCountDto();
            notesCountSetter.accept(this.notesCount);
        }

        return this;
    }

    /**
     * Get notesCount
     * @return notesCount
     */
    public NotesCountDto getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(NotesCountDto notesCount) {
        this.notesCount = notesCount;
    }

    public MergeRequestListBasicDto withModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }

    /**
     * **参数解释：** 合并请求审核结果。
     * @return moderationResult
     */
    public Boolean getModerationResult() {
        return moderationResult;
    }

    public void setModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
    }

    public MergeRequestListBasicDto withModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
        return this;
    }

    /**
     * **参数解释：** 合并请求审核时间。
     * @return moderationTime
     */
    public Long getModerationTime() {
        return moderationTime;
    }

    public void setModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
    }

    public MergeRequestListBasicDto withModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
        return this;
    }

    /**
     * **参数解释：** 合并请求审核状态。
     * @return moderationStatus
     */
    public Integer getModerationStatus() {
        return moderationStatus;
    }

    public void setModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestListBasicDto that = (MergeRequestListBasicDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iid, that.iid)
            && Objects.equals(this.title, that.title) && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch) && Objects.equals(this.state, that.state)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.sourceRepositoryId, that.sourceRepositoryId)
            && Objects.equals(this.reviewMode, that.reviewMode) && Objects.equals(this.author, that.author)
            && Objects.equals(this.closedAt, that.closedAt) && Objects.equals(this.closedBy, that.closedBy)
            && Objects.equals(this.mergedAt, that.mergedAt) && Objects.equals(this.mergedBy, that.mergedBy)
            && Objects.equals(this.pipelineStatus, that.pipelineStatus)
            && Objects.equals(this.codequalityStatus, that.codequalityStatus)
            && Objects.equals(this.pipelineStatusWithCodeQuality, that.pipelineStatusWithCodeQuality)
            && Objects.equals(this.notes, that.notes) && Objects.equals(this.sourceRepository, that.sourceRepository)
            && Objects.equals(this.targetRepository, that.targetRepository) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.addedLines, that.addedLines) && Objects.equals(this.removedLines, that.removedLines)
            && Objects.equals(this.mergeRequestType, that.mergeRequestType)
            && Objects.equals(this.sourceGitUrl, that.sourceGitUrl) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.score, that.score) && Objects.equals(this.minMergedScore, that.minMergedScore)
            && Objects.equals(this.sourceProductId, that.sourceProductId)
            && Objects.equals(this.targetProductId, that.targetProductId)
            && Objects.equals(this.productName, that.productName) && Objects.equals(this.notesCount, that.notesCount)
            && Objects.equals(this.moderationResult, that.moderationResult)
            && Objects.equals(this.moderationTime, that.moderationTime)
            && Objects.equals(this.moderationStatus, that.moderationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iid,
            title,
            sourceBranch,
            targetBranch,
            state,
            createdAt,
            updatedAt,
            sourceRepositoryId,
            reviewMode,
            author,
            closedAt,
            closedBy,
            mergedAt,
            mergedBy,
            pipelineStatus,
            codequalityStatus,
            pipelineStatusWithCodeQuality,
            notes,
            sourceRepository,
            targetRepository,
            webUrl,
            addedLines,
            removedLines,
            mergeRequestType,
            sourceGitUrl,
            labels,
            score,
            minMergedScore,
            sourceProductId,
            targetProductId,
            productName,
            notesCount,
            moderationResult,
            moderationTime,
            moderationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestListBasicDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    sourceRepositoryId: ").append(toIndentedString(sourceRepositoryId)).append("\n");
        sb.append("    reviewMode: ").append(toIndentedString(reviewMode)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
        sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
        sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
        sb.append("    pipelineStatus: ").append(toIndentedString(pipelineStatus)).append("\n");
        sb.append("    codequalityStatus: ").append(toIndentedString(codequalityStatus)).append("\n");
        sb.append("    pipelineStatusWithCodeQuality: ")
            .append(toIndentedString(pipelineStatusWithCodeQuality))
            .append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    sourceRepository: ").append(toIndentedString(sourceRepository)).append("\n");
        sb.append("    targetRepository: ").append(toIndentedString(targetRepository)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
        sb.append("    removedLines: ").append(toIndentedString(removedLines)).append("\n");
        sb.append("    mergeRequestType: ").append(toIndentedString(mergeRequestType)).append("\n");
        sb.append("    sourceGitUrl: ").append(toIndentedString(sourceGitUrl)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    minMergedScore: ").append(toIndentedString(minMergedScore)).append("\n");
        sb.append("    sourceProductId: ").append(toIndentedString(sourceProductId)).append("\n");
        sb.append("    targetProductId: ").append(toIndentedString(targetProductId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
        sb.append("    moderationResult: ").append(toIndentedString(moderationResult)).append("\n");
        sb.append("    moderationTime: ").append(toIndentedString(moderationTime)).append("\n");
        sb.append("    moderationStatus: ").append(toIndentedString(moderationStatus)).append("\n");
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
