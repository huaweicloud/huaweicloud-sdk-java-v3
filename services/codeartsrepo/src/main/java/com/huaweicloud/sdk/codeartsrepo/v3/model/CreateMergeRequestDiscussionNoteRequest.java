package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateMergeRequestDiscussionNoteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discussion_id")

    private String discussionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateMergeRequestDiscussionNoteDto body;

    public CreateMergeRequestDiscussionNoteRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库短id
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

    public CreateMergeRequestDiscussionNoteRequest withMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
        return this;
    }

    /**
     * 合并请求iid
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

    public CreateMergeRequestDiscussionNoteRequest withDiscussionId(String discussionId) {
        this.discussionId = discussionId;
        return this;
    }

    /**
     * 评论id
     * @return discussionId
     */
    public String getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

    public CreateMergeRequestDiscussionNoteRequest withBody(CreateMergeRequestDiscussionNoteDto body) {
        this.body = body;
        return this;
    }

    public CreateMergeRequestDiscussionNoteRequest withBody(Consumer<CreateMergeRequestDiscussionNoteDto> bodySetter) {
        if (this.body == null) {
            this.body = new CreateMergeRequestDiscussionNoteDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateMergeRequestDiscussionNoteDto getBody() {
        return body;
    }

    public void setBody(CreateMergeRequestDiscussionNoteDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMergeRequestDiscussionNoteRequest that = (CreateMergeRequestDiscussionNoteRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid)
            && Objects.equals(this.discussionId, that.discussionId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, mergeRequestIid, discussionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMergeRequestDiscussionNoteRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    discussionId: ").append(toIndentedString(discussionId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
