package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NoteDto
 */
public class NoteDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

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
    @JsonProperty(value = "noteable_type")

    private String noteableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolvable")

    private Boolean resolvable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reply")

    private Boolean isReply;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_by")

    private UserBasicDto resolvedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "noteable_iid")

    private Integer noteableIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discussion_id")

    private String discussionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private String project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_file")

    private String diffFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff")

    private String diff;

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
    @JsonProperty(value = "position")

    private PositionDto position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved")

    private Boolean resolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_outdated")

    private Boolean isOutdated;

    public NoteDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * note id
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

    public NoteDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * note类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NoteDto withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 检视意见内容
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public NoteDto withAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * 附件
     * @return attachment
     */
    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public NoteDto withAuthor(UserBasicDto author) {
        this.author = author;
        return this;
    }

    public NoteDto withAuthor(Consumer<UserBasicDto> authorSetter) {
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

    public NoteDto withCreatedAt(String createdAt) {
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

    public NoteDto withUpdatedAt(String updatedAt) {
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

    public NoteDto withSystem(Boolean system) {
        this.system = system;
        return this;
    }

    /**
     * 是否是系统生成的日志
     * @return system
     */
    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public NoteDto withNoteableId(Integer noteableId) {
        this.noteableId = noteableId;
        return this;
    }

    /**
     * 目标id
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

    public NoteDto withNoteableType(String noteableType) {
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

    public NoteDto withCommitId(String commitId) {
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

    public NoteDto withResolvable(Boolean resolvable) {
        this.resolvable = resolvable;
        return this;
    }

    /**
     * 是否可解决
     * @return resolvable
     */
    public Boolean getResolvable() {
        return resolvable;
    }

    public void setResolvable(Boolean resolvable) {
        this.resolvable = resolvable;
    }

    public NoteDto withIsReply(Boolean isReply) {
        this.isReply = isReply;
        return this;
    }

    /**
     * 是否是回复
     * @return isReply
     */
    public Boolean getIsReply() {
        return isReply;
    }

    public void setIsReply(Boolean isReply) {
        this.isReply = isReply;
    }

    public NoteDto withResolvedBy(UserBasicDto resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }

    public NoteDto withResolvedBy(Consumer<UserBasicDto> resolvedBySetter) {
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

    public NoteDto withNoteableIid(Integer noteableIid) {
        this.noteableIid = noteableIid;
        return this;
    }

    /**
     * 目标iid
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

    public NoteDto withDiscussionId(String discussionId) {
        this.discussionId = discussionId;
        return this;
    }

    /**
     * 讨论id
     * @return discussionId
     */
    public String getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

    public NoteDto withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * 所属项目
     * @return project
     */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public NoteDto withDiffFile(String diffFile) {
        this.diffFile = diffFile;
        return this;
    }

    /**
     * 变更文件
     * @return diffFile
     */
    public String getDiffFile() {
        return diffFile;
    }

    public void setDiffFile(String diffFile) {
        this.diffFile = diffFile;
    }

    public NoteDto withDiff(String diff) {
        this.diff = diff;
        return this;
    }

    /**
     * 变更内容
     * @return diff
     */
    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public NoteDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * 是否存档
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public NoteDto withReviewCategories(String reviewCategories) {
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

    public NoteDto withReviewCategoriesCn(String reviewCategoriesCn) {
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

    public NoteDto withReviewCategoriesEn(String reviewCategoriesEn) {
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

    public NoteDto withReviewModules(String reviewModules) {
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

    public NoteDto withSeverity(String severity) {
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

    public NoteDto withSeverityCn(String severityCn) {
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

    public NoteDto withSeverityEn(String severityEn) {
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

    public NoteDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public NoteDto withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * 行号
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public NoteDto withAssignee(UserBasicDto assignee) {
        this.assignee = assignee;
        return this;
    }

    public NoteDto withAssignee(Consumer<UserBasicDto> assigneeSetter) {
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

    public NoteDto withProposer(UserBasicDto proposer) {
        this.proposer = proposer;
        return this;
    }

    public NoteDto withProposer(Consumer<UserBasicDto> proposerSetter) {
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

    public NoteDto withPosition(PositionDto position) {
        this.position = position;
        return this;
    }

    public NoteDto withPosition(Consumer<PositionDto> positionSetter) {
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

    public NoteDto withResolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }

    /**
     * 是否解决
     * @return resolved
     */
    public Boolean getResolved() {
        return resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public NoteDto withIsOutdated(Boolean isOutdated) {
        this.isOutdated = isOutdated;
        return this;
    }

    /**
     * 是否过时
     * @return isOutdated
     */
    public Boolean getIsOutdated() {
        return isOutdated;
    }

    public void setIsOutdated(Boolean isOutdated) {
        this.isOutdated = isOutdated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoteDto that = (NoteDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.body, that.body) && Objects.equals(this.attachment, that.attachment)
            && Objects.equals(this.author, that.author) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.system, that.system)
            && Objects.equals(this.noteableId, that.noteableId) && Objects.equals(this.noteableType, that.noteableType)
            && Objects.equals(this.commitId, that.commitId) && Objects.equals(this.resolvable, that.resolvable)
            && Objects.equals(this.isReply, that.isReply) && Objects.equals(this.resolvedBy, that.resolvedBy)
            && Objects.equals(this.noteableIid, that.noteableIid)
            && Objects.equals(this.discussionId, that.discussionId) && Objects.equals(this.project, that.project)
            && Objects.equals(this.diffFile, that.diffFile) && Objects.equals(this.diff, that.diff)
            && Objects.equals(this.archived, that.archived)
            && Objects.equals(this.reviewCategories, that.reviewCategories)
            && Objects.equals(this.reviewCategoriesCn, that.reviewCategoriesCn)
            && Objects.equals(this.reviewCategoriesEn, that.reviewCategoriesEn)
            && Objects.equals(this.reviewModules, that.reviewModules) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.severityCn, that.severityCn) && Objects.equals(this.severityEn, that.severityEn)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.line, that.line)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.proposer, that.proposer)
            && Objects.equals(this.position, that.position) && Objects.equals(this.resolved, that.resolved)
            && Objects.equals(this.isOutdated, that.isOutdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            type,
            body,
            attachment,
            author,
            createdAt,
            updatedAt,
            system,
            noteableId,
            noteableType,
            commitId,
            resolvable,
            isReply,
            resolvedBy,
            noteableIid,
            discussionId,
            project,
            diffFile,
            diff,
            archived,
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
            position,
            resolved,
            isOutdated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoteDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    noteableId: ").append(toIndentedString(noteableId)).append("\n");
        sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    resolvable: ").append(toIndentedString(resolvable)).append("\n");
        sb.append("    isReply: ").append(toIndentedString(isReply)).append("\n");
        sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
        sb.append("    noteableIid: ").append(toIndentedString(noteableIid)).append("\n");
        sb.append("    discussionId: ").append(toIndentedString(discussionId)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    diffFile: ").append(toIndentedString(diffFile)).append("\n");
        sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
        sb.append("    isOutdated: ").append(toIndentedString(isOutdated)).append("\n");
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
