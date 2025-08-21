package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMergeRequestChangesTreesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_user_id")

    private Integer approvalUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_diff_id")

    private Integer fromDiffId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_diff_id")

    private Integer toDiffId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListMergeRequestChangesTreesRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
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

    public ListMergeRequestChangesTreesRequest withMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
        return this;
    }

    /**
     * **参数解释：**  合并请求 iid。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestIid
     */
    public Integer getMergeRequestIid() {
        return mergeRequestIid;
    }

    public void setMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
    }

    public ListMergeRequestChangesTreesRequest withApprovalUserId(Integer approvalUserId) {
        this.approvalUserId = approvalUserId;
        return this;
    }

    /**
     * **参数解释：** 审核人ID。
     * @return approvalUserId
     */
    public Integer getApprovalUserId() {
        return approvalUserId;
    }

    public void setApprovalUserId(Integer approvalUserId) {
        this.approvalUserId = approvalUserId;
    }

    public ListMergeRequestChangesTreesRequest withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释：** commit ID。 **取值范围：** 字符串长度不少于1，不超过40。
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public ListMergeRequestChangesTreesRequest withFromDiffId(Integer fromDiffId) {
        this.fromDiffId = fromDiffId;
        return this;
    }

    /**
     * **参数解释：** 文件变更对比源版本id
     * @return fromDiffId
     */
    public Integer getFromDiffId() {
        return fromDiffId;
    }

    public void setFromDiffId(Integer fromDiffId) {
        this.fromDiffId = fromDiffId;
    }

    public ListMergeRequestChangesTreesRequest withToDiffId(Integer toDiffId) {
        this.toDiffId = toDiffId;
        return this;
    }

    /**
     * **参数解释：** 文件变更对比目标版本id
     * @return toDiffId
     */
    public Integer getToDiffId() {
        return toDiffId;
    }

    public void setToDiffId(Integer toDiffId) {
        this.toDiffId = toDiffId;
    }

    public ListMergeRequestChangesTreesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListMergeRequestChangesTreesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMergeRequestChangesTreesRequest that = (ListMergeRequestChangesTreesRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid)
            && Objects.equals(this.approvalUserId, that.approvalUserId) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.fromDiffId, that.fromDiffId) && Objects.equals(this.toDiffId, that.toDiffId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(repositoryId, mergeRequestIid, approvalUserId, commitId, fromDiffId, toDiffId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeRequestChangesTreesRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    approvalUserId: ").append(toIndentedString(approvalUserId)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    fromDiffId: ").append(toIndentedString(fromDiffId)).append("\n");
        sb.append("    toDiffId: ").append(toIndentedString(toDiffId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
