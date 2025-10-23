package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListMergeRequestVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_commit_sha")

    private String headCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_commit_sha")

    private String baseCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_commit_sha")

    private String startCommitSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_size")

    private String realSize;

    public ListMergeRequestVersionsResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** diff主键ID。    
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListMergeRequestVersionsResponse withHeadCommitSha(String headCommitSha) {
        this.headCommitSha = headCommitSha;
        return this;
    }

    /**
     * **参数解释：** head commit节点。
     * @return headCommitSha
     */
    public String getHeadCommitSha() {
        return headCommitSha;
    }

    public void setHeadCommitSha(String headCommitSha) {
        this.headCommitSha = headCommitSha;
    }

    public ListMergeRequestVersionsResponse withBaseCommitSha(String baseCommitSha) {
        this.baseCommitSha = baseCommitSha;
        return this;
    }

    /**
     * **参数解释：** base commit节点。
     * @return baseCommitSha
     */
    public String getBaseCommitSha() {
        return baseCommitSha;
    }

    public void setBaseCommitSha(String baseCommitSha) {
        this.baseCommitSha = baseCommitSha;
    }

    public ListMergeRequestVersionsResponse withStartCommitSha(String startCommitSha) {
        this.startCommitSha = startCommitSha;
        return this;
    }

    /**
     * **参数解释：** tart commit节点。
     * @return startCommitSha
     */
    public String getStartCommitSha() {
        return startCommitSha;
    }

    public void setStartCommitSha(String startCommitSha) {
        this.startCommitSha = startCommitSha;
    }

    public ListMergeRequestVersionsResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListMergeRequestVersionsResponse withMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * **参数解释：** MR主键ID。
     * @return mergeRequestId
     */
    public Integer getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public ListMergeRequestVersionsResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListMergeRequestVersionsResponse withRealSize(String realSize) {
        this.realSize = realSize;
        return this;
    }

    /**
     * **参数解释：** diff大小。
     * @return realSize
     */
    public String getRealSize() {
        return realSize;
    }

    public void setRealSize(String realSize) {
        this.realSize = realSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMergeRequestVersionsResponse that = (ListMergeRequestVersionsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.headCommitSha, that.headCommitSha)
            && Objects.equals(this.baseCommitSha, that.baseCommitSha)
            && Objects.equals(this.startCommitSha, that.startCommitSha)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.mergeRequestId, that.mergeRequestId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.realSize, that.realSize);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, headCommitSha, baseCommitSha, startCommitSha, createdAt, mergeRequestId, state, realSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeRequestVersionsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    headCommitSha: ").append(toIndentedString(headCommitSha)).append("\n");
        sb.append("    baseCommitSha: ").append(toIndentedString(baseCommitSha)).append("\n");
        sb.append("    startCommitSha: ").append(toIndentedString(startCommitSha)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    realSize: ").append(toIndentedString(realSize)).append("\n");
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
