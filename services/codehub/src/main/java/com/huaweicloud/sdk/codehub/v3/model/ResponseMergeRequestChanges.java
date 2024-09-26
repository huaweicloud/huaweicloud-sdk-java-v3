package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponseMergeRequestChanges
 */
public class ResponseMergeRequestChanges {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iid")

    private Integer iid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

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

    private Author author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private Integer sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private Integer targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_in_progress")

    private Boolean workInProgress;

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
    @JsonProperty(value = "should_remove_source_branch")

    private Boolean shouldRemoveSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_remove_source_branch")

    private Boolean forceRemoveSourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash")

    private Boolean squash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_type")

    private String mergeRequestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribed")

    private Boolean subscribed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changes_count")

    private String changesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_build_started_at")

    private String latestBuildStartedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_build_finished_at")

    private String latestBuildFinishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_deployed_to_production_at")

    private String firstDeployedToProductionAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline")

    private PipelineBasicDto pipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_refs")

    private DiffRefsDto diffRefs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_error")

    private String mergeError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rebase_in_progress")

    private Boolean rebaseInProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diverged_commits_count")

    private Integer divergedCommitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private MergeRequestListDtoUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changes")

    private List<MergeRequestDiffFileDto> changes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project")

    private ProjectSimpleDto sourceProject;

    public ResponseMergeRequestChanges withId(Integer id) {
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

    public ResponseMergeRequestChanges withIid(Integer iid) {
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

    public ResponseMergeRequestChanges withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 仓库id
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public ResponseMergeRequestChanges withTitle(String title) {
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

    public ResponseMergeRequestChanges withDescription(String description) {
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

    public ResponseMergeRequestChanges withState(String state) {
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

    public ResponseMergeRequestChanges withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 合并请求创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ResponseMergeRequestChanges withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 合并请求更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ResponseMergeRequestChanges withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * 合并请求目标分支
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ResponseMergeRequestChanges withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * 合并请求源分支
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public ResponseMergeRequestChanges withUserNotesCount(Integer userNotesCount) {
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

    public ResponseMergeRequestChanges withUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
        return this;
    }

    /**
     * upvotes
     * @return upvotes
     */
    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public ResponseMergeRequestChanges withDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
        return this;
    }

    /**
     * downvotes
     * @return downvotes
     */
    public Integer getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    public ResponseMergeRequestChanges withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public ResponseMergeRequestChanges withAuthor(Consumer<Author> authorSetter) {
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

    public ResponseMergeRequestChanges withSourceProjectId(Integer sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 合并请求源仓库id
     * @return sourceProjectId
     */
    public Integer getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(Integer sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public ResponseMergeRequestChanges withTargetProjectId(Integer targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 合并请求目标仓库id
     * @return targetProjectId
     */
    public Integer getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(Integer targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public ResponseMergeRequestChanges withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ResponseMergeRequestChanges addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ResponseMergeRequestChanges withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 指定仓库的标签列表
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ResponseMergeRequestChanges withWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }

    /**
     * 合并请求是否为wip状态
     * @return workInProgress
     */
    public Boolean getWorkInProgress() {
        return workInProgress;
    }

    public void setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
    }

    public ResponseMergeRequestChanges withMergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
        this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
        return this;
    }

    /**
     * 合并请求是否开启流水线成功后自动合入
     * @return mergeWhenPipelineSucceeds
     */
    public Boolean getMergeWhenPipelineSucceeds() {
        return mergeWhenPipelineSucceeds;
    }

    public void setMergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
        this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
    }

    public ResponseMergeRequestChanges withMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }

    /**
     * 合并请求合入状态
     * @return mergeStatus
     */
    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public ResponseMergeRequestChanges withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * 合并请求的head sha
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ResponseMergeRequestChanges withShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }

    /**
     * 合并请求合入后是否应该移除源分支
     * @return shouldRemoveSourceBranch
     */
    public Boolean getShouldRemoveSourceBranch() {
        return shouldRemoveSourceBranch;
    }

    public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
    }

    public ResponseMergeRequestChanges withForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
        return this;
    }

    /**
     * 合并请求合入后是否移除源分支
     * @return forceRemoveSourceBranch
     */
    public Boolean getForceRemoveSourceBranch() {
        return forceRemoveSourceBranch;
    }

    public void setForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
    }

