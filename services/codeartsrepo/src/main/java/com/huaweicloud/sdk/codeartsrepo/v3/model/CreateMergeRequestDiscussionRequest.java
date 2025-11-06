package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateMergeRequestDiscussionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateMergeRequestDiscussionBodyDto body;

    public CreateMergeRequestDiscussionRequest withRepositoryId(Integer repositoryId) {
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

    public CreateMergeRequestDiscussionRequest withMergeRequestIid(Integer mergeRequestIid) {
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

    public CreateMergeRequestDiscussionRequest withBody(CreateMergeRequestDiscussionBodyDto body) {
        this.body = body;
        return this;
    }

    public CreateMergeRequestDiscussionRequest withBody(Consumer<CreateMergeRequestDiscussionBodyDto> bodySetter) {
        if (this.body == null) {
            this.body = new CreateMergeRequestDiscussionBodyDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateMergeRequestDiscussionBodyDto getBody() {
        return body;
    }

    public void setBody(CreateMergeRequestDiscussionBodyDto body) {
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
        CreateMergeRequestDiscussionRequest that = (CreateMergeRequestDiscussionRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, mergeRequestIid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMergeRequestDiscussionRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
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
