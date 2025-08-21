package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateBranchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_read")

    private Boolean canRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_download")

    private Boolean canDownload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_push")

    private Boolean canPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private CommitDto commit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merged")

    private Boolean merged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private Boolean _protected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private UserBasicDto creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_source")

    private String createSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_source_exists")

    private Boolean createSourceExists;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_pipeline")

    private PipelineBasicDto latestPipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opened_mr_count")

    private Integer openedMrCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diverging_commit_counts")

    private DivergingCommitCounts divergingCommitCounts;

    public CreateBranchResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分支名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBranchResponse withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否为默认分支
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public CreateBranchResponse withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 用户是否为默认分支
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public CreateBranchResponse withCanRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }

    /**
     * 是否为默认分支
     * @return canRead
     */
    public Boolean getCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    public CreateBranchResponse withCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
        return this;
    }

    /**
     * 是否为默认分支
     * @return canDownload
     */
    public Boolean getCanDownload() {
        return canDownload;
    }

    public void setCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
    }

    public CreateBranchResponse withCanPush(Boolean canPush) {
        this.canPush = canPush;
        return this;
    }

    /**
     * 是否为默认分支
     * @return canPush
     */
    public Boolean getCanPush() {
        return canPush;
    }

    public void setCanPush(Boolean canPush) {
        this.canPush = canPush;
    }

    public CreateBranchResponse withCommit(CommitDto commit) {
        this.commit = commit;
        return this;
    }

    public CreateBranchResponse withCommit(Consumer<CommitDto> commitSetter) {
        if (this.commit == null) {
            this.commit = new CommitDto();
            commitSetter.accept(this.commit);
        }

        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    public CommitDto getCommit() {
        return commit;
    }

    public void setCommit(CommitDto commit) {
        this.commit = commit;
    }

    public CreateBranchResponse withMerged(Boolean merged) {
        this.merged = merged;
        return this;
    }

    /**
     * 所有提交是否合入到默认分支
     * @return merged
     */
    public Boolean getMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public CreateBranchResponse withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * 是否为保护分支
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public CreateBranchResponse withCreatedAt(String createdAt) {
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

    public CreateBranchResponse withCreator(UserBasicDto creator) {
        this.creator = creator;
        return this;
    }

    public CreateBranchResponse withCreator(Consumer<UserBasicDto> creatorSetter) {
        if (this.creator == null) {
            this.creator = new UserBasicDto();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public UserBasicDto getCreator() {
        return creator;
    }

    public void setCreator(UserBasicDto creator) {
        this.creator = creator;
    }

    public CreateBranchResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 分支描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateBranchResponse withCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }

    /**
     * 基于分支
     * @return createSource
     */
    public String getCreateSource() {
        return createSource;
    }

    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

    public CreateBranchResponse withCreateSourceExists(Boolean createSourceExists) {
        this.createSourceExists = createSourceExists;
        return this;
    }

    /**
     * 基于分支是否存在
     * @return createSourceExists
     */
    public Boolean getCreateSourceExists() {
        return createSourceExists;
    }

    public void setCreateSourceExists(Boolean createSourceExists) {
        this.createSourceExists = createSourceExists;
    }

    public CreateBranchResponse withLatestPipeline(PipelineBasicDto latestPipeline) {
        this.latestPipeline = latestPipeline;
        return this;
    }

    public CreateBranchResponse withLatestPipeline(Consumer<PipelineBasicDto> latestPipelineSetter) {
        if (this.latestPipeline == null) {
            this.latestPipeline = new PipelineBasicDto();
            latestPipelineSetter.accept(this.latestPipeline);
        }

        return this;
    }

    /**
     * Get latestPipeline
     * @return latestPipeline
     */
    public PipelineBasicDto getLatestPipeline() {
        return latestPipeline;
    }

    public void setLatestPipeline(PipelineBasicDto latestPipeline) {
        this.latestPipeline = latestPipeline;
    }

    public CreateBranchResponse withOpenedMrCount(Integer openedMrCount) {
        this.openedMrCount = openedMrCount;
        return this;
    }

    /**
     * 该分支正在开启的合并请求个数
     * minimum: 0
     * maximum: 2147483647
     * @return openedMrCount
     */
    public Integer getOpenedMrCount() {
        return openedMrCount;
    }

    public void setOpenedMrCount(Integer openedMrCount) {
        this.openedMrCount = openedMrCount;
    }

    public CreateBranchResponse withDivergingCommitCounts(DivergingCommitCounts divergingCommitCounts) {
        this.divergingCommitCounts = divergingCommitCounts;
        return this;
    }

    public CreateBranchResponse withDivergingCommitCounts(Consumer<DivergingCommitCounts> divergingCommitCountsSetter) {
        if (this.divergingCommitCounts == null) {
            this.divergingCommitCounts = new DivergingCommitCounts();
            divergingCommitCountsSetter.accept(this.divergingCommitCounts);
        }

        return this;
    }

    /**
     * Get divergingCommitCounts
     * @return divergingCommitCounts
     */
    public DivergingCommitCounts getDivergingCommitCounts() {
        return divergingCommitCounts;
    }

    public void setDivergingCommitCounts(DivergingCommitCounts divergingCommitCounts) {
        this.divergingCommitCounts = divergingCommitCounts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBranchResponse that = (CreateBranchResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this._default, that._default)
            && Objects.equals(this.canDelete, that.canDelete) && Objects.equals(this.canRead, that.canRead)
            && Objects.equals(this.canDownload, that.canDownload) && Objects.equals(this.canPush, that.canPush)
            && Objects.equals(this.commit, that.commit) && Objects.equals(this.merged, that.merged)
            && Objects.equals(this._protected, that._protected) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createSource, that.createSource)
            && Objects.equals(this.createSourceExists, that.createSourceExists)
            && Objects.equals(this.latestPipeline, that.latestPipeline)
            && Objects.equals(this.openedMrCount, that.openedMrCount)
            && Objects.equals(this.divergingCommitCounts, that.divergingCommitCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            _default,
            canDelete,
            canRead,
            canDownload,
            canPush,
            commit,
            merged,
            _protected,
            createdAt,
            creator,
            description,
            createSource,
            createSourceExists,
            latestPipeline,
            openedMrCount,
            divergingCommitCounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBranchResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
        sb.append("    canDownload: ").append(toIndentedString(canDownload)).append("\n");
        sb.append("    canPush: ").append(toIndentedString(canPush)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createSource: ").append(toIndentedString(createSource)).append("\n");
        sb.append("    createSourceExists: ").append(toIndentedString(createSourceExists)).append("\n");
        sb.append("    latestPipeline: ").append(toIndentedString(latestPipeline)).append("\n");
        sb.append("    openedMrCount: ").append(toIndentedString(openedMrCount)).append("\n");
        sb.append("    divergingCommitCounts: ").append(toIndentedString(divergingCommitCounts)).append("\n");
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
