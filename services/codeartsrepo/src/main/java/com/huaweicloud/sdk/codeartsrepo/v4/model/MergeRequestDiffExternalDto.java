package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeRequestDiffExternalDto
 */
public class MergeRequestDiffExternalDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_commit_sha")

    private String baseCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_size")

    private String realSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_commit_sha")

    private String headCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_commit_sha")

    private String startCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits_count")

    private Integer commitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_diff")

    private String externalDiff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_diff_store")

    private Integer externalDiffStore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stored_externally")

    private Boolean storedExternally;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    public MergeRequestDiffExternalDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 合并请求diff id
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

    public MergeRequestDiffExternalDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MergeRequestDiffExternalDto withMergeRequestId(Integer mergeRequestId) {
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

    public MergeRequestDiffExternalDto withCreatedAt(String createdAt) {
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

    public MergeRequestDiffExternalDto withUpdatedAt(String updatedAt) {
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

    public MergeRequestDiffExternalDto withBaseCommitSha(String baseCommitSha) {
        this.baseCommitSha = baseCommitSha;
        return this;
    }

    /**
     * base commit节点
     * @return baseCommitSha
     */
    public String getBaseCommitSha() {
        return baseCommitSha;
    }

    public void setBaseCommitSha(String baseCommitSha) {
        this.baseCommitSha = baseCommitSha;
    }

    public MergeRequestDiffExternalDto withRealSize(String realSize) {
        this.realSize = realSize;
        return this;
    }

    /**
     * diff文件数量
     * @return realSize
     */
    public String getRealSize() {
        return realSize;
    }

    public void setRealSize(String realSize) {
        this.realSize = realSize;
    }

    public MergeRequestDiffExternalDto withHeadCommitSha(String headCommitSha) {
        this.headCommitSha = headCommitSha;
        return this;
    }

    /**
     * head commit节点
     * @return headCommitSha
     */
    public String getHeadCommitSha() {
        return headCommitSha;
    }

    public void setHeadCommitSha(String headCommitSha) {
        this.headCommitSha = headCommitSha;
    }

    public MergeRequestDiffExternalDto withStartCommitSha(String startCommitSha) {
        this.startCommitSha = startCommitSha;
        return this;
    }

    /**
     * start commit节点
     * @return startCommitSha
     */
    public String getStartCommitSha() {
        return startCommitSha;
    }

    public void setStartCommitSha(String startCommitSha) {
        this.startCommitSha = startCommitSha;
    }

    public MergeRequestDiffExternalDto withCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
        return this;
    }

    /**
     * commit数量
     * minimum: 1
     * maximum: 2147483647
     * @return commitsCount
     */
    public Integer getCommitsCount() {
        return commitsCount;
    }

    public void setCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
    }

    public MergeRequestDiffExternalDto withExternalDiff(String externalDiff) {
        this.externalDiff = externalDiff;
        return this;
    }

    /**
     * 外部diff文件
     * @return externalDiff
     */
    public String getExternalDiff() {
        return externalDiff;
    }

    public void setExternalDiff(String externalDiff) {
        this.externalDiff = externalDiff;
    }

    public MergeRequestDiffExternalDto withExternalDiffStore(Integer externalDiffStore) {
        this.externalDiffStore = externalDiffStore;
        return this;
    }

    /**
     * 外部差异存储
     * minimum: 1
     * maximum: 2147483647
     * @return externalDiffStore
     */
    public Integer getExternalDiffStore() {
        return externalDiffStore;
    }

    public void setExternalDiffStore(Integer externalDiffStore) {
        this.externalDiffStore = externalDiffStore;
    }

    public MergeRequestDiffExternalDto withStoredExternally(Boolean storedExternally) {
        this.storedExternally = storedExternally;
        return this;
    }

    /**
     * 是否外部存储
     * @return storedExternally
     */
    public Boolean getStoredExternally() {
        return storedExternally;
    }

    public void setStoredExternally(Boolean storedExternally) {
        this.storedExternally = storedExternally;
    }

    public MergeRequestDiffExternalDto withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * 新增行数
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

    public MergeRequestDiffExternalDto withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * 删除行数
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
        MergeRequestDiffExternalDto that = (MergeRequestDiffExternalDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.state, that.state)
            && Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.baseCommitSha, that.baseCommitSha) && Objects.equals(this.realSize, that.realSize)
            && Objects.equals(this.headCommitSha, that.headCommitSha)
            && Objects.equals(this.startCommitSha, that.startCommitSha)
            && Objects.equals(this.commitsCount, that.commitsCount)
            && Objects.equals(this.externalDiff, that.externalDiff)
            && Objects.equals(this.externalDiffStore, that.externalDiffStore)
            && Objects.equals(this.storedExternally, that.storedExternally)
            && Objects.equals(this.addedLines, that.addedLines) && Objects.equals(this.removedLines, that.removedLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            state,
            mergeRequestId,
            createdAt,
            updatedAt,
            baseCommitSha,
            realSize,
            headCommitSha,
            startCommitSha,
            commitsCount,
            externalDiff,
            externalDiffStore,
            storedExternally,
            addedLines,
            removedLines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestDiffExternalDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    baseCommitSha: ").append(toIndentedString(baseCommitSha)).append("\n");
        sb.append("    realSize: ").append(toIndentedString(realSize)).append("\n");
        sb.append("    headCommitSha: ").append(toIndentedString(headCommitSha)).append("\n");
        sb.append("    startCommitSha: ").append(toIndentedString(startCommitSha)).append("\n");
        sb.append("    commitsCount: ").append(toIndentedString(commitsCount)).append("\n");
        sb.append("    externalDiff: ").append(toIndentedString(externalDiff)).append("\n");
        sb.append("    externalDiffStore: ").append(toIndentedString(externalDiffStore)).append("\n");
        sb.append("    storedExternally: ").append(toIndentedString(storedExternally)).append("\n");
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
