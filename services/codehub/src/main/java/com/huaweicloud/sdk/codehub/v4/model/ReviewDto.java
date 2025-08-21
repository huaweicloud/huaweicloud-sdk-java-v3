package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检视意见详细信息
 */
public class ReviewDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserBasicDto assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserBasicDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reply")

    private Boolean isReply;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_by")

    private UserBasicDto resolvedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discussion_id")

    private String discussionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_path")

    private String repositoryPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_categories")

    private String reviewCategories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_categories_cn")

    private String reviewCategoriesCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_categories_en")

    private String reviewCategoriesEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_modules")

    private String reviewModules;

    /**
     * **参数解释：** 严重程度key。
     */
    public static final class SeverityEnum {

        /**
         * Enum SUGGESTION for value: "suggestion"
         */
        public static final SeverityEnum SUGGESTION = new SeverityEnum("suggestion");

        /**
         * Enum MINOR for value: "minor"
         */
        public static final SeverityEnum MINOR = new SeverityEnum("minor");

        /**
         * Enum MAJOR for value: "major"
         */
        public static final SeverityEnum MAJOR = new SeverityEnum("major");

        /**
         * Enum FATAL for value: "fatal"
         */
        public static final SeverityEnum FATAL = new SeverityEnum("fatal");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("suggestion", SUGGESTION);
            map.put("minor", MINOR);
            map.put("major", MAJOR);
            map.put("fatal", FATAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_cn")

    private String severityCn;

    /**
     * **参数解释：** 严重程度英文。
     */
    public static final class SeverityEnEnum {

        /**
         * Enum SUGGESTION for value: "Suggestion"
         */
        public static final SeverityEnEnum SUGGESTION = new SeverityEnEnum("Suggestion");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final SeverityEnEnum MINOR = new SeverityEnEnum("Minor");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final SeverityEnEnum MAJOR = new SeverityEnEnum("Major");

        /**
         * Enum FATAL for value: "Fatal"
         */
        public static final SeverityEnEnum FATAL = new SeverityEnEnum("Fatal");

        private static final Map<String, SeverityEnEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnEnum> createStaticFields() {
            Map<String, SeverityEnEnum> map = new HashMap<>();
            map.put("Suggestion", SUGGESTION);
            map.put("Minor", MINOR);
            map.put("Major", MAJOR);
            map.put("Fatal", FATAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnEnum(String value) {
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
        public static SeverityEnEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnEnum(value));
        }

        public static SeverityEnEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnEnum) {
                return this.value.equals(((SeverityEnEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_en")

    private SeverityEnEnum severityEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer")

    private UserBasicDto proposer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private UserBasicDto reviewer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved")

    private Boolean resolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_at")

    private String resolvedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

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
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_title")

    private String mergeRequestTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_state")

    private String mergeRequestState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    public ReviewDto withAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
        return this;
    }

    public ReviewDto withAssignee(Consumer<UserBasicDto> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new UserBasicDto();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public UserBasicDto getAssignee() {
        return assignee;
    }

    public void setAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
    }

    public ReviewDto withAuthor(UserBasicDto author) {
        this.author = author;
        return this;
    }

    public ReviewDto withAuthor(Consumer<UserBasicDto> authorSetter) {
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

    public ReviewDto withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * **参数解释：** 评论内容。
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ReviewDto withCreatedAt(String createdAt) {
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

    public ReviewDto withIsReply(Boolean isReply) {
        this.isReply = isReply;
        return this;
    }

    /**
     * **参数解释：** 是否为回复。
     * @return isReply
     */
    public Boolean getIsReply() {
        return isReply;
    }

    public void setIsReply(Boolean isReply) {
        this.isReply = isReply;
    }

    public ReviewDto withResolvedBy(UserBasicDto resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }

    public ReviewDto withResolvedBy(Consumer<UserBasicDto> resolvedBySetter) {
        if (this.resolvedBy == null) {
            this.resolvedBy = new UserBasicDto();
            resolvedBySetter.accept(this.resolvedBy);
        }

        return this;
    }

    /**
     * Get resolvedBy
     * @return resolvedBy
     */
    public UserBasicDto getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(UserBasicDto resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public ReviewDto withDiscussionId(String discussionId) {
        this.discussionId = discussionId;
        return this;
    }

    /**
     * **参数解释：** 检视意见id(主评论和回复共用)。
     * @return discussionId
     */
    public String getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

    public ReviewDto withRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。
     * @return repositoryPath
     */
    public String getRepositoryPath() {
        return repositoryPath;
    }

    public void setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    public ReviewDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库id。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ReviewDto withReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
        return this;
    }

    /**
     * **参数解释：** 意见分类key。
     * @return reviewCategories
     */
    public String getReviewCategories() {
        return reviewCategories;
    }

    public void setReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
    }

    public ReviewDto withReviewCategoriesCn(String reviewCategoriesCn) {
        this.reviewCategoriesCn = reviewCategoriesCn;
        return this;
    }

    /**
     * **参数解释：** 意见分类中文。
     * @return reviewCategoriesCn
     */
    public String getReviewCategoriesCn() {
        return reviewCategoriesCn;
    }

    public void setReviewCategoriesCn(String reviewCategoriesCn) {
        this.reviewCategoriesCn = reviewCategoriesCn;
    }

    public ReviewDto withReviewCategoriesEn(String reviewCategoriesEn) {
        this.reviewCategoriesEn = reviewCategoriesEn;
        return this;
    }

    /**
     * **参数解释：** 意见分类英文。
     * @return reviewCategoriesEn
     */
    public String getReviewCategoriesEn() {
        return reviewCategoriesEn;
    }

    public void setReviewCategoriesEn(String reviewCategoriesEn) {
        this.reviewCategoriesEn = reviewCategoriesEn;
    }

    public ReviewDto withReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    /**
     * **参数解释：** 检视意见模块。
     * @return reviewModules
     */
    public String getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
    }

    public ReviewDto withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释：** 严重程度key。
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public ReviewDto withSeverityCn(String severityCn) {
        this.severityCn = severityCn;
        return this;
    }

    /**
     * **参数解释：** 严重程度中文。 **约束限制：** - 建议 - 一般 - 严重 - 致命
     * @return severityCn
     */
    public String getSeverityCn() {
        return severityCn;
    }

    public void setSeverityCn(String severityCn) {
        this.severityCn = severityCn;
    }

    public ReviewDto withSeverityEn(SeverityEnEnum severityEn) {
        this.severityEn = severityEn;
        return this;
    }

    /**
     * **参数解释：** 严重程度英文。
     * @return severityEn
     */
    public SeverityEnEnum getSeverityEn() {
        return severityEn;
    }

    public void setSeverityEn(SeverityEnEnum severityEn) {
        this.severityEn = severityEn;
    }

    public ReviewDto withProposer(UserBasicDto proposer) {
        this.proposer = proposer;
        return this;
    }

    public ReviewDto withProposer(Consumer<UserBasicDto> proposerSetter) {
        if (this.proposer == null) {
            this.proposer = new UserBasicDto();
            proposerSetter.accept(this.proposer);
        }

        return this;
    }

    /**
     * Get proposer
     * @return proposer
     */
    public UserBasicDto getProposer() {
        return proposer;
    }

    public void setProposer(UserBasicDto proposer) {
        this.proposer = proposer;
    }

    public ReviewDto withReviewer(UserBasicDto reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    public ReviewDto withReviewer(Consumer<UserBasicDto> reviewerSetter) {
        if (this.reviewer == null) {
            this.reviewer = new UserBasicDto();
            reviewerSetter.accept(this.reviewer);
        }

        return this;
    }

    /**
     * Get reviewer
     * @return reviewer
     */
    public UserBasicDto getReviewer() {
        return reviewer;
    }

    public void setReviewer(UserBasicDto reviewer) {
        this.reviewer = reviewer;
    }

    public ReviewDto withResolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }

    /**
     * **参数解释：** 是否已解决。
     * @return resolved
     */
    public Boolean getResolved() {
        return resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public ReviewDto withResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }

    /**
     * **参数解释：** 解决时间。
     * @return resolvedAt
     */
    public String getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public ReviewDto withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * **参数解释：** 合并请求或commit链接。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ReviewDto withModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }

    /**
     * **参数解释：** 内容审核结果。
     * @return moderationResult
     */
    public Boolean getModerationResult() {
        return moderationResult;
    }

    public void setModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
    }

    public ReviewDto withModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
        return this;
    }

    /**
     * **参数解释：** 内容审核时间。
     * @return moderationTime
     */
    public Long getModerationTime() {
        return moderationTime;
    }

    public void setModerationTime(Long moderationTime) {
        this.moderationTime = moderationTime;
    }

    public ReviewDto withModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
        return this;
    }

    /**
     * **参数解释：** 内容审核状态。
     * @return moderationStatus
     */
    public Integer getModerationStatus() {
        return moderationStatus;
    }

    public void setModerationStatus(Integer moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    public ReviewDto withMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * **参数解释：** 合并请求id(noteable_type=MergRequest时返回)。
     * @return mergeRequestId
     */
    public Integer getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public ReviewDto withMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
        return this;
    }

    /**
     * **参数解释：** 合并请求iid(noteable_type=MergRequest时返回)。
     * @return mergeRequestIid
     */
    public Integer getMergeRequestIid() {
        return mergeRequestIid;
    }

    public void setMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
    }

    public ReviewDto withMergeRequestTitle(String mergeRequestTitle) {
        this.mergeRequestTitle = mergeRequestTitle;
        return this;
    }

    /**
     * **参数解释：** 合并请求标题(noteable_type=MergRequest时返回)。
     * @return mergeRequestTitle
     */
    public String getMergeRequestTitle() {
        return mergeRequestTitle;
    }

    public void setMergeRequestTitle(String mergeRequestTitle) {
        this.mergeRequestTitle = mergeRequestTitle;
    }

    public ReviewDto withMergeRequestState(String mergeRequestState) {
        this.mergeRequestState = mergeRequestState;
        return this;
    }

    /**
     * **参数解释：** 合并请求状态(noteable_type=MergRequest时返回)。
     * @return mergeRequestState
     */
    public String getMergeRequestState() {
        return mergeRequestState;
    }

    public void setMergeRequestState(String mergeRequestState) {
        this.mergeRequestState = mergeRequestState;
    }

    public ReviewDto withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释：** commit id(noteable_type=Commit时返回)。
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewDto that = (ReviewDto) obj;
        return Objects.equals(this.assignee, that.assignee) && Objects.equals(this.author, that.author)
            && Objects.equals(this.note, that.note) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.isReply, that.isReply) && Objects.equals(this.resolvedBy, that.resolvedBy)
            && Objects.equals(this.discussionId, that.discussionId)
            && Objects.equals(this.repositoryPath, that.repositoryPath)
            && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewCategoriesCn, that.reviewCategoriesCn)
            && Objects.equals(this.reviewCategoriesEn, that.reviewCategoriesEn)
            && Objects.equals(this.reviewModules, that.reviewModules) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.severityCn, that.severityCn) && Objects.equals(this.severityEn, that.severityEn)
            && Objects.equals(this.proposer, that.proposer) && Objects.equals(this.reviewer, that.reviewer)
            && Objects.equals(this.resolved, that.resolved) && Objects.equals(this.resolvedAt, that.resolvedAt)
            && Objects.equals(this.link, that.link) && Objects.equals(this.moderationResult, that.moderationResult)
            && Objects.equals(this.moderationTime, that.moderationTime)
            && Objects.equals(this.moderationStatus, that.moderationStatus)
            && Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid)
            && Objects.equals(this.mergeRequestTitle, that.mergeRequestTitle)
            && Objects.equals(this.mergeRequestState, that.mergeRequestState)
            && Objects.equals(this.commitId, that.commitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignee,
            author,
            note,
            createdAt,
            isReply,
            resolvedBy,
            discussionId,
            repositoryPath,
            repositoryId,
            reviewCategories,
            reviewCategoriesCn,
            reviewCategoriesEn,
            reviewModules,
            severity,
            severityCn,
            severityEn,
            proposer,
            reviewer,
            resolved,
            resolvedAt,
            link,
            moderationResult,
            moderationTime,
            moderationStatus,
            mergeRequestId,
            mergeRequestIid,
            mergeRequestTitle,
            mergeRequestState,
            commitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewDto {\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    isReply: ").append(toIndentedString(isReply)).append("\n");
        sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
        sb.append("    discussionId: ").append(toIndentedString(discussionId)).append("\n");
        sb.append("    repositoryPath: ").append(toIndentedString(repositoryPath)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    reviewCategories: ").append(toIndentedString(reviewCategories)).append("\n");
        sb.append("    reviewCategoriesCn: ").append(toIndentedString(reviewCategoriesCn)).append("\n");
        sb.append("    reviewCategoriesEn: ").append(toIndentedString(reviewCategoriesEn)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    severityCn: ").append(toIndentedString(severityCn)).append("\n");
        sb.append("    severityEn: ").append(toIndentedString(severityEn)).append("\n");
        sb.append("    proposer: ").append(toIndentedString(proposer)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
        sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    moderationResult: ").append(toIndentedString(moderationResult)).append("\n");
        sb.append("    moderationTime: ").append(toIndentedString(moderationTime)).append("\n");
        sb.append("    moderationStatus: ").append(toIndentedString(moderationStatus)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    mergeRequestTitle: ").append(toIndentedString(mergeRequestTitle)).append("\n");
        sb.append("    mergeRequestState: ").append(toIndentedString(mergeRequestState)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
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
