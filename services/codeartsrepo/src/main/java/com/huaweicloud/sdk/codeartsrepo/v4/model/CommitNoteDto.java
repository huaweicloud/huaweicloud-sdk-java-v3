package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
 * 评论详细信息。
 */
public class CommitNoteDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    /**
     * **参数解释：** 意见类型。
     */
    public static final class NoteableTypeEnum {

        /**
         * Enum MERGEREQUEST for value: "MergeRequest"
         */
        public static final NoteableTypeEnum MERGEREQUEST = new NoteableTypeEnum("MergeRequest");

        /**
         * Enum COMMIT for value: "Commit"
         */
        public static final NoteableTypeEnum COMMIT = new NoteableTypeEnum("Commit");

        private static final Map<String, NoteableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoteableTypeEnum> createStaticFields() {
            Map<String, NoteableTypeEnum> map = new HashMap<>();
            map.put("MergeRequest", MERGEREQUEST);
            map.put("Commit", COMMIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoteableTypeEnum(String value) {
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
        public static NoteableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NoteableTypeEnum(value));
        }

        public static NoteableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoteableTypeEnum) {
                return this.value.equals(((NoteableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "noteable_type")

    private NoteableTypeEnum noteableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discussion_id")

    private String discussionId;

    /**
     * **参数解释：** 类型(普通评论、需要解决的普通评论、需要解决的关联代码行的评论)。
     */
    public static final class TypeEnum {

        /**
         * Enum DISCUSSIONNOTE for value: "DiscussionNote"
         */
        public static final TypeEnum DISCUSSIONNOTE = new TypeEnum("DiscussionNote");

        /**
         * Enum DIFFNOTE for value: "DiffNote"
         */
        public static final TypeEnum DIFFNOTE = new TypeEnum("DiffNote");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DiscussionNote", DISCUSSIONNOTE);
            map.put("DiffNote", DIFFNOTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_file")

    private String diffFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff")

    private String diff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private String attachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserBasicDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system")

    private Boolean system;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "noteable_id")

    private Integer noteableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private PositionDto position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolvable")

    private Boolean resolvable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved")

    private Boolean resolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_by")

    private UserBasicDto resolvedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "noteable_iid")

    private Integer noteableIid;

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
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserBasicDto assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer")

    private UserBasicDto proposer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reply")

    private Boolean isReply;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_result")

    private Boolean moderationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_time")

    private Long moderationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_status")

    private Integer moderationStatus;

    public CommitNoteDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 评论id(主评论和回复不共用)。
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

    public CommitNoteDto withNoteableType(NoteableTypeEnum noteableType) {
        this.noteableType = noteableType;
        return this;
    }

    /**
     * **参数解释：** 意见类型。
     * @return noteableType
     */
    public NoteableTypeEnum getNoteableType() {
        return noteableType;
    }

    public void setNoteableType(NoteableTypeEnum noteableType) {
        this.noteableType = noteableType;
    }

    public CommitNoteDto withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释：** 提交记录id。
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public CommitNoteDto withDiscussionId(String discussionId) {
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

    public CommitNoteDto withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 类型(普通评论、需要解决的普通评论、需要解决的关联代码行的评论)。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CommitNoteDto withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * **参数解释：** 评论内容。
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public CommitNoteDto withDiffFile(String diffFile) {
        this.diffFile = diffFile;
        return this;
    }

    /**
     * **参数解释：** 关联代码行所在文件的文件名。
     * @return diffFile
     */
    public String getDiffFile() {
        return diffFile;
    }

    public void setDiffFile(String diffFile) {
        this.diffFile = diffFile;
    }

    public CommitNoteDto withDiff(String diff) {
        this.diff = diff;
        return this;
    }

    /**
     * **参数解释：** 关联代码行的代码片段。
     * @return diff
     */
    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public CommitNoteDto withAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * **参数解释：** 附件(弃用)。
     * @return attachment
     */
    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public CommitNoteDto withAuthor(UserBasicDto author) {
        this.author = author;
        return this;
    }

    public CommitNoteDto withAuthor(Consumer<UserBasicDto> authorSetter) {
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

    public CommitNoteDto withCreatedAt(String createdAt) {
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

    public CommitNoteDto withUpdatedAt(String updatedAt) {
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

    public CommitNoteDto withSystem(Boolean system) {
        this.system = system;
        return this;
    }

    /**
     * **参数解释：** 是否为系统添加的。
     * @return system
     */
    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public CommitNoteDto withNoteableId(Integer noteableId) {
        this.noteableId = noteableId;
        return this;
    }

    /**
     * **参数解释：** 合并请求id或issue id。
     * minimum: 1
     * maximum: 2147483647
     * @return noteableId
     */
    public Integer getNoteableId() {
        return noteableId;
    }

    public void setNoteableId(Integer noteableId) {
        this.noteableId = noteableId;
    }

    public CommitNoteDto withPosition(PositionDto position) {
        this.position = position;
        return this;
    }

    public CommitNoteDto withPosition(Consumer<PositionDto> positionSetter) {
        if (this.position == null) {
            this.position = new PositionDto();
            positionSetter.accept(this.position);
        }

        return this;
    }

    /**
     * Get position
     * @return position
     */
    public PositionDto getPosition() {
        return position;
    }

    public void setPosition(PositionDto position) {
        this.position = position;
    }

    public CommitNoteDto withResolvable(Boolean resolvable) {
        this.resolvable = resolvable;
        return this;
    }

    /**
     * **参数解释：** 是否需要解决。
     * @return resolvable
     */
    public Boolean getResolvable() {
        return resolvable;
    }

    public void setResolvable(Boolean resolvable) {
        this.resolvable = resolvable;
    }

    public CommitNoteDto withResolved(Boolean resolved) {
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

    public CommitNoteDto withResolvedBy(UserBasicDto resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }

    public CommitNoteDto withResolvedBy(Consumer<UserBasicDto> resolvedBySetter) {
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

    public CommitNoteDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否已归档。
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public CommitNoteDto withNoteableIid(Integer noteableIid) {
        this.noteableIid = noteableIid;
        return this;
    }

    /**
     * **参数解释：** 合并请求iid或issue iid。
     * minimum: 1
     * maximum: 2147483647
     * @return noteableIid
     */
    public Integer getNoteableIid() {
        return noteableIid;
    }

    public void setNoteableIid(Integer noteableIid) {
        this.noteableIid = noteableIid;
    }

    public CommitNoteDto withReviewCategories(String reviewCategories) {
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

    public CommitNoteDto withReviewCategoriesCn(String reviewCategoriesCn) {
        this.reviewCategoriesCn = reviewCategoriesCn;
        return this;
    }

    /**
     * **参数解释：** 意见分类中文名。
     * @return reviewCategoriesCn
     */
    public String getReviewCategoriesCn() {
        return reviewCategoriesCn;
    }

    public void setReviewCategoriesCn(String reviewCategoriesCn) {
        this.reviewCategoriesCn = reviewCategoriesCn;
    }

    public CommitNoteDto withReviewCategoriesEn(String reviewCategoriesEn) {
        this.reviewCategoriesEn = reviewCategoriesEn;
        return this;
    }

    /**
     * **参数解释：** 合并请求版本信息。
     * @return reviewCategoriesEn
     */
    public String getReviewCategoriesEn() {
        return reviewCategoriesEn;
    }

    public void setReviewCategoriesEn(String reviewCategoriesEn) {
        this.reviewCategoriesEn = reviewCategoriesEn;
    }

    public CommitNoteDto withReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    /**
     * **参数解释：** 合并请求版本信息。
     * @return reviewModules
     */
    public String getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
    }

    public CommitNoteDto withSeverity(SeverityEnum severity) {
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

    public CommitNoteDto withSeverityCn(String severityCn) {
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

    public CommitNoteDto withSeverityEn(SeverityEnEnum severityEn) {
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

    public CommitNoteDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径(弃用)。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public CommitNoteDto withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 行号(弃用)。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public CommitNoteDto withAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
        return this;
    }

    public CommitNoteDto withAssignee(Consumer<UserBasicDto> assigneeSetter) {
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

    public CommitNoteDto withProposer(UserBasicDto proposer) {
        this.proposer = proposer;
        return this;
    }

    public CommitNoteDto withProposer(Consumer<UserBasicDto> proposerSetter) {
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

    public CommitNoteDto withIsReply(Boolean isReply) {
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

    public CommitNoteDto withModerationResult(Boolean moderationResult) {
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

    public CommitNoteDto withModerationTime(Long moderationTime) {
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

    public CommitNoteDto withModerationStatus(Integer moderationStatus) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitNoteDto that = (CommitNoteDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.noteableType, that.noteableType)
            && Objects.equals(this.commitId, that.commitId) && Objects.equals(this.discussionId, that.discussionId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.body, that.body)
            && Objects.equals(this.diffFile, that.diffFile) && Objects.equals(this.diff, that.diff)
            && Objects.equals(this.attachment, that.attachment) && Objects.equals(this.author, that.author)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.system, that.system) && Objects.equals(this.noteableId, that.noteableId)
            && Objects.equals(this.position, that.position) && Objects.equals(this.resolvable, that.resolvable)
            && Objects.equals(this.resolved, that.resolved) && Objects.equals(this.resolvedBy, that.resolvedBy)
            && Objects.equals(this.archived, that.archived) && Objects.equals(this.noteableIid, that.noteableIid)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewCategoriesCn, that.reviewCategoriesCn)
            && Objects.equals(this.reviewCategoriesEn, that.reviewCategoriesEn)
            && Objects.equals(this.reviewModules, that.reviewModules) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.severityCn, that.severityCn) && Objects.equals(this.severityEn, that.severityEn)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.line, that.line)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.proposer, that.proposer)
            && Objects.equals(this.isReply, that.isReply)
            && Objects.equals(this.moderationResult, that.moderationResult)
            && Objects.equals(this.moderationTime, that.moderationTime)
            && Objects.equals(this.moderationStatus, that.moderationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            noteableType,
            commitId,
            discussionId,
            type,
            body,
            diffFile,
            diff,
            attachment,
            author,
            createdAt,
            updatedAt,
            system,
            noteableId,
            position,
            resolvable,
            resolved,
            resolvedBy,
            archived,
            noteableIid,
            reviewCategories,
            reviewCategoriesCn,
            reviewCategoriesEn,
            reviewModules,
            severity,
            severityCn,
            severityEn,
            filePath,
            line,
            assignee,
            proposer,
            isReply,
            moderationResult,
            moderationTime,
            moderationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitNoteDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    discussionId: ").append(toIndentedString(discussionId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    diffFile: ").append(toIndentedString(diffFile)).append("\n");
        sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    noteableId: ").append(toIndentedString(noteableId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    resolvable: ").append(toIndentedString(resolvable)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
        sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    noteableIid: ").append(toIndentedString(noteableIid)).append("\n");
        sb.append("    reviewCategories: ").append(toIndentedString(reviewCategories)).append("\n");
        sb.append("    reviewCategoriesCn: ").append(toIndentedString(reviewCategoriesCn)).append("\n");
        sb.append("    reviewCategoriesEn: ").append(toIndentedString(reviewCategoriesEn)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    severityCn: ").append(toIndentedString(severityCn)).append("\n");
        sb.append("    severityEn: ").append(toIndentedString(severityEn)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    proposer: ").append(toIndentedString(proposer)).append("\n");
        sb.append("    isReply: ").append(toIndentedString(isReply)).append("\n");
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
