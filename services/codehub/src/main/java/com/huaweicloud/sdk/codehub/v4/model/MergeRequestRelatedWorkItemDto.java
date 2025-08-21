package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeRequestRelatedWorkItemDto
 */
public class MergeRequestRelatedWorkItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_title")

    private String mergeRequestTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_url")

    private String mergeRequestUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_state")

    private String mergeRequestState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_id")

    private String relatedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_title")

    private String relatedTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_url")

    private String relatedUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private Object tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Object status;

    public MergeRequestRelatedWorkItemDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 关联id
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

    public MergeRequestRelatedWorkItemDto withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MergeRequestRelatedWorkItemDto withRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 仓库id
     * minimum: 1
     * maximum: 2147483647
     * @return repoId
     */
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    public MergeRequestRelatedWorkItemDto withMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * 合并请求id
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestId
     */
    public Integer getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public MergeRequestRelatedWorkItemDto withTargetBranch(String targetBranch) {
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

    public MergeRequestRelatedWorkItemDto withSourceBranch(String sourceBranch) {
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

    public MergeRequestRelatedWorkItemDto withMergeRequestTitle(String mergeRequestTitle) {
        this.mergeRequestTitle = mergeRequestTitle;
        return this;
    }

    /**
     * 合并请求标题
     * @return mergeRequestTitle
     */
    public String getMergeRequestTitle() {
        return mergeRequestTitle;
    }

    public void setMergeRequestTitle(String mergeRequestTitle) {
        this.mergeRequestTitle = mergeRequestTitle;
    }

    public MergeRequestRelatedWorkItemDto withMergeRequestUrl(String mergeRequestUrl) {
        this.mergeRequestUrl = mergeRequestUrl;
        return this;
    }

    /**
     * 合并请求url
     * @return mergeRequestUrl
     */
    public String getMergeRequestUrl() {
        return mergeRequestUrl;
    }

    public void setMergeRequestUrl(String mergeRequestUrl) {
        this.mergeRequestUrl = mergeRequestUrl;
    }

    public MergeRequestRelatedWorkItemDto withMergeRequestState(String mergeRequestState) {
        this.mergeRequestState = mergeRequestState;
        return this;
    }

    /**
     * 合并请求状态
     * @return mergeRequestState
     */
    public String getMergeRequestState() {
        return mergeRequestState;
    }

    public void setMergeRequestState(String mergeRequestState) {
        this.mergeRequestState = mergeRequestState;
    }

    public MergeRequestRelatedWorkItemDto withRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    /**
     * 关联单id
     * @return relatedId
     */
    public String getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }

    public MergeRequestRelatedWorkItemDto withRelatedTitle(String relatedTitle) {
        this.relatedTitle = relatedTitle;
        return this;
    }

    /**
     * 关联单标题
     * @return relatedTitle
     */
    public String getRelatedTitle() {
        return relatedTitle;
    }

    public void setRelatedTitle(String relatedTitle) {
        this.relatedTitle = relatedTitle;
    }

    public MergeRequestRelatedWorkItemDto withRelatedUrl(String relatedUrl) {
        this.relatedUrl = relatedUrl;
        return this;
    }

    /**
     * 关联单url
     * @return relatedUrl
     */
    public String getRelatedUrl() {
        return relatedUrl;
    }

    public void setRelatedUrl(String relatedUrl) {
        this.relatedUrl = relatedUrl;
    }

    public MergeRequestRelatedWorkItemDto withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * 关联结果
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public MergeRequestRelatedWorkItemDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 关联结果信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MergeRequestRelatedWorkItemDto withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public MergeRequestRelatedWorkItemDto withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public MergeRequestRelatedWorkItemDto withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 话题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MergeRequestRelatedWorkItemDto withTracker(Object tracker) {
        this.tracker = tracker;
        return this;
    }

    /**
     * 跟单人
     * @return tracker
     */
    public Object getTracker() {
        return tracker;
    }

    public void setTracker(Object tracker) {
        this.tracker = tracker;
    }

    public MergeRequestRelatedWorkItemDto withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestRelatedWorkItemDto that = (MergeRequestRelatedWorkItemDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.repoId, that.repoId) && Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.mergeRequestTitle, that.mergeRequestTitle)
            && Objects.equals(this.mergeRequestUrl, that.mergeRequestUrl)
            && Objects.equals(this.mergeRequestState, that.mergeRequestState)
            && Objects.equals(this.relatedId, that.relatedId) && Objects.equals(this.relatedTitle, that.relatedTitle)
            && Objects.equals(this.relatedUrl, that.relatedUrl) && Objects.equals(this.result, that.result)
            && Objects.equals(this.message, that.message) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.tracker, that.tracker) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userId,
            repoId,
            mergeRequestId,
            targetBranch,
            sourceBranch,
            mergeRequestTitle,
            mergeRequestUrl,
            mergeRequestState,
            relatedId,
            relatedTitle,
            relatedUrl,
            result,
            message,
            createAt,
            updateAt,
            subject,
            tracker,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestRelatedWorkItemDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    mergeRequestTitle: ").append(toIndentedString(mergeRequestTitle)).append("\n");
        sb.append("    mergeRequestUrl: ").append(toIndentedString(mergeRequestUrl)).append("\n");
        sb.append("    mergeRequestState: ").append(toIndentedString(mergeRequestState)).append("\n");
        sb.append("    relatedId: ").append(toIndentedString(relatedId)).append("\n");
        sb.append("    relatedTitle: ").append(toIndentedString(relatedTitle)).append("\n");
        sb.append("    relatedUrl: ").append(toIndentedString(relatedUrl)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
