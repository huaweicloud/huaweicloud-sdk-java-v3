package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeRequestDiff
 */
public class MergeRequestDiff {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_commit_sha")

    private String baseCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits_count")

    private Double commitsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_commit_sha")

    private String headCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Double mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_commit_sha")

    private String startCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public MergeRequestDiff withBaseCommitSha(String baseCommitSha) {
        this.baseCommitSha = baseCommitSha;
        return this;
    }

    /**
     * base提交
     * @return baseCommitSha
     */
    public String getBaseCommitSha() {
        return baseCommitSha;
    }

    public void setBaseCommitSha(String baseCommitSha) {
        this.baseCommitSha = baseCommitSha;
    }

    public MergeRequestDiff withCommitsCount(Double commitsCount) {
        this.commitsCount = commitsCount;
        return this;
    }

    /**
     * 提交数
     * @return commitsCount
     */
    public Double getCommitsCount() {
        return commitsCount;
    }

    public void setCommitsCount(Double commitsCount) {
        this.commitsCount = commitsCount;
    }

    public MergeRequestDiff withCreatedAt(String createdAt) {
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

    public MergeRequestDiff withHeadCommitSha(String headCommitSha) {
        this.headCommitSha = headCommitSha;
        return this;
    }

    /**
     * head提交
     * @return headCommitSha
     */
    public String getHeadCommitSha() {
        return headCommitSha;
    }

    public void setHeadCommitSha(String headCommitSha) {
        this.headCommitSha = headCommitSha;
    }

    public MergeRequestDiff withMergeRequestId(Double mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * 合并请求id
     * @return mergeRequestId
     */
    public Double getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Double mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public MergeRequestDiff withStartCommitSha(String startCommitSha) {
        this.startCommitSha = startCommitSha;
        return this;
    }

    /**
     * start提交
     * @return startCommitSha
     */
    public String getStartCommitSha() {
        return startCommitSha;
    }

    public void setStartCommitSha(String startCommitSha) {
        this.startCommitSha = startCommitSha;
    }

    public MergeRequestDiff withUpdatedAt(String updatedAt) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestDiff that = (MergeRequestDiff) obj;
        return Objects.equals(this.baseCommitSha, that.baseCommitSha)
            && Objects.equals(this.commitsCount, that.commitsCount) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.headCommitSha, that.headCommitSha)
            && Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.startCommitSha, that.startCommitSha)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(baseCommitSha, commitsCount, createdAt, headCommitSha, mergeRequestId, startCommitSha, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestDiff {\n");
        sb.append("    baseCommitSha: ").append(toIndentedString(baseCommitSha)).append("\n");
        sb.append("    commitsCount: ").append(toIndentedString(commitsCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    headCommitSha: ").append(toIndentedString(headCommitSha)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    startCommitSha: ").append(toIndentedString(startCommitSha)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
