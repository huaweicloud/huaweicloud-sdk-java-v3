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
 * 合并请求检视意见返回体
 */
public class MergeRequestDiscussionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "individual_note")

    private Boolean individualNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private List<NoteDto> notes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

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
    @JsonProperty(value = "repository_full_path")

    private String repositoryFullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "a_mode")

    private String aMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "b_mode")

    private String bMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_file")

    private Boolean deletedFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_file")

    private Boolean newFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved")

    private Boolean resolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

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
    @JsonProperty(value = "assignee")

    private UserBasicDto assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer")

    private UserBasicDto proposer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_version_params")

    private MergeRequestVersionParamsDto mergeRequestVersionParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_file")

    private String diffFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    public MergeRequestDiscussionDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 检视意见id(主评论和回复共用)。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MergeRequestDiscussionDto withIndividualNote(Boolean individualNote) {
        this.individualNote = individualNote;
        return this;
    }

    /**
     * **参数解释：** 个人检视意见(不需要解决)。
     * @return individualNote
     */
    public Boolean getIndividualNote() {
        return individualNote;
    }

    public void setIndividualNote(Boolean individualNote) {
        this.individualNote = individualNote;
    }

    public MergeRequestDiscussionDto withNotes(List<NoteDto> notes) {
        this.notes = notes;
        return this;
    }

    public MergeRequestDiscussionDto addNotesItem(NoteDto notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    public MergeRequestDiscussionDto withNotes(Consumer<List<NoteDto>> notesSetter) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        notesSetter.accept(this.notes);
        return this;
    }

    /**
     * **参数解释：** 评论列表(主评+回复)。
     * @return notes
     */
    public List<NoteDto> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteDto> notes) {
        this.notes = notes;
    }

    public MergeRequestDiscussionDto withRepositoryId(Integer repositoryId) {
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

    public MergeRequestDiscussionDto withNoteableType(NoteableTypeEnum noteableType) {
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

    public MergeRequestDiscussionDto withCommitId(String commitId) {
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

    public MergeRequestDiscussionDto withRepositoryFullPath(String repositoryFullPath) {
        this.repositoryFullPath = repositoryFullPath;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。
     * @return repositoryFullPath
     */
    public String getRepositoryFullPath() {
        return repositoryFullPath;
    }

    public void setRepositoryFullPath(String repositoryFullPath) {
        this.repositoryFullPath = repositoryFullPath;
    }

    public MergeRequestDiscussionDto withAMode(String aMode) {
        this.aMode = aMode;
        return this;
    }

    /**
     * **参数解释：** 文件旧权限(默认100644)。
     * @return aMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "a_mode")
    public String getAMode() {
        return aMode;
    }

    public void setAMode(String aMode) {
        this.aMode = aMode;
    }

    public MergeRequestDiscussionDto withBMode(String bMode) {
        this.bMode = bMode;
        return this;
    }

    /**
     * **参数解释：** 文件新权限(默认100644)。
     * @return bMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "b_mode")
    public String getBMode() {
        return bMode;
    }

    public void setBMode(String bMode) {
        this.bMode = bMode;
    }

    public MergeRequestDiscussionDto withDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
        return this;
    }

    /**
     * **参数解释：** 是否为删除文件。
     * @return deletedFile
     */
    public Boolean getDeletedFile() {
        return deletedFile;
    }

    public void setDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
    }

    public MergeRequestDiscussionDto withNewFile(Boolean newFile) {
        this.newFile = newFile;
        return this;
    }

    /**
     * **参数解释：** 是否为新增文件。
     * @return newFile
     */
    public Boolean getNewFile() {
        return newFile;
    }

    public void setNewFile(Boolean newFile) {
        this.newFile = newFile;
    }

    public MergeRequestDiscussionDto withResolved(Boolean resolved) {
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

    public MergeRequestDiscussionDto withArchived(Boolean archived) {
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

    public MergeRequestDiscussionDto withReviewCategories(String reviewCategories) {
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

    public MergeRequestDiscussionDto withReviewCategoriesCn(String reviewCategoriesCn) {
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

    public MergeRequestDiscussionDto withReviewCategoriesEn(String reviewCategoriesEn) {
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

    public MergeRequestDiscussionDto withReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    /**
     * **参数解释：** 意见模块。
     * @return reviewModules
     */
    public String getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
    }

    public MergeRequestDiscussionDto withSeverity(SeverityEnum severity) {
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

    public MergeRequestDiscussionDto withSeverityCn(String severityCn) {
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

    public MergeRequestDiscussionDto withSeverityEn(SeverityEnEnum severityEn) {
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

    public MergeRequestDiscussionDto withAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
        return this;
    }

    public MergeRequestDiscussionDto withAssignee(Consumer<UserBasicDto> assigneeSetter) {
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

    public MergeRequestDiscussionDto withProposer(UserBasicDto proposer) {
        this.proposer = proposer;
        return this;
    }

    public MergeRequestDiscussionDto withProposer(Consumer<UserBasicDto> proposerSetter) {
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

    public MergeRequestDiscussionDto withMergeRequestVersionParams(
        MergeRequestVersionParamsDto mergeRequestVersionParams) {
        this.mergeRequestVersionParams = mergeRequestVersionParams;
        return this;
    }

    public MergeRequestDiscussionDto withMergeRequestVersionParams(
        Consumer<MergeRequestVersionParamsDto> mergeRequestVersionParamsSetter) {
        if (this.mergeRequestVersionParams == null) {
            this.mergeRequestVersionParams = new MergeRequestVersionParamsDto();
            mergeRequestVersionParamsSetter.accept(this.mergeRequestVersionParams);
        }

        return this;
    }

    /**
     * Get mergeRequestVersionParams
     * @return mergeRequestVersionParams
     */
    public MergeRequestVersionParamsDto getMergeRequestVersionParams() {
        return mergeRequestVersionParams;
    }

    public void setMergeRequestVersionParams(MergeRequestVersionParamsDto mergeRequestVersionParams) {
        this.mergeRequestVersionParams = mergeRequestVersionParams;
    }

    public MergeRequestDiscussionDto withDiffFile(String diffFile) {
        this.diffFile = diffFile;
        return this;
    }

    /**
     * **参数解释：** 变更页检视意见的代码片段。
     * @return diffFile
     */
    public String getDiffFile() {
        return diffFile;
    }

    public void setDiffFile(String diffFile) {
        this.diffFile = diffFile;
    }

    public MergeRequestDiscussionDto withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * **参数解释：** 检视意见所在文件的新增行数量。
     * minimum: 0
     * maximum: 2147483647
     * @return addedLines
     */
    public Integer getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
    }

    public MergeRequestDiscussionDto withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * **参数解释：** 检视意见所在文件的删除行数量。
     * minimum: 0
     * maximum: 2147483647
     * @return removedLines
     */
    public Integer getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestDiscussionDto that = (MergeRequestDiscussionDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.individualNote, that.individualNote)
            && Objects.equals(this.notes, that.notes) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.noteableType, that.noteableType) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.repositoryFullPath, that.repositoryFullPath)
            && Objects.equals(this.aMode, that.aMode) && Objects.equals(this.bMode, that.bMode)
            && Objects.equals(this.deletedFile, that.deletedFile) && Objects.equals(this.newFile, that.newFile)
            && Objects.equals(this.resolved, that.resolved) && Objects.equals(this.archived, that.archived)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewCategoriesCn, that.reviewCategoriesCn)
            && Objects.equals(this.reviewCategoriesEn, that.reviewCategoriesEn)
            && Objects.equals(this.reviewModules, that.reviewModules) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.severityCn, that.severityCn) && Objects.equals(this.severityEn, that.severityEn)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.proposer, that.proposer)
            && Objects.equals(this.mergeRequestVersionParams, that.mergeRequestVersionParams)
            && Objects.equals(this.diffFile, that.diffFile) && Objects.equals(this.addedLines, that.addedLines)
            && Objects.equals(this.removedLines, that.removedLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            individualNote,
            notes,
            repositoryId,
            noteableType,
            commitId,
            repositoryFullPath,
            aMode,
            bMode,
            deletedFile,
            newFile,
            resolved,
            archived,
            reviewCategories,
            reviewCategoriesCn,
            reviewCategoriesEn,
            reviewModules,
            severity,
            severityCn,
            severityEn,
            assignee,
            proposer,
            mergeRequestVersionParams,
            diffFile,
            addedLines,
            removedLines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestDiscussionDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    individualNote: ").append(toIndentedString(individualNote)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    repositoryFullPath: ").append(toIndentedString(repositoryFullPath)).append("\n");
        sb.append("    aMode: ").append(toIndentedString(aMode)).append("\n");
        sb.append("    bMode: ").append(toIndentedString(bMode)).append("\n");
        sb.append("    deletedFile: ").append(toIndentedString(deletedFile)).append("\n");
        sb.append("    newFile: ").append(toIndentedString(newFile)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    reviewCategories: ").append(toIndentedString(reviewCategories)).append("\n");
        sb.append("    reviewCategoriesCn: ").append(toIndentedString(reviewCategoriesCn)).append("\n");
        sb.append("    reviewCategoriesEn: ").append(toIndentedString(reviewCategoriesEn)).append("\n");
        sb.append("    reviewModules: ").append(toIndentedString(reviewModules)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    severityCn: ").append(toIndentedString(severityCn)).append("\n");
        sb.append("    severityEn: ").append(toIndentedString(severityEn)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    proposer: ").append(toIndentedString(proposer)).append("\n");
        sb.append("    mergeRequestVersionParams: ").append(toIndentedString(mergeRequestVersionParams)).append("\n");
        sb.append("    diffFile: ").append(toIndentedString(diffFile)).append("\n");
        sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
        sb.append("    removedLines: ").append(toIndentedString(removedLines)).append("\n");
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