    public ResponseMergeRequestChanges withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 合并请求url
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public ResponseMergeRequestChanges withSquash(Boolean squash) {
        this.squash = squash;
        return this;
    }

    /**
     * 合并请求是否开启squash合并
     * @return squash
     */
    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public ResponseMergeRequestChanges withMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
        return this;
    }

    /**
     * 合并请求类型
     * @return mergeRequestType
     */
    public String getMergeRequestType() {
        return mergeRequestType;
    }

    public void setMergeRequestType(String mergeRequestType) {
        this.mergeRequestType = mergeRequestType;
    }

    public ResponseMergeRequestChanges withSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }

    /**
     * 是否订阅
     * @return subscribed
     */
    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public ResponseMergeRequestChanges withChangesCount(String changesCount) {
        this.changesCount = changesCount;
        return this;
    }

    /**
     * 合并请求变更文件数量
     * @return changesCount
     */
    public String getChangesCount() {
        return changesCount;
    }

    public void setChangesCount(String changesCount) {
        this.changesCount = changesCount;
    }

    public ResponseMergeRequestChanges withLatestBuildStartedAt(String latestBuildStartedAt) {
        this.latestBuildStartedAt = latestBuildStartedAt;
        return this;
    }

    /**
     * 合并请求最新构建开始时间
     * @return latestBuildStartedAt
     */
    public String getLatestBuildStartedAt() {
        return latestBuildStartedAt;
    }

    public void setLatestBuildStartedAt(String latestBuildStartedAt) {
        this.latestBuildStartedAt = latestBuildStartedAt;
    }

    public ResponseMergeRequestChanges withLatestBuildFinishedAt(String latestBuildFinishedAt) {
        this.latestBuildFinishedAt = latestBuildFinishedAt;
        return this;
    }

    /**
     * 合并请求最新构建结束时间
     * @return latestBuildFinishedAt
     */
    public String getLatestBuildFinishedAt() {
        return latestBuildFinishedAt;
    }

    public void setLatestBuildFinishedAt(String latestBuildFinishedAt) {
        this.latestBuildFinishedAt = latestBuildFinishedAt;
    }

    public ResponseMergeRequestChanges withFirstDeployedToProductionAt(String firstDeployedToProductionAt) {
        this.firstDeployedToProductionAt = firstDeployedToProductionAt;
        return this;
    }

    /**
     * first deployed to production at
     * @return firstDeployedToProductionAt
     */
    public String getFirstDeployedToProductionAt() {
        return firstDeployedToProductionAt;
    }

    public void setFirstDeployedToProductionAt(String firstDeployedToProductionAt) {
        this.firstDeployedToProductionAt = firstDeployedToProductionAt;
    }

    public ResponseMergeRequestChanges withPipeline(PipelineBasicDto pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    public ResponseMergeRequestChanges withPipeline(Consumer<PipelineBasicDto> pipelineSetter) {
        if (this.pipeline == null) {
            this.pipeline = new PipelineBasicDto();
            pipelineSetter.accept(this.pipeline);
        }

        return this;
    }

    /**
     * Get pipeline
     * @return pipeline
     */
    public PipelineBasicDto getPipeline() {
        return pipeline;
    }

    public void setPipeline(PipelineBasicDto pipeline) {
        this.pipeline = pipeline;
    }

    public ResponseMergeRequestChanges withDiffRefs(DiffRefsDto diffRefs) {
        this.diffRefs = diffRefs;
        return this;
    }

    public ResponseMergeRequestChanges withDiffRefs(Consumer<DiffRefsDto> diffRefsSetter) {
        if (this.diffRefs == null) {
            this.diffRefs = new DiffRefsDto();
            diffRefsSetter.accept(this.diffRefs);
        }

        return this;
    }

    /**
     * Get diffRefs
     * @return diffRefs
     */
    public DiffRefsDto getDiffRefs() {
        return diffRefs;
    }

    public void setDiffRefs(DiffRefsDto diffRefs) {
        this.diffRefs = diffRefs;
    }

    public ResponseMergeRequestChanges withMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }

    /**
     * 合并请求操作错误信息
     * @return mergeError
     */
    public String getMergeError() {
        return mergeError;
    }

    public void setMergeError(String mergeError) {
        this.mergeError = mergeError;
    }

    public ResponseMergeRequestChanges withRebaseInProgress(Boolean rebaseInProgress) {
        this.rebaseInProgress = rebaseInProgress;
        return this;
    }

    /**
     * 合并请求是否rebase中
     * @return rebaseInProgress
     */
    public Boolean getRebaseInProgress() {
        return rebaseInProgress;
    }

    public void setRebaseInProgress(Boolean rebaseInProgress) {
        this.rebaseInProgress = rebaseInProgress;
    }

    public ResponseMergeRequestChanges withDivergedCommitsCount(Integer divergedCommitsCount) {
        this.divergedCommitsCount = divergedCommitsCount;
        return this;
    }

    /**
     * 合并请求落后提交数量
     * @return divergedCommitsCount
     */
    public Integer getDivergedCommitsCount() {
        return divergedCommitsCount;
    }

    public void setDivergedCommitsCount(Integer divergedCommitsCount) {
        this.divergedCommitsCount = divergedCommitsCount;
    }

    public ResponseMergeRequestChanges withUser(MergeRequestListDtoUser user) {
        this.user = user;
        return this;
    }

    public ResponseMergeRequestChanges withUser(Consumer<MergeRequestListDtoUser> userSetter) {
        if (this.user == null) {
            this.user = new MergeRequestListDtoUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public MergeRequestListDtoUser getUser() {
        return user;
    }

    public void setUser(MergeRequestListDtoUser user) {
        this.user = user;
    }

    public ResponseMergeRequestChanges withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * 合并请求增加行数
     * @return addedLines
     */
    public Integer getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
    }

    public ResponseMergeRequestChanges withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * 合并请求删除行数
     * @return removedLines
     */
    public Integer getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
    }

    public ResponseMergeRequestChanges withChanges(List<MergeRequestDiffFileDto> changes) {
        this.changes = changes;
        return this;
    }

    public ResponseMergeRequestChanges addChangesItem(MergeRequestDiffFileDto changesItem) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.add(changesItem);
        return this;
    }

    public ResponseMergeRequestChanges withChanges(Consumer<List<MergeRequestDiffFileDto>> changesSetter) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        changesSetter.accept(this.changes);
        return this;
    }

    /**
     * 合并请求文件变更
     * @return changes
     */
    public List<MergeRequestDiffFileDto> getChanges() {
        return changes;
    }

    public void setChanges(List<MergeRequestDiffFileDto> changes) {
        this.changes = changes;
    }

    public ResponseMergeRequestChanges withSourceProject(ProjectSimpleDto sourceProject) {
        this.sourceProject = sourceProject;
        return this;
    }

    public ResponseMergeRequestChanges withSourceProject(Consumer<ProjectSimpleDto> sourceProjectSetter) {
        if (this.sourceProject == null) {
            this.sourceProject = new ProjectSimpleDto();
            sourceProjectSetter.accept(this.sourceProject);
        }

        return this;
    }

    /**
     * Get sourceProject
     * @return sourceProject
     */
    public ProjectSimpleDto getSourceProject() {
        return sourceProject;
    }

    public void setSourceProject(ProjectSimpleDto sourceProject) {
        this.sourceProject = sourceProject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseMergeRequestChanges that = (ResponseMergeRequestChanges) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iid, that.iid)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.state, that.state)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.userNotesCount, that.userNotesCount) && Objects.equals(this.upvotes, that.upvotes)
            && Objects.equals(this.downvotes, that.downvotes) && Objects.equals(this.author, that.author)
            && Objects.equals(this.sourceProjectId, that.sourceProjectId)
            && Objects.equals(this.targetProjectId, that.targetProjectId) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.workInProgress, that.workInProgress)
            && Objects.equals(this.mergeWhenPipelineSucceeds, that.mergeWhenPipelineSucceeds)
            && Objects.equals(this.mergeStatus, that.mergeStatus) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.shouldRemoveSourceBranch, that.shouldRemoveSourceBranch)
            && Objects.equals(this.forceRemoveSourceBranch, that.forceRemoveSourceBranch)
            && Objects.equals(this.webUrl, that.webUrl) && Objects.equals(this.squash, that.squash)
            && Objects.equals(this.mergeRequestType, that.mergeRequestType)
            && Objects.equals(this.subscribed, that.subscribed) && Objects.equals(this.changesCount, that.changesCount)
            && Objects.equals(this.latestBuildStartedAt, that.latestBuildStartedAt)
            && Objects.equals(this.latestBuildFinishedAt, that.latestBuildFinishedAt)
            && Objects.equals(this.firstDeployedToProductionAt, that.firstDeployedToProductionAt)
            && Objects.equals(this.pipeline, that.pipeline) && Objects.equals(this.diffRefs, that.diffRefs)
            && Objects.equals(this.mergeError, that.mergeError)
            && Objects.equals(this.rebaseInProgress, that.rebaseInProgress)
            && Objects.equals(this.divergedCommitsCount, that.divergedCommitsCount)
            && Objects.equals(this.user, that.user) && Objects.equals(this.addedLines, that.addedLines)
            && Objects.equals(this.removedLines, that.removedLines) && Objects.equals(this.changes, that.changes)
            && Objects.equals(this.sourceProject, that.sourceProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iid,
            projectId,
            title,
            description,
            state,
            createdAt,
            updatedAt,
            targetBranch,
            sourceBranch,
            userNotesCount,
            upvotes,
            downvotes,
            author,
            sourceProjectId,
            targetProjectId,
            labels,
            workInProgress,
            mergeWhenPipelineSucceeds,
            mergeStatus,
            sha,
            shouldRemoveSourceBranch,
            forceRemoveSourceBranch,
            webUrl,
            squash,
            mergeRequestType,
            subscribed,
            changesCount,
            latestBuildStartedAt,
            latestBuildFinishedAt,
            firstDeployedToProductionAt,
            pipeline,
            diffRefs,
            mergeError,
            rebaseInProgress,
            divergedCommitsCount,
            user,
            addedLines,
            removedLines,
            changes,
            sourceProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseMergeRequestChanges {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    userNotesCount: ").append(toIndentedString(userNotesCount)).append("\n");
        sb.append("    upvotes: ").append(toIndentedString(upvotes)).append("\n");
        sb.append("    downvotes: ").append(toIndentedString(downvotes)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    workInProgress: ").append(toIndentedString(workInProgress)).append("\n");
        sb.append("    mergeWhenPipelineSucceeds: ").append(toIndentedString(mergeWhenPipelineSucceeds)).append("\n");
        sb.append("    mergeStatus: ").append(toIndentedString(mergeStatus)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    shouldRemoveSourceBranch: ").append(toIndentedString(shouldRemoveSourceBranch)).append("\n");
        sb.append("    forceRemoveSourceBranch: ").append(toIndentedString(forceRemoveSourceBranch)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
        sb.append("    mergeRequestType: ").append(toIndentedString(mergeRequestType)).append("\n");
        sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
        sb.append("    changesCount: ").append(toIndentedString(changesCount)).append("\n");
        sb.append("    latestBuildStartedAt: ").append(toIndentedString(latestBuildStartedAt)).append("\n");
        sb.append("    latestBuildFinishedAt: ").append(toIndentedString(latestBuildFinishedAt)).append("\n");
        sb.append("    firstDeployedToProductionAt: ")
            .append(toIndentedString(firstDeployedToProductionAt))
            .append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    diffRefs: ").append(toIndentedString(diffRefs)).append("\n");
        sb.append("    mergeError: ").append(toIndentedString(mergeError)).append("\n");
        sb.append("    rebaseInProgress: ").append(toIndentedString(rebaseInProgress)).append("\n");
        sb.append("    divergedCommitsCount: ").append(toIndentedString(divergedCommitsCount)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
        sb.append("    removedLines: ").append(toIndentedString(removedLines)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    sourceProject: ").append(toIndentedString(sourceProject)).append("\n");
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
