package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 构建参数。 **取值范围**： 不涉及。 
 */
public class ListPipelineRunsPageBuildParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_type")

    private String buildType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_id")

    private String mergeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_codehub_id")

    private String sourceCodehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_codehub_url")

    private String sourceCodehubUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_codehub_http_url")

    private String sourceCodehubHttpUrl;

    public ListPipelineRunsPageBuildParams withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 合并请求事件类型。 **取值范围**： - open：打开。 - reopen：重开。 - update：更新。 - merge：合并。 
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListPipelineRunsPageBuildParams withBuildType(String buildType) {
        this.buildType = buildType;
        return this;
    }

    /**
     * **参数解释**： 基于分支还是标签触发。 **取值范围**： - branch：分支触发。 - tag：标签触发。 
     * @return buildType
     */
    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public ListPipelineRunsPageBuildParams withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释**： 代码仓提交ID。 **取值范围**： 不涉及。 
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public ListPipelineRunsPageBuildParams withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释**： 运行事件类型。 **取值范围**： - Manual：手动触发。 - Scheduler：定时任务。 - MR：MR触发。 - Push：Push事件触发。 - CreateTag：Tag事件触发。 - Issue：Issue触发。 - Note：评论触发。 
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ListPipelineRunsPageBuildParams withMergeId(String mergeId) {
        this.mergeId = mergeId;
        return this;
    }

    /**
     * **参数解释**： 合并请求ID。 **取值范围**： 不涉及。 
     * @return mergeId
     */
    public String getMergeId() {
        return mergeId;
    }

    public void setMergeId(String mergeId) {
        this.mergeId = mergeId;
    }

    public ListPipelineRunsPageBuildParams withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： 代码仓提交信息。 **取值范围**： 不涉及。 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListPipelineRunsPageBuildParams withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * **参数解释**： 源分支。 **取值范围**： 不涉及。 
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public ListPipelineRunsPageBuildParams withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**： 标签。 **取值范围**： 不涉及。 
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListPipelineRunsPageBuildParams withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释**： 目标分支。 **取值范围**： 不涉及。 
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ListPipelineRunsPageBuildParams withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * **参数解释**： Repo代码仓ID。 **取值范围**： 不涉及。 
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    public ListPipelineRunsPageBuildParams withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释**： 代码仓https地址。 **取值范围**： 不涉及。 
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public ListPipelineRunsPageBuildParams withSourceCodehubId(String sourceCodehubId) {
        this.sourceCodehubId = sourceCodehubId;
        return this;
    }

    /**
     * **参数解释**： 源Repo代码仓ID。 **取值范围**： 不涉及。 
     * @return sourceCodehubId
     */
    public String getSourceCodehubId() {
        return sourceCodehubId;
    }

    public void setSourceCodehubId(String sourceCodehubId) {
        this.sourceCodehubId = sourceCodehubId;
    }

    public ListPipelineRunsPageBuildParams withSourceCodehubUrl(String sourceCodehubUrl) {
        this.sourceCodehubUrl = sourceCodehubUrl;
        return this;
    }

    /**
     * **参数解释**： 源Repo代码仓地址。 **取值范围**： 不涉及。 
     * @return sourceCodehubUrl
     */
    public String getSourceCodehubUrl() {
        return sourceCodehubUrl;
    }

    public void setSourceCodehubUrl(String sourceCodehubUrl) {
        this.sourceCodehubUrl = sourceCodehubUrl;
    }

    public ListPipelineRunsPageBuildParams withSourceCodehubHttpUrl(String sourceCodehubHttpUrl) {
        this.sourceCodehubHttpUrl = sourceCodehubHttpUrl;
        return this;
    }

    /**
     * **参数解释**： 源Repo代码仓http地址。 **取值范围**： 不涉及。 
     * @return sourceCodehubHttpUrl
     */
    public String getSourceCodehubHttpUrl() {
        return sourceCodehubHttpUrl;
    }

    public void setSourceCodehubHttpUrl(String sourceCodehubHttpUrl) {
        this.sourceCodehubHttpUrl = sourceCodehubHttpUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelineRunsPageBuildParams that = (ListPipelineRunsPageBuildParams) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.buildType, that.buildType)
            && Objects.equals(this.commitId, that.commitId) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.mergeId, that.mergeId) && Objects.equals(this.message, that.message)
            && Objects.equals(this.sourceBranch, that.sourceBranch) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.targetBranch, that.targetBranch) && Objects.equals(this.codehubId, that.codehubId)
            && Objects.equals(this.gitUrl, that.gitUrl) && Objects.equals(this.sourceCodehubId, that.sourceCodehubId)
            && Objects.equals(this.sourceCodehubUrl, that.sourceCodehubUrl)
            && Objects.equals(this.sourceCodehubHttpUrl, that.sourceCodehubHttpUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            buildType,
            commitId,
            eventType,
            mergeId,
            message,
            sourceBranch,
            tag,
            targetBranch,
            codehubId,
            gitUrl,
            sourceCodehubId,
            sourceCodehubUrl,
            sourceCodehubHttpUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineRunsPageBuildParams {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    mergeId: ").append(toIndentedString(mergeId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    sourceCodehubId: ").append(toIndentedString(sourceCodehubId)).append("\n");
        sb.append("    sourceCodehubUrl: ").append(toIndentedString(sourceCodehubUrl)).append("\n");
        sb.append("    sourceCodehubHttpUrl: ").append(toIndentedString(sourceCodehubHttpUrl)).append("\n");
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
