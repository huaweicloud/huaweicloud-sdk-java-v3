package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeRequestBasicDiscussionDto
 */
public class MergeRequestBasicDiscussionDto {

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
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "noteable_type")

    private String noteableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_full_path")

    private String projectFullPath;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_cn")

    private String severityCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_en")

    private String severityEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserBasicDto assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer")

    private UserBasicDto proposer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_version_params")

    private MergeRequestVersionParamsDto mergeRequestVersionParams;

    public MergeRequestBasicDiscussionDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 评论id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MergeRequestBasicDiscussionDto withIndividualNote(Boolean individualNote) {
        this.individualNote = individualNote;
        return this;
    }

    /**
     * individual_note
     * @return individualNote
     */
    public Boolean getIndividualNote() {
        return individualNote;
    }

    public void setIndividualNote(Boolean individualNote) {
        this.individualNote = individualNote;
    }

    public MergeRequestBasicDiscussionDto withNotes(List<NoteDto> notes) {
        this.notes = notes;
        return this;
    }

    public MergeRequestBasicDiscussionDto addNotesItem(NoteDto notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    public MergeRequestBasicDiscussionDto withNotes(Consumer<List<NoteDto>> notesSetter) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        notesSetter.accept(this.notes);
        return this;
    }

    /**
     * 主评和回复列表
     * @return notes
     */
    public List<NoteDto> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteDto> notes) {
        this.notes = notes;
    }

    public MergeRequestBasicDiscussionDto withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 仓库id
     * minimum: 1
     * maximum: 2147483647
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public MergeRequestBasicDiscussionDto withNoteableType(String noteableType) {
        this.noteableType = noteableType;
        return this;
    }

    /**
     * 目标类型
     * @return noteableType
     */
    public String getNoteableType() {
        return noteableType;
    }

    public void setNoteableType(String noteableType) {
        this.noteableType = noteableType;
    }

    public MergeRequestBasicDiscussionDto withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * 关联的提交id
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public MergeRequestBasicDiscussionDto withProjectFullPath(String projectFullPath) {
        this.projectFullPath = projectFullPath;
        return this;
    }

    /**
     * 仓库路径
     * @return projectFullPath
     */
    public String getProjectFullPath() {
        return projectFullPath;
    }

    public void setProjectFullPath(String projectFullPath) {
        this.projectFullPath = projectFullPath;
    }

    public MergeRequestBasicDiscussionDto withAMode(String aMode) {
        this.aMode = aMode;
        return this;
    }

    /**
     * 变更前文件模式
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

    public MergeRequestBasicDiscussionDto withBMode(String bMode) {
        this.bMode = bMode;
        return this;
    }

    /**
     * 变更后文件模式
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

    public MergeRequestBasicDiscussionDto withDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
        return this;
    }

    /**
     * 此次变更是否删除文件
     * @return deletedFile
     */
    public Boolean getDeletedFile() {
        return deletedFile;
    }

    public void setDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
    }

    public MergeRequestBasicDiscussionDto withNewFile(Boolean newFile) {
        this.newFile = newFile;
        return this;
    }

    /**
     * 此次变更是否新增文件
     * @return newFile
     */
    public Boolean getNewFile() {
        return newFile;
    }

    public void setNewFile(Boolean newFile) {
        this.newFile = newFile;
    }

    public MergeRequestBasicDiscussionDto withResolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }

    /**
     * 检视意见是否解决
     * @return resolved
     */
    public Boolean getResolved() {
        return resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public MergeRequestBasicDiscussionDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * 检视意见是否存档
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public MergeRequestBasicDiscussionDto withReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
        return this;
    }

    /**
     * 检视意见分类
     * @return reviewCategories
     */
    public String getReviewCategories() {
        return reviewCategories;
    }

    public void setReviewCategories(String reviewCategories) {
        this.reviewCategories = reviewCategories;
    }

    public MergeRequestBasicDiscussionDto withReviewCategoriesCn(String reviewCategoriesCn) {
        this.reviewCategoriesCn = reviewCategoriesCn;
        return this;
    }

    /**
     * 检视意见分类中文名
     * @return reviewCategoriesCn
     */
    public String getReviewCategoriesCn() {
        return reviewCategoriesCn;
    }

    public void setReviewCategoriesCn(String reviewCategoriesCn) {
        this.reviewCategoriesCn = reviewCategoriesCn;
    }

    public MergeRequestBasicDiscussionDto withReviewCategoriesEn(String reviewCategoriesEn) {
        this.reviewCategoriesEn = reviewCategoriesEn;
        return this;
    }

    /**
     * 检视意见分类英文名
     * @return reviewCategoriesEn
     */
    public String getReviewCategoriesEn() {
        return reviewCategoriesEn;
    }

    public void setReviewCategoriesEn(String reviewCategoriesEn) {
        this.reviewCategoriesEn = reviewCategoriesEn;
    }

    public MergeRequestBasicDiscussionDto withReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
        return this;
    }

    /**
     * 检视意见模块
     * @return reviewModules
     */
    public String getReviewModules() {
        return reviewModules;
    }

    public void setReviewModules(String reviewModules) {
        this.reviewModules = reviewModules;
    }

    public MergeRequestBasicDiscussionDto withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 严重程度
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public MergeRequestBasicDiscussionDto withSeverityCn(String severityCn) {
        this.severityCn = severityCn;
        return this;
    }

    /**
     * 严重程度中文名
     * @return severityCn
     */
    public String getSeverityCn() {
        return severityCn;
    }

    public void setSeverityCn(String severityCn) {
        this.severityCn = severityCn;
    }

    public MergeRequestBasicDiscussionDto withSeverityEn(String severityEn) {
        this.severityEn = severityEn;
        return this;
    }

    /**
     * 严重程度英文名
     * @return severityEn
     */
    public String getSeverityEn() {
        return severityEn;
    }

    public void setSeverityEn(String severityEn) {
        this.severityEn = severityEn;
    }

    public MergeRequestBasicDiscussionDto withAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
        return this;
    }

    public MergeRequestBasicDiscussionDto withAssignee(Consumer<UserBasicDto> assigneeSetter) {
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

    public MergeRequestBasicDiscussionDto withProposer(UserBasicDto proposer) {
        this.proposer = proposer;
        return this;
    }

    public MergeRequestBasicDiscussionDto withProposer(Consumer<UserBasicDto> proposerSetter) {
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

    public MergeRequestBasicDiscussionDto withMergeRequestVersionParams(
        MergeRequestVersionParamsDto mergeRequestVersionParams) {
        this.mergeRequestVersionParams = mergeRequestVersionParams;
        return this;
    }

    public MergeRequestBasicDiscussionDto withMergeRequestVersionParams(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestBasicDiscussionDto that = (MergeRequestBasicDiscussionDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.individualNote, that.individualNote)
            && Objects.equals(this.notes, that.notes) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.noteableType, that.noteableType) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.projectFullPath, that.projectFullPath) && Objects.equals(this.aMode, that.aMode)
            && Objects.equals(this.bMode, that.bMode) && Objects.equals(this.deletedFile, that.deletedFile)
            && Objects.equals(this.newFile, that.newFile) && Objects.equals(this.resolved, that.resolved)
            && Objects.equals(this.archived, that.archived)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewCategoriesCn, that.reviewCategoriesCn)
            && Objects.equals(this.reviewCategoriesEn, that.reviewCategoriesEn)
            && Objects.equals(this.reviewModules, that.reviewModules) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.severityCn, that.severityCn) && Objects.equals(this.severityEn, that.severityEn)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.proposer, that.proposer)
            && Objects.equals(this.mergeRequestVersionParams, that.mergeRequestVersionParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            individualNote,
            notes,
            projectId,
            noteableType,
            commitId,
            projectFullPath,
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
            mergeRequestVersionParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestBasicDiscussionDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    individualNote: ").append(toIndentedString(individualNote)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    projectFullPath: ").append(toIndentedString(projectFullPath)).append("\n");
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
